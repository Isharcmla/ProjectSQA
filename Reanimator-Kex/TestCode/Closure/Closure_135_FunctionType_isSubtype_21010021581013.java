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

public class FunctionType_isSubtype_21010021581013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1146454;
     Object term1147052;
     Object term1148127;
     Object term1148136;

    public FunctionType_isSubtype_21010021581013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1148143 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1148142 = ((Class) term1148143).getDeclaredField((String) "ORDINARY");
        ((Field) term1148142).setAccessible(true);
        Object enum2136 = ((Field) term1148142).get((Object) null);
        Class<? extends Object> term1148434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1148433 = ((Class) term1148434).getDeclaredField((String) "INTERFACE");
        ((Field) term1148433).setAccessible(true);
        Object enum2137 = ((Field) term1148433).get((Object) null);
        term1146454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1146702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1146944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1146454, term1146454.getClass(), "kind", enum2136);
        setField(term1146702, term1146702.getClass(), "kind", enum2137);
        setField(term1146454, term1146454.getClass(), "typeOfThis", term1146702);
        setField(term1146454, term1146454.getClass(), "call", term1146944);
        term1147052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1147234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1147052, term1147052.getClass(), "kind", enum2136);
        setField(term1147234, term1147234.getClass(), "kind", enum2136);
        setField(term1147052, term1147052.getClass(), "typeOfThis", term1147234);
        setField(term1147052, term1147052.getClass(), "call", null);
        Class<? extends Object> term1148728 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1148727 = ((Class) term1148728).getDeclaredField((String) "ORDINARY");
        ((Field) term1148727).setAccessible(true);
        Object enum2138 = ((Field) term1148727).get((Object) null);
        Class<? extends Object> term1149019 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1149018 = ((Class) term1149019).getDeclaredField((String) "INTERFACE");
        ((Field) term1149018).setAccessible(true);
        Object enum2139 = ((Field) term1149018).get((Object) null);
        term1148127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1148128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1148132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1148127, term1148127.getClass(), "this$0", null);
        setField(term1148128, term1148128.getClass(), "parameters", null);
        setField(term1148128, term1148128.getClass(), "returnType", null);
        setBooleanField(term1148128, term1148128.getClass(), "resolved", false);
        setField(term1148128, term1148128.getClass(), "resolveResult", null);
        setField(term1148128, term1148128.getClass(), "registry", null);
        setField(term1148127, term1148127.getClass(), "call", term1148128);
        setField(term1148127, term1148127.getClass(), "prototype", null);
        setField(term1148127, term1148127.getClass(), "kind", enum2138);
        setField(term1148132, term1148132.getClass(), "call", null);
        setField(term1148132, term1148132.getClass(), "prototype", null);
        setField(term1148132, term1148132.getClass(), "kind", enum2139);
        setField(term1148132, term1148132.getClass(), "typeOfThis", null);
        setField(term1148132, term1148132.getClass(), "source", null);
        setField(term1148132, term1148132.getClass(), "implementedInterfaces", null);
        setField(term1148132, term1148132.getClass(), "subTypes", null);
        setField(term1148132, term1148132.getClass(), "templateTypeName", null);
        setField(term1148132, term1148132.getClass(), "className", null);
        setField(term1148132, term1148132.getClass(), "properties", null);
        setField(term1148132, term1148132.getClass(), "implicitPrototype", null);
        setBooleanField(term1148132, term1148132.getClass(), "nativeType", false);
        setBooleanField(term1148132, term1148132.getClass(), "visited", false);
        setField(term1148132, term1148132.getClass(), "docInfo", null);
        setBooleanField(term1148132, term1148132.getClass(), "unknown", false);
        setBooleanField(term1148132, term1148132.getClass(), "resolved", false);
        setField(term1148132, term1148132.getClass(), "resolveResult", null);
        setField(term1148132, term1148132.getClass(), "registry", null);
        setField(term1148127, term1148127.getClass(), "typeOfThis", term1148132);
        setField(term1148127, term1148127.getClass(), "source", null);
        setField(term1148127, term1148127.getClass(), "implementedInterfaces", null);
        setField(term1148127, term1148127.getClass(), "subTypes", null);
        setField(term1148127, term1148127.getClass(), "templateTypeName", null);
        setField(term1148127, term1148127.getClass(), "className", null);
        setField(term1148127, term1148127.getClass(), "properties", null);
        setField(term1148127, term1148127.getClass(), "implicitPrototype", null);
        setBooleanField(term1148127, term1148127.getClass(), "nativeType", false);
        setBooleanField(term1148127, term1148127.getClass(), "visited", false);
        setField(term1148127, term1148127.getClass(), "docInfo", null);
        setBooleanField(term1148127, term1148127.getClass(), "unknown", false);
        setBooleanField(term1148127, term1148127.getClass(), "resolved", false);
        setField(term1148127, term1148127.getClass(), "resolveResult", null);
        setField(term1148127, term1148127.getClass(), "registry", null);
        Class<? extends Object> term1149313 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1149312 = ((Class) term1149313).getDeclaredField((String) "ORDINARY");
        ((Field) term1149312).setAccessible(true);
        Object enum2140 = ((Field) term1149312).get((Object) null);
        term1148136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1148140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1148136, term1148136.getClass(), "this$0", null);
        setField(term1148136, term1148136.getClass(), "call", null);
        setField(term1148136, term1148136.getClass(), "prototype", null);
        setField(term1148136, term1148136.getClass(), "kind", enum2140);
        setField(term1148140, term1148140.getClass(), "this$0", null);
        setField(term1148140, term1148140.getClass(), "call", null);
        setField(term1148140, term1148140.getClass(), "prototype", null);
        setField(term1148140, term1148140.getClass(), "kind", enum2140);
        setField(term1148140, term1148140.getClass(), "typeOfThis", null);
        setField(term1148140, term1148140.getClass(), "source", null);
        setField(term1148140, term1148140.getClass(), "implementedInterfaces", null);
        setField(term1148140, term1148140.getClass(), "subTypes", null);
        setField(term1148140, term1148140.getClass(), "templateTypeName", null);
        setField(term1148140, term1148140.getClass(), "className", null);
        setField(term1148140, term1148140.getClass(), "properties", null);
        setField(term1148140, term1148140.getClass(), "implicitPrototype", null);
        setBooleanField(term1148140, term1148140.getClass(), "nativeType", false);
        setBooleanField(term1148140, term1148140.getClass(), "visited", false);
        setField(term1148140, term1148140.getClass(), "docInfo", null);
        setBooleanField(term1148140, term1148140.getClass(), "unknown", false);
        setBooleanField(term1148140, term1148140.getClass(), "resolved", false);
        setField(term1148140, term1148140.getClass(), "resolveResult", null);
        setField(term1148140, term1148140.getClass(), "registry", null);
        setField(term1148136, term1148136.getClass(), "typeOfThis", term1148140);
        setField(term1148136, term1148136.getClass(), "source", null);
        setField(term1148136, term1148136.getClass(), "implementedInterfaces", null);
        setField(term1148136, term1148136.getClass(), "subTypes", null);
        setField(term1148136, term1148136.getClass(), "templateTypeName", null);
        setField(term1148136, term1148136.getClass(), "className", null);
        setField(term1148136, term1148136.getClass(), "properties", null);
        setField(term1148136, term1148136.getClass(), "implicitPrototype", null);
        setBooleanField(term1148136, term1148136.getClass(), "nativeType", false);
        setBooleanField(term1148136, term1148136.getClass(), "visited", false);
        setField(term1148136, term1148136.getClass(), "docInfo", null);
        setBooleanField(term1148136, term1148136.getClass(), "unknown", false);
        setBooleanField(term1148136, term1148136.getClass(), "resolved", false);
        setField(term1148136, term1148136.getClass(), "resolveResult", null);
        setField(term1148136, term1148136.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1147052;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1146454, args);
        assertTrue(recursiveEquals(term1146454, term1148127));
        assertTrue(recursiveEquals(term1147052, term1148136));
        assertTrue(recursiveEquals(retValue, false));
    }

};


