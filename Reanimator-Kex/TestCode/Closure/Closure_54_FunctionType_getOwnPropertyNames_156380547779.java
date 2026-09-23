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

public class FunctionType_getOwnPropertyNames_156380547779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5689;

    public FunctionType_getOwnPropertyNames_156380547779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32849 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term32848 = ((Class) term32849).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term32848).setAccessible(true);
        Object enum87 = ((Field) term32848).get((Object) null);
        term5689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term5691, term5691.getClass(), "type", -1274456137);
        setIntField(term5693, term5693.getClass(), "type", -1885090354);
        setIntField(term5695, term5695.getClass(), "type", 0);
        setField(term5695, term5695.getClass(), "next", null);
        setField(term5695, term5695.getClass(), "first", null);
        setField(term5695, term5695.getClass(), "last", null);
        setField(term5695, term5695.getClass(), "propListHead", null);
        setIntField(term5695, term5695.getClass(), "sourcePosition", 0);
        setField(term5695, term5695.getClass(), "jsType", null);
        setField(term5695, term5695.getClass(), "parent", null);
        setField(term5693, term5693.getClass(), "next", term5695);
        setIntField(term5698, term5698.getClass(), "type", 0);
        setField(term5698, term5698.getClass(), "next", null);
        setField(term5698, term5698.getClass(), "first", null);
        setField(term5698, term5698.getClass(), "last", null);
        setField(term5698, term5698.getClass(), "propListHead", null);
        setIntField(term5698, term5698.getClass(), "sourcePosition", 0);
        setField(term5698, term5698.getClass(), "jsType", null);
        setField(term5698, term5698.getClass(), "parent", null);
        setField(term5693, term5693.getClass(), "first", term5698);
        setIntField(term5701, term5701.getClass(), "type", 0);
        setField(term5701, term5701.getClass(), "next", null);
        setField(term5701, term5701.getClass(), "first", null);
        setField(term5701, term5701.getClass(), "last", null);
        setField(term5701, term5701.getClass(), "propListHead", null);
        setIntField(term5701, term5701.getClass(), "sourcePosition", 0);
        setField(term5701, term5701.getClass(), "jsType", null);
        setField(term5701, term5701.getClass(), "parent", null);
        setField(term5693, term5693.getClass(), "last", term5701);
        setField(term5693, term5693.getClass(), "propListHead", null);
        setIntField(term5693, term5693.getClass(), "sourcePosition", 0);
        setField(term5693, term5693.getClass(), "jsType", null);
        setField(term5693, term5693.getClass(), "parent", null);
        setField(term5691, term5691.getClass(), "next", term5693);
        setIntField(term5705, term5705.getClass(), "type", 0);
        setField(term5705, term5705.getClass(), "next", null);
        setField(term5705, term5705.getClass(), "first", null);
        setField(term5705, term5705.getClass(), "last", null);
        setField(term5705, term5705.getClass(), "propListHead", null);
        setIntField(term5705, term5705.getClass(), "sourcePosition", 0);
        setField(term5705, term5705.getClass(), "jsType", null);
        setField(term5705, term5705.getClass(), "parent", null);
        setField(term5691, term5691.getClass(), "first", term5705);
        setIntField(term5708, term5708.getClass(), "type", 0);
        setField(term5708, term5708.getClass(), "next", null);
        setField(term5708, term5708.getClass(), "first", null);
        setField(term5708, term5708.getClass(), "last", null);
        setField(term5708, term5708.getClass(), "propListHead", null);
        setIntField(term5708, term5708.getClass(), "sourcePosition", 0);
        setField(term5708, term5708.getClass(), "jsType", null);
        setField(term5708, term5708.getClass(), "parent", null);
        setField(term5691, term5691.getClass(), "last", term5708);
        setField(term5691, term5691.getClass(), "propListHead", null);
        setIntField(term5691, term5691.getClass(), "sourcePosition", 0);
        setField(term5691, term5691.getClass(), "jsType", null);
        setField(term5691, term5691.getClass(), "parent", null);
        setField(term5690, term5690.getClass(), "parameters", term5691);
        setField(term5690, term5690.getClass(), "returnType", null);
        setBooleanField(term5690, term5690.getClass(), "returnTypeInferred", false);
        setBooleanField(term5690, term5690.getClass(), "resolved", false);
        setField(term5690, term5690.getClass(), "resolveResult", null);
        setField(term5690, term5690.getClass(), "registry", null);
        setField(term5689, term5689.getClass(), "call", term5690);
        setField(term5714, term5714.getClass(), "className", null);
        setField(term5714, term5714.getClass(), "properties", null);
        setBooleanField(term5714, term5714.getClass(), "nativeType", false);
        setField(term5714, term5714.getClass(), "implicitPrototypeFallback", null);
        setField(term5714, term5714.getClass(), "ownerFunction", null);
        setBooleanField(term5714, term5714.getClass(), "prettyPrint", false);
        setBooleanField(term5714, term5714.getClass(), "visited", false);
        setField(term5714, term5714.getClass(), "docInfo", null);
        setBooleanField(term5714, term5714.getClass(), "unknown", false);
        setBooleanField(term5714, term5714.getClass(), "resolved", false);
        setField(term5714, term5714.getClass(), "resolveResult", null);
        setField(term5714, term5714.getClass(), "registry", null);
        setField(term5689, term5689.getClass(), "prototype", term5714);
        setField(term5720, term5720.getClass(), "name", null);
        setField(term5720, term5720.getClass(), "type", null);
        setBooleanField(term5720, term5720.getClass(), "inferred", false);
        setField(term5689, term5689.getClass(), "prototypeSlot", term5720);
        setField(term5689, term5689.getClass(), "kind", enum87);
        setField(term5689, term5689.getClass(), "typeOfThis", null);
        setField(term5689, term5689.getClass(), "source", null);
        setField(term5689, term5689.getClass(), "implementedInterfaces", null);
        setField(term5689, term5689.getClass(), "extendedInterfaces", null);
        setField(term5689, term5689.getClass(), "subTypes", null);
        setField(term5689, term5689.getClass(), "templateTypeName", null);
        setField(term5689, term5689.getClass(), "className", null);
        setField(term5689, term5689.getClass(), "properties", null);
        setBooleanField(term5689, term5689.getClass(), "nativeType", false);
        setField(term5689, term5689.getClass(), "implicitPrototypeFallback", null);
        setField(term5689, term5689.getClass(), "ownerFunction", null);
        setBooleanField(term5689, term5689.getClass(), "prettyPrint", false);
        setBooleanField(term5689, term5689.getClass(), "visited", false);
        setField(term5689, term5689.getClass(), "docInfo", null);
        setBooleanField(term5689, term5689.getClass(), "unknown", false);
        setBooleanField(term5689, term5689.getClass(), "resolved", false);
        setField(term5689, term5689.getClass(), "resolveResult", null);
        setField(term5689, term5689.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getOwnPropertyNames", argTypes, term5689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


