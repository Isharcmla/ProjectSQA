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

public class ToStringStyle_appendDetail_1311240678166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198;
     Object term4242;

    public ToStringStyle_appendDetail_1311240678166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term4211 = (byte[]) newByteArray(16);
        setField(term4198, term4198.getClass(), "toStringCache", "BKLfkLiZTH");
        setField(term4198, term4198.getClass(), "value", term4211);
        setByteField(term4198, term4198.getClass(), "coder", (byte) 79);
        setIntField(term4198, term4198.getClass(), "count", 962840079);
        term4242 = (float[]) newFloatArray(6);
        setFloatElement(term4242, 0, 0.5523636F);
        setFloatElement(term4242, 1, 0.8564069F);
        setFloatElement(term4242, 2, 0.5446086F);
        setFloatElement(term4242, 3, 0.5254275F);
        setFloatElement(term4242, 4, 0.2857073F);
        setFloatElement(term4242, 5, 0.6880585F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4198;
        args[1] = "SPpkrGcPRr";
        args[2] = term4242;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


