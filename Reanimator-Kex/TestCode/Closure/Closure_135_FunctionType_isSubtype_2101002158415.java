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

public class FunctionType_isSubtype_2101002158415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269270;
     Object term269620;
     Object term270090;
     Object term270095;

    public FunctionType_isSubtype_2101002158415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term270101 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term270100 = ((Class) term270101).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term270100).setAccessible(true);
        Object enum488 = ((Field) term270100).get((Object) null);
        term269270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term269512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term269270, term269270.getClass(), "kind", enum488);
        setField(term269270, term269270.getClass(), "call", term269512);
        term269620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term269620, term269620.getClass(), "kind", enum488);
        setField(term269620, term269620.getClass(), "call", null);
        Class<? extends Object> term270401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term270400 = ((Class) term270401).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term270400).setAccessible(true);
        Object enum489 = ((Field) term270400).get((Object) null);
        term270090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term270091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term270091, term270091.getClass(), "parameters", null);
        setField(term270091, term270091.getClass(), "returnType", null);
        setBooleanField(term270091, term270091.getClass(), "resolved", false);
        setField(term270091, term270091.getClass(), "resolveResult", null);
        setField(term270091, term270091.getClass(), "registry", null);
        setField(term270090, term270090.getClass(), "call", term270091);
        setField(term270090, term270090.getClass(), "prototype", null);
        setField(term270090, term270090.getClass(), "kind", enum489);
        setField(term270090, term270090.getClass(), "typeOfThis", null);
        setField(term270090, term270090.getClass(), "source", null);
        setField(term270090, term270090.getClass(), "implementedInterfaces", null);
        setField(term270090, term270090.getClass(), "subTypes", null);
        setField(term270090, term270090.getClass(), "templateTypeName", null);
        setField(term270090, term270090.getClass(), "className", null);
        setField(term270090, term270090.getClass(), "properties", null);
        setField(term270090, term270090.getClass(), "implicitPrototype", null);
        setBooleanField(term270090, term270090.getClass(), "nativeType", false);
        setBooleanField(term270090, term270090.getClass(), "visited", false);
        setField(term270090, term270090.getClass(), "docInfo", null);
        setBooleanField(term270090, term270090.getClass(), "unknown", false);
        setBooleanField(term270090, term270090.getClass(), "resolved", false);
        setField(term270090, term270090.getClass(), "resolveResult", null);
        setField(term270090, term270090.getClass(), "registry", null);
        Class<? extends Object> term270701 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term270700 = ((Class) term270701).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term270700).setAccessible(true);
        Object enum490 = ((Field) term270700).get((Object) null);
        term270095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term270095, term270095.getClass(), "this$0", null);
        setField(term270095, term270095.getClass(), "call", null);
        setField(term270095, term270095.getClass(), "prototype", null);
        setField(term270095, term270095.getClass(), "kind", enum490);
        setField(term270095, term270095.getClass(), "typeOfThis", null);
        setField(term270095, term270095.getClass(), "source", null);
        setField(term270095, term270095.getClass(), "implementedInterfaces", null);
        setField(term270095, term270095.getClass(), "subTypes", null);
        setField(term270095, term270095.getClass(), "templateTypeName", null);
        setField(term270095, term270095.getClass(), "className", null);
        setField(term270095, term270095.getClass(), "properties", null);
        setField(term270095, term270095.getClass(), "implicitPrototype", null);
        setBooleanField(term270095, term270095.getClass(), "nativeType", false);
        setBooleanField(term270095, term270095.getClass(), "visited", false);
        setField(term270095, term270095.getClass(), "docInfo", null);
        setBooleanField(term270095, term270095.getClass(), "unknown", false);
        setBooleanField(term270095, term270095.getClass(), "resolved", false);
        setField(term270095, term270095.getClass(), "resolveResult", null);
        setField(term270095, term270095.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term269620;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term269270, args);
        assertTrue(recursiveEquals(term269270, term270090));
        assertTrue(recursiveEquals(term269620, term270095));
        assertTrue(recursiveEquals(retValue, false));
    }

};


