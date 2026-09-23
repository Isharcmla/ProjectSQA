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
     Object term16362;
     Object enum45;

    public CodeGenerator_getContextForNoInOperator_207133953431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16363 = new HashMap();
        Class<? extends Object> term16409 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term16408 = ((Class) term16409).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term16408).setAccessible(true);
        Object enum44 = ((Field) term16408).get((Object) null);
        term16362 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term16362, term16362.getClass(), "escapedJsStrings", term16363);
        setField(term16362, term16362.getClass(), "cc", null);
        setField(term16362, term16362.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term16362, term16362.getClass(), "preferSingleQuotes", true);
        setBooleanField(term16362, term16362.getClass(), "trustedStrings", true);
        setField(term16362, term16362.getClass(), "languageMode", enum44);
        Class<? extends Object> term16734 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term16733 = ((Class) term16734).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term16733).setAccessible(true);
        enum45 = ((Field) term16733).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum45;
        callMethod(klass, "getContextForNoInOperator", argTypes, term16362, args);
    }

};


