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

public class CodeGenerator_clearContextForNoInOperator_180837992732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3202;
     Object enum7;

    public CodeGenerator_clearContextForNoInOperator_180837992732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3203 = new HashMap();
        term3202 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term3202, term3202.getClass(), "ESCAPED_JS_STRINGS", term3203);
        setField(term3202, term3202.getClass(), "cc", null);
        setField(term3202, term3202.getClass(), "outputCharsetEncoder", null);
        Class<? extends Object> term3232 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term3231 = ((Class) term3232).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term3231).setAccessible(true);
        enum7 = ((Field) term3231).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "clearContextForNoInOperator", argTypes, term3202, args);
    }

};


