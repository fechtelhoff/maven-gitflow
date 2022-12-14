# Maven GitFlow

Mit diesem Projekt wird gezeigt wie:

- das veraltete Maven Plugin **JGitFlow** und
- das neue Maven Plugin **GitFlow**

arbeiten.

Zum Ausprobieren müssen folgenden befehle auf der Shell (Windows-Nutzer können die GIT-Bash nutzen.) ausgeführt werden:
```bash
# Räumt nicht mehr benötigte Verzeichnisse ab und setzt die Projekt-Version in den POMs zurück auf "1.0-SNAPSHOT"  
./cleanup.sh

# Initialisiert GIT mit einem Main- und einem Develop-Branch
./initGit.sh

# Ausführen von JGitFlow ODER GitFlow

# Führt das alte JGitFlow aus
./runJGitFlow.sh

# Führt das neue GitFlow aus
./runGitFlow.sh
```
Für die Migration eines derzeit mit JGitFlow umgesetzten Projektes muss das neue GitFlow-Plugin aus dem Parent POM entsprechend diesem Beispiel eingebunden werden. 
Dabei sollten die Kommentare `<!-- Set to "true" in real life Project -->` berücksichtigt werden

---
## Links
### JGitFlow
- [JGitFlow-Plugin (Atlassian)](https://bitbucket.org/atlassian/jgit-flow/wiki/Home)
- [Mvn Repository - JGitFlow](https://mvnrepository.com/artifact/external.atlassian.jgitflow/jgitflow-maven-plugin)

- [Git-Flow und das JGit-Flow Plugin für Maven](https://javaeeblog.wordpress.com/2016/09/07/git-flow-und-das-jgit-flow-plugin-fuer-maven/)

### GitFlow
- [GitFlow-Plugin (GitHub)](https://github.com/aleksandr-m/gitflow-maven-plugin)
- [Mvn Repository - GitFlow](https://mvnrepository.com/artifact/com.amashchenko.maven.plugin/gitflow-maven-plugin)

- [How to migrate from jgitflow-maven-plugin to gitflow-maven-plugin](https://wcm-io.atlassian.net/wiki/spaces/WCMIO/pages/1615134721/How+to+migrate+from+jgitflow-maven-plugin+to+gitflow-maven-plugin)

---
## Nützliche Befehle
### Maven Wrapper installieren
Da der Maven-Wrapper nicht mit im GIT-Repository abgelegt wird, muss dieser nach einem "git clone" installiert werden.
```bash
mvn wrapper:wrapper
```

### Umschalten der Maven-Wrapper-Version
```bash
mvn wrapper:wrapper -Dmaven=3.6.0
```

### Ausgabe aller POM-Versionen
```bash
find . -type f -name "pom.xml" -exec echo {} \; -exec head {} \;
```
