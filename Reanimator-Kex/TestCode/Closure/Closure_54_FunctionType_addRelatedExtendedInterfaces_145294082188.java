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

public class FunctionType_addRelatedExtendedInterfaces_145294082188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8876;
     Object term8929;

    public FunctionType_addRelatedExtendedInterfaces_145294082188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39316 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term39315 = ((Class) term39316).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term39315).setAccessible(true);
        Object enum102 = ((Field) term39315).get((Object) null);
        term8876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term8878, term8878.getClass(), "type", 842904495);
        setIntField(term8880, term8880.getClass(), "type", -282881827);
        setIntField(term8882, term8882.getClass(), "type", 0);
        setField(term8882, term8882.getClass(), "next", null);
        setField(term8882, term8882.getClass(), "first", null);
        setField(term8882, term8882.getClass(), "last", null);
        setField(term8882, term8882.getClass(), "propListHead", null);
        setIntField(term8882, term8882.getClass(), "sourcePosition", 0);
        setField(term8882, term8882.getClass(), "jsType", null);
        setField(term8882, term8882.getClass(), "parent", null);
        setField(term8880, term8880.getClass(), "next", term8882);
        setIntField(term8885, term8885.getClass(), "type", 0);
        setField(term8885, term8885.getClass(), "next", null);
        setField(term8885, term8885.getClass(), "first", null);
        setField(term8885, term8885.getClass(), "last", null);
        setField(term8885, term8885.getClass(), "propListHead", null);
        setIntField(term8885, term8885.getClass(), "sourcePosition", 0);
        setField(term8885, term8885.getClass(), "jsType", null);
        setField(term8885, term8885.getClass(), "parent", null);
        setField(term8880, term8880.getClass(), "first", term8885);
        setIntField(term8888, term8888.getClass(), "type", 0);
        setField(term8888, term8888.getClass(), "next", null);
        setField(term8888, term8888.getClass(), "first", null);
        setField(term8888, term8888.getClass(), "last", null);
        setField(term8888, term8888.getClass(), "propListHead", null);
        setIntField(term8888, term8888.getClass(), "sourcePosition", 0);
        setField(term8888, term8888.getClass(), "jsType", null);
        setField(term8888, term8888.getClass(), "parent", null);
        setField(term8880, term8880.getClass(), "last", term8888);
        setField(term8880, term8880.getClass(), "propListHead", null);
        setIntField(term8880, term8880.getClass(), "sourcePosition", 0);
        setField(term8880, term8880.getClass(), "jsType", null);
        setField(term8880, term8880.getClass(), "parent", null);
        setField(term8878, term8878.getClass(), "next", term8880);
        setIntField(term8892, term8892.getClass(), "type", 0);
        setField(term8892, term8892.getClass(), "next", null);
        setField(term8892, term8892.getClass(), "first", null);
        setField(term8892, term8892.getClass(), "last", null);
        setField(term8892, term8892.getClass(), "propListHead", null);
        setIntField(term8892, term8892.getClass(), "sourcePosition", 0);
        setField(term8892, term8892.getClass(), "jsType", null);
        setField(term8892, term8892.getClass(), "parent", null);
        setField(term8878, term8878.getClass(), "first", term8892);
        setIntField(term8895, term8895.getClass(), "type", 0);
        setField(term8895, term8895.getClass(), "next", null);
        setField(term8895, term8895.getClass(), "first", null);
        setField(term8895, term8895.getClass(), "last", null);
        setField(term8895, term8895.getClass(), "propListHead", null);
        setIntField(term8895, term8895.getClass(), "sourcePosition", 0);
        setField(term8895, term8895.getClass(), "jsType", null);
        setField(term8895, term8895.getClass(), "parent", null);
        setField(term8878, term8878.getClass(), "last", term8895);
        setField(term8878, term8878.getClass(), "propListHead", null);
        setIntField(term8878, term8878.getClass(), "sourcePosition", 0);
        setField(term8878, term8878.getClass(), "jsType", null);
        setField(term8878, term8878.getClass(), "parent", null);
        setField(term8877, term8877.getClass(), "parameters", term8878);
        setField(term8877, term8877.getClass(), "returnType", null);
        setBooleanField(term8877, term8877.getClass(), "returnTypeInferred", false);
        setBooleanField(term8877, term8877.getClass(), "resolved", false);
        setField(term8877, term8877.getClass(), "resolveResult", null);
        setField(term8877, term8877.getClass(), "registry", null);
        setField(term8876, term8876.getClass(), "call", term8877);
        setField(term8901, term8901.getClass(), "className", null);
        setField(term8901, term8901.getClass(), "properties", null);
        setBooleanField(term8901, term8901.getClass(), "nativeType", false);
        setField(term8901, term8901.getClass(), "implicitPrototypeFallback", null);
        setField(term8901, term8901.getClass(), "ownerFunction", null);
        setBooleanField(term8901, term8901.getClass(), "prettyPrint", false);
        setBooleanField(term8901, term8901.getClass(), "visited", false);
        setField(term8901, term8901.getClass(), "docInfo", null);
        setBooleanField(term8901, term8901.getClass(), "unknown", false);
        setBooleanField(term8901, term8901.getClass(), "resolved", false);
        setField(term8901, term8901.getClass(), "resolveResult", null);
        setField(term8901, term8901.getClass(), "registry", null);
        setField(term8876, term8876.getClass(), "prototype", term8901);
        setField(term8907, term8907.getClass(), "name", null);
        setField(term8907, term8907.getClass(), "type", null);
        setBooleanField(term8907, term8907.getClass(), "inferred", false);
        setField(term8876, term8876.getClass(), "prototypeSlot", term8907);
        setField(term8876, term8876.getClass(), "kind", enum102);
        setField(term8876, term8876.getClass(), "typeOfThis", null);
        setField(term8876, term8876.getClass(), "source", null);
        setField(term8876, term8876.getClass(), "implementedInterfaces", null);
        setField(term8876, term8876.getClass(), "extendedInterfaces", null);
        setField(term8876, term8876.getClass(), "subTypes", null);
        setField(term8876, term8876.getClass(), "templateTypeName", null);
        setField(term8876, term8876.getClass(), "className", null);
        setField(term8876, term8876.getClass(), "properties", null);
        setBooleanField(term8876, term8876.getClass(), "nativeType", false);
        setField(term8876, term8876.getClass(), "implicitPrototypeFallback", null);
        setField(term8876, term8876.getClass(), "ownerFunction", null);
        setBooleanField(term8876, term8876.getClass(), "prettyPrint", false);
        setBooleanField(term8876, term8876.getClass(), "visited", false);
        setField(term8876, term8876.getClass(), "docInfo", null);
        setBooleanField(term8876, term8876.getClass(), "unknown", false);
        setBooleanField(term8876, term8876.getClass(), "resolved", false);
        setField(term8876, term8876.getClass(), "resolveResult", null);
        setField(term8876, term8876.getClass(), "registry", null);
        HashMap term8930 = new HashMap();
        Set<Object> term39615 =  ((Map) term8930).keySet();
        term8929 = new HashSet((Collection<? extends Object>) term39615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8929;
        try {
            callMethod(klass, "addRelatedExtendedInterfaces", argTypes, term8876, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


