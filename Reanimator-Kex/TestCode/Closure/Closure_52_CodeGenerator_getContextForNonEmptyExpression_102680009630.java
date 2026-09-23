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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_getContextForNonEmptyExpression_102680009630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2558;
     Object enum5;

    public CodeGenerator_getContextForNonEmptyExpression_102680009630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2559 = new HashMap();
        term2558 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2558, term2558.getClass(), "ESCAPED_JS_STRINGS", term2559);
        setField(term2558, term2558.getClass(), "cc", null);
        setField(term2558, term2558.getClass(), "outputCharsetEncoder", null);
        Class<? extends Object> term2594 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term2593 = ((Class) term2594).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term2593).setAccessible(true);
        enum5 = ((Field) term2593).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "getContextForNonEmptyExpression", argTypes, term2558, args);
    }

};


