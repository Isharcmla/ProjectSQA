package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class TypeCheck_hasUnknownOrEmptySupertype_59657982345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83688;
     Object term84770;

    public TypeCheck_hasUnknownOrEmptySupertype_59657982345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84777 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term84776 = ((Class) term84777).getDeclaredField((String) "INTERFACE");
        ((Field) term84776).setAccessible(true);
        Object enum33 = ((Field) term84776).get((Object) null);
        term83688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term83950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term83688, term83688.getClass(), "kind", enum33);
        setBooleanField(term83688, term83688.getClass(), "unknown", false);
        setField(term83950, term83950.getClass(), "type", term83688);
        setField(term83688, term83688.getClass(), "prototypeSlot", term83950);
        Class<? extends Object> term85071 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term85070 = ((Class) term85071).getDeclaredField((String) "INTERFACE");
        ((Field) term85070).setAccessible(true);
        Object enum34 = ((Field) term85070).get((Object) null);
        term84770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term84771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term84770, term84770.getClass(), "call", null);
        setField(term84771, term84771.getClass(), "name", null);
        setField(term84771, term84771.getClass(), "type", term84770);
        setBooleanField(term84771, term84771.getClass(), "inferred", false);
        setField(term84771, term84771.getClass(), "propertyNode", null);
        setField(term84771, term84771.getClass(), "docInfo", null);
        setField(term84770, term84770.getClass(), "prototypeSlot", term84771);
        setField(term84770, term84770.getClass(), "kind", enum34);
        setField(term84770, term84770.getClass(), "propAccess", null);
        setField(term84770, term84770.getClass(), "typeOfThis", null);
        setField(term84770, term84770.getClass(), "source", null);
        setField(term84770, term84770.getClass(), "implementedInterfaces", null);
        setField(term84770, term84770.getClass(), "extendedInterfaces", null);
        setField(term84770, term84770.getClass(), "subTypes", null);
        setField(term84770, term84770.getClass(), "templateTypeNames", null);
        setField(term84770, term84770.getClass(), "className", null);
        setField(term84770, term84770.getClass(), "properties", null);
        setBooleanField(term84770, term84770.getClass(), "nativeType", false);
        setField(term84770, term84770.getClass(), "implicitPrototypeFallback", null);
        setField(term84770, term84770.getClass(), "ownerFunction", null);
        setBooleanField(term84770, term84770.getClass(), "prettyPrint", false);
        setBooleanField(term84770, term84770.getClass(), "visited", false);
        setField(term84770, term84770.getClass(), "docInfo", null);
        setBooleanField(term84770, term84770.getClass(), "unknown", false);
        setBooleanField(term84770, term84770.getClass(), "resolved", false);
        setField(term84770, term84770.getClass(), "resolveResult", null);
        setBooleanField(term84770, term84770.getClass(), "inTemplatedCheckVisit", false);
        setField(term84770, term84770.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term83688;
        Object retValue = callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term83688, term84770));
        assertTrue(recursiveEquals(retValue, false));
    }

};


