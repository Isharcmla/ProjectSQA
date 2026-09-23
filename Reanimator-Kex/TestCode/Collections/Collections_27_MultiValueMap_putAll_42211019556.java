package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.map.EqualityUtils.*;
import java.util.HashMap;

public class MultiValueMap_putAll_42211019556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8306;
     Object term8354;
     Object term8837;
     Object term8838;

    public MultiValueMap_putAll_42211019556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8306 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        term8354 = new HashMap();
        term8837 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term8837, term8837.getClass(), "collectionFactory", null);
        setField(term8837, term8837.getClass(), "valuesView", null);
        setField(term8837, term8837.getClass(), "map", null);
        term8838 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term8354;
        callMethod(klass, "putAll", argTypes, term8306, args);
        assertTrue(recursiveEquals(term8306, term8837));
        assertTrue(recursiveEquals(term8354, term8838));
    }

};


