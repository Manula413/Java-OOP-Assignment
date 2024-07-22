-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 21, 2024 at 11:55 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ims`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `employee_name` varchar(50) NOT NULL,
  `day` int(11) NOT NULL,
  `month` varchar(10) NOT NULL,
  `year` int(11) NOT NULL,
  `time` varchar(20) NOT NULL,
  `role` varchar(15) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=MyISAM AUTO_INCREMENT=55 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`aid`, `employee_id`, `username`, `employee_name`, `day`, `month`, `year`, `time`, `role`) VALUES
(1, 1, 'hello', 'cash', 24, 'October', 2022, '17:44:46', 'cashier'),
(2, 1, 'hello', 'cash', 24, 'October', 2022, '17:46:20', 'cashier'),
(3, 1, 'hello', 'm', 24, 'October', 2022, '17:47:06', 'cashier'),
(4, 1, 'hello', 'cash', 24, 'January', 2022, '17:47:26', 'cashier'),
(5, 1, 'hello', 'cash', 24, 'October', 2022, '17:57:38', 'cashier'),
(6, 1, 'hello', 'cash', 24, 'October', 2022, '23:33:03', 'cashier'),
(7, 1, 'hello', 'm', 24, 'October', 2121, '17:47:06', 'cashier'),
(8, 1, 'hello', 'tt', 24, 'October', 2121, '17:47:06', 'cashier'),
(9, 1, 'hello', 'cash', 17, 'November', 2022, '17:05:55', 'cashier'),
(10, 1, 'hello', 'cash', 17, 'November', 2022, '18:26:33', 'Cashier'),
(11, 1, 'hello', 'cash', 17, 'November', 2022, '18:30:12', 'Cashier'),
(12, 1, 'hello', 'cash', 17, 'November', 2022, '18:33:43', 'Cashier'),
(13, 1, 'hello', 'cash', 17, 'November', 2022, '18:34:01', 'Cashier'),
(14, 1, 'hello', 'cash', 17, 'November', 2022, '18:36:26', 'Cashier'),
(15, 1, 'hello', 'cash', 17, 'November', 2022, '18:36:59', 'Cashier'),
(16, 1, 'hello', 'cash', 17, 'November', 2022, '18:38:07', 'Cashier'),
(17, 1, 'hello', 'cash', 17, 'November', 2022, '18:38:31', 'Cashier'),
(18, 1, 'hello', 'cash', 17, 'November', 2022, '18:43:08', 'Cashier'),
(19, 1, 'hello', 'cash', 17, 'November', 2022, '18:51:51', 'Cashier'),
(20, 1, 'hello', 'cash', 17, 'November', 2022, '19:03:04', 'Cashier'),
(21, 1, 'hello', 'cash', 19, 'November', 2022, '12:30:10', 'Cashier'),
(22, 1, 'hello', 'cash', 19, 'November', 2022, '14:07:50', 'Cashier'),
(23, 1, 'hello', 'cash', 19, 'November', 2022, '14:08:45', 'Cashier'),
(24, 1, 'hello', 'cash', 19, 'November', 2022, '14:12:18', 'Cashier'),
(25, 1, 'hello', 'cash', 19, 'November', 2022, '14:13:49', 'Cashier'),
(26, 1, 'hello', 'cash', 19, 'November', 2022, '14:18:07', 'Cashier'),
(27, 1, 'hello', 'cash', 19, 'November', 2022, '14:19:12', 'Cashier'),
(28, 1, 'hello', 'cash', 19, 'November', 2022, '14:20:52', 'Cashier'),
(29, 1, 'hello', 'cash', 19, 'November', 2022, '14:22:01', 'Cashier'),
(30, 1, 'hello', 'cash', 19, 'November', 2022, '14:27:51', 'Cashier'),
(31, 1, 'hello', 'cash', 19, 'November', 2022, '14:28:58', 'Cashier'),
(32, 1, 'hello', 'cash', 20, 'November', 2022, '10:36:30', 'Cashier'),
(33, 1, 'hello', 'cash', 20, 'November', 2022, '10:38:11', 'Cashier'),
(34, 1, 'hello', 'cash', 20, 'November', 2022, '10:40:11', 'Cashier'),
(35, 1, 'hello', 'cash', 20, 'November', 2022, '10:49:16', 'Cashier'),
(36, 1, 'hello', 'cash', 22, 'November', 2022, '21:30:51', 'Cashier'),
(37, 1, 'hello', 'cash', 22, 'November', 2022, '21:34:15', 'Cashier'),
(38, 1, 'hello', 'cash', 22, 'November', 2022, '21:36:07', 'Cashier'),
(39, 1, 'hello', 'cash', 24, 'November', 2022, '15:11:53', 'Cashier'),
(40, 1, 'hello', 'cash', 24, 'November', 2022, '16:28:53', 'Cashier'),
(41, 1, 'hello', 'cash', 26, 'November', 2022, '18:13:10', 'Cashier'),
(42, 1, 'hello', 'cash', 26, 'November', 2022, '18:14:19', 'Cashier'),
(43, 1, 'hello', 'Kim', 27, 'November', 2022, '00:02:42', 'cashier'),
(44, 2, 'hello', 'James', 28, 'November', 2022, '00:10:56', 'cashier'),
(45, 3, 'manager', 'James', 28, 'November', 2022, '01:36:49', 'manger'),
(46, 1, 'cashier', 'Kim', 28, 'November', 2022, '01:38:26', 'cashier'),
(47, 3, 'James', 'James', 28, 'November', 2022, '01:40:12', 'manger'),
(48, 1, 'Kim', 'Kim', 28, 'November', 2022, '02:27:21', 'cashier'),
(49, 4, 'Rathnayake', 'Rathnayake', 28, 'November', 2022, '07:48:31', 'admin'),
(50, 1, 'Kim', 'Kim', 24, 'May', 2024, '13:31:26', 'cashier'),
(51, 4, 'Rathnayake', 'Rathnayake', 24, 'May', 2024, '13:35:51', 'admin'),
(52, 1, 'Kim', 'Kim', 26, 'May', 2024, '21:27:35', 'cashier'),
(53, 4, 'Rathnayake', 'Rathnayake', 2, 'June', 2024, '19:38:52', 'admin'),
(54, 1, 'Kim', 'Kim', 2, 'June', 2024, '19:45:44', 'cashier');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
CREATE TABLE IF NOT EXISTS `cart` (
  `cartid` int(11) NOT NULL AUTO_INCREMENT,
  `INID` int(11) NOT NULL,
  `pid` varchar(10) NOT NULL,
  `Product_Name` varchar(50) NOT NULL,
  `qty` varchar(20) NOT NULL,
  `Unit_Price` varchar(20) NOT NULL,
  `Total_Price` varchar(20) NOT NULL,
  `Total_Cost` double DEFAULT '0',
  `profit` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`cartid`)
) ENGINE=MyISAM AUTO_INCREMENT=355 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`cartid`, `INID`, `pid`, `Product_Name`, `qty`, `Unit_Price`, `Total_Price`, `Total_Cost`, `profit`) VALUES
(353, 107, '17', 'Soap', '1', '550.0', '550.0', 500, 50),
(354, 107, '18', 'Toothpaste', '2', '170.0', '340.0', 240, 100);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `Cid` int(11) NOT NULL AUTO_INCREMENT,
  `Customer_FirstName` varchar(50) NOT NULL,
  `Customer_LastName` varchar(50) NOT NULL,
  `Customer_TP` varchar(10) NOT NULL,
  `Customer_Email` varchar(50) NOT NULL,
  `Loyalty_Points` varchar(10) NOT NULL DEFAULT '0',
  `Total_Discounts` varchar(10) NOT NULL DEFAULT '0',
  `Reg_Date` varchar(50) NOT NULL,
  `Reg_Employee` varchar(10) NOT NULL,
  `Reg_year` int(11) NOT NULL DEFAULT '0',
  `Reg_Month` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Cid`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Cid`, `Customer_FirstName`, `Customer_LastName`, `Customer_TP`, `Customer_Email`, `Loyalty_Points`, `Total_Discounts`, `Reg_Date`, `Reg_Employee`, `Reg_year`, `Reg_Month`) VALUES
(11, 'Nicky', 'Minaj', '0332455353', 'wek@sub.com', '0', '', '14-09-2022', 'Employee', 2022, 8),
(12, 'Saul', 'Goodman', '0458145854', 'Saul@gmail.com', '0', '', '18-06-2022', 'hello', 2022, 5),
(17, 'Hector', 'Salamanca', '04584158', 'Hector@gmail.com', '0', '', '20-07-2021', 'Employee', 2021, 6),
(20, 'Manula', 'Pasan', '0769131392', 'manula413hemantha@gmail.com', '678.0', '6768.0', '01-12-2021', 'hello', 2021, 11),
(21, 'Lalo', 'Salamanca', '45678248', 'lalo@gmail.com', '0', '', '20-03-2020', 'Employee', 2020, 2),
(22, 'Kim', 'Wexler', '458144', 'kim@gmail.com', '0', '0', '15-07-2020', 'hello', 2019, 6),
(24, 'Gus', 'Fring', '45741', 'gus@gmai.com', '100', '0', '20-11-2022', 'hello', 2022, 10),
(29, 'Pasan', 'Hemantha', '12345678', 'manula413hemantha@gmail.com', '0', '0', '2022-11-27', 'null', 2021, 4),
(30, 'David', 'Degea', '46164', 'david@gmai.com', '0', '0', '2022-11-27', 'null', 2022, 10),
(31, 'Senol', 'Sennath', '0763413752', 'sswijetunge1@gmai.com', '500', '0', '2022-11-28', 'James', 2022, 10),
(32, 'Pasan', 'Manula', '01125425', 'manula413hemantha@gmail.com', '0', '0', '2024-05-24', 'Rathnayake', 2024, 4);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `Employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_name` varchar(50) NOT NULL,
  `Employee_tp` varchar(10) NOT NULL,
  `Employee_email` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `Employee_Role` varchar(20) NOT NULL,
  PRIMARY KEY (`Employee_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Employee_id`, `Employee_name`, `Employee_tp`, `Employee_email`, `username`, `password`, `Employee_Role`) VALUES
(1, 'Kim', '0452154', 'kim@gmail.com', 'Kim', '12345', 'cashier'),
(3, 'James', '0452154', 'james@gmail.com', 'James', '12345', 'manager'),
(4, 'Rathnayake', '0452154', 'james@gmail.com', 'Rathnayake', '12345', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `employee_salary`
--

DROP TABLE IF EXISTS `employee_salary`;
CREATE TABLE IF NOT EXISTS `employee_salary` (
  `esalid` int(11) NOT NULL AUTO_INCREMENT,
  `empid` int(11) NOT NULL,
  `empname` varchar(50) NOT NULL,
  `paymonth` varchar(10) NOT NULL,
  `payyear` int(11) NOT NULL,
  `paiddate` varchar(30) NOT NULL,
  `amount` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`esalid`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_salary`
--

INSERT INTO `employee_salary` (`esalid`, `empid`, `empname`, `paymonth`, `payyear`, `paiddate`, `amount`, `status`) VALUES
(1, 464, 'fhfh', 'fh', 546, '2021', 0, 0),
(2, 1, 'Kim', 'November', 2022, '', 20000, 0),
(3, 1, 'Kim', 'June', 2021, '', 20000, 0),
(4, 3, 'James', 'November', 2022, '', 25000, 0),
(5, 4, 'Rathnayake', 'November', 2022, '', 30000, 0),
(6, 1, 'Kim', 'May', 2024, '', 20000, 0),
(7, 4, 'Rathnayake', 'May', 2024, '', 30000, 0),
(8, 4, 'Rathnayake', 'June', 2024, '', 30000, 0),
(9, 1, 'Kim', 'June', 2024, '', 20000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `extra`
--

DROP TABLE IF EXISTS `extra`;
CREATE TABLE IF NOT EXISTS `extra` (
  `exid` int(11) NOT NULL AUTO_INCREMENT,
  `val` varchar(10) NOT NULL,
  PRIMARY KEY (`exid`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `extra`
--

INSERT INTO `extra` (`exid`, `val`) VALUES
(1, '106');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
CREATE TABLE IF NOT EXISTS `inventory` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(50) NOT NULL,
  `barcode` varchar(50) NOT NULL,
  `cprice` double NOT NULL,
  `sprice` double NOT NULL,
  `quantity` double NOT NULL,
  `sname` varchar(50) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`pid`, `pname`, `barcode`, `cprice`, `sprice`, `quantity`, `sname`, `status`) VALUES
(17, 'Soap', '12345', 500, 550, 70, '54321', 1),
(18, 'Toothpaste', '45215', 120, 170, -15, '54321', 1),
(19, 'Gloves', '415481', 50, 100, 55, '54321', 1),
(20, 'mask', '1416165', 120, 550, 80, 'DoT', 1),
(21, 'Bottle', '548161', 100, 200, 90, 'DoT', 1),
(22, 'Toy', '4596451', 100, 150, 95, 'Mark', 1);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
CREATE TABLE IF NOT EXISTS `sales` (
  `saleid` int(11) NOT NULL AUTO_INCREMENT,
  `INID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Time` varchar(20) NOT NULL,
  `Cashier` varchar(20) NOT NULL,
  `Cid` int(11) NOT NULL,
  `Customer_Name` varchar(50) NOT NULL,
  `No_Items` varchar(10) NOT NULL DEFAULT '0',
  `Total_Bill` varchar(10) NOT NULL,
  `Total_Cost` double DEFAULT '0',
  `Paid_Amount` varchar(10) NOT NULL DEFAULT '0',
  `Balance` varchar(10) NOT NULL,
  `Loyalty_Points` int(11) NOT NULL DEFAULT '0',
  `Discount` varchar(10) NOT NULL DEFAULT '0',
  `Profit` double DEFAULT '0',
  PRIMARY KEY (`saleid`)
) ENGINE=MyISAM AUTO_INCREMENT=108 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`saleid`, `INID`, `Date`, `Time`, `Cashier`, `Cid`, `Customer_Name`, `No_Items`, `Total_Bill`, `Total_Cost`, `Paid_Amount`, `Balance`, `Loyalty_Points`, `Discount`, `Profit`) VALUES
(59, 63, '2021-10-13', '03:47:31 PM', 'Employee', 0, 'Unregistered', '0', '800.0', 500, '0', '200.0', 0, '0', 300),
(60, 64, '2022-11-26', '03:47:48 PM', 'Employee', 0, 'Unregistered', '0', '1500.0', 1200, '0', '500.0', 0, '0', 300),
(61, 65, '2022-11-27', '03:47:48', 'Employee', 0, 'Unregistered', '0', '700', 500, '0', '300', 0, '0', 200),
(62, 66, '2020-02-20', '03:47:48', 'Employee', 0, 'Unregistered', '0', '700', 500, '0', '300', 0, '0', 200),
(63, 67, '2020-01-25', '03:47:48', 'Employee', 0, 'Unregistered', '0', '700', 500, '0', '300', 0, '0', 200),
(64, 68, '2021-06-26', '03:47:48', 'Employee', 0, 'Unregistered', '0', '700', 500, '0', '300', 0, '0', 200),
(65, 69, '2021-05-17', '03:47:48', 'Employee', 0, 'Unregistered', '0', '700', 500, '0', '300', 0, '0', 200),
(66, 70, '2022-09-07', '03:47:48', 'Employee', 0, 'Unregistered', '0', '700', 500, '0', '300', 0, '0', 200),
(67, 71, '2023-11-17', '03:47:48', 'Employee', 0, 'Unregistered', '0', '700', 500, '0', '300', 0, '0', 200),
(68, 72, '2023-10-14', '03:47:48', 'Employee', 0, 'Unregistered', '0', '700', 500, '0', '300', 0, '0', 200),
(69, 73, '2023-10-20', '03:47:48', 'Employee', 0, 'Unregistered', '5', '700', 500, '0', '300', 0, '0', 200),
(70, 74, '2023-10-21', '03:47:48', 'Employee', 0, 'Unregistered', '7', '700', 500, '0', '300', 0, '0', 200),
(71, 65, '2022-11-26', '08:27:27 PM', 'Employee', 0, 'Unregistered', '15.0', '1550.0', 1100, '0', '50.0', 0, '0', 450),
(72, 66, '2022-11-26', '09:46:14 PM', 'Employee', 0, 'Unregistered', '10.0', '1500.0', 1200, '0', 'Rs.00.00', 0, '0', 300),
(73, 67, '2022-11-26', '11:14:45 PM', 'Employee', 0, 'Unregistered', '15.0', '1900.0', 1450, '0', '100.0', 0, '0', 450),
(74, 68, '2022-11-26', '11:17:16 PM', 'Employee', 0, 'Unregistered', '10.0', '800.0', 500, '0', 'Rs.00.00', 0, '0', 300),
(75, 69, '2022-11-26', '11:18:19 PM', 'Employee', 0, 'Unregistered', '10.0', '5200.0', 1200, '0', 'Rs.00.00', 0, '0', 4000),
(76, 70, '2022-11-26', '11:21:29 PM', 'Employee', 0, 'Unregistered', '10.0', '1500.0', 1200, '0', '500.0', 0, '0', 300),
(77, 71, '2022-11-26', '11:24:08 PM', 'Employee', 0, 'Unregistered', '10.0', '800.0', 500, '0', '200.0', 0, '0', 300),
(78, 72, '2022-11-26', '11:24:50 PM', 'Employee', 0, 'Unregistered', '15.0', '1550.0', 1100, '0', '50.0', 0, '0', 450),
(79, 79, '2022-11-27', '01:28:47 AM', 'cashier', 20, 'Manula', '100.0', '28850.0', 15700, '28000', '592.5', 50, '1442.5', 11707.5),
(80, 80, '2022-11-27', '12:18:01 PM', 'Employee', 0, 'Unregistered', '10.0', '800.0', 500, '1000', '200.0', 0, '0', 300),
(81, 81, '2022-11-27', '03:09:21 PM', 'Employee', 0, 'Unregistered', '10.0', '5500.0', 5000, '6000', '500.0', 0, '0', 500),
(82, 82, '2022-11-27', '03:33:33 PM', 'cashier', 20, 'Manula', '15.0', '2200.0', 1450, '2500', '300.0', 0, '0.0', 750),
(83, 83, '2022-11-27', '11:38:19 PM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(84, 84, '2022-11-27', '11:38:44 PM', 'Employee', 0, 'Unregistered', '5.0', '850.0', 600, '1000', '150.0', 0, '0', 250),
(85, 85, '2022-11-27', '11:39:15 PM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(86, 86, '2022-11-28', '01:44:52 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(87, 87, '2022-11-28', '01:45:41 AM', 'Employee', 0, 'Unregistered', '10.0', '1000.0', 500, '10000', '9000.0', 0, '0', 500),
(88, 88, '2022-11-28', '01:47:45 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '1800', '100.0', 0, '0', 500),
(89, 89, '2022-11-28', '01:51:15 AM', 'Employee', 0, 'Unregistered', '15.0', '2200.0', 1450, '2500', '300.0', 0, '0', 750),
(90, 90, '2022-11-28', '01:52:20 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(91, 91, '2022-11-28', '02:05:53 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(92, 92, '2022-11-28', '02:16:20 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '10000', '8300.0', 0, '0', 500),
(93, 93, '2022-11-28', '02:17:42 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(94, 94, '2022-11-28', '02:19:51 AM', 'Employee', 0, 'Unregistered', '5.0', '500.0', 250, '1000', '500.0', 0, '0', 250),
(95, 95, '2022-11-28', '02:21:03 AM', 'cashier', 20, 'Manula', '10.0', '5500.0', 1200, '5500', '275.0', 50, '275.0', 4025),
(96, 96, '2022-11-28', '03:32:15 AM', 'Employee', 0, 'Unregistered', '10.0', '5500.0', 5000, '6000', '500.0', 0, '0', 500),
(97, 97, '2022-11-28', '03:33:45 AM', 'cashier', 20, 'Manula', '10.0', '5500.0', 1200, '5500', '275.0', 50, '275.0', 4025),
(98, 98, '2022-11-28', '03:57:29 AM', 'Employee', 0, 'Unregistered', '10.0', '1000.0', 500, '1500', '500.0', 0, '0', 500),
(99, 98, '2022-11-28', '06:03:07 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(100, 99, '2022-11-28', '06:03:54 AM', 'cashier', 20, 'Manula', '25.0', '4450.0', 2700, '4500', '272.5', 50, '222.5', 1527.5),
(101, 100, '2022-11-28', '06:05:18 AM', 'cashier', 20, 'Manula', '10.0', '1700.0', 1200, '1700', '85.0', 50, '85.0', 415),
(102, 101, '2022-11-28', '07:36:30 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(103, 102, '2022-11-28', '07:41:38 AM', 'Employee', 0, 'Unregistered', '10.0', '1700.0', 1200, '2000', '300.0', 0, '0', 500),
(104, 103, '2022-11-28', '07:47:12 AM', 'cashier', 20, 'Manula', '15.0', '4450.0', 3700, '4500', '272.5', 50, '222.5', 527.5),
(105, 104, '2024-05-24', '01:34:02 PM', 'cashier', 20, 'Manula', '5.0', '2750.0', 2500, '3000', '387.5', 50, '137.5', 112.5),
(106, 105, '2024-05-24', '01:36:38 PM', 'Employee', 0, 'Unregistered', '5.0', 'Rs.00.00', 2500, '', 'Rs.00.00', 0, '0', 250),
(107, 106, '2024-05-24', '01:53:58 PM', 'Employee', 0, 'Unregistered', '5.0', 'Rs.00.00', 2500, '', 'Rs.00.00', 0, '0', 250);

-- --------------------------------------------------------

--
-- Table structure for table `stock_report`
--

DROP TABLE IF EXISTS `stock_report`;
CREATE TABLE IF NOT EXISTS `stock_report` (
  `stid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `pname` varchar(50) NOT NULL,
  `quantity` double NOT NULL,
  `day` int(11) NOT NULL,
  `month` varchar(10) NOT NULL,
  `year` int(11) NOT NULL,
  `time` varchar(20) NOT NULL,
  `status` varchar(15) NOT NULL,
  PRIMARY KEY (`stid`)
) ENGINE=MyISAM AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock_report`
--

INSERT INTO `stock_report` (`stid`, `pid`, `pname`, `quantity`, `day`, `month`, `year`, `time`, `status`) VALUES
(1, 45, 'rsrsf', 45, 12, 'January', 2134, '124:sdas', 'stock-in'),
(2, 45, 'stock-out', 45, 12, 'January', 2134, '124:sdas', 'stock-out'),
(3, 457, 'stock-fix', 45, 12, 'January', 2134, '124:sdas', 'stock-in'),
(18, 8, 'sfsf', 2473, 17, 'November', 2022, '00:07:20', 'stock-out'),
(4, 457, 'sdfsfsfsf', 45, 12, 'January', 2134, '124:sdas', 'stock-in'),
(5, 457, 'sdfsfsfsf', 45, 12, 'January', 343, '124:sdas', 'stock-in'),
(6, 457, 'sdfsfsfsf', 45, 12, 'March', 343, '124:sdas', 'stock-in'),
(7, 457, 'sdfsfsfsf', 45, 12, 'April', 343, '124:sdas', 'stock-in'),
(8, 457, 'sdfsfsfsf', 45, 25, 'April', 343, '124:sdas', 'stock-in'),
(9, 457, 'sdfsfsfsf', 45, 18, 'JUNE', 343, '124:sdas', 'stock-in'),
(11, 8, 'sfsf', 2473, 16, 'November', 2022, '23:57:20', 'stock-in'),
(12, 11, 'sfsf', 896, 16, 'November', 2022, '23:58:31', 'stock-in'),
(13, 14, 'yyyyyyyy', 595, 16, 'November', 2022, '23:59:27', 'stock-in'),
(14, 14, 'yyyyyyyy', 605, 16, 'November', 2022, '23:59:40', 'stock-in'),
(15, 15, 'sfsfs', 3555, 17, 'November', 2022, '00:01:22', 'stock-in'),
(16, 11, 'sfsf', 896, 17, 'November', 2022, '00:04:22', 'stock-out'),
(17, 11, 'sfsf', 200, 17, 'November', 2022, '00:04:22', 'stock-in'),
(19, 8, 'sfsf', 600, 17, 'November', 2022, '00:07:20', 'stock-in'),
(20, 10, '11111', 1016, 17, 'November', 2022, '00:07:49', 'stock-out'),
(21, 10, '11111', 1000, 17, 'November', 2022, '00:07:49', 'stock-in'),
(22, 8, 'sfsf', 600, 17, 'November', 2022, '00:10:42', 'stock-out'),
(23, 8, 'sfsf', 250, 17, 'November', 2022, '00:10:42', 'stock-in'),
(24, 8, 'sfsf', 273, 17, 'November', 2022, '00:12:26', 'stock-in'),
(25, 9, 'sfsfsdds', 300, 17, 'November', 2022, '12:03:25', 'stock-in'),
(26, 11, 'sfsf', 200, 17, 'November', 2022, '12:03:41', 'stock-out'),
(27, 11, 'sfsf', 300, 17, 'November', 2022, '12:03:41', 'stock-in'),
(28, 18, '', 100, 20, 'November', 2022, '18:04:55', 'stock-in'),
(29, 19, 'Gloves', 10, 27, 'November', 2022, '12:18:01', 'stock-out'),
(30, 18, 'Toothpaste', 150, 27, 'November', 2022, '12:32:03', 'stock-in'),
(31, 17, 'Soap', 10, 27, 'November', 2022, '15:09:21', 'stock-out'),
(32, 18, 'Toothpaste', 10, 27, 'November', 2022, '15:33:33', 'stock-out'),
(33, 19, 'Gloves', 5, 27, 'November', 2022, '15:33:33', 'stock-out'),
(34, 18, 'Toothpaste', 10, 27, 'November', 2022, '23:38:19', 'stock-out'),
(35, 18, 'Toothpaste', 5, 27, 'November', 2022, '23:38:44', 'stock-out'),
(36, 18, 'Toothpaste', 10, 27, 'November', 2022, '23:39:15', 'stock-out'),
(37, 18, 'Toothpaste', 10, 28, 'November', 2022, '01:44:52', 'stock-out'),
(38, 19, 'Gloves', 10, 28, 'November', 2022, '01:45:41', 'stock-out'),
(39, 18, 'Toothpaste', 10, 28, 'November', 2022, '01:47:45', 'stock-out'),
(40, 19, 'Gloves', 5, 28, 'November', 2022, '01:51:15', 'stock-out'),
(41, 18, 'Toothpaste', 10, 28, 'November', 2022, '01:51:15', 'stock-out'),
(42, 18, 'Toothpaste', 10, 28, 'November', 2022, '01:52:20', 'stock-out'),
(43, 18, 'Toothpaste', 10, 28, 'November', 2022, '02:05:53', 'stock-out'),
(44, 18, 'Toothpaste', 10, 28, 'November', 2022, '02:16:20', 'stock-out'),
(45, 18, 'Toothpaste', 10, 28, 'November', 2022, '02:17:42', 'stock-out'),
(46, 19, 'Gloves', 5, 28, 'November', 2022, '02:19:51', 'stock-out'),
(47, 20, 'mask', 10, 28, 'November', 2022, '02:21:03', 'stock-out'),
(48, 17, 'Soap', 10, 28, 'November', 2022, '03:32:15', 'stock-out'),
(49, 20, 'mask', 10, 28, 'November', 2022, '03:33:45', 'stock-out'),
(50, 19, 'Gloves', 10, 28, 'November', 2022, '03:57:29', 'stock-out'),
(51, 18, 'Toothpaste', 10, 28, 'November', 2022, '06:03:08', 'stock-out'),
(52, 18, 'Toothpaste', 10, 28, 'November', 2022, '06:03:54', 'stock-out'),
(53, 21, 'Bottle', 10, 28, 'November', 2022, '06:03:54', 'stock-out'),
(54, 22, 'Toy', 5, 28, 'November', 2022, '06:03:54', 'stock-out'),
(55, 18, 'Toothpaste', 10, 28, 'November', 2022, '06:05:18', 'stock-out'),
(56, 18, 'Toothpaste', 10, 28, 'November', 2022, '07:36:31', 'stock-out'),
(57, 18, 'Toothpaste', 10, 28, 'November', 2022, '07:41:38', 'stock-out'),
(58, 18, 'Toothpaste', 10, 28, 'November', 2022, '07:47:12', 'stock-out'),
(59, 17, 'Soap', 5, 28, 'November', 2022, '07:47:12', 'stock-out'),
(60, 17, 'Soap', 5, 24, 'May', 2024, '13:53:58', 'stock-out');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_Name` varchar(50) NOT NULL,
  `tp_Number` varchar(10) NOT NULL,
  `company` varchar(50) NOT NULL,
  `sp_email` varchar(50) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`sid`, `supplier_Name`, `tp_Number`, `company`, `sp_email`) VALUES
(11, 'DoT', '0114456543', 'CBL ', 'test@test.com'),
(12, 'kim', '45852', 'Wexler', 'kim@gmail.com'),
(13, 'Mark', 'MCT', '4582458', 'mct@gmai.com');

-- --------------------------------------------------------

--
-- Table structure for table `user_salary`
--

DROP TABLE IF EXISTS `user_salary`;
CREATE TABLE IF NOT EXISTS `user_salary` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `usertype` varchar(20) NOT NULL,
  `salary` int(11) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_salary`
--

INSERT INTO `user_salary` (`uid`, `usertype`, `salary`) VALUES
(1, 'cashier', 20000),
(2, 'manager', 25000),
(3, 'admin', 30000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
