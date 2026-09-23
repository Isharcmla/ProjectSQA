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

public class FunctionType_checkFunctionEquivalenceHelper_377004953423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386211;
     Object term386617;
     Object term386621;

    public FunctionType_checkFunctionEquivalenceHelper_377004953423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term386627 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term386626 = ((Class) term386627).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term386626).setAccessible(true);
        Object enum646 = ((Field) term386626).get((Object) null);
        term386211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term386211, term386211.getClass(), "kind", enum646);
        Class<? extends Object> term386927 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term386926 = ((Class) term386927).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term386926).setAccessible(true);
        Object enum647 = ((Field) term386926).get((Object) null);
        term386617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term386617, term386617.getClass(), "call", null);
        setField(term386617, term386617.getClass(), "prototypeSlot", null);
        setField(term386617, term386617.getClass(), "kind", enum647);
        setField(term386617, term386617.getClass(), "propAccess", null);
        setField(term386617, term386617.getClass(), "typeOfThis", null);
        setField(term386617, term386617.getClass(), "source", null);
        setField(term386617, term386617.getClass(), "implementedInterfaces", null);
        setField(term386617, term386617.getClass(), "extendedInterfaces", null);
        setField(term386617, term386617.getClass(), "subTypes", null);
        setField(term386617, term386617.getClass(), "templateTypeNames", null);
        setField(term386617, term386617.getClass(), "className", null);
        setField(term386617, term386617.getClass(), "properties", null);
        setBooleanField(term386617, term386617.getClass(), "nativeType", false);
        setField(term386617, term386617.getClass(), "implicitPrototypeFallback", null);
        setField(term386617, term386617.getClass(), "ownerFunction", null);
        setBooleanField(term386617, term386617.getClass(), "prettyPrint", false);
        setBooleanField(term386617, term386617.getClass(), "visited", false);
        setField(term386617, term386617.getClass(), "docInfo", null);
        setBooleanField(term386617, term386617.getClass(), "unknown", false);
        setBooleanField(term386617, term386617.getClass(), "resolved", false);
        setField(term386617, term386617.getClass(), "resolveResult", null);
        setBooleanField(term386617, term386617.getClass(), "inTemplatedCheckVisit", false);
        setField(term386617, term386617.getClass(), "registry", null);
        Class<? extends Object> term387227 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term387226 = ((Class) term387227).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term387226).setAccessible(true);
        Object enum648 = ((Field) term387226).get((Object) null);
        term386621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term386621, term386621.getClass(), "call", null);
        setField(term386621, term386621.getClass(), "prototypeSlot", null);
        setField(term386621, term386621.getClass(), "kind", enum648);
        setField(term386621, term386621.getClass(), "propAccess", null);
        setField(term386621, term386621.getClass(), "typeOfThis", null);
        setField(term386621, term386621.getClass(), "source", null);
        setField(term386621, term386621.getClass(), "implementedInterfaces", null);
        setField(term386621, term386621.getClass(), "extendedInterfaces", null);
        setField(term386621, term386621.getClass(), "subTypes", null);
        setField(term386621, term386621.getClass(), "templateTypeNames", null);
        setField(term386621, term386621.getClass(), "className", null);
        setField(term386621, term386621.getClass(), "properties", null);
        setBooleanField(term386621, term386621.getClass(), "nativeType", false);
        setField(term386621, term386621.getClass(), "implicitPrototypeFallback", null);
        setField(term386621, term386621.getClass(), "ownerFunction", null);
        setBooleanField(term386621, term386621.getClass(), "prettyPrint", false);
        setBooleanField(term386621, term386621.getClass(), "visited", false);
        setField(term386621, term386621.getClass(), "docInfo", null);
        setBooleanField(term386621, term386621.getClass(), "unknown", false);
        setBooleanField(term386621, term386621.getClass(), "resolved", false);
        setField(term386621, term386621.getClass(), "resolveResult", null);
        setBooleanField(term386621, term386621.getClass(), "inTemplatedCheckVisit", false);
        setField(term386621, term386621.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term386211;
        args[1] = false;
        Object retValue = callMethod(klass, "checkFunctionEquivalenceHelper", argTypes, term386211, args);
        assertTrue(recursiveEquals(term386211, term386617));
        assertTrue(recursiveEquals(term386211, term386621));
        assertTrue(recursiveEquals(retValue, true));
    }

};


