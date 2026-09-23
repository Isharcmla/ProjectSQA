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

public class CodeGenerator_clearContextForNoInOperator_180837992731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3610;
     Object enum8;

    public CodeGenerator_clearContextForNoInOperator_180837992731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3611 = new HashMap();
        term3610 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term3610, term3610.getClass(), "ESCAPED_JS_STRINGS", term3611);
        setField(term3610, term3610.getClass(), "cc", null);
        setField(term3610, term3610.getClass(), "outputCharsetEncoder", null);
        Class<? extends Object> term3640 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term3639 = ((Class) term3640).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term3639).setAccessible(true);
        enum8 = ((Field) term3639).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum8;
        callMethod(klass, "clearContextForNoInOperator", argTypes, term3610, args);
    }

};


