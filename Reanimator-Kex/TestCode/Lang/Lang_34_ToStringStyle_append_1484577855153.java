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

public class ToStringStyle_append_1484577855153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059;
     Object term3103;
     Object term3107;

    public ToStringStyle_append_1484577855153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3059 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3072 = (byte[]) newByteArray(16);
        setField(term3059, term3059.getClass(), "toStringCache", "KoyGrUJeJW");
        setField(term3059, term3059.getClass(), "value", term3072);
        setByteField(term3059, term3059.getClass(), "coder", (byte) 111);
        setIntField(term3059, term3059.getClass(), "count", 493620644);
        term3103 = (short[]) newShortArray(3);
        setShortElement(term3103, 0, (short) -1703);
        setShortElement(term3103, 1, (short) 23627);
        setShortElement(term3103, 2, (short) -19694);
        term3107 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(short.class, 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term3059;
        args[1] = "HqBOwkVqjD";
        args[2] = term3103;
        args[3] = term3107;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


