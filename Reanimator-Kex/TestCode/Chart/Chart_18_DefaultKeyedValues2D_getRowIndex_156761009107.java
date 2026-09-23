package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DefaultKeyedValues2D_getRowIndex_156761009107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19019;
     Object enum7;

    public DefaultKeyedValues2D_getRowIndex_156761009107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19019 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setBooleanField(term19019, term19019.getClass(), "sortRowKeys", true);
        Class<? extends Object> term19630 = Class.forName((String) "java.util.Comparators$NaturalOrderComparator");
        Field term19629 = ((Class) term19630).getDeclaredField((String) "INSTANCE");
        ((Field) term19629).setAccessible(true);
        enum7 = ((Field) term19629).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = enum7;
        try {
            callMethod(klass, "getRowIndex", argTypes, term19019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


