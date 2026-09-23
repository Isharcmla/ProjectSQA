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

public class FunctionType_getGreatestSubtype_679591709633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548787;
     Object term550499;
     Object term550503;
     Object term550446;

    public FunctionType_getGreatestSubtype_679591709633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term550508 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term550507 = ((Class) term550508).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term550507).setAccessible(true);
        Object enum1017 = ((Field) term550507).get((Object) null);
        term548787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term548787, term548787.getClass(), "kind", enum1017);
        Class<? extends Object> term550808 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term550807 = ((Class) term550808).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term550807).setAccessible(true);
        Object enum1018 = ((Field) term550807).get((Object) null);
        term550499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term550499, term550499.getClass(), "this$0", null);
        setField(term550499, term550499.getClass(), "call", null);
        setField(term550499, term550499.getClass(), "prototype", null);
        setField(term550499, term550499.getClass(), "kind", enum1018);
        setField(term550499, term550499.getClass(), "typeOfThis", null);
        setField(term550499, term550499.getClass(), "source", null);
        setField(term550499, term550499.getClass(), "implementedInterfaces", null);
        setField(term550499, term550499.getClass(), "subTypes", null);
        setField(term550499, term550499.getClass(), "templateTypeName", null);
        setField(term550499, term550499.getClass(), "className", null);
        setField(term550499, term550499.getClass(), "properties", null);
        setField(term550499, term550499.getClass(), "implicitPrototype", null);
        setBooleanField(term550499, term550499.getClass(), "nativeType", false);
        setBooleanField(term550499, term550499.getClass(), "visited", false);
        setField(term550499, term550499.getClass(), "docInfo", null);
        setBooleanField(term550499, term550499.getClass(), "unknown", false);
        setBooleanField(term550499, term550499.getClass(), "resolved", false);
        setField(term550499, term550499.getClass(), "resolveResult", null);
        setField(term550499, term550499.getClass(), "registry", null);
        Class<? extends Object> term551108 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term551107 = ((Class) term551108).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term551107).setAccessible(true);
        Object enum1019 = ((Field) term551107).get((Object) null);
        term550503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term550503, term550503.getClass(), "this$0", null);
        setField(term550503, term550503.getClass(), "call", null);
        setField(term550503, term550503.getClass(), "prototype", null);
        setField(term550503, term550503.getClass(), "kind", enum1019);
        setField(term550503, term550503.getClass(), "typeOfThis", null);
        setField(term550503, term550503.getClass(), "source", null);
        setField(term550503, term550503.getClass(), "implementedInterfaces", null);
        setField(term550503, term550503.getClass(), "subTypes", null);
        setField(term550503, term550503.getClass(), "templateTypeName", null);
        setField(term550503, term550503.getClass(), "className", null);
        setField(term550503, term550503.getClass(), "properties", null);
        setField(term550503, term550503.getClass(), "implicitPrototype", null);
        setBooleanField(term550503, term550503.getClass(), "nativeType", false);
        setBooleanField(term550503, term550503.getClass(), "visited", false);
        setField(term550503, term550503.getClass(), "docInfo", null);
        setBooleanField(term550503, term550503.getClass(), "unknown", false);
        setBooleanField(term550503, term550503.getClass(), "resolved", false);
        setField(term550503, term550503.getClass(), "resolveResult", null);
        setField(term550503, term550503.getClass(), "registry", null);
        Class<? extends Object> term551408 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term551407 = ((Class) term551408).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term551407).setAccessible(true);
        Object enum1020 = ((Field) term551407).get((Object) null);
        term550446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term550446, term550446.getClass(), "this$0", null);
        setField(term550446, term550446.getClass(), "call", null);
        setField(term550446, term550446.getClass(), "prototype", null);
        setField(term550446, term550446.getClass(), "kind", enum1020);
        setField(term550446, term550446.getClass(), "typeOfThis", null);
        setField(term550446, term550446.getClass(), "source", null);
        setField(term550446, term550446.getClass(), "implementedInterfaces", null);
        setField(term550446, term550446.getClass(), "subTypes", null);
        setField(term550446, term550446.getClass(), "templateTypeName", null);
        setField(term550446, term550446.getClass(), "className", null);
        setField(term550446, term550446.getClass(), "properties", null);
        setField(term550446, term550446.getClass(), "implicitPrototype", null);
        setBooleanField(term550446, term550446.getClass(), "nativeType", false);
        setBooleanField(term550446, term550446.getClass(), "visited", false);
        setField(term550446, term550446.getClass(), "docInfo", null);
        setBooleanField(term550446, term550446.getClass(), "unknown", false);
        setBooleanField(term550446, term550446.getClass(), "resolved", false);
        setField(term550446, term550446.getClass(), "resolveResult", null);
        setField(term550446, term550446.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term548787;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term548787, args);
        assertTrue(recursiveEquals(term548787, term550499));
        assertTrue(recursiveEquals(term548787, term550503));
        assertTrue(recursiveEquals(retValue, term550446));
    }

};


