package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StdDateFormat_pad3_121618236823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1840;
     Object term1872;

    public StdDateFormat_pad3_121618236823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1840 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1853 = (byte[]) newByteArray(16);
        setField(term1840, term1840.getClass(), "toStringCache", "MjGYSRKTNF");
        setField(term1840, term1840.getClass(), "value", term1853);
        setByteField(term1840, term1840.getClass(), "coder", (byte) 75);
        setIntField(term1840, term1840.getClass(), "count", -522618178);
        term1872 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1840;
        args[1] = term1872;
        callMethod(klass, "pad3", argTypes, null, args);
    }

};


