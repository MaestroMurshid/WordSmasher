-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 21, 2020 at 04:06 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `madin_word_smasher`
--

-- --------------------------------------------------------

--
-- Table structure for table `player_details`
--

CREATE TABLE `player_details` (
  `id` int(11) NOT NULL,
  `player_name` varchar(100) NOT NULL,
  `game_mode` varchar(100) NOT NULL,
  `correct_words` int(11) DEFAULT NULL,
  `wrong_words` int(11) DEFAULT NULL,
  `missed_words` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `player_details`
--

INSERT INTO `player_details` (`id`, `player_name`, `game_mode`, `correct_words`, `wrong_words`, `missed_words`, `score`) VALUES
(5, 'Murshid', 'Beginner', 35, 3, 7, 175),
(4, 'Murshid', 'Beginner', 27, 1, 2, 135);

-- --------------------------------------------------------

--
-- Table structure for table `player_details_hard`
--

CREATE TABLE `player_details_hard` (
  `id` int(11) NOT NULL,
  `player_name` varchar(100) NOT NULL,
  `game_mode` varchar(100) NOT NULL,
  `correct_words` int(11) DEFAULT NULL,
  `wrong_words` int(11) DEFAULT NULL,
  `missed_words` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `player_details_hard`
--

INSERT INTO `player_details_hard` (`id`, `player_name`, `game_mode`, `correct_words`, `wrong_words`, `missed_words`, `score`) VALUES
(1, 'Murshid', 'Advanced', 17, 2, 6, 85);

-- --------------------------------------------------------

--
-- Table structure for table `player_details_intermediate`
--

CREATE TABLE `player_details_intermediate` (
  `id` int(11) NOT NULL,
  `player_name` varchar(100) NOT NULL,
  `game_mode` varchar(100) NOT NULL,
  `correct_words` int(11) DEFAULT NULL,
  `wrong_words` int(11) DEFAULT NULL,
  `missed_words` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `player_details_intermediate`
--

INSERT INTO `player_details_intermediate` (`id`, `player_name`, `game_mode`, `correct_words`, `wrong_words`, `missed_words`, `score`) VALUES
(1, 'Murshid', 'Intermediate', 29, 3, 9, 145),
(2, 'Murshid', 'Intermediate', 25, 5, 8, 125);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `player_details`
--
ALTER TABLE `player_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `player_details_hard`
--
ALTER TABLE `player_details_hard`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `player_details_intermediate`
--
ALTER TABLE `player_details_intermediate`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `player_details`
--
ALTER TABLE `player_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `player_details_hard`
--
ALTER TABLE `player_details_hard`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `player_details_intermediate`
--
ALTER TABLE `player_details_intermediate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
