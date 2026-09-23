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

public class FunctionType_isSubtype_21010021581487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946635;
     Object term1947287;
     Object term1948578;
     Object term1948583;

    public FunctionType_isSubtype_21010021581487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1948593 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1948592 = ((Class) term1948593).getDeclaredField((String) "INTERFACE");
        ((Field) term1948592).setAccessible(true);
        Object enum3629 = ((Field) term1948592).get((Object) null);
        term1946635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1947179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1946635, term1946635.getClass(), "kind", enum3629);
        setField(term1947179, term1947179.getClass(), "kind", enum3629);
        setField(term1946635, term1946635.getClass(), "typeOfThis", term1947179);
        Class<? extends Object> term1948887 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1948886 = ((Class) term1948887).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1948886).setAccessible(true);
        Object enum3630 = ((Field) term1948886).get((Object) null);
        Class<? extends Object> term1949187 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1949186 = ((Class) term1949187).getDeclaredField((String) "INTERFACE");
        ((Field) term1949186).setAccessible(true);
        Object enum3631 = ((Field) term1949186).get((Object) null);
        term1947287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1947469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1947287, term1947287.getClass(), "kind", enum3630);
        setField(term1947469, term1947469.getClass(), "kind", enum3631);
        setField(term1947287, term1947287.getClass(), "typeOfThis", term1947469);
        Class<? extends Object> term1949481 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1949480 = ((Class) term1949481).getDeclaredField((String) "INTERFACE");
        ((Field) term1949480).setAccessible(true);
        Object enum3632 = ((Field) term1949480).get((Object) null);
        term1948578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1948582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1948578, term1948578.getClass(), "this$0", null);
        setField(term1948578, term1948578.getClass(), "call", null);
        setField(term1948578, term1948578.getClass(), "prototype", null);
        setField(term1948578, term1948578.getClass(), "kind", enum3632);
        setField(term1948582, term1948582.getClass(), "call", null);
        setField(term1948582, term1948582.getClass(), "prototype", null);
        setField(term1948582, term1948582.getClass(), "kind", enum3632);
        setField(term1948582, term1948582.getClass(), "typeOfThis", null);
        setField(term1948582, term1948582.getClass(), "source", null);
        setField(term1948582, term1948582.getClass(), "implementedInterfaces", null);
        setField(term1948582, term1948582.getClass(), "subTypes", null);
        setField(term1948582, term1948582.getClass(), "templateTypeName", null);
        setField(term1948582, term1948582.getClass(), "className", null);
        setField(term1948582, term1948582.getClass(), "properties", null);
        setField(term1948582, term1948582.getClass(), "implicitPrototype", null);
        setBooleanField(term1948582, term1948582.getClass(), "nativeType", false);
        setBooleanField(term1948582, term1948582.getClass(), "visited", false);
        setField(term1948582, term1948582.getClass(), "docInfo", null);
        setBooleanField(term1948582, term1948582.getClass(), "unknown", false);
        setBooleanField(term1948582, term1948582.getClass(), "resolved", false);
        setField(term1948582, term1948582.getClass(), "resolveResult", null);
        setField(term1948582, term1948582.getClass(), "registry", null);
        setField(term1948578, term1948578.getClass(), "typeOfThis", term1948582);
        setField(term1948578, term1948578.getClass(), "source", null);
        setField(term1948578, term1948578.getClass(), "implementedInterfaces", null);
        setField(term1948578, term1948578.getClass(), "subTypes", null);
        setField(term1948578, term1948578.getClass(), "templateTypeName", null);
        setField(term1948578, term1948578.getClass(), "className", null);
        setField(term1948578, term1948578.getClass(), "properties", null);
        setField(term1948578, term1948578.getClass(), "implicitPrototype", null);
        setBooleanField(term1948578, term1948578.getClass(), "nativeType", false);
        setBooleanField(term1948578, term1948578.getClass(), "visited", false);
        setField(term1948578, term1948578.getClass(), "docInfo", null);
        setBooleanField(term1948578, term1948578.getClass(), "unknown", false);
        setBooleanField(term1948578, term1948578.getClass(), "resolved", false);
        setField(term1948578, term1948578.getClass(), "resolveResult", null);
        setField(term1948578, term1948578.getClass(), "registry", null);
        Class<? extends Object> term1949775 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1949774 = ((Class) term1949775).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1949774).setAccessible(true);
        Object enum3633 = ((Field) term1949774).get((Object) null);
        Class<? extends Object> term1950075 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1950074 = ((Class) term1950075).getDeclaredField((String) "INTERFACE");
        ((Field) term1950074).setAccessible(true);
        Object enum3634 = ((Field) term1950074).get((Object) null);
        term1948583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1948587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1948583, term1948583.getClass(), "this$0", null);
        setField(term1948583, term1948583.getClass(), "call", null);
        setField(term1948583, term1948583.getClass(), "prototype", null);
        setField(term1948583, term1948583.getClass(), "kind", enum3633);
        setField(term1948587, term1948587.getClass(), "this$0", null);
        setField(term1948587, term1948587.getClass(), "call", null);
        setField(term1948587, term1948587.getClass(), "prototype", null);
        setField(term1948587, term1948587.getClass(), "kind", enum3634);
        setField(term1948587, term1948587.getClass(), "typeOfThis", null);
        setField(term1948587, term1948587.getClass(), "source", null);
        setField(term1948587, term1948587.getClass(), "implementedInterfaces", null);
        setField(term1948587, term1948587.getClass(), "subTypes", null);
        setField(term1948587, term1948587.getClass(), "templateTypeName", null);
        setField(term1948587, term1948587.getClass(), "className", null);
        setField(term1948587, term1948587.getClass(), "properties", null);
        setField(term1948587, term1948587.getClass(), "implicitPrototype", null);
        setBooleanField(term1948587, term1948587.getClass(), "nativeType", false);
        setBooleanField(term1948587, term1948587.getClass(), "visited", false);
        setField(term1948587, term1948587.getClass(), "docInfo", null);
        setBooleanField(term1948587, term1948587.getClass(), "unknown", false);
        setBooleanField(term1948587, term1948587.getClass(), "resolved", false);
        setField(term1948587, term1948587.getClass(), "resolveResult", null);
        setField(term1948587, term1948587.getClass(), "registry", null);
        setField(term1948583, term1948583.getClass(), "typeOfThis", term1948587);
        setField(term1948583, term1948583.getClass(), "source", null);
        setField(term1948583, term1948583.getClass(), "implementedInterfaces", null);
        setField(term1948583, term1948583.getClass(), "subTypes", null);
        setField(term1948583, term1948583.getClass(), "templateTypeName", null);
        setField(term1948583, term1948583.getClass(), "className", null);
        setField(term1948583, term1948583.getClass(), "properties", null);
        setField(term1948583, term1948583.getClass(), "implicitPrototype", null);
        setBooleanField(term1948583, term1948583.getClass(), "nativeType", false);
        setBooleanField(term1948583, term1948583.getClass(), "visited", false);
        setField(term1948583, term1948583.getClass(), "docInfo", null);
        setBooleanField(term1948583, term1948583.getClass(), "unknown", false);
        setBooleanField(term1948583, term1948583.getClass(), "resolved", false);
        setField(term1948583, term1948583.getClass(), "resolveResult", null);
        setField(term1948583, term1948583.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1947287;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1946635, args);
        assertTrue(recursiveEquals(term1946635, term1948578));
        assertTrue(recursiveEquals(term1947287, term1948583));
        assertTrue(recursiveEquals(retValue, false));
    }

};


