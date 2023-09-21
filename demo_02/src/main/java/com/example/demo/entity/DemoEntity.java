package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //일반적으로 pk는 Long id를 잡으라고 한다 클래스 잡을때는 래퍼클래스 잡는 이유는
    //프리미티브 타입으로 잡으면 기본값으로 0을잡음 하지만 래퍼타ㅣㅂ으로 잡으면 기본값을 null
    //0과 null은 다르다. 혹시라도 생길 수 있는 null체크가 안되서 있는것으로 인식해서 화면으로 넘어가 다른결과
    //방지하기 위해 null체크가 되게끔
    private Long id;
    @Column
    //일반칼럼
    private String name;

}
