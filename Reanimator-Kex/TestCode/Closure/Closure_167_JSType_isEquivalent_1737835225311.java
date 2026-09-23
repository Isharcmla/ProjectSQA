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

public class JSType_isEquivalent_1737835225311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46779;
     Object term46871;
     Object term46884;
     Object term46885;

    public JSType_isEquivalent_1737835225311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term46871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term46884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term46884, term46884.getClass(), "resolved", false);
        setField(term46884, term46884.getClass(), "resolveResult", null);
        setBooleanField(term46884, term46884.getClass(), "inTemplatedCheckVisit", false);
        setField(term46884, term46884.getClass(), "registry", null);
        term46885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term46885, term46885.getClass(), "resolved", false);
        setField(term46885, term46885.getClass(), "resolveResult", null);
        setBooleanField(term46885, term46885.getClass(), "inTemplatedCheckVisit", false);
        setField(term46885, term46885.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term46779;
        args[1] = term46871;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term46779, term46884));
        assertTrue(recursiveEquals(term46871, term46885));
        assertTrue(recursiveEquals(retValue, false));
    }

};


