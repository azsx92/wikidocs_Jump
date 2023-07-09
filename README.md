# wikidocs_Jump
## 3-06 회원가입에서 unique가 적용이 안됨

```
   @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;
```