package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class JSType_isSubtype_437021077167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21875;
     Object term21973;
     Object term22262;
     Object term22263;

    public JSType_isSubtype_437021077167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term21973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term22262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term22262, term22262.getClass(), "resolved", false);
        setField(term22262, term22262.getClass(), "resolveResult", null);
        setField(term22262, term22262.getClass(), "registry", null);
        term22263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term22263, term22263.getClass(), "resolved", false);
        setField(term22263, term22263.getClass(), "resolveResult", null);
        setField(term22263, term22263.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term21875;
        args[1] = term21973;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term21875, term22262));
        assertTrue(recursiveEquals(term21973, term22263));
        assertTrue(recursiveEquals(retValue, false));
    }

};


