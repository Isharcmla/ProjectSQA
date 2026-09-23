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

public class DefaultKeyedValues_getValue_192649666168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8221;
     Object enum3;

    public DefaultKeyedValues_getValue_192649666168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8221 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        Class<? extends Object> term9379 = Class.forName((String) "java.util.stream.StreamOpFlag$Type");
        Field term9378 = ((Class) term9379).getDeclaredField((String) "SPLITERATOR");
        ((Field) term9378).setAccessible(true);
        enum3 = ((Field) term9378).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = enum3;
        try {
            callMethod(klass, "getValue", argTypes, term8221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


