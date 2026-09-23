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

public class MultiValueMap_totalSize_1162939722122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27637;
     Object term27962;

    public MultiValueMap_totalSize_1162939722122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27685 = new HashMap();
        term27637 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term27637, term27637.getClass(), "map", term27685);
        HashMap term27963 = new HashMap();
        term27962 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term27962, term27962.getClass(), "collectionFactory", null);
        setField(term27962, term27962.getClass(), "values", null);
        setField(term27962, term27962.getClass(), "map", term27963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "totalSize", argTypes, term27637, args);
        assertTrue(recursiveEquals(term27637, term27962));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


