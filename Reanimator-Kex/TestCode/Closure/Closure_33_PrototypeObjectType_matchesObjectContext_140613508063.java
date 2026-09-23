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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_matchesObjectContext_140613508063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2043;
     Object term7784;

    public PrototypeObjectType_matchesObjectContext_140613508063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2056 = new HashMap();
        term2043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2076 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2043, term2043.getClass(), "className", "kGMQdqJYyB");
        setField(term2043, term2043.getClass(), "properties", term2056);
        setBooleanField(term2043, term2043.getClass(), "nativeType", false);
        setField(term2043, term2043.getClass(), "implicitPrototypeFallback", null);
        setField(term2068, term2068.getClass(), "call", null);
        setField(term2068, term2068.getClass(), "prototypeSlot", null);
        setField(term2068, term2068.getClass(), "kind", null);
        setField(term2068, term2068.getClass(), "typeOfThis", null);
        setField(term2068, term2068.getClass(), "source", null);
        setField(term2068, term2068.getClass(), "implementedInterfaces", null);
        setField(term2068, term2068.getClass(), "extendedInterfaces", null);
        setField(term2068, term2068.getClass(), "subTypes", null);
        setField(term2068, term2068.getClass(), "templateTypeName", null);
        setField(term2068, term2068.getClass(), "className", null);
        setField(term2068, term2068.getClass(), "properties", null);
        setBooleanField(term2068, term2068.getClass(), "nativeType", false);
        setField(term2068, term2068.getClass(), "implicitPrototypeFallback", null);
        setField(term2068, term2068.getClass(), "ownerFunction", null);
        setBooleanField(term2068, term2068.getClass(), "prettyPrint", false);
        setBooleanField(term2068, term2068.getClass(), "visited", false);
        setField(term2068, term2068.getClass(), "docInfo", null);
        setBooleanField(term2068, term2068.getClass(), "unknown", false);
        setBooleanField(term2068, term2068.getClass(), "resolved", false);
        setField(term2068, term2068.getClass(), "resolveResult", null);
        setField(term2068, term2068.getClass(), "registry", null);
        setField(term2043, term2043.getClass(), "ownerFunction", term2068);
        setBooleanField(term2043, term2043.getClass(), "prettyPrint", false);
        setBooleanField(term2043, term2043.getClass(), "visited", true);
        setField(term2076, term2076.getClass(), "info", null);
        setField(term2076, term2076.getClass(), "documentation", null);
        setField(term2076, term2076.getClass(), "associatedNode", null);
        setField(term2076, term2076.getClass(), "visibility", null);
        setIntField(term2076, term2076.getClass(), "bitset", 0);
        setField(term2076, term2076.getClass(), "type", null);
        setField(term2076, term2076.getClass(), "thisType", null);
        setBooleanField(term2076, term2076.getClass(), "includeDocumentation", false);
        setField(term2043, term2043.getClass(), "docInfo", term2076);
        setBooleanField(term2043, term2043.getClass(), "unknown", true);
        setBooleanField(term2043, term2043.getClass(), "resolved", true);
        setField(term2043, term2043.getClass(), "resolveResult", null);
        setField(term2043, term2043.getClass(), "registry", null);
        HashMap term7787 = new HashMap();
        term7784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7789 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7784, term7784.getClass(), "className", "kGMQdqJYyB");
        setField(term7784, term7784.getClass(), "properties", term7787);
        setBooleanField(term7784, term7784.getClass(), "nativeType", false);
        setField(term7784, term7784.getClass(), "implicitPrototypeFallback", null);
        setField(term7788, term7788.getClass(), "call", null);
        setField(term7788, term7788.getClass(), "prototypeSlot", null);
        setField(term7788, term7788.getClass(), "kind", null);
        setField(term7788, term7788.getClass(), "typeOfThis", null);
        setField(term7788, term7788.getClass(), "source", null);
        setField(term7788, term7788.getClass(), "implementedInterfaces", null);
        setField(term7788, term7788.getClass(), "extendedInterfaces", null);
        setField(term7788, term7788.getClass(), "subTypes", null);
        setField(term7788, term7788.getClass(), "templateTypeName", null);
        setField(term7788, term7788.getClass(), "className", null);
        setField(term7788, term7788.getClass(), "properties", null);
        setBooleanField(term7788, term7788.getClass(), "nativeType", false);
        setField(term7788, term7788.getClass(), "implicitPrototypeFallback", null);
        setField(term7788, term7788.getClass(), "ownerFunction", null);
        setBooleanField(term7788, term7788.getClass(), "prettyPrint", false);
        setBooleanField(term7788, term7788.getClass(), "visited", false);
        setField(term7788, term7788.getClass(), "docInfo", null);
        setBooleanField(term7788, term7788.getClass(), "unknown", false);
        setBooleanField(term7788, term7788.getClass(), "resolved", false);
        setField(term7788, term7788.getClass(), "resolveResult", null);
        setField(term7788, term7788.getClass(), "registry", null);
        setField(term7784, term7784.getClass(), "ownerFunction", term7788);
        setBooleanField(term7784, term7784.getClass(), "prettyPrint", false);
        setBooleanField(term7784, term7784.getClass(), "visited", true);
        setField(term7789, term7789.getClass(), "info", null);
        setField(term7789, term7789.getClass(), "documentation", null);
        setField(term7789, term7789.getClass(), "associatedNode", null);
        setField(term7789, term7789.getClass(), "visibility", null);
        setIntField(term7789, term7789.getClass(), "bitset", 0);
        setField(term7789, term7789.getClass(), "type", null);
        setField(term7789, term7789.getClass(), "thisType", null);
        setBooleanField(term7789, term7789.getClass(), "includeDocumentation", false);
        setField(term7784, term7784.getClass(), "docInfo", term7789);
        setBooleanField(term7784, term7784.getClass(), "unknown", true);
        setBooleanField(term7784, term7784.getClass(), "resolved", true);
        setField(term7784, term7784.getClass(), "resolveResult", null);
        setField(term7784, term7784.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesObjectContext", argTypes, term2043, args);
        assertTrue(recursiveEquals(term2043, term7784));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


