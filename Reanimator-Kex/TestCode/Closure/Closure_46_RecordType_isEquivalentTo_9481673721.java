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

public class RecordType_isEquivalentTo_9481673721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public RecordType_isEquivalentTo_9481673721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term229 = new HashMap();
        term198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term199 = newInstance(Class.forName("java.util.TreeMap"));
        Object term200 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term249 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term199, term199.getClass(), "comparator", null);
        setField(term200, term200.getClass(), "key", "YRHGsAkhxb");
        setField(term200, term200.getClass(), "value", null);
        setField(term200, term200.getClass(), "left", null);
        setField(term200, term200.getClass(), "right", null);
        setField(term200, term200.getClass(), "parent", null);
        setBooleanField(term200, term200.getClass(), "color", true);
        setField(term199, term199.getClass(), "root", term200);
        setIntField(term199, term199.getClass(), "size", 1);
        setIntField(term199, term199.getClass(), "modCount", 1);
        setField(term199, term199.getClass(), "entrySet", null);
        setField(term199, term199.getClass(), "navigableKeySet", null);
        setField(term199, term199.getClass(), "descendingMap", null);
        setField(term199, term199.getClass(), "keySet", null);
        setField(term199, term199.getClass(), "values", null);
        setField(term198, term198.getClass(), "properties", term199);
        setBooleanField(term198, term198.getClass(), "isFrozen", true);
        setField(term198, term198.getClass(), "className", "ffYhPOzlUs");
        setField(term198, term198.getClass(), "properties", term229);
        setBooleanField(term198, term198.getClass(), "nativeType", true);
        setField(term198, term198.getClass(), "implicitPrototypeFallback", null);
        setField(term241, term241.getClass(), "call", null);
        setField(term241, term241.getClass(), "prototypeSlot", null);
        setField(term241, term241.getClass(), "kind", null);
        setField(term241, term241.getClass(), "typeOfThis", null);
        setField(term241, term241.getClass(), "source", null);
        setField(term241, term241.getClass(), "implementedInterfaces", null);
        setField(term241, term241.getClass(), "extendedInterfaces", null);
        setField(term241, term241.getClass(), "subTypes", null);
        setField(term241, term241.getClass(), "templateTypeName", null);
        setField(term241, term241.getClass(), "className", null);
        setField(term241, term241.getClass(), "properties", null);
        setBooleanField(term241, term241.getClass(), "nativeType", false);
        setField(term241, term241.getClass(), "implicitPrototypeFallback", null);
        setField(term241, term241.getClass(), "ownerFunction", null);
        setBooleanField(term241, term241.getClass(), "prettyPrint", false);
        setBooleanField(term241, term241.getClass(), "visited", false);
        setField(term241, term241.getClass(), "docInfo", null);
        setBooleanField(term241, term241.getClass(), "unknown", false);
        setBooleanField(term241, term241.getClass(), "resolved", false);
        setField(term241, term241.getClass(), "resolveResult", null);
        setField(term241, term241.getClass(), "registry", null);
        setField(term198, term198.getClass(), "ownerFunction", term241);
        setBooleanField(term198, term198.getClass(), "prettyPrint", false);
        setBooleanField(term198, term198.getClass(), "visited", true);
        setField(term249, term249.getClass(), "info", null);
        setField(term249, term249.getClass(), "documentation", null);
        setField(term249, term249.getClass(), "associatedNode", null);
        setField(term249, term249.getClass(), "visibility", null);
        setIntField(term249, term249.getClass(), "bitset", 0);
        setField(term249, term249.getClass(), "type", null);
        setField(term249, term249.getClass(), "thisType", null);
        setBooleanField(term249, term249.getClass(), "includeDocumentation", false);
        setField(term198, term198.getClass(), "docInfo", term249);
        setBooleanField(term198, term198.getClass(), "unknown", false);
        setBooleanField(term198, term198.getClass(), "resolved", false);
        setField(term198, term198.getClass(), "resolveResult", null);
        setField(term198, term198.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isEquivalentTo", argTypes, term198, args);
    }

};


