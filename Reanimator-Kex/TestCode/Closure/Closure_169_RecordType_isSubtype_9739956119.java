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

public class RecordType_isSubtype_9739956119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049;

    public RecordType_isSubtype_9739956119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1081 = new HashMap();
        term1049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1050 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1051 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1102 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1050, term1050.getClass(), "comparator", null);
        setField(term1051, term1051.getClass(), "key", "PznxWXsZME");
        setField(term1051, term1051.getClass(), "value", null);
        setField(term1051, term1051.getClass(), "left", null);
        setField(term1051, term1051.getClass(), "right", null);
        setField(term1051, term1051.getClass(), "parent", null);
        setBooleanField(term1051, term1051.getClass(), "color", true);
        setField(term1050, term1050.getClass(), "root", term1051);
        setIntField(term1050, term1050.getClass(), "size", 1);
        setIntField(term1050, term1050.getClass(), "modCount", 1);
        setField(term1050, term1050.getClass(), "entrySet", null);
        setField(term1050, term1050.getClass(), "navigableKeySet", null);
        setField(term1050, term1050.getClass(), "descendingMap", null);
        setField(term1050, term1050.getClass(), "keySet", null);
        setField(term1050, term1050.getClass(), "values", null);
        setField(term1049, term1049.getClass(), "properties", term1050);
        setBooleanField(term1049, term1049.getClass(), "declared", false);
        setBooleanField(term1049, term1049.getClass(), "isFrozen", true);
        setField(term1049, term1049.getClass(), "className", "ZzIujlwVsw");
        setField(term1049, term1049.getClass(), "properties", term1081);
        setBooleanField(term1049, term1049.getClass(), "nativeType", false);
        setField(term1049, term1049.getClass(), "implicitPrototypeFallback", null);
        setField(term1093, term1093.getClass(), "call", null);
        setField(term1093, term1093.getClass(), "prototypeSlot", null);
        setField(term1093, term1093.getClass(), "kind", null);
        setField(term1093, term1093.getClass(), "propAccess", null);
        setField(term1093, term1093.getClass(), "typeOfThis", null);
        setField(term1093, term1093.getClass(), "source", null);
        setField(term1093, term1093.getClass(), "implementedInterfaces", null);
        setField(term1093, term1093.getClass(), "extendedInterfaces", null);
        setField(term1093, term1093.getClass(), "subTypes", null);
        setField(term1093, term1093.getClass(), "templateTypeNames", null);
        setField(term1093, term1093.getClass(), "className", null);
        setField(term1093, term1093.getClass(), "properties", null);
        setBooleanField(term1093, term1093.getClass(), "nativeType", false);
        setField(term1093, term1093.getClass(), "implicitPrototypeFallback", null);
        setField(term1093, term1093.getClass(), "ownerFunction", null);
        setBooleanField(term1093, term1093.getClass(), "prettyPrint", false);
        setBooleanField(term1093, term1093.getClass(), "visited", false);
        setField(term1093, term1093.getClass(), "docInfo", null);
        setBooleanField(term1093, term1093.getClass(), "unknown", false);
        setBooleanField(term1093, term1093.getClass(), "resolved", false);
        setField(term1093, term1093.getClass(), "resolveResult", null);
        setBooleanField(term1093, term1093.getClass(), "inTemplatedCheckVisit", false);
        setField(term1093, term1093.getClass(), "registry", null);
        setField(term1049, term1049.getClass(), "ownerFunction", term1093);
        setBooleanField(term1049, term1049.getClass(), "prettyPrint", true);
        setBooleanField(term1049, term1049.getClass(), "visited", true);
        setField(term1102, term1102.getClass(), "info", null);
        setField(term1102, term1102.getClass(), "documentation", null);
        setField(term1102, term1102.getClass(), "associatedNode", null);
        setField(term1102, term1102.getClass(), "visibility", null);
        setIntField(term1102, term1102.getClass(), "bitset", 0);
        setField(term1102, term1102.getClass(), "type", null);
        setField(term1102, term1102.getClass(), "thisType", null);
        setBooleanField(term1102, term1102.getClass(), "includeDocumentation", false);
        setField(term1049, term1049.getClass(), "docInfo", term1102);
        setBooleanField(term1049, term1049.getClass(), "unknown", true);
        setBooleanField(term1049, term1049.getClass(), "resolved", true);
        setField(term1049, term1049.getClass(), "resolveResult", null);
        setBooleanField(term1049, term1049.getClass(), "inTemplatedCheckVisit", false);
        setField(term1049, term1049.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1049;
        callMethod(klass, "isSubtype", argTypes, null, args);
    }

};


