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

public class MultiValueMap_getCollection_2049933466152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30953;

    public MultiValueMap_getCollection_2049933466152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30953 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term31055 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term31157 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term31259 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term31157, term31157.getClass(), "map", term31259);
        setField(term31055, term31055.getClass(), "map", term31157);
        setField(term30953, term30953.getClass(), "map", term31055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getCollection", argTypes, term30953, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


