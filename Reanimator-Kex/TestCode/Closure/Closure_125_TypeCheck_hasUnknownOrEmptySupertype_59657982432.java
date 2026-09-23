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

public class TypeCheck_hasUnknownOrEmptySupertype_59657982432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106348;
     Object term107073;

    public TypeCheck_hasUnknownOrEmptySupertype_59657982432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107081 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term107080 = ((Class) term107081).getDeclaredField((String) "INTERFACE");
        ((Field) term107080).setAccessible(true);
        Object enum36 = ((Field) term107080).get((Object) null);
        term106348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term106588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        Object term106688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term106348, term106348.getClass(), "kind", enum36);
        setBooleanField(term106348, term106348.getClass(), "unknown", false);
        setField(term106588, term106588.getClass(), "type", term106688);
        setField(term106348, term106348.getClass(), "prototypeSlot", term106588);
        Class<? extends Object> term107375 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term107374 = ((Class) term107375).getDeclaredField((String) "INTERFACE");
        ((Field) term107374).setAccessible(true);
        Object enum37 = ((Field) term107374).get((Object) null);
        term107073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term107074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        Object term107075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term107073, term107073.getClass(), "call", null);
        setField(term107074, term107074.getClass(), "name", null);
        setField(term107075, term107075.getClass(), "call", null);
        setField(term107075, term107075.getClass(), "prototypeSlot", null);
        setField(term107075, term107075.getClass(), "kind", null);
        setField(term107075, term107075.getClass(), "propAccess", null);
        setField(term107075, term107075.getClass(), "typeOfThis", null);
        setField(term107075, term107075.getClass(), "source", null);
        setField(term107075, term107075.getClass(), "implementedInterfaces", null);
        setField(term107075, term107075.getClass(), "extendedInterfaces", null);
        setField(term107075, term107075.getClass(), "subTypes", null);
        setField(term107075, term107075.getClass(), "className", null);
        setField(term107075, term107075.getClass(), "properties", null);
        setBooleanField(term107075, term107075.getClass(), "nativeType", false);
        setField(term107075, term107075.getClass(), "implicitPrototypeFallback", null);
        setField(term107075, term107075.getClass(), "ownerFunction", null);
        setBooleanField(term107075, term107075.getClass(), "prettyPrint", false);
        setBooleanField(term107075, term107075.getClass(), "visited", false);
        setField(term107075, term107075.getClass(), "docInfo", null);
        setBooleanField(term107075, term107075.getClass(), "unknown", false);
        setBooleanField(term107075, term107075.getClass(), "resolved", false);
        setField(term107075, term107075.getClass(), "resolveResult", null);
        setField(term107075, term107075.getClass(), "templateTypeMap", null);
        setBooleanField(term107075, term107075.getClass(), "inTemplatedCheckVisit", false);
        setField(term107075, term107075.getClass(), "registry", null);
        setField(term107074, term107074.getClass(), "type", term107075);
        setBooleanField(term107074, term107074.getClass(), "inferred", false);
        setField(term107074, term107074.getClass(), "propertyNode", null);
        setField(term107074, term107074.getClass(), "docInfo", null);
        setField(term107073, term107073.getClass(), "prototypeSlot", term107074);
        setField(term107073, term107073.getClass(), "kind", enum37);
        setField(term107073, term107073.getClass(), "propAccess", null);
        setField(term107073, term107073.getClass(), "typeOfThis", null);
        setField(term107073, term107073.getClass(), "source", null);
        setField(term107073, term107073.getClass(), "implementedInterfaces", null);
        setField(term107073, term107073.getClass(), "extendedInterfaces", null);
        setField(term107073, term107073.getClass(), "subTypes", null);
        setField(term107073, term107073.getClass(), "className", null);
        setField(term107073, term107073.getClass(), "properties", null);
        setBooleanField(term107073, term107073.getClass(), "nativeType", false);
        setField(term107073, term107073.getClass(), "implicitPrototypeFallback", null);
        setField(term107073, term107073.getClass(), "ownerFunction", null);
        setBooleanField(term107073, term107073.getClass(), "prettyPrint", false);
        setBooleanField(term107073, term107073.getClass(), "visited", false);
        setField(term107073, term107073.getClass(), "docInfo", null);
        setBooleanField(term107073, term107073.getClass(), "unknown", false);
        setBooleanField(term107073, term107073.getClass(), "resolved", false);
        setField(term107073, term107073.getClass(), "resolveResult", null);
        setField(term107073, term107073.getClass(), "templateTypeMap", null);
        setBooleanField(term107073, term107073.getClass(), "inTemplatedCheckVisit", false);
        setField(term107073, term107073.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term106348;
        Object retValue = callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term106348, term107073));
        assertTrue(recursiveEquals(retValue, false));
    }

};


