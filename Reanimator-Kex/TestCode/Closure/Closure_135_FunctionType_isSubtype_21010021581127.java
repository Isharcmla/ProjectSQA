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

public class FunctionType_isSubtype_21010021581127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1330617;
     Object term1331067;
     Object term1333277;
     Object term1333283;

    public FunctionType_isSubtype_21010021581127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1333291 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1333290 = ((Class) term1333291).getDeclaredField((String) "ORDINARY");
        ((Field) term1333290).setAccessible(true);
        Object enum2491 = ((Field) term1333290).get((Object) null);
        term1330617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1330865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1330959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1330617, term1330617.getClass(), "kind", enum2491);
        setField(term1330865, term1330865.getClass(), "kind", enum2491);
        setField(term1330865, term1330865.getClass(), "typeOfThis", term1330865);
        setField(term1330617, term1330617.getClass(), "typeOfThis", term1330865);
        setField(term1330617, term1330617.getClass(), "call", term1330959);
        Class<? extends Object> term1333582 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1333581 = ((Class) term1333582).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1333581).setAccessible(true);
        Object enum2492 = ((Field) term1333581).get((Object) null);
        term1331067 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1331323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1331429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1331067, term1331067.getClass(), "kind", enum2492);
        setField(term1331323, term1331323.getClass(), "kind", enum2492);
        setField(term1331323, term1331323.getClass(), "typeOfThis", term1331429);
        setField(term1331067, term1331067.getClass(), "typeOfThis", term1331323);
        setField(term1331067, term1331067.getClass(), "call", null);
        Class<? extends Object> term1333882 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1333881 = ((Class) term1333882).getDeclaredField((String) "ORDINARY");
        ((Field) term1333881).setAccessible(true);
        Object enum2493 = ((Field) term1333881).get((Object) null);
        term1333277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1333278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1333282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1333277, term1333277.getClass(), "this$0", null);
        setField(term1333278, term1333278.getClass(), "parameters", null);
        setField(term1333278, term1333278.getClass(), "returnType", null);
        setBooleanField(term1333278, term1333278.getClass(), "resolved", false);
        setField(term1333278, term1333278.getClass(), "resolveResult", null);
        setField(term1333278, term1333278.getClass(), "registry", null);
        setField(term1333277, term1333277.getClass(), "call", term1333278);
        setField(term1333277, term1333277.getClass(), "prototype", null);
        setField(term1333277, term1333277.getClass(), "kind", enum2493);
        setField(term1333282, term1333282.getClass(), "call", null);
        setField(term1333282, term1333282.getClass(), "prototype", null);
        setField(term1333282, term1333282.getClass(), "kind", enum2493);
        setField(term1333282, term1333282.getClass(), "typeOfThis", term1333282);
        setField(term1333282, term1333282.getClass(), "source", null);
        setField(term1333282, term1333282.getClass(), "implementedInterfaces", null);
        setField(term1333282, term1333282.getClass(), "subTypes", null);
        setField(term1333282, term1333282.getClass(), "templateTypeName", null);
        setField(term1333282, term1333282.getClass(), "className", null);
        setField(term1333282, term1333282.getClass(), "properties", null);
        setField(term1333282, term1333282.getClass(), "implicitPrototype", null);
        setBooleanField(term1333282, term1333282.getClass(), "nativeType", false);
        setBooleanField(term1333282, term1333282.getClass(), "visited", false);
        setField(term1333282, term1333282.getClass(), "docInfo", null);
        setBooleanField(term1333282, term1333282.getClass(), "unknown", false);
        setBooleanField(term1333282, term1333282.getClass(), "resolved", false);
        setField(term1333282, term1333282.getClass(), "resolveResult", null);
        setField(term1333282, term1333282.getClass(), "registry", null);
        setField(term1333277, term1333277.getClass(), "typeOfThis", term1333282);
        setField(term1333277, term1333277.getClass(), "source", null);
        setField(term1333277, term1333277.getClass(), "implementedInterfaces", null);
        setField(term1333277, term1333277.getClass(), "subTypes", null);
        setField(term1333277, term1333277.getClass(), "templateTypeName", null);
        setField(term1333277, term1333277.getClass(), "className", null);
        setField(term1333277, term1333277.getClass(), "properties", null);
        setField(term1333277, term1333277.getClass(), "implicitPrototype", null);
        setBooleanField(term1333277, term1333277.getClass(), "nativeType", false);
        setBooleanField(term1333277, term1333277.getClass(), "visited", false);
        setField(term1333277, term1333277.getClass(), "docInfo", null);
        setBooleanField(term1333277, term1333277.getClass(), "unknown", false);
        setBooleanField(term1333277, term1333277.getClass(), "resolved", false);
        setField(term1333277, term1333277.getClass(), "resolveResult", null);
        setField(term1333277, term1333277.getClass(), "registry", null);
        Class<? extends Object> term1334173 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1334172 = ((Class) term1334173).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1334172).setAccessible(true);
        Object enum2494 = ((Field) term1334172).get((Object) null);
        term1333283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1333287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1333288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1333283, term1333283.getClass(), "this$0", null);
        setField(term1333283, term1333283.getClass(), "call", null);
        setField(term1333283, term1333283.getClass(), "prototype", null);
        setField(term1333283, term1333283.getClass(), "kind", enum2494);
        setField(term1333287, term1333287.getClass(), "this$0", null);
        setField(term1333287, term1333287.getClass(), "call", null);
        setField(term1333287, term1333287.getClass(), "prototype", null);
        setField(term1333287, term1333287.getClass(), "kind", enum2494);
        setField(term1333288, term1333288.getClass(), "primitiveType", null);
        setField(term1333288, term1333288.getClass(), "primitiveObjectType", null);
        setField(term1333288, term1333288.getClass(), "name", null);
        setBooleanField(term1333288, term1333288.getClass(), "visited", false);
        setField(term1333288, term1333288.getClass(), "docInfo", null);
        setBooleanField(term1333288, term1333288.getClass(), "unknown", false);
        setBooleanField(term1333288, term1333288.getClass(), "resolved", false);
        setField(term1333288, term1333288.getClass(), "resolveResult", null);
        setField(term1333288, term1333288.getClass(), "registry", null);
        setField(term1333287, term1333287.getClass(), "typeOfThis", term1333288);
        setField(term1333287, term1333287.getClass(), "source", null);
        setField(term1333287, term1333287.getClass(), "implementedInterfaces", null);
        setField(term1333287, term1333287.getClass(), "subTypes", null);
        setField(term1333287, term1333287.getClass(), "templateTypeName", null);
        setField(term1333287, term1333287.getClass(), "className", null);
        setField(term1333287, term1333287.getClass(), "properties", null);
        setField(term1333287, term1333287.getClass(), "implicitPrototype", null);
        setBooleanField(term1333287, term1333287.getClass(), "nativeType", false);
        setBooleanField(term1333287, term1333287.getClass(), "visited", false);
        setField(term1333287, term1333287.getClass(), "docInfo", null);
        setBooleanField(term1333287, term1333287.getClass(), "unknown", false);
        setBooleanField(term1333287, term1333287.getClass(), "resolved", false);
        setField(term1333287, term1333287.getClass(), "resolveResult", null);
        setField(term1333287, term1333287.getClass(), "registry", null);
        setField(term1333283, term1333283.getClass(), "typeOfThis", term1333287);
        setField(term1333283, term1333283.getClass(), "source", null);
        setField(term1333283, term1333283.getClass(), "implementedInterfaces", null);
        setField(term1333283, term1333283.getClass(), "subTypes", null);
        setField(term1333283, term1333283.getClass(), "templateTypeName", null);
        setField(term1333283, term1333283.getClass(), "className", null);
        setField(term1333283, term1333283.getClass(), "properties", null);
        setField(term1333283, term1333283.getClass(), "implicitPrototype", null);
        setBooleanField(term1333283, term1333283.getClass(), "nativeType", false);
        setBooleanField(term1333283, term1333283.getClass(), "visited", false);
        setField(term1333283, term1333283.getClass(), "docInfo", null);
        setBooleanField(term1333283, term1333283.getClass(), "unknown", false);
        setBooleanField(term1333283, term1333283.getClass(), "resolved", false);
        setField(term1333283, term1333283.getClass(), "resolveResult", null);
        setField(term1333283, term1333283.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1331067;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1330617, args);
        assertTrue(recursiveEquals(term1330617, term1333277));
        assertTrue(recursiveEquals(term1331067, term1333283));
        assertTrue(recursiveEquals(retValue, false));
    }

};


