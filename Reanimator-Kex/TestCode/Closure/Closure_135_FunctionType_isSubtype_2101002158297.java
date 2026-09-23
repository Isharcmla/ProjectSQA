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

public class FunctionType_isSubtype_2101002158297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159385;
     Object term159641;
     Object term159991;
     Object term159995;

    public FunctionType_isSubtype_2101002158297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term159998 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term159997 = ((Class) term159998).getDeclaredField((String) "INTERFACE");
        ((Field) term159997).setAccessible(true);
        Object enum290 = ((Field) term159997).get((Object) null);
        term159385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term159385, term159385.getClass(), "kind", enum290);
        term159641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class<? extends Object> term160292 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term160291 = ((Class) term160292).getDeclaredField((String) "INTERFACE");
        ((Field) term160291).setAccessible(true);
        Object enum291 = ((Field) term160291).get((Object) null);
        term159991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term159991, term159991.getClass(), "call", null);
        setField(term159991, term159991.getClass(), "prototype", null);
        setField(term159991, term159991.getClass(), "kind", enum291);
        setField(term159991, term159991.getClass(), "typeOfThis", null);
        setField(term159991, term159991.getClass(), "source", null);
        setField(term159991, term159991.getClass(), "implementedInterfaces", null);
        setField(term159991, term159991.getClass(), "subTypes", null);
        setField(term159991, term159991.getClass(), "templateTypeName", null);
        setField(term159991, term159991.getClass(), "className", null);
        setField(term159991, term159991.getClass(), "properties", null);
        setField(term159991, term159991.getClass(), "implicitPrototype", null);
        setBooleanField(term159991, term159991.getClass(), "nativeType", false);
        setBooleanField(term159991, term159991.getClass(), "visited", false);
        setField(term159991, term159991.getClass(), "docInfo", null);
        setBooleanField(term159991, term159991.getClass(), "unknown", false);
        setBooleanField(term159991, term159991.getClass(), "resolved", false);
        setField(term159991, term159991.getClass(), "resolveResult", null);
        setField(term159991, term159991.getClass(), "registry", null);
        term159995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term159995, term159995.getClass(), "this$0", null);
        setField(term159995, term159995.getClass(), "call", null);
        setField(term159995, term159995.getClass(), "prototype", null);
        setField(term159995, term159995.getClass(), "kind", null);
        setField(term159995, term159995.getClass(), "typeOfThis", null);
        setField(term159995, term159995.getClass(), "source", null);
        setField(term159995, term159995.getClass(), "implementedInterfaces", null);
        setField(term159995, term159995.getClass(), "subTypes", null);
        setField(term159995, term159995.getClass(), "templateTypeName", null);
        setField(term159995, term159995.getClass(), "className", null);
        setField(term159995, term159995.getClass(), "properties", null);
        setField(term159995, term159995.getClass(), "implicitPrototype", null);
        setBooleanField(term159995, term159995.getClass(), "nativeType", false);
        setBooleanField(term159995, term159995.getClass(), "visited", false);
        setField(term159995, term159995.getClass(), "docInfo", null);
        setBooleanField(term159995, term159995.getClass(), "unknown", false);
        setBooleanField(term159995, term159995.getClass(), "resolved", false);
        setField(term159995, term159995.getClass(), "resolveResult", null);
        setField(term159995, term159995.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term159641;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term159385, args);
        assertTrue(recursiveEquals(term159385, term159991));
        assertTrue(recursiveEquals(term159641, term159995));
        assertTrue(recursiveEquals(retValue, false));
    }

};


