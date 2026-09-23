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

public class FunctionType_supAndInfHelper_1603977104379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278197;
     Object term278629;
     Object term278633;
     Object term278573;

    public FunctionType_supAndInfHelper_1603977104379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term278638 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term278637 = ((Class) term278638).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term278637).setAccessible(true);
        Object enum482 = ((Field) term278637).get((Object) null);
        term278197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term278197, term278197.getClass(), "kind", enum482);
        Class<? extends Object> term278938 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term278937 = ((Class) term278938).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term278937).setAccessible(true);
        Object enum483 = ((Field) term278937).get((Object) null);
        term278629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term278629, term278629.getClass(), "call", null);
        setField(term278629, term278629.getClass(), "prototype", null);
        setField(term278629, term278629.getClass(), "kind", enum483);
        setField(term278629, term278629.getClass(), "typeOfThis", null);
        setField(term278629, term278629.getClass(), "source", null);
        setField(term278629, term278629.getClass(), "implementedInterfaces", null);
        setField(term278629, term278629.getClass(), "subTypes", null);
        setField(term278629, term278629.getClass(), "templateTypeName", null);
        setField(term278629, term278629.getClass(), "className", null);
        setField(term278629, term278629.getClass(), "properties", null);
        setBooleanField(term278629, term278629.getClass(), "nativeType", false);
        setField(term278629, term278629.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term278629, term278629.getClass(), "prettyPrint", false);
        setBooleanField(term278629, term278629.getClass(), "visited", false);
        setField(term278629, term278629.getClass(), "docInfo", null);
        setBooleanField(term278629, term278629.getClass(), "unknown", false);
        setBooleanField(term278629, term278629.getClass(), "resolved", false);
        setField(term278629, term278629.getClass(), "resolveResult", null);
        setField(term278629, term278629.getClass(), "registry", null);
        Class<? extends Object> term279238 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term279237 = ((Class) term279238).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term279237).setAccessible(true);
        Object enum484 = ((Field) term279237).get((Object) null);
        term278633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term278633, term278633.getClass(), "call", null);
        setField(term278633, term278633.getClass(), "prototype", null);
        setField(term278633, term278633.getClass(), "kind", enum484);
        setField(term278633, term278633.getClass(), "typeOfThis", null);
        setField(term278633, term278633.getClass(), "source", null);
        setField(term278633, term278633.getClass(), "implementedInterfaces", null);
        setField(term278633, term278633.getClass(), "subTypes", null);
        setField(term278633, term278633.getClass(), "templateTypeName", null);
        setField(term278633, term278633.getClass(), "className", null);
        setField(term278633, term278633.getClass(), "properties", null);
        setBooleanField(term278633, term278633.getClass(), "nativeType", false);
        setField(term278633, term278633.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term278633, term278633.getClass(), "prettyPrint", false);
        setBooleanField(term278633, term278633.getClass(), "visited", false);
        setField(term278633, term278633.getClass(), "docInfo", null);
        setBooleanField(term278633, term278633.getClass(), "unknown", false);
        setBooleanField(term278633, term278633.getClass(), "resolved", false);
        setField(term278633, term278633.getClass(), "resolveResult", null);
        setField(term278633, term278633.getClass(), "registry", null);
        Class<? extends Object> term279538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term279537 = ((Class) term279538).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term279537).setAccessible(true);
        Object enum485 = ((Field) term279537).get((Object) null);
        term278573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term278573, term278573.getClass(), "call", null);
        setField(term278573, term278573.getClass(), "prototype", null);
        setField(term278573, term278573.getClass(), "kind", enum485);
        setField(term278573, term278573.getClass(), "typeOfThis", null);
        setField(term278573, term278573.getClass(), "source", null);
        setField(term278573, term278573.getClass(), "implementedInterfaces", null);
        setField(term278573, term278573.getClass(), "subTypes", null);
        setField(term278573, term278573.getClass(), "templateTypeName", null);
        setField(term278573, term278573.getClass(), "className", null);
        setField(term278573, term278573.getClass(), "properties", null);
        setBooleanField(term278573, term278573.getClass(), "nativeType", false);
        setField(term278573, term278573.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term278573, term278573.getClass(), "prettyPrint", false);
        setBooleanField(term278573, term278573.getClass(), "visited", false);
        setField(term278573, term278573.getClass(), "docInfo", null);
        setBooleanField(term278573, term278573.getClass(), "unknown", false);
        setBooleanField(term278573, term278573.getClass(), "resolved", false);
        setField(term278573, term278573.getClass(), "resolveResult", null);
        setField(term278573, term278573.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term278197;
        args[1] = false;
        Object retValue = callMethod(klass, "supAndInfHelper", argTypes, term278197, args);
        assertTrue(recursiveEquals(term278197, term278629));
        assertTrue(recursiveEquals(term278197, term278633));
        assertTrue(recursiveEquals(retValue, term278573));
    }

};


