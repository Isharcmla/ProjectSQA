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

public class FunctionType_isSubtype_21010021581116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310526;
     Object term1310984;
     Object term1314407;
     Object term1314413;

    public FunctionType_isSubtype_21010021581116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1314423 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1314422 = ((Class) term1314423).getDeclaredField((String) "ORDINARY");
        ((Field) term1314422).setAccessible(true);
        Object enum2450 = ((Field) term1314422).get((Object) null);
        term1310526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1310782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1310876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1310526, term1310526.getClass(), "kind", enum2450);
        setField(term1310782, term1310782.getClass(), "kind", enum2450);
        setField(term1310526, term1310526.getClass(), "typeOfThis", term1310782);
        setField(term1310526, term1310526.getClass(), "call", term1310876);
        Class<? extends Object> term1314714 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1314713 = ((Class) term1314714).getDeclaredField((String) "INTERFACE");
        ((Field) term1314713).setAccessible(true);
        Object enum2451 = ((Field) term1314713).get((Object) null);
        term1310984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1311166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1310984, term1310984.getClass(), "kind", enum2450);
        setField(term1311166, term1311166.getClass(), "kind", enum2451);
        setField(term1310984, term1310984.getClass(), "typeOfThis", term1311166);
        setField(term1310984, term1310984.getClass(), "call", null);
        Class<? extends Object> term1315008 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1315007 = ((Class) term1315008).getDeclaredField((String) "ORDINARY");
        ((Field) term1315007).setAccessible(true);
        Object enum2452 = ((Field) term1315007).get((Object) null);
        term1314407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1314408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1314412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1314407, term1314407.getClass(), "this$0", null);
        setField(term1314408, term1314408.getClass(), "parameters", null);
        setField(term1314408, term1314408.getClass(), "returnType", null);
        setBooleanField(term1314408, term1314408.getClass(), "resolved", false);
        setField(term1314408, term1314408.getClass(), "resolveResult", null);
        setField(term1314408, term1314408.getClass(), "registry", null);
        setField(term1314407, term1314407.getClass(), "call", term1314408);
        setField(term1314407, term1314407.getClass(), "prototype", null);
        setField(term1314407, term1314407.getClass(), "kind", enum2452);
        setField(term1314412, term1314412.getClass(), "this$0", null);
        setField(term1314412, term1314412.getClass(), "call", null);
        setField(term1314412, term1314412.getClass(), "prototype", null);
        setField(term1314412, term1314412.getClass(), "kind", enum2452);
        setField(term1314412, term1314412.getClass(), "typeOfThis", null);
        setField(term1314412, term1314412.getClass(), "source", null);
        setField(term1314412, term1314412.getClass(), "implementedInterfaces", null);
        setField(term1314412, term1314412.getClass(), "subTypes", null);
        setField(term1314412, term1314412.getClass(), "templateTypeName", null);
        setField(term1314412, term1314412.getClass(), "className", null);
        setField(term1314412, term1314412.getClass(), "properties", null);
        setField(term1314412, term1314412.getClass(), "implicitPrototype", null);
        setBooleanField(term1314412, term1314412.getClass(), "nativeType", false);
        setBooleanField(term1314412, term1314412.getClass(), "visited", false);
        setField(term1314412, term1314412.getClass(), "docInfo", null);
        setBooleanField(term1314412, term1314412.getClass(), "unknown", false);
        setBooleanField(term1314412, term1314412.getClass(), "resolved", false);
        setField(term1314412, term1314412.getClass(), "resolveResult", null);
        setField(term1314412, term1314412.getClass(), "registry", null);
        setField(term1314407, term1314407.getClass(), "typeOfThis", term1314412);
        setField(term1314407, term1314407.getClass(), "source", null);
        setField(term1314407, term1314407.getClass(), "implementedInterfaces", null);
        setField(term1314407, term1314407.getClass(), "subTypes", null);
        setField(term1314407, term1314407.getClass(), "templateTypeName", null);
        setField(term1314407, term1314407.getClass(), "className", null);
        setField(term1314407, term1314407.getClass(), "properties", null);
        setField(term1314407, term1314407.getClass(), "implicitPrototype", null);
        setBooleanField(term1314407, term1314407.getClass(), "nativeType", false);
        setBooleanField(term1314407, term1314407.getClass(), "visited", false);
        setField(term1314407, term1314407.getClass(), "docInfo", null);
        setBooleanField(term1314407, term1314407.getClass(), "unknown", false);
        setBooleanField(term1314407, term1314407.getClass(), "resolved", false);
        setField(term1314407, term1314407.getClass(), "resolveResult", null);
        setField(term1314407, term1314407.getClass(), "registry", null);
        Class<? extends Object> term1315299 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1315298 = ((Class) term1315299).getDeclaredField((String) "ORDINARY");
        ((Field) term1315298).setAccessible(true);
        Object enum2453 = ((Field) term1315298).get((Object) null);
        Class<? extends Object> term1315590 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1315589 = ((Class) term1315590).getDeclaredField((String) "INTERFACE");
        ((Field) term1315589).setAccessible(true);
        Object enum2454 = ((Field) term1315589).get((Object) null);
        term1314413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1314417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1314413, term1314413.getClass(), "this$0", null);
        setField(term1314413, term1314413.getClass(), "call", null);
        setField(term1314413, term1314413.getClass(), "prototype", null);
        setField(term1314413, term1314413.getClass(), "kind", enum2453);
        setField(term1314417, term1314417.getClass(), "this$0", null);
        setField(term1314417, term1314417.getClass(), "call", null);
        setField(term1314417, term1314417.getClass(), "prototype", null);
        setField(term1314417, term1314417.getClass(), "kind", enum2454);
        setField(term1314417, term1314417.getClass(), "typeOfThis", null);
        setField(term1314417, term1314417.getClass(), "source", null);
        setField(term1314417, term1314417.getClass(), "implementedInterfaces", null);
        setField(term1314417, term1314417.getClass(), "subTypes", null);
        setField(term1314417, term1314417.getClass(), "templateTypeName", null);
        setField(term1314417, term1314417.getClass(), "className", null);
        setField(term1314417, term1314417.getClass(), "properties", null);
        setField(term1314417, term1314417.getClass(), "implicitPrototype", null);
        setBooleanField(term1314417, term1314417.getClass(), "nativeType", false);
        setBooleanField(term1314417, term1314417.getClass(), "visited", false);
        setField(term1314417, term1314417.getClass(), "docInfo", null);
        setBooleanField(term1314417, term1314417.getClass(), "unknown", false);
        setBooleanField(term1314417, term1314417.getClass(), "resolved", false);
        setField(term1314417, term1314417.getClass(), "resolveResult", null);
        setField(term1314417, term1314417.getClass(), "registry", null);
        setField(term1314413, term1314413.getClass(), "typeOfThis", term1314417);
        setField(term1314413, term1314413.getClass(), "source", null);
        setField(term1314413, term1314413.getClass(), "implementedInterfaces", null);
        setField(term1314413, term1314413.getClass(), "subTypes", null);
        setField(term1314413, term1314413.getClass(), "templateTypeName", null);
        setField(term1314413, term1314413.getClass(), "className", null);
        setField(term1314413, term1314413.getClass(), "properties", null);
        setField(term1314413, term1314413.getClass(), "implicitPrototype", null);
        setBooleanField(term1314413, term1314413.getClass(), "nativeType", false);
        setBooleanField(term1314413, term1314413.getClass(), "visited", false);
        setField(term1314413, term1314413.getClass(), "docInfo", null);
        setBooleanField(term1314413, term1314413.getClass(), "unknown", false);
        setBooleanField(term1314413, term1314413.getClass(), "resolved", false);
        setField(term1314413, term1314413.getClass(), "resolveResult", null);
        setField(term1314413, term1314413.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1310984;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1310526, args);
        assertTrue(recursiveEquals(term1310526, term1314407));
        assertTrue(recursiveEquals(term1310984, term1314413));
        assertTrue(recursiveEquals(retValue, false));
    }

};


