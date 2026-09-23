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

public class RecordType_toMaybeRecordType_299724577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;

    public RecordType_toMaybeRecordType_299724577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term923 = new HashMap();
        term891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term892 = newInstance(Class.forName("java.util.TreeMap"));
        Object term893 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term944 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term892, term892.getClass(), "comparator", null);
        setField(term893, term893.getClass(), "key", "OJJtVNPyKZ");
        setField(term893, term893.getClass(), "value", null);
        setField(term893, term893.getClass(), "left", null);
        setField(term893, term893.getClass(), "right", null);
        setField(term893, term893.getClass(), "parent", null);
        setBooleanField(term893, term893.getClass(), "color", true);
        setField(term892, term892.getClass(), "root", term893);
        setIntField(term892, term892.getClass(), "size", 1);
        setIntField(term892, term892.getClass(), "modCount", 1);
        setField(term892, term892.getClass(), "entrySet", null);
        setField(term892, term892.getClass(), "navigableKeySet", null);
        setField(term892, term892.getClass(), "descendingMap", null);
        setField(term892, term892.getClass(), "keySet", null);
        setField(term892, term892.getClass(), "values", null);
        setField(term891, term891.getClass(), "properties", term892);
        setBooleanField(term891, term891.getClass(), "declared", false);
        setBooleanField(term891, term891.getClass(), "isFrozen", false);
        setField(term891, term891.getClass(), "className", "AKNapTAfmD");
        setField(term891, term891.getClass(), "properties", term923);
        setBooleanField(term891, term891.getClass(), "nativeType", false);
        setField(term891, term891.getClass(), "implicitPrototypeFallback", null);
        setField(term935, term935.getClass(), "call", null);
        setField(term935, term935.getClass(), "prototypeSlot", null);
        setField(term935, term935.getClass(), "kind", null);
        setField(term935, term935.getClass(), "propAccess", null);
        setField(term935, term935.getClass(), "typeOfThis", null);
        setField(term935, term935.getClass(), "source", null);
        setField(term935, term935.getClass(), "implementedInterfaces", null);
        setField(term935, term935.getClass(), "extendedInterfaces", null);
        setField(term935, term935.getClass(), "subTypes", null);
        setField(term935, term935.getClass(), "templateTypeNames", null);
        setField(term935, term935.getClass(), "className", null);
        setField(term935, term935.getClass(), "properties", null);
        setBooleanField(term935, term935.getClass(), "nativeType", false);
        setField(term935, term935.getClass(), "implicitPrototypeFallback", null);
        setField(term935, term935.getClass(), "ownerFunction", null);
        setBooleanField(term935, term935.getClass(), "prettyPrint", false);
        setBooleanField(term935, term935.getClass(), "visited", false);
        setField(term935, term935.getClass(), "docInfo", null);
        setBooleanField(term935, term935.getClass(), "unknown", false);
        setBooleanField(term935, term935.getClass(), "resolved", false);
        setField(term935, term935.getClass(), "resolveResult", null);
        setBooleanField(term935, term935.getClass(), "inTemplatedCheckVisit", false);
        setField(term935, term935.getClass(), "registry", null);
        setField(term891, term891.getClass(), "ownerFunction", term935);
        setBooleanField(term891, term891.getClass(), "prettyPrint", false);
        setBooleanField(term891, term891.getClass(), "visited", false);
        setField(term944, term944.getClass(), "info", null);
        setField(term944, term944.getClass(), "documentation", null);
        setField(term944, term944.getClass(), "associatedNode", null);
        setField(term944, term944.getClass(), "visibility", null);
        setIntField(term944, term944.getClass(), "bitset", 0);
        setField(term944, term944.getClass(), "type", null);
        setField(term944, term944.getClass(), "thisType", null);
        setBooleanField(term944, term944.getClass(), "includeDocumentation", false);
        setField(term891, term891.getClass(), "docInfo", term944);
        setBooleanField(term891, term891.getClass(), "unknown", false);
        setBooleanField(term891, term891.getClass(), "resolved", true);
        setField(term891, term891.getClass(), "resolveResult", null);
        setBooleanField(term891, term891.getClass(), "inTemplatedCheckVisit", false);
        setField(term891, term891.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMaybeRecordType", argTypes, term891, args);
    }

};


