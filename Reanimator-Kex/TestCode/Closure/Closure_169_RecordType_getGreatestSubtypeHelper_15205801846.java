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

public class RecordType_getGreatestSubtypeHelper_15205801846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812;

    public RecordType_getGreatestSubtypeHelper_15205801846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term844 = new HashMap();
        term812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term813 = newInstance(Class.forName("java.util.TreeMap"));
        Object term814 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term865 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term813, term813.getClass(), "comparator", null);
        setField(term814, term814.getClass(), "key", "JDaAnsVTGV");
        setField(term814, term814.getClass(), "value", null);
        setField(term814, term814.getClass(), "left", null);
        setField(term814, term814.getClass(), "right", null);
        setField(term814, term814.getClass(), "parent", null);
        setBooleanField(term814, term814.getClass(), "color", true);
        setField(term813, term813.getClass(), "root", term814);
        setIntField(term813, term813.getClass(), "size", 1);
        setIntField(term813, term813.getClass(), "modCount", 1);
        setField(term813, term813.getClass(), "entrySet", null);
        setField(term813, term813.getClass(), "navigableKeySet", null);
        setField(term813, term813.getClass(), "descendingMap", null);
        setField(term813, term813.getClass(), "keySet", null);
        setField(term813, term813.getClass(), "values", null);
        setField(term812, term812.getClass(), "properties", term813);
        setBooleanField(term812, term812.getClass(), "declared", false);
        setBooleanField(term812, term812.getClass(), "isFrozen", true);
        setField(term812, term812.getClass(), "className", "mLUZFTfjle");
        setField(term812, term812.getClass(), "properties", term844);
        setBooleanField(term812, term812.getClass(), "nativeType", false);
        setField(term812, term812.getClass(), "implicitPrototypeFallback", null);
        setField(term856, term856.getClass(), "call", null);
        setField(term856, term856.getClass(), "prototypeSlot", null);
        setField(term856, term856.getClass(), "kind", null);
        setField(term856, term856.getClass(), "propAccess", null);
        setField(term856, term856.getClass(), "typeOfThis", null);
        setField(term856, term856.getClass(), "source", null);
        setField(term856, term856.getClass(), "implementedInterfaces", null);
        setField(term856, term856.getClass(), "extendedInterfaces", null);
        setField(term856, term856.getClass(), "subTypes", null);
        setField(term856, term856.getClass(), "templateTypeNames", null);
        setField(term856, term856.getClass(), "className", null);
        setField(term856, term856.getClass(), "properties", null);
        setBooleanField(term856, term856.getClass(), "nativeType", false);
        setField(term856, term856.getClass(), "implicitPrototypeFallback", null);
        setField(term856, term856.getClass(), "ownerFunction", null);
        setBooleanField(term856, term856.getClass(), "prettyPrint", false);
        setBooleanField(term856, term856.getClass(), "visited", false);
        setField(term856, term856.getClass(), "docInfo", null);
        setBooleanField(term856, term856.getClass(), "unknown", false);
        setBooleanField(term856, term856.getClass(), "resolved", false);
        setField(term856, term856.getClass(), "resolveResult", null);
        setBooleanField(term856, term856.getClass(), "inTemplatedCheckVisit", false);
        setField(term856, term856.getClass(), "registry", null);
        setField(term812, term812.getClass(), "ownerFunction", term856);
        setBooleanField(term812, term812.getClass(), "prettyPrint", false);
        setBooleanField(term812, term812.getClass(), "visited", true);
        setField(term865, term865.getClass(), "info", null);
        setField(term865, term865.getClass(), "documentation", null);
        setField(term865, term865.getClass(), "associatedNode", null);
        setField(term865, term865.getClass(), "visibility", null);
        setIntField(term865, term865.getClass(), "bitset", 0);
        setField(term865, term865.getClass(), "type", null);
        setField(term865, term865.getClass(), "thisType", null);
        setBooleanField(term865, term865.getClass(), "includeDocumentation", false);
        setField(term812, term812.getClass(), "docInfo", term865);
        setBooleanField(term812, term812.getClass(), "unknown", true);
        setBooleanField(term812, term812.getClass(), "resolved", true);
        setField(term812, term812.getClass(), "resolveResult", null);
        setBooleanField(term812, term812.getClass(), "inTemplatedCheckVisit", false);
        setField(term812, term812.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getGreatestSubtypeHelper", argTypes, term812, args);
    }

};


