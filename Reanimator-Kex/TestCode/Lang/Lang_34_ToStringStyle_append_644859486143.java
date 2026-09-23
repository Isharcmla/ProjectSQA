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
import java.lang.Object;
import java.lang.Boolean;

public class ToStringStyle_append_644859486143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2166;
     Object term2210;
     Object term2220;

    public ToStringStyle_append_644859486143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2166 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2179 = (byte[]) newByteArray(16);
        setField(term2166, term2166.getClass(), "toStringCache", "JDswTTCZHV");
        setField(term2166, term2166.getClass(), "value", term2179);
        setByteField(term2166, term2166.getClass(), "coder", (byte) 106);
        setIntField(term2166, term2166.getClass(), "count", -203030934);
        term2210 = (Object[]) newArray("java.lang.Object", 9);
        Object term2211 = newInstance(Class.forName("java.lang.Object"));
        Object term2212 = newInstance(Class.forName("java.lang.Object"));
        Object term2213 = newInstance(Class.forName("java.lang.Object"));
        Object term2214 = newInstance(Class.forName("java.lang.Object"));
        Object term2215 = newInstance(Class.forName("java.lang.Object"));
        Object term2216 = newInstance(Class.forName("java.lang.Object"));
        Object term2217 = newInstance(Class.forName("java.lang.Object"));
        Object term2218 = newInstance(Class.forName("java.lang.Object"));
        Object term2219 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2210, 0, term2211);
        setElement(term2210, 1, term2212);
        setElement(term2210, 2, term2213);
        setElement(term2210, 3, term2214);
        setElement(term2210, 4, term2215);
        setElement(term2210, 5, term2216);
        setElement(term2210, 6, term2217);
        setElement(term2210, 7, term2218);
        setElement(term2210, 8, term2219);
        term2220 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term2166;
        args[1] = "onpbIeEKoi";
        args[2] = term2210;
        args[3] = term2220;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


