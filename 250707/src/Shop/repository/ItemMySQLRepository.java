package Shop.repository;

import Shop.frame.SmRepository;
import Shop.dto.ItemDTO;

import java.util.ArrayList;
import java.util.List;

// Item 객체를 DB에 CRUD 하는 기능을 가진 클래스
public class ItemMySQLRepository implements SmRepository<ItemDTO, Integer> {
    @Override
    public void insert(ItemDTO custDTO) {
        System.out.println("MySQL: Inserted Item Table");
        System.out.println("MySQL: " + custDTO);
    }

    @Override
    public void update(ItemDTO custDTO) {
        System.out.println("MySQL: Updated Item Table");
        System.out.println("MySQL: " + custDTO);
    }

    @Override
    public void delete(Integer I) {
        System.out.println("MySQL: Deleted Item Table");
        System.out.println("MySQL: " + I);
    }

    @Override
    public List<ItemDTO> selectAll() {
        System.out.println("MySQL: Selected All Item Table");
        List<ItemDTO> ItemDTOs = new ArrayList<>();
        ItemDTOs.add(new ItemDTO(1, "aaa", 10000));
        ItemDTOs.add(new ItemDTO(2, "bbb", 20000));
        ItemDTOs.add(new ItemDTO(3, "ccc", 30000));
        return ItemDTOs;
    }

    @Override
    public ItemDTO select(Integer I) {
        System.out.println("MySQL: Selected Item Table");
        System.out.println("MySQL: " + I);
        ItemDTO Item = new ItemDTO(I, "aaa", 10000);
        return Item;
    }
}
