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

public class JSType_isEquivalent_1737835225207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33158;
     Object term33254;
     Object term33531;
     Object term33532;

    public JSType_isEquivalent_1737835225207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term33254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term33531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term33531, term33531.getClass(), "resolved", false);
        setField(term33531, term33531.getClass(), "resolveResult", null);
        setField(term33531, term33531.getClass(), "registry", null);
        term33532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term33532, term33532.getClass(), "resolved", false);
        setField(term33532, term33532.getClass(), "resolveResult", null);
        setField(term33532, term33532.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term33158;
        args[1] = term33254;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term33158, term33531));
        assertTrue(recursiveEquals(term33254, term33532));
        assertTrue(recursiveEquals(retValue, false));
    }

};


