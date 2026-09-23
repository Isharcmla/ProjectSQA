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

public class CodeGenerator_getContextForNoInOperator_207133953431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7976;
     Object enum20;

    public CodeGenerator_getContextForNoInOperator_207133953431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7977 = new HashMap();
        term7976 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7976, term7976.getClass(), "ESCAPED_JS_STRINGS", term7977);
        setField(term7976, term7976.getClass(), "cc", null);
        setField(term7976, term7976.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7976, term7976.getClass(), "preferSingleQuotes", false);
        setBooleanField(term7976, term7976.getClass(), "trustedStrings", false);
        Class<? extends Object> term8008 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term8007 = ((Class) term8008).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term8007).setAccessible(true);
        enum20 = ((Field) term8007).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum20;
        callMethod(klass, "getContextForNoInOperator", argTypes, term7976, args);
    }

};


