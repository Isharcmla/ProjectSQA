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
import java.lang.Boolean;

public class CodeGenerator_jsString_33394039022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7355;
     Object term7380;

    public CodeGenerator_jsString_33394039022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7356 = new HashMap();
        term7355 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7355, term7355.getClass(), "ESCAPED_JS_STRINGS", term7356);
        setField(term7355, term7355.getClass(), "cc", null);
        setField(term7355, term7355.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7355, term7355.getClass(), "preferSingleQuotes", true);
        setBooleanField(term7355, term7355.getClass(), "trustedStrings", true);
        term7380 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "ytSBIKXogI";
        args[1] = term7380;
        callMethod(klass, "jsString", argTypes, term7355, args);
    }

};


