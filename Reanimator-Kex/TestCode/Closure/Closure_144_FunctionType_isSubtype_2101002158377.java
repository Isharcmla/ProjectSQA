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

public class FunctionType_isSubtype_2101002158377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276042;
     Object term276394;
     Object term277240;
     Object term277245;

    public FunctionType_isSubtype_2101002158377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term277251 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term277250 = ((Class) term277251).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term277250).setAccessible(true);
        Object enum512 = ((Field) term277250).get((Object) null);
        term276042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term276284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term276042, term276042.getClass(), "kind", enum512);
        setField(term276042, term276042.getClass(), "call", term276284);
        Class<? extends Object> term277551 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term277550 = ((Class) term277551).getDeclaredField((String) "ORDINARY");
        ((Field) term277550).setAccessible(true);
        Object enum513 = ((Field) term277550).get((Object) null);
        term276394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term276394, term276394.getClass(), "kind", enum513);
        setField(term276394, term276394.getClass(), "call", null);
        Class<? extends Object> term277842 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term277841 = ((Class) term277842).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term277841).setAccessible(true);
        Object enum514 = ((Field) term277841).get((Object) null);
        term277240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term277241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term277241, term277241.getClass(), "parameters", null);
        setField(term277241, term277241.getClass(), "returnType", null);
        setBooleanField(term277241, term277241.getClass(), "returnTypeInferred", false);
        setBooleanField(term277241, term277241.getClass(), "resolved", false);
        setField(term277241, term277241.getClass(), "resolveResult", null);
        setField(term277241, term277241.getClass(), "registry", null);
        setField(term277240, term277240.getClass(), "call", term277241);
        setField(term277240, term277240.getClass(), "prototype", null);
        setField(term277240, term277240.getClass(), "kind", enum514);
        setField(term277240, term277240.getClass(), "typeOfThis", null);
        setField(term277240, term277240.getClass(), "source", null);
        setField(term277240, term277240.getClass(), "implementedInterfaces", null);
        setField(term277240, term277240.getClass(), "subTypes", null);
        setField(term277240, term277240.getClass(), "templateTypeName", null);
        setField(term277240, term277240.getClass(), "className", null);
        setField(term277240, term277240.getClass(), "properties", null);
        setField(term277240, term277240.getClass(), "implicitPrototype", null);
        setBooleanField(term277240, term277240.getClass(), "nativeType", false);
        setBooleanField(term277240, term277240.getClass(), "prettyPrint", false);
        setBooleanField(term277240, term277240.getClass(), "visited", false);
        setField(term277240, term277240.getClass(), "docInfo", null);
        setBooleanField(term277240, term277240.getClass(), "unknown", false);
        setBooleanField(term277240, term277240.getClass(), "resolved", false);
        setField(term277240, term277240.getClass(), "resolveResult", null);
        setField(term277240, term277240.getClass(), "registry", null);
        Class<? extends Object> term278142 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term278141 = ((Class) term278142).getDeclaredField((String) "ORDINARY");
        ((Field) term278141).setAccessible(true);
        Object enum515 = ((Field) term278141).get((Object) null);
        term277245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term277245, term277245.getClass(), "call", null);
        setField(term277245, term277245.getClass(), "prototype", null);
        setField(term277245, term277245.getClass(), "kind", enum515);
        setField(term277245, term277245.getClass(), "typeOfThis", null);
        setField(term277245, term277245.getClass(), "source", null);
        setField(term277245, term277245.getClass(), "implementedInterfaces", null);
        setField(term277245, term277245.getClass(), "subTypes", null);
        setField(term277245, term277245.getClass(), "templateTypeName", null);
        setField(term277245, term277245.getClass(), "className", null);
        setField(term277245, term277245.getClass(), "properties", null);
        setField(term277245, term277245.getClass(), "implicitPrototype", null);
        setBooleanField(term277245, term277245.getClass(), "nativeType", false);
        setBooleanField(term277245, term277245.getClass(), "prettyPrint", false);
        setBooleanField(term277245, term277245.getClass(), "visited", false);
        setField(term277245, term277245.getClass(), "docInfo", null);
        setBooleanField(term277245, term277245.getClass(), "unknown", false);
        setBooleanField(term277245, term277245.getClass(), "resolved", false);
        setField(term277245, term277245.getClass(), "resolveResult", null);
        setField(term277245, term277245.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term276394;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term276042, args);
        assertTrue(recursiveEquals(term276042, term277240));
        assertTrue(recursiveEquals(term276394, term277245));
        assertTrue(recursiveEquals(retValue, false));
    }

};


