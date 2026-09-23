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

public class ToStringStyle_removeLastFieldSeparator_1315302027119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;

    public ToStringStyle_removeLastFieldSeparator_1315302027119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term295 = (byte[]) newByteArray(16);
        setField(term282, term282.getClass(), "toStringCache", "SzjVpOQTyS");
        setField(term282, term282.getClass(), "value", term295);
        setByteField(term282, term282.getClass(), "coder", (byte) 18);
        setIntField(term282, term282.getClass(), "count", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = term282;
        try {
            callMethod(klass, "removeLastFieldSeparator", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


