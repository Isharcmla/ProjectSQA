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
import org.apache.commons.collections.FunctorException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MultiValueMap_createCollection_1754308673154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31904;

    public MultiValueMap_createCollection_1754308673154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32078 = Class.forName((String) "java.util.FormattableFlags");
        term31904 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term32042 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$ReflectionFactory"));
        setField(term32042, term32042.getClass(), "clazz", term32078);
        setField(term31904, term31904.getClass(), "collectionFactory", term32042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term31904, args);
            assertTrue(false);
        }
        catch (FunctorException e) {
        }

    }

};


