package com.idn99.project.matkulti.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.idn99.project.matkulti.R;
import com.idn99.project.matkulti.adapter.SemesterAdapter;
import com.idn99.project.matkulti.model.Data;
import com.idn99.project.matkulti.model.Matkul;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSemester;
    private ArrayList<Data> semester = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSemester = findViewById(R.id.rv_semester);

        addDataSemester();
        SemesterAdapter adapter = new SemesterAdapter(semester, MainActivity.this);
        rvSemester.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvSemester.setAdapter(adapter);
    }

    private void addDataSemester(){
        ArrayList<Matkul> matkuls1 = new ArrayList<>();
        matkuls1.add(new Matkul("Algoritma dan Pemrograman 1","3","Mata kuliah ini merupakan mata kuliah wajib dan mendasar yang bertujuan untuk membekali mahasiswa S1 Teknik Informatika Universitas Pamulang untuk dapat memecahkan persoalan-persoalan yang sederhana menggunakan program berbasis bahasa pemrograman C++."));
        matkuls1.add(new Matkul("Pendidikan Agama","2","Mata kuliah Pendidikan Agama Islam memberikan bekal terbentuknya kepribadian mahasiswa secara utuh (kaffah) dengan menjadikan ajaran Islam sebagai landasan berpikir, bersikap, dan berperilaku dalam pengembangan keilmuan dan profesinya. Kepribadian yang utuh hanya dapat diwujudkan apabila pada diri setiap mahasiswa tertanam iman dan takwa kepada Allah Swt."));
        matkuls1.add(new Matkul("Logika Informatika","3","Logika berasal dari bahasa Yunani, yaitu logos yang artinya kata, ucapan atau alasan. Jadi, logika adalah ilmu untuk berfikir dan menalar dengan benar.\n" +
                "\n" +
                "Ada beberapa istilah yang akan digunakan dalam logika informatika yaitu : Premis (yaitu sebuah pernyataan), Argumen (usaha untuk mencari kebenaran dari premis berupa kesimpulan), Konklusi (Kesimpulan)\n"));
        matkuls1.add(new Matkul("Kalkulus 1", "3", "Kalkulus adalah cabang ilmu matematika yang mencakup limit, turunan, integral, dan deret tak terhingga. Kalkulus adalah ilmu mengenai perubahan, sebagaimana geometri adalah ilmu mengenai bentuk dan aljabar adalah ilmu mengenai pengerjaan untuk memecahkan persamaan serta aplikasinya. "));
        matkuls1.add(new Matkul("Bahasa Inggris 1", "2", "Matakuliah ini membekali mahasiswa dengan keterampilan dan komponen bahasa pada level dasar (pre-intermediate). Matakuliah ini juga memperkenalkan tes terstandarisasi yang memuat latihan keterampilan membaca (reading skills), menyimak (listening comprehension) dan tata bahasa dan kosakata (structure and vocabulary) yang diarahkan untuk persiapan test bahasa Inggris standar internasional."));
        matkuls1.add(new Matkul("Fisika Dasar 1", "2", "fisika adalah ilmu pengetahuan yang mempelajari benda – benda di alam, gejala – gejala kejadian alam serta interaksi dari benda – benda di alam tersebut."));
        matkuls1.add(new Matkul("Pengantar Aplikasi Komputer", "2", "Matakuliah ini membekali mahasiswa untuk dasar-dasar aplikasikomputer dan penerapannya yang meliputi pengenalan sistem operasi"));
        matkuls1.add(new Matkul("Pengantar Teknologi Informasi", "2", "mata kuliah wajib yang bertujuan untuk mengembangkan kemampuan dan kompetensi mahasiswa dalam memahami dan mempelajari tentang ilmu komputer dan perkembangan nya."));
        matkuls1.add(new Matkul("Praktikum Fisika Dasar 1", "1", "Merupakan mata kuliah praktikum untuk fisika."));
        Data s1 = new Data("SEMESTER 1", matkuls1);
        semester.add(s1);

        ArrayList<Matkul> matkuls2 = new ArrayList<>();
        matkuls2.add(new Matkul("Fisika Dasar 2","2","Merupakan kelanjutan dari fisika dasar 1"));
        matkuls2.add(new Matkul("Praktikum Fisika Dasar 2","2","Merupakan praktek untuk apa yg sudah di pelajari di Fisika Dasar 2."));
        matkuls2.add(new Matkul("Kecakapan Antar Personal","2","Merupakan kemampuan berinteraksi dengan orang lain yang meliputi kemampuan berkomunikasi, kemampuan menjalin hubungan antar manusia (human relation), kemampuan memahami dan meningkatkan kepribadian diri dan orang lain, kemampuan berprestasi, kemampuan berdiskusi, kemampuan bernegosiasi, kemampuan mempengaruhi orang lain, kemampuan memotivasi diri dan orang lain."));
        matkuls2.add(new Matkul("Algoritma dan Pemrograman 2", "3", "Merupakan kelanjutan dari Algoritma dan pemrograman 1"));
        matkuls2.add(new Matkul("Komputer dan Masyarakat", "2", "untuk membantu dan mempermudah pengguna atau masyarakat dalam mengerjakan pekerjaaannya baik untuk menyimpan, mengolah dan mengambil kembali data atau informasi yang diperlukan"));
        matkuls2.add(new Matkul("Praktikum Algoritma dan Pemrograman 1", "2", "Mempraktekan apa yg sudah di pelajari di dalam teori algoritma dan pemrograman 2."));
        matkuls2.add(new Matkul("Bahasa Inggris 2", "2", "Lanjutan dari inggris 1"));
        matkuls2.add(new Matkul("Komunikasi Data", "2", "Mata kuliah ini membahas tentang model sistem komunikasi meliputi transmisi data analog maupun digital, macam-macam media transmisi, pengodean data, teknik pengodean data, teknik komunikasidata digital, model jaringan berupa OSI Layer dan TCP / IP."));
        matkuls2.add(new Matkul("Kalkulus 2", "3", "Lanjutan dari kalkulus 1"));
        Data s2 = new Data("SEMESTER 2", matkuls2);
        semester.add(s2);

        ArrayList<Matkul> matkuls3 = new ArrayList<>();
        matkuls3.add(new Matkul("Jaringan Komputer", "3", "Mata Kuliah yang di dalamnya kita di haruskan memhami jaringan jaringan seperti LAN,MAN,WAN,GAN."));
        matkuls3.add(new Matkul("Sistem Operasi", "3",
                "Menjelaskan tentang perangkat lunak sistem yang bertugas untuk melakukan kontrol dan manajemen perangkat keras serta operasi-operasi dasar sistem, termasuk menjalankan software aplikasi seperti program-program pengolah kata dan browser web."));
        matkuls3.add(new Matkul("Sistem Berkas", "2",
                "Mata Kuliah ini menjelaskan tentang cara kerja memori dan urutan urutan memori"));
        matkuls3.add(new Matkul("Struktur Data", "3", "Strukturdata adalah cara menyimpan atau merepresentasikan data didalam komputer agar bisa dipakai secara efisien. Sedangkan data adalah representasi dari fakta dunia nyata. Fakta atau keterangan tentang kenyataan yang disimpan, direkam atau direpresentasikan dalam bentuk tulisan, suara, gambar, sinyal atau simbol."));
        matkuls3.add(new Matkul("Statistik Dasar", "2",
                "Dalam mata kuliah ini kita di haruskan meneliti/riset sebuah data hingga menjadi akurat"));
        matkuls3.add(new Matkul("Bahasa Inggris 3", "2",
                "Lanjutan dari inggris 1 dan 2"));
        matkuls3.add(new Matkul("Matematika Diskrit", "2",
                "Matematika diskrit adalah cabang matematika yang mengkaji objek-objek diskrit. Benda disebut diskrit jika ia terdiri dari sejumlah berhingga elemen yang berbeda atau elemen-elemen yang tidak berkesinambungan. Himpunan bilangan bulat (integer) dipandang sebagai objek diskrit. Lawan kata diskrit adalah kontinyu atau menerus"));
        matkuls3.add(new Matkul("Pendidikan Pancasila", "2",
                "Mata kuliah Pendidikan Pancasila memberikan penjelasan tentang perlunya diberikan perkuliahan Pancasila dari berbagai sudut pandang, beberapa teori asal mula, fungsi dan kedudukan, hubungannya dengan Pembukaan UUD 1945, pemikiran dan pelaksanaan serta reformasi pemikiran dan pelaksanaan Pancasila."));
        matkuls3.add(new Matkul("Aljabar Linear dan Matriks", "2",
                "Aljabar berarti menjumlah, mengurang, mengkali, dan membagi. Sedangkan linier berarti persamaan yang memiliki variabel berpangkat paling tinggi adalah 1. Maka aljabar Linearmerupakan salah satu cabang matematika yang mempelajari matriks, vektor, ruang vektor, transformasi linear dan sistem persamaan linear."));
        Data s3 = new Data("SEMESTER 3", matkuls3);
        semester.add(s3);

        ArrayList<Matkul> matkuls4 = new ArrayList<>();
        matkuls4.add(new Matkul("Praktikum Jaringan Komputer", "2",
                "Merupakan praktek untuk apa yg sudah di pelajari di jaringan komputer."));
        matkuls4.add(new Matkul("Graph Terapan", "2",
                "Graph sering digunakan untuk merepreesntasikan sebuah objek dan hubungannya dengan objek lain"));
        matkuls4.add(new Matkul("Pemrograman 1", "3",
                "Pemrograman mempelajari suatu proses yang meliputi menulis, testing,  memperbaiki, dan memaintenace (memelihara) perintah-perintah (kode/ script) sebuah program komputer."));
        matkuls4.add(new Matkul("Bahasa Indonesia", "2",
                "RINGKASAN MATERI KULIAH B.INDO (ragam bahasa indonesia, karangan, pola kalimat, EYD dan tata bahasa, diksi dan gaya bahasa, pengembangan bahasa, satuan bentuk bahasa, peranan dan fungsi bahasa, asas2 menulis karangan ilmiah dan perencanaan karangan dan paragraf)"));
        matkuls4.add(new Matkul("Praktikum Struktur Data", "2",
                "Mata kuliah praktikum Struktur Data bertujuan untuk mengajarkan kepada mahasiswa mengenai teknik abstraksi data atau struktur data beserta representasinya dengan menggunakan bahasa pemrograman Python, seperti list, linked list, stack, queue, deque, tree, ataupun graph, dan implementasi struktur data tersebut pada berbagai studi kasus"));
        matkuls4.add(new Matkul("Statistik Lanjut", "2",
                "Matakuliah  ini  mempelajari  tentang:  Pengetahuan  Dasar  Statistika,  Penyajian  Data dalam  Bentuk  Tabel,  Penyajian  Data  dalam  Bentuk  Diagram,  Ukuran  Pemusatan, Ukuran Lokasi dan Dispersi, Ukuran Kemiringan dan Keruncingan, Kurva Normal dan Penggunaannya, dan Distribusi Sampling"));
        matkuls4.add(new Matkul("Bahasa Inggris 4", "2",
                "Lanjutan dari inggris 1,2,dan 3"));
        matkuls4.add(new Matkul("Basis Data 1", "1",
                "Pendekatan  basis  data  mengubah  model  penyimpanan  data  yangadapada  pendekatan  flat filedimanadata disimpan di setiap departemen menjadi terkumpul dalam satu basis data yang dapat dipakai secara bersama oleh seluruh pengguna dalam organisasi/perusahaan"));
        Data s4 = new Data("SEMESTER 4", matkuls4);
        semester.add(s4);

        ArrayList<Matkul> matkuls5 = new ArrayList<>();
        matkuls5.add(new Matkul("Anaisa dan Perancangan Sistem", "2",
                "Mempelajari cara menganalisa dan merangcang sebuah sistem"));
        matkuls5.add(new Matkul("Basis Data 2", "3",
                "Melanjutkan basis data 1"));
        matkuls5.add(new Matkul("Pengantar Organisasi dan Bisnis", "2",
                "mengajarkan wirausaha mengenai apa itu dan bagaimana bentuk suatu organisasi dan manajemen perusahaan ."));
        matkuls5.add(new Matkul("Teori Bahasa dan Otomata", "2",
                "Teori bahasa membicarakan bahasa formal (formal languange) , terutama untuk kepentingan perancangan kompilator (compiler) dan pemroses naskah (text processor) .\n" +
                        "Automata adalah mesin abstrak yang dapat mengenali , menerima atau membangkitkan sebuah kalimat dalam bahasa tertentu .\n"));
        matkuls5.add(new Matkul("Teknik Riset dan Operasional", "2",
                "Riset Operasi adalah suatu aplikasi dari berbagai metoda ilmiah untuk tujuan penguraian terhadap masala-masalah yang kompleks yang muncul dalam pengarahan dan pengelolaan dari suatu sistem besar (manusia, mesin-mesin, bahan-bahan, dan uang) dalam bidang perindustrian, bisnis, pemerintahan, dan pertahanan."));
        matkuls5.add(new Matkul("Pemrograman Web 1", "3",
                "Mempelajari pengenalan dasar web"));
        matkuls5.add(new Matkul("Pemrograman 2", "3",
                "Melanjutkan pemrograman 1"));
        matkuls5.add(new Matkul("Metode Peneitian", "2",
                "metode penelitian adalah prosedur atau langkah-langkah sistematis dalam mendapatkan pengetahuan"));
        Data s5 = new Data("SEMESTER 5", matkuls5);
        semester.add(s5);

        ArrayList<Matkul> matkuls6 = new ArrayList<>();
        matkuls6.add(new Matkul("Pemrograman Web 2", "3",
                "Melanjutkan pemrograman web 1"));
        matkuls6.add(new Matkul("Teknik Kompilasi", "2",
                "Mempelajari tentang konsep ilmu komputer pada perilaku komputer yaitu algortima, arsitektur komputer, struktur data maupun penerapan teori bahasa dan automata"));
        matkuls6.add(new Matkul("Kecerdasan Buatan", "3",
                "kecerdasan buatan adalah bagian ilmu komputer yang membuat agar mesin komputer dapat melakukan pekerjaan seperti dan sebaik yang dilakukan manusia."));
        matkuls6.add(new Matkul("Arsitektur dan Organisasi Komputer", "2",
                "Mata kuliah ini merupakan kuliah dasar sebagai bekal para mahasiswa untuk mengetahui lebih dalam mengenai bagaimana arsitektur dan organisasi suatu komputer. Melalui mata kuliah mahasiswa diharapkan dapat mengetahui dan memahami evolusi dan kinerja computer dari generasi 1 sampai dengan 6, struktur interkoneksi komponen computer yang dikenal dengan istilah sistem bus, memori terutama cache, internal dan eksternal memori, modul I/O dan CPU sebagai bagian komponen computer, Operating System Support, Computer arithmetic, memahami lebih dalam mengenai set intruksi seperti fungsi, karakteristik, format dan teknik pengalamatannya"));
        matkuls6.add(new Matkul("Rekayasa Perangkat Lunak", "2",
                "Rekayasa perangkat lunak (RPL) atau Software Engineering atau (SE) adalah satu bidang profesi yang mendalami cara-cara pengembangan perangkat lunak termasuk pembuatan, pemeliharaan, manajemen organisasi pengembanganan perangkat lunak dan manajemen kualitas."));
        matkuls6.add(new Matkul("Komputer Grafik", "2",
                "Mempelajari cara membuat objek 2 dan 3 dimensi mengguakan aplikasi NetBeans"));
        matkuls6.add(new Matkul("Kerja Praktek", "2",
                "Matakuliah yang mengharuskan kita memberi pengenalan dunia IT kepada masyarakat secara berkelompok"));
        matkuls6.add(new Matkul("Mobile Programming", "2",
                "Mempelajari cara mendesain atau membuat suatu aplikasi"));
        Data s6 = new Data("SEMESTER 6", matkuls6);
        semester.add(s6);
    }
}
