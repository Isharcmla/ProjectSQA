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

public class FunctionType_isEquivalentTo_230708275243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127952;
     Object term128210;
     Object term128549;
     Object term128553;

    public FunctionType_isEquivalentTo_230708275243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term128556 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term128555 = ((Class) term128556).getDeclaredField((String) "INTERFACE");
        ((Field) term128555).setAccessible(true);
        Object enum237 = ((Field) term128555).get((Object) null);
        term127952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term127952, term127952.getClass(), "kind", enum237);
        term128210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term128850 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term128849 = ((Class) term128850).getDeclaredField((String) "INTERFACE");
        ((Field) term128849).setAccessible(true);
        Object enum238 = ((Field) term128849).get((Object) null);
        term128549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term128549, term128549.getClass(), "call", null);
        setField(term128549, term128549.getClass(), "prototype", null);
        setField(term128549, term128549.getClass(), "kind", enum238);
        setField(term128549, term128549.getClass(), "typeOfThis", null);
        setField(term128549, term128549.getClass(), "source", null);
        setField(term128549, term128549.getClass(), "implementedInterfaces", null);
        setField(term128549, term128549.getClass(), "subTypes", null);
        setField(term128549, term128549.getClass(), "templateTypeName", null);
        setField(term128549, term128549.getClass(), "className", null);
        setField(term128549, term128549.getClass(), "properties", null);
        setBooleanField(term128549, term128549.getClass(), "nativeType", false);
        setField(term128549, term128549.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term128549, term128549.getClass(), "prettyPrint", false);
        setBooleanField(term128549, term128549.getClass(), "visited", false);
        setField(term128549, term128549.getClass(), "docInfo", null);
        setBooleanField(term128549, term128549.getClass(), "unknown", false);
        setBooleanField(term128549, term128549.getClass(), "resolved", false);
        setField(term128549, term128549.getClass(), "resolveResult", null);
        setField(term128549, term128549.getClass(), "registry", null);
        term128553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term128553, term128553.getClass(), "call", null);
        setField(term128553, term128553.getClass(), "prototype", null);
        setField(term128553, term128553.getClass(), "kind", null);
        setField(term128553, term128553.getClass(), "typeOfThis", null);
        setField(term128553, term128553.getClass(), "source", null);
        setField(term128553, term128553.getClass(), "implementedInterfaces", null);
        setField(term128553, term128553.getClass(), "subTypes", null);
        setField(term128553, term128553.getClass(), "templateTypeName", null);
        setField(term128553, term128553.getClass(), "className", null);
        setField(term128553, term128553.getClass(), "properties", null);
        setBooleanField(term128553, term128553.getClass(), "nativeType", false);
        setField(term128553, term128553.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term128553, term128553.getClass(), "prettyPrint", false);
        setBooleanField(term128553, term128553.getClass(), "visited", false);
        setField(term128553, term128553.getClass(), "docInfo", null);
        setBooleanField(term128553, term128553.getClass(), "unknown", false);
        setBooleanField(term128553, term128553.getClass(), "resolved", false);
        setField(term128553, term128553.getClass(), "resolveResult", null);
        setField(term128553, term128553.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term128210;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term127952, args);
        assertTrue(recursiveEquals(term127952, term128549));
        assertTrue(recursiveEquals(term128210, term128553));
        assertTrue(recursiveEquals(retValue, false));
    }

};


