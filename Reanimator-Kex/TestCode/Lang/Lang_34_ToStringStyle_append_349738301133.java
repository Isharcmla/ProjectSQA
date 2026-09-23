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

public class ToStringStyle_append_349738301133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1346;
     Object term1390;

    public ToStringStyle_append_349738301133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1346 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1359 = (byte[]) newByteArray(16);
        setField(term1346, term1346.getClass(), "toStringCache", "SbAoxhfrkn");
        setField(term1346, term1346.getClass(), "value", term1359);
        setByteField(term1346, term1346.getClass(), "coder", (byte) 78);
        setIntField(term1346, term1346.getClass(), "count", -655067527);
        term1390 = new Byte((byte) 87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = byte.class;
        Object[] args = new Object[3];
        args[0] = term1346;
        args[1] = "kuTXqwMtDB";
        args[2] = term1390;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


