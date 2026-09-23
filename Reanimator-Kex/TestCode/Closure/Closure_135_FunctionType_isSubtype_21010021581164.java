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

public class FunctionType_isSubtype_21010021581164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1394612;
     Object term1395370;
     Object term1398166;
     Object term1398172;

    public FunctionType_isSubtype_21010021581164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1398183 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1398182 = ((Class) term1398183).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1398182).setAccessible(true);
        Object enum2608 = ((Field) term1398182).get((Object) null);
        term1394612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1395156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1395262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1394612, term1394612.getClass(), "kind", enum2608);
        setField(term1395156, term1395156.getClass(), "kind", enum2608);
        setField(term1395156, term1395156.getClass(), "typeOfThis", term1395262);
        setField(term1395156, term1395156.getClass(), "call", null);
        setField(term1394612, term1394612.getClass(), "typeOfThis", term1395156);
        Class<? extends Object> term1398483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1398482 = ((Class) term1398483).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1398482).setAccessible(true);
        Object enum2609 = ((Field) term1398482).get((Object) null);
        term1395370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1395700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1395794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1395370, term1395370.getClass(), "kind", enum2608);
        setField(term1395700, term1395700.getClass(), "kind", enum2609);
        setField(term1395700, term1395700.getClass(), "typeOfThis", null);
        setField(term1395700, term1395700.getClass(), "call", term1395794);
        setField(term1395370, term1395370.getClass(), "typeOfThis", term1395700);
        Class<? extends Object> term1398783 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1398782 = ((Class) term1398783).getDeclaredField((String) "INTERFACE");
        ((Field) term1398782).setAccessible(true);
        Object enum2610 = ((Field) term1398782).get((Object) null);
        term1398166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1398170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1398171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1398166, term1398166.getClass(), "this$0", null);
        setField(term1398166, term1398166.getClass(), "call", null);
        setField(term1398166, term1398166.getClass(), "prototype", null);
        setField(term1398166, term1398166.getClass(), "kind", enum2610);
        setField(term1398170, term1398170.getClass(), "call", null);
        setField(term1398170, term1398170.getClass(), "prototype", null);
        setField(term1398170, term1398170.getClass(), "kind", enum2610);
        setField(term1398171, term1398171.getClass(), "primitiveType", null);
        setField(term1398171, term1398171.getClass(), "primitiveObjectType", null);
        setField(term1398171, term1398171.getClass(), "name", null);
        setBooleanField(term1398171, term1398171.getClass(), "visited", false);
        setField(term1398171, term1398171.getClass(), "docInfo", null);
        setBooleanField(term1398171, term1398171.getClass(), "unknown", false);
        setBooleanField(term1398171, term1398171.getClass(), "resolved", false);
        setField(term1398171, term1398171.getClass(), "resolveResult", null);
        setField(term1398171, term1398171.getClass(), "registry", null);
        setField(term1398170, term1398170.getClass(), "typeOfThis", term1398171);
        setField(term1398170, term1398170.getClass(), "source", null);
        setField(term1398170, term1398170.getClass(), "implementedInterfaces", null);
        setField(term1398170, term1398170.getClass(), "subTypes", null);
        setField(term1398170, term1398170.getClass(), "templateTypeName", null);
        setField(term1398170, term1398170.getClass(), "className", null);
        setField(term1398170, term1398170.getClass(), "properties", null);
        setField(term1398170, term1398170.getClass(), "implicitPrototype", null);
        setBooleanField(term1398170, term1398170.getClass(), "nativeType", false);
        setBooleanField(term1398170, term1398170.getClass(), "visited", false);
        setField(term1398170, term1398170.getClass(), "docInfo", null);
        setBooleanField(term1398170, term1398170.getClass(), "unknown", false);
        setBooleanField(term1398170, term1398170.getClass(), "resolved", false);
        setField(term1398170, term1398170.getClass(), "resolveResult", null);
        setField(term1398170, term1398170.getClass(), "registry", null);
        setField(term1398166, term1398166.getClass(), "typeOfThis", term1398170);
        setField(term1398166, term1398166.getClass(), "source", null);
        setField(term1398166, term1398166.getClass(), "implementedInterfaces", null);
        setField(term1398166, term1398166.getClass(), "subTypes", null);
        setField(term1398166, term1398166.getClass(), "templateTypeName", null);
        setField(term1398166, term1398166.getClass(), "className", null);
        setField(term1398166, term1398166.getClass(), "properties", null);
        setField(term1398166, term1398166.getClass(), "implicitPrototype", null);
        setBooleanField(term1398166, term1398166.getClass(), "nativeType", false);
        setBooleanField(term1398166, term1398166.getClass(), "visited", false);
        setField(term1398166, term1398166.getClass(), "docInfo", null);
        setBooleanField(term1398166, term1398166.getClass(), "unknown", false);
        setBooleanField(term1398166, term1398166.getClass(), "resolved", false);
        setField(term1398166, term1398166.getClass(), "resolveResult", null);
        setField(term1398166, term1398166.getClass(), "registry", null);
        Class<? extends Object> term1399077 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1399076 = ((Class) term1399077).getDeclaredField((String) "INTERFACE");
        ((Field) term1399076).setAccessible(true);
        Object enum2611 = ((Field) term1399076).get((Object) null);
        Class<? extends Object> term1399371 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1399370 = ((Class) term1399371).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1399370).setAccessible(true);
        Object enum2612 = ((Field) term1399370).get((Object) null);
        term1398172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1398176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1398177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1398172, term1398172.getClass(), "this$0", null);
        setField(term1398172, term1398172.getClass(), "call", null);
        setField(term1398172, term1398172.getClass(), "prototype", null);
        setField(term1398172, term1398172.getClass(), "kind", enum2611);
        setField(term1398176, term1398176.getClass(), "this$0", null);
        setField(term1398177, term1398177.getClass(), "parameters", null);
        setField(term1398177, term1398177.getClass(), "returnType", null);
        setBooleanField(term1398177, term1398177.getClass(), "resolved", false);
        setField(term1398177, term1398177.getClass(), "resolveResult", null);
        setField(term1398177, term1398177.getClass(), "registry", null);
        setField(term1398176, term1398176.getClass(), "call", term1398177);
        setField(term1398176, term1398176.getClass(), "prototype", null);
        setField(term1398176, term1398176.getClass(), "kind", enum2612);
        setField(term1398176, term1398176.getClass(), "typeOfThis", null);
        setField(term1398176, term1398176.getClass(), "source", null);
        setField(term1398176, term1398176.getClass(), "implementedInterfaces", null);
        setField(term1398176, term1398176.getClass(), "subTypes", null);
        setField(term1398176, term1398176.getClass(), "templateTypeName", null);
        setField(term1398176, term1398176.getClass(), "className", null);
        setField(term1398176, term1398176.getClass(), "properties", null);
        setField(term1398176, term1398176.getClass(), "implicitPrototype", null);
        setBooleanField(term1398176, term1398176.getClass(), "nativeType", false);
        setBooleanField(term1398176, term1398176.getClass(), "visited", false);
        setField(term1398176, term1398176.getClass(), "docInfo", null);
        setBooleanField(term1398176, term1398176.getClass(), "unknown", false);
        setBooleanField(term1398176, term1398176.getClass(), "resolved", false);
        setField(term1398176, term1398176.getClass(), "resolveResult", null);
        setField(term1398176, term1398176.getClass(), "registry", null);
        setField(term1398172, term1398172.getClass(), "typeOfThis", term1398176);
        setField(term1398172, term1398172.getClass(), "source", null);
        setField(term1398172, term1398172.getClass(), "implementedInterfaces", null);
        setField(term1398172, term1398172.getClass(), "subTypes", null);
        setField(term1398172, term1398172.getClass(), "templateTypeName", null);
        setField(term1398172, term1398172.getClass(), "className", null);
        setField(term1398172, term1398172.getClass(), "properties", null);
        setField(term1398172, term1398172.getClass(), "implicitPrototype", null);
        setBooleanField(term1398172, term1398172.getClass(), "nativeType", false);
        setBooleanField(term1398172, term1398172.getClass(), "visited", false);
        setField(term1398172, term1398172.getClass(), "docInfo", null);
        setBooleanField(term1398172, term1398172.getClass(), "unknown", false);
        setBooleanField(term1398172, term1398172.getClass(), "resolved", false);
        setField(term1398172, term1398172.getClass(), "resolveResult", null);
        setField(term1398172, term1398172.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1395370;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1394612, args);
        assertTrue(recursiveEquals(term1394612, term1398166));
        assertTrue(recursiveEquals(term1395370, term1398172));
        assertTrue(recursiveEquals(retValue, true));
    }

};


