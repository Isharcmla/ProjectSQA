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

public class FunctionType_isSubtype_2101002158671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685824;
     Object term686176;
     Object term686652;
     Object term686657;

    public FunctionType_isSubtype_2101002158671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term686663 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term686662 = ((Class) term686663).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term686662).setAccessible(true);
        Object enum1236 = ((Field) term686662).get((Object) null);
        term685824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term686066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term685824, term685824.getClass(), "kind", enum1236);
        setField(term685824, term685824.getClass(), "call", term686066);
        term686176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term686176, term686176.getClass(), "kind", enum1236);
        setField(term686176, term686176.getClass(), "call", null);
        Class<? extends Object> term686963 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term686962 = ((Class) term686963).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term686962).setAccessible(true);
        Object enum1237 = ((Field) term686962).get((Object) null);
        term686652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term686653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term686653, term686653.getClass(), "parameters", null);
        setField(term686653, term686653.getClass(), "returnType", null);
        setBooleanField(term686653, term686653.getClass(), "returnTypeInferred", false);
        setBooleanField(term686653, term686653.getClass(), "resolved", false);
        setField(term686653, term686653.getClass(), "resolveResult", null);
        setField(term686653, term686653.getClass(), "registry", null);
        setField(term686652, term686652.getClass(), "call", term686653);
        setField(term686652, term686652.getClass(), "prototype", null);
        setField(term686652, term686652.getClass(), "kind", enum1237);
        setField(term686652, term686652.getClass(), "typeOfThis", null);
        setField(term686652, term686652.getClass(), "source", null);
        setField(term686652, term686652.getClass(), "implementedInterfaces", null);
        setField(term686652, term686652.getClass(), "subTypes", null);
        setField(term686652, term686652.getClass(), "templateTypeName", null);
        setField(term686652, term686652.getClass(), "className", null);
        setField(term686652, term686652.getClass(), "properties", null);
        setField(term686652, term686652.getClass(), "implicitPrototype", null);
        setBooleanField(term686652, term686652.getClass(), "nativeType", false);
        setBooleanField(term686652, term686652.getClass(), "prettyPrint", false);
        setBooleanField(term686652, term686652.getClass(), "visited", false);
        setField(term686652, term686652.getClass(), "docInfo", null);
        setBooleanField(term686652, term686652.getClass(), "unknown", false);
        setBooleanField(term686652, term686652.getClass(), "resolved", false);
        setField(term686652, term686652.getClass(), "resolveResult", null);
        setField(term686652, term686652.getClass(), "registry", null);
        Class<? extends Object> term687263 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term687262 = ((Class) term687263).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term687262).setAccessible(true);
        Object enum1238 = ((Field) term687262).get((Object) null);
        term686657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term686657, term686657.getClass(), "call", null);
        setField(term686657, term686657.getClass(), "prototype", null);
        setField(term686657, term686657.getClass(), "kind", enum1238);
        setField(term686657, term686657.getClass(), "typeOfThis", null);
        setField(term686657, term686657.getClass(), "source", null);
        setField(term686657, term686657.getClass(), "implementedInterfaces", null);
        setField(term686657, term686657.getClass(), "subTypes", null);
        setField(term686657, term686657.getClass(), "templateTypeName", null);
        setField(term686657, term686657.getClass(), "className", null);
        setField(term686657, term686657.getClass(), "properties", null);
        setField(term686657, term686657.getClass(), "implicitPrototype", null);
        setBooleanField(term686657, term686657.getClass(), "nativeType", false);
        setBooleanField(term686657, term686657.getClass(), "prettyPrint", false);
        setBooleanField(term686657, term686657.getClass(), "visited", false);
        setField(term686657, term686657.getClass(), "docInfo", null);
        setBooleanField(term686657, term686657.getClass(), "unknown", false);
        setBooleanField(term686657, term686657.getClass(), "resolved", false);
        setField(term686657, term686657.getClass(), "resolveResult", null);
        setField(term686657, term686657.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term686176;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term685824, args);
        assertTrue(recursiveEquals(term685824, term686652));
        assertTrue(recursiveEquals(term686176, term686657));
        assertTrue(recursiveEquals(retValue, false));
    }

};


