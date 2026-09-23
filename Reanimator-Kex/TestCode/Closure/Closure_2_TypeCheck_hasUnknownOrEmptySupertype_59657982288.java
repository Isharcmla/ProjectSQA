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

public class TypeCheck_hasUnknownOrEmptySupertype_59657982288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69826;
     Object term70727;

    public TypeCheck_hasUnknownOrEmptySupertype_59657982288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70734 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term70733 = ((Class) term70734).getDeclaredField((String) "INTERFACE");
        ((Field) term70733).setAccessible(true);
        Object enum33 = ((Field) term70733).get((Object) null);
        term69826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term70066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term69826, term69826.getClass(), "kind", enum33);
        setBooleanField(term69826, term69826.getClass(), "unknown", false);
        setField(term70066, term70066.getClass(), "type", term69826);
        setField(term69826, term69826.getClass(), "prototypeSlot", term70066);
        Class<? extends Object> term71028 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term71027 = ((Class) term71028).getDeclaredField((String) "INTERFACE");
        ((Field) term71027).setAccessible(true);
        Object enum34 = ((Field) term71027).get((Object) null);
        term70727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term70728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term70727, term70727.getClass(), "call", null);
        setField(term70728, term70728.getClass(), "name", null);
        setField(term70728, term70728.getClass(), "type", term70727);
        setBooleanField(term70728, term70728.getClass(), "inferred", false);
        setField(term70728, term70728.getClass(), "propertyNode", null);
        setField(term70728, term70728.getClass(), "docInfo", null);
        setField(term70727, term70727.getClass(), "prototypeSlot", term70728);
        setField(term70727, term70727.getClass(), "kind", enum34);
        setField(term70727, term70727.getClass(), "propAccess", null);
        setField(term70727, term70727.getClass(), "typeOfThis", null);
        setField(term70727, term70727.getClass(), "source", null);
        setField(term70727, term70727.getClass(), "implementedInterfaces", null);
        setField(term70727, term70727.getClass(), "extendedInterfaces", null);
        setField(term70727, term70727.getClass(), "subTypes", null);
        setField(term70727, term70727.getClass(), "className", null);
        setField(term70727, term70727.getClass(), "properties", null);
        setBooleanField(term70727, term70727.getClass(), "nativeType", false);
        setField(term70727, term70727.getClass(), "implicitPrototypeFallback", null);
        setField(term70727, term70727.getClass(), "ownerFunction", null);
        setBooleanField(term70727, term70727.getClass(), "prettyPrint", false);
        setBooleanField(term70727, term70727.getClass(), "visited", false);
        setField(term70727, term70727.getClass(), "docInfo", null);
        setBooleanField(term70727, term70727.getClass(), "unknown", false);
        setBooleanField(term70727, term70727.getClass(), "resolved", false);
        setField(term70727, term70727.getClass(), "resolveResult", null);
        setField(term70727, term70727.getClass(), "templateKeys", null);
        setField(term70727, term70727.getClass(), "templatizedTypes", null);
        setBooleanField(term70727, term70727.getClass(), "inTemplatedCheckVisit", false);
        setField(term70727, term70727.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term69826;
        Object retValue = callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term69826, term70727));
        assertTrue(recursiveEquals(retValue, false));
    }

};


