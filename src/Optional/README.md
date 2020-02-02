## Optional 타입이란?
- Java8부터 추가
- Optional 은 다른 객체를 참조하고 있는 Wrapper
- 메소드 결과값이 `없음` 을 명확하게 표현할 수 있을 필요가 있고, null을 반환하면 에러를 발생시킬 가능성이 높을 상황에서 반환 타입을 Optional로 지정

### Optional 객체 생성하기

1. 빈 Optional 객체 생성한다: Optional.empty()
2. value값이 null이 아닌 경우에 사용한다: Optional.of(value) 
3. value값이 null인지 아닌지 확실하지 않은 경우에 사용한다: Optional.ofNullable(value) 

### Optional 객체 확인하기
1. 

### Optional 객체에서 값 가져오기
1. orElse
2. orElseGet