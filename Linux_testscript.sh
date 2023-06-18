#!/bin/bash
 
echo "your name is: root"
echo "your working directory is:bin "
echo "done"
localhost:~# ls -l
total 32
-rw-r--r--    1 root     root             0 Jun 15 21:28 a
-rw-r--r--    1 root     root             0 Jun 15 21:28 b
-rw-r--r--    1 root     root           114 Jul  5  2020 bench.py
-rw-r--r--    1 root     root             0 Jun 15 21:28 c
-rw-r--r--    1 root     root             0 Jun 15 21:28 d
-rw-r--r--    1 root     root             0 Jun 15 21:28 e
-rw-r--r--    1 root     root             0 Jun 15 21:28 f
-rw-r--r--    1 root     root             0 Jun 15 21:28 g
-rw-r--r--    1 root     root             0 Jun 15 21:28 h
-rw-r--r--    1 root     root            76 Jul  3  2020 hello.c
-rw-r--r--    1 root     root            22 Jun 26  2020 hello.js
-rw-r--r--    1 root     root           151 Jul  5  2020 readme.txt
-rwxr--r--    1 root     root            72 Jun 18 17:13 script.sh
-rwxr--r--    1 root     root            36 Jun 15 21:03 test.sh
-rw-r--r--    1 root     root            89 Jun 18 19:19 testscript1.sh
-rw-r--r--    1 root     root             1 Jun 15 20:35 y
localhost:~# ./testscript1.sh
your name is: root
your working directory is:bin
done
localhost:~# chmod g-r testscript1.sh
localhost:~# ls -l
total 32
-rw-r--r--    1 root     root             0 Jun 15 21:28 a
-rw-r--r--    1 root     root             0 Jun 15 21:28 b
-rw-r--r--    1 root     root           114 Jul  5  2020 bench.py
-rw-r--r--    1 root     root             0 Jun 15 21:28 c
-rw-r--r--    1 root     root             0 Jun 15 21:28 d
-rw-r--r--    1 root     root             0 Jun 15 21:28 e
-rw-r--r--    1 root     root             0 Jun 15 21:28 f
-rw-r--r--    1 root     root             0 Jun 15 21:28 g
-rw-r--r--    1 root     root             0 Jun 15 21:28 h
-rw-r--r--    1 root     root            76 Jul  3  2020 hello.c
-rw-r--r--    1 root     root            22 Jun 26  2020 hello.js
-rw-r--r--    1 root     root           151 Jul  5  2020 readme.txt
-rwxr--r--    1 root     root            72 Jun 18 17:13 script.sh
-rwxr--r--    1 root     root            36 Jun 15 21:03 test.sh
-rwx---r--    1 root     root            89 Jun 18 19:19 testscript1.sh
-rw-r--r--    1 root     root             1 Jun 15 20:35 y
localhost:~# mv testscript1.sh /bin/azamat
localhost:~# ls
a           c           f           hello.c     script.sh
b           d           g           hello.js    test.sh
bench.py    e           h           readme.txt  y
localhost:~# azamat
sh: azamat: Permission denied
localhost:~# ls -l
total 28
-rw-r--r--    1 root     root             0 Jun 15 21:28 a
-rw-r--r--    1 root     root             0 Jun 15 21:28 b
-rw-r--r--    1 root     root           114 Jul  5  2020 bench.py
-rw-r--r--    1 root     root             0 Jun 15 21:28 c
-rw-r--r--    1 root     root             0 Jun 15 21:28 d
-rw-r--r--    1 root     root             0 Jun 15 21:28 e
-rw-r--r--    1 root     root             0 Jun 15 21:28 f
-rw-r--r--    1 root     root             0 Jun 15 21:28 g
-rw-r--r--    1 root     root             0 Jun 15 21:28 h
-rw-r--r--    1 root     root            76 Jul  3  2020 hello.c
-rw-r--r--    1 root     root            22 Jun 26  2020 hello.js
-rw-r--r--    1 root     root           151 Jul  5  2020 readme.txt
-rwxr--r--    1 root     root            72 Jun 18 17:13 script.sh
-rwxr--r--    1 root     root            36 Jun 15 21:03 test.sh
-rw-r--r--    1 root     root             1 Jun 15 20:35 y
