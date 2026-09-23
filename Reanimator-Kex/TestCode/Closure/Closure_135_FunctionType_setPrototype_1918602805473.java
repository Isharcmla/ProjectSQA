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

public class FunctionType_setPrototype_1918602805473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330779;
     Object term330729;
     Object term331344;
     Object term331349;

    public FunctionType_setPrototype_1918602805473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term331356 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term331355 = ((Class) term331356).getDeclaredField((String) "INTERFACE");
        ((Field) term331355).setAccessible(true);
        Object enum605 = ((Field) term331355).get((Object) null);
        term330779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term330912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term330779, term330779.getClass(), "kind", enum605);
        setField(term330779, term330779.getClass(), "prototype", term330912);
        term330729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term330729, term330729.getClass(), "implicitPrototype", term330779);
        Class<? extends Object> term331650 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term331649 = ((Class) term331650).getDeclaredField((String) "INTERFACE");
        ((Field) term331649).setAccessible(true);
        Object enum606 = ((Field) term331649).get((Object) null);
        term331344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term331345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term331344, term331344.getClass(), "call", null);
        setField(term331345, term331345.getClass(), "ownerFunction", null);
        setField(term331345, term331345.getClass(), "className", null);
        setField(term331345, term331345.getClass(), "properties", null);
        setField(term331345, term331345.getClass(), "implicitPrototype", term331344);
        setBooleanField(term331345, term331345.getClass(), "nativeType", false);
        setBooleanField(term331345, term331345.getClass(), "visited", false);
        setField(term331345, term331345.getClass(), "docInfo", null);
        setBooleanField(term331345, term331345.getClass(), "unknown", false);
        setBooleanField(term331345, term331345.getClass(), "resolved", false);
        setField(term331345, term331345.getClass(), "resolveResult", null);
        setField(term331345, term331345.getClass(), "registry", null);
        setField(term331344, term331344.getClass(), "prototype", term331345);
        setField(term331344, term331344.getClass(), "kind", enum606);
        setField(term331344, term331344.getClass(), "typeOfThis", null);
        setField(term331344, term331344.getClass(), "source", null);
        setField(term331344, term331344.getClass(), "implementedInterfaces", null);
        setField(term331344, term331344.getClass(), "subTypes", null);
        setField(term331344, term331344.getClass(), "templateTypeName", null);
        setField(term331344, term331344.getClass(), "className", null);
        setField(term331344, term331344.getClass(), "properties", null);
        setField(term331344, term331344.getClass(), "implicitPrototype", null);
        setBooleanField(term331344, term331344.getClass(), "nativeType", false);
        setBooleanField(term331344, term331344.getClass(), "visited", false);
        setField(term331344, term331344.getClass(), "docInfo", null);
        setBooleanField(term331344, term331344.getClass(), "unknown", false);
        setBooleanField(term331344, term331344.getClass(), "resolved", false);
        setField(term331344, term331344.getClass(), "resolveResult", null);
        setField(term331344, term331344.getClass(), "registry", null);
        Class<? extends Object> term331944 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term331943 = ((Class) term331944).getDeclaredField((String) "INTERFACE");
        ((Field) term331943).setAccessible(true);
        Object enum607 = ((Field) term331943).get((Object) null);
        term331349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term331350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term331349, term331349.getClass(), "ownerFunction", null);
        setField(term331349, term331349.getClass(), "className", null);
        setField(term331349, term331349.getClass(), "properties", null);
        setField(term331350, term331350.getClass(), "call", null);
        setField(term331350, term331350.getClass(), "prototype", term331349);
        setField(term331350, term331350.getClass(), "kind", enum607);
        setField(term331350, term331350.getClass(), "typeOfThis", null);
        setField(term331350, term331350.getClass(), "source", null);
        setField(term331350, term331350.getClass(), "implementedInterfaces", null);
        setField(term331350, term331350.getClass(), "subTypes", null);
        setField(term331350, term331350.getClass(), "templateTypeName", null);
        setField(term331350, term331350.getClass(), "className", null);
        setField(term331350, term331350.getClass(), "properties", null);
        setField(term331350, term331350.getClass(), "implicitPrototype", null);
        setBooleanField(term331350, term331350.getClass(), "nativeType", false);
        setBooleanField(term331350, term331350.getClass(), "visited", false);
        setField(term331350, term331350.getClass(), "docInfo", null);
        setBooleanField(term331350, term331350.getClass(), "unknown", false);
        setBooleanField(term331350, term331350.getClass(), "resolved", false);
        setField(term331350, term331350.getClass(), "resolveResult", null);
        setField(term331350, term331350.getClass(), "registry", null);
        setField(term331349, term331349.getClass(), "implicitPrototype", term331350);
        setBooleanField(term331349, term331349.getClass(), "nativeType", false);
        setBooleanField(term331349, term331349.getClass(), "visited", false);
        setField(term331349, term331349.getClass(), "docInfo", null);
        setBooleanField(term331349, term331349.getClass(), "unknown", false);
        setBooleanField(term331349, term331349.getClass(), "resolved", false);
        setField(term331349, term331349.getClass(), "resolveResult", null);
        setField(term331349, term331349.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term330729;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term330779, args);
        assertTrue(recursiveEquals(term330779, term331344));
        assertTrue(recursiveEquals(term330729, term331349));
        assertTrue(recursiveEquals(retValue, true));
    }

};


