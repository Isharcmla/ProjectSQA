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

public class FunctionType_isSubtype_2101002158509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376153;
     Object term376705;
     Object term377454;
     Object term377458;

    public FunctionType_isSubtype_2101002158509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term377464 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term377463 = ((Class) term377464).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term377463).setAccessible(true);
        Object enum692 = ((Field) term377463).get((Object) null);
        term376153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term376153, term376153.getClass(), "kind", enum692);
        Class<? extends Object> term377764 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term377763 = ((Class) term377764).getDeclaredField((String) "INTERFACE");
        ((Field) term377763).setAccessible(true);
        Object enum693 = ((Field) term377763).get((Object) null);
        term376705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term376705, term376705.getClass(), "kind", enum693);
        Class<? extends Object> term378058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term378057 = ((Class) term378058).getDeclaredField((String) "INTERFACE");
        ((Field) term378057).setAccessible(true);
        Object enum694 = ((Field) term378057).get((Object) null);
        term377454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term377454, term377454.getClass(), "this$0", null);
        setField(term377454, term377454.getClass(), "call", null);
        setField(term377454, term377454.getClass(), "prototype", null);
        setField(term377454, term377454.getClass(), "kind", enum694);
        setField(term377454, term377454.getClass(), "typeOfThis", null);
        setField(term377454, term377454.getClass(), "source", null);
        setField(term377454, term377454.getClass(), "implementedInterfaces", null);
        setField(term377454, term377454.getClass(), "subTypes", null);
        setField(term377454, term377454.getClass(), "templateTypeName", null);
        setField(term377454, term377454.getClass(), "className", null);
        setField(term377454, term377454.getClass(), "properties", null);
        setField(term377454, term377454.getClass(), "implicitPrototype", null);
        setBooleanField(term377454, term377454.getClass(), "nativeType", false);
        setBooleanField(term377454, term377454.getClass(), "visited", false);
        setField(term377454, term377454.getClass(), "docInfo", null);
        setBooleanField(term377454, term377454.getClass(), "unknown", false);
        setBooleanField(term377454, term377454.getClass(), "resolved", false);
        setField(term377454, term377454.getClass(), "resolveResult", null);
        setField(term377454, term377454.getClass(), "registry", null);
        Class<? extends Object> term378352 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term378351 = ((Class) term378352).getDeclaredField((String) "INTERFACE");
        ((Field) term378351).setAccessible(true);
        Object enum695 = ((Field) term378351).get((Object) null);
        term377458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term377458, term377458.getClass(), "this$0", null);
        setField(term377458, term377458.getClass(), "call", null);
        setField(term377458, term377458.getClass(), "prototype", null);
        setField(term377458, term377458.getClass(), "kind", enum695);
        setField(term377458, term377458.getClass(), "typeOfThis", null);
        setField(term377458, term377458.getClass(), "source", null);
        setField(term377458, term377458.getClass(), "implementedInterfaces", null);
        setField(term377458, term377458.getClass(), "subTypes", null);
        setField(term377458, term377458.getClass(), "templateTypeName", null);
        setField(term377458, term377458.getClass(), "className", null);
        setField(term377458, term377458.getClass(), "properties", null);
        setField(term377458, term377458.getClass(), "implicitPrototype", null);
        setBooleanField(term377458, term377458.getClass(), "nativeType", false);
        setBooleanField(term377458, term377458.getClass(), "visited", false);
        setField(term377458, term377458.getClass(), "docInfo", null);
        setBooleanField(term377458, term377458.getClass(), "unknown", false);
        setBooleanField(term377458, term377458.getClass(), "resolved", false);
        setField(term377458, term377458.getClass(), "resolveResult", null);
        setField(term377458, term377458.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term376705;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term376153, args);
        assertTrue(recursiveEquals(term376153, term377454));
        assertTrue(recursiveEquals(term376705, term377458));
        assertTrue(recursiveEquals(retValue, true));
    }

};


