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
import java.lang.Object;
import java.util.HashMap;

public class RecordType_getImplicitPrototype_7518061002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public RecordType_getImplicitPrototype_7518061002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term305 = new HashMap();
        term274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term275 = newInstance(Class.forName("java.util.TreeMap"));
        Object term276 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term325 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term275, term275.getClass(), "comparator", null);
        setField(term276, term276.getClass(), "key", "nHXjMycHlU");
        setField(term276, term276.getClass(), "value", null);
        setField(term276, term276.getClass(), "left", null);
        setField(term276, term276.getClass(), "right", null);
        setField(term276, term276.getClass(), "parent", null);
        setBooleanField(term276, term276.getClass(), "color", true);
        setField(term275, term275.getClass(), "root", term276);
        setIntField(term275, term275.getClass(), "size", 1);
        setIntField(term275, term275.getClass(), "modCount", 1);
        setField(term275, term275.getClass(), "entrySet", null);
        setField(term275, term275.getClass(), "navigableKeySet", null);
        setField(term275, term275.getClass(), "descendingMap", null);
        setField(term275, term275.getClass(), "keySet", null);
        setField(term275, term275.getClass(), "values", null);
        setField(term274, term274.getClass(), "properties", term275);
        setBooleanField(term274, term274.getClass(), "isFrozen", true);
        setField(term274, term274.getClass(), "className", "ieCtQFdkii");
        setField(term274, term274.getClass(), "properties", term305);
        setBooleanField(term274, term274.getClass(), "nativeType", false);
        setField(term274, term274.getClass(), "implicitPrototypeFallback", null);
        setField(term317, term317.getClass(), "call", null);
        setField(term317, term317.getClass(), "prototypeSlot", null);
        setField(term317, term317.getClass(), "kind", null);
        setField(term317, term317.getClass(), "typeOfThis", null);
        setField(term317, term317.getClass(), "source", null);
        setField(term317, term317.getClass(), "implementedInterfaces", null);
        setField(term317, term317.getClass(), "extendedInterfaces", null);
        setField(term317, term317.getClass(), "subTypes", null);
        setField(term317, term317.getClass(), "templateTypeName", null);
        setField(term317, term317.getClass(), "className", null);
        setField(term317, term317.getClass(), "properties", null);
        setBooleanField(term317, term317.getClass(), "nativeType", false);
        setField(term317, term317.getClass(), "implicitPrototypeFallback", null);
        setField(term317, term317.getClass(), "ownerFunction", null);
        setBooleanField(term317, term317.getClass(), "prettyPrint", false);
        setBooleanField(term317, term317.getClass(), "visited", false);
        setField(term317, term317.getClass(), "docInfo", null);
        setBooleanField(term317, term317.getClass(), "unknown", false);
        setBooleanField(term317, term317.getClass(), "resolved", false);
        setField(term317, term317.getClass(), "resolveResult", null);
        setField(term317, term317.getClass(), "registry", null);
        setField(term274, term274.getClass(), "ownerFunction", term317);
        setBooleanField(term274, term274.getClass(), "prettyPrint", false);
        setBooleanField(term274, term274.getClass(), "visited", true);
        setField(term325, term325.getClass(), "info", null);
        setField(term325, term325.getClass(), "documentation", null);
        setField(term325, term325.getClass(), "associatedNode", null);
        setField(term325, term325.getClass(), "visibility", null);
        setIntField(term325, term325.getClass(), "bitset", 0);
        setField(term325, term325.getClass(), "type", null);
        setField(term325, term325.getClass(), "thisType", null);
        setBooleanField(term325, term325.getClass(), "includeDocumentation", false);
        setField(term274, term274.getClass(), "docInfo", term325);
        setBooleanField(term274, term274.getClass(), "unknown", true);
        setBooleanField(term274, term274.getClass(), "resolved", true);
        setField(term274, term274.getClass(), "resolveResult", null);
        setField(term274, term274.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImplicitPrototype", argTypes, term274, args);
    }

};


