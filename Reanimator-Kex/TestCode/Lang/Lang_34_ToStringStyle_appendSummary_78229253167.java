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

public class ToStringStyle_appendSummary_78229253167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4291;
     Object term4335;

    public ToStringStyle_appendSummary_78229253167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4291 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term4304 = (byte[]) newByteArray(16);
        setField(term4291, term4291.getClass(), "toStringCache", "sEccwbJKYE");
        setField(term4291, term4291.getClass(), "value", term4304);
        setByteField(term4291, term4291.getClass(), "coder", (byte) 61);
        setIntField(term4291, term4291.getClass(), "count", 1540719661);
        term4335 = (float[]) newFloatArray(1);
        setFloatElement(term4335, 0, 0.40176582F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4291;
        args[1] = "AWRooQKkdW";
        args[2] = term4335;
        try {
            callMethod(klass, "appendSummary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


