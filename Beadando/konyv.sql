-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2020. Dec 05. 19:00
-- Kiszolgáló verziója: 10.4.16-MariaDB
-- PHP verzió: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `konyvek`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `konyv`
--

CREATE TABLE `konyv` (
  `id` text COLLATE utf8_hungarian_ci NOT NULL,
  `cim` varchar(255) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `kiadas` date DEFAULT NULL,
  `oldal_szam` int(11) DEFAULT NULL,
  `fajta` varchar(250) COLLATE utf8_hungarian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `konyv`
--

INSERT INTO `konyv` (`id`, `cim`, `kiadas`, `oldal_szam`, `fajta`) VALUES
('ad34e945-2797-486c-919a-7fa0ae1881ae', 'Tesztkönyv', '2020-04-21', 220, 'EBOOK'),
('dd7a0cc2-87e5-4268-bc28-ab3f5af2d539', 'tesztkönyv3', '1997-12-20', 156, 'PAPIR'),
('daec6520-614b-4971-ba54-4f7ef0c4e95f', 'mÅ±xik', '1980-12-01', 123, 'PAPIR'),
('a18fb2a2-dfd8-46ac-b820-f60767c41ed6', 'Ãdv', '1999-05-01', 32, 'HANGOSKONYV'),
('bbfa4287-7292-4d21-a6d6-6af979bddd5b', 'Teszt', '1950-02-03', 455, 'EBOOK'),
('24189372-5369-4422-ad8b-ce8f6162d983', 'lel', '1999-05-01', 56, 'EBOOK'),
('3b3e8a6a-9fe8-4412-947d-aee75c2a9b92', 'Done', '2020-11-01', 510, 'PAPIR');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
