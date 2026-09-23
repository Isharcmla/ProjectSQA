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

public class FunctionType_isSubtype_21010021581681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2275374;
     Object term2276026;
     Object term2281595;
     Object term2281600;

    public FunctionType_isSubtype_21010021581681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2281607 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2281606 = ((Class) term2281607).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2281606).setAccessible(true);
        Object enum4258 = ((Field) term2281606).get((Object) null);
        Class<? extends Object> term2281907 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2281906 = ((Class) term2281907).getDeclaredField((String) "INTERFACE");
        ((Field) term2281906).setAccessible(true);
        Object enum4259 = ((Field) term2281906).get((Object) null);
        term2275374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2275918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2275374, term2275374.getClass(), "kind", enum4258);
        setField(term2275918, term2275918.getClass(), "kind", enum4259);
        setField(term2275374, term2275374.getClass(), "typeOfThis", term2275918);
        Class<? extends Object> term2282201 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2282200 = ((Class) term2282201).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2282200).setAccessible(true);
        Object enum4260 = ((Field) term2282200).get((Object) null);
        term2276026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2276208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2276026, term2276026.getClass(), "kind", enum4260);
        setField(term2276026, term2276026.getClass(), "typeOfThis", term2276208);
        Class<? extends Object> term2282501 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2282500 = ((Class) term2282501).getDeclaredField((String) "INTERFACE");
        ((Field) term2282500).setAccessible(true);
        Object enum4261 = ((Field) term2282500).get((Object) null);
        term2281595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2281599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2281595, term2281595.getClass(), "this$0", null);
        setField(term2281595, term2281595.getClass(), "call", null);
        setField(term2281595, term2281595.getClass(), "prototype", null);
        setField(term2281595, term2281595.getClass(), "kind", enum4261);
        setField(term2281599, term2281599.getClass(), "call", null);
        setField(term2281599, term2281599.getClass(), "prototype", null);
        setField(term2281599, term2281599.getClass(), "kind", enum4261);
        setField(term2281599, term2281599.getClass(), "typeOfThis", null);
        setField(term2281599, term2281599.getClass(), "source", null);
        setField(term2281599, term2281599.getClass(), "implementedInterfaces", null);
        setField(term2281599, term2281599.getClass(), "subTypes", null);
        setField(term2281599, term2281599.getClass(), "templateTypeName", null);
        setField(term2281599, term2281599.getClass(), "className", null);
        setField(term2281599, term2281599.getClass(), "properties", null);
        setField(term2281599, term2281599.getClass(), "implicitPrototype", null);
        setBooleanField(term2281599, term2281599.getClass(), "nativeType", false);
        setBooleanField(term2281599, term2281599.getClass(), "visited", false);
        setField(term2281599, term2281599.getClass(), "docInfo", null);
        setBooleanField(term2281599, term2281599.getClass(), "unknown", false);
        setBooleanField(term2281599, term2281599.getClass(), "resolved", false);
        setField(term2281599, term2281599.getClass(), "resolveResult", null);
        setField(term2281599, term2281599.getClass(), "registry", null);
        setField(term2281595, term2281595.getClass(), "typeOfThis", term2281599);
        setField(term2281595, term2281595.getClass(), "source", null);
        setField(term2281595, term2281595.getClass(), "implementedInterfaces", null);
        setField(term2281595, term2281595.getClass(), "subTypes", null);
        setField(term2281595, term2281595.getClass(), "templateTypeName", null);
        setField(term2281595, term2281595.getClass(), "className", null);
        setField(term2281595, term2281595.getClass(), "properties", null);
        setField(term2281595, term2281595.getClass(), "implicitPrototype", null);
        setBooleanField(term2281595, term2281595.getClass(), "nativeType", false);
        setBooleanField(term2281595, term2281595.getClass(), "visited", false);
        setField(term2281595, term2281595.getClass(), "docInfo", null);
        setBooleanField(term2281595, term2281595.getClass(), "unknown", false);
        setBooleanField(term2281595, term2281595.getClass(), "resolved", false);
        setField(term2281595, term2281595.getClass(), "resolveResult", null);
        setField(term2281595, term2281595.getClass(), "registry", null);
        Class<? extends Object> term2282795 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2282794 = ((Class) term2282795).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2282794).setAccessible(true);
        Object enum4262 = ((Field) term2282794).get((Object) null);
        term2281600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2281604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2281600, term2281600.getClass(), "this$0", null);
        setField(term2281600, term2281600.getClass(), "call", null);
        setField(term2281600, term2281600.getClass(), "prototype", null);
        setField(term2281600, term2281600.getClass(), "kind", enum4262);
        setField(term2281604, term2281604.getClass(), "this$0", null);
        setField(term2281604, term2281604.getClass(), "call", null);
        setField(term2281604, term2281604.getClass(), "prototype", null);
        setField(term2281604, term2281604.getClass(), "kind", null);
        setField(term2281604, term2281604.getClass(), "typeOfThis", null);
        setField(term2281604, term2281604.getClass(), "source", null);
        setField(term2281604, term2281604.getClass(), "implementedInterfaces", null);
        setField(term2281604, term2281604.getClass(), "subTypes", null);
        setField(term2281604, term2281604.getClass(), "templateTypeName", null);
        setField(term2281604, term2281604.getClass(), "className", null);
        setField(term2281604, term2281604.getClass(), "properties", null);
        setField(term2281604, term2281604.getClass(), "implicitPrototype", null);
        setBooleanField(term2281604, term2281604.getClass(), "nativeType", false);
        setBooleanField(term2281604, term2281604.getClass(), "visited", false);
        setField(term2281604, term2281604.getClass(), "docInfo", null);
        setBooleanField(term2281604, term2281604.getClass(), "unknown", false);
        setBooleanField(term2281604, term2281604.getClass(), "resolved", false);
        setField(term2281604, term2281604.getClass(), "resolveResult", null);
        setField(term2281604, term2281604.getClass(), "registry", null);
        setField(term2281600, term2281600.getClass(), "typeOfThis", term2281604);
        setField(term2281600, term2281600.getClass(), "source", null);
        setField(term2281600, term2281600.getClass(), "implementedInterfaces", null);
        setField(term2281600, term2281600.getClass(), "subTypes", null);
        setField(term2281600, term2281600.getClass(), "templateTypeName", null);
        setField(term2281600, term2281600.getClass(), "className", null);
        setField(term2281600, term2281600.getClass(), "properties", null);
        setField(term2281600, term2281600.getClass(), "implicitPrototype", null);
        setBooleanField(term2281600, term2281600.getClass(), "nativeType", false);
        setBooleanField(term2281600, term2281600.getClass(), "visited", false);
        setField(term2281600, term2281600.getClass(), "docInfo", null);
        setBooleanField(term2281600, term2281600.getClass(), "unknown", false);
        setBooleanField(term2281600, term2281600.getClass(), "resolved", false);
        setField(term2281600, term2281600.getClass(), "resolveResult", null);
        setField(term2281600, term2281600.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2276026;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2275374, args);
        assertTrue(recursiveEquals(term2275374, term2281595));
        assertTrue(recursiveEquals(term2276026, term2281600));
        assertTrue(recursiveEquals(retValue, false));
    }

};


