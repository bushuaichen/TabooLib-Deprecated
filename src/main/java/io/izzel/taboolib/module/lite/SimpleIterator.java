package io.izzel.taboolib.module.lite;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

/**
 * @Author sky
 * @Since 2018-10-01 16:19
 * @replaceTo Indexed
 */
@Deprecated
public class SimpleIterator {

    private final Object container;

    public SimpleIterator(Object container) {
        this.container = container;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public List<Map.Entry<Object, Object>> mapIterator(int start, int end) {
        List<Map.Entry<Object, Object>> iterator = Lists.newArrayList();
        Map container = (Map) this.container;
        int loop = 0;
        for (Object entry : container.entrySet()) {
            if (loop++ >= start) {
                if (loop <= end) {
                    iterator.add((Map.Entry) entry);
                } else {
                    break;
                }
            }
        }
        return iterator;
    }

    public List<Object> listIterator(int start, int end) {
        List<Object> iterator = Lists.newArrayList();
        List<?> container = (List<?>) this.container;
        int loop = 0;
        for (Object entry : container) {
            if (loop++ >= start) {
                if (loop <= end) {
                    iterator.add(entry);
                } else {
                    break;
                }
            }
        }
        return iterator;
    }
}
