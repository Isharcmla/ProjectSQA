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

public class ToStringStyle_appendDetail_1311240678140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920;
     Object term1964;

    public ToStringStyle_appendDetail_1311240678140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1933 = (byte[]) newByteArray(16);
        setField(term1920, term1920.getClass(), "toStringCache", "LvtrsXUliU");
        setField(term1920, term1920.getClass(), "value", term1933);
        setByteField(term1920, term1920.getClass(), "coder", (byte) -15);
        setIntField(term1920, term1920.getClass(), "count", 865208305);
        term1964 = new Float(0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term1920;
        args[1] = "xLbjWUgOIL";
        args[2] = term1964;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


