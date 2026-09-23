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

public class FunctionType_setPrototype_1918602805185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84312;
     Object term84578;
     Object term85593;
     Object term85598;

    public FunctionType_setPrototype_1918602805185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85601 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term85600 = ((Class) term85601).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term85600).setAccessible(true);
        Object enum180 = ((Field) term85600).get((Object) null);
        term84312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term84312, term84312.getClass(), "kind", enum180);
        term84578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Class<? extends Object> term85901 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term85900 = ((Class) term85901).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term85900).setAccessible(true);
        Object enum181 = ((Field) term85900).get((Object) null);
        term85593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term85594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term85593, term85593.getClass(), "call", null);
        setField(term85594, term85594.getClass(), "ownerFunction", null);
        setField(term85594, term85594.getClass(), "className", null);
        setField(term85594, term85594.getClass(), "properties", null);
        setField(term85594, term85594.getClass(), "implicitPrototype", null);
        setBooleanField(term85594, term85594.getClass(), "nativeType", false);
        setBooleanField(term85594, term85594.getClass(), "visited", false);
        setField(term85594, term85594.getClass(), "docInfo", null);
        setBooleanField(term85594, term85594.getClass(), "unknown", false);
        setBooleanField(term85594, term85594.getClass(), "resolved", false);
        setField(term85594, term85594.getClass(), "resolveResult", null);
        setField(term85594, term85594.getClass(), "registry", null);
        setField(term85593, term85593.getClass(), "prototype", term85594);
        setField(term85593, term85593.getClass(), "kind", enum181);
        setField(term85593, term85593.getClass(), "typeOfThis", null);
        setField(term85593, term85593.getClass(), "source", null);
        setField(term85593, term85593.getClass(), "implementedInterfaces", null);
        setField(term85593, term85593.getClass(), "subTypes", null);
        setField(term85593, term85593.getClass(), "templateTypeName", null);
        setField(term85593, term85593.getClass(), "className", null);
        setField(term85593, term85593.getClass(), "properties", null);
        setField(term85593, term85593.getClass(), "implicitPrototype", null);
        setBooleanField(term85593, term85593.getClass(), "nativeType", false);
        setBooleanField(term85593, term85593.getClass(), "visited", false);
        setField(term85593, term85593.getClass(), "docInfo", null);
        setBooleanField(term85593, term85593.getClass(), "unknown", false);
        setBooleanField(term85593, term85593.getClass(), "resolved", false);
        setField(term85593, term85593.getClass(), "resolveResult", null);
        setField(term85593, term85593.getClass(), "registry", null);
        term85598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term85598, term85598.getClass(), "ownerFunction", null);
        setField(term85598, term85598.getClass(), "className", null);
        setField(term85598, term85598.getClass(), "properties", null);
        setField(term85598, term85598.getClass(), "implicitPrototype", null);
        setBooleanField(term85598, term85598.getClass(), "nativeType", false);
        setBooleanField(term85598, term85598.getClass(), "visited", false);
        setField(term85598, term85598.getClass(), "docInfo", null);
        setBooleanField(term85598, term85598.getClass(), "unknown", false);
        setBooleanField(term85598, term85598.getClass(), "resolved", false);
        setField(term85598, term85598.getClass(), "resolveResult", null);
        setField(term85598, term85598.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term84578;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term84312, args);
        assertTrue(recursiveEquals(term84312, term85593));
        assertTrue(recursiveEquals(term84578, term85598));
        assertTrue(recursiveEquals(retValue, true));
    }

};


