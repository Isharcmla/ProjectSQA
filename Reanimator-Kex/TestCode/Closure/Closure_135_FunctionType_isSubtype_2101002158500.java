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

public class FunctionType_isSubtype_2101002158500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360940;
     Object term361290;
     Object term362881;
     Object term362886;

    public FunctionType_isSubtype_2101002158500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term362892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term362891 = ((Class) term362892).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term362891).setAccessible(true);
        Object enum661 = ((Field) term362891).get((Object) null);
        term360940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term361182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term360940, term360940.getClass(), "kind", enum661);
        setField(term360940, term360940.getClass(), "call", term361182);
        Class<? extends Object> term363192 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term363191 = ((Class) term363192).getDeclaredField((String) "ORDINARY");
        ((Field) term363191).setAccessible(true);
        Object enum662 = ((Field) term363191).get((Object) null);
        term361290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term361290, term361290.getClass(), "kind", enum662);
        setField(term361290, term361290.getClass(), "call", null);
        Class<? extends Object> term363483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term363482 = ((Class) term363483).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term363482).setAccessible(true);
        Object enum663 = ((Field) term363482).get((Object) null);
        term362881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term362882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term362881, term362881.getClass(), "this$0", null);
        setField(term362882, term362882.getClass(), "parameters", null);
        setField(term362882, term362882.getClass(), "returnType", null);
        setBooleanField(term362882, term362882.getClass(), "resolved", false);
        setField(term362882, term362882.getClass(), "resolveResult", null);
        setField(term362882, term362882.getClass(), "registry", null);
        setField(term362881, term362881.getClass(), "call", term362882);
        setField(term362881, term362881.getClass(), "prototype", null);
        setField(term362881, term362881.getClass(), "kind", enum663);
        setField(term362881, term362881.getClass(), "typeOfThis", null);
        setField(term362881, term362881.getClass(), "source", null);
        setField(term362881, term362881.getClass(), "implementedInterfaces", null);
        setField(term362881, term362881.getClass(), "subTypes", null);
        setField(term362881, term362881.getClass(), "templateTypeName", null);
        setField(term362881, term362881.getClass(), "className", null);
        setField(term362881, term362881.getClass(), "properties", null);
        setField(term362881, term362881.getClass(), "implicitPrototype", null);
        setBooleanField(term362881, term362881.getClass(), "nativeType", false);
        setBooleanField(term362881, term362881.getClass(), "visited", false);
        setField(term362881, term362881.getClass(), "docInfo", null);
        setBooleanField(term362881, term362881.getClass(), "unknown", false);
        setBooleanField(term362881, term362881.getClass(), "resolved", false);
        setField(term362881, term362881.getClass(), "resolveResult", null);
        setField(term362881, term362881.getClass(), "registry", null);
        Class<? extends Object> term363783 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term363782 = ((Class) term363783).getDeclaredField((String) "ORDINARY");
        ((Field) term363782).setAccessible(true);
        Object enum664 = ((Field) term363782).get((Object) null);
        term362886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term362886, term362886.getClass(), "this$0", null);
        setField(term362886, term362886.getClass(), "call", null);
        setField(term362886, term362886.getClass(), "prototype", null);
        setField(term362886, term362886.getClass(), "kind", enum664);
        setField(term362886, term362886.getClass(), "typeOfThis", null);
        setField(term362886, term362886.getClass(), "source", null);
        setField(term362886, term362886.getClass(), "implementedInterfaces", null);
        setField(term362886, term362886.getClass(), "subTypes", null);
        setField(term362886, term362886.getClass(), "templateTypeName", null);
        setField(term362886, term362886.getClass(), "className", null);
        setField(term362886, term362886.getClass(), "properties", null);
        setField(term362886, term362886.getClass(), "implicitPrototype", null);
        setBooleanField(term362886, term362886.getClass(), "nativeType", false);
        setBooleanField(term362886, term362886.getClass(), "visited", false);
        setField(term362886, term362886.getClass(), "docInfo", null);
        setBooleanField(term362886, term362886.getClass(), "unknown", false);
        setBooleanField(term362886, term362886.getClass(), "resolved", false);
        setField(term362886, term362886.getClass(), "resolveResult", null);
        setField(term362886, term362886.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term361290;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term360940, args);
        assertTrue(recursiveEquals(term360940, term362881));
        assertTrue(recursiveEquals(term361290, term362886));
        assertTrue(recursiveEquals(retValue, false));
    }

};


