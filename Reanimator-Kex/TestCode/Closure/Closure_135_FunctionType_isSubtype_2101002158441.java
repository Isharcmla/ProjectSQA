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

public class FunctionType_isSubtype_2101002158441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294386;
     Object term294938;
     Object term295688;
     Object term295692;

    public FunctionType_isSubtype_2101002158441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term295698 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term295697 = ((Class) term295698).getDeclaredField((String) "ORDINARY");
        ((Field) term295697).setAccessible(true);
        Object enum540 = ((Field) term295697).get((Object) null);
        term294386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term294386, term294386.getClass(), "kind", enum540);
        Class<? extends Object> term295989 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term295988 = ((Class) term295989).getDeclaredField((String) "INTERFACE");
        ((Field) term295988).setAccessible(true);
        Object enum541 = ((Field) term295988).get((Object) null);
        term294938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term294938, term294938.getClass(), "kind", enum541);
        Class<? extends Object> term296283 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term296282 = ((Class) term296283).getDeclaredField((String) "ORDINARY");
        ((Field) term296282).setAccessible(true);
        Object enum542 = ((Field) term296282).get((Object) null);
        term295688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term295688, term295688.getClass(), "this$0", null);
        setField(term295688, term295688.getClass(), "call", null);
        setField(term295688, term295688.getClass(), "prototype", null);
        setField(term295688, term295688.getClass(), "kind", enum542);
        setField(term295688, term295688.getClass(), "typeOfThis", null);
        setField(term295688, term295688.getClass(), "source", null);
        setField(term295688, term295688.getClass(), "implementedInterfaces", null);
        setField(term295688, term295688.getClass(), "subTypes", null);
        setField(term295688, term295688.getClass(), "templateTypeName", null);
        setField(term295688, term295688.getClass(), "className", null);
        setField(term295688, term295688.getClass(), "properties", null);
        setField(term295688, term295688.getClass(), "implicitPrototype", null);
        setBooleanField(term295688, term295688.getClass(), "nativeType", false);
        setBooleanField(term295688, term295688.getClass(), "visited", false);
        setField(term295688, term295688.getClass(), "docInfo", null);
        setBooleanField(term295688, term295688.getClass(), "unknown", false);
        setBooleanField(term295688, term295688.getClass(), "resolved", false);
        setField(term295688, term295688.getClass(), "resolveResult", null);
        setField(term295688, term295688.getClass(), "registry", null);
        Class<? extends Object> term296574 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term296573 = ((Class) term296574).getDeclaredField((String) "INTERFACE");
        ((Field) term296573).setAccessible(true);
        Object enum543 = ((Field) term296573).get((Object) null);
        term295692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term295692, term295692.getClass(), "this$0", null);
        setField(term295692, term295692.getClass(), "call", null);
        setField(term295692, term295692.getClass(), "prototype", null);
        setField(term295692, term295692.getClass(), "kind", enum543);
        setField(term295692, term295692.getClass(), "typeOfThis", null);
        setField(term295692, term295692.getClass(), "source", null);
        setField(term295692, term295692.getClass(), "implementedInterfaces", null);
        setField(term295692, term295692.getClass(), "subTypes", null);
        setField(term295692, term295692.getClass(), "templateTypeName", null);
        setField(term295692, term295692.getClass(), "className", null);
        setField(term295692, term295692.getClass(), "properties", null);
        setField(term295692, term295692.getClass(), "implicitPrototype", null);
        setBooleanField(term295692, term295692.getClass(), "nativeType", false);
        setBooleanField(term295692, term295692.getClass(), "visited", false);
        setField(term295692, term295692.getClass(), "docInfo", null);
        setBooleanField(term295692, term295692.getClass(), "unknown", false);
        setBooleanField(term295692, term295692.getClass(), "resolved", false);
        setField(term295692, term295692.getClass(), "resolveResult", null);
        setField(term295692, term295692.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term294938;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term294386, args);
        assertTrue(recursiveEquals(term294386, term295688));
        assertTrue(recursiveEquals(term294938, term295692));
        assertTrue(recursiveEquals(retValue, true));
    }

};


