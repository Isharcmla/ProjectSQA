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

public class MultiValueMap_iterator_1586330480107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21983;

    public MultiValueMap_iterator_1586330480107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21983 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term22085 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term22187 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term22085, term22085.getClass(), "map", term22187);
        setField(term21983, term21983.getClass(), "map", term22085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "iterator", argTypes, term21983, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


