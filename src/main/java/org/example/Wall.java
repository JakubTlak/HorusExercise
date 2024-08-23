package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure{
    private List<Block> blocks;
    private CompositeBlock compositeBlock;
    @Override
    public Optional<Block> findBlockByColor(String color) {
        return compositeBlock.getBlocks().stream().filter(b->b.getColor() == color).findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return compositeBlock.getBlocks().stream().filter(b->b.getMaterial() == material).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return (int)blocks.stream().count();
    }
}
