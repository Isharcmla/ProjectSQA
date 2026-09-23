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

public class JSType_getLeastSupertype_2082831967299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40030;
     Object term40039;
     Object term40040;
     Object term40033;

    public JSType_getLeastSupertype_2082831967299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term40039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term40039, term40039.getClass(), "resolved", false);
        setField(term40039, term40039.getClass(), "resolveResult", null);
        setBooleanField(term40039, term40039.getClass(), "inTemplatedCheckVisit", false);
        setField(term40039, term40039.getClass(), "registry", null);
        term40040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term40040, term40040.getClass(), "resolved", false);
        setField(term40040, term40040.getClass(), "resolveResult", null);
        setBooleanField(term40040, term40040.getClass(), "inTemplatedCheckVisit", false);
        setField(term40040, term40040.getClass(), "registry", null);
        term40033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term40033, term40033.getClass(), "resolved", false);
        setField(term40033, term40033.getClass(), "resolveResult", null);
        setBooleanField(term40033, term40033.getClass(), "inTemplatedCheckVisit", false);
        setField(term40033, term40033.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term40030;
        args[1] = term40030;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term40030, term40039));
        assertTrue(recursiveEquals(term40030, term40040));
        assertTrue(recursiveEquals(retValue, term40033));
    }

};


