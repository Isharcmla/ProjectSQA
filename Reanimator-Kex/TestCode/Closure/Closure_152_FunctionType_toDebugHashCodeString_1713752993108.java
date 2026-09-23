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

public class FunctionType_toDebugHashCodeString_1713752993108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20999;

    public FunctionType_toDebugHashCodeString_1713752993108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60286 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term60285 = ((Class) term60286).getDeclaredField((String) "INTERFACE");
        ((Field) term60285).setAccessible(true);
        Object enum153 = ((Field) term60285).get((Object) null);
        term20999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term21000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term21001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21014 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21024 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term21001, term21001.getClass(), "type", -255317272);
        setIntField(term21003, term21003.getClass(), "type", -1617383807);
        setIntField(term21005, term21005.getClass(), "type", 0);
        setField(term21005, term21005.getClass(), "next", null);
        setField(term21005, term21005.getClass(), "first", null);
        setField(term21005, term21005.getClass(), "last", null);
        setField(term21005, term21005.getClass(), "propListHead", null);
        setIntField(term21005, term21005.getClass(), "sourcePosition", 0);
        setField(term21005, term21005.getClass(), "jsType", null);
        setField(term21005, term21005.getClass(), "parent", null);
        setField(term21003, term21003.getClass(), "next", term21005);
        setIntField(term21008, term21008.getClass(), "type", 0);
        setField(term21008, term21008.getClass(), "next", null);
        setField(term21008, term21008.getClass(), "first", null);
        setField(term21008, term21008.getClass(), "last", null);
        setField(term21008, term21008.getClass(), "propListHead", null);
        setIntField(term21008, term21008.getClass(), "sourcePosition", 0);
        setField(term21008, term21008.getClass(), "jsType", null);
        setField(term21008, term21008.getClass(), "parent", null);
        setField(term21003, term21003.getClass(), "first", term21008);
        setIntField(term21011, term21011.getClass(), "type", 0);
        setField(term21011, term21011.getClass(), "next", null);
        setField(term21011, term21011.getClass(), "first", null);
        setField(term21011, term21011.getClass(), "last", null);
        setField(term21011, term21011.getClass(), "propListHead", null);
        setIntField(term21011, term21011.getClass(), "sourcePosition", 0);
        setField(term21011, term21011.getClass(), "jsType", null);
        setField(term21011, term21011.getClass(), "parent", null);
        setField(term21003, term21003.getClass(), "last", term21011);
        setField(term21014, term21014.getClass(), "next", null);
        setIntField(term21014, term21014.getClass(), "type", 0);
        setIntField(term21014, term21014.getClass(), "intValue", 0);
        setField(term21014, term21014.getClass(), "objectValue", null);
        setField(term21003, term21003.getClass(), "propListHead", term21014);
        setIntField(term21003, term21003.getClass(), "sourcePosition", -1244386281);
        setField(term21003, term21003.getClass(), "jsType", null);
        setField(term21003, term21003.getClass(), "parent", null);
        setField(term21001, term21001.getClass(), "next", term21003);
        setIntField(term21018, term21018.getClass(), "type", 0);
        setField(term21018, term21018.getClass(), "next", null);
        setField(term21018, term21018.getClass(), "first", null);
        setField(term21018, term21018.getClass(), "last", null);
        setField(term21018, term21018.getClass(), "propListHead", null);
        setIntField(term21018, term21018.getClass(), "sourcePosition", 0);
        setField(term21018, term21018.getClass(), "jsType", null);
        setField(term21018, term21018.getClass(), "parent", null);
        setField(term21001, term21001.getClass(), "first", term21018);
        setIntField(term21021, term21021.getClass(), "type", 0);
        setField(term21021, term21021.getClass(), "next", null);
        setField(term21021, term21021.getClass(), "first", null);
        setField(term21021, term21021.getClass(), "last", null);
        setField(term21021, term21021.getClass(), "propListHead", null);
        setIntField(term21021, term21021.getClass(), "sourcePosition", 0);
        setField(term21021, term21021.getClass(), "jsType", null);
        setField(term21021, term21021.getClass(), "parent", null);
        setField(term21001, term21001.getClass(), "last", term21021);
        setField(term21024, term21024.getClass(), "next", null);
        setIntField(term21024, term21024.getClass(), "type", 0);
        setIntField(term21024, term21024.getClass(), "intValue", 0);
        setField(term21024, term21024.getClass(), "objectValue", null);
        setField(term21001, term21001.getClass(), "propListHead", term21024);
        setIntField(term21001, term21001.getClass(), "sourcePosition", -885788574);
        setField(term21001, term21001.getClass(), "jsType", null);
        setField(term21001, term21001.getClass(), "parent", null);
        setField(term21000, term21000.getClass(), "parameters", term21001);
        setField(term21000, term21000.getClass(), "returnType", null);
        setBooleanField(term21000, term21000.getClass(), "returnTypeInferred", false);
        setBooleanField(term21000, term21000.getClass(), "resolved", false);
        setField(term21000, term21000.getClass(), "resolveResult", null);
        setField(term21000, term21000.getClass(), "registry", null);
        setField(term20999, term20999.getClass(), "call", term21000);
        setField(term21030, term21030.getClass(), "ownerFunction", null);
        setField(term21030, term21030.getClass(), "className", null);
        setField(term21030, term21030.getClass(), "properties", null);
        setBooleanField(term21030, term21030.getClass(), "nativeType", false);
        setField(term21030, term21030.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term21030, term21030.getClass(), "prettyPrint", false);
        setBooleanField(term21030, term21030.getClass(), "visited", false);
        setField(term21030, term21030.getClass(), "docInfo", null);
        setBooleanField(term21030, term21030.getClass(), "unknown", false);
        setBooleanField(term21030, term21030.getClass(), "resolved", false);
        setField(term21030, term21030.getClass(), "resolveResult", null);
        setField(term21030, term21030.getClass(), "registry", null);
        setField(term20999, term20999.getClass(), "prototype", term21030);
        setField(term20999, term20999.getClass(), "kind", enum153);
        setField(term20999, term20999.getClass(), "typeOfThis", null);
        setField(term20999, term20999.getClass(), "source", null);
        setField(term20999, term20999.getClass(), "implementedInterfaces", null);
        setField(term20999, term20999.getClass(), "subTypes", null);
        setField(term20999, term20999.getClass(), "templateTypeName", null);
        setField(term20999, term20999.getClass(), "className", null);
        setField(term20999, term20999.getClass(), "properties", null);
        setBooleanField(term20999, term20999.getClass(), "nativeType", false);
        setField(term20999, term20999.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term20999, term20999.getClass(), "prettyPrint", false);
        setBooleanField(term20999, term20999.getClass(), "visited", false);
        setField(term20999, term20999.getClass(), "docInfo", null);
        setBooleanField(term20999, term20999.getClass(), "unknown", false);
        setBooleanField(term20999, term20999.getClass(), "resolved", false);
        setField(term20999, term20999.getClass(), "resolveResult", null);
        setField(term20999, term20999.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toDebugHashCodeString", argTypes, term20999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


