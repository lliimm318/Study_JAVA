# Getter & Setter



### 사용이유

- 객체 외부에서 직접적으로 접근하는 것을 막음 (객체의 무결성 지키기)
  - 문제를 해결하기 위해 메소드를 통해 데이터를 변경하는 방법을 선호
  - 데이터는 외부에서 접근할 수 없도록 막음
  - 메소드는 공개해서 외부 메소드를 통해 데이터 접근 유도



### Setter

- 메소드는 매개값을 검증해서 유효한 값만 데이터로 저장

  public void setSpeed(double speed) {

  ​	if(speed < 0 ){

  ​	this.speed = 0;        //매개값이 음수인 경우 speed에 0으로 저장후 메소드 종료

  ​	return;

  

  ​	} else {

  ​	this.speed = speed;

  ​	}
  
  }



### Getter

- 외부에서 객체의 데이터를 읽을 때 메소드 사용 좋음
- 객체 외부에서 객체의 필드값을 사용하기 부적절할 때 사용
- 만약 필드값이 읽기 전용인 경우 Getter만 사용해도 좋다 또는 private로 접근 제한을 갖도록 선언한다

- 메소드로 필드 값을 가공 → 외부로 전달

  public double getSpeed(){

  double km = speed * 1.6;

  return km;         // 필드값인 마일을 환산 후 외부로 리턴

  }

