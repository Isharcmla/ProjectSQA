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

public class FunctionType_isOrdinaryFunction_979887802123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65003;
     Object term65771;

    public FunctionType_isOrdinaryFunction_979887802123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65777 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term65776 = ((Class) term65777).getDeclaredField((String) "INTERFACE");
        ((Field) term65776).setAccessible(true);
        Object enum162 = ((Field) term65776).get((Object) null);
        term65003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term65003, term65003.getClass(), "kind", enum162);
        Class<? extends Object> term66071 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term66070 = ((Class) term66071).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term66070).setAccessible(true);
        Object enum163 = ((Field) term66070).get((Object) null);
        term65771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term65771, term65771.getClass(), "call", null);
        setField(term65771, term65771.getClass(), "prototype", null);
        setField(term65771, term65771.getClass(), "kind", enum163);
        setField(term65771, term65771.getClass(), "typeOfThis", null);
        setField(term65771, term65771.getClass(), "source", null);
        setField(term65771, term65771.getClass(), "implementedInterfaces", null);
        setField(term65771, term65771.getClass(), "subTypes", null);
        setField(term65771, term65771.getClass(), "templateTypeName", null);
        setField(term65771, term65771.getClass(), "className", null);
        setField(term65771, term65771.getClass(), "properties", null);
        setBooleanField(term65771, term65771.getClass(), "nativeType", false);
        setField(term65771, term65771.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term65771, term65771.getClass(), "prettyPrint", false);
        setBooleanField(term65771, term65771.getClass(), "visited", false);
        setField(term65771, term65771.getClass(), "docInfo", null);
        setBooleanField(term65771, term65771.getClass(), "unknown", false);
        setBooleanField(term65771, term65771.getClass(), "resolved", false);
        setField(term65771, term65771.getClass(), "resolveResult", null);
        setField(term65771, term65771.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOrdinaryFunction", argTypes, term65003, args);
        assertTrue(recursiveEquals(term65003, term65771));
        assertTrue(recursiveEquals(retValue, false));
    }

};


