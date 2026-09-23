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

public class FunctionType_isSubtype_2101002158746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708630;
     Object term708980;
     Object term711453;
     Object term711458;

    public FunctionType_isSubtype_2101002158746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term711464 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term711463 = ((Class) term711464).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term711463).setAccessible(true);
        Object enum1321 = ((Field) term711463).get((Object) null);
        term708630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term708872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term708630, term708630.getClass(), "kind", enum1321);
        setField(term708630, term708630.getClass(), "call", term708872);
        Class<? extends Object> term711764 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term711763 = ((Class) term711764).getDeclaredField((String) "ORDINARY");
        ((Field) term711763).setAccessible(true);
        Object enum1322 = ((Field) term711763).get((Object) null);
        term708980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term708980, term708980.getClass(), "kind", enum1322);
        setField(term708980, term708980.getClass(), "call", null);
        Class<? extends Object> term712055 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term712054 = ((Class) term712055).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term712054).setAccessible(true);
        Object enum1323 = ((Field) term712054).get((Object) null);
        term711453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term711454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term711453, term711453.getClass(), "this$0", null);
        setField(term711454, term711454.getClass(), "parameters", null);
        setField(term711454, term711454.getClass(), "returnType", null);
        setBooleanField(term711454, term711454.getClass(), "resolved", false);
        setField(term711454, term711454.getClass(), "resolveResult", null);
        setField(term711454, term711454.getClass(), "registry", null);
        setField(term711453, term711453.getClass(), "call", term711454);
        setField(term711453, term711453.getClass(), "prototype", null);
        setField(term711453, term711453.getClass(), "kind", enum1323);
        setField(term711453, term711453.getClass(), "typeOfThis", null);
        setField(term711453, term711453.getClass(), "source", null);
        setField(term711453, term711453.getClass(), "implementedInterfaces", null);
        setField(term711453, term711453.getClass(), "subTypes", null);
        setField(term711453, term711453.getClass(), "templateTypeName", null);
        setField(term711453, term711453.getClass(), "className", null);
        setField(term711453, term711453.getClass(), "properties", null);
        setField(term711453, term711453.getClass(), "implicitPrototype", null);
        setBooleanField(term711453, term711453.getClass(), "nativeType", false);
        setBooleanField(term711453, term711453.getClass(), "visited", false);
        setField(term711453, term711453.getClass(), "docInfo", null);
        setBooleanField(term711453, term711453.getClass(), "unknown", false);
        setBooleanField(term711453, term711453.getClass(), "resolved", false);
        setField(term711453, term711453.getClass(), "resolveResult", null);
        setField(term711453, term711453.getClass(), "registry", null);
        Class<? extends Object> term712355 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term712354 = ((Class) term712355).getDeclaredField((String) "ORDINARY");
        ((Field) term712354).setAccessible(true);
        Object enum1324 = ((Field) term712354).get((Object) null);
        term711458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term711458, term711458.getClass(), "this$0", null);
        setField(term711458, term711458.getClass(), "call", null);
        setField(term711458, term711458.getClass(), "prototype", null);
        setField(term711458, term711458.getClass(), "kind", enum1324);
        setField(term711458, term711458.getClass(), "typeOfThis", null);
        setField(term711458, term711458.getClass(), "source", null);
        setField(term711458, term711458.getClass(), "implementedInterfaces", null);
        setField(term711458, term711458.getClass(), "subTypes", null);
        setField(term711458, term711458.getClass(), "templateTypeName", null);
        setField(term711458, term711458.getClass(), "className", null);
        setField(term711458, term711458.getClass(), "properties", null);
        setField(term711458, term711458.getClass(), "implicitPrototype", null);
        setBooleanField(term711458, term711458.getClass(), "nativeType", false);
        setBooleanField(term711458, term711458.getClass(), "visited", false);
        setField(term711458, term711458.getClass(), "docInfo", null);
        setBooleanField(term711458, term711458.getClass(), "unknown", false);
        setBooleanField(term711458, term711458.getClass(), "resolved", false);
        setField(term711458, term711458.getClass(), "resolveResult", null);
        setField(term711458, term711458.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term708980;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term708630, args);
        assertTrue(recursiveEquals(term708630, term711453));
        assertTrue(recursiveEquals(term708980, term711458));
        assertTrue(recursiveEquals(retValue, false));
    }

};


