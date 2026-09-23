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

public class FunctionType_setPrototype_1918602805173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90379;
     Object term90645;
     Object term92019;
     Object term92025;

    public FunctionType_setPrototype_1918602805173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92029 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term92028 = ((Class) term92029).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term92028).setAccessible(true);
        Object enum195 = ((Field) term92028).get((Object) null);
        term90379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term90379, term90379.getClass(), "kind", enum195);
        setField(term90379, term90379.getClass(), "typeOfThis", null);
        setField(term90379, term90379.getClass(), "prototype", null);
        term90645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term90757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term90645, term90645.getClass(), "implicitPrototypeFallback", term90757);
        Class<? extends Object> term92329 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term92328 = ((Class) term92329).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term92328).setAccessible(true);
        Object enum196 = ((Field) term92328).get((Object) null);
        term92019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term92020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term92021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term92019, term92019.getClass(), "call", null);
        setField(term92020, term92020.getClass(), "ownerFunction", null);
        setField(term92020, term92020.getClass(), "className", null);
        setField(term92020, term92020.getClass(), "properties", null);
        setBooleanField(term92020, term92020.getClass(), "nativeType", false);
        setField(term92021, term92021.getClass(), "constructor", null);
        setField(term92021, term92021.getClass(), "className", null);
        setField(term92021, term92021.getClass(), "properties", null);
        setBooleanField(term92021, term92021.getClass(), "nativeType", false);
        setField(term92021, term92021.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term92021, term92021.getClass(), "prettyPrint", false);
        setBooleanField(term92021, term92021.getClass(), "visited", false);
        setField(term92021, term92021.getClass(), "docInfo", null);
        setBooleanField(term92021, term92021.getClass(), "unknown", false);
        setBooleanField(term92021, term92021.getClass(), "resolved", false);
        setField(term92021, term92021.getClass(), "resolveResult", null);
        setField(term92021, term92021.getClass(), "registry", null);
        setField(term92020, term92020.getClass(), "implicitPrototypeFallback", term92021);
        setBooleanField(term92020, term92020.getClass(), "prettyPrint", false);
        setBooleanField(term92020, term92020.getClass(), "visited", false);
        setField(term92020, term92020.getClass(), "docInfo", null);
        setBooleanField(term92020, term92020.getClass(), "unknown", false);
        setBooleanField(term92020, term92020.getClass(), "resolved", false);
        setField(term92020, term92020.getClass(), "resolveResult", null);
        setField(term92020, term92020.getClass(), "registry", null);
        setField(term92019, term92019.getClass(), "prototype", term92020);
        setField(term92019, term92019.getClass(), "kind", enum196);
        setField(term92019, term92019.getClass(), "typeOfThis", null);
        setField(term92019, term92019.getClass(), "source", null);
        setField(term92019, term92019.getClass(), "implementedInterfaces", null);
        setField(term92019, term92019.getClass(), "subTypes", null);
        setField(term92019, term92019.getClass(), "templateTypeName", null);
        setField(term92019, term92019.getClass(), "className", null);
        setField(term92019, term92019.getClass(), "properties", null);
        setBooleanField(term92019, term92019.getClass(), "nativeType", false);
        setField(term92019, term92019.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term92019, term92019.getClass(), "prettyPrint", false);
        setBooleanField(term92019, term92019.getClass(), "visited", false);
        setField(term92019, term92019.getClass(), "docInfo", null);
        setBooleanField(term92019, term92019.getClass(), "unknown", false);
        setBooleanField(term92019, term92019.getClass(), "resolved", false);
        setField(term92019, term92019.getClass(), "resolveResult", null);
        setField(term92019, term92019.getClass(), "registry", null);
        term92025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term92026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term92025, term92025.getClass(), "ownerFunction", null);
        setField(term92025, term92025.getClass(), "className", null);
        setField(term92025, term92025.getClass(), "properties", null);
        setBooleanField(term92025, term92025.getClass(), "nativeType", false);
        setField(term92026, term92026.getClass(), "constructor", null);
        setField(term92026, term92026.getClass(), "className", null);
        setField(term92026, term92026.getClass(), "properties", null);
        setBooleanField(term92026, term92026.getClass(), "nativeType", false);
        setField(term92026, term92026.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term92026, term92026.getClass(), "prettyPrint", false);
        setBooleanField(term92026, term92026.getClass(), "visited", false);
        setField(term92026, term92026.getClass(), "docInfo", null);
        setBooleanField(term92026, term92026.getClass(), "unknown", false);
        setBooleanField(term92026, term92026.getClass(), "resolved", false);
        setField(term92026, term92026.getClass(), "resolveResult", null);
        setField(term92026, term92026.getClass(), "registry", null);
        setField(term92025, term92025.getClass(), "implicitPrototypeFallback", term92026);
        setBooleanField(term92025, term92025.getClass(), "prettyPrint", false);
        setBooleanField(term92025, term92025.getClass(), "visited", false);
        setField(term92025, term92025.getClass(), "docInfo", null);
        setBooleanField(term92025, term92025.getClass(), "unknown", false);
        setBooleanField(term92025, term92025.getClass(), "resolved", false);
        setField(term92025, term92025.getClass(), "resolveResult", null);
        setField(term92025, term92025.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term90645;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term90379, args);
        assertTrue(recursiveEquals(term90379, term92019));
        assertTrue(recursiveEquals(term90645, term92025));
        assertTrue(recursiveEquals(retValue, true));
    }

};


