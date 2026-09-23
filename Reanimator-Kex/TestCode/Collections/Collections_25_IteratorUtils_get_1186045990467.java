package org.apache.commons.collections4;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Set;

public class IteratorUtils_get_1186045990467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81553;
     Object term81879;
     Object term81866;

    public IteratorUtils_get_1186045990467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81703 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term81613 = new LinkedHashMap();
        ((LinkedHashMap) term81613).put(term81703, term81703);
        ((LinkedHashMap) term81613).put(term81703, term81703);
        ((LinkedHashMap) term81613).put(term81703, term81703);
        ((LinkedHashMap) term81613).put(term81703, term81703);
        ((LinkedHashMap) term81613).put(term81703, term81703);
        ((LinkedHashMap) term81613).put(term81703, term81703);
        ((LinkedHashMap) term81613).put(term81703, term81703);
        ((LinkedHashMap) term81613).put(term81703, term81703);
        ((LinkedHashMap) term81613).put(term81703, term81703);
        Set<Object> term81553_OuterSet = ((LinkedHashMap) term81613).keySet();
        term81553 = ((Set) term81553_OuterSet).iterator();
        LinkedHashMap term81880 = new LinkedHashMap();
        term81879 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedKeyIterator"));
        Object term81881 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term81882 = newInstance(Class.forName("java.lang.Object"));
        setField(term81879, term81879.getClass(), "this$0", term81880);
        setField(term81879, term81879.getClass(), "next", null);
        setField(term81881, term81881.getClass(), "before", null);
        setField(term81881, term81881.getClass(), "after", null);
        setIntField(term81881, term81881.getClass(), "hash", 1788295805);
        setField(term81881, term81881.getClass(), "key", term81882);
        setField(term81881, term81881.getClass(), "value", term81882);
        setField(term81881, term81881.getClass(), "next", null);
        setField(term81879, term81879.getClass(), "current", term81881);
        setIntField(term81879, term81879.getClass(), "expectedModCount", 1);
        term81866 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term81553;
        args[1] = 0;
        Object retValue = callMethod(klass, "get", argTypes, null, args);
        assertTrue(recursiveEquals(term81553, 0));
        assertTrue(recursiveEquals(retValue, term81866));
    }

};


