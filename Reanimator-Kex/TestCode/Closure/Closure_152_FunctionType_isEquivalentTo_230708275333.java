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

public class FunctionType_isEquivalentTo_230708275333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222754;
     Object term223308;
     Object term224042;
     Object term224046;

    public FunctionType_isEquivalentTo_230708275333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term224052 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term224051 = ((Class) term224052).getDeclaredField((String) "ORDINARY");
        ((Field) term224051).setAccessible(true);
        Object enum392 = ((Field) term224051).get((Object) null);
        term222754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term222754, term222754.getClass(), "kind", enum392);
        setField(term222754, term222754.getClass(), "typeOfThis", term222754);
        Class<? extends Object> term224343 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term224342 = ((Class) term224343).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term224342).setAccessible(true);
        Object enum393 = ((Field) term224342).get((Object) null);
        term223308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term223308, term223308.getClass(), "kind", enum393);
        setField(term223308, term223308.getClass(), "typeOfThis", null);
        Class<? extends Object> term224643 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term224642 = ((Class) term224643).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term224642).setAccessible(true);
        Object enum394 = ((Field) term224642).get((Object) null);
        term224042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term224042, term224042.getClass(), "call", null);
        setField(term224042, term224042.getClass(), "prototype", null);
        setField(term224042, term224042.getClass(), "kind", enum394);
        setField(term224042, term224042.getClass(), "typeOfThis", term224042);
        setField(term224042, term224042.getClass(), "source", null);
        setField(term224042, term224042.getClass(), "implementedInterfaces", null);
        setField(term224042, term224042.getClass(), "subTypes", null);
        setField(term224042, term224042.getClass(), "templateTypeName", null);
        setField(term224042, term224042.getClass(), "className", null);
        setField(term224042, term224042.getClass(), "properties", null);
        setBooleanField(term224042, term224042.getClass(), "nativeType", false);
        setField(term224042, term224042.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term224042, term224042.getClass(), "prettyPrint", false);
        setBooleanField(term224042, term224042.getClass(), "visited", false);
        setField(term224042, term224042.getClass(), "docInfo", null);
        setBooleanField(term224042, term224042.getClass(), "unknown", false);
        setBooleanField(term224042, term224042.getClass(), "resolved", false);
        setField(term224042, term224042.getClass(), "resolveResult", null);
        setField(term224042, term224042.getClass(), "registry", null);
        Class<? extends Object> term224943 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term224942 = ((Class) term224943).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term224942).setAccessible(true);
        Object enum395 = ((Field) term224942).get((Object) null);
        term224046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term224046, term224046.getClass(), "call", null);
        setField(term224046, term224046.getClass(), "prototype", null);
        setField(term224046, term224046.getClass(), "kind", enum395);
        setField(term224046, term224046.getClass(), "typeOfThis", null);
        setField(term224046, term224046.getClass(), "source", null);
        setField(term224046, term224046.getClass(), "implementedInterfaces", null);
        setField(term224046, term224046.getClass(), "subTypes", null);
        setField(term224046, term224046.getClass(), "templateTypeName", null);
        setField(term224046, term224046.getClass(), "className", null);
        setField(term224046, term224046.getClass(), "properties", null);
        setBooleanField(term224046, term224046.getClass(), "nativeType", false);
        setField(term224046, term224046.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term224046, term224046.getClass(), "prettyPrint", false);
        setBooleanField(term224046, term224046.getClass(), "visited", false);
        setField(term224046, term224046.getClass(), "docInfo", null);
        setBooleanField(term224046, term224046.getClass(), "unknown", false);
        setBooleanField(term224046, term224046.getClass(), "resolved", false);
        setField(term224046, term224046.getClass(), "resolveResult", null);
        setField(term224046, term224046.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term223308;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term222754, args);
        assertTrue(recursiveEquals(term222754, term224042));
        assertTrue(recursiveEquals(term223308, term224046));
        assertTrue(recursiveEquals(retValue, false));
    }

};


