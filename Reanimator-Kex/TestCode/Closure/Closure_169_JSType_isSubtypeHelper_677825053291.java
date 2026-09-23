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

public class JSType_isSubtypeHelper_677825053291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39032;
     Object term39077;
     Object term39078;

    public JSType_isSubtypeHelper_677825053291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term39077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term39077, term39077.getClass(), "resolved", false);
        setField(term39077, term39077.getClass(), "resolveResult", null);
        setBooleanField(term39077, term39077.getClass(), "inTemplatedCheckVisit", false);
        setField(term39077, term39077.getClass(), "registry", null);
        term39078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term39078, term39078.getClass(), "resolved", false);
        setField(term39078, term39078.getClass(), "resolveResult", null);
        setBooleanField(term39078, term39078.getClass(), "inTemplatedCheckVisit", false);
        setField(term39078, term39078.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term39032;
        args[1] = term39032;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term39032, term39077));
        assertTrue(recursiveEquals(term39032, term39078));
        assertTrue(recursiveEquals(retValue, true));
    }

};


