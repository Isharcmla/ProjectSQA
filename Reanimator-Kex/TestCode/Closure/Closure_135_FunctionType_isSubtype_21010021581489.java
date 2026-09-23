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

public class FunctionType_isSubtype_21010021581489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1950608;
     Object term1951260;
     Object term1952551;
     Object term1952556;

    public FunctionType_isSubtype_21010021581489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1952566 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1952565 = ((Class) term1952566).getDeclaredField((String) "ORDINARY");
        ((Field) term1952565).setAccessible(true);
        Object enum3638 = ((Field) term1952565).get((Object) null);
        Class<? extends Object> term1952857 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1952856 = ((Class) term1952857).getDeclaredField((String) "INTERFACE");
        ((Field) term1952856).setAccessible(true);
        Object enum3639 = ((Field) term1952856).get((Object) null);
        term1950608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1951152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1950608, term1950608.getClass(), "kind", enum3638);
        setField(term1951152, term1951152.getClass(), "kind", enum3639);
        setField(term1950608, term1950608.getClass(), "typeOfThis", term1951152);
        Class<? extends Object> term1953151 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1953150 = ((Class) term1953151).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1953150).setAccessible(true);
        Object enum3640 = ((Field) term1953150).get((Object) null);
        term1951260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1951442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1951260, term1951260.getClass(), "kind", enum3640);
        setField(term1951442, term1951442.getClass(), "kind", enum3639);
        setField(term1951260, term1951260.getClass(), "typeOfThis", term1951442);
        Class<? extends Object> term1953451 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1953450 = ((Class) term1953451).getDeclaredField((String) "INTERFACE");
        ((Field) term1953450).setAccessible(true);
        Object enum3641 = ((Field) term1953450).get((Object) null);
        term1952551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1952555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1952551, term1952551.getClass(), "this$0", null);
        setField(term1952551, term1952551.getClass(), "call", null);
        setField(term1952551, term1952551.getClass(), "prototype", null);
        setField(term1952551, term1952551.getClass(), "kind", enum3641);
        setField(term1952555, term1952555.getClass(), "call", null);
        setField(term1952555, term1952555.getClass(), "prototype", null);
        setField(term1952555, term1952555.getClass(), "kind", enum3641);
        setField(term1952555, term1952555.getClass(), "typeOfThis", null);
        setField(term1952555, term1952555.getClass(), "source", null);
        setField(term1952555, term1952555.getClass(), "implementedInterfaces", null);
        setField(term1952555, term1952555.getClass(), "subTypes", null);
        setField(term1952555, term1952555.getClass(), "templateTypeName", null);
        setField(term1952555, term1952555.getClass(), "className", null);
        setField(term1952555, term1952555.getClass(), "properties", null);
        setField(term1952555, term1952555.getClass(), "implicitPrototype", null);
        setBooleanField(term1952555, term1952555.getClass(), "nativeType", false);
        setBooleanField(term1952555, term1952555.getClass(), "visited", false);
        setField(term1952555, term1952555.getClass(), "docInfo", null);
        setBooleanField(term1952555, term1952555.getClass(), "unknown", false);
        setBooleanField(term1952555, term1952555.getClass(), "resolved", false);
        setField(term1952555, term1952555.getClass(), "resolveResult", null);
        setField(term1952555, term1952555.getClass(), "registry", null);
        setField(term1952551, term1952551.getClass(), "typeOfThis", term1952555);
        setField(term1952551, term1952551.getClass(), "source", null);
        setField(term1952551, term1952551.getClass(), "implementedInterfaces", null);
        setField(term1952551, term1952551.getClass(), "subTypes", null);
        setField(term1952551, term1952551.getClass(), "templateTypeName", null);
        setField(term1952551, term1952551.getClass(), "className", null);
        setField(term1952551, term1952551.getClass(), "properties", null);
        setField(term1952551, term1952551.getClass(), "implicitPrototype", null);
        setBooleanField(term1952551, term1952551.getClass(), "nativeType", false);
        setBooleanField(term1952551, term1952551.getClass(), "visited", false);
        setField(term1952551, term1952551.getClass(), "docInfo", null);
        setBooleanField(term1952551, term1952551.getClass(), "unknown", false);
        setBooleanField(term1952551, term1952551.getClass(), "resolved", false);
        setField(term1952551, term1952551.getClass(), "resolveResult", null);
        setField(term1952551, term1952551.getClass(), "registry", null);
        Class<? extends Object> term1953745 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1953744 = ((Class) term1953745).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1953744).setAccessible(true);
        Object enum3642 = ((Field) term1953744).get((Object) null);
        Class<? extends Object> term1954045 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1954044 = ((Class) term1954045).getDeclaredField((String) "INTERFACE");
        ((Field) term1954044).setAccessible(true);
        Object enum3643 = ((Field) term1954044).get((Object) null);
        term1952556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1952560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1952556, term1952556.getClass(), "this$0", null);
        setField(term1952556, term1952556.getClass(), "call", null);
        setField(term1952556, term1952556.getClass(), "prototype", null);
        setField(term1952556, term1952556.getClass(), "kind", enum3642);
        setField(term1952560, term1952560.getClass(), "this$0", null);
        setField(term1952560, term1952560.getClass(), "call", null);
        setField(term1952560, term1952560.getClass(), "prototype", null);
        setField(term1952560, term1952560.getClass(), "kind", enum3643);
        setField(term1952560, term1952560.getClass(), "typeOfThis", null);
        setField(term1952560, term1952560.getClass(), "source", null);
        setField(term1952560, term1952560.getClass(), "implementedInterfaces", null);
        setField(term1952560, term1952560.getClass(), "subTypes", null);
        setField(term1952560, term1952560.getClass(), "templateTypeName", null);
        setField(term1952560, term1952560.getClass(), "className", null);
        setField(term1952560, term1952560.getClass(), "properties", null);
        setField(term1952560, term1952560.getClass(), "implicitPrototype", null);
        setBooleanField(term1952560, term1952560.getClass(), "nativeType", false);
        setBooleanField(term1952560, term1952560.getClass(), "visited", false);
        setField(term1952560, term1952560.getClass(), "docInfo", null);
        setBooleanField(term1952560, term1952560.getClass(), "unknown", false);
        setBooleanField(term1952560, term1952560.getClass(), "resolved", false);
        setField(term1952560, term1952560.getClass(), "resolveResult", null);
        setField(term1952560, term1952560.getClass(), "registry", null);
        setField(term1952556, term1952556.getClass(), "typeOfThis", term1952560);
        setField(term1952556, term1952556.getClass(), "source", null);
        setField(term1952556, term1952556.getClass(), "implementedInterfaces", null);
        setField(term1952556, term1952556.getClass(), "subTypes", null);
        setField(term1952556, term1952556.getClass(), "templateTypeName", null);
        setField(term1952556, term1952556.getClass(), "className", null);
        setField(term1952556, term1952556.getClass(), "properties", null);
        setField(term1952556, term1952556.getClass(), "implicitPrototype", null);
        setBooleanField(term1952556, term1952556.getClass(), "nativeType", false);
        setBooleanField(term1952556, term1952556.getClass(), "visited", false);
        setField(term1952556, term1952556.getClass(), "docInfo", null);
        setBooleanField(term1952556, term1952556.getClass(), "unknown", false);
        setBooleanField(term1952556, term1952556.getClass(), "resolved", false);
        setField(term1952556, term1952556.getClass(), "resolveResult", null);
        setField(term1952556, term1952556.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1951260;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1950608, args);
        assertTrue(recursiveEquals(term1950608, term1952551));
        assertTrue(recursiveEquals(term1951260, term1952556));
        assertTrue(recursiveEquals(retValue, false));
    }

};


