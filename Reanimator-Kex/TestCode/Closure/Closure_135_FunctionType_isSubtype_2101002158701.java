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

public class FunctionType_isSubtype_2101002158701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647570;
     Object term647920;
     Object term648390;
     Object term648395;

    public FunctionType_isSubtype_2101002158701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term648401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term648400 = ((Class) term648401).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term648400).setAccessible(true);
        Object enum1204 = ((Field) term648400).get((Object) null);
        term647570 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term647812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term647570, term647570.getClass(), "kind", enum1204);
        setField(term647570, term647570.getClass(), "call", term647812);
        term647920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term647920, term647920.getClass(), "kind", enum1204);
        setField(term647920, term647920.getClass(), "call", null);
        Class<? extends Object> term648701 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term648700 = ((Class) term648701).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term648700).setAccessible(true);
        Object enum1205 = ((Field) term648700).get((Object) null);
        term648390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term648391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term648390, term648390.getClass(), "this$0", null);
        setField(term648391, term648391.getClass(), "parameters", null);
        setField(term648391, term648391.getClass(), "returnType", null);
        setBooleanField(term648391, term648391.getClass(), "resolved", false);
        setField(term648391, term648391.getClass(), "resolveResult", null);
        setField(term648391, term648391.getClass(), "registry", null);
        setField(term648390, term648390.getClass(), "call", term648391);
        setField(term648390, term648390.getClass(), "prototype", null);
        setField(term648390, term648390.getClass(), "kind", enum1205);
        setField(term648390, term648390.getClass(), "typeOfThis", null);
        setField(term648390, term648390.getClass(), "source", null);
        setField(term648390, term648390.getClass(), "implementedInterfaces", null);
        setField(term648390, term648390.getClass(), "subTypes", null);
        setField(term648390, term648390.getClass(), "templateTypeName", null);
        setField(term648390, term648390.getClass(), "className", null);
        setField(term648390, term648390.getClass(), "properties", null);
        setField(term648390, term648390.getClass(), "implicitPrototype", null);
        setBooleanField(term648390, term648390.getClass(), "nativeType", false);
        setBooleanField(term648390, term648390.getClass(), "visited", false);
        setField(term648390, term648390.getClass(), "docInfo", null);
        setBooleanField(term648390, term648390.getClass(), "unknown", false);
        setBooleanField(term648390, term648390.getClass(), "resolved", false);
        setField(term648390, term648390.getClass(), "resolveResult", null);
        setField(term648390, term648390.getClass(), "registry", null);
        Class<? extends Object> term649001 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term649000 = ((Class) term649001).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term649000).setAccessible(true);
        Object enum1206 = ((Field) term649000).get((Object) null);
        term648395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term648395, term648395.getClass(), "this$0", null);
        setField(term648395, term648395.getClass(), "call", null);
        setField(term648395, term648395.getClass(), "prototype", null);
        setField(term648395, term648395.getClass(), "kind", enum1206);
        setField(term648395, term648395.getClass(), "typeOfThis", null);
        setField(term648395, term648395.getClass(), "source", null);
        setField(term648395, term648395.getClass(), "implementedInterfaces", null);
        setField(term648395, term648395.getClass(), "subTypes", null);
        setField(term648395, term648395.getClass(), "templateTypeName", null);
        setField(term648395, term648395.getClass(), "className", null);
        setField(term648395, term648395.getClass(), "properties", null);
        setField(term648395, term648395.getClass(), "implicitPrototype", null);
        setBooleanField(term648395, term648395.getClass(), "nativeType", false);
        setBooleanField(term648395, term648395.getClass(), "visited", false);
        setField(term648395, term648395.getClass(), "docInfo", null);
        setBooleanField(term648395, term648395.getClass(), "unknown", false);
        setBooleanField(term648395, term648395.getClass(), "resolved", false);
        setField(term648395, term648395.getClass(), "resolveResult", null);
        setField(term648395, term648395.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term647920;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term647570, args);
        assertTrue(recursiveEquals(term647570, term648390));
        assertTrue(recursiveEquals(term647920, term648395));
        assertTrue(recursiveEquals(retValue, false));
    }

};


