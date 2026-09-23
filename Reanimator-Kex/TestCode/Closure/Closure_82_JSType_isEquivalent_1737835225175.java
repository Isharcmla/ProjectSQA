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

public class JSType_isEquivalent_1737835225175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22182;
     Object term22972;

    public JSType_isEquivalent_1737835225175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term22972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term22972, term22972.getClass(), "resolved", false);
        setField(term22972, term22972.getClass(), "resolveResult", null);
        setField(term22972, term22972.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22182;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term22182, term22972));
        assertTrue(recursiveEquals(retValue, false));
    }

};


