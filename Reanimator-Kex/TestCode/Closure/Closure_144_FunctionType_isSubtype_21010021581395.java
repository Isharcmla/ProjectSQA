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

public class FunctionType_isSubtype_21010021581395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1978048;
     Object term1978400;
     Object term1979252;
     Object term1979257;

    public FunctionType_isSubtype_21010021581395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1979263 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1979262 = ((Class) term1979263).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1979262).setAccessible(true);
        Object enum3510 = ((Field) term1979262).get((Object) null);
        term1978048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1978290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1978048, term1978048.getClass(), "kind", enum3510);
        setField(term1978048, term1978048.getClass(), "call", term1978290);
        Class<? extends Object> term1979563 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1979562 = ((Class) term1979563).getDeclaredField((String) "ORDINARY");
        ((Field) term1979562).setAccessible(true);
        Object enum3511 = ((Field) term1979562).get((Object) null);
        term1978400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1978400, term1978400.getClass(), "kind", enum3511);
        setField(term1978400, term1978400.getClass(), "call", null);
        Class<? extends Object> term1979854 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1979853 = ((Class) term1979854).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1979853).setAccessible(true);
        Object enum3512 = ((Field) term1979853).get((Object) null);
        term1979252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1979253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1979252, term1979252.getClass(), "this$0", null);
        setField(term1979253, term1979253.getClass(), "parameters", null);
        setField(term1979253, term1979253.getClass(), "returnType", null);
        setBooleanField(term1979253, term1979253.getClass(), "returnTypeInferred", false);
        setBooleanField(term1979253, term1979253.getClass(), "resolved", false);
        setField(term1979253, term1979253.getClass(), "resolveResult", null);
        setField(term1979253, term1979253.getClass(), "registry", null);
        setField(term1979252, term1979252.getClass(), "call", term1979253);
        setField(term1979252, term1979252.getClass(), "prototype", null);
        setField(term1979252, term1979252.getClass(), "kind", enum3512);
        setField(term1979252, term1979252.getClass(), "typeOfThis", null);
        setField(term1979252, term1979252.getClass(), "source", null);
        setField(term1979252, term1979252.getClass(), "implementedInterfaces", null);
        setField(term1979252, term1979252.getClass(), "subTypes", null);
        setField(term1979252, term1979252.getClass(), "templateTypeName", null);
        setField(term1979252, term1979252.getClass(), "className", null);
        setField(term1979252, term1979252.getClass(), "properties", null);
        setField(term1979252, term1979252.getClass(), "implicitPrototype", null);
        setBooleanField(term1979252, term1979252.getClass(), "nativeType", false);
        setBooleanField(term1979252, term1979252.getClass(), "prettyPrint", false);
        setBooleanField(term1979252, term1979252.getClass(), "visited", false);
        setField(term1979252, term1979252.getClass(), "docInfo", null);
        setBooleanField(term1979252, term1979252.getClass(), "unknown", false);
        setBooleanField(term1979252, term1979252.getClass(), "resolved", false);
        setField(term1979252, term1979252.getClass(), "resolveResult", null);
        setField(term1979252, term1979252.getClass(), "registry", null);
        Class<? extends Object> term1980154 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1980153 = ((Class) term1980154).getDeclaredField((String) "ORDINARY");
        ((Field) term1980153).setAccessible(true);
        Object enum3513 = ((Field) term1980153).get((Object) null);
        term1979257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1979257, term1979257.getClass(), "call", null);
        setField(term1979257, term1979257.getClass(), "prototype", null);
        setField(term1979257, term1979257.getClass(), "kind", enum3513);
        setField(term1979257, term1979257.getClass(), "typeOfThis", null);
        setField(term1979257, term1979257.getClass(), "source", null);
        setField(term1979257, term1979257.getClass(), "implementedInterfaces", null);
        setField(term1979257, term1979257.getClass(), "subTypes", null);
        setField(term1979257, term1979257.getClass(), "templateTypeName", null);
        setField(term1979257, term1979257.getClass(), "className", null);
        setField(term1979257, term1979257.getClass(), "properties", null);
        setField(term1979257, term1979257.getClass(), "implicitPrototype", null);
        setBooleanField(term1979257, term1979257.getClass(), "nativeType", false);
        setBooleanField(term1979257, term1979257.getClass(), "prettyPrint", false);
        setBooleanField(term1979257, term1979257.getClass(), "visited", false);
        setField(term1979257, term1979257.getClass(), "docInfo", null);
        setBooleanField(term1979257, term1979257.getClass(), "unknown", false);
        setBooleanField(term1979257, term1979257.getClass(), "resolved", false);
        setField(term1979257, term1979257.getClass(), "resolveResult", null);
        setField(term1979257, term1979257.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1978400;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1978048, args);
        assertTrue(recursiveEquals(term1978048, term1979252));
        assertTrue(recursiveEquals(term1978400, term1979257));
        assertTrue(recursiveEquals(retValue, false));
    }

};


