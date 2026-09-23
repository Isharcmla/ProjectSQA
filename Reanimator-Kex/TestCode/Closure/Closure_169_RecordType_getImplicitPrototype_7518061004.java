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

public class RecordType_getImplicitPrototype_7518061004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603;

    public RecordType_getImplicitPrototype_7518061004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term635 = new HashMap();
        term603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term604 = newInstance(Class.forName("java.util.TreeMap"));
        Object term605 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term656 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term604, term604.getClass(), "comparator", null);
        setField(term605, term605.getClass(), "key", "XylxrMBraH");
        setField(term605, term605.getClass(), "value", null);
        setField(term605, term605.getClass(), "left", null);
        setField(term605, term605.getClass(), "right", null);
        setField(term605, term605.getClass(), "parent", null);
        setBooleanField(term605, term605.getClass(), "color", true);
        setField(term604, term604.getClass(), "root", term605);
        setIntField(term604, term604.getClass(), "size", 1);
        setIntField(term604, term604.getClass(), "modCount", 1);
        setField(term604, term604.getClass(), "entrySet", null);
        setField(term604, term604.getClass(), "navigableKeySet", null);
        setField(term604, term604.getClass(), "descendingMap", null);
        setField(term604, term604.getClass(), "keySet", null);
        setField(term604, term604.getClass(), "values", null);
        setField(term603, term603.getClass(), "properties", term604);
        setBooleanField(term603, term603.getClass(), "declared", false);
        setBooleanField(term603, term603.getClass(), "isFrozen", true);
        setField(term603, term603.getClass(), "className", "pORebkoRdD");
        setField(term603, term603.getClass(), "properties", term635);
        setBooleanField(term603, term603.getClass(), "nativeType", true);
        setField(term603, term603.getClass(), "implicitPrototypeFallback", null);
        setField(term647, term647.getClass(), "call", null);
        setField(term647, term647.getClass(), "prototypeSlot", null);
        setField(term647, term647.getClass(), "kind", null);
        setField(term647, term647.getClass(), "propAccess", null);
        setField(term647, term647.getClass(), "typeOfThis", null);
        setField(term647, term647.getClass(), "source", null);
        setField(term647, term647.getClass(), "implementedInterfaces", null);
        setField(term647, term647.getClass(), "extendedInterfaces", null);
        setField(term647, term647.getClass(), "subTypes", null);
        setField(term647, term647.getClass(), "templateTypeNames", null);
        setField(term647, term647.getClass(), "className", null);
        setField(term647, term647.getClass(), "properties", null);
        setBooleanField(term647, term647.getClass(), "nativeType", false);
        setField(term647, term647.getClass(), "implicitPrototypeFallback", null);
        setField(term647, term647.getClass(), "ownerFunction", null);
        setBooleanField(term647, term647.getClass(), "prettyPrint", false);
        setBooleanField(term647, term647.getClass(), "visited", false);
        setField(term647, term647.getClass(), "docInfo", null);
        setBooleanField(term647, term647.getClass(), "unknown", false);
        setBooleanField(term647, term647.getClass(), "resolved", false);
        setField(term647, term647.getClass(), "resolveResult", null);
        setBooleanField(term647, term647.getClass(), "inTemplatedCheckVisit", false);
        setField(term647, term647.getClass(), "registry", null);
        setField(term603, term603.getClass(), "ownerFunction", term647);
        setBooleanField(term603, term603.getClass(), "prettyPrint", false);
        setBooleanField(term603, term603.getClass(), "visited", true);
        setField(term656, term656.getClass(), "info", null);
        setField(term656, term656.getClass(), "documentation", null);
        setField(term656, term656.getClass(), "associatedNode", null);
        setField(term656, term656.getClass(), "visibility", null);
        setIntField(term656, term656.getClass(), "bitset", 0);
        setField(term656, term656.getClass(), "type", null);
        setField(term656, term656.getClass(), "thisType", null);
        setBooleanField(term656, term656.getClass(), "includeDocumentation", false);
        setField(term603, term603.getClass(), "docInfo", term656);
        setBooleanField(term603, term603.getClass(), "unknown", false);
        setBooleanField(term603, term603.getClass(), "resolved", false);
        setField(term603, term603.getClass(), "resolveResult", null);
        setBooleanField(term603, term603.getClass(), "inTemplatedCheckVisit", false);
        setField(term603, term603.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImplicitPrototype", argTypes, term603, args);
    }

};


