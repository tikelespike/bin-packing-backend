package org.boxclub.core;

import java.util.List;

public record PackageRequest(List<Bin> bins, int binLimit, List<Item> items) {
}
