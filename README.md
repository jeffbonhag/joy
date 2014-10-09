# joy

A Clojure library designed to ... well, that part is up to you.

## Usage

Generate a pom:

    lein pom

To install the DB2 drivers to your local Maven repository, run:

    mvn install:install-file -DgeneratePom=true -DcreateChecksum=true \
      -Dpackaging=jar -Dfile=db2jcc4.jar -DgroupId=com.ibm.db2.jcc \
      -DartifactId=db2jcc4 -Dversion=4.18.60

    mvn install:install-file -DgeneratePom=true -DcreateChecksum=true \
      -Dpackaging=jar -Dfile=db2jcc_license_cu.jar -DgroupId=com.ibm.db2.jcc \
      -DartifactId=db2jcc_license_cu -Dversion=1.0

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
