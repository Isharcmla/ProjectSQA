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

public class RecordType_isSynthetic_18482092722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364;

    public RecordType_isSynthetic_18482092722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term396 = new HashMap();
        term364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term365 = newInstance(Class.forName("java.util.TreeMap"));
        Object term366 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term365, term365.getClass(), "comparator", null);
        setField(term366, term366.getClass(), "key", "qxSDVejjiY");
        setField(term366, term366.getClass(), "value", null);
        setField(term366, term366.getClass(), "left", null);
        setField(term366, term366.getClass(), "right", null);
        setField(term366, term366.getClass(), "parent", null);
        setBooleanField(term366, term366.getClass(), "color", true);
        setField(term365, term365.getClass(), "root", term366);
        setIntField(term365, term365.getClass(), "size", 1);
        setIntField(term365, term365.getClass(), "modCount", 1);
        setField(term365, term365.getClass(), "entrySet", null);
        setField(term365, term365.getClass(), "navigableKeySet", null);
        setField(term365, term365.getClass(), "descendingMap", null);
        setField(term365, term365.getClass(), "keySet", null);
        setField(term365, term365.getClass(), "values", null);
        setField(term364, term364.getClass(), "properties", term365);
        setBooleanField(term364, term364.getClass(), "declared", false);
        setBooleanField(term364, term364.getClass(), "isFrozen", true);
        setField(term364, term364.getClass(), "className", "xBsXSDjXYK");
        setField(term364, term364.getClass(), "properties", term396);
        setBooleanField(term364, term364.getClass(), "nativeType", true);
        setField(term364, term364.getClass(), "implicitPrototypeFallback", null);
        setField(term408, term408.getClass(), "call", null);
        setField(term408, term408.getClass(), "prototypeSlot", null);
        setField(term408, term408.getClass(), "kind", null);
        setField(term408, term408.getClass(), "propAccess", null);
        setField(term408, term408.getClass(), "typeOfThis", null);
        setField(term408, term408.getClass(), "source", null);
        setField(term408, term408.getClass(), "implementedInterfaces", null);
        setField(term408, term408.getClass(), "extendedInterfaces", null);
        setField(term408, term408.getClass(), "subTypes", null);
        setField(term408, term408.getClass(), "templateTypeNames", null);
        setField(term408, term408.getClass(), "className", null);
        setField(term408, term408.getClass(), "properties", null);
        setBooleanField(term408, term408.getClass(), "nativeType", false);
        setField(term408, term408.getClass(), "implicitPrototypeFallback", null);
        setField(term408, term408.getClass(), "ownerFunction", null);
        setBooleanField(term408, term408.getClass(), "prettyPrint", false);
        setBooleanField(term408, term408.getClass(), "visited", false);
        setField(term408, term408.getClass(), "docInfo", null);
        setBooleanField(term408, term408.getClass(), "unknown", false);
        setBooleanField(term408, term408.getClass(), "resolved", false);
        setField(term408, term408.getClass(), "resolveResult", null);
        setBooleanField(term408, term408.getClass(), "inTemplatedCheckVisit", false);
        setField(term408, term408.getClass(), "registry", null);
        setField(term364, term364.getClass(), "ownerFunction", term408);
        setBooleanField(term364, term364.getClass(), "prettyPrint", true);
        setBooleanField(term364, term364.getClass(), "visited", true);
        setField(term417, term417.getClass(), "info", null);
        setField(term417, term417.getClass(), "documentation", null);
        setField(term417, term417.getClass(), "associatedNode", null);
        setField(term417, term417.getClass(), "visibility", null);
        setIntField(term417, term417.getClass(), "bitset", 0);
        setField(term417, term417.getClass(), "type", null);
        setField(term417, term417.getClass(), "thisType", null);
        setBooleanField(term417, term417.getClass(), "includeDocumentation", false);
        setField(term364, term364.getClass(), "docInfo", term417);
        setBooleanField(term364, term364.getClass(), "unknown", false);
        setBooleanField(term364, term364.getClass(), "resolved", false);
        setField(term364, term364.getClass(), "resolveResult", null);
        setBooleanField(term364, term364.getClass(), "inTemplatedCheckVisit", false);
        setField(term364, term364.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSynthetic", argTypes, term364, args);
    }

};


