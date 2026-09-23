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

public class JSType_toMaybeFunctionType_267664181234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29100;
     Object term29218;
     Object term29211;

    public JSType_toMaybeFunctionType_267664181234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term29218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term29218, term29218.getClass(), "call", null);
        setField(term29218, term29218.getClass(), "prototypeSlot", null);
        setField(term29218, term29218.getClass(), "kind", null);
        setField(term29218, term29218.getClass(), "propAccess", null);
        setField(term29218, term29218.getClass(), "typeOfThis", null);
        setField(term29218, term29218.getClass(), "source", null);
        setField(term29218, term29218.getClass(), "implementedInterfaces", null);
        setField(term29218, term29218.getClass(), "extendedInterfaces", null);
        setField(term29218, term29218.getClass(), "subTypes", null);
        setField(term29218, term29218.getClass(), "templateTypeNames", null);
        setField(term29218, term29218.getClass(), "className", null);
        setField(term29218, term29218.getClass(), "properties", null);
        setBooleanField(term29218, term29218.getClass(), "nativeType", false);
        setField(term29218, term29218.getClass(), "implicitPrototypeFallback", null);
        setField(term29218, term29218.getClass(), "ownerFunction", null);
        setBooleanField(term29218, term29218.getClass(), "prettyPrint", false);
        setBooleanField(term29218, term29218.getClass(), "visited", false);
        setField(term29218, term29218.getClass(), "docInfo", null);
        setBooleanField(term29218, term29218.getClass(), "unknown", false);
        setBooleanField(term29218, term29218.getClass(), "resolved", false);
        setField(term29218, term29218.getClass(), "resolveResult", null);
        setBooleanField(term29218, term29218.getClass(), "inTemplatedCheckVisit", false);
        setField(term29218, term29218.getClass(), "registry", null);
        term29211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term29211, term29211.getClass(), "call", null);
        setField(term29211, term29211.getClass(), "prototypeSlot", null);
        setField(term29211, term29211.getClass(), "kind", null);
        setField(term29211, term29211.getClass(), "propAccess", null);
        setField(term29211, term29211.getClass(), "typeOfThis", null);
        setField(term29211, term29211.getClass(), "source", null);
        setField(term29211, term29211.getClass(), "implementedInterfaces", null);
        setField(term29211, term29211.getClass(), "extendedInterfaces", null);
        setField(term29211, term29211.getClass(), "subTypes", null);
        setField(term29211, term29211.getClass(), "templateTypeNames", null);
        setField(term29211, term29211.getClass(), "className", null);
        setField(term29211, term29211.getClass(), "properties", null);
        setBooleanField(term29211, term29211.getClass(), "nativeType", false);
        setField(term29211, term29211.getClass(), "implicitPrototypeFallback", null);
        setField(term29211, term29211.getClass(), "ownerFunction", null);
        setBooleanField(term29211, term29211.getClass(), "prettyPrint", false);
        setBooleanField(term29211, term29211.getClass(), "visited", false);
        setField(term29211, term29211.getClass(), "docInfo", null);
        setBooleanField(term29211, term29211.getClass(), "unknown", false);
        setBooleanField(term29211, term29211.getClass(), "resolved", false);
        setField(term29211, term29211.getClass(), "resolveResult", null);
        setBooleanField(term29211, term29211.getClass(), "inTemplatedCheckVisit", false);
        setField(term29211, term29211.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term29100;
        Object retValue = callMethod(klass, "toMaybeFunctionType", argTypes, null, args);
        assertTrue(recursiveEquals(term29100, term29218));
        assertTrue(recursiveEquals(retValue, term29211));
    }

};


