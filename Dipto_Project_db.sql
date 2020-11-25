-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2017 at 08:53 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `course_info`
--

CREATE TABLE `course_info` (
  `cid` varchar(100) NOT NULL,
  `Course_Name` varchar(100) NOT NULL,
  `Course_Unit_and_Title` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course_info`
--

INSERT INTO `course_info` (`cid`, `Course_Name`, `Course_Unit_and_Title`) VALUES
('1', 'Business skills', '2 e-commerce'),
('1', 'Business skills for e-commerce', '2 Commerce'),
('2', 'Computer Systems', '2 CS'),
('5', 'Emerging Technologies', '5 ET'),
('9', 'System Analysis and Design', '9 SAD');

-- --------------------------------------------------------

--
-- Table structure for table `students_info`
--

CREATE TABLE `students_info` (
  `ID` int(100) NOT NULL,
  `F_Name` varchar(100) NOT NULL,
  `L_Name` varchar(100) NOT NULL,
  `Course_Unit_and_Title` varchar(100) NOT NULL,
  `Teacher` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students_info`
--

INSERT INTO `students_info` (`ID`, `F_Name`, `L_Name`, `Course_Unit_and_Title`, `Teacher`) VALUES
(1, 'Lasar', 'Maser', '12 Laser', 'Adnan'),
(2, 'Mandy', 'Rae', '2 Computer Science', 'Kabir'),
(3, 'Joseph', 'Karzai', '1 Business skills for e-commerce', 'Lorrence'),
(5, 'Jean', 'Anderson', '11 Driving', 'Hansel'),
(6, 'Aminul', 'Islam', '11 Sports', 'David De Gea');

-- --------------------------------------------------------

--
-- Table structure for table `teachers_info`
--

CREATE TABLE `teachers_info` (
  `tid` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Tele_No` varchar(100) NOT NULL,
  `Course_Unit_and_Title` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teachers_info`
--

INSERT INTO `teachers_info` (`tid`, `Name`, `Email`, `Tele_No`, `Course_Unit_and_Title`) VALUES
('1', 'Mostafizur', 'm@gmail.com', '12423', '2 e-commerce'),
('1', 'Tanzila Islam', 'tanzila@bacbd.org', '12434', '5 ET'),
('2', 'Ksmal', 'kamal@bacbd.org', '43423', '18 DDC'),
('3', 'Mostafizur', 'mostafiz@bacbd.org', '22234', '41 PIJ'),
('4', 'Reza', 'reza@bacbd.org', '245432', '9 SAD');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
