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

public class RecordType_isSubtype_13835430617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705;

    public RecordType_isSubtype_13835430617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term736 = new HashMap();
        term705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term706 = newInstance(Class.forName("java.util.TreeMap"));
        Object term707 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term756 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term706, term706.getClass(), "comparator", null);
        setField(term707, term707.getClass(), "key", "idgaQsnJpQ");
        setField(term707, term707.getClass(), "value", null);
        setField(term707, term707.getClass(), "left", null);
        setField(term707, term707.getClass(), "right", null);
        setField(term707, term707.getClass(), "parent", null);
        setBooleanField(term707, term707.getClass(), "color", true);
        setField(term706, term706.getClass(), "root", term707);
        setIntField(term706, term706.getClass(), "size", 1);
        setIntField(term706, term706.getClass(), "modCount", 1);
        setField(term706, term706.getClass(), "entrySet", null);
        setField(term706, term706.getClass(), "navigableKeySet", null);
        setField(term706, term706.getClass(), "descendingMap", null);
        setField(term706, term706.getClass(), "keySet", null);
        setField(term706, term706.getClass(), "values", null);
        setField(term705, term705.getClass(), "properties", term706);
        setBooleanField(term705, term705.getClass(), "isFrozen", true);
        setField(term705, term705.getClass(), "className", "VgZnGoIFwQ");
        setField(term705, term705.getClass(), "properties", term736);
        setBooleanField(term705, term705.getClass(), "nativeType", true);
        setField(term705, term705.getClass(), "implicitPrototypeFallback", null);
        setField(term748, term748.getClass(), "call", null);
        setField(term748, term748.getClass(), "prototypeSlot", null);
        setField(term748, term748.getClass(), "kind", null);
        setField(term748, term748.getClass(), "typeOfThis", null);
        setField(term748, term748.getClass(), "source", null);
        setField(term748, term748.getClass(), "implementedInterfaces", null);
        setField(term748, term748.getClass(), "extendedInterfaces", null);
        setField(term748, term748.getClass(), "subTypes", null);
        setField(term748, term748.getClass(), "templateTypeName", null);
        setField(term748, term748.getClass(), "className", null);
        setField(term748, term748.getClass(), "properties", null);
        setBooleanField(term748, term748.getClass(), "nativeType", false);
        setField(term748, term748.getClass(), "implicitPrototypeFallback", null);
        setField(term748, term748.getClass(), "ownerFunction", null);
        setBooleanField(term748, term748.getClass(), "prettyPrint", false);
        setBooleanField(term748, term748.getClass(), "visited", false);
        setField(term748, term748.getClass(), "docInfo", null);
        setBooleanField(term748, term748.getClass(), "unknown", false);
        setBooleanField(term748, term748.getClass(), "resolved", false);
        setField(term748, term748.getClass(), "resolveResult", null);
        setField(term748, term748.getClass(), "registry", null);
        setField(term705, term705.getClass(), "ownerFunction", term748);
        setBooleanField(term705, term705.getClass(), "prettyPrint", false);
        setBooleanField(term705, term705.getClass(), "visited", false);
        setField(term756, term756.getClass(), "info", null);
        setField(term756, term756.getClass(), "documentation", null);
        setField(term756, term756.getClass(), "associatedNode", null);
        setField(term756, term756.getClass(), "visibility", null);
        setIntField(term756, term756.getClass(), "bitset", 0);
        setField(term756, term756.getClass(), "type", null);
        setField(term756, term756.getClass(), "thisType", null);
        setBooleanField(term756, term756.getClass(), "includeDocumentation", false);
        setField(term705, term705.getClass(), "docInfo", term756);
        setBooleanField(term705, term705.getClass(), "unknown", true);
        setBooleanField(term705, term705.getClass(), "resolved", false);
        setField(term705, term705.getClass(), "resolveResult", null);
        setField(term705, term705.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isSubtype", argTypes, term705, args);
    }

};


