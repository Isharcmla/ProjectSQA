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

public class ToStringStyle_append_1484593231150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2778;
     Object term2822;
     Object term2823;

    public ToStringStyle_append_1484593231150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2778 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2791 = (byte[]) newByteArray(16);
        setField(term2778, term2778.getClass(), "toStringCache", "TJmVBGfTML");
        setField(term2778, term2778.getClass(), "value", term2791);
        setByteField(term2778, term2778.getClass(), "coder", (byte) 80);
        setIntField(term2778, term2778.getClass(), "count", -469968304);
        term2822 = (int[]) newIntArray(0);
        term2823 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term2778;
        args[1] = "tPlsykYBqO";
        args[2] = term2822;
        args[3] = term2823;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


