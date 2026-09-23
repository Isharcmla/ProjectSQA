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

public class FunctionType_isEquivalentTo_230708275359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252002;
     Object term252556;
     Object term252900;
     Object term252904;

    public FunctionType_isEquivalentTo_230708275359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term252907 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term252906 = ((Class) term252907).getDeclaredField((String) "INTERFACE");
        ((Field) term252906).setAccessible(true);
        Object enum469 = ((Field) term252906).get((Object) null);
        term252002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term252002, term252002.getClass(), "kind", enum469);
        term252556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term253201 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term253200 = ((Class) term253201).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term253200).setAccessible(true);
        Object enum470 = ((Field) term253200).get((Object) null);
        term252900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term252900, term252900.getClass(), "call", null);
        setField(term252900, term252900.getClass(), "prototype", null);
        setField(term252900, term252900.getClass(), "kind", enum470);
        setField(term252900, term252900.getClass(), "typeOfThis", null);
        setField(term252900, term252900.getClass(), "source", null);
        setField(term252900, term252900.getClass(), "implementedInterfaces", null);
        setField(term252900, term252900.getClass(), "subTypes", null);
        setField(term252900, term252900.getClass(), "templateTypeName", null);
        setField(term252900, term252900.getClass(), "className", null);
        setField(term252900, term252900.getClass(), "properties", null);
        setField(term252900, term252900.getClass(), "implicitPrototype", null);
        setBooleanField(term252900, term252900.getClass(), "nativeType", false);
        setBooleanField(term252900, term252900.getClass(), "prettyPrint", false);
        setBooleanField(term252900, term252900.getClass(), "visited", false);
        setField(term252900, term252900.getClass(), "docInfo", null);
        setBooleanField(term252900, term252900.getClass(), "unknown", false);
        setBooleanField(term252900, term252900.getClass(), "resolved", false);
        setField(term252900, term252900.getClass(), "resolveResult", null);
        setField(term252900, term252900.getClass(), "registry", null);
        term252904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term252904, term252904.getClass(), "call", null);
        setField(term252904, term252904.getClass(), "prototype", null);
        setField(term252904, term252904.getClass(), "kind", null);
        setField(term252904, term252904.getClass(), "typeOfThis", null);
        setField(term252904, term252904.getClass(), "source", null);
        setField(term252904, term252904.getClass(), "implementedInterfaces", null);
        setField(term252904, term252904.getClass(), "subTypes", null);
        setField(term252904, term252904.getClass(), "templateTypeName", null);
        setField(term252904, term252904.getClass(), "className", null);
        setField(term252904, term252904.getClass(), "properties", null);
        setField(term252904, term252904.getClass(), "implicitPrototype", null);
        setBooleanField(term252904, term252904.getClass(), "nativeType", false);
        setBooleanField(term252904, term252904.getClass(), "prettyPrint", false);
        setBooleanField(term252904, term252904.getClass(), "visited", false);
        setField(term252904, term252904.getClass(), "docInfo", null);
        setBooleanField(term252904, term252904.getClass(), "unknown", false);
        setBooleanField(term252904, term252904.getClass(), "resolved", false);
        setField(term252904, term252904.getClass(), "resolveResult", null);
        setField(term252904, term252904.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term252556;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term252002, args);
        assertTrue(recursiveEquals(term252002, term252900));
        assertTrue(recursiveEquals(term252556, term252904));
        assertTrue(recursiveEquals(retValue, false));
    }

};


