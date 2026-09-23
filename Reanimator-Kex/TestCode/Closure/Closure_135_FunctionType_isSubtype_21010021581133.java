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

public class FunctionType_isSubtype_21010021581133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1341828;
     Object term1342590;
     Object term1343312;
     Object term1343318;

    public FunctionType_isSubtype_21010021581133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1343325 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1343324 = ((Class) term1343325).getDeclaredField((String) "ORDINARY");
        ((Field) term1343324).setAccessible(true);
        Object enum2510 = ((Field) term1343324).get((Object) null);
        term1341828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1342372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1342482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1341828, term1341828.getClass(), "kind", enum2510);
        setField(term1342372, term1342372.getClass(), "kind", enum2510);
        setField(term1342372, term1342372.getClass(), "typeOfThis", term1342482);
        setField(term1341828, term1341828.getClass(), "typeOfThis", term1342372);
        term1342590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1342912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1342590, term1342590.getClass(), "kind", enum2510);
        setField(term1342912, term1342912.getClass(), "kind", enum2510);
        setField(term1342912, term1342912.getClass(), "typeOfThis", null);
        setField(term1342590, term1342590.getClass(), "typeOfThis", term1342912);
        Class<? extends Object> term1343616 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1343615 = ((Class) term1343616).getDeclaredField((String) "INTERFACE");
        ((Field) term1343615).setAccessible(true);
        Object enum2511 = ((Field) term1343615).get((Object) null);
        term1343312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1343316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1343317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1343312, term1343312.getClass(), "this$0", null);
        setField(term1343312, term1343312.getClass(), "call", null);
        setField(term1343312, term1343312.getClass(), "prototype", null);
        setField(term1343312, term1343312.getClass(), "kind", enum2511);
        setField(term1343316, term1343316.getClass(), "call", null);
        setField(term1343316, term1343316.getClass(), "prototype", null);
        setField(term1343316, term1343316.getClass(), "kind", enum2511);
        setField(term1343317, term1343317.getClass(), "parameterType", null);
        setField(term1343317, term1343317.getClass(), "referencedType", null);
        setBooleanField(term1343317, term1343317.getClass(), "visited", false);
        setField(term1343317, term1343317.getClass(), "docInfo", null);
        setBooleanField(term1343317, term1343317.getClass(), "unknown", false);
        setBooleanField(term1343317, term1343317.getClass(), "resolved", false);
        setField(term1343317, term1343317.getClass(), "resolveResult", null);
        setField(term1343317, term1343317.getClass(), "registry", null);
        setField(term1343316, term1343316.getClass(), "typeOfThis", term1343317);
        setField(term1343316, term1343316.getClass(), "source", null);
        setField(term1343316, term1343316.getClass(), "implementedInterfaces", null);
        setField(term1343316, term1343316.getClass(), "subTypes", null);
        setField(term1343316, term1343316.getClass(), "templateTypeName", null);
        setField(term1343316, term1343316.getClass(), "className", null);
        setField(term1343316, term1343316.getClass(), "properties", null);
        setField(term1343316, term1343316.getClass(), "implicitPrototype", null);
        setBooleanField(term1343316, term1343316.getClass(), "nativeType", false);
        setBooleanField(term1343316, term1343316.getClass(), "visited", false);
        setField(term1343316, term1343316.getClass(), "docInfo", null);
        setBooleanField(term1343316, term1343316.getClass(), "unknown", false);
        setBooleanField(term1343316, term1343316.getClass(), "resolved", false);
        setField(term1343316, term1343316.getClass(), "resolveResult", null);
        setField(term1343316, term1343316.getClass(), "registry", null);
        setField(term1343312, term1343312.getClass(), "typeOfThis", term1343316);
        setField(term1343312, term1343312.getClass(), "source", null);
        setField(term1343312, term1343312.getClass(), "implementedInterfaces", null);
        setField(term1343312, term1343312.getClass(), "subTypes", null);
        setField(term1343312, term1343312.getClass(), "templateTypeName", null);
        setField(term1343312, term1343312.getClass(), "className", null);
        setField(term1343312, term1343312.getClass(), "properties", null);
        setField(term1343312, term1343312.getClass(), "implicitPrototype", null);
        setBooleanField(term1343312, term1343312.getClass(), "nativeType", false);
        setBooleanField(term1343312, term1343312.getClass(), "visited", false);
        setField(term1343312, term1343312.getClass(), "docInfo", null);
        setBooleanField(term1343312, term1343312.getClass(), "unknown", false);
        setBooleanField(term1343312, term1343312.getClass(), "resolved", false);
        setField(term1343312, term1343312.getClass(), "resolveResult", null);
        setField(term1343312, term1343312.getClass(), "registry", null);
        Class<? extends Object> term1343910 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1343909 = ((Class) term1343910).getDeclaredField((String) "INTERFACE");
        ((Field) term1343909).setAccessible(true);
        Object enum2512 = ((Field) term1343909).get((Object) null);
        term1343318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1343322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1343318, term1343318.getClass(), "this$0", null);
        setField(term1343318, term1343318.getClass(), "call", null);
        setField(term1343318, term1343318.getClass(), "prototype", null);
        setField(term1343318, term1343318.getClass(), "kind", enum2512);
        setField(term1343322, term1343322.getClass(), "call", null);
        setField(term1343322, term1343322.getClass(), "prototype", null);
        setField(term1343322, term1343322.getClass(), "kind", enum2512);
        setField(term1343322, term1343322.getClass(), "typeOfThis", null);
        setField(term1343322, term1343322.getClass(), "source", null);
        setField(term1343322, term1343322.getClass(), "implementedInterfaces", null);
        setField(term1343322, term1343322.getClass(), "subTypes", null);
        setField(term1343322, term1343322.getClass(), "templateTypeName", null);
        setField(term1343322, term1343322.getClass(), "className", null);
        setField(term1343322, term1343322.getClass(), "properties", null);
        setField(term1343322, term1343322.getClass(), "implicitPrototype", null);
        setBooleanField(term1343322, term1343322.getClass(), "nativeType", false);
        setBooleanField(term1343322, term1343322.getClass(), "visited", false);
        setField(term1343322, term1343322.getClass(), "docInfo", null);
        setBooleanField(term1343322, term1343322.getClass(), "unknown", false);
        setBooleanField(term1343322, term1343322.getClass(), "resolved", false);
        setField(term1343322, term1343322.getClass(), "resolveResult", null);
        setField(term1343322, term1343322.getClass(), "registry", null);
        setField(term1343318, term1343318.getClass(), "typeOfThis", term1343322);
        setField(term1343318, term1343318.getClass(), "source", null);
        setField(term1343318, term1343318.getClass(), "implementedInterfaces", null);
        setField(term1343318, term1343318.getClass(), "subTypes", null);
        setField(term1343318, term1343318.getClass(), "templateTypeName", null);
        setField(term1343318, term1343318.getClass(), "className", null);
        setField(term1343318, term1343318.getClass(), "properties", null);
        setField(term1343318, term1343318.getClass(), "implicitPrototype", null);
        setBooleanField(term1343318, term1343318.getClass(), "nativeType", false);
        setBooleanField(term1343318, term1343318.getClass(), "visited", false);
        setField(term1343318, term1343318.getClass(), "docInfo", null);
        setBooleanField(term1343318, term1343318.getClass(), "unknown", false);
        setBooleanField(term1343318, term1343318.getClass(), "resolved", false);
        setField(term1343318, term1343318.getClass(), "resolveResult", null);
        setField(term1343318, term1343318.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1342590;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1341828, args);
        assertTrue(recursiveEquals(term1341828, term1343312));
        assertTrue(recursiveEquals(term1342590, term1343318));
        assertTrue(recursiveEquals(retValue, true));
    }

};


