package com.berliano.dicodingsubmission

object TourismData {
    private val tourismNames = arrayOf(
        "Taman Nasional Way Kambas",
        "Pulau Pahawang",
        "Pantai Legian",
        "Taman Nasional Komodo",
        "Taman Nasional Alas Purwo",
        "Taman Nasional Baluran",
        "Taman Nasional Meru Betiri",
        "Kawah Ijen",
        "Pantai Kuta",
        "Taman Nasional Ujung Kulon"
    )

    private val tourismDetails = arrayOf(
        "Taman Nasional Way Kambas merupakan salah satu taman nasinional yang memiliki berbagai flora dan fauna. Lokasinya terletak di Kecamatan Labuhan Ratu, Lampung Timur. Tempat ini juga menjadi lokasi pelatihan, perlindungan, dan konservasi Gajah Sumatera. Di sini pengunjung dapat belajar dan berinteraksi langsung dengan para gajah. Way Kambas juga kerap dijadikan tempat penelitian satwa-satwa langka, baik dari peneliti nusantara maupun peneliti asing. Pengunjung akan dikenai biaya masuk pada hari biasa sebesar Rp 5.000 per orang untuk wisatawan lokal, sebesar Rp 150.000 per orang untuk wisatawan mancanegara. Kemudian pada hari libur sebesar Rp 7.000 per orang untuk wisatawan lokal, dan sebesar Rp 225.000 per orang untuk wisatawan mancanegara.",
        "Pulau Pahawang menawarkan pesona bawah laut nan indah yang belum banyak diketahui. Lokasinya berada di Kecamatan Marga Punduh, Kabupaten Pesawaran, Provinsi Lampung. Pulau dengan luas sebesar 1.084 hektar ini memiliki hutan mangrove, pantai pasir putih, dan pemandangan bawah laut yang cantik. Pulau ini sangat cocok untuk berenang di pantai, banana boat, snorkeling, atau sekadar bersantai di pantai. Pengunjung akan dikenai biaya masuk pulau sebesar Rp 5.000 per orang, sewa perahu untuk snorkeling Rp 20.000 per perahu, sewa alat snorkeling Rp 50.000 per set, banana boat dan Rp30.000 per orang",
        "Pantai Legian juga menawarkan akses yang sangat mudah untuk berbelanja dan banyak terdapat restoran dan bar di sekitar Pantai Legian.Pantai Legian juga dikenal dengan nama lain yaitu pantai Padma.Di pantai ini lebih terkesan santai dan sangat cocok untuk berselancar dan merupakan salah satu pantai pasir putih yang masih terjaga kebersihan nya.",
        "Taman nasional komodo terletak di provinsi Nusa Tenggara Timur.Taman nasional ini terdiri atas tiga pulau besar Pulau Komodo, Pulau Rinca, dan Pulau Padar serta beberapa pulau kecil. Wilayah darat taman nasional ini 603 km² dan wilayah total adalah 1817 km². Di sana terdapat 277 spesies hewan yang merupakan perpaduan hewan yang berasal dari Asia dan Australia, yang terdiri dari 32 spesies mamalia, 128 spesies burung, dan 37 spesies reptilia. Bersama dengan komodo, setidaknya 25 spesies hewan darat dan burung termasuk hewan yang dilindungi, karena jumlahnya yang terbatas atau terbatasnya penyebaran mereka.",
        "Taman Nasional Alas terletak di kecamatan Tegaldilimo dan kecamatan Purwoharjo, Kabupaten Banyuwangi, Jawa Timur. Secara umum kawasan TN Alas Purwo mempunyai topografi datar, bergelombang ringan sampai barat dengan puncak tertinggi Gunung Lingga Manis (322 mdpl). Rata – rata curah hujan 1000 – 1500 mm per tahun dengan temperature 22°-31 °C, dan kelembaban udara 40-85 %. Wilayah TN Alas Purwo sebelah Barat menerima curah hujan lebih tinggi bila dibandingkan dengan wilayah sebelah Timur.",
        "Taman Nasional Baluran adalah salah satu Taman Nasional di Indonesia yang terletak di wilayah Banyuputih, Situbondo, Jawa Timur, Indonesia. Nama dari Taman Nasional ini diambil dari nama gunung yang berada di daerah ini, yaitu Gunung Baluran. Taman nasional ini terdiri dari tipe vegetasi sabana, hutan mangrove, hutan musim, hutan pantai, hutan pegunungan bawah, hutan rawa dan hutan yang selalu hijau sepanjang tahun. Tipe vegetasi sabana mendominasi kawasan Taman Nasional Baluran yakni sekitar 40 persen dari total luas lahan. Luas wilayah taman nasional ini sebesar 25.000 Ha.",
        "Taman Nasional Meru Betiri adalah taman nasional yang terletak di regional Jawa Timur bagian selatan,  dengan ketinggian 900 - 1.223 mdpl dan curah hujan rata-rata 2.300 mm/tahun, ditunjuk sebagai taman nasional sejak tahun 1982 oleh Menteri Pertanian dengan luas wilayahnya sekitar 58.000 ha dengan nama diambil dari nama gunung tertinggi di kawasan ini yaitu gunung Betiri (1.223m). Taman nasional ini terletak di wilayah Kecamatan Pesanggaran, Kabupaten Banyuwangi dan Kabupaten Jember, Provinsi Jawa Timur",
        "Gunung Ijen adalah sebuah gunung berapi yang terletak di perbatasan antara Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.386 mdpl dan terletak berdampingan dengan Gunung Merapi. Gunung Ijen terakhir meletus pada tahun 1999. Salah satu fenomena alam yang paling terkenal dari Gunung Ijen adalah blue fire di dalam kawah yang terletak di puncaknya. Pendakian gunung ini bisa dimulai dari dua tempat. Pendaki bisa berangkat dari Banyuwangi ataupun dari Bondowoso.",
        "Pantai Kuta adalah sebuah tempat pariwisata yang terletak kecamatan Kuta, sebelah selatan Kota Denpasar, Bali, Indonesia. Daerah ini merupakan sebuah tujuan wisata turis mancanegara dan telah menjadi objek wisata andalan Pulau Bali sejak awal tahun 1970-an. Pantai Kuta sering pula disebut sebagai pantai matahari terbenam (sunset beach) sebagai lawan dari pantai Sanur. Pantai Kuta terkenal memiliki ombak yang bagus untuk olahraga selancar, terutama bagi pemula.",
        "Terletak sekitar 300 km dari ibu kota Jakarta atau sekitar 140 km dari serang, Ibu Kota Provinsi Banten,Taman Nasional Ujung Kulon memiliki luas total 122.955 hektar yang terdiri dari 78.619 hektar luas daratan dan 44.337 hektar lautan. Taman nasional ini membentang melintasi Semenanjung Ujung Kulon, Pulau Panaitan, Pulau Peucang, pulau Handeleum, dan Pegunungan Honje."
    )

    private val tourismImages = intArrayOf(
        R.drawable.way_kambas,
        R.drawable.pahawang,
        R.drawable.pantai_legian,
        R.drawable.taman_komodo,
        R.drawable.alas_purwo,
        R.drawable.baluran,
        R.drawable.betiri,
        R.drawable.kawah_ijen,
        R.drawable.kuta,
        R.drawable.kulon
    )

    val listData: ArrayList<Tourism>
    get() {
        val list = arrayListOf<Tourism>()
        for (position in tourismNames.indices) {
            val tourism = Tourism()
            tourism.name = tourismNames[position]
            tourism.detail = tourismDetails[position]
            tourism.photo = tourismImages[position]
            list.add(tourism)
        }
        return list
    }
}