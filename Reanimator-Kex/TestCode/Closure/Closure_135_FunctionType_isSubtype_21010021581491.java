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

public class FunctionType_isSubtype_21010021581491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1954654;
     Object term1955112;
     Object term1956566;
     Object term1956572;

    public FunctionType_isSubtype_21010021581491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1956583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1956582 = ((Class) term1956583).getDeclaredField((String) "ORDINARY");
        ((Field) term1956582).setAccessible(true);
        Object enum3646 = ((Field) term1956582).get((Object) null);
        term1954654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1954910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1955004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1954654, term1954654.getClass(), "kind", enum3646);
        setField(term1954910, term1954910.getClass(), "kind", enum3646);
        setField(term1954654, term1954654.getClass(), "typeOfThis", term1954910);
        setField(term1954654, term1954654.getClass(), "call", term1955004);
        Class<? extends Object> term1956874 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1956873 = ((Class) term1956874).getDeclaredField((String) "INTERFACE");
        ((Field) term1956873).setAccessible(true);
        Object enum3647 = ((Field) term1956873).get((Object) null);
        term1955112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1955294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1955536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1955112, term1955112.getClass(), "kind", enum3646);
        setField(term1955294, term1955294.getClass(), "kind", enum3647);
        setField(term1955112, term1955112.getClass(), "typeOfThis", term1955294);
        setField(term1955112, term1955112.getClass(), "call", term1955536);
        Class<? extends Object> term1957168 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1957167 = ((Class) term1957168).getDeclaredField((String) "ORDINARY");
        ((Field) term1957167).setAccessible(true);
        Object enum3648 = ((Field) term1957167).get((Object) null);
        term1956566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1956567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1956571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1956566, term1956566.getClass(), "this$0", null);
        setField(term1956567, term1956567.getClass(), "parameters", null);
        setField(term1956567, term1956567.getClass(), "returnType", null);
        setBooleanField(term1956567, term1956567.getClass(), "resolved", false);
        setField(term1956567, term1956567.getClass(), "resolveResult", null);
        setField(term1956567, term1956567.getClass(), "registry", null);
        setField(term1956566, term1956566.getClass(), "call", term1956567);
        setField(term1956566, term1956566.getClass(), "prototype", null);
        setField(term1956566, term1956566.getClass(), "kind", enum3648);
        setField(term1956571, term1956571.getClass(), "this$0", null);
        setField(term1956571, term1956571.getClass(), "call", null);
        setField(term1956571, term1956571.getClass(), "prototype", null);
        setField(term1956571, term1956571.getClass(), "kind", enum3648);
        setField(term1956571, term1956571.getClass(), "typeOfThis", null);
        setField(term1956571, term1956571.getClass(), "source", null);
        setField(term1956571, term1956571.getClass(), "implementedInterfaces", null);
        setField(term1956571, term1956571.getClass(), "subTypes", null);
        setField(term1956571, term1956571.getClass(), "templateTypeName", null);
        setField(term1956571, term1956571.getClass(), "className", null);
        setField(term1956571, term1956571.getClass(), "properties", null);
        setField(term1956571, term1956571.getClass(), "implicitPrototype", null);
        setBooleanField(term1956571, term1956571.getClass(), "nativeType", false);
        setBooleanField(term1956571, term1956571.getClass(), "visited", false);
        setField(term1956571, term1956571.getClass(), "docInfo", null);
        setBooleanField(term1956571, term1956571.getClass(), "unknown", false);
        setBooleanField(term1956571, term1956571.getClass(), "resolved", false);
        setField(term1956571, term1956571.getClass(), "resolveResult", null);
        setField(term1956571, term1956571.getClass(), "registry", null);
        setField(term1956566, term1956566.getClass(), "typeOfThis", term1956571);
        setField(term1956566, term1956566.getClass(), "source", null);
        setField(term1956566, term1956566.getClass(), "implementedInterfaces", null);
        setField(term1956566, term1956566.getClass(), "subTypes", null);
        setField(term1956566, term1956566.getClass(), "templateTypeName", null);
        setField(term1956566, term1956566.getClass(), "className", null);
        setField(term1956566, term1956566.getClass(), "properties", null);
        setField(term1956566, term1956566.getClass(), "implicitPrototype", null);
        setBooleanField(term1956566, term1956566.getClass(), "nativeType", false);
        setBooleanField(term1956566, term1956566.getClass(), "visited", false);
        setField(term1956566, term1956566.getClass(), "docInfo", null);
        setBooleanField(term1956566, term1956566.getClass(), "unknown", false);
        setBooleanField(term1956566, term1956566.getClass(), "resolved", false);
        setField(term1956566, term1956566.getClass(), "resolveResult", null);
        setField(term1956566, term1956566.getClass(), "registry", null);
        Class<? extends Object> term1957459 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1957458 = ((Class) term1957459).getDeclaredField((String) "ORDINARY");
        ((Field) term1957458).setAccessible(true);
        Object enum3649 = ((Field) term1957458).get((Object) null);
        Class<? extends Object> term1957750 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1957749 = ((Class) term1957750).getDeclaredField((String) "INTERFACE");
        ((Field) term1957749).setAccessible(true);
        Object enum3650 = ((Field) term1957749).get((Object) null);
        term1956572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1956573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1956577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1956572, term1956572.getClass(), "this$0", null);
        setField(term1956573, term1956573.getClass(), "parameters", null);
        setField(term1956573, term1956573.getClass(), "returnType", null);
        setBooleanField(term1956573, term1956573.getClass(), "resolved", false);
        setField(term1956573, term1956573.getClass(), "resolveResult", null);
        setField(term1956573, term1956573.getClass(), "registry", null);
        setField(term1956572, term1956572.getClass(), "call", term1956573);
        setField(term1956572, term1956572.getClass(), "prototype", null);
        setField(term1956572, term1956572.getClass(), "kind", enum3649);
        setField(term1956577, term1956577.getClass(), "this$0", null);
        setField(term1956577, term1956577.getClass(), "call", null);
        setField(term1956577, term1956577.getClass(), "prototype", null);
        setField(term1956577, term1956577.getClass(), "kind", enum3650);
        setField(term1956577, term1956577.getClass(), "typeOfThis", null);
        setField(term1956577, term1956577.getClass(), "source", null);
        setField(term1956577, term1956577.getClass(), "implementedInterfaces", null);
        setField(term1956577, term1956577.getClass(), "subTypes", null);
        setField(term1956577, term1956577.getClass(), "templateTypeName", null);
        setField(term1956577, term1956577.getClass(), "className", null);
        setField(term1956577, term1956577.getClass(), "properties", null);
        setField(term1956577, term1956577.getClass(), "implicitPrototype", null);
        setBooleanField(term1956577, term1956577.getClass(), "nativeType", false);
        setBooleanField(term1956577, term1956577.getClass(), "visited", false);
        setField(term1956577, term1956577.getClass(), "docInfo", null);
        setBooleanField(term1956577, term1956577.getClass(), "unknown", false);
        setBooleanField(term1956577, term1956577.getClass(), "resolved", false);
        setField(term1956577, term1956577.getClass(), "resolveResult", null);
        setField(term1956577, term1956577.getClass(), "registry", null);
        setField(term1956572, term1956572.getClass(), "typeOfThis", term1956577);
        setField(term1956572, term1956572.getClass(), "source", null);
        setField(term1956572, term1956572.getClass(), "implementedInterfaces", null);
        setField(term1956572, term1956572.getClass(), "subTypes", null);
        setField(term1956572, term1956572.getClass(), "templateTypeName", null);
        setField(term1956572, term1956572.getClass(), "className", null);
        setField(term1956572, term1956572.getClass(), "properties", null);
        setField(term1956572, term1956572.getClass(), "implicitPrototype", null);
        setBooleanField(term1956572, term1956572.getClass(), "nativeType", false);
        setBooleanField(term1956572, term1956572.getClass(), "visited", false);
        setField(term1956572, term1956572.getClass(), "docInfo", null);
        setBooleanField(term1956572, term1956572.getClass(), "unknown", false);
        setBooleanField(term1956572, term1956572.getClass(), "resolved", false);
        setField(term1956572, term1956572.getClass(), "resolveResult", null);
        setField(term1956572, term1956572.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1955112;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1954654, args);
        assertTrue(recursiveEquals(term1954654, term1956566));
        assertTrue(recursiveEquals(term1955112, term1956572));
        assertTrue(recursiveEquals(retValue, true));
    }

};


