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

public class RecordType_isSubtype_13835430618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term970;

    public RecordType_isSubtype_13835430618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1002 = new HashMap();
        term970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term971 = newInstance(Class.forName("java.util.TreeMap"));
        Object term972 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1023 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term971, term971.getClass(), "comparator", null);
        setField(term972, term972.getClass(), "key", "gCWtLVKVVe");
        setField(term972, term972.getClass(), "value", null);
        setField(term972, term972.getClass(), "left", null);
        setField(term972, term972.getClass(), "right", null);
        setField(term972, term972.getClass(), "parent", null);
        setBooleanField(term972, term972.getClass(), "color", true);
        setField(term971, term971.getClass(), "root", term972);
        setIntField(term971, term971.getClass(), "size", 1);
        setIntField(term971, term971.getClass(), "modCount", 1);
        setField(term971, term971.getClass(), "entrySet", null);
        setField(term971, term971.getClass(), "navigableKeySet", null);
        setField(term971, term971.getClass(), "descendingMap", null);
        setField(term971, term971.getClass(), "keySet", null);
        setField(term971, term971.getClass(), "values", null);
        setField(term970, term970.getClass(), "properties", term971);
        setBooleanField(term970, term970.getClass(), "declared", false);
        setBooleanField(term970, term970.getClass(), "isFrozen", false);
        setField(term970, term970.getClass(), "className", "fWKJoSoCwE");
        setField(term970, term970.getClass(), "properties", term1002);
        setBooleanField(term970, term970.getClass(), "nativeType", false);
        setField(term970, term970.getClass(), "implicitPrototypeFallback", null);
        setField(term1014, term1014.getClass(), "call", null);
        setField(term1014, term1014.getClass(), "prototypeSlot", null);
        setField(term1014, term1014.getClass(), "kind", null);
        setField(term1014, term1014.getClass(), "propAccess", null);
        setField(term1014, term1014.getClass(), "typeOfThis", null);
        setField(term1014, term1014.getClass(), "source", null);
        setField(term1014, term1014.getClass(), "implementedInterfaces", null);
        setField(term1014, term1014.getClass(), "extendedInterfaces", null);
        setField(term1014, term1014.getClass(), "subTypes", null);
        setField(term1014, term1014.getClass(), "templateTypeNames", null);
        setField(term1014, term1014.getClass(), "className", null);
        setField(term1014, term1014.getClass(), "properties", null);
        setBooleanField(term1014, term1014.getClass(), "nativeType", false);
        setField(term1014, term1014.getClass(), "implicitPrototypeFallback", null);
        setField(term1014, term1014.getClass(), "ownerFunction", null);
        setBooleanField(term1014, term1014.getClass(), "prettyPrint", false);
        setBooleanField(term1014, term1014.getClass(), "visited", false);
        setField(term1014, term1014.getClass(), "docInfo", null);
        setBooleanField(term1014, term1014.getClass(), "unknown", false);
        setBooleanField(term1014, term1014.getClass(), "resolved", false);
        setField(term1014, term1014.getClass(), "resolveResult", null);
        setBooleanField(term1014, term1014.getClass(), "inTemplatedCheckVisit", false);
        setField(term1014, term1014.getClass(), "registry", null);
        setField(term970, term970.getClass(), "ownerFunction", term1014);
        setBooleanField(term970, term970.getClass(), "prettyPrint", false);
        setBooleanField(term970, term970.getClass(), "visited", true);
        setField(term1023, term1023.getClass(), "info", null);
        setField(term1023, term1023.getClass(), "documentation", null);
        setField(term1023, term1023.getClass(), "associatedNode", null);
        setField(term1023, term1023.getClass(), "visibility", null);
        setIntField(term1023, term1023.getClass(), "bitset", 0);
        setField(term1023, term1023.getClass(), "type", null);
        setField(term1023, term1023.getClass(), "thisType", null);
        setBooleanField(term1023, term1023.getClass(), "includeDocumentation", false);
        setField(term970, term970.getClass(), "docInfo", term1023);
        setBooleanField(term970, term970.getClass(), "unknown", false);
        setBooleanField(term970, term970.getClass(), "resolved", true);
        setField(term970, term970.getClass(), "resolveResult", null);
        setBooleanField(term970, term970.getClass(), "inTemplatedCheckVisit", false);
        setField(term970, term970.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isSubtype", argTypes, term970, args);
    }

};


