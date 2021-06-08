# TreeSet

- 컬랙션 프레임워크 중 하나
- HashSet과 마찬가지로 Set 인터페이스를 구현한 클래스

- 객체 중복 저장 불가, 저장 순서가 유지되지 않는다 (Set의 성질)
- 이진 탐색 트리 구조로 이루어져있어 HashSet보다 데이터의 추가와 삭제는 시간이 더 걸리지만, 검색과 정렬에 유리
- java.utill.TreeSet 을 import하여 사용



### TreeSet선언

```
TreeSet<Integer> set1 = new TreeSet<Integer>(); //TreeSet 객체 생성
TreeSet<Integer> set2 = new TreeSet<>(); // 타입 파라미터 생략가능
TreeSet<Integer> set3 = new TreeSet<Integer>(Arrays.asList(4,2,3));//초기값 지정
```

저장할 객체 타입을 파라미터로 표기하고 기본 생성자를 호출

생성하는 명령어는 HashSet과 크게 다르지 않으나 선언 시 초기값 지정은 가능하나, __크기를 지정하는 것은 불가능__



### TreeSet 값 추가

```
TreeSet<Integer> set = new TreeSet<Integer>(); //TreeSet 객체 생성
set.add(7); //값추가
set.add(4);
```

TreeSet 값 추가 : __add(value)__ 메소드를 사용하여 추가

입력되는 값이 TreeSet 내부에 __값이 존재하지 않는다면, 그 값을 추가하고 true를 반환__하고 내부에 __값이 존재하면 false를 반환__



### TreeSet 값 삭제

```
set.remove(1);//값 1 제거
set.clear();//모든 값 제거
```

TreeSet 값 삭제 :  __remove(value)__ 메소드를 사용하여 삭제

TreeSet 모든 값 삭제 :  __clear()__ 메소드를 사용하여 전체 삭제

__매개변수의 값이 존재하면, 그 값을 삭제 후 true를 반환 없으면 false를 반환__

 

### TreeSet 크기 구하기

```
TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
System.out.println(set.size());//크기 : 3
```

TreeSet 객체의 크기 : __size()__ 메소드를 통해 객체의 크기를 구할 수 있다

 

### TreeSet 값 출력

```
TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(4,2,3));//초기값 지정

System.out.println(set); //전체출력 [2,3,4]
System.out.println(set.first());//최소값 출력
System.out.println(set.last());//최대값 출력
System.out.println(set.higher(3));//입력값보다 큰 데이터중 최소값 출력 없으면 null
System.out.println(set.lower(3));//입력값보다 작은 데이터중 최대값 출력 없으면 null
		
Iterator iter = set.iterator();	// Iterator 사용
while(iter.hasNext()) {//값이 있으면 true 없으면 false
    System.out.println(iter.next());
}
```

TreeSet 전체 값 출력 : 그냥 pirnt하게 되면 대괄호 []로 묶어서 전체 값이 출력

TreeSet 최솟값 출력 : __first()__ 메서드를 통해 최솟값 출력

TreeSet 최댓값 출력 : __last()__ 메서드를 통해 최댓값 출력

TreeSet 입력값보다 큰 데이터중 최솟값 : __higher(value)__ 메서드를 통해 입력값보다 큰 데이터중 최솟값 출력

TreeSet 입력값보다 작은 데이터중 최댓값 : __lower(value)__ 메서드를 통해 입력값보다 작은 데이터중 최댓값 출력

reeSet : 객체 전체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공한다. 

​			  iterator() 메서드를 호출하면 얻을 수 있다 

>  iterator에서 하나의 객체를 가져올 때에는 next() 메서드를 사용

hasNext() 메서드는 가져올 __객체가 있으면 true__ , __없으면 false__를 리턴