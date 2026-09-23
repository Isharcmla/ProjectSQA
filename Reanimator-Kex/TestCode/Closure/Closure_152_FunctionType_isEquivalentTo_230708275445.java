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

public class FunctionType_isEquivalentTo_230708275445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366722;
     Object term367276;
     Object term367615;
     Object term367619;

    public FunctionType_isEquivalentTo_230708275445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term367622 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term367621 = ((Class) term367622).getDeclaredField((String) "ORDINARY");
        ((Field) term367621).setAccessible(true);
        Object enum626 = ((Field) term367621).get((Object) null);
        term366722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term366722, term366722.getClass(), "kind", enum626);
        term367276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term367913 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term367912 = ((Class) term367913).getDeclaredField((String) "INTERFACE");
        ((Field) term367912).setAccessible(true);
        Object enum627 = ((Field) term367912).get((Object) null);
        term367615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term367615, term367615.getClass(), "call", null);
        setField(term367615, term367615.getClass(), "prototype", null);
        setField(term367615, term367615.getClass(), "kind", enum627);
        setField(term367615, term367615.getClass(), "typeOfThis", null);
        setField(term367615, term367615.getClass(), "source", null);
        setField(term367615, term367615.getClass(), "implementedInterfaces", null);
        setField(term367615, term367615.getClass(), "subTypes", null);
        setField(term367615, term367615.getClass(), "templateTypeName", null);
        setField(term367615, term367615.getClass(), "className", null);
        setField(term367615, term367615.getClass(), "properties", null);
        setBooleanField(term367615, term367615.getClass(), "nativeType", false);
        setField(term367615, term367615.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term367615, term367615.getClass(), "prettyPrint", false);
        setBooleanField(term367615, term367615.getClass(), "visited", false);
        setField(term367615, term367615.getClass(), "docInfo", null);
        setBooleanField(term367615, term367615.getClass(), "unknown", false);
        setBooleanField(term367615, term367615.getClass(), "resolved", false);
        setField(term367615, term367615.getClass(), "resolveResult", null);
        setField(term367615, term367615.getClass(), "registry", null);
        term367619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term367619, term367619.getClass(), "call", null);
        setField(term367619, term367619.getClass(), "prototype", null);
        setField(term367619, term367619.getClass(), "kind", null);
        setField(term367619, term367619.getClass(), "typeOfThis", null);
        setField(term367619, term367619.getClass(), "source", null);
        setField(term367619, term367619.getClass(), "implementedInterfaces", null);
        setField(term367619, term367619.getClass(), "subTypes", null);
        setField(term367619, term367619.getClass(), "templateTypeName", null);
        setField(term367619, term367619.getClass(), "className", null);
        setField(term367619, term367619.getClass(), "properties", null);
        setBooleanField(term367619, term367619.getClass(), "nativeType", false);
        setField(term367619, term367619.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term367619, term367619.getClass(), "prettyPrint", false);
        setBooleanField(term367619, term367619.getClass(), "visited", false);
        setField(term367619, term367619.getClass(), "docInfo", null);
        setBooleanField(term367619, term367619.getClass(), "unknown", false);
        setBooleanField(term367619, term367619.getClass(), "resolved", false);
        setField(term367619, term367619.getClass(), "resolveResult", null);
        setField(term367619, term367619.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term367276;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term366722, args);
        assertTrue(recursiveEquals(term366722, term367615));
        assertTrue(recursiveEquals(term367276, term367619));
        assertTrue(recursiveEquals(retValue, false));
    }

};


