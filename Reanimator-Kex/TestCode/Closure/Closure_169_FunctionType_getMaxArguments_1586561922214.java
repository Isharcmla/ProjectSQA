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
import java.lang.Object;

public class FunctionType_getMaxArguments_1586561922214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109086;
     Object term229980;

    public FunctionType_getMaxArguments_1586561922214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term109180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term109180, term109180.getClass(), "parameters", null);
        setField(term109086, term109086.getClass(), "call", term109180);
        term229980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term229981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term229981, term229981.getClass(), "parameters", null);
        setField(term229981, term229981.getClass(), "returnType", null);
        setBooleanField(term229981, term229981.getClass(), "returnTypeInferred", false);
        setBooleanField(term229981, term229981.getClass(), "resolved", false);
        setField(term229981, term229981.getClass(), "resolveResult", null);
        setBooleanField(term229981, term229981.getClass(), "inTemplatedCheckVisit", false);
        setField(term229981, term229981.getClass(), "registry", null);
        setField(term229980, term229980.getClass(), "call", term229981);
        setField(term229980, term229980.getClass(), "prototypeSlot", null);
        setField(term229980, term229980.getClass(), "kind", null);
        setField(term229980, term229980.getClass(), "propAccess", null);
        setField(term229980, term229980.getClass(), "typeOfThis", null);
        setField(term229980, term229980.getClass(), "source", null);
        setField(term229980, term229980.getClass(), "implementedInterfaces", null);
        setField(term229980, term229980.getClass(), "extendedInterfaces", null);
        setField(term229980, term229980.getClass(), "subTypes", null);
        setField(term229980, term229980.getClass(), "templateTypeNames", null);
        setField(term229980, term229980.getClass(), "className", null);
        setField(term229980, term229980.getClass(), "properties", null);
        setBooleanField(term229980, term229980.getClass(), "nativeType", false);
        setField(term229980, term229980.getClass(), "implicitPrototypeFallback", null);
        setField(term229980, term229980.getClass(), "ownerFunction", null);
        setBooleanField(term229980, term229980.getClass(), "prettyPrint", false);
        setBooleanField(term229980, term229980.getClass(), "visited", false);
        setField(term229980, term229980.getClass(), "docInfo", null);
        setBooleanField(term229980, term229980.getClass(), "unknown", false);
        setBooleanField(term229980, term229980.getClass(), "resolved", false);
        setField(term229980, term229980.getClass(), "resolveResult", null);
        setBooleanField(term229980, term229980.getClass(), "inTemplatedCheckVisit", false);
        setField(term229980, term229980.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term109086, args);
        assertTrue(recursiveEquals(term109086, term229980));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


