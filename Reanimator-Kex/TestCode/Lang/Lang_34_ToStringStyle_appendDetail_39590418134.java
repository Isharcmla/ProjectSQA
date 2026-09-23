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
import java.lang.Byte;

public class ToStringStyle_appendDetail_39590418134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1428;
     Object term1472;

    public ToStringStyle_appendDetail_39590418134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1428 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1441 = (byte[]) newByteArray(16);
        setField(term1428, term1428.getClass(), "toStringCache", "Ghbwtircqb");
        setField(term1428, term1428.getClass(), "value", term1441);
        setByteField(term1428, term1428.getClass(), "coder", (byte) 121);
        setIntField(term1428, term1428.getClass(), "count", -6029667);
        term1472 = new Byte((byte) -99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = byte.class;
        Object[] args = new Object[3];
        args[0] = term1428;
        args[1] = "xrwlQZdwCp";
        args[2] = term1472;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


