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
import java.lang.Boolean;

public class CodeGenerator_jsString_33394039022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13701;
     Object term13741;

    public CodeGenerator_jsString_33394039022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13702 = new HashMap();
        Class<? extends Object> term13744 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term13743 = ((Class) term13744).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term13743).setAccessible(true);
        Object enum37 = ((Field) term13743).get((Object) null);
        term13701 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term13701, term13701.getClass(), "escapedJsStrings", term13702);
        setField(term13701, term13701.getClass(), "cc", null);
        setField(term13701, term13701.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term13701, term13701.getClass(), "preferSingleQuotes", false);
        setBooleanField(term13701, term13701.getClass(), "trustedStrings", false);
        setField(term13701, term13701.getClass(), "languageMode", enum37);
        term13741 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "ytSBIKXogI";
        args[1] = term13741;
        callMethod(klass, "jsString", argTypes, term13701, args);
    }

};


