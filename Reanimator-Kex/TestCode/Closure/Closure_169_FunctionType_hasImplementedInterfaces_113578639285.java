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

public class FunctionType_hasImplementedInterfaces_113578639285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6967;

    public FunctionType_hasImplementedInterfaces_113578639285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63420 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term63419 = ((Class) term63420).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term63419).setAccessible(true);
        Object enum184 = ((Field) term63419).get((Object) null);
        Class<? extends Object> term63720 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term63719 = ((Class) term63720).getDeclaredField((String) "STRUCT");
        ((Field) term63719).setAccessible(true);
        Object enum185 = ((Field) term63719).get((Object) null);
        term6967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term6969, term6969.getClass(), "type", 1202361360);
        setIntField(term6971, term6971.getClass(), "type", -2015048153);
        setIntField(term6973, term6973.getClass(), "type", -2063457669);
        setField(term6973, term6973.getClass(), "next", null);
        setField(term6973, term6973.getClass(), "first", null);
        setField(term6973, term6973.getClass(), "last", null);
        setField(term6973, term6973.getClass(), "propListHead", null);
        setIntField(term6973, term6973.getClass(), "sourcePosition", 0);
        setField(term6973, term6973.getClass(), "jsType", null);
        setField(term6973, term6973.getClass(), "parent", null);
        setField(term6971, term6971.getClass(), "next", term6973);
        setIntField(term6976, term6976.getClass(), "type", 0);
        setField(term6976, term6976.getClass(), "next", null);
        setField(term6976, term6976.getClass(), "first", null);
        setField(term6976, term6976.getClass(), "last", null);
        setField(term6976, term6976.getClass(), "propListHead", null);
        setIntField(term6976, term6976.getClass(), "sourcePosition", 0);
        setField(term6976, term6976.getClass(), "jsType", null);
        setField(term6976, term6976.getClass(), "parent", null);
        setField(term6971, term6971.getClass(), "first", term6976);
        setIntField(term6979, term6979.getClass(), "type", 9726679);
        setField(term6979, term6979.getClass(), "next", null);
        setField(term6979, term6979.getClass(), "first", term6976);
        setField(term6979, term6979.getClass(), "last", term6979);
        setField(term6979, term6979.getClass(), "propListHead", null);
        setIntField(term6979, term6979.getClass(), "sourcePosition", 0);
        setField(term6979, term6979.getClass(), "jsType", null);
        setField(term6979, term6979.getClass(), "parent", null);
        setField(term6971, term6971.getClass(), "last", term6979);
        setField(term6971, term6971.getClass(), "propListHead", null);
        setIntField(term6971, term6971.getClass(), "sourcePosition", 0);
        setField(term6971, term6971.getClass(), "jsType", null);
        setField(term6971, term6971.getClass(), "parent", null);
        setField(term6969, term6969.getClass(), "next", term6971);
        setIntField(term6983, term6983.getClass(), "type", -1565502840);
        setIntField(term6985, term6985.getClass(), "type", 344323424);
        setField(term6985, term6985.getClass(), "next", term6979);
        setField(term6985, term6985.getClass(), "first", null);
        setField(term6985, term6985.getClass(), "last", term6969);
        setField(term6985, term6985.getClass(), "propListHead", null);
        setIntField(term6985, term6985.getClass(), "sourcePosition", 0);
        setField(term6985, term6985.getClass(), "jsType", null);
        setField(term6985, term6985.getClass(), "parent", null);
        setField(term6983, term6983.getClass(), "next", term6985);
        setField(term6983, term6983.getClass(), "first", term6983);
        setIntField(term6988, term6988.getClass(), "type", -1222006000);
        setField(term6988, term6988.getClass(), "next", null);
        setField(term6988, term6988.getClass(), "first", term6976);
        setField(term6988, term6988.getClass(), "last", term6979);
        setField(term6988, term6988.getClass(), "propListHead", null);
        setIntField(term6988, term6988.getClass(), "sourcePosition", 0);
        setField(term6988, term6988.getClass(), "jsType", null);
        setField(term6988, term6988.getClass(), "parent", null);
        setField(term6983, term6983.getClass(), "last", term6988);
        setField(term6983, term6983.getClass(), "propListHead", null);
        setIntField(term6983, term6983.getClass(), "sourcePosition", 0);
        setField(term6983, term6983.getClass(), "jsType", null);
        setField(term6983, term6983.getClass(), "parent", null);
        setField(term6969, term6969.getClass(), "first", term6983);
        setField(term6969, term6969.getClass(), "last", term6973);
        setField(term6969, term6969.getClass(), "propListHead", null);
        setIntField(term6969, term6969.getClass(), "sourcePosition", 0);
        setField(term6969, term6969.getClass(), "jsType", null);
        setField(term6969, term6969.getClass(), "parent", null);
        setField(term6968, term6968.getClass(), "parameters", term6969);
        setField(term6968, term6968.getClass(), "returnType", null);
        setBooleanField(term6968, term6968.getClass(), "returnTypeInferred", false);
        setBooleanField(term6968, term6968.getClass(), "resolved", false);
        setField(term6968, term6968.getClass(), "resolveResult", null);
        setBooleanField(term6968, term6968.getClass(), "inTemplatedCheckVisit", false);
        setField(term6968, term6968.getClass(), "registry", null);
        setField(term6967, term6967.getClass(), "call", term6968);
        setField(term6996, term6996.getClass(), "name", null);
        setField(term6996, term6996.getClass(), "type", null);
        setBooleanField(term6996, term6996.getClass(), "inferred", false);
        setField(term6996, term6996.getClass(), "propertyNode", null);
        setField(term6996, term6996.getClass(), "docInfo", null);
        setField(term6967, term6967.getClass(), "prototypeSlot", term6996);
        setField(term6967, term6967.getClass(), "kind", enum184);
        setField(term6967, term6967.getClass(), "propAccess", enum185);
        setField(term6967, term6967.getClass(), "typeOfThis", null);
        setField(term6967, term6967.getClass(), "source", null);
        setField(term6967, term6967.getClass(), "implementedInterfaces", null);
        setField(term6967, term6967.getClass(), "extendedInterfaces", null);
        setField(term6967, term6967.getClass(), "subTypes", null);
        setField(term6967, term6967.getClass(), "templateTypeNames", null);
        setField(term6967, term6967.getClass(), "className", null);
        setField(term6967, term6967.getClass(), "properties", null);
        setBooleanField(term6967, term6967.getClass(), "nativeType", false);
        setField(term6967, term6967.getClass(), "implicitPrototypeFallback", null);
        setField(term6967, term6967.getClass(), "ownerFunction", null);
        setBooleanField(term6967, term6967.getClass(), "prettyPrint", false);
        setBooleanField(term6967, term6967.getClass(), "visited", false);
        setField(term6967, term6967.getClass(), "docInfo", null);
        setBooleanField(term6967, term6967.getClass(), "unknown", false);
        setBooleanField(term6967, term6967.getClass(), "resolved", false);
        setField(term6967, term6967.getClass(), "resolveResult", null);
        setBooleanField(term6967, term6967.getClass(), "inTemplatedCheckVisit", false);
        setField(term6967, term6967.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasImplementedInterfaces", argTypes, term6967, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


