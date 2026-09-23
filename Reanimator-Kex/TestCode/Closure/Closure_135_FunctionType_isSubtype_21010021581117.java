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

public class FunctionType_isSubtype_21010021581117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1312161;
     Object term1312759;
     Object term1316250;
     Object term1316259;

    public FunctionType_isSubtype_21010021581117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1316269 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1316268 = ((Class) term1316269).getDeclaredField((String) "ORDINARY");
        ((Field) term1316268).setAccessible(true);
        Object enum2455 = ((Field) term1316268).get((Object) null);
        Class<? extends Object> term1316560 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1316559 = ((Class) term1316560).getDeclaredField((String) "INTERFACE");
        ((Field) term1316559).setAccessible(true);
        Object enum2456 = ((Field) term1316559).get((Object) null);
        term1312161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1312409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1312651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1312161, term1312161.getClass(), "kind", enum2455);
        setField(term1312409, term1312409.getClass(), "kind", enum2456);
        setField(term1312161, term1312161.getClass(), "typeOfThis", term1312409);
        setField(term1312161, term1312161.getClass(), "call", term1312651);
        Class<? extends Object> term1316854 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1316853 = ((Class) term1316854).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1316853).setAccessible(true);
        Object enum2457 = ((Field) term1316853).get((Object) null);
        term1312759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1312941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1312759, term1312759.getClass(), "kind", enum2455);
        setField(term1312941, term1312941.getClass(), "kind", enum2457);
        setField(term1312759, term1312759.getClass(), "typeOfThis", term1312941);
        setField(term1312759, term1312759.getClass(), "call", null);
        Class<? extends Object> term1317154 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1317153 = ((Class) term1317154).getDeclaredField((String) "ORDINARY");
        ((Field) term1317153).setAccessible(true);
        Object enum2458 = ((Field) term1317153).get((Object) null);
        Class<? extends Object> term1317445 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1317444 = ((Class) term1317445).getDeclaredField((String) "INTERFACE");
        ((Field) term1317444).setAccessible(true);
        Object enum2459 = ((Field) term1317444).get((Object) null);
        term1316250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1316251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1316255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1316250, term1316250.getClass(), "this$0", null);
        setField(term1316251, term1316251.getClass(), "parameters", null);
        setField(term1316251, term1316251.getClass(), "returnType", null);
        setBooleanField(term1316251, term1316251.getClass(), "resolved", false);
        setField(term1316251, term1316251.getClass(), "resolveResult", null);
        setField(term1316251, term1316251.getClass(), "registry", null);
        setField(term1316250, term1316250.getClass(), "call", term1316251);
        setField(term1316250, term1316250.getClass(), "prototype", null);
        setField(term1316250, term1316250.getClass(), "kind", enum2458);
        setField(term1316255, term1316255.getClass(), "call", null);
        setField(term1316255, term1316255.getClass(), "prototype", null);
        setField(term1316255, term1316255.getClass(), "kind", enum2459);
        setField(term1316255, term1316255.getClass(), "typeOfThis", null);
        setField(term1316255, term1316255.getClass(), "source", null);
        setField(term1316255, term1316255.getClass(), "implementedInterfaces", null);
        setField(term1316255, term1316255.getClass(), "subTypes", null);
        setField(term1316255, term1316255.getClass(), "templateTypeName", null);
        setField(term1316255, term1316255.getClass(), "className", null);
        setField(term1316255, term1316255.getClass(), "properties", null);
        setField(term1316255, term1316255.getClass(), "implicitPrototype", null);
        setBooleanField(term1316255, term1316255.getClass(), "nativeType", false);
        setBooleanField(term1316255, term1316255.getClass(), "visited", false);
        setField(term1316255, term1316255.getClass(), "docInfo", null);
        setBooleanField(term1316255, term1316255.getClass(), "unknown", false);
        setBooleanField(term1316255, term1316255.getClass(), "resolved", false);
        setField(term1316255, term1316255.getClass(), "resolveResult", null);
        setField(term1316255, term1316255.getClass(), "registry", null);
        setField(term1316250, term1316250.getClass(), "typeOfThis", term1316255);
        setField(term1316250, term1316250.getClass(), "source", null);
        setField(term1316250, term1316250.getClass(), "implementedInterfaces", null);
        setField(term1316250, term1316250.getClass(), "subTypes", null);
        setField(term1316250, term1316250.getClass(), "templateTypeName", null);
        setField(term1316250, term1316250.getClass(), "className", null);
        setField(term1316250, term1316250.getClass(), "properties", null);
        setField(term1316250, term1316250.getClass(), "implicitPrototype", null);
        setBooleanField(term1316250, term1316250.getClass(), "nativeType", false);
        setBooleanField(term1316250, term1316250.getClass(), "visited", false);
        setField(term1316250, term1316250.getClass(), "docInfo", null);
        setBooleanField(term1316250, term1316250.getClass(), "unknown", false);
        setBooleanField(term1316250, term1316250.getClass(), "resolved", false);
        setField(term1316250, term1316250.getClass(), "resolveResult", null);
        setField(term1316250, term1316250.getClass(), "registry", null);
        Class<? extends Object> term1317739 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1317738 = ((Class) term1317739).getDeclaredField((String) "ORDINARY");
        ((Field) term1317738).setAccessible(true);
        Object enum2460 = ((Field) term1317738).get((Object) null);
        Class<? extends Object> term1318030 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1318029 = ((Class) term1318030).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1318029).setAccessible(true);
        Object enum2461 = ((Field) term1318029).get((Object) null);
        term1316259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1316263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1316259, term1316259.getClass(), "this$0", null);
        setField(term1316259, term1316259.getClass(), "call", null);
        setField(term1316259, term1316259.getClass(), "prototype", null);
        setField(term1316259, term1316259.getClass(), "kind", enum2460);
        setField(term1316263, term1316263.getClass(), "this$0", null);
        setField(term1316263, term1316263.getClass(), "call", null);
        setField(term1316263, term1316263.getClass(), "prototype", null);
        setField(term1316263, term1316263.getClass(), "kind", enum2461);
        setField(term1316263, term1316263.getClass(), "typeOfThis", null);
        setField(term1316263, term1316263.getClass(), "source", null);
        setField(term1316263, term1316263.getClass(), "implementedInterfaces", null);
        setField(term1316263, term1316263.getClass(), "subTypes", null);
        setField(term1316263, term1316263.getClass(), "templateTypeName", null);
        setField(term1316263, term1316263.getClass(), "className", null);
        setField(term1316263, term1316263.getClass(), "properties", null);
        setField(term1316263, term1316263.getClass(), "implicitPrototype", null);
        setBooleanField(term1316263, term1316263.getClass(), "nativeType", false);
        setBooleanField(term1316263, term1316263.getClass(), "visited", false);
        setField(term1316263, term1316263.getClass(), "docInfo", null);
        setBooleanField(term1316263, term1316263.getClass(), "unknown", false);
        setBooleanField(term1316263, term1316263.getClass(), "resolved", false);
        setField(term1316263, term1316263.getClass(), "resolveResult", null);
        setField(term1316263, term1316263.getClass(), "registry", null);
        setField(term1316259, term1316259.getClass(), "typeOfThis", term1316263);
        setField(term1316259, term1316259.getClass(), "source", null);
        setField(term1316259, term1316259.getClass(), "implementedInterfaces", null);
        setField(term1316259, term1316259.getClass(), "subTypes", null);
        setField(term1316259, term1316259.getClass(), "templateTypeName", null);
        setField(term1316259, term1316259.getClass(), "className", null);
        setField(term1316259, term1316259.getClass(), "properties", null);
        setField(term1316259, term1316259.getClass(), "implicitPrototype", null);
        setBooleanField(term1316259, term1316259.getClass(), "nativeType", false);
        setBooleanField(term1316259, term1316259.getClass(), "visited", false);
        setField(term1316259, term1316259.getClass(), "docInfo", null);
        setBooleanField(term1316259, term1316259.getClass(), "unknown", false);
        setBooleanField(term1316259, term1316259.getClass(), "resolved", false);
        setField(term1316259, term1316259.getClass(), "resolveResult", null);
        setField(term1316259, term1316259.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1312759;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1312161, args);
        assertTrue(recursiveEquals(term1312161, term1316250));
        assertTrue(recursiveEquals(term1312759, term1316259));
        assertTrue(recursiveEquals(retValue, false));
    }

};


