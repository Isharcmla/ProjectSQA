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

public class RecordType_resolveInternal_72326652310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1128;

    public RecordType_resolveInternal_72326652310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1160 = new HashMap();
        term1128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1129 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1130 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1181 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1129, term1129.getClass(), "comparator", null);
        setField(term1130, term1130.getClass(), "key", "mvrkADEgpp");
        setField(term1130, term1130.getClass(), "value", null);
        setField(term1130, term1130.getClass(), "left", null);
        setField(term1130, term1130.getClass(), "right", null);
        setField(term1130, term1130.getClass(), "parent", null);
        setBooleanField(term1130, term1130.getClass(), "color", true);
        setField(term1129, term1129.getClass(), "root", term1130);
        setIntField(term1129, term1129.getClass(), "size", 1);
        setIntField(term1129, term1129.getClass(), "modCount", 1);
        setField(term1129, term1129.getClass(), "entrySet", null);
        setField(term1129, term1129.getClass(), "navigableKeySet", null);
        setField(term1129, term1129.getClass(), "descendingMap", null);
        setField(term1129, term1129.getClass(), "keySet", null);
        setField(term1129, term1129.getClass(), "values", null);
        setField(term1128, term1128.getClass(), "properties", term1129);
        setBooleanField(term1128, term1128.getClass(), "declared", true);
        setBooleanField(term1128, term1128.getClass(), "isFrozen", false);
        setField(term1128, term1128.getClass(), "className", "pXOkjyeIRb");
        setField(term1128, term1128.getClass(), "properties", term1160);
        setBooleanField(term1128, term1128.getClass(), "nativeType", true);
        setField(term1128, term1128.getClass(), "implicitPrototypeFallback", null);
        setField(term1172, term1172.getClass(), "call", null);
        setField(term1172, term1172.getClass(), "prototypeSlot", null);
        setField(term1172, term1172.getClass(), "kind", null);
        setField(term1172, term1172.getClass(), "propAccess", null);
        setField(term1172, term1172.getClass(), "typeOfThis", null);
        setField(term1172, term1172.getClass(), "source", null);
        setField(term1172, term1172.getClass(), "implementedInterfaces", null);
        setField(term1172, term1172.getClass(), "extendedInterfaces", null);
        setField(term1172, term1172.getClass(), "subTypes", null);
        setField(term1172, term1172.getClass(), "templateTypeNames", null);
        setField(term1172, term1172.getClass(), "className", null);
        setField(term1172, term1172.getClass(), "properties", null);
        setBooleanField(term1172, term1172.getClass(), "nativeType", false);
        setField(term1172, term1172.getClass(), "implicitPrototypeFallback", null);
        setField(term1172, term1172.getClass(), "ownerFunction", null);
        setBooleanField(term1172, term1172.getClass(), "prettyPrint", false);
        setBooleanField(term1172, term1172.getClass(), "visited", false);
        setField(term1172, term1172.getClass(), "docInfo", null);
        setBooleanField(term1172, term1172.getClass(), "unknown", false);
        setBooleanField(term1172, term1172.getClass(), "resolved", false);
        setField(term1172, term1172.getClass(), "resolveResult", null);
        setBooleanField(term1172, term1172.getClass(), "inTemplatedCheckVisit", false);
        setField(term1172, term1172.getClass(), "registry", null);
        setField(term1128, term1128.getClass(), "ownerFunction", term1172);
        setBooleanField(term1128, term1128.getClass(), "prettyPrint", true);
        setBooleanField(term1128, term1128.getClass(), "visited", true);
        setField(term1181, term1181.getClass(), "info", null);
        setField(term1181, term1181.getClass(), "documentation", null);
        setField(term1181, term1181.getClass(), "associatedNode", null);
        setField(term1181, term1181.getClass(), "visibility", null);
        setIntField(term1181, term1181.getClass(), "bitset", 0);
        setField(term1181, term1181.getClass(), "type", null);
        setField(term1181, term1181.getClass(), "thisType", null);
        setBooleanField(term1181, term1181.getClass(), "includeDocumentation", false);
        setField(term1128, term1128.getClass(), "docInfo", term1181);
        setBooleanField(term1128, term1128.getClass(), "unknown", false);
        setBooleanField(term1128, term1128.getClass(), "resolved", true);
        setField(term1128, term1128.getClass(), "resolveResult", null);
        setBooleanField(term1128, term1128.getClass(), "inTemplatedCheckVisit", false);
        setField(term1128, term1128.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "resolveInternal", argTypes, term1128, args);
    }

};


