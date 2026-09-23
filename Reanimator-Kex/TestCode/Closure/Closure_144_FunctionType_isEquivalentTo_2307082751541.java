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

public class FunctionType_isEquivalentTo_2307082751541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2254929;
     Object term2255187;
     Object term2255531;
     Object term2255535;

    public FunctionType_isEquivalentTo_2307082751541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2255538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2255537 = ((Class) term2255538).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2255537).setAccessible(true);
        Object enum4025 = ((Field) term2255537).get((Object) null);
        term2254929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2254929, term2254929.getClass(), "kind", enum4025);
        term2255187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term2255838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2255837 = ((Class) term2255838).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2255837).setAccessible(true);
        Object enum4026 = ((Field) term2255837).get((Object) null);
        term2255531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2255531, term2255531.getClass(), "call", null);
        setField(term2255531, term2255531.getClass(), "prototype", null);
        setField(term2255531, term2255531.getClass(), "kind", enum4026);
        setField(term2255531, term2255531.getClass(), "typeOfThis", null);
        setField(term2255531, term2255531.getClass(), "source", null);
        setField(term2255531, term2255531.getClass(), "implementedInterfaces", null);
        setField(term2255531, term2255531.getClass(), "subTypes", null);
        setField(term2255531, term2255531.getClass(), "templateTypeName", null);
        setField(term2255531, term2255531.getClass(), "className", null);
        setField(term2255531, term2255531.getClass(), "properties", null);
        setField(term2255531, term2255531.getClass(), "implicitPrototype", null);
        setBooleanField(term2255531, term2255531.getClass(), "nativeType", false);
        setBooleanField(term2255531, term2255531.getClass(), "prettyPrint", false);
        setBooleanField(term2255531, term2255531.getClass(), "visited", false);
        setField(term2255531, term2255531.getClass(), "docInfo", null);
        setBooleanField(term2255531, term2255531.getClass(), "unknown", false);
        setBooleanField(term2255531, term2255531.getClass(), "resolved", false);
        setField(term2255531, term2255531.getClass(), "resolveResult", null);
        setField(term2255531, term2255531.getClass(), "registry", null);
        term2255535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2255535, term2255535.getClass(), "call", null);
        setField(term2255535, term2255535.getClass(), "prototype", null);
        setField(term2255535, term2255535.getClass(), "kind", null);
        setField(term2255535, term2255535.getClass(), "typeOfThis", null);
        setField(term2255535, term2255535.getClass(), "source", null);
        setField(term2255535, term2255535.getClass(), "implementedInterfaces", null);
        setField(term2255535, term2255535.getClass(), "subTypes", null);
        setField(term2255535, term2255535.getClass(), "templateTypeName", null);
        setField(term2255535, term2255535.getClass(), "className", null);
        setField(term2255535, term2255535.getClass(), "properties", null);
        setField(term2255535, term2255535.getClass(), "implicitPrototype", null);
        setBooleanField(term2255535, term2255535.getClass(), "nativeType", false);
        setBooleanField(term2255535, term2255535.getClass(), "prettyPrint", false);
        setBooleanField(term2255535, term2255535.getClass(), "visited", false);
        setField(term2255535, term2255535.getClass(), "docInfo", null);
        setBooleanField(term2255535, term2255535.getClass(), "unknown", false);
        setBooleanField(term2255535, term2255535.getClass(), "resolved", false);
        setField(term2255535, term2255535.getClass(), "resolveResult", null);
        setField(term2255535, term2255535.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2255187;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term2254929, args);
        assertTrue(recursiveEquals(term2254929, term2255531));
        assertTrue(recursiveEquals(term2255187, term2255535));
        assertTrue(recursiveEquals(retValue, false));
    }

};


