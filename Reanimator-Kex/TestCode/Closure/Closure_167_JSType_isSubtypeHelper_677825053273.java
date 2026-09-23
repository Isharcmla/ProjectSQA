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

public class JSType_isSubtypeHelper_677825053273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36969;
     Object term36985;
     Object term36986;

    public JSType_isSubtypeHelper_677825053273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term36969, term36969.getClass(), "unknown", false);
        term36985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term36985, term36985.getClass(), "source", null);
        setField(term36985, term36985.getClass(), "elementsType", null);
        setField(term36985, term36985.getClass(), "elements", null);
        setField(term36985, term36985.getClass(), "className", null);
        setField(term36985, term36985.getClass(), "properties", null);
        setBooleanField(term36985, term36985.getClass(), "nativeType", false);
        setField(term36985, term36985.getClass(), "implicitPrototypeFallback", null);
        setField(term36985, term36985.getClass(), "ownerFunction", null);
        setBooleanField(term36985, term36985.getClass(), "prettyPrint", false);
        setBooleanField(term36985, term36985.getClass(), "visited", false);
        setField(term36985, term36985.getClass(), "docInfo", null);
        setBooleanField(term36985, term36985.getClass(), "unknown", false);
        setBooleanField(term36985, term36985.getClass(), "resolved", false);
        setField(term36985, term36985.getClass(), "resolveResult", null);
        setBooleanField(term36985, term36985.getClass(), "inTemplatedCheckVisit", false);
        setField(term36985, term36985.getClass(), "registry", null);
        term36986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term36986, term36986.getClass(), "source", null);
        setField(term36986, term36986.getClass(), "elementsType", null);
        setField(term36986, term36986.getClass(), "elements", null);
        setField(term36986, term36986.getClass(), "className", null);
        setField(term36986, term36986.getClass(), "properties", null);
        setBooleanField(term36986, term36986.getClass(), "nativeType", false);
        setField(term36986, term36986.getClass(), "implicitPrototypeFallback", null);
        setField(term36986, term36986.getClass(), "ownerFunction", null);
        setBooleanField(term36986, term36986.getClass(), "prettyPrint", false);
        setBooleanField(term36986, term36986.getClass(), "visited", false);
        setField(term36986, term36986.getClass(), "docInfo", null);
        setBooleanField(term36986, term36986.getClass(), "unknown", false);
        setBooleanField(term36986, term36986.getClass(), "resolved", false);
        setField(term36986, term36986.getClass(), "resolveResult", null);
        setBooleanField(term36986, term36986.getClass(), "inTemplatedCheckVisit", false);
        setField(term36986, term36986.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term36969;
        args[1] = term36969;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term36969, term36985));
        assertTrue(recursiveEquals(term36969, term36986));
        assertTrue(recursiveEquals(retValue, true));
    }

};


