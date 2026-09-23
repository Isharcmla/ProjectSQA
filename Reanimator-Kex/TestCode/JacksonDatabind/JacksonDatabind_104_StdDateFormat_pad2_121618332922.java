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

public class StdDateFormat_pad2_121618332922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1780;
     Object term1812;

    public StdDateFormat_pad2_121618332922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1780 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1793 = (byte[]) newByteArray(16);
        setField(term1780, term1780.getClass(), "toStringCache", "SzjVpOQTyS");
        setField(term1780, term1780.getClass(), "value", term1793);
        setByteField(term1780, term1780.getClass(), "coder", (byte) 89);
        setIntField(term1780, term1780.getClass(), "count", -1339778481);
        term1812 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1780;
        args[1] = term1812;
        callMethod(klass, "pad2", argTypes, null, args);
    }

};


