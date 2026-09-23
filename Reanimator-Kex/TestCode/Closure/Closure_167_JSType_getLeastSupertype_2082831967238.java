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

public class JSType_getLeastSupertype_2082831967238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30168;
     Object term30332;
     Object term30333;
     Object term30328;

    public JSType_getLeastSupertype_2082831967238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term30332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term30332, term30332.getClass(), "resolved", false);
        setField(term30332, term30332.getClass(), "resolveResult", null);
        setBooleanField(term30332, term30332.getClass(), "inTemplatedCheckVisit", false);
        setField(term30332, term30332.getClass(), "registry", null);
        term30333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term30333, term30333.getClass(), "resolved", false);
        setField(term30333, term30333.getClass(), "resolveResult", null);
        setBooleanField(term30333, term30333.getClass(), "inTemplatedCheckVisit", false);
        setField(term30333, term30333.getClass(), "registry", null);
        term30328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term30328, term30328.getClass(), "resolved", false);
        setField(term30328, term30328.getClass(), "resolveResult", null);
        setBooleanField(term30328, term30328.getClass(), "inTemplatedCheckVisit", false);
        setField(term30328, term30328.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term30168;
        args[1] = term30168;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term30168, term30332));
        assertTrue(recursiveEquals(term30168, term30333));
        assertTrue(recursiveEquals(retValue, term30328));
    }

};


