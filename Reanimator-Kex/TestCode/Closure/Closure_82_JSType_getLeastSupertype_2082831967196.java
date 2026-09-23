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

public class JSType_getLeastSupertype_2082831967196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24869;
     Object term26369;
     Object term26370;
     Object term26366;

    public JSType_getLeastSupertype_2082831967196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term26369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term26369, term26369.getClass(), "resolved", false);
        setField(term26369, term26369.getClass(), "resolveResult", null);
        setField(term26369, term26369.getClass(), "registry", null);
        term26370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term26370, term26370.getClass(), "resolved", false);
        setField(term26370, term26370.getClass(), "resolveResult", null);
        setField(term26370, term26370.getClass(), "registry", null);
        term26366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term26366, term26366.getClass(), "resolved", false);
        setField(term26366, term26366.getClass(), "resolveResult", null);
        setField(term26366, term26366.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term24869;
        args[1] = term24869;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term24869, term26369));
        assertTrue(recursiveEquals(term24869, term26370));
        assertTrue(recursiveEquals(retValue, term26366));
    }

};


