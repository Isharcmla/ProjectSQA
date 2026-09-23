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
import java.lang.String;

public class MultiValueMap_createCollection_1754308673134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29097;

    public MultiValueMap_createCollection_1754308673134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30135 = Class.forName((String) "java.util.stream.ReduceOps$13ReducingSink");
        Class<? extends Object> term30359 = Class.forName((String) "java.util.stream.ReduceOps$13ReducingSink");
        Object[] term30360 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term30360, 0, term30359);
        Method term29313 = ((Class) term30135).getDeclaredMethod((String) "combine", (Class[]) term30360);
        ((Method) term29313).setAccessible(false);
        term29097 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term29259 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory"));
        setField(term29259, term29259.getClass(), "iCloneMethod", term29313);
        setField(term29097, term29097.getClass(), "collectionFactory", term29259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term29097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


