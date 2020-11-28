# Servicio de carrito de compras

El servicio se encarga de registrar, actualizar, eliminar y consultar datos (CRUD) de un prototipo de carrito de compras el cual incluye las tablas: Cliente, Venta, Producto, y como realacion VentaDetalle.

Este servicio esta integrado junto con un servidor de registro (Eureka) y un api gateway (Zuul)

## Ejecución desde STS

## Paso previo
- Levantar servicio registro de servicios [Eureka] (https://github.com/valenciafg/servicio-eureka)
- Levantar servicio api gateway [Zuul] (https://github.com/valenciafg/servicio-zuul)

## End-Points

### Obtener datos - Metodo GET
-   Clientes: localhost:8090/api/carrito/clientes
-   Ventas: localhost:8090/api/carrito/ventas
-   Productos: localhost:8090/api/carrito/productos

### Registro de datos - Metodo POST
-   Clientes: localhost:8090/api/carrito/clientes
-   Ventas: localhost:8090/api/carrito/ventas
-   Productos: localhost:8090/api/carrito/productos
Body - RAW JSON
Ejemplo Producto:
{
    "username": "prueba",
    "password": "12345",
    "enabled": true,
    "nombre": "Usuario",
    "apellido": "Prueba",
    "email": "prueba@gmail.com",
    "roles": [
        {
            "id": 1,
            "nombre": "ROLE_USER"
        },
        {
            "id": 2,
            "nombre": "ROLE_ADMIN"
        }
    ]
}

### Consulta de datos por ID - Método GET
-   Clientes: localhost:8090/api/carrito/clientes/${id}
-   Ventas: localhost:8090/api/carrito/ventas/${id}
-   Productos: localhost:8090/api/carrito/productos/${id}

Ejemplo de consulta: localhost:8090/api/carrito/productos/1

### Editar datos por ID - Método PUT
localhost:8090/api/usuarios/usuarios/${id}
Body - RAW JSON

### Eliminar datos - Método DELETE
-   Clientes: localhost:8090/api/carrito/clientes/${id}
-   Ventas: localhost:8090/api/carrito/ventas/${id}
-   Productos: localhost:8090/api/carrito/productos/${id}

Ejemplo: localhost:8090/api/carrito/productos/1


