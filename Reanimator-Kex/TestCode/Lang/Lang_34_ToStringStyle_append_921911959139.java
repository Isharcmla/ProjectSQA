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
import java.lang.Float;

public class ToStringStyle_append_921911959139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1838;
     Object term1882;

    public ToStringStyle_append_921911959139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1838 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1851 = (byte[]) newByteArray(16);
        setField(term1838, term1838.getClass(), "toStringCache", "GzFkzHGYFt");
        setField(term1838, term1838.getClass(), "value", term1851);
        setByteField(term1838, term1838.getClass(), "coder", (byte) 23);
        setIntField(term1838, term1838.getClass(), "count", 590364439);
        term1882 = new Float(0.13238746F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term1838;
        args[1] = "tShwQLRGNe";
        args[2] = term1882;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


