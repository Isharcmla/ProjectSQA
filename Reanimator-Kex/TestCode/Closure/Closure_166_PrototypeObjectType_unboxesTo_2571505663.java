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

public class PrototypeObjectType_unboxesTo_2571505663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009;
     Object term7893;

    public PrototypeObjectType_unboxesTo_2571505663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2022 = new HashMap();
        term2009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2043 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2009, term2009.getClass(), "className", "kNqaJKIATy");
        setField(term2009, term2009.getClass(), "properties", term2022);
        setBooleanField(term2009, term2009.getClass(), "nativeType", true);
        setField(term2009, term2009.getClass(), "implicitPrototypeFallback", null);
        setField(term2034, term2034.getClass(), "call", null);
        setField(term2034, term2034.getClass(), "prototypeSlot", null);
        setField(term2034, term2034.getClass(), "kind", null);
        setField(term2034, term2034.getClass(), "typeOfThis", null);
        setField(term2034, term2034.getClass(), "source", null);
        setField(term2034, term2034.getClass(), "implementedInterfaces", null);
        setField(term2034, term2034.getClass(), "extendedInterfaces", null);
        setField(term2034, term2034.getClass(), "subTypes", null);
        setField(term2034, term2034.getClass(), "templateTypeNames", null);
        setField(term2034, term2034.getClass(), "className", null);
        setField(term2034, term2034.getClass(), "properties", null);
        setBooleanField(term2034, term2034.getClass(), "nativeType", false);
        setField(term2034, term2034.getClass(), "implicitPrototypeFallback", null);
        setField(term2034, term2034.getClass(), "ownerFunction", null);
        setBooleanField(term2034, term2034.getClass(), "prettyPrint", false);
        setBooleanField(term2034, term2034.getClass(), "visited", false);
        setField(term2034, term2034.getClass(), "docInfo", null);
        setBooleanField(term2034, term2034.getClass(), "unknown", false);
        setBooleanField(term2034, term2034.getClass(), "resolved", false);
        setField(term2034, term2034.getClass(), "resolveResult", null);
        setBooleanField(term2034, term2034.getClass(), "inTemplatedCheckVisit", false);
        setField(term2034, term2034.getClass(), "registry", null);
        setField(term2009, term2009.getClass(), "ownerFunction", term2034);
        setBooleanField(term2009, term2009.getClass(), "prettyPrint", false);
        setBooleanField(term2009, term2009.getClass(), "visited", false);
        setField(term2043, term2043.getClass(), "info", null);
        setField(term2043, term2043.getClass(), "documentation", null);
        setField(term2043, term2043.getClass(), "associatedNode", null);
        setField(term2043, term2043.getClass(), "visibility", null);
        setIntField(term2043, term2043.getClass(), "bitset", 0);
        setField(term2043, term2043.getClass(), "type", null);
        setField(term2043, term2043.getClass(), "thisType", null);
        setBooleanField(term2043, term2043.getClass(), "includeDocumentation", false);
        setField(term2009, term2009.getClass(), "docInfo", term2043);
        setBooleanField(term2009, term2009.getClass(), "unknown", true);
        setBooleanField(term2009, term2009.getClass(), "resolved", false);
        setField(term2009, term2009.getClass(), "resolveResult", null);
        setBooleanField(term2009, term2009.getClass(), "inTemplatedCheckVisit", false);
        setField(term2009, term2009.getClass(), "registry", null);
        HashMap term7896 = new HashMap();
        term7893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7898 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7893, term7893.getClass(), "className", "kNqaJKIATy");
        setField(term7893, term7893.getClass(), "properties", term7896);
        setBooleanField(term7893, term7893.getClass(), "nativeType", true);
        setField(term7893, term7893.getClass(), "implicitPrototypeFallback", null);
        setField(term7897, term7897.getClass(), "call", null);
        setField(term7897, term7897.getClass(), "prototypeSlot", null);
        setField(term7897, term7897.getClass(), "kind", null);
        setField(term7897, term7897.getClass(), "typeOfThis", null);
        setField(term7897, term7897.getClass(), "source", null);
        setField(term7897, term7897.getClass(), "implementedInterfaces", null);
        setField(term7897, term7897.getClass(), "extendedInterfaces", null);
        setField(term7897, term7897.getClass(), "subTypes", null);
        setField(term7897, term7897.getClass(), "templateTypeNames", null);
        setField(term7897, term7897.getClass(), "className", null);
        setField(term7897, term7897.getClass(), "properties", null);
        setBooleanField(term7897, term7897.getClass(), "nativeType", false);
        setField(term7897, term7897.getClass(), "implicitPrototypeFallback", null);
        setField(term7897, term7897.getClass(), "ownerFunction", null);
        setBooleanField(term7897, term7897.getClass(), "prettyPrint", false);
        setBooleanField(term7897, term7897.getClass(), "visited", false);
        setField(term7897, term7897.getClass(), "docInfo", null);
        setBooleanField(term7897, term7897.getClass(), "unknown", false);
        setBooleanField(term7897, term7897.getClass(), "resolved", false);
        setField(term7897, term7897.getClass(), "resolveResult", null);
        setBooleanField(term7897, term7897.getClass(), "inTemplatedCheckVisit", false);
        setField(term7897, term7897.getClass(), "registry", null);
        setField(term7893, term7893.getClass(), "ownerFunction", term7897);
        setBooleanField(term7893, term7893.getClass(), "prettyPrint", false);
        setBooleanField(term7893, term7893.getClass(), "visited", false);
        setField(term7898, term7898.getClass(), "info", null);
        setField(term7898, term7898.getClass(), "documentation", null);
        setField(term7898, term7898.getClass(), "associatedNode", null);
        setField(term7898, term7898.getClass(), "visibility", null);
        setIntField(term7898, term7898.getClass(), "bitset", 0);
        setField(term7898, term7898.getClass(), "type", null);
        setField(term7898, term7898.getClass(), "thisType", null);
        setBooleanField(term7898, term7898.getClass(), "includeDocumentation", false);
        setField(term7893, term7893.getClass(), "docInfo", term7898);
        setBooleanField(term7893, term7893.getClass(), "unknown", true);
        setBooleanField(term7893, term7893.getClass(), "resolved", false);
        setField(term7893, term7893.getClass(), "resolveResult", null);
        setBooleanField(term7893, term7893.getClass(), "inTemplatedCheckVisit", false);
        setField(term7893, term7893.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "unboxesTo", argTypes, term2009, args);
        assertTrue(recursiveEquals(term2009, term7893));
        assertTrue(recursiveEquals(retValue, null));
    }

};


