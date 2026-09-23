package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_clearContextForNoInOperator_180837992727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3002;
     Object enum7;

    public CodeGenerator_clearContextForNoInOperator_180837992727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3002 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term3002, term3002.getClass(), "cc", null);
        setField(term3002, term3002.getClass(), "outputCharsetEncoder", null);
        Class<? extends Object> term3022 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term3021 = ((Class) term3022).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term3021).setAccessible(true);
        enum7 = ((Field) term3021).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "clearContextForNoInOperator", argTypes, term3002, args);
    }

};


