-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 19, 2019 at 10:56 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiket`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`Username`, `Password`) VALUES
('faisal', 'faisal');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `no_anggota` varchar(10) NOT NULL,
  `nm_anggota` varchar(30) NOT NULL,
  `tgl_daftar` date NOT NULL,
  `tgl_berlaku` date NOT NULL,
  `no_kartu` varchar(10) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`no_anggota`, `nm_anggota`, `tgl_daftar`, `tgl_berlaku`, `no_kartu`, `alamat`) VALUES
('A0004', 'faisal', '2018-06-06', '2018-06-22', '1004', 'selamaat'),
('A0005', 'reza', '2018-07-01', '2018-07-20', '1005', 'jalan papua'),
('A0006', 'rozak', '2018-07-01', '2018-07-21', '1006', 'jalan merbabu'),
('A0007', 'rezaa', '2018-07-01', '2018-07-21', '1007', 'papua nugini'),
('A0008', 'sule', '2018-07-01', '2018-07-21', '1008', 'nugini perkembangan'),
('A0009', 'suleun', '2018-07-01', '2018-07-01', '1009', 'hahahahaha'),
('A0010', 'reza', '2018-07-01', '2018-07-07', '0010', 'hahahahah'),
('A0011', 'dtdtd', '2019-06-17', '2019-06-17', '0010', 'vfftftdtdt'),
('A0012', 'sal', '2019-07-05', '2019-07-16', '0010', 'mampang ');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `j_kelamin` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  `no_telp` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id`, `nama`, `j_kelamin`, `alamat`, `no_telp`) VALUES
('K0001', 'spocky', 'Laki-laki', 'Jakarta, Indonesia', '0811146466'),
('K0002', 'faisal', 'Laki-laki', 'paling gegeh', '255365155'),
('K0003', 'ari', 'Laki-laki', 'tebet', '005551181518'),
('K0004', 'reza', 'Laki-laki', 'kemang', '0254846845');

-- --------------------------------------------------------

--
-- Table structure for table `pengeluaran`
--

CREATE TABLE `pengeluaran` (
  `Tanggal` date NOT NULL,
  `Keterangan` varchar(50) NOT NULL,
  `Total` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengeluaran`
--

INSERT INTO `pengeluaran` (`Tanggal`, `Keterangan`, `Total`) VALUES
('2019-06-06', 'pasir pantai biruu', 46666),
('2019-11-13', 'rsdgdfhfh', 3434343),
('2019-06-03', 'dahdha', 50000),
('2019-06-04', 'dada', 20000),
('2019-06-05', 'dsada', 30000),
('2019-06-06', 'dsadasd', 40000);

-- --------------------------------------------------------

--
-- Table structure for table `saran`
--

CREATE TABLE `saran` (
  `pengunjung` varchar(20) DEFAULT NULL,
  `tanggal` date NOT NULL,
  `tx_saran` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saran`
--

INSERT INTO `saran` (`pengunjung`, `tanggal`, `tx_saran`) VALUES
('hay', '2018-07-01', 'hay hay hay'),
('reza', '2018-07-01', 'mohon di maklumi'),
('faisal', '2018-07-01', 'mohon jam operasional bukanya menjadi 24 jam '),
('isal', '2019-06-03', 'hahahaha');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kd_tiket` varchar(10) NOT NULL,
  `pegawai` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `qty_dewasa` int(10) NOT NULL,
  `hrg_tiket_dewasa` int(50) NOT NULL,
  `qty_anak` int(10) NOT NULL,
  `hrg_tiket_anak` int(50) NOT NULL,
  `disc member` varchar(10) NOT NULL,
  `disc promo` varchar(10) NOT NULL,
  `total` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`kd_tiket`, `pegawai`, `tanggal`, `qty_dewasa`, `hrg_tiket_dewasa`, `qty_anak`, `hrg_tiket_anak`, `disc member`, `disc promo`, `total`) VALUES
('A1001', 'spocky', '2019-07-04', 2, 40000, 2, 30000, '20%', '', 56000),
('A1002', 'spocky', '2019-07-04', 2, 40000, 4, 60000, '20%', '', 80000),
('A1003', 'spocky', '2019-07-04', 3, 60000, 5, 75000, '', '', 135000),
('A1004', 'spocky', '2019-07-04', 6, 120000, 3, 45000, '', '', 165000),
('A1005', 'spocky', '2019-07-04', 2, 40000, 5, 75000, '', '', 115000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `saran`
--
ALTER TABLE `saran`
  ADD PRIMARY KEY (`tanggal`,`tx_saran`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
