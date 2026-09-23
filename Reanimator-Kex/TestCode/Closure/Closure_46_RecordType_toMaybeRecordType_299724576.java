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

public class RecordType_toMaybeRecordType_299724576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;

    public RecordType_toMaybeRecordType_299724576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term660 = new HashMap();
        term629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term630 = newInstance(Class.forName("java.util.TreeMap"));
        Object term631 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term680 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term630, term630.getClass(), "comparator", null);
        setField(term631, term631.getClass(), "key", "oVgzLbrsFr");
        setField(term631, term631.getClass(), "value", null);
        setField(term631, term631.getClass(), "left", null);
        setField(term631, term631.getClass(), "right", null);
        setField(term631, term631.getClass(), "parent", null);
        setBooleanField(term631, term631.getClass(), "color", true);
        setField(term630, term630.getClass(), "root", term631);
        setIntField(term630, term630.getClass(), "size", 1);
        setIntField(term630, term630.getClass(), "modCount", 1);
        setField(term630, term630.getClass(), "entrySet", null);
        setField(term630, term630.getClass(), "navigableKeySet", null);
        setField(term630, term630.getClass(), "descendingMap", null);
        setField(term630, term630.getClass(), "keySet", null);
        setField(term630, term630.getClass(), "values", null);
        setField(term629, term629.getClass(), "properties", term630);
        setBooleanField(term629, term629.getClass(), "isFrozen", true);
        setField(term629, term629.getClass(), "className", "vQVyKLdtaz");
        setField(term629, term629.getClass(), "properties", term660);
        setBooleanField(term629, term629.getClass(), "nativeType", true);
        setField(term629, term629.getClass(), "implicitPrototypeFallback", null);
        setField(term672, term672.getClass(), "call", null);
        setField(term672, term672.getClass(), "prototypeSlot", null);
        setField(term672, term672.getClass(), "kind", null);
        setField(term672, term672.getClass(), "typeOfThis", null);
        setField(term672, term672.getClass(), "source", null);
        setField(term672, term672.getClass(), "implementedInterfaces", null);
        setField(term672, term672.getClass(), "extendedInterfaces", null);
        setField(term672, term672.getClass(), "subTypes", null);
        setField(term672, term672.getClass(), "templateTypeName", null);
        setField(term672, term672.getClass(), "className", null);
        setField(term672, term672.getClass(), "properties", null);
        setBooleanField(term672, term672.getClass(), "nativeType", false);
        setField(term672, term672.getClass(), "implicitPrototypeFallback", null);
        setField(term672, term672.getClass(), "ownerFunction", null);
        setBooleanField(term672, term672.getClass(), "prettyPrint", false);
        setBooleanField(term672, term672.getClass(), "visited", false);
        setField(term672, term672.getClass(), "docInfo", null);
        setBooleanField(term672, term672.getClass(), "unknown", false);
        setBooleanField(term672, term672.getClass(), "resolved", false);
        setField(term672, term672.getClass(), "resolveResult", null);
        setField(term672, term672.getClass(), "registry", null);
        setField(term629, term629.getClass(), "ownerFunction", term672);
        setBooleanField(term629, term629.getClass(), "prettyPrint", false);
        setBooleanField(term629, term629.getClass(), "visited", true);
        setField(term680, term680.getClass(), "info", null);
        setField(term680, term680.getClass(), "documentation", null);
        setField(term680, term680.getClass(), "associatedNode", null);
        setField(term680, term680.getClass(), "visibility", null);
        setIntField(term680, term680.getClass(), "bitset", 0);
        setField(term680, term680.getClass(), "type", null);
        setField(term680, term680.getClass(), "thisType", null);
        setBooleanField(term680, term680.getClass(), "includeDocumentation", false);
        setField(term629, term629.getClass(), "docInfo", term680);
        setBooleanField(term629, term629.getClass(), "unknown", false);
        setBooleanField(term629, term629.getClass(), "resolved", false);
        setField(term629, term629.getClass(), "resolveResult", null);
        setField(term629, term629.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMaybeRecordType", argTypes, term629, args);
    }

};


