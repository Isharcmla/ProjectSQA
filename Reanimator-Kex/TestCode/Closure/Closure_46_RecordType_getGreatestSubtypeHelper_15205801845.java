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

public class RecordType_getGreatestSubtypeHelper_15205801845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553;

    public RecordType_getGreatestSubtypeHelper_15205801845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term584 = new HashMap();
        term553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term554 = newInstance(Class.forName("java.util.TreeMap"));
        Object term555 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term604 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term554, term554.getClass(), "comparator", null);
        setField(term555, term555.getClass(), "key", "JUmudUmaaV");
        setField(term555, term555.getClass(), "value", null);
        setField(term555, term555.getClass(), "left", null);
        setField(term555, term555.getClass(), "right", null);
        setField(term555, term555.getClass(), "parent", null);
        setBooleanField(term555, term555.getClass(), "color", true);
        setField(term554, term554.getClass(), "root", term555);
        setIntField(term554, term554.getClass(), "size", 1);
        setIntField(term554, term554.getClass(), "modCount", 1);
        setField(term554, term554.getClass(), "entrySet", null);
        setField(term554, term554.getClass(), "navigableKeySet", null);
        setField(term554, term554.getClass(), "descendingMap", null);
        setField(term554, term554.getClass(), "keySet", null);
        setField(term554, term554.getClass(), "values", null);
        setField(term553, term553.getClass(), "properties", term554);
        setBooleanField(term553, term553.getClass(), "isFrozen", true);
        setField(term553, term553.getClass(), "className", "KoyGrUJeJW");
        setField(term553, term553.getClass(), "properties", term584);
        setBooleanField(term553, term553.getClass(), "nativeType", false);
        setField(term553, term553.getClass(), "implicitPrototypeFallback", null);
        setField(term596, term596.getClass(), "call", null);
        setField(term596, term596.getClass(), "prototypeSlot", null);
        setField(term596, term596.getClass(), "kind", null);
        setField(term596, term596.getClass(), "typeOfThis", null);
        setField(term596, term596.getClass(), "source", null);
        setField(term596, term596.getClass(), "implementedInterfaces", null);
        setField(term596, term596.getClass(), "extendedInterfaces", null);
        setField(term596, term596.getClass(), "subTypes", null);
        setField(term596, term596.getClass(), "templateTypeName", null);
        setField(term596, term596.getClass(), "className", null);
        setField(term596, term596.getClass(), "properties", null);
        setBooleanField(term596, term596.getClass(), "nativeType", false);
        setField(term596, term596.getClass(), "implicitPrototypeFallback", null);
        setField(term596, term596.getClass(), "ownerFunction", null);
        setBooleanField(term596, term596.getClass(), "prettyPrint", false);
        setBooleanField(term596, term596.getClass(), "visited", false);
        setField(term596, term596.getClass(), "docInfo", null);
        setBooleanField(term596, term596.getClass(), "unknown", false);
        setBooleanField(term596, term596.getClass(), "resolved", false);
        setField(term596, term596.getClass(), "resolveResult", null);
        setField(term596, term596.getClass(), "registry", null);
        setField(term553, term553.getClass(), "ownerFunction", term596);
        setBooleanField(term553, term553.getClass(), "prettyPrint", false);
        setBooleanField(term553, term553.getClass(), "visited", true);
        setField(term604, term604.getClass(), "info", null);
        setField(term604, term604.getClass(), "documentation", null);
        setField(term604, term604.getClass(), "associatedNode", null);
        setField(term604, term604.getClass(), "visibility", null);
        setIntField(term604, term604.getClass(), "bitset", 0);
        setField(term604, term604.getClass(), "type", null);
        setField(term604, term604.getClass(), "thisType", null);
        setBooleanField(term604, term604.getClass(), "includeDocumentation", false);
        setField(term553, term553.getClass(), "docInfo", term604);
        setBooleanField(term553, term553.getClass(), "unknown", true);
        setBooleanField(term553, term553.getClass(), "resolved", false);
        setField(term553, term553.getClass(), "resolveResult", null);
        setField(term553, term553.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getGreatestSubtypeHelper", argTypes, term553, args);
    }

};


