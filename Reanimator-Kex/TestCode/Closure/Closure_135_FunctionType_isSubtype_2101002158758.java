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

public class FunctionType_isSubtype_2101002158758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726198;
     Object term726454;
     Object term731583;
     Object term731587;

    public FunctionType_isSubtype_2101002158758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term731593 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term731592 = ((Class) term731593).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term731592).setAccessible(true);
        Object enum1358 = ((Field) term731592).get((Object) null);
        term726198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term726198, term726198.getClass(), "kind", enum1358);
        Class<? extends Object> term731893 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term731892 = ((Class) term731893).getDeclaredField((String) "INTERFACE");
        ((Field) term731892).setAccessible(true);
        Object enum1359 = ((Field) term731892).get((Object) null);
        term726454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term726454, term726454.getClass(), "kind", enum1359);
        Class<? extends Object> term732187 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term732186 = ((Class) term732187).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term732186).setAccessible(true);
        Object enum1360 = ((Field) term732186).get((Object) null);
        term731583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term731583, term731583.getClass(), "this$0", null);
        setField(term731583, term731583.getClass(), "call", null);
        setField(term731583, term731583.getClass(), "prototype", null);
        setField(term731583, term731583.getClass(), "kind", enum1360);
        setField(term731583, term731583.getClass(), "typeOfThis", null);
        setField(term731583, term731583.getClass(), "source", null);
        setField(term731583, term731583.getClass(), "implementedInterfaces", null);
        setField(term731583, term731583.getClass(), "subTypes", null);
        setField(term731583, term731583.getClass(), "templateTypeName", null);
        setField(term731583, term731583.getClass(), "className", null);
        setField(term731583, term731583.getClass(), "properties", null);
        setField(term731583, term731583.getClass(), "implicitPrototype", null);
        setBooleanField(term731583, term731583.getClass(), "nativeType", false);
        setBooleanField(term731583, term731583.getClass(), "visited", false);
        setField(term731583, term731583.getClass(), "docInfo", null);
        setBooleanField(term731583, term731583.getClass(), "unknown", false);
        setBooleanField(term731583, term731583.getClass(), "resolved", false);
        setField(term731583, term731583.getClass(), "resolveResult", null);
        setField(term731583, term731583.getClass(), "registry", null);
        Class<? extends Object> term732487 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term732486 = ((Class) term732487).getDeclaredField((String) "INTERFACE");
        ((Field) term732486).setAccessible(true);
        Object enum1361 = ((Field) term732486).get((Object) null);
        term731587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term731587, term731587.getClass(), "this$0", null);
        setField(term731587, term731587.getClass(), "call", null);
        setField(term731587, term731587.getClass(), "prototype", null);
        setField(term731587, term731587.getClass(), "kind", enum1361);
        setField(term731587, term731587.getClass(), "typeOfThis", null);
        setField(term731587, term731587.getClass(), "source", null);
        setField(term731587, term731587.getClass(), "implementedInterfaces", null);
        setField(term731587, term731587.getClass(), "subTypes", null);
        setField(term731587, term731587.getClass(), "templateTypeName", null);
        setField(term731587, term731587.getClass(), "className", null);
        setField(term731587, term731587.getClass(), "properties", null);
        setField(term731587, term731587.getClass(), "implicitPrototype", null);
        setBooleanField(term731587, term731587.getClass(), "nativeType", false);
        setBooleanField(term731587, term731587.getClass(), "visited", false);
        setField(term731587, term731587.getClass(), "docInfo", null);
        setBooleanField(term731587, term731587.getClass(), "unknown", false);
        setBooleanField(term731587, term731587.getClass(), "resolved", false);
        setField(term731587, term731587.getClass(), "resolveResult", null);
        setField(term731587, term731587.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term726454;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term726198, args);
        assertTrue(recursiveEquals(term726198, term731583));
        assertTrue(recursiveEquals(term726454, term731587));
        assertTrue(recursiveEquals(retValue, true));
    }

};


