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

public class FunctionType_isSubtype_2101002158461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384338;
     Object term384690;
     Object term385166;
     Object term385171;

    public FunctionType_isSubtype_2101002158461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term385177 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term385176 = ((Class) term385177).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term385176).setAccessible(true);
        Object enum697 = ((Field) term385176).get((Object) null);
        term384338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term384580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term384338, term384338.getClass(), "kind", enum697);
        setField(term384338, term384338.getClass(), "call", term384580);
        term384690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term384690, term384690.getClass(), "kind", enum697);
        setField(term384690, term384690.getClass(), "call", null);
        Class<? extends Object> term385477 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term385476 = ((Class) term385477).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term385476).setAccessible(true);
        Object enum698 = ((Field) term385476).get((Object) null);
        term385166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term385167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term385167, term385167.getClass(), "parameters", null);
        setField(term385167, term385167.getClass(), "returnType", null);
        setBooleanField(term385167, term385167.getClass(), "returnTypeInferred", false);
        setBooleanField(term385167, term385167.getClass(), "resolved", false);
        setField(term385167, term385167.getClass(), "resolveResult", null);
        setField(term385167, term385167.getClass(), "registry", null);
        setField(term385166, term385166.getClass(), "call", term385167);
        setField(term385166, term385166.getClass(), "prototype", null);
        setField(term385166, term385166.getClass(), "kind", enum698);
        setField(term385166, term385166.getClass(), "typeOfThis", null);
        setField(term385166, term385166.getClass(), "source", null);
        setField(term385166, term385166.getClass(), "implementedInterfaces", null);
        setField(term385166, term385166.getClass(), "subTypes", null);
        setField(term385166, term385166.getClass(), "templateTypeName", null);
        setField(term385166, term385166.getClass(), "className", null);
        setField(term385166, term385166.getClass(), "properties", null);
        setField(term385166, term385166.getClass(), "implicitPrototype", null);
        setBooleanField(term385166, term385166.getClass(), "nativeType", false);
        setBooleanField(term385166, term385166.getClass(), "prettyPrint", false);
        setBooleanField(term385166, term385166.getClass(), "visited", false);
        setField(term385166, term385166.getClass(), "docInfo", null);
        setBooleanField(term385166, term385166.getClass(), "unknown", false);
        setBooleanField(term385166, term385166.getClass(), "resolved", false);
        setField(term385166, term385166.getClass(), "resolveResult", null);
        setField(term385166, term385166.getClass(), "registry", null);
        Class<? extends Object> term385777 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term385776 = ((Class) term385777).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term385776).setAccessible(true);
        Object enum699 = ((Field) term385776).get((Object) null);
        term385171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term385171, term385171.getClass(), "call", null);
        setField(term385171, term385171.getClass(), "prototype", null);
        setField(term385171, term385171.getClass(), "kind", enum699);
        setField(term385171, term385171.getClass(), "typeOfThis", null);
        setField(term385171, term385171.getClass(), "source", null);
        setField(term385171, term385171.getClass(), "implementedInterfaces", null);
        setField(term385171, term385171.getClass(), "subTypes", null);
        setField(term385171, term385171.getClass(), "templateTypeName", null);
        setField(term385171, term385171.getClass(), "className", null);
        setField(term385171, term385171.getClass(), "properties", null);
        setField(term385171, term385171.getClass(), "implicitPrototype", null);
        setBooleanField(term385171, term385171.getClass(), "nativeType", false);
        setBooleanField(term385171, term385171.getClass(), "prettyPrint", false);
        setBooleanField(term385171, term385171.getClass(), "visited", false);
        setField(term385171, term385171.getClass(), "docInfo", null);
        setBooleanField(term385171, term385171.getClass(), "unknown", false);
        setBooleanField(term385171, term385171.getClass(), "resolved", false);
        setField(term385171, term385171.getClass(), "resolveResult", null);
        setField(term385171, term385171.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term384690;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term384338, args);
        assertTrue(recursiveEquals(term384338, term385166));
        assertTrue(recursiveEquals(term384690, term385171));
        assertTrue(recursiveEquals(retValue, false));
    }

};


