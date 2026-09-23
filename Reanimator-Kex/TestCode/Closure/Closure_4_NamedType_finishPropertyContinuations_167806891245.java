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

public class NamedType_finishPropertyContinuations_167806891245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76309;
     Object term76599;

    public NamedType_finishPropertyContinuations_167806891245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term76409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term76517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term76409, term76409.getClass(), "unknown", true);
        setField(term76409, term76409.getClass(), "implicitPrototypeFallback", term76517);
        setField(term76309, term76309.getClass(), "referencedObjType", term76409);
        term76599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term76600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term76601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term76599, term76599.getClass(), "reference", null);
        setField(term76599, term76599.getClass(), "sourceName", null);
        setIntField(term76599, term76599.getClass(), "lineno", 0);
        setIntField(term76599, term76599.getClass(), "charno", 0);
        setField(term76599, term76599.getClass(), "validator", null);
        setField(term76599, term76599.getClass(), "propertyContinuations", null);
        setField(term76599, term76599.getClass(), "referencedType", null);
        setField(term76600, term76600.getClass(), "call", null);
        setField(term76600, term76600.getClass(), "prototypeSlot", null);
        setField(term76600, term76600.getClass(), "kind", null);
        setField(term76600, term76600.getClass(), "propAccess", null);
        setField(term76600, term76600.getClass(), "typeOfThis", null);
        setField(term76600, term76600.getClass(), "source", null);
        setField(term76600, term76600.getClass(), "implementedInterfaces", null);
        setField(term76600, term76600.getClass(), "extendedInterfaces", null);
        setField(term76600, term76600.getClass(), "subTypes", null);
        setField(term76600, term76600.getClass(), "className", null);
        setField(term76600, term76600.getClass(), "properties", null);
        setBooleanField(term76600, term76600.getClass(), "nativeType", false);
        setField(term76601, term76601.getClass(), "this$0", null);
        setField(term76601, term76601.getClass(), "call", null);
        setField(term76601, term76601.getClass(), "prototypeSlot", null);
        setField(term76601, term76601.getClass(), "kind", null);
        setField(term76601, term76601.getClass(), "propAccess", null);
        setField(term76601, term76601.getClass(), "typeOfThis", null);
        setField(term76601, term76601.getClass(), "source", null);
        setField(term76601, term76601.getClass(), "implementedInterfaces", null);
        setField(term76601, term76601.getClass(), "extendedInterfaces", null);
        setField(term76601, term76601.getClass(), "subTypes", null);
        setField(term76601, term76601.getClass(), "className", null);
        setField(term76601, term76601.getClass(), "properties", null);
        setBooleanField(term76601, term76601.getClass(), "nativeType", false);
        setField(term76601, term76601.getClass(), "implicitPrototypeFallback", null);
        setField(term76601, term76601.getClass(), "ownerFunction", null);
        setBooleanField(term76601, term76601.getClass(), "prettyPrint", false);
        setBooleanField(term76601, term76601.getClass(), "visited", false);
        setField(term76601, term76601.getClass(), "docInfo", null);
        setBooleanField(term76601, term76601.getClass(), "unknown", false);
        setBooleanField(term76601, term76601.getClass(), "resolved", false);
        setField(term76601, term76601.getClass(), "resolveResult", null);
        setField(term76601, term76601.getClass(), "templateKeys", null);
        setField(term76601, term76601.getClass(), "templatizedTypes", null);
        setBooleanField(term76601, term76601.getClass(), "inTemplatedCheckVisit", false);
        setField(term76601, term76601.getClass(), "registry", null);
        setField(term76600, term76600.getClass(), "implicitPrototypeFallback", term76601);
        setField(term76600, term76600.getClass(), "ownerFunction", null);
        setBooleanField(term76600, term76600.getClass(), "prettyPrint", false);
        setBooleanField(term76600, term76600.getClass(), "visited", false);
        setField(term76600, term76600.getClass(), "docInfo", null);
        setBooleanField(term76600, term76600.getClass(), "unknown", false);
        setBooleanField(term76600, term76600.getClass(), "resolved", false);
        setField(term76600, term76600.getClass(), "resolveResult", null);
        setField(term76600, term76600.getClass(), "templateKeys", null);
        setField(term76600, term76600.getClass(), "templatizedTypes", null);
        setBooleanField(term76600, term76600.getClass(), "inTemplatedCheckVisit", false);
        setField(term76600, term76600.getClass(), "registry", null);
        setField(term76599, term76599.getClass(), "referencedObjType", term76600);
        setBooleanField(term76599, term76599.getClass(), "visited", false);
        setField(term76599, term76599.getClass(), "docInfo", null);
        setBooleanField(term76599, term76599.getClass(), "unknown", false);
        setBooleanField(term76599, term76599.getClass(), "resolved", false);
        setField(term76599, term76599.getClass(), "resolveResult", null);
        setField(term76599, term76599.getClass(), "templateKeys", null);
        setField(term76599, term76599.getClass(), "templatizedTypes", null);
        setBooleanField(term76599, term76599.getClass(), "inTemplatedCheckVisit", false);
        setField(term76599, term76599.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term76309, args);
        assertTrue(recursiveEquals(term76309, term76599));
    }

};


