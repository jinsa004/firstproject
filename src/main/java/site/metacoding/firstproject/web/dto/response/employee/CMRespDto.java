package site.metacoding.firstproject.web.dto.response.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class CMRespDto<T> {
    private Integer code; // 1정상, -1실패
    private String msg; // 실패의 이유, 성공한 이유
    private T data; // 응답할 데이터 object로 데이터 반환시 다운캐스팅이 필요하기 때문에 제네릭 사용
}
