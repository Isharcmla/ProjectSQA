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

public class FunctionType_isOrdinaryFunction_979887802125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65870;
     Object term66908;

    public FunctionType_isOrdinaryFunction_979887802125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66914 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term66913 = ((Class) term66914).getDeclaredField((String) "ORDINARY");
        ((Field) term66913).setAccessible(true);
        Object enum165 = ((Field) term66913).get((Object) null);
        term65870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term65870, term65870.getClass(), "kind", enum165);
        Class<? extends Object> term67205 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term67204 = ((Class) term67205).getDeclaredField((String) "ORDINARY");
        ((Field) term67204).setAccessible(true);
        Object enum166 = ((Field) term67204).get((Object) null);
        term66908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term66908, term66908.getClass(), "call", null);
        setField(term66908, term66908.getClass(), "prototype", null);
        setField(term66908, term66908.getClass(), "kind", enum166);
        setField(term66908, term66908.getClass(), "typeOfThis", null);
        setField(term66908, term66908.getClass(), "source", null);
        setField(term66908, term66908.getClass(), "implementedInterfaces", null);
        setField(term66908, term66908.getClass(), "subTypes", null);
        setField(term66908, term66908.getClass(), "templateTypeName", null);
        setField(term66908, term66908.getClass(), "className", null);
        setField(term66908, term66908.getClass(), "properties", null);
        setField(term66908, term66908.getClass(), "implicitPrototype", null);
        setBooleanField(term66908, term66908.getClass(), "nativeType", false);
        setBooleanField(term66908, term66908.getClass(), "prettyPrint", false);
        setBooleanField(term66908, term66908.getClass(), "visited", false);
        setField(term66908, term66908.getClass(), "docInfo", null);
        setBooleanField(term66908, term66908.getClass(), "unknown", false);
        setBooleanField(term66908, term66908.getClass(), "resolved", false);
        setField(term66908, term66908.getClass(), "resolveResult", null);
        setField(term66908, term66908.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOrdinaryFunction", argTypes, term65870, args);
        assertTrue(recursiveEquals(term65870, term66908));
        assertTrue(recursiveEquals(retValue, true));
    }

};


