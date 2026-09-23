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

public class ToStringStyle_appendContentEnd_1335738946174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4807;

    public ToStringStyle_appendContentEnd_1335738946174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4807 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term4820 = (byte[]) newByteArray(16);
        setField(term4807, term4807.getClass(), "toStringCache", "OEXDRUKcFl");
        setField(term4807, term4807.getClass(), "value", term4820);
        setByteField(term4807, term4807.getClass(), "coder", (byte) -126);
        setIntField(term4807, term4807.getClass(), "count", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = term4807;
        try {
            callMethod(klass, "appendContentEnd", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


