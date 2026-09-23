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

public class FunctionType_supAndInfHelper_1603977104443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364881;
     Object term365313;
     Object term365317;
     Object term365257;

    public FunctionType_supAndInfHelper_1603977104443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term365322 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term365321 = ((Class) term365322).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term365321).setAccessible(true);
        Object enum621 = ((Field) term365321).get((Object) null);
        term364881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term364881, term364881.getClass(), "kind", enum621);
        Class<? extends Object> term365622 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term365621 = ((Class) term365622).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term365621).setAccessible(true);
        Object enum622 = ((Field) term365621).get((Object) null);
        term365313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term365313, term365313.getClass(), "call", null);
        setField(term365313, term365313.getClass(), "prototype", null);
        setField(term365313, term365313.getClass(), "kind", enum622);
        setField(term365313, term365313.getClass(), "typeOfThis", null);
        setField(term365313, term365313.getClass(), "source", null);
        setField(term365313, term365313.getClass(), "implementedInterfaces", null);
        setField(term365313, term365313.getClass(), "subTypes", null);
        setField(term365313, term365313.getClass(), "templateTypeName", null);
        setField(term365313, term365313.getClass(), "className", null);
        setField(term365313, term365313.getClass(), "properties", null);
        setBooleanField(term365313, term365313.getClass(), "nativeType", false);
        setField(term365313, term365313.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term365313, term365313.getClass(), "prettyPrint", false);
        setBooleanField(term365313, term365313.getClass(), "visited", false);
        setField(term365313, term365313.getClass(), "docInfo", null);
        setBooleanField(term365313, term365313.getClass(), "unknown", false);
        setBooleanField(term365313, term365313.getClass(), "resolved", false);
        setField(term365313, term365313.getClass(), "resolveResult", null);
        setField(term365313, term365313.getClass(), "registry", null);
        Class<? extends Object> term365922 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term365921 = ((Class) term365922).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term365921).setAccessible(true);
        Object enum623 = ((Field) term365921).get((Object) null);
        term365317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term365317, term365317.getClass(), "call", null);
        setField(term365317, term365317.getClass(), "prototype", null);
        setField(term365317, term365317.getClass(), "kind", enum623);
        setField(term365317, term365317.getClass(), "typeOfThis", null);
        setField(term365317, term365317.getClass(), "source", null);
        setField(term365317, term365317.getClass(), "implementedInterfaces", null);
        setField(term365317, term365317.getClass(), "subTypes", null);
        setField(term365317, term365317.getClass(), "templateTypeName", null);
        setField(term365317, term365317.getClass(), "className", null);
        setField(term365317, term365317.getClass(), "properties", null);
        setBooleanField(term365317, term365317.getClass(), "nativeType", false);
        setField(term365317, term365317.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term365317, term365317.getClass(), "prettyPrint", false);
        setBooleanField(term365317, term365317.getClass(), "visited", false);
        setField(term365317, term365317.getClass(), "docInfo", null);
        setBooleanField(term365317, term365317.getClass(), "unknown", false);
        setBooleanField(term365317, term365317.getClass(), "resolved", false);
        setField(term365317, term365317.getClass(), "resolveResult", null);
        setField(term365317, term365317.getClass(), "registry", null);
        Class<? extends Object> term366222 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term366221 = ((Class) term366222).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term366221).setAccessible(true);
        Object enum624 = ((Field) term366221).get((Object) null);
        term365257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term365257, term365257.getClass(), "call", null);
        setField(term365257, term365257.getClass(), "prototype", null);
        setField(term365257, term365257.getClass(), "kind", enum624);
        setField(term365257, term365257.getClass(), "typeOfThis", null);
        setField(term365257, term365257.getClass(), "source", null);
        setField(term365257, term365257.getClass(), "implementedInterfaces", null);
        setField(term365257, term365257.getClass(), "subTypes", null);
        setField(term365257, term365257.getClass(), "templateTypeName", null);
        setField(term365257, term365257.getClass(), "className", null);
        setField(term365257, term365257.getClass(), "properties", null);
        setBooleanField(term365257, term365257.getClass(), "nativeType", false);
        setField(term365257, term365257.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term365257, term365257.getClass(), "prettyPrint", false);
        setBooleanField(term365257, term365257.getClass(), "visited", false);
        setField(term365257, term365257.getClass(), "docInfo", null);
        setBooleanField(term365257, term365257.getClass(), "unknown", false);
        setBooleanField(term365257, term365257.getClass(), "resolved", false);
        setField(term365257, term365257.getClass(), "resolveResult", null);
        setField(term365257, term365257.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term364881;
        args[1] = false;
        Object retValue = callMethod(klass, "supAndInfHelper", argTypes, term364881, args);
        assertTrue(recursiveEquals(term364881, term365313));
        assertTrue(recursiveEquals(term364881, term365317));
        assertTrue(recursiveEquals(retValue, term365257));
    }

};


