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

public class FunctionType_setPrototype_1918602805199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100254;
     Object term100520;
     Object term100847;
     Object term100852;

    public FunctionType_setPrototype_1918602805199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term100855 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term100854 = ((Class) term100855).getDeclaredField((String) "ORDINARY");
        ((Field) term100854).setAccessible(true);
        Object enum213 = ((Field) term100854).get((Object) null);
        term100254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100254, term100254.getClass(), "kind", enum213);
        term100520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Class<? extends Object> term101146 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term101145 = ((Class) term101146).getDeclaredField((String) "ORDINARY");
        ((Field) term101145).setAccessible(true);
        Object enum214 = ((Field) term101145).get((Object) null);
        term100847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term100848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term100847, term100847.getClass(), "call", null);
        setField(term100848, term100848.getClass(), "ownerFunction", null);
        setField(term100848, term100848.getClass(), "className", null);
        setField(term100848, term100848.getClass(), "properties", null);
        setField(term100848, term100848.getClass(), "implicitPrototype", null);
        setBooleanField(term100848, term100848.getClass(), "nativeType", false);
        setBooleanField(term100848, term100848.getClass(), "prettyPrint", false);
        setBooleanField(term100848, term100848.getClass(), "visited", false);
        setField(term100848, term100848.getClass(), "docInfo", null);
        setBooleanField(term100848, term100848.getClass(), "unknown", false);
        setBooleanField(term100848, term100848.getClass(), "resolved", false);
        setField(term100848, term100848.getClass(), "resolveResult", null);
        setField(term100848, term100848.getClass(), "registry", null);
        setField(term100847, term100847.getClass(), "prototype", term100848);
        setField(term100847, term100847.getClass(), "kind", enum214);
        setField(term100847, term100847.getClass(), "typeOfThis", null);
        setField(term100847, term100847.getClass(), "source", null);
        setField(term100847, term100847.getClass(), "implementedInterfaces", null);
        setField(term100847, term100847.getClass(), "subTypes", null);
        setField(term100847, term100847.getClass(), "templateTypeName", null);
        setField(term100847, term100847.getClass(), "className", null);
        setField(term100847, term100847.getClass(), "properties", null);
        setField(term100847, term100847.getClass(), "implicitPrototype", null);
        setBooleanField(term100847, term100847.getClass(), "nativeType", false);
        setBooleanField(term100847, term100847.getClass(), "prettyPrint", false);
        setBooleanField(term100847, term100847.getClass(), "visited", false);
        setField(term100847, term100847.getClass(), "docInfo", null);
        setBooleanField(term100847, term100847.getClass(), "unknown", false);
        setBooleanField(term100847, term100847.getClass(), "resolved", false);
        setField(term100847, term100847.getClass(), "resolveResult", null);
        setField(term100847, term100847.getClass(), "registry", null);
        term100852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term100852, term100852.getClass(), "ownerFunction", null);
        setField(term100852, term100852.getClass(), "className", null);
        setField(term100852, term100852.getClass(), "properties", null);
        setField(term100852, term100852.getClass(), "implicitPrototype", null);
        setBooleanField(term100852, term100852.getClass(), "nativeType", false);
        setBooleanField(term100852, term100852.getClass(), "prettyPrint", false);
        setBooleanField(term100852, term100852.getClass(), "visited", false);
        setField(term100852, term100852.getClass(), "docInfo", null);
        setBooleanField(term100852, term100852.getClass(), "unknown", false);
        setBooleanField(term100852, term100852.getClass(), "resolved", false);
        setField(term100852, term100852.getClass(), "resolveResult", null);
        setField(term100852, term100852.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term100520;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term100254, args);
        assertTrue(recursiveEquals(term100254, term100847));
        assertTrue(recursiveEquals(term100520, term100852));
        assertTrue(recursiveEquals(retValue, true));
    }

};


