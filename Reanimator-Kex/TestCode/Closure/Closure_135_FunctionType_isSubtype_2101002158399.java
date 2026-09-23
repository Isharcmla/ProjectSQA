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

public class FunctionType_isSubtype_2101002158399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250251;
     Object term250601;
     Object term251441;
     Object term251446;

    public FunctionType_isSubtype_2101002158399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term251452 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term251451 = ((Class) term251452).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term251451).setAccessible(true);
        Object enum455 = ((Field) term251451).get((Object) null);
        term250251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term250493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term250251, term250251.getClass(), "kind", enum455);
        setField(term250251, term250251.getClass(), "call", term250493);
        Class<? extends Object> term251752 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term251751 = ((Class) term251752).getDeclaredField((String) "ORDINARY");
        ((Field) term251751).setAccessible(true);
        Object enum456 = ((Field) term251751).get((Object) null);
        term250601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term250601, term250601.getClass(), "kind", enum456);
        setField(term250601, term250601.getClass(), "call", null);
        Class<? extends Object> term252043 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term252042 = ((Class) term252043).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term252042).setAccessible(true);
        Object enum457 = ((Field) term252042).get((Object) null);
        term251441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term251442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term251441, term251441.getClass(), "this$0", null);
        setField(term251442, term251442.getClass(), "parameters", null);
        setField(term251442, term251442.getClass(), "returnType", null);
        setBooleanField(term251442, term251442.getClass(), "resolved", false);
        setField(term251442, term251442.getClass(), "resolveResult", null);
        setField(term251442, term251442.getClass(), "registry", null);
        setField(term251441, term251441.getClass(), "call", term251442);
        setField(term251441, term251441.getClass(), "prototype", null);
        setField(term251441, term251441.getClass(), "kind", enum457);
        setField(term251441, term251441.getClass(), "typeOfThis", null);
        setField(term251441, term251441.getClass(), "source", null);
        setField(term251441, term251441.getClass(), "implementedInterfaces", null);
        setField(term251441, term251441.getClass(), "subTypes", null);
        setField(term251441, term251441.getClass(), "templateTypeName", null);
        setField(term251441, term251441.getClass(), "className", null);
        setField(term251441, term251441.getClass(), "properties", null);
        setField(term251441, term251441.getClass(), "implicitPrototype", null);
        setBooleanField(term251441, term251441.getClass(), "nativeType", false);
        setBooleanField(term251441, term251441.getClass(), "visited", false);
        setField(term251441, term251441.getClass(), "docInfo", null);
        setBooleanField(term251441, term251441.getClass(), "unknown", false);
        setBooleanField(term251441, term251441.getClass(), "resolved", false);
        setField(term251441, term251441.getClass(), "resolveResult", null);
        setField(term251441, term251441.getClass(), "registry", null);
        Class<? extends Object> term252343 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term252342 = ((Class) term252343).getDeclaredField((String) "ORDINARY");
        ((Field) term252342).setAccessible(true);
        Object enum458 = ((Field) term252342).get((Object) null);
        term251446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term251446, term251446.getClass(), "this$0", null);
        setField(term251446, term251446.getClass(), "call", null);
        setField(term251446, term251446.getClass(), "prototype", null);
        setField(term251446, term251446.getClass(), "kind", enum458);
        setField(term251446, term251446.getClass(), "typeOfThis", null);
        setField(term251446, term251446.getClass(), "source", null);
        setField(term251446, term251446.getClass(), "implementedInterfaces", null);
        setField(term251446, term251446.getClass(), "subTypes", null);
        setField(term251446, term251446.getClass(), "templateTypeName", null);
        setField(term251446, term251446.getClass(), "className", null);
        setField(term251446, term251446.getClass(), "properties", null);
        setField(term251446, term251446.getClass(), "implicitPrototype", null);
        setBooleanField(term251446, term251446.getClass(), "nativeType", false);
        setBooleanField(term251446, term251446.getClass(), "visited", false);
        setField(term251446, term251446.getClass(), "docInfo", null);
        setBooleanField(term251446, term251446.getClass(), "unknown", false);
        setBooleanField(term251446, term251446.getClass(), "resolved", false);
        setField(term251446, term251446.getClass(), "resolveResult", null);
        setField(term251446, term251446.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term250601;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term250251, args);
        assertTrue(recursiveEquals(term250251, term251441));
        assertTrue(recursiveEquals(term250601, term251446));
        assertTrue(recursiveEquals(retValue, false));
    }

};


