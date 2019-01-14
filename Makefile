default: release mvjar

release:
	@echo "--> Building..."
	@mkdir -p bin/
	@mvn clean package -DskipTests=true -Dmaven.javadoc.skip=true -B -V

clean:
	@echo "--> Cleaning..."
	@mvn clean
	@rm -f bin/*
mvjar:
	@cp service-wx/target/*.jar ./bin
	@cp service-client/target/*.jar ./bin
	@cp service-gateway/target/*.jar ./bin