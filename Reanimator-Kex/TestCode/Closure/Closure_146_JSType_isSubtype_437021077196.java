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

public class JSType_isSubtype_437021077196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25899;
     Object term25997;
     Object term26219;
     Object term26220;

    public JSType_isSubtype_437021077196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term25997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term26219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term26219, term26219.getClass(), "resolved", false);
        setField(term26219, term26219.getClass(), "resolveResult", null);
        setField(term26219, term26219.getClass(), "registry", null);
        term26220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term26220, term26220.getClass(), "resolved", false);
        setField(term26220, term26220.getClass(), "resolveResult", null);
        setField(term26220, term26220.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term25899;
        args[1] = term25997;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term25899, term26219));
        assertTrue(recursiveEquals(term25997, term26220));
        assertTrue(recursiveEquals(retValue, false));
    }

};


