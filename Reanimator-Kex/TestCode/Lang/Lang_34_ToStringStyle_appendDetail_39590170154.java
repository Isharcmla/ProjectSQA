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

public class ToStringStyle_appendDetail_39590170154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3148;
     Object term3192;

    public ToStringStyle_appendDetail_39590170154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3148 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3161 = (byte[]) newByteArray(16);
        setField(term3148, term3148.getClass(), "toStringCache", "MAcUBcBckh");
        setField(term3148, term3148.getClass(), "value", term3161);
        setByteField(term3148, term3148.getClass(), "coder", (byte) 99);
        setIntField(term3148, term3148.getClass(), "count", 1328271830);
        term3192 = (short[]) newShortArray(7);
        setShortElement(term3192, 0, (short) 31942);
        setShortElement(term3192, 1, (short) 30947);
        setShortElement(term3192, 2, (short) 27594);
        setShortElement(term3192, 3, (short) 7670);
        setShortElement(term3192, 4, (short) -26033);
        setShortElement(term3192, 5, (short) 8329);
        setShortElement(term3192, 6, (short) 31422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3148;
        args[1] = "oVgzLbrsFr";
        args[2] = term3192;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


