package org.boxclub.core;

import java.util.List;

public record PackingRequest(List<Bin> bins, int binLimit, List<Item> items) {
}
