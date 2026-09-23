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

public class CodeGenerator_getContextForNoInOperator_207133953428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2738;
     Object enum6;

    public CodeGenerator_getContextForNoInOperator_207133953428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2738 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2738, term2738.getClass(), "cc", null);
        setField(term2738, term2738.getClass(), "outputCharsetEncoder", null);
        Class<? extends Object> term2749 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term2748 = ((Class) term2749).getDeclaredField((String) "OTHER");
        ((Field) term2748).setAccessible(true);
        enum6 = ((Field) term2748).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum6;
        callMethod(klass, "getContextForNoInOperator", argTypes, term2738, args);
    }

};


