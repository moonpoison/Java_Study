package Shop;

import java.util.List;

public class CustService implements SmService<CustDTO, String>{
    SmRepository<CustDTO, String> smRepository;
    public CustService(){
        this.smRepository = new CustMySQLRepository();
    }

    @Override
    public void register(CustDTO custDTO) {
        System.out.println("CustService: 기본정보 저장");
        smRepository.insert(custDTO);
        System.out.println("CustService: SMS 전송");
        System.out.println("CustService: EMAIL 전송");
        System.out.println("CustService: 회원가입 완료");
    }

    @Override
    public void modify(CustDTO custDTO) {

    }

    @Override
    public void remove(String s) {

    }

    @Override
    public List<CustDTO> get() {
        return List.of();
    }

    @Override
    public CustDTO get(String s) {
        return null;
    }
}
