package org.jfree.data.statistics;

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
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getQ1Value_247028536193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44497;
     Object enum13;
     Object term44701;

    public DefaultBoxAndWhiskerCategoryDataset_getQ1Value_247028536193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44497 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term44561 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term44497, term44497.getClass(), "data", term44561);
        Class<? extends Object> term45143 = Class.forName((String) "java.lang.invoke.LambdaForm$Kind");
        Field term45142 = ((Class) term45143).getDeclaredField((String) "GENERIC");
        ((Field) term45142).setAccessible(true);
        enum13 = ((Field) term45142).get((Object) null);
        term44701 = newInstance(Class.forName("java.nio.ByteBufferAsIntBufferRB"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = enum13;
        args[1] = term44701;
        try {
            callMethod(klass, "getQ1Value", argTypes, term44497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


