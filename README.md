# Address Verification Sandbox

Address Verification sandboox

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Agregar el producto a la aplicación

Al iniciar sesión seguir los siguientes pasos:

 1. Dar clic en la sección "**Mis aplicaciones**".
 2. Seleccionar la aplicación.
 3. Ir a la pestaña de "**Editar '@tuApp**' ".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/edit_applications.jpg" width="900">
    </p>
 4. Al abrirse la ventana, seleccionar el producto.
 5. Dar clic en el botón "**Guardar App**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/selected_product.jpg" width="400">
    </p>

### Paso 2. Capturar los datos de la petición

Los siguientes datos a modificar se encuentran en ***src/test/java/io/address/verification/client/api/VerificationsApiTest.java***

Es importante contar con el setUp() que se encargará de inicializar la url. Modificar la URL ***('the_url')***, como se muestra en el siguiente fragmento de código:

```java
private String url = "https://circulodecredito-dev.apigee.net/sandbox/address-verification/v1/verifications";
    
    @Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS).build();
		apiClient.setHttpClient(okHttpClient);
	}
```

En el archivo **VerificationsApiTest.java**, que se encuentra en ***src/test/java/io/address/verification/client/api/VerificationsApiTest.java*** se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java

  @Test
    public void createVerificationTest() throws Exception {
        
        VerificationRequest body = new VerificationRequest();
        body.setRequestId(UUID.fromString("7c8a0230-36e0-43f4-9b7a-581dc55ea001"));
        body.setServiceCode("CFE");
        body.setContractNumber("000604971C003S38196");
        
        Holder holder = new Holder();
        holder.setName("Vlad");
        holder.setSecondName("Eddie");
        holder.setLastName("Teples");
        holder.setSecondLastName("Fuentes");
        
        Address address = new Address();
        address.setStreetAddress("love street 525");
        address.setSettlement("Centro");
        address.setCity("Cuahutemoc");
        address.setState("CDMX");
        address.setZipCode("06000");
        
        body.setHolder(holder);
        body.setAddress(address);
        
        VerificationResponse200 response = api.createVerification(xApiKey, body);
        
        logger.info(response.toString());
		
		Assert.assertTrue(response != null);
    }
    
    
    @Test
    public void getVerificationByrequestIdTest() throws Exception {
       
    	String requestId = "7c8a0230-36e0-43f4-9b7a-581dc55ea001";
        VerificationResponse200 response = api.getVerificationByrequestId( xApiKey, requestId);
        logger.info(response.toString());
        Assert.assertTrue(response != null);
    }
```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```