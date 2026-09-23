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

public class FunctionType_isSubtype_21010021581249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1546692;
     Object term1546948;
     Object term1548162;
     Object term1548166;

    public FunctionType_isSubtype_21010021581249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1548176 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1548175 = ((Class) term1548176).getDeclaredField((String) "INTERFACE");
        ((Field) term1548175).setAccessible(true);
        Object enum2888 = ((Field) term1548175).get((Object) null);
        term1546692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1546692, term1546692.getClass(), "kind", enum2888);
        setField(term1546692, term1546692.getClass(), "typeOfThis", term1546692);
        Class<? extends Object> term1548470 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1548469 = ((Class) term1548470).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1548469).setAccessible(true);
        Object enum2889 = ((Field) term1548469).get((Object) null);
        term1546948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1547426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1546948, term1546948.getClass(), "kind", enum2889);
        setField(term1547426, term1547426.getClass(), "kind", enum2888);
        setField(term1546948, term1546948.getClass(), "typeOfThis", term1547426);
        Class<? extends Object> term1548770 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1548769 = ((Class) term1548770).getDeclaredField((String) "INTERFACE");
        ((Field) term1548769).setAccessible(true);
        Object enum2890 = ((Field) term1548769).get((Object) null);
        term1548162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1548162, term1548162.getClass(), "this$0", null);
        setField(term1548162, term1548162.getClass(), "call", null);
        setField(term1548162, term1548162.getClass(), "prototype", null);
        setField(term1548162, term1548162.getClass(), "kind", enum2890);
        setField(term1548162, term1548162.getClass(), "typeOfThis", term1548162);
        setField(term1548162, term1548162.getClass(), "source", null);
        setField(term1548162, term1548162.getClass(), "implementedInterfaces", null);
        setField(term1548162, term1548162.getClass(), "subTypes", null);
        setField(term1548162, term1548162.getClass(), "templateTypeName", null);
        setField(term1548162, term1548162.getClass(), "className", null);
        setField(term1548162, term1548162.getClass(), "properties", null);
        setField(term1548162, term1548162.getClass(), "implicitPrototype", null);
        setBooleanField(term1548162, term1548162.getClass(), "nativeType", false);
        setBooleanField(term1548162, term1548162.getClass(), "visited", false);
        setField(term1548162, term1548162.getClass(), "docInfo", null);
        setBooleanField(term1548162, term1548162.getClass(), "unknown", false);
        setBooleanField(term1548162, term1548162.getClass(), "resolved", false);
        setField(term1548162, term1548162.getClass(), "resolveResult", null);
        setField(term1548162, term1548162.getClass(), "registry", null);
        Class<? extends Object> term1549064 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1549063 = ((Class) term1549064).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1549063).setAccessible(true);
        Object enum2891 = ((Field) term1549063).get((Object) null);
        Class<? extends Object> term1549364 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1549363 = ((Class) term1549364).getDeclaredField((String) "INTERFACE");
        ((Field) term1549363).setAccessible(true);
        Object enum2892 = ((Field) term1549363).get((Object) null);
        term1548166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1548170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1548166, term1548166.getClass(), "this$0", null);
        setField(term1548166, term1548166.getClass(), "call", null);
        setField(term1548166, term1548166.getClass(), "prototype", null);
        setField(term1548166, term1548166.getClass(), "kind", enum2891);
        setField(term1548170, term1548170.getClass(), "this$0", null);
        setField(term1548170, term1548170.getClass(), "call", null);
        setField(term1548170, term1548170.getClass(), "prototype", null);
        setField(term1548170, term1548170.getClass(), "kind", enum2892);
        setField(term1548170, term1548170.getClass(), "typeOfThis", null);
        setField(term1548170, term1548170.getClass(), "source", null);
        setField(term1548170, term1548170.getClass(), "implementedInterfaces", null);
        setField(term1548170, term1548170.getClass(), "subTypes", null);
        setField(term1548170, term1548170.getClass(), "templateTypeName", null);
        setField(term1548170, term1548170.getClass(), "className", null);
        setField(term1548170, term1548170.getClass(), "properties", null);
        setField(term1548170, term1548170.getClass(), "implicitPrototype", null);
        setBooleanField(term1548170, term1548170.getClass(), "nativeType", false);
        setBooleanField(term1548170, term1548170.getClass(), "visited", false);
        setField(term1548170, term1548170.getClass(), "docInfo", null);
        setBooleanField(term1548170, term1548170.getClass(), "unknown", false);
        setBooleanField(term1548170, term1548170.getClass(), "resolved", false);
        setField(term1548170, term1548170.getClass(), "resolveResult", null);
        setField(term1548170, term1548170.getClass(), "registry", null);
        setField(term1548166, term1548166.getClass(), "typeOfThis", term1548170);
        setField(term1548166, term1548166.getClass(), "source", null);
        setField(term1548166, term1548166.getClass(), "implementedInterfaces", null);
        setField(term1548166, term1548166.getClass(), "subTypes", null);
        setField(term1548166, term1548166.getClass(), "templateTypeName", null);
        setField(term1548166, term1548166.getClass(), "className", null);
        setField(term1548166, term1548166.getClass(), "properties", null);
        setField(term1548166, term1548166.getClass(), "implicitPrototype", null);
        setBooleanField(term1548166, term1548166.getClass(), "nativeType", false);
        setBooleanField(term1548166, term1548166.getClass(), "visited", false);
        setField(term1548166, term1548166.getClass(), "docInfo", null);
        setBooleanField(term1548166, term1548166.getClass(), "unknown", false);
        setBooleanField(term1548166, term1548166.getClass(), "resolved", false);
        setField(term1548166, term1548166.getClass(), "resolveResult", null);
        setField(term1548166, term1548166.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1546948;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1546692, args);
        assertTrue(recursiveEquals(term1546692, term1548162));
        assertTrue(recursiveEquals(term1546948, term1548166));
        assertTrue(recursiveEquals(retValue, false));
    }

};


