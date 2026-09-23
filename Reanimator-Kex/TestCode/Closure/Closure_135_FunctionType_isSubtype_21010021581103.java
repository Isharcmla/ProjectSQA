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

public class FunctionType_isSubtype_21010021581103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1289645;
     Object term1289995;
     Object term1291978;
     Object term1291983;

    public FunctionType_isSubtype_21010021581103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1291989 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1291988 = ((Class) term1291989).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1291988).setAccessible(true);
        Object enum2408 = ((Field) term1291988).get((Object) null);
        term1289645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1289887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1289645, term1289645.getClass(), "kind", enum2408);
        setField(term1289645, term1289645.getClass(), "call", term1289887);
        term1289995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1289995, term1289995.getClass(), "kind", enum2408);
        setField(term1289995, term1289995.getClass(), "call", null);
        Class<? extends Object> term1292289 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1292288 = ((Class) term1292289).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1292288).setAccessible(true);
        Object enum2409 = ((Field) term1292288).get((Object) null);
        term1291978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1291979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1291978, term1291978.getClass(), "this$0", null);
        setField(term1291979, term1291979.getClass(), "parameters", null);
        setField(term1291979, term1291979.getClass(), "returnType", null);
        setBooleanField(term1291979, term1291979.getClass(), "resolved", false);
        setField(term1291979, term1291979.getClass(), "resolveResult", null);
        setField(term1291979, term1291979.getClass(), "registry", null);
        setField(term1291978, term1291978.getClass(), "call", term1291979);
        setField(term1291978, term1291978.getClass(), "prototype", null);
        setField(term1291978, term1291978.getClass(), "kind", enum2409);
        setField(term1291978, term1291978.getClass(), "typeOfThis", null);
        setField(term1291978, term1291978.getClass(), "source", null);
        setField(term1291978, term1291978.getClass(), "implementedInterfaces", null);
        setField(term1291978, term1291978.getClass(), "subTypes", null);
        setField(term1291978, term1291978.getClass(), "templateTypeName", null);
        setField(term1291978, term1291978.getClass(), "className", null);
        setField(term1291978, term1291978.getClass(), "properties", null);
        setField(term1291978, term1291978.getClass(), "implicitPrototype", null);
        setBooleanField(term1291978, term1291978.getClass(), "nativeType", false);
        setBooleanField(term1291978, term1291978.getClass(), "visited", false);
        setField(term1291978, term1291978.getClass(), "docInfo", null);
        setBooleanField(term1291978, term1291978.getClass(), "unknown", false);
        setBooleanField(term1291978, term1291978.getClass(), "resolved", false);
        setField(term1291978, term1291978.getClass(), "resolveResult", null);
        setField(term1291978, term1291978.getClass(), "registry", null);
        Class<? extends Object> term1292589 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1292588 = ((Class) term1292589).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1292588).setAccessible(true);
        Object enum2410 = ((Field) term1292588).get((Object) null);
        term1291983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1291983, term1291983.getClass(), "this$0", null);
        setField(term1291983, term1291983.getClass(), "call", null);
        setField(term1291983, term1291983.getClass(), "prototype", null);
        setField(term1291983, term1291983.getClass(), "kind", enum2410);
        setField(term1291983, term1291983.getClass(), "typeOfThis", null);
        setField(term1291983, term1291983.getClass(), "source", null);
        setField(term1291983, term1291983.getClass(), "implementedInterfaces", null);
        setField(term1291983, term1291983.getClass(), "subTypes", null);
        setField(term1291983, term1291983.getClass(), "templateTypeName", null);
        setField(term1291983, term1291983.getClass(), "className", null);
        setField(term1291983, term1291983.getClass(), "properties", null);
        setField(term1291983, term1291983.getClass(), "implicitPrototype", null);
        setBooleanField(term1291983, term1291983.getClass(), "nativeType", false);
        setBooleanField(term1291983, term1291983.getClass(), "visited", false);
        setField(term1291983, term1291983.getClass(), "docInfo", null);
        setBooleanField(term1291983, term1291983.getClass(), "unknown", false);
        setBooleanField(term1291983, term1291983.getClass(), "resolved", false);
        setField(term1291983, term1291983.getClass(), "resolveResult", null);
        setField(term1291983, term1291983.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1289995;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1289645, args);
        assertTrue(recursiveEquals(term1289645, term1291978));
        assertTrue(recursiveEquals(term1289995, term1291983));
        assertTrue(recursiveEquals(retValue, false));
    }

};


