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

public class RecordType_checkRecordEquivalenceHelper_193491523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;
     Object term502;
     Object term561;

    public RecordType_checkRecordEquivalenceHelper_193491523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term475 = new HashMap();
        term443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term444 = newInstance(Class.forName("java.util.TreeMap"));
        Object term445 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term496 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term444, term444.getClass(), "comparator", null);
        setField(term445, term445.getClass(), "key", "fztQhjqwdP");
        setField(term445, term445.getClass(), "value", null);
        setField(term445, term445.getClass(), "left", null);
        setField(term445, term445.getClass(), "right", null);
        setField(term445, term445.getClass(), "parent", null);
        setBooleanField(term445, term445.getClass(), "color", true);
        setField(term444, term444.getClass(), "root", term445);
        setIntField(term444, term444.getClass(), "size", 1);
        setIntField(term444, term444.getClass(), "modCount", 1);
        setField(term444, term444.getClass(), "entrySet", null);
        setField(term444, term444.getClass(), "navigableKeySet", null);
        setField(term444, term444.getClass(), "descendingMap", null);
        setField(term444, term444.getClass(), "keySet", null);
        setField(term444, term444.getClass(), "values", null);
        setField(term443, term443.getClass(), "properties", term444);
        setBooleanField(term443, term443.getClass(), "declared", false);
        setBooleanField(term443, term443.getClass(), "isFrozen", true);
        setField(term443, term443.getClass(), "className", "eVpkWxjuki");
        setField(term443, term443.getClass(), "properties", term475);
        setBooleanField(term443, term443.getClass(), "nativeType", true);
        setField(term443, term443.getClass(), "implicitPrototypeFallback", null);
        setField(term487, term487.getClass(), "call", null);
        setField(term487, term487.getClass(), "prototypeSlot", null);
        setField(term487, term487.getClass(), "kind", null);
        setField(term487, term487.getClass(), "propAccess", null);
        setField(term487, term487.getClass(), "typeOfThis", null);
        setField(term487, term487.getClass(), "source", null);
        setField(term487, term487.getClass(), "implementedInterfaces", null);
        setField(term487, term487.getClass(), "extendedInterfaces", null);
        setField(term487, term487.getClass(), "subTypes", null);
        setField(term487, term487.getClass(), "templateTypeNames", null);
        setField(term487, term487.getClass(), "className", null);
        setField(term487, term487.getClass(), "properties", null);
        setBooleanField(term487, term487.getClass(), "nativeType", false);
        setField(term487, term487.getClass(), "implicitPrototypeFallback", null);
        setField(term487, term487.getClass(), "ownerFunction", null);
        setBooleanField(term487, term487.getClass(), "prettyPrint", false);
        setBooleanField(term487, term487.getClass(), "visited", false);
        setField(term487, term487.getClass(), "docInfo", null);
        setBooleanField(term487, term487.getClass(), "unknown", false);
        setBooleanField(term487, term487.getClass(), "resolved", false);
        setField(term487, term487.getClass(), "resolveResult", null);
        setBooleanField(term487, term487.getClass(), "inTemplatedCheckVisit", false);
        setField(term487, term487.getClass(), "registry", null);
        setField(term443, term443.getClass(), "ownerFunction", term487);
        setBooleanField(term443, term443.getClass(), "prettyPrint", true);
        setBooleanField(term443, term443.getClass(), "visited", true);
        setField(term496, term496.getClass(), "info", null);
        setField(term496, term496.getClass(), "documentation", null);
        setField(term496, term496.getClass(), "associatedNode", null);
        setField(term496, term496.getClass(), "visibility", null);
        setIntField(term496, term496.getClass(), "bitset", 0);
        setField(term496, term496.getClass(), "type", null);
        setField(term496, term496.getClass(), "thisType", null);
        setBooleanField(term496, term496.getClass(), "includeDocumentation", false);
        setField(term443, term443.getClass(), "docInfo", term496);
        setBooleanField(term443, term443.getClass(), "unknown", true);
        setBooleanField(term443, term443.getClass(), "resolved", false);
        setField(term443, term443.getClass(), "resolveResult", null);
        setBooleanField(term443, term443.getClass(), "inTemplatedCheckVisit", false);
        setField(term443, term443.getClass(), "registry", null);
        HashMap term534 = new HashMap();
        term502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term503 = newInstance(Class.forName("java.util.TreeMap"));
        Object term504 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term555 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term503, term503.getClass(), "comparator", null);
        setField(term504, term504.getClass(), "key", "RYdKCNNMBR");
        setField(term504, term504.getClass(), "value", null);
        setField(term504, term504.getClass(), "left", null);
        setField(term504, term504.getClass(), "right", null);
        setField(term504, term504.getClass(), "parent", null);
        setBooleanField(term504, term504.getClass(), "color", true);
        setField(term503, term503.getClass(), "root", term504);
        setIntField(term503, term503.getClass(), "size", 1);
        setIntField(term503, term503.getClass(), "modCount", 1);
        setField(term503, term503.getClass(), "entrySet", null);
        setField(term503, term503.getClass(), "navigableKeySet", null);
        setField(term503, term503.getClass(), "descendingMap", null);
        setField(term503, term503.getClass(), "keySet", null);
        setField(term503, term503.getClass(), "values", null);
        setField(term502, term502.getClass(), "properties", term503);
        setBooleanField(term502, term502.getClass(), "declared", true);
        setBooleanField(term502, term502.getClass(), "isFrozen", true);
        setField(term502, term502.getClass(), "className", "yGtHPyvYiQ");
        setField(term502, term502.getClass(), "properties", term534);
        setBooleanField(term502, term502.getClass(), "nativeType", true);
        setField(term502, term502.getClass(), "implicitPrototypeFallback", null);
        setField(term546, term546.getClass(), "call", null);
        setField(term546, term546.getClass(), "prototypeSlot", null);
        setField(term546, term546.getClass(), "kind", null);
        setField(term546, term546.getClass(), "propAccess", null);
        setField(term546, term546.getClass(), "typeOfThis", null);
        setField(term546, term546.getClass(), "source", null);
        setField(term546, term546.getClass(), "implementedInterfaces", null);
        setField(term546, term546.getClass(), "extendedInterfaces", null);
        setField(term546, term546.getClass(), "subTypes", null);
        setField(term546, term546.getClass(), "templateTypeNames", null);
        setField(term546, term546.getClass(), "className", null);
        setField(term546, term546.getClass(), "properties", null);
        setBooleanField(term546, term546.getClass(), "nativeType", false);
        setField(term546, term546.getClass(), "implicitPrototypeFallback", null);
        setField(term546, term546.getClass(), "ownerFunction", null);
        setBooleanField(term546, term546.getClass(), "prettyPrint", false);
        setBooleanField(term546, term546.getClass(), "visited", false);
        setField(term546, term546.getClass(), "docInfo", null);
        setBooleanField(term546, term546.getClass(), "unknown", false);
        setBooleanField(term546, term546.getClass(), "resolved", false);
        setField(term546, term546.getClass(), "resolveResult", null);
        setBooleanField(term546, term546.getClass(), "inTemplatedCheckVisit", false);
        setField(term546, term546.getClass(), "registry", null);
        setField(term502, term502.getClass(), "ownerFunction", term546);
        setBooleanField(term502, term502.getClass(), "prettyPrint", false);
        setBooleanField(term502, term502.getClass(), "visited", false);
        setField(term555, term555.getClass(), "info", null);
        setField(term555, term555.getClass(), "documentation", null);
        setField(term555, term555.getClass(), "associatedNode", null);
        setField(term555, term555.getClass(), "visibility", null);
        setIntField(term555, term555.getClass(), "bitset", 0);
        setField(term555, term555.getClass(), "type", null);
        setField(term555, term555.getClass(), "thisType", null);
        setBooleanField(term555, term555.getClass(), "includeDocumentation", false);
        setField(term502, term502.getClass(), "docInfo", term555);
        setBooleanField(term502, term502.getClass(), "unknown", false);
        setBooleanField(term502, term502.getClass(), "resolved", true);
        setField(term502, term502.getClass(), "resolveResult", null);
        setBooleanField(term502, term502.getClass(), "inTemplatedCheckVisit", false);
        setField(term502, term502.getClass(), "registry", null);
        term561 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term502;
        args[1] = term561;
        callMethod(klass, "checkRecordEquivalenceHelper", argTypes, term443, args);
    }

};


