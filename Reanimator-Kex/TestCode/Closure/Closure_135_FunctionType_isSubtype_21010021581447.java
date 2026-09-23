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

public class FunctionType_isSubtype_21010021581447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1879687;
     Object term1880125;
     Object term1881245;
     Object term1881251;

    public FunctionType_isSubtype_21010021581447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1881259 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1881258 = ((Class) term1881259).getDeclaredField((String) "ORDINARY");
        ((Field) term1881258).setAccessible(true);
        Object enum3505 = ((Field) term1881258).get((Object) null);
        term1879687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1879923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term1880017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1879687, term1879687.getClass(), "kind", enum3505);
        setField(term1879687, term1879687.getClass(), "typeOfThis", term1879923);
        setField(term1879687, term1879687.getClass(), "call", term1880017);
        Class<? extends Object> term1881550 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1881549 = ((Class) term1881550).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1881549).setAccessible(true);
        Object enum3506 = ((Field) term1881549).get((Object) null);
        term1880125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1880367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term1880461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1880125, term1880125.getClass(), "kind", enum3506);
        setField(term1880125, term1880125.getClass(), "typeOfThis", term1880367);
        setField(term1880125, term1880125.getClass(), "call", term1880461);
        Class<? extends Object> term1881850 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1881849 = ((Class) term1881850).getDeclaredField((String) "ORDINARY");
        ((Field) term1881849).setAccessible(true);
        Object enum3507 = ((Field) term1881849).get((Object) null);
        term1881245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1881246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1881250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1881245, term1881245.getClass(), "this$0", null);
        setField(term1881246, term1881246.getClass(), "parameters", null);
        setField(term1881246, term1881246.getClass(), "returnType", null);
        setBooleanField(term1881246, term1881246.getClass(), "resolved", false);
        setField(term1881246, term1881246.getClass(), "resolveResult", null);
        setField(term1881246, term1881246.getClass(), "registry", null);
        setField(term1881245, term1881245.getClass(), "call", term1881246);
        setField(term1881245, term1881245.getClass(), "prototype", null);
        setField(term1881245, term1881245.getClass(), "kind", enum3507);
        setField(term1881250, term1881250.getClass(), "leastSupertypeVisitor", null);
        setField(term1881250, term1881250.getClass(), "greatestSubtypeVisitor", null);
        setField(term1881250, term1881250.getClass(), "call", null);
        setField(term1881250, term1881250.getClass(), "prototype", null);
        setField(term1881250, term1881250.getClass(), "kind", null);
        setField(term1881250, term1881250.getClass(), "typeOfThis", null);
        setField(term1881250, term1881250.getClass(), "source", null);
        setField(term1881250, term1881250.getClass(), "implementedInterfaces", null);
        setField(term1881250, term1881250.getClass(), "subTypes", null);
        setField(term1881250, term1881250.getClass(), "templateTypeName", null);
        setField(term1881250, term1881250.getClass(), "className", null);
        setField(term1881250, term1881250.getClass(), "properties", null);
        setField(term1881250, term1881250.getClass(), "implicitPrototype", null);
        setBooleanField(term1881250, term1881250.getClass(), "nativeType", false);
        setBooleanField(term1881250, term1881250.getClass(), "visited", false);
        setField(term1881250, term1881250.getClass(), "docInfo", null);
        setBooleanField(term1881250, term1881250.getClass(), "unknown", false);
        setBooleanField(term1881250, term1881250.getClass(), "resolved", false);
        setField(term1881250, term1881250.getClass(), "resolveResult", null);
        setField(term1881250, term1881250.getClass(), "registry", null);
        setField(term1881245, term1881245.getClass(), "typeOfThis", term1881250);
        setField(term1881245, term1881245.getClass(), "source", null);
        setField(term1881245, term1881245.getClass(), "implementedInterfaces", null);
        setField(term1881245, term1881245.getClass(), "subTypes", null);
        setField(term1881245, term1881245.getClass(), "templateTypeName", null);
        setField(term1881245, term1881245.getClass(), "className", null);
        setField(term1881245, term1881245.getClass(), "properties", null);
        setField(term1881245, term1881245.getClass(), "implicitPrototype", null);
        setBooleanField(term1881245, term1881245.getClass(), "nativeType", false);
        setBooleanField(term1881245, term1881245.getClass(), "visited", false);
        setField(term1881245, term1881245.getClass(), "docInfo", null);
        setBooleanField(term1881245, term1881245.getClass(), "unknown", false);
        setBooleanField(term1881245, term1881245.getClass(), "resolved", false);
        setField(term1881245, term1881245.getClass(), "resolveResult", null);
        setField(term1881245, term1881245.getClass(), "registry", null);
        Class<? extends Object> term1882141 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1882140 = ((Class) term1882141).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1882140).setAccessible(true);
        Object enum3508 = ((Field) term1882140).get((Object) null);
        term1881251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1881252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1881256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1881251, term1881251.getClass(), "this$0", null);
        setField(term1881252, term1881252.getClass(), "parameters", null);
        setField(term1881252, term1881252.getClass(), "returnType", null);
        setBooleanField(term1881252, term1881252.getClass(), "resolved", false);
        setField(term1881252, term1881252.getClass(), "resolveResult", null);
        setField(term1881252, term1881252.getClass(), "registry", null);
        setField(term1881251, term1881251.getClass(), "call", term1881252);
        setField(term1881251, term1881251.getClass(), "prototype", null);
        setField(term1881251, term1881251.getClass(), "kind", enum3508);
        setField(term1881256, term1881256.getClass(), "reference", null);
        setField(term1881256, term1881256.getClass(), "sourceName", null);
        setIntField(term1881256, term1881256.getClass(), "lineno", 0);
        setIntField(term1881256, term1881256.getClass(), "charno", 0);
        setBooleanField(term1881256, term1881256.getClass(), "forgiving", false);
        setField(term1881256, term1881256.getClass(), "referencedType", null);
        setBooleanField(term1881256, term1881256.getClass(), "visited", false);
        setField(term1881256, term1881256.getClass(), "docInfo", null);
        setBooleanField(term1881256, term1881256.getClass(), "unknown", false);
        setBooleanField(term1881256, term1881256.getClass(), "resolved", false);
        setField(term1881256, term1881256.getClass(), "resolveResult", null);
        setField(term1881256, term1881256.getClass(), "registry", null);
        setField(term1881251, term1881251.getClass(), "typeOfThis", term1881256);
        setField(term1881251, term1881251.getClass(), "source", null);
        setField(term1881251, term1881251.getClass(), "implementedInterfaces", null);
        setField(term1881251, term1881251.getClass(), "subTypes", null);
        setField(term1881251, term1881251.getClass(), "templateTypeName", null);
        setField(term1881251, term1881251.getClass(), "className", null);
        setField(term1881251, term1881251.getClass(), "properties", null);
        setField(term1881251, term1881251.getClass(), "implicitPrototype", null);
        setBooleanField(term1881251, term1881251.getClass(), "nativeType", false);
        setBooleanField(term1881251, term1881251.getClass(), "visited", false);
        setField(term1881251, term1881251.getClass(), "docInfo", null);
        setBooleanField(term1881251, term1881251.getClass(), "unknown", false);
        setBooleanField(term1881251, term1881251.getClass(), "resolved", false);
        setField(term1881251, term1881251.getClass(), "resolveResult", null);
        setField(term1881251, term1881251.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1880125;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1879687, args);
        assertTrue(recursiveEquals(term1879687, term1881245));
        assertTrue(recursiveEquals(term1880125, term1881251));
        assertTrue(recursiveEquals(retValue, true));
    }

};


