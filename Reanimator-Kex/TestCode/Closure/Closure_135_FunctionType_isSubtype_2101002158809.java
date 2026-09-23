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

public class FunctionType_isSubtype_2101002158809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813268;
     Object term813620;
     Object term814090;
     Object term814095;

    public FunctionType_isSubtype_2101002158809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term814101 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term814100 = ((Class) term814101).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term814100).setAccessible(true);
        Object enum1518 = ((Field) term814100).get((Object) null);
        term813268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term813510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term813268, term813268.getClass(), "kind", enum1518);
        setField(term813268, term813268.getClass(), "call", term813510);
        term813620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term813620, term813620.getClass(), "kind", enum1518);
        setField(term813620, term813620.getClass(), "call", null);
        Class<? extends Object> term814401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term814400 = ((Class) term814401).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term814400).setAccessible(true);
        Object enum1519 = ((Field) term814400).get((Object) null);
        term814090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term814091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term814090, term814090.getClass(), "this$0", null);
        setField(term814091, term814091.getClass(), "parameters", null);
        setField(term814091, term814091.getClass(), "returnType", null);
        setBooleanField(term814091, term814091.getClass(), "resolved", false);
        setField(term814091, term814091.getClass(), "resolveResult", null);
        setField(term814091, term814091.getClass(), "registry", null);
        setField(term814090, term814090.getClass(), "call", term814091);
        setField(term814090, term814090.getClass(), "prototype", null);
        setField(term814090, term814090.getClass(), "kind", enum1519);
        setField(term814090, term814090.getClass(), "typeOfThis", null);
        setField(term814090, term814090.getClass(), "source", null);
        setField(term814090, term814090.getClass(), "implementedInterfaces", null);
        setField(term814090, term814090.getClass(), "subTypes", null);
        setField(term814090, term814090.getClass(), "templateTypeName", null);
        setField(term814090, term814090.getClass(), "className", null);
        setField(term814090, term814090.getClass(), "properties", null);
        setField(term814090, term814090.getClass(), "implicitPrototype", null);
        setBooleanField(term814090, term814090.getClass(), "nativeType", false);
        setBooleanField(term814090, term814090.getClass(), "visited", false);
        setField(term814090, term814090.getClass(), "docInfo", null);
        setBooleanField(term814090, term814090.getClass(), "unknown", false);
        setBooleanField(term814090, term814090.getClass(), "resolved", false);
        setField(term814090, term814090.getClass(), "resolveResult", null);
        setField(term814090, term814090.getClass(), "registry", null);
        Class<? extends Object> term814701 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term814700 = ((Class) term814701).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term814700).setAccessible(true);
        Object enum1520 = ((Field) term814700).get((Object) null);
        term814095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term814095, term814095.getClass(), "call", null);
        setField(term814095, term814095.getClass(), "prototype", null);
        setField(term814095, term814095.getClass(), "kind", enum1520);
        setField(term814095, term814095.getClass(), "typeOfThis", null);
        setField(term814095, term814095.getClass(), "source", null);
        setField(term814095, term814095.getClass(), "implementedInterfaces", null);
        setField(term814095, term814095.getClass(), "subTypes", null);
        setField(term814095, term814095.getClass(), "templateTypeName", null);
        setField(term814095, term814095.getClass(), "className", null);
        setField(term814095, term814095.getClass(), "properties", null);
        setField(term814095, term814095.getClass(), "implicitPrototype", null);
        setBooleanField(term814095, term814095.getClass(), "nativeType", false);
        setBooleanField(term814095, term814095.getClass(), "visited", false);
        setField(term814095, term814095.getClass(), "docInfo", null);
        setBooleanField(term814095, term814095.getClass(), "unknown", false);
        setBooleanField(term814095, term814095.getClass(), "resolved", false);
        setField(term814095, term814095.getClass(), "resolveResult", null);
        setField(term814095, term814095.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term813620;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term813268, args);
        assertTrue(recursiveEquals(term813268, term814090));
        assertTrue(recursiveEquals(term813620, term814095));
        assertTrue(recursiveEquals(retValue, false));
    }

};


