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

public class RecordType_getLeastSupertype_11363099834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;

    public RecordType_getLeastSupertype_11363099834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term508 = new HashMap();
        term477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term478 = newInstance(Class.forName("java.util.TreeMap"));
        Object term479 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term528 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term478, term478.getClass(), "comparator", null);
        setField(term479, term479.getClass(), "key", "tPlsykYBqO");
        setField(term479, term479.getClass(), "value", null);
        setField(term479, term479.getClass(), "left", null);
        setField(term479, term479.getClass(), "right", null);
        setField(term479, term479.getClass(), "parent", null);
        setBooleanField(term479, term479.getClass(), "color", true);
        setField(term478, term478.getClass(), "root", term479);
        setIntField(term478, term478.getClass(), "size", 1);
        setIntField(term478, term478.getClass(), "modCount", 1);
        setField(term478, term478.getClass(), "entrySet", null);
        setField(term478, term478.getClass(), "navigableKeySet", null);
        setField(term478, term478.getClass(), "descendingMap", null);
        setField(term478, term478.getClass(), "keySet", null);
        setField(term478, term478.getClass(), "values", null);
        setField(term477, term477.getClass(), "properties", term478);
        setBooleanField(term477, term477.getClass(), "isFrozen", true);
        setField(term477, term477.getClass(), "className", "bLPjGVBhlX");
        setField(term477, term477.getClass(), "properties", term508);
        setBooleanField(term477, term477.getClass(), "nativeType", true);
        setField(term477, term477.getClass(), "implicitPrototypeFallback", null);
        setField(term520, term520.getClass(), "call", null);
        setField(term520, term520.getClass(), "prototypeSlot", null);
        setField(term520, term520.getClass(), "kind", null);
        setField(term520, term520.getClass(), "typeOfThis", null);
        setField(term520, term520.getClass(), "source", null);
        setField(term520, term520.getClass(), "implementedInterfaces", null);
        setField(term520, term520.getClass(), "extendedInterfaces", null);
        setField(term520, term520.getClass(), "subTypes", null);
        setField(term520, term520.getClass(), "templateTypeName", null);
        setField(term520, term520.getClass(), "className", null);
        setField(term520, term520.getClass(), "properties", null);
        setBooleanField(term520, term520.getClass(), "nativeType", false);
        setField(term520, term520.getClass(), "implicitPrototypeFallback", null);
        setField(term520, term520.getClass(), "ownerFunction", null);
        setBooleanField(term520, term520.getClass(), "prettyPrint", false);
        setBooleanField(term520, term520.getClass(), "visited", false);
        setField(term520, term520.getClass(), "docInfo", null);
        setBooleanField(term520, term520.getClass(), "unknown", false);
        setBooleanField(term520, term520.getClass(), "resolved", false);
        setField(term520, term520.getClass(), "resolveResult", null);
        setField(term520, term520.getClass(), "registry", null);
        setField(term477, term477.getClass(), "ownerFunction", term520);
        setBooleanField(term477, term477.getClass(), "prettyPrint", false);
        setBooleanField(term477, term477.getClass(), "visited", true);
        setField(term528, term528.getClass(), "info", null);
        setField(term528, term528.getClass(), "documentation", null);
        setField(term528, term528.getClass(), "associatedNode", null);
        setField(term528, term528.getClass(), "visibility", null);
        setIntField(term528, term528.getClass(), "bitset", 0);
        setField(term528, term528.getClass(), "type", null);
        setField(term528, term528.getClass(), "thisType", null);
        setBooleanField(term528, term528.getClass(), "includeDocumentation", false);
        setField(term477, term477.getClass(), "docInfo", term528);
        setBooleanField(term477, term477.getClass(), "unknown", true);
        setBooleanField(term477, term477.getClass(), "resolved", true);
        setField(term477, term477.getClass(), "resolveResult", null);
        setField(term477, term477.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getLeastSupertype", argTypes, term477, args);
    }

};


