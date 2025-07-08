package Shop.repository;

import Shop.frame.SmRepository;
import Shop.dto.CustDTO;

import java.util.ArrayList;
import java.util.List;

// Cust 객체를 DB에 CRUD 하는 기능을 가진 클래스
public class CustOracleRepository implements SmRepository<CustDTO, String> {
    @Override
    public void insert(CustDTO custDTO) {
        System.out.println("Oracle: Inserted Cust Table");
        System.out.println("Oracle: " + custDTO);
    }

    @Override
    public void update(CustDTO custDTO) {
        System.out.println("Oracle: Updated Cust Table");
        System.out.println("Oracle: " + custDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("Oracle: Deleted Cust Table");
        System.out.println("Oracle: " + s);
    }

    @Override
    public List<CustDTO> selectAll() {
        System.out.println("Oracle: Selected All Cust Table");
        List<CustDTO> custDTOs = new ArrayList<>();
        custDTOs.add(new CustDTO("id01", "pwd01", "이말숙"));
        custDTOs.add(new CustDTO("id02", "pwd02", "김말숙"));
        custDTOs.add(new CustDTO("id03", "pwd03", "홍말숙"));
        return custDTOs;
    }

    @Override
    public CustDTO select(String s) {
        System.out.println("Oracle: Selected Cust Table");
        System.out.println("Oracle: " + s);
        CustDTO cust = new CustDTO(s, "pwd01", "이말숙");
        return cust;
    }
}
