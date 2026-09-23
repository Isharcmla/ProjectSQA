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

public class FunctionType_isSubtype_21010021581141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352446;
     Object term1353044;
     Object term1354627;
     Object term1354636;

    public FunctionType_isSubtype_21010021581141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1354646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1354645 = ((Class) term1354646).getDeclaredField((String) "ORDINARY");
        ((Field) term1354645).setAccessible(true);
        Object enum2532 = ((Field) term1354645).get((Object) null);
        Class<? extends Object> term1354937 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1354936 = ((Class) term1354937).getDeclaredField((String) "INTERFACE");
        ((Field) term1354936).setAccessible(true);
        Object enum2533 = ((Field) term1354936).get((Object) null);
        term1352446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1352694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1352936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1352446, term1352446.getClass(), "kind", enum2532);
        setField(term1352694, term1352694.getClass(), "kind", enum2533);
        setField(term1352446, term1352446.getClass(), "typeOfThis", term1352694);
        setField(term1352446, term1352446.getClass(), "call", term1352936);
        Class<? extends Object> term1355231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1355230 = ((Class) term1355231).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1355230).setAccessible(true);
        Object enum2534 = ((Field) term1355230).get((Object) null);
        term1353044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1353226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1353044, term1353044.getClass(), "kind", enum2532);
        setField(term1353226, term1353226.getClass(), "kind", enum2534);
        setField(term1353044, term1353044.getClass(), "typeOfThis", term1353226);
        setField(term1353044, term1353044.getClass(), "call", null);
        Class<? extends Object> term1355531 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1355530 = ((Class) term1355531).getDeclaredField((String) "ORDINARY");
        ((Field) term1355530).setAccessible(true);
        Object enum2535 = ((Field) term1355530).get((Object) null);
        Class<? extends Object> term1355822 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1355821 = ((Class) term1355822).getDeclaredField((String) "INTERFACE");
        ((Field) term1355821).setAccessible(true);
        Object enum2536 = ((Field) term1355821).get((Object) null);
        term1354627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1354628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1354632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1354627, term1354627.getClass(), "this$0", null);
        setField(term1354628, term1354628.getClass(), "parameters", null);
        setField(term1354628, term1354628.getClass(), "returnType", null);
        setBooleanField(term1354628, term1354628.getClass(), "resolved", false);
        setField(term1354628, term1354628.getClass(), "resolveResult", null);
        setField(term1354628, term1354628.getClass(), "registry", null);
        setField(term1354627, term1354627.getClass(), "call", term1354628);
        setField(term1354627, term1354627.getClass(), "prototype", null);
        setField(term1354627, term1354627.getClass(), "kind", enum2535);
        setField(term1354632, term1354632.getClass(), "call", null);
        setField(term1354632, term1354632.getClass(), "prototype", null);
        setField(term1354632, term1354632.getClass(), "kind", enum2536);
        setField(term1354632, term1354632.getClass(), "typeOfThis", null);
        setField(term1354632, term1354632.getClass(), "source", null);
        setField(term1354632, term1354632.getClass(), "implementedInterfaces", null);
        setField(term1354632, term1354632.getClass(), "subTypes", null);
        setField(term1354632, term1354632.getClass(), "templateTypeName", null);
        setField(term1354632, term1354632.getClass(), "className", null);
        setField(term1354632, term1354632.getClass(), "properties", null);
        setField(term1354632, term1354632.getClass(), "implicitPrototype", null);
        setBooleanField(term1354632, term1354632.getClass(), "nativeType", false);
        setBooleanField(term1354632, term1354632.getClass(), "visited", false);
        setField(term1354632, term1354632.getClass(), "docInfo", null);
        setBooleanField(term1354632, term1354632.getClass(), "unknown", false);
        setBooleanField(term1354632, term1354632.getClass(), "resolved", false);
        setField(term1354632, term1354632.getClass(), "resolveResult", null);
        setField(term1354632, term1354632.getClass(), "registry", null);
        setField(term1354627, term1354627.getClass(), "typeOfThis", term1354632);
        setField(term1354627, term1354627.getClass(), "source", null);
        setField(term1354627, term1354627.getClass(), "implementedInterfaces", null);
        setField(term1354627, term1354627.getClass(), "subTypes", null);
        setField(term1354627, term1354627.getClass(), "templateTypeName", null);
        setField(term1354627, term1354627.getClass(), "className", null);
        setField(term1354627, term1354627.getClass(), "properties", null);
        setField(term1354627, term1354627.getClass(), "implicitPrototype", null);
        setBooleanField(term1354627, term1354627.getClass(), "nativeType", false);
        setBooleanField(term1354627, term1354627.getClass(), "visited", false);
        setField(term1354627, term1354627.getClass(), "docInfo", null);
        setBooleanField(term1354627, term1354627.getClass(), "unknown", false);
        setBooleanField(term1354627, term1354627.getClass(), "resolved", false);
        setField(term1354627, term1354627.getClass(), "resolveResult", null);
        setField(term1354627, term1354627.getClass(), "registry", null);
        Class<? extends Object> term1356116 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1356115 = ((Class) term1356116).getDeclaredField((String) "ORDINARY");
        ((Field) term1356115).setAccessible(true);
        Object enum2537 = ((Field) term1356115).get((Object) null);
        Class<? extends Object> term1356407 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1356406 = ((Class) term1356407).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1356406).setAccessible(true);
        Object enum2538 = ((Field) term1356406).get((Object) null);
        term1354636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1354640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1354636, term1354636.getClass(), "this$0", null);
        setField(term1354636, term1354636.getClass(), "call", null);
        setField(term1354636, term1354636.getClass(), "prototype", null);
        setField(term1354636, term1354636.getClass(), "kind", enum2537);
        setField(term1354640, term1354640.getClass(), "this$0", null);
        setField(term1354640, term1354640.getClass(), "call", null);
        setField(term1354640, term1354640.getClass(), "prototype", null);
        setField(term1354640, term1354640.getClass(), "kind", enum2538);
        setField(term1354640, term1354640.getClass(), "typeOfThis", null);
        setField(term1354640, term1354640.getClass(), "source", null);
        setField(term1354640, term1354640.getClass(), "implementedInterfaces", null);
        setField(term1354640, term1354640.getClass(), "subTypes", null);
        setField(term1354640, term1354640.getClass(), "templateTypeName", null);
        setField(term1354640, term1354640.getClass(), "className", null);
        setField(term1354640, term1354640.getClass(), "properties", null);
        setField(term1354640, term1354640.getClass(), "implicitPrototype", null);
        setBooleanField(term1354640, term1354640.getClass(), "nativeType", false);
        setBooleanField(term1354640, term1354640.getClass(), "visited", false);
        setField(term1354640, term1354640.getClass(), "docInfo", null);
        setBooleanField(term1354640, term1354640.getClass(), "unknown", false);
        setBooleanField(term1354640, term1354640.getClass(), "resolved", false);
        setField(term1354640, term1354640.getClass(), "resolveResult", null);
        setField(term1354640, term1354640.getClass(), "registry", null);
        setField(term1354636, term1354636.getClass(), "typeOfThis", term1354640);
        setField(term1354636, term1354636.getClass(), "source", null);
        setField(term1354636, term1354636.getClass(), "implementedInterfaces", null);
        setField(term1354636, term1354636.getClass(), "subTypes", null);
        setField(term1354636, term1354636.getClass(), "templateTypeName", null);
        setField(term1354636, term1354636.getClass(), "className", null);
        setField(term1354636, term1354636.getClass(), "properties", null);
        setField(term1354636, term1354636.getClass(), "implicitPrototype", null);
        setBooleanField(term1354636, term1354636.getClass(), "nativeType", false);
        setBooleanField(term1354636, term1354636.getClass(), "visited", false);
        setField(term1354636, term1354636.getClass(), "docInfo", null);
        setBooleanField(term1354636, term1354636.getClass(), "unknown", false);
        setBooleanField(term1354636, term1354636.getClass(), "resolved", false);
        setField(term1354636, term1354636.getClass(), "resolveResult", null);
        setField(term1354636, term1354636.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1353044;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1352446, args);
        assertTrue(recursiveEquals(term1352446, term1354627));
        assertTrue(recursiveEquals(term1353044, term1354636));
        assertTrue(recursiveEquals(retValue, false));
    }

};


