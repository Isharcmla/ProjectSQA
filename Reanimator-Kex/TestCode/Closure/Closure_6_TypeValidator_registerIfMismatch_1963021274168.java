package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class TypeValidator_registerIfMismatch_1963021274168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41527;
     Object term41692;
     Object term41981;
     Object term41982;
     Object term41983;

    public TypeValidator_registerIfMismatch_1963021274168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41527 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term41692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term41981 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term41981, term41981.getClass(), "compiler", null);
        setField(term41981, term41981.getClass(), "typeRegistry", null);
        setField(term41981, term41981.getClass(), "allValueTypes", null);
        setBooleanField(term41981, term41981.getClass(), "shouldReport", false);
        setField(term41981, term41981.getClass(), "nullOrUndefined", null);
        setField(term41981, term41981.getClass(), "mismatches", null);
        term41982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term41982, term41982.getClass(), "call", null);
        setField(term41982, term41982.getClass(), "prototypeSlot", null);
        setField(term41982, term41982.getClass(), "kind", null);
        setField(term41982, term41982.getClass(), "propAccess", null);
        setField(term41982, term41982.getClass(), "typeOfThis", null);
        setField(term41982, term41982.getClass(), "source", null);
        setField(term41982, term41982.getClass(), "implementedInterfaces", null);
        setField(term41982, term41982.getClass(), "extendedInterfaces", null);
        setField(term41982, term41982.getClass(), "subTypes", null);
        setField(term41982, term41982.getClass(), "className", null);
        setField(term41982, term41982.getClass(), "properties", null);
        setBooleanField(term41982, term41982.getClass(), "nativeType", false);
        setField(term41982, term41982.getClass(), "implicitPrototypeFallback", null);
        setField(term41982, term41982.getClass(), "ownerFunction", null);
        setBooleanField(term41982, term41982.getClass(), "prettyPrint", false);
        setBooleanField(term41982, term41982.getClass(), "visited", false);
        setField(term41982, term41982.getClass(), "docInfo", null);
        setBooleanField(term41982, term41982.getClass(), "unknown", false);
        setBooleanField(term41982, term41982.getClass(), "resolved", false);
        setField(term41982, term41982.getClass(), "resolveResult", null);
        setField(term41982, term41982.getClass(), "templateKeys", null);
        setField(term41982, term41982.getClass(), "templatizedTypes", null);
        setBooleanField(term41982, term41982.getClass(), "inTemplatedCheckVisit", false);
        setField(term41982, term41982.getClass(), "registry", null);
        term41983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term41983, term41983.getClass(), "call", null);
        setField(term41983, term41983.getClass(), "prototypeSlot", null);
        setField(term41983, term41983.getClass(), "kind", null);
        setField(term41983, term41983.getClass(), "propAccess", null);
        setField(term41983, term41983.getClass(), "typeOfThis", null);
        setField(term41983, term41983.getClass(), "source", null);
        setField(term41983, term41983.getClass(), "implementedInterfaces", null);
        setField(term41983, term41983.getClass(), "extendedInterfaces", null);
        setField(term41983, term41983.getClass(), "subTypes", null);
        setField(term41983, term41983.getClass(), "className", null);
        setField(term41983, term41983.getClass(), "properties", null);
        setBooleanField(term41983, term41983.getClass(), "nativeType", false);
        setField(term41983, term41983.getClass(), "implicitPrototypeFallback", null);
        setField(term41983, term41983.getClass(), "ownerFunction", null);
        setBooleanField(term41983, term41983.getClass(), "prettyPrint", false);
        setBooleanField(term41983, term41983.getClass(), "visited", false);
        setField(term41983, term41983.getClass(), "docInfo", null);
        setBooleanField(term41983, term41983.getClass(), "unknown", false);
        setBooleanField(term41983, term41983.getClass(), "resolved", false);
        setField(term41983, term41983.getClass(), "resolveResult", null);
        setField(term41983, term41983.getClass(), "templateKeys", null);
        setField(term41983, term41983.getClass(), "templatizedTypes", null);
        setBooleanField(term41983, term41983.getClass(), "inTemplatedCheckVisit", false);
        setField(term41983, term41983.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[3];
        args[0] = term41692;
        args[1] = term41692;
        args[2] = null;
        callMethod(klass, "registerIfMismatch", argTypes, term41527, args);
        assertTrue(recursiveEquals(term41527, term41981));
        assertTrue(recursiveEquals(term41692, term41982));
        assertTrue(recursiveEquals(term41692, term41983));
    }

};


