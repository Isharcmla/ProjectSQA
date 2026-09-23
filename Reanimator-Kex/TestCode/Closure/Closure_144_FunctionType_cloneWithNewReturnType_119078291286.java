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
import java.lang.Boolean;

public class FunctionType_cloneWithNewReturnType_119078291286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12806;
     Object term12861;

    public FunctionType_cloneWithNewReturnType_119078291286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44660 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term44659 = ((Class) term44660).getDeclaredField((String) "INTERFACE");
        ((Field) term44659).setAccessible(true);
        Object enum114 = ((Field) term44659).get((Object) null);
        term12806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12821 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12831 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term12808, term12808.getClass(), "type", -868676396);
        setIntField(term12810, term12810.getClass(), "type", -1268314569);
        setIntField(term12812, term12812.getClass(), "type", 0);
        setField(term12812, term12812.getClass(), "next", null);
        setField(term12812, term12812.getClass(), "first", null);
        setField(term12812, term12812.getClass(), "last", null);
        setField(term12812, term12812.getClass(), "propListHead", null);
        setIntField(term12812, term12812.getClass(), "sourcePosition", 0);
        setField(term12812, term12812.getClass(), "jsType", null);
        setField(term12812, term12812.getClass(), "parent", null);
        setField(term12810, term12810.getClass(), "next", term12812);
        setIntField(term12815, term12815.getClass(), "type", 0);
        setField(term12815, term12815.getClass(), "next", null);
        setField(term12815, term12815.getClass(), "first", null);
        setField(term12815, term12815.getClass(), "last", null);
        setField(term12815, term12815.getClass(), "propListHead", null);
        setIntField(term12815, term12815.getClass(), "sourcePosition", 0);
        setField(term12815, term12815.getClass(), "jsType", null);
        setField(term12815, term12815.getClass(), "parent", null);
        setField(term12810, term12810.getClass(), "first", term12815);
        setIntField(term12818, term12818.getClass(), "type", 0);
        setField(term12818, term12818.getClass(), "next", null);
        setField(term12818, term12818.getClass(), "first", null);
        setField(term12818, term12818.getClass(), "last", null);
        setField(term12818, term12818.getClass(), "propListHead", null);
        setIntField(term12818, term12818.getClass(), "sourcePosition", 0);
        setField(term12818, term12818.getClass(), "jsType", null);
        setField(term12818, term12818.getClass(), "parent", null);
        setField(term12810, term12810.getClass(), "last", term12818);
        setField(term12821, term12821.getClass(), "next", null);
        setIntField(term12821, term12821.getClass(), "type", 0);
        setIntField(term12821, term12821.getClass(), "intValue", 0);
        setField(term12821, term12821.getClass(), "objectValue", null);
        setField(term12810, term12810.getClass(), "propListHead", term12821);
        setIntField(term12810, term12810.getClass(), "sourcePosition", 877649659);
        setField(term12810, term12810.getClass(), "jsType", null);
        setField(term12810, term12810.getClass(), "parent", null);
        setField(term12808, term12808.getClass(), "next", term12810);
        setIntField(term12825, term12825.getClass(), "type", 0);
        setField(term12825, term12825.getClass(), "next", null);
        setField(term12825, term12825.getClass(), "first", null);
        setField(term12825, term12825.getClass(), "last", null);
        setField(term12825, term12825.getClass(), "propListHead", null);
        setIntField(term12825, term12825.getClass(), "sourcePosition", 0);
        setField(term12825, term12825.getClass(), "jsType", null);
        setField(term12825, term12825.getClass(), "parent", null);
        setField(term12808, term12808.getClass(), "first", term12825);
        setIntField(term12828, term12828.getClass(), "type", 0);
        setField(term12828, term12828.getClass(), "next", null);
        setField(term12828, term12828.getClass(), "first", null);
        setField(term12828, term12828.getClass(), "last", null);
        setField(term12828, term12828.getClass(), "propListHead", null);
        setIntField(term12828, term12828.getClass(), "sourcePosition", 0);
        setField(term12828, term12828.getClass(), "jsType", null);
        setField(term12828, term12828.getClass(), "parent", null);
        setField(term12808, term12808.getClass(), "last", term12828);
        setField(term12831, term12831.getClass(), "next", null);
        setIntField(term12831, term12831.getClass(), "type", 0);
        setIntField(term12831, term12831.getClass(), "intValue", 0);
        setField(term12831, term12831.getClass(), "objectValue", null);
        setField(term12808, term12808.getClass(), "propListHead", term12831);
        setIntField(term12808, term12808.getClass(), "sourcePosition", -1332748804);
        setField(term12808, term12808.getClass(), "jsType", null);
        setField(term12808, term12808.getClass(), "parent", null);
        setField(term12807, term12807.getClass(), "parameters", term12808);
        setField(term12807, term12807.getClass(), "returnType", null);
        setBooleanField(term12807, term12807.getClass(), "returnTypeInferred", false);
        setBooleanField(term12807, term12807.getClass(), "resolved", false);
        setField(term12807, term12807.getClass(), "resolveResult", null);
        setField(term12807, term12807.getClass(), "registry", null);
        setField(term12806, term12806.getClass(), "call", term12807);
        setField(term12837, term12837.getClass(), "ownerFunction", null);
        setField(term12837, term12837.getClass(), "className", null);
        setField(term12837, term12837.getClass(), "properties", null);
        setField(term12837, term12837.getClass(), "implicitPrototype", null);
        setBooleanField(term12837, term12837.getClass(), "nativeType", false);
        setBooleanField(term12837, term12837.getClass(), "prettyPrint", false);
        setBooleanField(term12837, term12837.getClass(), "visited", false);
        setField(term12837, term12837.getClass(), "docInfo", null);
        setBooleanField(term12837, term12837.getClass(), "unknown", false);
        setBooleanField(term12837, term12837.getClass(), "resolved", false);
        setField(term12837, term12837.getClass(), "resolveResult", null);
        setField(term12837, term12837.getClass(), "registry", null);
        setField(term12806, term12806.getClass(), "prototype", term12837);
        setField(term12806, term12806.getClass(), "kind", enum114);
        setField(term12806, term12806.getClass(), "typeOfThis", null);
        setField(term12806, term12806.getClass(), "source", null);
        setField(term12806, term12806.getClass(), "implementedInterfaces", null);
        setField(term12806, term12806.getClass(), "subTypes", null);
        setField(term12806, term12806.getClass(), "templateTypeName", null);
        setField(term12806, term12806.getClass(), "className", null);
        setField(term12806, term12806.getClass(), "properties", null);
        setField(term12806, term12806.getClass(), "implicitPrototype", null);
        setBooleanField(term12806, term12806.getClass(), "nativeType", false);
        setBooleanField(term12806, term12806.getClass(), "prettyPrint", false);
        setBooleanField(term12806, term12806.getClass(), "visited", false);
        setField(term12806, term12806.getClass(), "docInfo", null);
        setBooleanField(term12806, term12806.getClass(), "unknown", false);
        setBooleanField(term12806, term12806.getClass(), "resolved", false);
        setField(term12806, term12806.getClass(), "resolveResult", null);
        setField(term12806, term12806.getClass(), "registry", null);
        term12861 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12861;
        try {
            callMethod(klass, "cloneWithNewReturnType", argTypes, term12806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


