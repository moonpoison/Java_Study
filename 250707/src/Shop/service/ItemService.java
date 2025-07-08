package Shop.service;

import Shop.frame.SmRepository;
import Shop.frame.SmService;
import Shop.dto.ItemDTO;
import Shop.repository.ItemMySQLRepository;

import java.util.List;

public class ItemService implements SmService<ItemDTO, Integer> {
    SmRepository<ItemDTO, Integer> smRepository;
    public ItemService(){
        this.smRepository = new ItemMySQLRepository();
    }

    @Override
    public void register(ItemDTO itemDTO) {
        System.out.println("ItemService: 기본정보 저장");
        smRepository.insert(itemDTO);
        System.out.println("ItemService: SMS 전송");
        System.out.println("ItemService: EMAIL 전송");
        System.out.println("ItemService: 회원가입 완료");
    }

    @Override
    public void modify(ItemDTO itemDTO) {
        System.out.println("ItemService: 기본정보 수정");
        smRepository.update(itemDTO);
        System.out.println("ItemService: SMS 전송");
        System.out.println("ItemService: 물품정보 수정 완료");
    }

    @Override
    public void remove(Integer I) {
        System.out.println("ItemService: 기본정보 삭제");
        smRepository.delete(I);
        System.out.println("ItemService: SMS 전송");
        System.out.println("ItemService: 물품정보 삭제 완료");
    }

    @Override
    public List<ItemDTO> get() {
        List<ItemDTO> custs = null;
        custs = smRepository.selectAll();
        return custs;
    }

    @Override
    public ItemDTO get(Integer I) {
        ItemDTO cust = null;
        cust = smRepository.select(I);
        return cust;
    }
}
