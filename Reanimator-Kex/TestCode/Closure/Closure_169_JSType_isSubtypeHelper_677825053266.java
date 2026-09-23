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

public class JSType_isSubtypeHelper_677825053266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33074;
     Object term33170;
     Object term33572;
     Object term33573;

    public JSType_isSubtypeHelper_677825053266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term33170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term33572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term33572, term33572.getClass(), "resolved", false);
        setField(term33572, term33572.getClass(), "resolveResult", null);
        setBooleanField(term33572, term33572.getClass(), "inTemplatedCheckVisit", false);
        setField(term33572, term33572.getClass(), "registry", null);
        term33573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term33573, term33573.getClass(), "resolved", false);
        setField(term33573, term33573.getClass(), "resolveResult", null);
        setBooleanField(term33573, term33573.getClass(), "inTemplatedCheckVisit", false);
        setField(term33573, term33573.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term33074;
        args[1] = term33170;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term33074, term33572));
        assertTrue(recursiveEquals(term33170, term33573));
        assertTrue(recursiveEquals(retValue, false));
    }

};


