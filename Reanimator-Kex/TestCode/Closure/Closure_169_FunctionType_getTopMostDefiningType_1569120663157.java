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

public class FunctionType_getTopMostDefiningType_1569120663157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29787;

    public FunctionType_getTopMostDefiningType_1569120663157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180926 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term180925 = ((Class) term180926).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term180925).setAccessible(true);
        Object enum309 = ((Field) term180925).get((Object) null);
        Class<? extends Object> term181226 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term181225 = ((Class) term181226).getDeclaredField((String) "STRUCT");
        ((Field) term181225).setAccessible(true);
        Object enum310 = ((Field) term181225).get((Object) null);
        term29787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term29788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term29789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term29789, term29789.getClass(), "type", 1607082164);
        setIntField(term29791, term29791.getClass(), "type", 1890399366);
        setIntField(term29793, term29793.getClass(), "type", -1867239125);
        setField(term29793, term29793.getClass(), "next", null);
        setField(term29793, term29793.getClass(), "first", null);
        setField(term29793, term29793.getClass(), "last", null);
        setField(term29793, term29793.getClass(), "propListHead", null);
        setIntField(term29793, term29793.getClass(), "sourcePosition", 0);
        setField(term29793, term29793.getClass(), "jsType", null);
        setField(term29793, term29793.getClass(), "parent", null);
        setField(term29791, term29791.getClass(), "next", term29793);
        setIntField(term29796, term29796.getClass(), "type", 0);
        setField(term29796, term29796.getClass(), "next", null);
        setField(term29796, term29796.getClass(), "first", null);
        setField(term29796, term29796.getClass(), "last", null);
        setField(term29796, term29796.getClass(), "propListHead", null);
        setIntField(term29796, term29796.getClass(), "sourcePosition", 0);
        setField(term29796, term29796.getClass(), "jsType", null);
        setField(term29796, term29796.getClass(), "parent", null);
        setField(term29791, term29791.getClass(), "first", term29796);
        setIntField(term29799, term29799.getClass(), "type", 644154104);
        setField(term29799, term29799.getClass(), "next", null);
        setField(term29799, term29799.getClass(), "first", term29796);
        setField(term29799, term29799.getClass(), "last", term29799);
        setField(term29799, term29799.getClass(), "propListHead", null);
        setIntField(term29799, term29799.getClass(), "sourcePosition", 0);
        setField(term29799, term29799.getClass(), "jsType", null);
        setField(term29799, term29799.getClass(), "parent", null);
        setField(term29791, term29791.getClass(), "last", term29799);
        setField(term29791, term29791.getClass(), "propListHead", null);
        setIntField(term29791, term29791.getClass(), "sourcePosition", 0);
        setField(term29791, term29791.getClass(), "jsType", null);
        setField(term29791, term29791.getClass(), "parent", null);
        setField(term29789, term29789.getClass(), "next", term29791);
        setIntField(term29803, term29803.getClass(), "type", -645429025);
        setIntField(term29805, term29805.getClass(), "type", -688213483);
        setField(term29805, term29805.getClass(), "next", term29799);
        setField(term29805, term29805.getClass(), "first", null);
        setField(term29805, term29805.getClass(), "last", term29789);
        setField(term29805, term29805.getClass(), "propListHead", null);
        setIntField(term29805, term29805.getClass(), "sourcePosition", 0);
        setField(term29805, term29805.getClass(), "jsType", null);
        setField(term29805, term29805.getClass(), "parent", null);
        setField(term29803, term29803.getClass(), "next", term29805);
        setField(term29803, term29803.getClass(), "first", term29803);
        setIntField(term29808, term29808.getClass(), "type", 952869601);
        setField(term29808, term29808.getClass(), "next", null);
        setField(term29808, term29808.getClass(), "first", term29796);
        setField(term29808, term29808.getClass(), "last", term29799);
        setField(term29808, term29808.getClass(), "propListHead", null);
        setIntField(term29808, term29808.getClass(), "sourcePosition", 0);
        setField(term29808, term29808.getClass(), "jsType", null);
        setField(term29808, term29808.getClass(), "parent", null);
        setField(term29803, term29803.getClass(), "last", term29808);
        setField(term29803, term29803.getClass(), "propListHead", null);
        setIntField(term29803, term29803.getClass(), "sourcePosition", 0);
        setField(term29803, term29803.getClass(), "jsType", null);
        setField(term29803, term29803.getClass(), "parent", null);
        setField(term29789, term29789.getClass(), "first", term29803);
        setField(term29789, term29789.getClass(), "last", term29793);
        setField(term29789, term29789.getClass(), "propListHead", null);
        setIntField(term29789, term29789.getClass(), "sourcePosition", 0);
        setField(term29789, term29789.getClass(), "jsType", null);
        setField(term29789, term29789.getClass(), "parent", null);
        setField(term29788, term29788.getClass(), "parameters", term29789);
        setField(term29788, term29788.getClass(), "returnType", null);
        setBooleanField(term29788, term29788.getClass(), "returnTypeInferred", false);
        setBooleanField(term29788, term29788.getClass(), "resolved", false);
        setField(term29788, term29788.getClass(), "resolveResult", null);
        setBooleanField(term29788, term29788.getClass(), "inTemplatedCheckVisit", false);
        setField(term29788, term29788.getClass(), "registry", null);
        setField(term29787, term29787.getClass(), "call", term29788);
        setField(term29816, term29816.getClass(), "name", null);
        setField(term29816, term29816.getClass(), "type", null);
        setBooleanField(term29816, term29816.getClass(), "inferred", false);
        setField(term29816, term29816.getClass(), "propertyNode", null);
        setField(term29816, term29816.getClass(), "docInfo", null);
        setField(term29787, term29787.getClass(), "prototypeSlot", term29816);
        setField(term29787, term29787.getClass(), "kind", enum309);
        setField(term29787, term29787.getClass(), "propAccess", enum310);
        setField(term29787, term29787.getClass(), "typeOfThis", null);
        setField(term29787, term29787.getClass(), "source", null);
        setField(term29787, term29787.getClass(), "implementedInterfaces", null);
        setField(term29787, term29787.getClass(), "extendedInterfaces", null);
        setField(term29787, term29787.getClass(), "subTypes", null);
        setField(term29787, term29787.getClass(), "templateTypeNames", null);
        setField(term29787, term29787.getClass(), "className", null);
        setField(term29787, term29787.getClass(), "properties", null);
        setBooleanField(term29787, term29787.getClass(), "nativeType", false);
        setField(term29787, term29787.getClass(), "implicitPrototypeFallback", null);
        setField(term29787, term29787.getClass(), "ownerFunction", null);
        setBooleanField(term29787, term29787.getClass(), "prettyPrint", false);
        setBooleanField(term29787, term29787.getClass(), "visited", false);
        setField(term29787, term29787.getClass(), "docInfo", null);
        setBooleanField(term29787, term29787.getClass(), "unknown", false);
        setBooleanField(term29787, term29787.getClass(), "resolved", false);
        setField(term29787, term29787.getClass(), "resolveResult", null);
        setBooleanField(term29787, term29787.getClass(), "inTemplatedCheckVisit", false);
        setField(term29787, term29787.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XkIoWJRNwN";
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term29787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


