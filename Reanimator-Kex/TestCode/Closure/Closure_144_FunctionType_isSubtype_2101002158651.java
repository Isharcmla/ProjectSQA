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

public class FunctionType_isSubtype_2101002158651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653720;
     Object term653976;
     Object term654813;
     Object term654817;

    public FunctionType_isSubtype_2101002158651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term654823 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term654822 = ((Class) term654823).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term654822).setAccessible(true);
        Object enum1180 = ((Field) term654822).get((Object) null);
        term653720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term653720, term653720.getClass(), "kind", enum1180);
        Class<? extends Object> term655123 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term655122 = ((Class) term655123).getDeclaredField((String) "INTERFACE");
        ((Field) term655122).setAccessible(true);
        Object enum1181 = ((Field) term655122).get((Object) null);
        term653976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term653976, term653976.getClass(), "kind", enum1181);
        Class<? extends Object> term655417 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term655416 = ((Class) term655417).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term655416).setAccessible(true);
        Object enum1182 = ((Field) term655416).get((Object) null);
        term654813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term654813, term654813.getClass(), "this$0", null);
        setField(term654813, term654813.getClass(), "call", null);
        setField(term654813, term654813.getClass(), "prototype", null);
        setField(term654813, term654813.getClass(), "kind", enum1182);
        setField(term654813, term654813.getClass(), "typeOfThis", null);
        setField(term654813, term654813.getClass(), "source", null);
        setField(term654813, term654813.getClass(), "implementedInterfaces", null);
        setField(term654813, term654813.getClass(), "subTypes", null);
        setField(term654813, term654813.getClass(), "templateTypeName", null);
        setField(term654813, term654813.getClass(), "className", null);
        setField(term654813, term654813.getClass(), "properties", null);
        setField(term654813, term654813.getClass(), "implicitPrototype", null);
        setBooleanField(term654813, term654813.getClass(), "nativeType", false);
        setBooleanField(term654813, term654813.getClass(), "prettyPrint", false);
        setBooleanField(term654813, term654813.getClass(), "visited", false);
        setField(term654813, term654813.getClass(), "docInfo", null);
        setBooleanField(term654813, term654813.getClass(), "unknown", false);
        setBooleanField(term654813, term654813.getClass(), "resolved", false);
        setField(term654813, term654813.getClass(), "resolveResult", null);
        setField(term654813, term654813.getClass(), "registry", null);
        Class<? extends Object> term655717 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term655716 = ((Class) term655717).getDeclaredField((String) "INTERFACE");
        ((Field) term655716).setAccessible(true);
        Object enum1183 = ((Field) term655716).get((Object) null);
        term654817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term654817, term654817.getClass(), "this$0", null);
        setField(term654817, term654817.getClass(), "call", null);
        setField(term654817, term654817.getClass(), "prototype", null);
        setField(term654817, term654817.getClass(), "kind", enum1183);
        setField(term654817, term654817.getClass(), "typeOfThis", null);
        setField(term654817, term654817.getClass(), "source", null);
        setField(term654817, term654817.getClass(), "implementedInterfaces", null);
        setField(term654817, term654817.getClass(), "subTypes", null);
        setField(term654817, term654817.getClass(), "templateTypeName", null);
        setField(term654817, term654817.getClass(), "className", null);
        setField(term654817, term654817.getClass(), "properties", null);
        setField(term654817, term654817.getClass(), "implicitPrototype", null);
        setBooleanField(term654817, term654817.getClass(), "nativeType", false);
        setBooleanField(term654817, term654817.getClass(), "prettyPrint", false);
        setBooleanField(term654817, term654817.getClass(), "visited", false);
        setField(term654817, term654817.getClass(), "docInfo", null);
        setBooleanField(term654817, term654817.getClass(), "unknown", false);
        setBooleanField(term654817, term654817.getClass(), "resolved", false);
        setField(term654817, term654817.getClass(), "resolveResult", null);
        setField(term654817, term654817.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term653976;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term653720, args);
        assertTrue(recursiveEquals(term653720, term654813));
        assertTrue(recursiveEquals(term653976, term654817));
        assertTrue(recursiveEquals(retValue, true));
    }

};


