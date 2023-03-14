package com.fudy.shop.infrastructure.db.convertor;

import com.fudy.shop.domain.item.ItemAttribute;
import com.fudy.shop.domain.item.ItemImage;
import com.fudy.shop.domain.item.ItemSkuSpec;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ItemMapper {
    public ItemAttribute toItemAttribute(Map<String, List<Object>> map) {
        ItemAttribute attribute = new ItemAttribute();
        attribute.setMap(map);
        return attribute;
    }

    public Map<String, List<Object>> toMap(ItemAttribute itemAttribute) {
        if (null == itemAttribute) {
            return null;
        }
        return itemAttribute.getMap();
    }

    public ItemSkuSpec toItemSkuSpec(Map<String, Object> spec) {
        return new ItemSkuSpec(spec);
    }

    public Map<String, Object> toSpecMap(ItemSkuSpec spec) {
        if (null == spec) {
            return null;
        }
        return spec.getSpec();
    }

    public ItemImage toItemImage(String image) {
        return new ItemImage(image);
    }

    public String toItemImageStr(ItemImage itemImage) {
        if (null == itemImage) {
            return null;
        }
        return itemImage.getImage();
    }

}
