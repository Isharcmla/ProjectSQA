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

public class RecordType_resolveInternal_7232665238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;

    public RecordType_resolveInternal_7232665238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term812 = new HashMap();
        term781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term782 = newInstance(Class.forName("java.util.TreeMap"));
        Object term783 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term832 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term782, term782.getClass(), "comparator", null);
        setField(term783, term783.getClass(), "key", "cAPeiZHKGJ");
        setField(term783, term783.getClass(), "value", null);
        setField(term783, term783.getClass(), "left", null);
        setField(term783, term783.getClass(), "right", null);
        setField(term783, term783.getClass(), "parent", null);
        setBooleanField(term783, term783.getClass(), "color", true);
        setField(term782, term782.getClass(), "root", term783);
        setIntField(term782, term782.getClass(), "size", 1);
        setIntField(term782, term782.getClass(), "modCount", 1);
        setField(term782, term782.getClass(), "entrySet", null);
        setField(term782, term782.getClass(), "navigableKeySet", null);
        setField(term782, term782.getClass(), "descendingMap", null);
        setField(term782, term782.getClass(), "keySet", null);
        setField(term782, term782.getClass(), "values", null);
        setField(term781, term781.getClass(), "properties", term782);
        setBooleanField(term781, term781.getClass(), "isFrozen", false);
        setField(term781, term781.getClass(), "className", "LvJFtLBaxj");
        setField(term781, term781.getClass(), "properties", term812);
        setBooleanField(term781, term781.getClass(), "nativeType", false);
        setField(term781, term781.getClass(), "implicitPrototypeFallback", null);
        setField(term824, term824.getClass(), "call", null);
        setField(term824, term824.getClass(), "prototypeSlot", null);
        setField(term824, term824.getClass(), "kind", null);
        setField(term824, term824.getClass(), "typeOfThis", null);
        setField(term824, term824.getClass(), "source", null);
        setField(term824, term824.getClass(), "implementedInterfaces", null);
        setField(term824, term824.getClass(), "extendedInterfaces", null);
        setField(term824, term824.getClass(), "subTypes", null);
        setField(term824, term824.getClass(), "templateTypeName", null);
        setField(term824, term824.getClass(), "className", null);
        setField(term824, term824.getClass(), "properties", null);
        setBooleanField(term824, term824.getClass(), "nativeType", false);
        setField(term824, term824.getClass(), "implicitPrototypeFallback", null);
        setField(term824, term824.getClass(), "ownerFunction", null);
        setBooleanField(term824, term824.getClass(), "prettyPrint", false);
        setBooleanField(term824, term824.getClass(), "visited", false);
        setField(term824, term824.getClass(), "docInfo", null);
        setBooleanField(term824, term824.getClass(), "unknown", false);
        setBooleanField(term824, term824.getClass(), "resolved", false);
        setField(term824, term824.getClass(), "resolveResult", null);
        setField(term824, term824.getClass(), "registry", null);
        setField(term781, term781.getClass(), "ownerFunction", term824);
        setBooleanField(term781, term781.getClass(), "prettyPrint", true);
        setBooleanField(term781, term781.getClass(), "visited", true);
        setField(term832, term832.getClass(), "info", null);
        setField(term832, term832.getClass(), "documentation", null);
        setField(term832, term832.getClass(), "associatedNode", null);
        setField(term832, term832.getClass(), "visibility", null);
        setIntField(term832, term832.getClass(), "bitset", 0);
        setField(term832, term832.getClass(), "type", null);
        setField(term832, term832.getClass(), "thisType", null);
        setBooleanField(term832, term832.getClass(), "includeDocumentation", false);
        setField(term781, term781.getClass(), "docInfo", term832);
        setBooleanField(term781, term781.getClass(), "unknown", false);
        setBooleanField(term781, term781.getClass(), "resolved", false);
        setField(term781, term781.getClass(), "resolveResult", null);
        setField(term781, term781.getClass(), "registry", null);
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
        callMethod(klass, "resolveInternal", argTypes, term781, args);
    }

};


