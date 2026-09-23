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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_iterator_1586330480149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33819;

    public MultiValueMap_iterator_1586330480149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33819 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term33921 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term34023 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term34125 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term34023, term34023.getClass(), "map", term34125);
        setField(term33921, term33921.getClass(), "map", term34023);
        setField(term33819, term33819.getClass(), "map", term33921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "iterator", argTypes, term33819, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


