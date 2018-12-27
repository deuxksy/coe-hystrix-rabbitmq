# Turbine With AMQP
> Rabbitmq를 이용하여 turbine에 스트림을 집계하는 샘플 프로젝트

클러스터를 통해 hystrix 스트림의 정보를 집계하는 방법은 turbine을 사용하면 가능하였다.
하지만 이러한 집계(aggregation) 방법은 pull-based 방식이기 때문에 turbine 인스턴스가 각 인스턴스에게 스트림을 요청하게 된다. 이러한 방식은 인스턴스가 늘어날 때 마다 turbine에게 부담을 주게 된다. 그리고 일부 환경(ex: PaaS)에서는 모든 분산 Hystrix command를 가져오는 turbine이 작동하지 않을 때도 존재한다.

이러한 문제점을 해결하기 위해서 Spring Cloud Turbine AMQP가 제공 되며, 각 어플리케이션 인스턴스가 직접 중앙 RabbitMQ 브로커에게 정보를 제공하며 이러한 정보를 받은 RabbitMQ가 turbine으로 메트릭 정보를 푸시(push-based)하게 된다.

## Getting started

- 위에서 작성한 어플리케이션을 실행 한 이후 http://localhost:9999/hystrix 로 접속한다.

- dashboard 화면이 나오면 turbine의 스트림 주소(http://localhost:12121/turbine.stream)를 입력한다.

- hystrixcommand를 실행하기 위해서 (http://localhost:10001/)을 브라우저 또는 터미널에서 실행한다.

- dashboard에서 Circuit이 변경되는 것을 확인한다.

- rabbitmq management 화면(http://localhost:15672)에서 guest/guest로 로그인하여 exchange와 queue가 존재하는지 확인한다.


## Related Links

- [MSA CoE Guide](https://coe.gitbook.io/guide/circuit-breaker/turbine-with-rabbitmq)