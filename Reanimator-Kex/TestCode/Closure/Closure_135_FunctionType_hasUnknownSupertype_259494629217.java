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

public class FunctionType_hasUnknownSupertype_259494629217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101687;
     Object term102315;

    public FunctionType_hasUnknownSupertype_259494629217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102322 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term102321 = ((Class) term102322).getDeclaredField((String) "INTERFACE");
        ((Field) term102321).setAccessible(true);
        Object enum207 = ((Field) term102321).get((Object) null);
        term101687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term101953 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term101687, term101687.getClass(), "kind", enum207);
        setBooleanField(term101687, term101687.getClass(), "unknown", false);
        setField(term101687, term101687.getClass(), "prototype", term101953);
        Class<? extends Object> term102616 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term102615 = ((Class) term102616).getDeclaredField((String) "INTERFACE");
        ((Field) term102615).setAccessible(true);
        Object enum208 = ((Field) term102615).get((Object) null);
        term102315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term102316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term102315, term102315.getClass(), "call", null);
        setField(term102316, term102316.getClass(), "ownerFunction", null);
        setField(term102316, term102316.getClass(), "className", null);
        setField(term102316, term102316.getClass(), "properties", null);
        setField(term102316, term102316.getClass(), "implicitPrototype", null);
        setBooleanField(term102316, term102316.getClass(), "nativeType", false);
        setBooleanField(term102316, term102316.getClass(), "visited", false);
        setField(term102316, term102316.getClass(), "docInfo", null);
        setBooleanField(term102316, term102316.getClass(), "unknown", false);
        setBooleanField(term102316, term102316.getClass(), "resolved", false);
        setField(term102316, term102316.getClass(), "resolveResult", null);
        setField(term102316, term102316.getClass(), "registry", null);
        setField(term102315, term102315.getClass(), "prototype", term102316);
        setField(term102315, term102315.getClass(), "kind", enum208);
        setField(term102315, term102315.getClass(), "typeOfThis", null);
        setField(term102315, term102315.getClass(), "source", null);
        setField(term102315, term102315.getClass(), "implementedInterfaces", null);
        setField(term102315, term102315.getClass(), "subTypes", null);
        setField(term102315, term102315.getClass(), "templateTypeName", null);
        setField(term102315, term102315.getClass(), "className", null);
        setField(term102315, term102315.getClass(), "properties", null);
        setField(term102315, term102315.getClass(), "implicitPrototype", null);
        setBooleanField(term102315, term102315.getClass(), "nativeType", false);
        setBooleanField(term102315, term102315.getClass(), "visited", false);
        setField(term102315, term102315.getClass(), "docInfo", null);
        setBooleanField(term102315, term102315.getClass(), "unknown", false);
        setBooleanField(term102315, term102315.getClass(), "resolved", false);
        setField(term102315, term102315.getClass(), "resolveResult", null);
        setField(term102315, term102315.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term101687, args);
        assertTrue(recursiveEquals(term101687, term102315));
        assertTrue(recursiveEquals(retValue, false));
    }

};


