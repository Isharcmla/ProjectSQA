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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_140262690299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16361;
     Object term16423;

    public FunctionType_setPrototypeNoCheck_140262690299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80051 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term80050 = ((Class) term80051).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term80050).setAccessible(true);
        Object enum230 = ((Field) term80050).get((Object) null);
        Class<? extends Object> term80351 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term80350 = ((Class) term80351).getDeclaredField((String) "STRUCT");
        ((Field) term80350).setAccessible(true);
        Object enum231 = ((Field) term80350).get((Object) null);
        term16361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term16362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term16363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term16363, term16363.getClass(), "type", -129547140);
        setIntField(term16365, term16365.getClass(), "type", 199287428);
        setIntField(term16367, term16367.getClass(), "type", -1195339592);
        setField(term16367, term16367.getClass(), "next", null);
        setField(term16367, term16367.getClass(), "first", null);
        setField(term16367, term16367.getClass(), "last", null);
        setField(term16367, term16367.getClass(), "propListHead", null);
        setIntField(term16367, term16367.getClass(), "sourcePosition", 0);
        setField(term16367, term16367.getClass(), "jsType", null);
        setField(term16367, term16367.getClass(), "parent", null);
        setField(term16365, term16365.getClass(), "next", term16367);
        setIntField(term16370, term16370.getClass(), "type", 0);
        setField(term16370, term16370.getClass(), "next", null);
        setField(term16370, term16370.getClass(), "first", null);
        setField(term16370, term16370.getClass(), "last", null);
        setField(term16370, term16370.getClass(), "propListHead", null);
        setIntField(term16370, term16370.getClass(), "sourcePosition", 0);
        setField(term16370, term16370.getClass(), "jsType", null);
        setField(term16370, term16370.getClass(), "parent", null);
        setField(term16365, term16365.getClass(), "first", term16370);
        setIntField(term16373, term16373.getClass(), "type", 2049577015);
        setField(term16373, term16373.getClass(), "next", null);
        setField(term16373, term16373.getClass(), "first", term16370);
        setField(term16373, term16373.getClass(), "last", term16373);
        setField(term16373, term16373.getClass(), "propListHead", null);
        setIntField(term16373, term16373.getClass(), "sourcePosition", 0);
        setField(term16373, term16373.getClass(), "jsType", null);
        setField(term16373, term16373.getClass(), "parent", null);
        setField(term16365, term16365.getClass(), "last", term16373);
        setField(term16365, term16365.getClass(), "propListHead", null);
        setIntField(term16365, term16365.getClass(), "sourcePosition", 0);
        setField(term16365, term16365.getClass(), "jsType", null);
        setField(term16365, term16365.getClass(), "parent", null);
        setField(term16363, term16363.getClass(), "next", term16365);
        setIntField(term16377, term16377.getClass(), "type", 1745276158);
        setIntField(term16379, term16379.getClass(), "type", 2009020256);
        setField(term16379, term16379.getClass(), "next", term16373);
        setField(term16379, term16379.getClass(), "first", null);
        setField(term16379, term16379.getClass(), "last", term16363);
        setField(term16379, term16379.getClass(), "propListHead", null);
        setIntField(term16379, term16379.getClass(), "sourcePosition", 0);
        setField(term16379, term16379.getClass(), "jsType", null);
        setField(term16379, term16379.getClass(), "parent", null);
        setField(term16377, term16377.getClass(), "next", term16379);
        setField(term16377, term16377.getClass(), "first", term16377);
        setIntField(term16382, term16382.getClass(), "type", -376422566);
        setField(term16382, term16382.getClass(), "next", null);
        setField(term16382, term16382.getClass(), "first", term16370);
        setField(term16382, term16382.getClass(), "last", term16373);
        setField(term16382, term16382.getClass(), "propListHead", null);
        setIntField(term16382, term16382.getClass(), "sourcePosition", 0);
        setField(term16382, term16382.getClass(), "jsType", null);
        setField(term16382, term16382.getClass(), "parent", null);
        setField(term16377, term16377.getClass(), "last", term16382);
        setField(term16377, term16377.getClass(), "propListHead", null);
        setIntField(term16377, term16377.getClass(), "sourcePosition", 0);
        setField(term16377, term16377.getClass(), "jsType", null);
        setField(term16377, term16377.getClass(), "parent", null);
        setField(term16363, term16363.getClass(), "first", term16377);
        setField(term16363, term16363.getClass(), "last", term16367);
        setField(term16363, term16363.getClass(), "propListHead", null);
        setIntField(term16363, term16363.getClass(), "sourcePosition", 0);
        setField(term16363, term16363.getClass(), "jsType", null);
        setField(term16363, term16363.getClass(), "parent", null);
        setField(term16362, term16362.getClass(), "parameters", term16363);
        setField(term16362, term16362.getClass(), "returnType", null);
        setBooleanField(term16362, term16362.getClass(), "returnTypeInferred", false);
        setBooleanField(term16362, term16362.getClass(), "resolved", false);
        setField(term16362, term16362.getClass(), "resolveResult", null);
        setBooleanField(term16362, term16362.getClass(), "inTemplatedCheckVisit", false);
        setField(term16362, term16362.getClass(), "registry", null);
        setField(term16361, term16361.getClass(), "call", term16362);
        setField(term16390, term16390.getClass(), "name", null);
        setField(term16390, term16390.getClass(), "type", null);
        setBooleanField(term16390, term16390.getClass(), "inferred", false);
        setField(term16390, term16390.getClass(), "propertyNode", null);
        setField(term16390, term16390.getClass(), "docInfo", null);
        setField(term16361, term16361.getClass(), "prototypeSlot", term16390);
        setField(term16361, term16361.getClass(), "kind", enum230);
        setField(term16361, term16361.getClass(), "propAccess", enum231);
        setField(term16361, term16361.getClass(), "typeOfThis", null);
        setField(term16361, term16361.getClass(), "source", null);
        setField(term16361, term16361.getClass(), "implementedInterfaces", null);
        setField(term16361, term16361.getClass(), "extendedInterfaces", null);
        setField(term16361, term16361.getClass(), "subTypes", null);
        setField(term16361, term16361.getClass(), "templateTypeNames", null);
        setField(term16361, term16361.getClass(), "className", null);
        setField(term16361, term16361.getClass(), "properties", null);
        setBooleanField(term16361, term16361.getClass(), "nativeType", false);
        setField(term16361, term16361.getClass(), "implicitPrototypeFallback", null);
        setField(term16361, term16361.getClass(), "ownerFunction", null);
        setBooleanField(term16361, term16361.getClass(), "prettyPrint", false);
        setBooleanField(term16361, term16361.getClass(), "visited", false);
        setField(term16361, term16361.getClass(), "docInfo", null);
        setBooleanField(term16361, term16361.getClass(), "unknown", false);
        setBooleanField(term16361, term16361.getClass(), "resolved", false);
        setField(term16361, term16361.getClass(), "resolveResult", null);
        setBooleanField(term16361, term16361.getClass(), "inTemplatedCheckVisit", false);
        setField(term16361, term16361.getClass(), "registry", null);
        term16423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16423, term16423.getClass(), "type", 1236004505);
        setIntField(term16425, term16425.getClass(), "type", 1050765721);
        setIntField(term16427, term16427.getClass(), "type", 474518942);
        setIntField(term16429, term16429.getClass(), "type", -1656687479);
        setIntField(term16431, term16431.getClass(), "type", -249614216);
        setField(term16431, term16431.getClass(), "next", null);
        setField(term16431, term16431.getClass(), "first", null);
        setField(term16431, term16431.getClass(), "last", null);
        setField(term16431, term16431.getClass(), "propListHead", null);
        setIntField(term16431, term16431.getClass(), "sourcePosition", 0);
        setField(term16431, term16431.getClass(), "jsType", null);
        setField(term16431, term16431.getClass(), "parent", null);
        setField(term16429, term16429.getClass(), "next", term16431);
        setIntField(term16434, term16434.getClass(), "type", 1870727665);
        setField(term16434, term16434.getClass(), "next", null);
        setField(term16434, term16434.getClass(), "first", null);
        setField(term16434, term16434.getClass(), "last", term16431);
        setField(term16434, term16434.getClass(), "propListHead", null);
        setIntField(term16434, term16434.getClass(), "sourcePosition", 0);
        setField(term16434, term16434.getClass(), "jsType", null);
        setField(term16434, term16434.getClass(), "parent", null);
        setField(term16429, term16429.getClass(), "first", term16434);
        setField(term16429, term16429.getClass(), "last", term16427);
        setField(term16429, term16429.getClass(), "propListHead", null);
        setIntField(term16429, term16429.getClass(), "sourcePosition", 0);
        setField(term16429, term16429.getClass(), "jsType", null);
        setField(term16429, term16429.getClass(), "parent", null);
        setField(term16427, term16427.getClass(), "next", term16429);
        setField(term16427, term16427.getClass(), "first", term16431);
        setIntField(term16438, term16438.getClass(), "type", -680920524);
        setIntField(term16440, term16440.getClass(), "type", -916335264);
        setField(term16440, term16440.getClass(), "next", null);
        setField(term16440, term16440.getClass(), "first", term16434);
        setField(term16440, term16440.getClass(), "last", term16429);
        setField(term16440, term16440.getClass(), "propListHead", null);
        setIntField(term16440, term16440.getClass(), "sourcePosition", 0);
        setField(term16440, term16440.getClass(), "jsType", null);
        setField(term16440, term16440.getClass(), "parent", null);
        setField(term16438, term16438.getClass(), "next", term16440);
        setField(term16438, term16438.getClass(), "first", term16425);
        setField(term16438, term16438.getClass(), "last", term16425);
        setField(term16438, term16438.getClass(), "propListHead", null);
        setIntField(term16438, term16438.getClass(), "sourcePosition", 0);
        setField(term16438, term16438.getClass(), "jsType", null);
        setField(term16438, term16438.getClass(), "parent", null);
        setField(term16427, term16427.getClass(), "last", term16438);
        setField(term16427, term16427.getClass(), "propListHead", null);
        setIntField(term16427, term16427.getClass(), "sourcePosition", 0);
        setField(term16427, term16427.getClass(), "jsType", null);
        setField(term16427, term16427.getClass(), "parent", null);
        setField(term16425, term16425.getClass(), "next", term16427);
        setIntField(term16445, term16445.getClass(), "type", -919416536);
        setField(term16445, term16445.getClass(), "next", term16438);
        setField(term16445, term16445.getClass(), "first", term16440);
        setField(term16445, term16445.getClass(), "last", term16423);
        setField(term16445, term16445.getClass(), "propListHead", null);
        setIntField(term16445, term16445.getClass(), "sourcePosition", 0);
        setField(term16445, term16445.getClass(), "jsType", null);
        setField(term16445, term16445.getClass(), "parent", null);
        setField(term16425, term16425.getClass(), "first", term16445);
        setField(term16425, term16425.getClass(), "last", term16445);
        setField(term16425, term16425.getClass(), "propListHead", null);
        setIntField(term16425, term16425.getClass(), "sourcePosition", 0);
        setField(term16425, term16425.getClass(), "jsType", null);
        setField(term16425, term16425.getClass(), "parent", null);
        setField(term16423, term16423.getClass(), "next", term16425);
        setField(term16423, term16423.getClass(), "first", term16429);
        setField(term16423, term16423.getClass(), "last", term16431);
        setField(term16423, term16423.getClass(), "propListHead", null);
        setIntField(term16423, term16423.getClass(), "sourcePosition", 0);
        setField(term16423, term16423.getClass(), "jsType", null);
        setField(term16423, term16423.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16423;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term16361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


