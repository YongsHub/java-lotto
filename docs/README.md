## 기능 목록
- [x] 숫자 1 ~ 45까지 중복되지 않는 6개의 로또 번호 List 만들기
- [x] 로또 구입 금액을 입력하는 기능
- [x] 로또 구입 금액이 1000원으로 나누어 떨이지지 않으면 예외 처리 기능([ERROR]로 시작)
  - [x] LottoService 클래스를 이용한다.
  - [x] 숫자인지 아닌지 검증하는 기능

```Java
    //1 ~ 45까지 6개의 로또 번호 List Method
    public List<Integer> createDuplicateNumbers(){};

    //로또 구입 금액을 입력하는 메서드
    public String inputMoney() { return Console.readLine(); }

    //로또 구입 금액 0 이면 예외 발생
    public void validateMoneyZero(int money) { }

    //로또 구입 금액이 1000원으로 나누어 떨어지지 않으면 예외 발생
    public void validateMoney(int money) { }
```
- [x] 로또 번호 중복 여부 검사 기능
- [x] 로또 번호 길이 검사 기능
- [x] 발행한 로또 수량 및 번호를 출력하는 기능
  - [x] 일급 컬렉션을 위한 Lottos Class 생성
  - [x] 금액에 맞게 로또 발급하는 기능
  - [x] Lottos의 각 Lotto 오름차순 정렬하기 기능
  - [x] Lottos의 Lotto 개수 return 기능
```Java
    //로또마다 번호가 길이가 6인지 검사 기능
    private void validateLength(){}

    //로또 번호 중복 여부 검사 기능
    private void validateOverlap(){}

    //발행한 로또 번호 정렬 기능
    private void sortByAscending(){}

    //금액에 맞게 로또 발급하는 기능
    public List<Lotto> publishLotto(){}
```
- [ ] 당첨 번호 추첨 6개 입력받는 기능
- [ ] 보너스 번호 입력 받는 기능
- [ ] 당첨 기준에 따라 금액을 지급하기
  - [ ] 6개 번호 일치 시 2,000,000,000원
  - [ ] 5개  번호 + 보너스 번호 일치 시 30,000,000원
  - [ ] 5개 번호 일치 1,500,000원
  - [ ] 4개 번호 일치 50,000원
  - [ ] 3개 번호 일치 5000원
- [ ] 사용자가 구매한 로또 번호와 당첨 번호를 비교하는 기능
- [ ] 당첨 내역과 수익률을 출력하는 기능 (출력 시 소수점 둘째 자리에서 반올림)
- [ ] 종료하는 기능