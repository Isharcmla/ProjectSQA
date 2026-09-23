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

public class FunctionType_isSubtype_2101002158453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372275;
     Object term372705;
     Object term372709;

    public FunctionType_isSubtype_2101002158453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term372715 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term372714 = ((Class) term372715).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term372714).setAccessible(true);
        Object enum678 = ((Field) term372714).get((Object) null);
        term372275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term372275, term372275.getClass(), "kind", enum678);
        Class<? extends Object> term373015 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term373014 = ((Class) term373015).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term373014).setAccessible(true);
        Object enum679 = ((Field) term373014).get((Object) null);
        term372705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term372705, term372705.getClass(), "call", null);
        setField(term372705, term372705.getClass(), "prototype", null);
        setField(term372705, term372705.getClass(), "kind", enum679);
        setField(term372705, term372705.getClass(), "typeOfThis", null);
        setField(term372705, term372705.getClass(), "source", null);
        setField(term372705, term372705.getClass(), "implementedInterfaces", null);
        setField(term372705, term372705.getClass(), "subTypes", null);
        setField(term372705, term372705.getClass(), "templateTypeName", null);
        setField(term372705, term372705.getClass(), "className", null);
        setField(term372705, term372705.getClass(), "properties", null);
        setField(term372705, term372705.getClass(), "implicitPrototype", null);
        setBooleanField(term372705, term372705.getClass(), "nativeType", false);
        setBooleanField(term372705, term372705.getClass(), "prettyPrint", false);
        setBooleanField(term372705, term372705.getClass(), "visited", false);
        setField(term372705, term372705.getClass(), "docInfo", null);
        setBooleanField(term372705, term372705.getClass(), "unknown", false);
        setBooleanField(term372705, term372705.getClass(), "resolved", false);
        setField(term372705, term372705.getClass(), "resolveResult", null);
        setField(term372705, term372705.getClass(), "registry", null);
        Class<? extends Object> term373315 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term373314 = ((Class) term373315).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term373314).setAccessible(true);
        Object enum680 = ((Field) term373314).get((Object) null);
        term372709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term372709, term372709.getClass(), "call", null);
        setField(term372709, term372709.getClass(), "prototype", null);
        setField(term372709, term372709.getClass(), "kind", enum680);
        setField(term372709, term372709.getClass(), "typeOfThis", null);
        setField(term372709, term372709.getClass(), "source", null);
        setField(term372709, term372709.getClass(), "implementedInterfaces", null);
        setField(term372709, term372709.getClass(), "subTypes", null);
        setField(term372709, term372709.getClass(), "templateTypeName", null);
        setField(term372709, term372709.getClass(), "className", null);
        setField(term372709, term372709.getClass(), "properties", null);
        setField(term372709, term372709.getClass(), "implicitPrototype", null);
        setBooleanField(term372709, term372709.getClass(), "nativeType", false);
        setBooleanField(term372709, term372709.getClass(), "prettyPrint", false);
        setBooleanField(term372709, term372709.getClass(), "visited", false);
        setField(term372709, term372709.getClass(), "docInfo", null);
        setBooleanField(term372709, term372709.getClass(), "unknown", false);
        setBooleanField(term372709, term372709.getClass(), "resolved", false);
        setField(term372709, term372709.getClass(), "resolveResult", null);
        setField(term372709, term372709.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term372275;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term372275, args);
        assertTrue(recursiveEquals(term372275, term372705));
        assertTrue(recursiveEquals(term372275, term372709));
        assertTrue(recursiveEquals(retValue, true));
    }

};


