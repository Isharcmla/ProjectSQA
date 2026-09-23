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

public class FunctionType_isSubtype_2101002158579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470798;
     Object term471054;
     Object term472632;
     Object term472636;

    public FunctionType_isSubtype_2101002158579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term472639 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term472638 = ((Class) term472639).getDeclaredField((String) "INTERFACE");
        ((Field) term472638).setAccessible(true);
        Object enum873 = ((Field) term472638).get((Object) null);
        term470798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term470798, term470798.getClass(), "kind", enum873);
        term471054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class<? extends Object> term472933 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term472932 = ((Class) term472933).getDeclaredField((String) "INTERFACE");
        ((Field) term472932).setAccessible(true);
        Object enum874 = ((Field) term472932).get((Object) null);
        term472632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term472632, term472632.getClass(), "call", null);
        setField(term472632, term472632.getClass(), "prototype", null);
        setField(term472632, term472632.getClass(), "kind", enum874);
        setField(term472632, term472632.getClass(), "typeOfThis", null);
        setField(term472632, term472632.getClass(), "source", null);
        setField(term472632, term472632.getClass(), "implementedInterfaces", null);
        setField(term472632, term472632.getClass(), "subTypes", null);
        setField(term472632, term472632.getClass(), "templateTypeName", null);
        setField(term472632, term472632.getClass(), "className", null);
        setField(term472632, term472632.getClass(), "properties", null);
        setField(term472632, term472632.getClass(), "implicitPrototype", null);
        setBooleanField(term472632, term472632.getClass(), "nativeType", false);
        setBooleanField(term472632, term472632.getClass(), "visited", false);
        setField(term472632, term472632.getClass(), "docInfo", null);
        setBooleanField(term472632, term472632.getClass(), "unknown", false);
        setBooleanField(term472632, term472632.getClass(), "resolved", false);
        setField(term472632, term472632.getClass(), "resolveResult", null);
        setField(term472632, term472632.getClass(), "registry", null);
        term472636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term472636, term472636.getClass(), "this$0", null);
        setField(term472636, term472636.getClass(), "call", null);
        setField(term472636, term472636.getClass(), "prototype", null);
        setField(term472636, term472636.getClass(), "kind", null);
        setField(term472636, term472636.getClass(), "typeOfThis", null);
        setField(term472636, term472636.getClass(), "source", null);
        setField(term472636, term472636.getClass(), "implementedInterfaces", null);
        setField(term472636, term472636.getClass(), "subTypes", null);
        setField(term472636, term472636.getClass(), "templateTypeName", null);
        setField(term472636, term472636.getClass(), "className", null);
        setField(term472636, term472636.getClass(), "properties", null);
        setField(term472636, term472636.getClass(), "implicitPrototype", null);
        setBooleanField(term472636, term472636.getClass(), "nativeType", false);
        setBooleanField(term472636, term472636.getClass(), "visited", false);
        setField(term472636, term472636.getClass(), "docInfo", null);
        setBooleanField(term472636, term472636.getClass(), "unknown", false);
        setBooleanField(term472636, term472636.getClass(), "resolved", false);
        setField(term472636, term472636.getClass(), "resolveResult", null);
        setField(term472636, term472636.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term471054;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term470798, args);
        assertTrue(recursiveEquals(term470798, term472632));
        assertTrue(recursiveEquals(term471054, term472636));
        assertTrue(recursiveEquals(retValue, false));
    }

};


