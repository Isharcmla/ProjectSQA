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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ToStringStyle_appendDetail_39588682148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2598;
     Object term2642;

    public ToStringStyle_appendDetail_39588682148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2598 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2611 = (byte[]) newByteArray(16);
        setField(term2598, term2598.getClass(), "toStringCache", "eqJfYWRaEL");
        setField(term2598, term2598.getClass(), "value", term2611);
        setByteField(term2598, term2598.getClass(), "coder", (byte) -119);
        setIntField(term2598, term2598.getClass(), "count", -1087774327);
        term2642 = (long[]) newLongArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2598;
        args[1] = "fhkbdRViHi";
        args[2] = term2642;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


