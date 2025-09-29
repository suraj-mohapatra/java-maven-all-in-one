# Welcome to Java Maven All-In-One!

This is a Java Maven project that makes use of popular Maven plugins  

[pom.xml](./pom.xml)  

maven-dependency-plugin → Copy, unpack, analyze, or list dependencies.

maven-resources-plugin → Filter and copy resources with placeholders replaced.

### Testing & Quality

maven-surefire-plugin → Run unit tests.

maven-failsafe-plugin → Run integration tests separately from unit tests.

maven-checkstyle-plugin → Apply coding style checks (configurable with rules).

maven-pmd-plugin → Static code analysis for common bugs.

maven-findbugs-plugin (or SpotBugs) → Bug pattern detector.

jacoco-maven-plugin → Code coverage reports for tests.

pitest-maven → Mutation testing plugin (advanced quality check).

### Reporting & Documentation

maven-site-plugin → Generate a project website with reports.

maven-javadoc-plugin → Generate Javadoc documentation.

maven-project-info-reports-plugin → Standard project info reports (dependencies, license, plugins used).

### Release & Versioning

maven-release-plugin → Automate release process (tagging in VCS, version bumping).

versions-maven-plugin → Check and update dependency/plugin versions.

### Deployment & Distribution

maven-deploy-plugin → Deploy artifacts to remote repos.

maven-install-plugin → Install artifacts into local repo.

wagon-maven-plugin → Transfer files to/from remote locations.

### Code Generation & Processing

maven-antrun-plugin → Run Ant tasks inside Maven.

build-helper-maven-plugin → Add extra source/resource directories, attach artifacts.

antlr4-maven-plugin → Generate parser/lexer code.

protobuf-maven-plugin → Generate Java code from Protobuf definitions.

### Frontend & Polyglot Support

frontend-maven-plugin → Run Node.js, npm, yarn during build.

docker-maven-plugin (e.g. Spotify / Fabric8) → Build and push Docker images.

jib-maven-plugin → Containerize Java apps without a Dockerfile.

### Performance, Checks & Misc

maven-animal-sniffer-plugin → Ensure APIs used are compatible with a given JDK.

maven-dependency-check-plugin → Check for known security vulnerabilities in dependencies (OWASP).

maven-git-commit-id-plugin → Embed Git commit hash/build info into your app.
