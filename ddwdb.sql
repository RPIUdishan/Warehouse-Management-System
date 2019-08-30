-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 30, 2019 at 09:16 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ddwdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `driver_info`
--

CREATE TABLE `driver_info` (
  `did` int(11) NOT NULL,
  `fullName` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `city` varchar(15) NOT NULL,
  `email` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `contactNumber` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driver_info`
--

INSERT INTO `driver_info` (`did`, `fullName`, `address`, `city`, `email`, `gender`, `contactNumber`) VALUES
(1001, 'test', 'test', 'test', 'isuru072@gmail.com', 'test', 123456),
(1003, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 12),
(1005, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 232323),
(1007, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 12),
(1009, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 2),
(1011, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 3),
(1013, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 3),
(1015, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 1),
(1017, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 11223344),
(1019, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 12),
(1021, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 1),
(1023, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 1),
(1025, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 1),
(1027, 'THUSHAN ISURU', 'AMBALANPOTHA JUNCTION HORABOKKA UVA/ PELWATTA ', 'BUTTALA', 'ISURU072@GMAIL.COM', 'Male', 1);

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE `job` (
  `jobId` int(11) NOT NULL,
  `cabType` varchar(10) NOT NULL,
  `date` varchar(15) NOT NULL,
  `tripFrom` varchar(15) NOT NULL,
  `tripTo` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `job`
--

INSERT INTO `job` (`jobId`, `cabType`, `date`, `tripFrom`, `tripTo`) VALUES
(1005, 'test', '2019-08-20', 'Malabe', 'Kadawatha'),
(1007, 'wagon R', '2019-08-30', 'colombo', 'Malabe'),
(1009, 'testsdf', '2019-08-30', 'dsfdf', 'dsfdf');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle_info`
--

CREATE TABLE `vehicle_info` (
  `vid` int(11) NOT NULL,
  `vNum` varchar(12) NOT NULL,
  `vType` varchar(100) NOT NULL,
  `vModel` varchar(100) NOT NULL,
  `irDate` varchar(10) NOT NULL,
  `trDate` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle_info`
--

INSERT INTO `vehicle_info` (`vid`, `vNum`, `vType`, `vModel`, `irDate`, `trDate`) VALUES
(2022, 'BT-2324', 'test', 'test', 'test', 'test');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `driver_info`
--
ALTER TABLE `driver_info`
  ADD PRIMARY KEY (`did`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`jobId`);

--
-- Indexes for table `vehicle_info`
--
ALTER TABLE `vehicle_info`
  ADD PRIMARY KEY (`vid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
