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

public class FunctionType_isSubtype_2101002158239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132293;
     Object term132551;
     Object term132911;
     Object term132915;

    public FunctionType_isSubtype_2101002158239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term132918 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term132917 = ((Class) term132918).getDeclaredField((String) "INTERFACE");
        ((Field) term132917).setAccessible(true);
        Object enum267 = ((Field) term132917).get((Object) null);
        term132293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term132293, term132293.getClass(), "kind", enum267);
        term132551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term133212 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term133211 = ((Class) term133212).getDeclaredField((String) "INTERFACE");
        ((Field) term133211).setAccessible(true);
        Object enum268 = ((Field) term133211).get((Object) null);
        term132911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term132911, term132911.getClass(), "call", null);
        setField(term132911, term132911.getClass(), "prototype", null);
        setField(term132911, term132911.getClass(), "kind", enum268);
        setField(term132911, term132911.getClass(), "typeOfThis", null);
        setField(term132911, term132911.getClass(), "source", null);
        setField(term132911, term132911.getClass(), "implementedInterfaces", null);
        setField(term132911, term132911.getClass(), "subTypes", null);
        setField(term132911, term132911.getClass(), "templateTypeName", null);
        setField(term132911, term132911.getClass(), "className", null);
        setField(term132911, term132911.getClass(), "properties", null);
        setField(term132911, term132911.getClass(), "implicitPrototype", null);
        setBooleanField(term132911, term132911.getClass(), "nativeType", false);
        setBooleanField(term132911, term132911.getClass(), "prettyPrint", false);
        setBooleanField(term132911, term132911.getClass(), "visited", false);
        setField(term132911, term132911.getClass(), "docInfo", null);
        setBooleanField(term132911, term132911.getClass(), "unknown", false);
        setBooleanField(term132911, term132911.getClass(), "resolved", false);
        setField(term132911, term132911.getClass(), "resolveResult", null);
        setField(term132911, term132911.getClass(), "registry", null);
        term132915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term132915, term132915.getClass(), "call", null);
        setField(term132915, term132915.getClass(), "prototype", null);
        setField(term132915, term132915.getClass(), "kind", null);
        setField(term132915, term132915.getClass(), "typeOfThis", null);
        setField(term132915, term132915.getClass(), "source", null);
        setField(term132915, term132915.getClass(), "implementedInterfaces", null);
        setField(term132915, term132915.getClass(), "subTypes", null);
        setField(term132915, term132915.getClass(), "templateTypeName", null);
        setField(term132915, term132915.getClass(), "className", null);
        setField(term132915, term132915.getClass(), "properties", null);
        setField(term132915, term132915.getClass(), "implicitPrototype", null);
        setBooleanField(term132915, term132915.getClass(), "nativeType", false);
        setBooleanField(term132915, term132915.getClass(), "prettyPrint", false);
        setBooleanField(term132915, term132915.getClass(), "visited", false);
        setField(term132915, term132915.getClass(), "docInfo", null);
        setBooleanField(term132915, term132915.getClass(), "unknown", false);
        setBooleanField(term132915, term132915.getClass(), "resolved", false);
        setField(term132915, term132915.getClass(), "resolveResult", null);
        setField(term132915, term132915.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term132551;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term132293, args);
        assertTrue(recursiveEquals(term132293, term132911));
        assertTrue(recursiveEquals(term132551, term132915));
        assertTrue(recursiveEquals(retValue, false));
    }

};


