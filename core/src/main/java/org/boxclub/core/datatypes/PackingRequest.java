package org.boxclub.core.datatypes;

import java.util.List;

public record PackingRequest(List<Bin> bins, int binLimit, List<Item> items) {
}
