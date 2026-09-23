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

public class ToStringStyle_appendDetail_39590418157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3409;
     Object term3453;

    public ToStringStyle_appendDetail_39590418157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3409 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3422 = (byte[]) newByteArray(16);
        setField(term3409, term3409.getClass(), "toStringCache", "VgZnGoIFwQ");
        setField(term3409, term3409.getClass(), "value", term3422);
        setByteField(term3409, term3409.getClass(), "coder", (byte) -22);
        setIntField(term3409, term3409.getClass(), "count", -1371869594);
        term3453 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3409;
        args[1] = "jUbSRrkrYZ";
        args[2] = term3453;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


