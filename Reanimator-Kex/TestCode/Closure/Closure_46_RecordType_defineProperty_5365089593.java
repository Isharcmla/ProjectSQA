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
import java.lang.Boolean;

public class RecordType_defineProperty_5365089593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350;
     Object term418;
     Object term420;

    public RecordType_defineProperty_5365089593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term381 = new HashMap();
        term350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term351 = newInstance(Class.forName("java.util.TreeMap"));
        Object term352 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term401 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term351, term351.getClass(), "comparator", null);
        setField(term352, term352.getClass(), "key", "eqJfYWRaEL");
        setField(term352, term352.getClass(), "value", null);
        setField(term352, term352.getClass(), "left", null);
        setField(term352, term352.getClass(), "right", null);
        setField(term352, term352.getClass(), "parent", null);
        setBooleanField(term352, term352.getClass(), "color", true);
        setField(term351, term351.getClass(), "root", term352);
        setIntField(term351, term351.getClass(), "size", 1);
        setIntField(term351, term351.getClass(), "modCount", 1);
        setField(term351, term351.getClass(), "entrySet", null);
        setField(term351, term351.getClass(), "navigableKeySet", null);
        setField(term351, term351.getClass(), "descendingMap", null);
        setField(term351, term351.getClass(), "keySet", null);
        setField(term351, term351.getClass(), "values", null);
        setField(term350, term350.getClass(), "properties", term351);
        setBooleanField(term350, term350.getClass(), "isFrozen", true);
        setField(term350, term350.getClass(), "className", "fhkbdRViHi");
        setField(term350, term350.getClass(), "properties", term381);
        setBooleanField(term350, term350.getClass(), "nativeType", false);
        setField(term350, term350.getClass(), "implicitPrototypeFallback", null);
        setField(term393, term393.getClass(), "call", null);
        setField(term393, term393.getClass(), "prototypeSlot", null);
        setField(term393, term393.getClass(), "kind", null);
        setField(term393, term393.getClass(), "typeOfThis", null);
        setField(term393, term393.getClass(), "source", null);
        setField(term393, term393.getClass(), "implementedInterfaces", null);
        setField(term393, term393.getClass(), "extendedInterfaces", null);
        setField(term393, term393.getClass(), "subTypes", null);
        setField(term393, term393.getClass(), "templateTypeName", null);
        setField(term393, term393.getClass(), "className", null);
        setField(term393, term393.getClass(), "properties", null);
        setBooleanField(term393, term393.getClass(), "nativeType", false);
        setField(term393, term393.getClass(), "implicitPrototypeFallback", null);
        setField(term393, term393.getClass(), "ownerFunction", null);
        setBooleanField(term393, term393.getClass(), "prettyPrint", false);
        setBooleanField(term393, term393.getClass(), "visited", false);
        setField(term393, term393.getClass(), "docInfo", null);
        setBooleanField(term393, term393.getClass(), "unknown", false);
        setBooleanField(term393, term393.getClass(), "resolved", false);
        setField(term393, term393.getClass(), "resolveResult", null);
        setField(term393, term393.getClass(), "registry", null);
        setField(term350, term350.getClass(), "ownerFunction", term393);
        setBooleanField(term350, term350.getClass(), "prettyPrint", false);
        setBooleanField(term350, term350.getClass(), "visited", false);
        setField(term401, term401.getClass(), "info", null);
        setField(term401, term401.getClass(), "documentation", null);
        setField(term401, term401.getClass(), "associatedNode", null);
        setField(term401, term401.getClass(), "visibility", null);
        setIntField(term401, term401.getClass(), "bitset", 0);
        setField(term401, term401.getClass(), "type", null);
        setField(term401, term401.getClass(), "thisType", null);
        setBooleanField(term401, term401.getClass(), "includeDocumentation", false);
        setField(term350, term350.getClass(), "docInfo", term401);
        setBooleanField(term350, term350.getClass(), "unknown", true);
        setBooleanField(term350, term350.getClass(), "resolved", true);
        setField(term350, term350.getClass(), "resolveResult", null);
        setField(term350, term350.getClass(), "registry", null);
        term418 = new Boolean(true);
        term420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term420, term420.getClass(), "type", 304775596);
        setIntField(term422, term422.getClass(), "type", -1347665717);
        setIntField(term424, term424.getClass(), "type", -1888585309);
        setIntField(term426, term426.getClass(), "type", 683666002);
        setIntField(term428, term428.getClass(), "type", 1596213415);
        setField(term428, term428.getClass(), "next", null);
        setField(term428, term428.getClass(), "first", null);
        setField(term428, term428.getClass(), "last", null);
        setField(term428, term428.getClass(), "propListHead", null);
        setIntField(term428, term428.getClass(), "sourcePosition", 0);
        setField(term428, term428.getClass(), "jsType", null);
        setField(term428, term428.getClass(), "parent", null);
        setField(term426, term426.getClass(), "next", term428);
        setIntField(term431, term431.getClass(), "type", -268815336);
        setField(term431, term431.getClass(), "next", null);
        setField(term431, term431.getClass(), "first", null);
        setField(term431, term431.getClass(), "last", term428);
        setField(term431, term431.getClass(), "propListHead", null);
        setIntField(term431, term431.getClass(), "sourcePosition", 0);
        setField(term431, term431.getClass(), "jsType", null);
        setField(term431, term431.getClass(), "parent", null);
        setField(term426, term426.getClass(), "first", term431);
        setField(term426, term426.getClass(), "last", term424);
        setField(term426, term426.getClass(), "propListHead", null);
        setIntField(term426, term426.getClass(), "sourcePosition", 0);
        setField(term426, term426.getClass(), "jsType", null);
        setField(term426, term426.getClass(), "parent", null);
        setField(term424, term424.getClass(), "next", term426);
        setField(term424, term424.getClass(), "first", term428);
        setIntField(term435, term435.getClass(), "type", -663691365);
        setIntField(term437, term437.getClass(), "type", 339854490);
        setField(term437, term437.getClass(), "next", null);
        setField(term437, term437.getClass(), "first", term431);
        setField(term437, term437.getClass(), "last", term426);
        setField(term437, term437.getClass(), "propListHead", null);
        setIntField(term437, term437.getClass(), "sourcePosition", 0);
        setField(term437, term437.getClass(), "jsType", null);
        setField(term437, term437.getClass(), "parent", null);
        setField(term435, term435.getClass(), "next", term437);
        setField(term435, term435.getClass(), "first", term422);
        setField(term435, term435.getClass(), "last", term422);
        setField(term435, term435.getClass(), "propListHead", null);
        setIntField(term435, term435.getClass(), "sourcePosition", 0);
        setField(term435, term435.getClass(), "jsType", null);
        setField(term435, term435.getClass(), "parent", null);
        setField(term424, term424.getClass(), "last", term435);
        setField(term424, term424.getClass(), "propListHead", null);
        setIntField(term424, term424.getClass(), "sourcePosition", 0);
        setField(term424, term424.getClass(), "jsType", null);
        setField(term424, term424.getClass(), "parent", null);
        setField(term422, term422.getClass(), "next", term424);
        setIntField(term442, term442.getClass(), "type", -615654495);
        setField(term442, term442.getClass(), "next", term435);
        setField(term442, term442.getClass(), "first", term437);
        setField(term442, term442.getClass(), "last", term420);
        setField(term442, term442.getClass(), "propListHead", null);
        setIntField(term442, term442.getClass(), "sourcePosition", 0);
        setField(term442, term442.getClass(), "jsType", null);
        setField(term442, term442.getClass(), "parent", null);
        setField(term422, term422.getClass(), "first", term442);
        setField(term422, term422.getClass(), "last", term442);
        setField(term422, term422.getClass(), "propListHead", null);
        setIntField(term422, term422.getClass(), "sourcePosition", 0);
        setField(term422, term422.getClass(), "jsType", null);
        setField(term422, term422.getClass(), "parent", null);
        setField(term420, term420.getClass(), "next", term422);
        setField(term420, term420.getClass(), "first", term426);
        setField(term420, term420.getClass(), "last", term428);
        setField(term420, term420.getClass(), "propListHead", null);
        setIntField(term420, term420.getClass(), "sourcePosition", 0);
        setField(term420, term420.getClass(), "jsType", null);
        setField(term420, term420.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = "TJmVBGfTML";
        args[1] = null;
        args[2] = term418;
        args[3] = term420;
        callMethod(klass, "defineProperty", argTypes, term350, args);
    }

};


