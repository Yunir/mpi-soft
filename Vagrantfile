Vagrant.configure("2") do |config|
    config.vm.box = "ubuntu/trusty64"

    config.vm.provider "virtualbox" do |v|
        v.name = "web-service-technologies"
        v.cpus = 2
        v.memory = 1024
    end

    # PostgreSQL configuration
    # Learn more: https://github.com/jackdb/pg-app-dev-vm
    config.vm.provision :shell, :path => "provisioning/scripts/postgresql.sh"
    config.vm.network :forwarded_port, guest: 5432, host: 15432

end