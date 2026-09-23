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

public class FunctionType_getTopDefiningInterface_721930131298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281723;
     Object term282329;
     Object term282312;

    public FunctionType_getTopDefiningInterface_721930131298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term282329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term282329, term282329.getClass(), "isChecked", false);
        setBooleanField(term282329, term282329.getClass(), "visited", false);
        setField(term282329, term282329.getClass(), "docInfo", null);
        setBooleanField(term282329, term282329.getClass(), "unknown", false);
        setBooleanField(term282329, term282329.getClass(), "resolved", false);
        setField(term282329, term282329.getClass(), "resolveResult", null);
        setBooleanField(term282329, term282329.getClass(), "inTemplatedCheckVisit", false);
        setField(term282329, term282329.getClass(), "registry", null);
        term282312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term282312, term282312.getClass(), "isChecked", false);
        setBooleanField(term282312, term282312.getClass(), "visited", false);
        setField(term282312, term282312.getClass(), "docInfo", null);
        setBooleanField(term282312, term282312.getClass(), "unknown", false);
        setBooleanField(term282312, term282312.getClass(), "resolved", false);
        setField(term282312, term282312.getClass(), "resolveResult", null);
        setBooleanField(term282312, term282312.getClass(), "inTemplatedCheckVisit", false);
        setField(term282312, term282312.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term281723;
        args[1] = null;
        Object retValue = callMethod(klass, "getTopDefiningInterface", argTypes, null, args);
        assertTrue(recursiveEquals(term281723, term282329));
        assertTrue(recursiveEquals(retValue, term282312));
    }

};


