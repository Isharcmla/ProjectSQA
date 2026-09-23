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

public class RecordType_resolveInternal_7232665239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857;

    public RecordType_resolveInternal_7232665239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term888 = new HashMap();
        term857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term858 = newInstance(Class.forName("java.util.TreeMap"));
        Object term859 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term908 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term858, term858.getClass(), "comparator", null);
        setField(term859, term859.getClass(), "key", "PkWMRdJcBb");
        setField(term859, term859.getClass(), "value", null);
        setField(term859, term859.getClass(), "left", null);
        setField(term859, term859.getClass(), "right", null);
        setField(term859, term859.getClass(), "parent", null);
        setBooleanField(term859, term859.getClass(), "color", true);
        setField(term858, term858.getClass(), "root", term859);
        setIntField(term858, term858.getClass(), "size", 1);
        setIntField(term858, term858.getClass(), "modCount", 1);
        setField(term858, term858.getClass(), "entrySet", null);
        setField(term858, term858.getClass(), "navigableKeySet", null);
        setField(term858, term858.getClass(), "descendingMap", null);
        setField(term858, term858.getClass(), "keySet", null);
        setField(term858, term858.getClass(), "values", null);
        setField(term857, term857.getClass(), "properties", term858);
        setBooleanField(term857, term857.getClass(), "isFrozen", true);
        setField(term857, term857.getClass(), "className", "jSpAteRute");
        setField(term857, term857.getClass(), "properties", term888);
        setBooleanField(term857, term857.getClass(), "nativeType", true);
        setField(term857, term857.getClass(), "implicitPrototypeFallback", null);
        setField(term900, term900.getClass(), "call", null);
        setField(term900, term900.getClass(), "prototypeSlot", null);
        setField(term900, term900.getClass(), "kind", null);
        setField(term900, term900.getClass(), "typeOfThis", null);
        setField(term900, term900.getClass(), "source", null);
        setField(term900, term900.getClass(), "implementedInterfaces", null);
        setField(term900, term900.getClass(), "extendedInterfaces", null);
        setField(term900, term900.getClass(), "subTypes", null);
        setField(term900, term900.getClass(), "templateTypeName", null);
        setField(term900, term900.getClass(), "className", null);
        setField(term900, term900.getClass(), "properties", null);
        setBooleanField(term900, term900.getClass(), "nativeType", false);
        setField(term900, term900.getClass(), "implicitPrototypeFallback", null);
        setField(term900, term900.getClass(), "ownerFunction", null);
        setBooleanField(term900, term900.getClass(), "prettyPrint", false);
        setBooleanField(term900, term900.getClass(), "visited", false);
        setField(term900, term900.getClass(), "docInfo", null);
        setBooleanField(term900, term900.getClass(), "unknown", false);
        setBooleanField(term900, term900.getClass(), "resolved", false);
        setField(term900, term900.getClass(), "resolveResult", null);
        setField(term900, term900.getClass(), "registry", null);
        setField(term857, term857.getClass(), "ownerFunction", term900);
        setBooleanField(term857, term857.getClass(), "prettyPrint", false);
        setBooleanField(term857, term857.getClass(), "visited", false);
        setField(term908, term908.getClass(), "info", null);
        setField(term908, term908.getClass(), "documentation", null);
        setField(term908, term908.getClass(), "associatedNode", null);
        setField(term908, term908.getClass(), "visibility", null);
        setIntField(term908, term908.getClass(), "bitset", 0);
        setField(term908, term908.getClass(), "type", null);
        setField(term908, term908.getClass(), "thisType", null);
        setBooleanField(term908, term908.getClass(), "includeDocumentation", false);
        setField(term857, term857.getClass(), "docInfo", term908);
        setBooleanField(term857, term857.getClass(), "unknown", false);
        setBooleanField(term857, term857.getClass(), "resolved", false);
        setField(term857, term857.getClass(), "resolveResult", null);
        setField(term857, term857.getClass(), "registry", null);
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
        callMethod(klass, "resolveInternal", argTypes, term857, args);
    }

};


