package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.util.HashMap;

public class MultiValueMap_totalSize_1162939722124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26540;
     Object term27144;

    public MultiValueMap_totalSize_1162939722124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26588 = new HashMap();
        term26540 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term26540, term26540.getClass(), "map", term26588);
        HashMap term27145 = new HashMap();
        term27144 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term27144, term27144.getClass(), "collectionFactory", null);
        setField(term27144, term27144.getClass(), "valuesView", null);
        setField(term27144, term27144.getClass(), "map", term27145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "totalSize", argTypes, term26540, args);
        assertTrue(recursiveEquals(term26540, term27144));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


