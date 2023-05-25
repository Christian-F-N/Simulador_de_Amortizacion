# Bienvenido al Simulador de Tabla de Pagos

Este repositorio contiene el código fuente y la documentación del Simulador de Tabla de Pagos, una aplicación diseñada para ayudarte en el cálculo de los pagos y amortizaciones de préstamos utilizando dos sistemas de amortización: el sistema francés y el sistema americano.

## Características principales

- **Asesor de crédito configurable:** Nuestra aplicación te permite configurar las opciones del asesor de crédito para adaptarlo a tus necesidades específicas. Podrás establecer parámetros como tasas de interés, plazos de pago y monto del préstamo.

- **Generación de reportes:** El simulador te permitirá generar reportes detallados de los pagos y amortizaciones, brindándote una visión clara de la evolución de tu préstamo. Estos reportes te serán útiles tanto a ti como cliente, como a los asesores de crédito que deseen analizar diferentes escenarios.

## Cómo empezar

1. Clona este repositorio en tu máquina local.
2. Instala las dependencias necesarias siguiendo las instrucciones del archivo `README`.
3. Configura las opciones del asesor de crédito según tus necesidades en el archivo de configuración correspondiente.
4. Ejecuta la aplicación y disfruta de su funcionalidad.

# Manual de Desarrollador - Conexión a Base de Datos con Java y MySQL

## Introducción

Este manual tiene como objetivo proporcionar instrucciones detalladas sobre cómo conectar una aplicación Java a una base de datos MySQL utilizando la biblioteca de conexión JDBC. La aplicación está desarrollada con la interfaz de usuario Swing.

## Requisitos previos

- XAMPP: Asegúrate de tener instalado XAMPP, que incluye el servidor Apache y MySQL.
- JDK: Asegúrate de tener instalado el Java Development Kit (JDK) en tu sistema.

## Configuración de la base de datos

1. Inicia el servidor MySQL de XAMPP.
2. Abre tu navegador web y accede a phpMyAdmin (por ejemplo, [http://localhost/phpmyadmin](http://localhost/phpmyadmin)).
3. Crea una nueva base de datos llamada `mi_basedatos`.
4. Dentro de la base de datos `mi_basedatos`, crea una tabla llamada `usuarios` con las columnas `id` (INT, clave primaria) y `nombre` (VARCHAR).

## Configuración del proyecto Java

1. Crea un nuevo proyecto Java en tu entorno de desarrollo preferido.
2. Asegúrate de tener la biblioteca JDBC de MySQL en tu proyecto. Puedes descargarla desde [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/).
3. Agrega la biblioteca descargada (`mysql-connector-java-x.x.x.jar`) a la configuración de tu proyecto.

## Conexión a la base de datos

1. Importa las clases necesarias en tu archivo Java:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
```

2. Dentro de tu clase principal, agrega los siguientes atributos:

```java
private static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
}
```

Asegúrate de actualizar mi_basedatos con el nombre de tu base de datos y proporciona el usuario y contraseña correctos si los has configurado previamente.

3. Agrega el siguiente método para establecer la conexión a la base de datos:

```java
private static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
}
```

4. Ahora puedes usar el método getConnection() en tu aplicación para obtener una conexión a la base de datos.

## Ejemplo de consulta a la base de datos

Aquí hay un ejemplo simple de cómo ejecutar una consulta SELECT en la base de datos y mostrar los resultados en la interfaz de usuario utilizando Swing:

```java
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiAplicacion extends JFrame {

    public MiAplicacion() {
        // Configuración de la interfaz de usuario
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi Aplicación");
        setSize(400, 300);
        setLayout(new FlowLayout());

        try {
            // Establecer conexión a la base de datos
            Connection connection = getConnection();

            // Ejecutar consulta SELECT
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");

            // Mostrar resultados en la interfaz de usuario
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                JLabel label = new JLabel("ID: " + id + ", Nombre: " + nombre);
                add(label);
            }

            // Cerrar conexiones
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MiAplicacion app = new MiAplicacion();
            app.setVisible(true);
        });
    }
}
```
