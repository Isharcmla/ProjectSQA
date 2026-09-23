package org.apache.commons.lang3.builder;

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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class HashCodeBuilder_append_62694370489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10691;
     Object term10265;

    public HashCodeBuilder_append_62694370489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10691 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term10691, term10691.getClass(), "iTotal", 0);
        setIntField(term10691, term10691.getClass(), "iConstant", 0);
        Class<? extends Object> term10709 = Class.forName((String) "java.util.concurrent.ForkJoinPool$1");
        term10265 = (Object[]) newArray("java.lang.Object", 4);
        Object term10760 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        Object term10779 = newInstance(Class.forName("java.lang.Object"));
        Object term10929 = newInstance(Class.forName("java.util.concurrent.Executors$PrivilegedCallableUsingCurrentClassLoader"));
        setElement(term10265, 0, term10709);
        setElement(term10265, 1, term10760);
        setElement(term10265, 2, term10779);
        setElement(term10265, 3, term10929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10265;
        try {
            callMethod(klass, "append", argTypes, term10691, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


