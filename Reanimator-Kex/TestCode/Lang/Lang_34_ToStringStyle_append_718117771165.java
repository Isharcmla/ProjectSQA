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
import java.lang.Boolean;

public class ToStringStyle_append_718117771165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4111;
     Object term4155;
     Object term4158;

    public ToStringStyle_append_718117771165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4111 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term4124 = (byte[]) newByteArray(16);
        setField(term4111, term4111.getClass(), "toStringCache", "JiVRgTZvKc");
        setField(term4111, term4111.getClass(), "value", term4124);
        setByteField(term4111, term4111.getClass(), "coder", (byte) 98);
        setIntField(term4111, term4111.getClass(), "count", 287287233);
        term4155 = (float[]) newFloatArray(2);
        setFloatElement(term4155, 0, 0.3455959F);
        setFloatElement(term4155, 1, 0.09123778F);
        term4158 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(float.class, 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term4111;
        args[1] = "XPKmummaqg";
        args[2] = term4155;
        args[3] = term4158;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


