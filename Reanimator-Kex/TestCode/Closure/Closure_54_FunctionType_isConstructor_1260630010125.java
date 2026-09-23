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

public class FunctionType_isConstructor_1260630010125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63626;
     Object term64111;

    public FunctionType_isConstructor_1260630010125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64117 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term64116 = ((Class) term64117).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term64116).setAccessible(true);
        Object enum161 = ((Field) term64116).get((Object) null);
        term63626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63626, term63626.getClass(), "kind", enum161);
        Class<? extends Object> term64417 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term64416 = ((Class) term64417).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term64416).setAccessible(true);
        Object enum162 = ((Field) term64416).get((Object) null);
        term64111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term64111, term64111.getClass(), "call", null);
        setField(term64111, term64111.getClass(), "prototype", null);
        setField(term64111, term64111.getClass(), "prototypeSlot", null);
        setField(term64111, term64111.getClass(), "kind", enum162);
        setField(term64111, term64111.getClass(), "typeOfThis", null);
        setField(term64111, term64111.getClass(), "source", null);
        setField(term64111, term64111.getClass(), "implementedInterfaces", null);
        setField(term64111, term64111.getClass(), "extendedInterfaces", null);
        setField(term64111, term64111.getClass(), "subTypes", null);
        setField(term64111, term64111.getClass(), "templateTypeName", null);
        setField(term64111, term64111.getClass(), "className", null);
        setField(term64111, term64111.getClass(), "properties", null);
        setBooleanField(term64111, term64111.getClass(), "nativeType", false);
        setField(term64111, term64111.getClass(), "implicitPrototypeFallback", null);
        setField(term64111, term64111.getClass(), "ownerFunction", null);
        setBooleanField(term64111, term64111.getClass(), "prettyPrint", false);
        setBooleanField(term64111, term64111.getClass(), "visited", false);
        setField(term64111, term64111.getClass(), "docInfo", null);
        setBooleanField(term64111, term64111.getClass(), "unknown", false);
        setBooleanField(term64111, term64111.getClass(), "resolved", false);
        setField(term64111, term64111.getClass(), "resolveResult", null);
        setField(term64111, term64111.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConstructor", argTypes, term63626, args);
        assertTrue(recursiveEquals(term63626, term64111));
        assertTrue(recursiveEquals(retValue, true));
    }

};


