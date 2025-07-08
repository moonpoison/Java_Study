package Shop.service;

import Shop.frame.SmRepository;
import Shop.frame.SmService;
import Shop.dto.CustDTO;
import Shop.repository.CustMySQLRepository;

import java.util.List;

public class CustService implements SmService<CustDTO, String> {
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
        System.out.println("CustService: 기본정보 수정");
        smRepository.update(custDTO);
        System.out.println("CustService: SMS 전송");
        System.out.println("CustService: 회원정보 수정 완료");
    }

    @Override
    public void remove(String s) {
        System.out.println("CustService: 기본정보 삭제");
        smRepository.delete(s);
        System.out.println("CustService: SMS 전송");
        System.out.println("CustService: 회원정보 삭제 완료");
    }

    @Override
    public List<CustDTO> get() {
        List<CustDTO> custs = null;
        custs = smRepository.selectAll();
        return custs;
    }

    @Override
    public CustDTO get(String s) {
        CustDTO cust = null;
        cust = smRepository.select(s);
        return cust;
    }
}
