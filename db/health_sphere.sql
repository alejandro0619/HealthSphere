-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-03-2024 a las 19:27:06
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `health_sphere`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `id` int(11) NOT NULL,
  `nombre_completo` varchar(50) NOT NULL,
  `correo_electronico` varchar(30) NOT NULL,
  `cedula` varchar(9) NOT NULL,
  `direccion` text NOT NULL,
  `especialidad` varchar(50) NOT NULL,
  `contrasena` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`id`, `nombre_completo`, `correo_electronico`, `cedula`, `direccion`, `especialidad`, `contrasena`) VALUES
(4, 'neyy', 'ney@gmail.com', 'V30934161', 'lomitas', 'pediatria', 'C1szyXO00tzKoKt+jmN/2cO5CsuKzkXHqQR7OS13Vxc='),
(8, 'alejandro lopez', 'a@gmail.com', 'V30819825', 'si', 'si', 'rAAKggut82LrUYqRjFEHGtMGNe2YgjSciAHV4atBS+Q=');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id` int(11) NOT NULL,
  `nombre_completo` varchar(20) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `lugar_nacimiento` varchar(50) NOT NULL,
  `cedula` varchar(9) NOT NULL,
  `direccion` text NOT NULL,
  `genero` varchar(11) NOT NULL,
  `correo_electronico` varchar(30) NOT NULL,
  `id_doctor` int(11) NOT NULL,
  `celular_1` varchar(15) NOT NULL,
  `celular_2` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reporte`
--

CREATE TABLE `reporte` (
  `id` int(11) NOT NULL,
  `fecha_emision` date NOT NULL,
  `alergias` varchar(11) NOT NULL,
  `descrip_alergias` varchar(50) DEFAULT NULL,
  `patologias` varchar(11) NOT NULL,
  `descrip_patologias` varchar(50) DEFAULT NULL,
  `descrip_reporte` text NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `id_medico` int(11) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `tipo_sangre` varchar(25) NOT NULL,
  `seguro` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `correo_electronico` (`correo_electronico`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `correo_electronico` (`correo_electronico`),
  ADD KEY `paciente_ibfk_1` (`id_doctor`);

--
-- Indices de la tabla `reporte`
--
ALTER TABLE `reporte`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_medico_reporte` (`id_medico`),
  ADD KEY `id_paciente_reporte` (`id_paciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `medico`
--
ALTER TABLE `medico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT de la tabla `reporte`
--
ALTER TABLE `reporte`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `paciente_ibfk_1` FOREIGN KEY (`id_doctor`) REFERENCES `medico` (`id`);

--
-- Filtros para la tabla `reporte`
--
ALTER TABLE `reporte`
  ADD CONSTRAINT `id_medico_reporte` FOREIGN KEY (`id_medico`) REFERENCES `medico` (`id`),
  ADD CONSTRAINT `id_paciente_reporte` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id`),
  ADD CONSTRAINT `reporte_ibfk_1` FOREIGN KEY (`id`) REFERENCES `paciente` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
