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

public class ToStringStyle_appendSummary_1193421007158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3490;
     Object term3534;

    public ToStringStyle_appendSummary_1193421007158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3490 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3503 = (byte[]) newByteArray(16);
        setField(term3490, term3490.getClass(), "toStringCache", "bWWfajKbEX");
        setField(term3490, term3490.getClass(), "value", term3503);
        setByteField(term3490, term3490.getClass(), "coder", (byte) 93);
        setIntField(term3490, term3490.getClass(), "count", -2095575670);
        term3534 = (byte[]) newByteArray(2);
        setByteElement(term3534, 0, (byte) 69);
        setByteElement(term3534, 1, (byte) -74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3490;
        args[1] = "cAPeiZHKGJ";
        args[2] = term3534;
        try {
            callMethod(klass, "appendSummary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


