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

public class FunctionType_hasCachedValues_625426612625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600567;
     Object term601534;

    public FunctionType_hasCachedValues_625426612625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term600567, term600567.getClass(), "prototypeSlot", null);
        setBooleanField(term600567, term600567.getClass(), "unknown", true);
        term601534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term601534, term601534.getClass(), "call", null);
        setField(term601534, term601534.getClass(), "prototypeSlot", null);
        setField(term601534, term601534.getClass(), "kind", null);
        setField(term601534, term601534.getClass(), "propAccess", null);
        setField(term601534, term601534.getClass(), "typeOfThis", null);
        setField(term601534, term601534.getClass(), "source", null);
        setField(term601534, term601534.getClass(), "implementedInterfaces", null);
        setField(term601534, term601534.getClass(), "extendedInterfaces", null);
        setField(term601534, term601534.getClass(), "subTypes", null);
        setField(term601534, term601534.getClass(), "templateTypeNames", null);
        setField(term601534, term601534.getClass(), "className", null);
        setField(term601534, term601534.getClass(), "properties", null);
        setBooleanField(term601534, term601534.getClass(), "nativeType", false);
        setField(term601534, term601534.getClass(), "implicitPrototypeFallback", null);
        setField(term601534, term601534.getClass(), "ownerFunction", null);
        setBooleanField(term601534, term601534.getClass(), "prettyPrint", false);
        setBooleanField(term601534, term601534.getClass(), "visited", false);
        setField(term601534, term601534.getClass(), "docInfo", null);
        setBooleanField(term601534, term601534.getClass(), "unknown", true);
        setBooleanField(term601534, term601534.getClass(), "resolved", false);
        setField(term601534, term601534.getClass(), "resolveResult", null);
        setBooleanField(term601534, term601534.getClass(), "inTemplatedCheckVisit", false);
        setField(term601534, term601534.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasCachedValues", argTypes, term600567, args);
        assertTrue(recursiveEquals(term600567, term601534));
        assertTrue(recursiveEquals(retValue, false));
    }

};


