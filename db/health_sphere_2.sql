-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-03-2024 a las 18:46:48
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
(3, '123', '123', '123', '123', '123', 'C1szyXO00tzKoKt+jmN/2cO5CsuKzkXHqQR7OS13Vxc='),
(4, 'neyy', 'ney@gmail.com', 'V30934161', 'lomitas', 'pediatria', 'C1szyXO00tzKoKt+jmN/2cO5CsuKzkXHqQR7OS13Vxc='),
(5, 'perico de los palotes', 'elfurrero@gmail.com', 'V5555555', 'ni idea', 'forense', 'rAAKggut82LrUYqRjFEHGtMGNe2YgjSciAHV4atBS+Q='),
(6, 'nose', 'nose@gmail.com', 'V12345678', 'tampoco', 'ci', 'C1szyXO00tzKoKt+jmN/2cO5CsuKzkXHqQR7OS13Vxc='),
(7, 'si', 'si@gmail.com', 'V98765432', 'si', 'si', 'C1szyXO00tzKoKt+jmN/2cO5CsuKzkXHqQR7OS13Vxc='),
(8, 'alejandro lopez', 'a@gmail.com', 'V30819825', 'si', 'si', 'rAAKggut82LrUYqRjFEHGtMGNe2YgjSciAHV4atBS+Q='),
(9, 'sisisi', 'hola@gmail.com', 'V6789054', 'jajaj', 'Cardiología', 'C1szyXO00tzKoKt+jmN/2cO5CsuKzkXHqQR7OS13Vxc=');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id` int(11) NOT NULL,
  `nombre_completo` varchar(20) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `cedula` varchar(9) NOT NULL,
  `direccion` text NOT NULL,
  `seguro` tinyint(1) NOT NULL,
  `genero` int(11) NOT NULL,
  `correo_electronico` varchar(30) NOT NULL,
  `id_doctor` int(11) NOT NULL,
  `celular_1` varchar(15) NOT NULL,
  `celular_2` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id`, `nombre_completo`, `fecha_nacimiento`, `cedula`, `direccion`, `seguro`, `genero`, `correo_electronico`, `id_doctor`, `celular_1`, `celular_2`) VALUES
(1, 'gfg fgf', '2004-11-01', '123456', 'cxcxc', 0, 0, 'neyyy@gamil.com', 4, '04127508815', '04123456789'),
(3, 'ney rivas', '2004-11-06', '12345678', 'lomitas', 0, 0, 'ney@gmail.com', 4, '04127654321', '04124567890'),
(4, 'gtgtgt gtgtg', '2000-10-10', 'V00000000', 'tgtgt', 0, 0, 'sii@gmail.com', 4, '0412-8889900', '0412-8889900'),
(5, 'trtr rtrt', '2010-11-10', 'V11111111', '21', 0, 0, 'no@gmail.com', 4, '0412-1234567', '0412-1234567'),
(9, 'Felix  Rivas', '1961-08-01', 'V8706853', 'lomitas', 0, 0, 'felix@gmail.com', 4, '0412-6503802', '0412-6503802'),
(10, 'nosee noseee', '2000-10-10', 'V7888884', 'siii', 0, 0, 'siiiii@gmail.com', 4, '0412-1235690', '0412-1235690'),
(11, 'fgfgfg fgfg', '2000-10-10', 'V78787878', 'fgfg', 0, 0, 'gfgfgfg@gmail.com', 4, '0412-1234567', '0412-7508815'),
(12, 'sii siii', '2024-01-11', 'V30122122', 'siii', 0, 0, 'ohhh@gmail.com', 4, '0412-3456798', '0412-3456798'),
(13, 'gg5td tdtdt', '2021-11-10', 'V9090909', 'gdg', 0, 0, 'nooO@gmail.com', 4, '0412-1238796', '0412-1237698'),
(14, 'dgd gdg', '2000-11-11', 'V30999111', 'dgdg', 0, 0, 'nwnwnwn@gmail.com', 4, '0412-7889876', '0412-9876543'),
(15, 'sds sdsds', '2010-11-10', 'V8282828', 'sdds', 0, 0, 'sajsj@gmail.com', 4, '0412-9890011', '0412-0001222'),
(16, 'dsd sdss', '2020-11-11', 'V30222000', 'dgdgd', 0, 0, 'adii@gmail.com', 4, '0412-1123344', '0412-9876542'),
(17, 'dw fsfs', '2021-11-11', 'V87999912', 'dfd', 0, 0, 'daad@hotmail.com', 4, '0212-6657878', '0412-1118899');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reporte`
--

CREATE TABLE `reporte` (
  `id` int(11) NOT NULL,
  `fecha_emision` date NOT NULL,
  `alergias` tinyint(1) NOT NULL,
  `descrip_alergias` varchar(50) NOT NULL,
  `patologias` tinyint(1) NOT NULL,
  `descrip_patologias` varchar(50) NOT NULL,
  `descrip_reporte` text NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `id_medico` int(11) NOT NULL
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `reporte`
--
ALTER TABLE `reporte`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

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
