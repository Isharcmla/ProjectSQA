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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_addRelatedInterfaces_78495442875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8823;
     Object term8877;

    public FunctionType_addRelatedInterfaces_78495442875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37353 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term37352 = ((Class) term37353).getDeclaredField((String) "ORDINARY");
        ((Field) term37352).setAccessible(true);
        Object enum99 = ((Field) term37352).get((Object) null);
        term8823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8838 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8848 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term8825, term8825.getClass(), "type", -1122880881);
        setIntField(term8827, term8827.getClass(), "type", -1692331299);
        setIntField(term8829, term8829.getClass(), "type", 0);
        setField(term8829, term8829.getClass(), "next", null);
        setField(term8829, term8829.getClass(), "first", null);
        setField(term8829, term8829.getClass(), "last", null);
        setField(term8829, term8829.getClass(), "propListHead", null);
        setIntField(term8829, term8829.getClass(), "sourcePosition", 0);
        setField(term8829, term8829.getClass(), "jsType", null);
        setField(term8829, term8829.getClass(), "parent", null);
        setField(term8827, term8827.getClass(), "next", term8829);
        setIntField(term8832, term8832.getClass(), "type", 0);
        setField(term8832, term8832.getClass(), "next", null);
        setField(term8832, term8832.getClass(), "first", null);
        setField(term8832, term8832.getClass(), "last", null);
        setField(term8832, term8832.getClass(), "propListHead", null);
        setIntField(term8832, term8832.getClass(), "sourcePosition", 0);
        setField(term8832, term8832.getClass(), "jsType", null);
        setField(term8832, term8832.getClass(), "parent", null);
        setField(term8827, term8827.getClass(), "first", term8832);
        setIntField(term8835, term8835.getClass(), "type", 0);
        setField(term8835, term8835.getClass(), "next", null);
        setField(term8835, term8835.getClass(), "first", null);
        setField(term8835, term8835.getClass(), "last", null);
        setField(term8835, term8835.getClass(), "propListHead", null);
        setIntField(term8835, term8835.getClass(), "sourcePosition", 0);
        setField(term8835, term8835.getClass(), "jsType", null);
        setField(term8835, term8835.getClass(), "parent", null);
        setField(term8827, term8827.getClass(), "last", term8835);
        setField(term8838, term8838.getClass(), "next", null);
        setIntField(term8838, term8838.getClass(), "type", 0);
        setIntField(term8838, term8838.getClass(), "intValue", 0);
        setField(term8838, term8838.getClass(), "objectValue", null);
        setField(term8827, term8827.getClass(), "propListHead", term8838);
        setIntField(term8827, term8827.getClass(), "sourcePosition", 479531250);
        setField(term8827, term8827.getClass(), "jsType", null);
        setField(term8827, term8827.getClass(), "parent", null);
        setField(term8825, term8825.getClass(), "next", term8827);
        setIntField(term8842, term8842.getClass(), "type", 0);
        setField(term8842, term8842.getClass(), "next", null);
        setField(term8842, term8842.getClass(), "first", null);
        setField(term8842, term8842.getClass(), "last", null);
        setField(term8842, term8842.getClass(), "propListHead", null);
        setIntField(term8842, term8842.getClass(), "sourcePosition", 0);
        setField(term8842, term8842.getClass(), "jsType", null);
        setField(term8842, term8842.getClass(), "parent", null);
        setField(term8825, term8825.getClass(), "first", term8842);
        setIntField(term8845, term8845.getClass(), "type", 0);
        setField(term8845, term8845.getClass(), "next", null);
        setField(term8845, term8845.getClass(), "first", null);
        setField(term8845, term8845.getClass(), "last", null);
        setField(term8845, term8845.getClass(), "propListHead", null);
        setIntField(term8845, term8845.getClass(), "sourcePosition", 0);
        setField(term8845, term8845.getClass(), "jsType", null);
        setField(term8845, term8845.getClass(), "parent", null);
        setField(term8825, term8825.getClass(), "last", term8845);
        setField(term8848, term8848.getClass(), "next", null);
        setIntField(term8848, term8848.getClass(), "type", 0);
        setIntField(term8848, term8848.getClass(), "intValue", 0);
        setField(term8848, term8848.getClass(), "objectValue", null);
        setField(term8825, term8825.getClass(), "propListHead", term8848);
        setIntField(term8825, term8825.getClass(), "sourcePosition", 1320570890);
        setField(term8825, term8825.getClass(), "jsType", null);
        setField(term8825, term8825.getClass(), "parent", null);
        setField(term8824, term8824.getClass(), "parameters", term8825);
        setField(term8824, term8824.getClass(), "returnType", null);
        setBooleanField(term8824, term8824.getClass(), "returnTypeInferred", false);
        setBooleanField(term8824, term8824.getClass(), "resolved", false);
        setField(term8824, term8824.getClass(), "resolveResult", null);
        setField(term8824, term8824.getClass(), "registry", null);
        setField(term8823, term8823.getClass(), "call", term8824);
        setField(term8854, term8854.getClass(), "ownerFunction", null);
        setField(term8854, term8854.getClass(), "className", null);
        setField(term8854, term8854.getClass(), "properties", null);
        setField(term8854, term8854.getClass(), "implicitPrototype", null);
        setBooleanField(term8854, term8854.getClass(), "nativeType", false);
        setBooleanField(term8854, term8854.getClass(), "prettyPrint", false);
        setBooleanField(term8854, term8854.getClass(), "visited", false);
        setField(term8854, term8854.getClass(), "docInfo", null);
        setBooleanField(term8854, term8854.getClass(), "unknown", false);
        setBooleanField(term8854, term8854.getClass(), "resolved", false);
        setField(term8854, term8854.getClass(), "resolveResult", null);
        setField(term8854, term8854.getClass(), "registry", null);
        setField(term8823, term8823.getClass(), "prototype", term8854);
        setField(term8823, term8823.getClass(), "kind", enum99);
        setField(term8823, term8823.getClass(), "typeOfThis", null);
        setField(term8823, term8823.getClass(), "source", null);
        setField(term8823, term8823.getClass(), "implementedInterfaces", null);
        setField(term8823, term8823.getClass(), "subTypes", null);
        setField(term8823, term8823.getClass(), "templateTypeName", null);
        setField(term8823, term8823.getClass(), "className", null);
        setField(term8823, term8823.getClass(), "properties", null);
        setField(term8823, term8823.getClass(), "implicitPrototype", null);
        setBooleanField(term8823, term8823.getClass(), "nativeType", false);
        setBooleanField(term8823, term8823.getClass(), "prettyPrint", false);
        setBooleanField(term8823, term8823.getClass(), "visited", false);
        setField(term8823, term8823.getClass(), "docInfo", null);
        setBooleanField(term8823, term8823.getClass(), "unknown", false);
        setBooleanField(term8823, term8823.getClass(), "resolved", false);
        setField(term8823, term8823.getClass(), "resolveResult", null);
        setField(term8823, term8823.getClass(), "registry", null);
        HashMap term8878 = new HashMap();
        Set<Object> term37643 =  ((Map) term8878).keySet();
        term8877 = new HashSet((Collection<? extends Object>) term37643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8877;
        try {
            callMethod(klass, "addRelatedInterfaces", argTypes, term8823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


