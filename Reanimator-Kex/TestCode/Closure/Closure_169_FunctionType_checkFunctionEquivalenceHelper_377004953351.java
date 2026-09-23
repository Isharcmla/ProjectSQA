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
import java.lang.String;
import java.lang.Object;

public class FunctionType_checkFunctionEquivalenceHelper_377004953351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318950;
     Object term319198;
     Object term319536;
     Object term319540;

    public FunctionType_checkFunctionEquivalenceHelper_377004953351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term319543 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term319542 = ((Class) term319543).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term319542).setAccessible(true);
        Object enum555 = ((Field) term319542).get((Object) null);
        term318950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term318950, term318950.getClass(), "kind", enum555);
        term319198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Class<? extends Object> term319843 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term319842 = ((Class) term319843).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term319842).setAccessible(true);
        Object enum556 = ((Field) term319842).get((Object) null);
        term319536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term319536, term319536.getClass(), "call", null);
        setField(term319536, term319536.getClass(), "prototypeSlot", null);
        setField(term319536, term319536.getClass(), "kind", enum556);
        setField(term319536, term319536.getClass(), "propAccess", null);
        setField(term319536, term319536.getClass(), "typeOfThis", null);
        setField(term319536, term319536.getClass(), "source", null);
        setField(term319536, term319536.getClass(), "implementedInterfaces", null);
        setField(term319536, term319536.getClass(), "extendedInterfaces", null);
        setField(term319536, term319536.getClass(), "subTypes", null);
        setField(term319536, term319536.getClass(), "templateTypeNames", null);
        setField(term319536, term319536.getClass(), "className", null);
        setField(term319536, term319536.getClass(), "properties", null);
        setBooleanField(term319536, term319536.getClass(), "nativeType", false);
        setField(term319536, term319536.getClass(), "implicitPrototypeFallback", null);
        setField(term319536, term319536.getClass(), "ownerFunction", null);
        setBooleanField(term319536, term319536.getClass(), "prettyPrint", false);
        setBooleanField(term319536, term319536.getClass(), "visited", false);
        setField(term319536, term319536.getClass(), "docInfo", null);
        setBooleanField(term319536, term319536.getClass(), "unknown", false);
        setBooleanField(term319536, term319536.getClass(), "resolved", false);
        setField(term319536, term319536.getClass(), "resolveResult", null);
        setBooleanField(term319536, term319536.getClass(), "inTemplatedCheckVisit", false);
        setField(term319536, term319536.getClass(), "registry", null);
        term319540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term319540, term319540.getClass(), "call", null);
        setField(term319540, term319540.getClass(), "prototypeSlot", null);
        setField(term319540, term319540.getClass(), "kind", null);
        setField(term319540, term319540.getClass(), "propAccess", null);
        setField(term319540, term319540.getClass(), "typeOfThis", null);
        setField(term319540, term319540.getClass(), "source", null);
        setField(term319540, term319540.getClass(), "implementedInterfaces", null);
        setField(term319540, term319540.getClass(), "extendedInterfaces", null);
        setField(term319540, term319540.getClass(), "subTypes", null);
        setField(term319540, term319540.getClass(), "templateTypeNames", null);
        setField(term319540, term319540.getClass(), "className", null);
        setField(term319540, term319540.getClass(), "properties", null);
        setBooleanField(term319540, term319540.getClass(), "nativeType", false);
        setField(term319540, term319540.getClass(), "implicitPrototypeFallback", null);
        setField(term319540, term319540.getClass(), "ownerFunction", null);
        setBooleanField(term319540, term319540.getClass(), "prettyPrint", false);
        setBooleanField(term319540, term319540.getClass(), "visited", false);
        setField(term319540, term319540.getClass(), "docInfo", null);
        setBooleanField(term319540, term319540.getClass(), "unknown", false);
        setBooleanField(term319540, term319540.getClass(), "resolved", false);
        setField(term319540, term319540.getClass(), "resolveResult", null);
        setBooleanField(term319540, term319540.getClass(), "inTemplatedCheckVisit", false);
        setField(term319540, term319540.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term319198;
        args[1] = false;
        Object retValue = callMethod(klass, "checkFunctionEquivalenceHelper", argTypes, term318950, args);
        assertTrue(recursiveEquals(term318950, term319536));
        assertTrue(recursiveEquals(term319198, term319540));
        assertTrue(recursiveEquals(retValue, false));
    }

};


