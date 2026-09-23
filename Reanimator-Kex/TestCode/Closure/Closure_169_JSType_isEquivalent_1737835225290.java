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

public class JSType_isEquivalent_1737835225290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38775;
     Object term38873;
     Object term39063;
     Object term39064;

    public JSType_isEquivalent_1737835225290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term38873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term39063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term39063, term39063.getClass(), "resolved", false);
        setField(term39063, term39063.getClass(), "resolveResult", null);
        setBooleanField(term39063, term39063.getClass(), "inTemplatedCheckVisit", false);
        setField(term39063, term39063.getClass(), "registry", null);
        term39064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term39064, term39064.getClass(), "resolved", false);
        setField(term39064, term39064.getClass(), "resolveResult", null);
        setBooleanField(term39064, term39064.getClass(), "inTemplatedCheckVisit", false);
        setField(term39064, term39064.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term38775;
        args[1] = term38873;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term38775, term39063));
        assertTrue(recursiveEquals(term38873, term39064));
        assertTrue(recursiveEquals(retValue, false));
    }

};


