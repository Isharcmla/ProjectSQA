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

public class PrototypeObjectType_implicitPrototypeChainIsUnknown_100198354373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2575;
     Object term8902;

    public PrototypeObjectType_implicitPrototypeChainIsUnknown_100198354373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2588 = new HashMap();
        term2575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2608 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2575, term2575.getClass(), "className", "aSkmSwTnEw");
        setField(term2575, term2575.getClass(), "properties", term2588);
        setBooleanField(term2575, term2575.getClass(), "nativeType", true);
        setField(term2575, term2575.getClass(), "implicitPrototypeFallback", null);
        setField(term2600, term2600.getClass(), "call", null);
        setField(term2600, term2600.getClass(), "prototypeSlot", null);
        setField(term2600, term2600.getClass(), "kind", null);
        setField(term2600, term2600.getClass(), "typeOfThis", null);
        setField(term2600, term2600.getClass(), "source", null);
        setField(term2600, term2600.getClass(), "implementedInterfaces", null);
        setField(term2600, term2600.getClass(), "extendedInterfaces", null);
        setField(term2600, term2600.getClass(), "subTypes", null);
        setField(term2600, term2600.getClass(), "templateTypeName", null);
        setField(term2600, term2600.getClass(), "className", null);
        setField(term2600, term2600.getClass(), "properties", null);
        setBooleanField(term2600, term2600.getClass(), "nativeType", false);
        setField(term2600, term2600.getClass(), "implicitPrototypeFallback", null);
        setField(term2600, term2600.getClass(), "ownerFunction", null);
        setBooleanField(term2600, term2600.getClass(), "prettyPrint", false);
        setBooleanField(term2600, term2600.getClass(), "visited", false);
        setField(term2600, term2600.getClass(), "docInfo", null);
        setBooleanField(term2600, term2600.getClass(), "unknown", false);
        setBooleanField(term2600, term2600.getClass(), "resolved", false);
        setField(term2600, term2600.getClass(), "resolveResult", null);
        setField(term2600, term2600.getClass(), "registry", null);
        setField(term2575, term2575.getClass(), "ownerFunction", term2600);
        setBooleanField(term2575, term2575.getClass(), "prettyPrint", true);
        setBooleanField(term2575, term2575.getClass(), "visited", true);
        setField(term2608, term2608.getClass(), "info", null);
        setField(term2608, term2608.getClass(), "documentation", null);
        setField(term2608, term2608.getClass(), "associatedNode", null);
        setField(term2608, term2608.getClass(), "visibility", null);
        setIntField(term2608, term2608.getClass(), "bitset", 0);
        setField(term2608, term2608.getClass(), "type", null);
        setField(term2608, term2608.getClass(), "thisType", null);
        setBooleanField(term2608, term2608.getClass(), "includeDocumentation", false);
        setField(term2575, term2575.getClass(), "docInfo", term2608);
        setBooleanField(term2575, term2575.getClass(), "unknown", true);
        setBooleanField(term2575, term2575.getClass(), "resolved", false);
        setField(term2575, term2575.getClass(), "resolveResult", null);
        setField(term2575, term2575.getClass(), "registry", null);
        HashMap term8905 = new HashMap();
        term8902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8906 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8907 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8902, term8902.getClass(), "className", "aSkmSwTnEw");
        setField(term8902, term8902.getClass(), "properties", term8905);
        setBooleanField(term8902, term8902.getClass(), "nativeType", true);
        setField(term8902, term8902.getClass(), "implicitPrototypeFallback", null);
        setField(term8906, term8906.getClass(), "call", null);
        setField(term8906, term8906.getClass(), "prototypeSlot", null);
        setField(term8906, term8906.getClass(), "kind", null);
        setField(term8906, term8906.getClass(), "typeOfThis", null);
        setField(term8906, term8906.getClass(), "source", null);
        setField(term8906, term8906.getClass(), "implementedInterfaces", null);
        setField(term8906, term8906.getClass(), "extendedInterfaces", null);
        setField(term8906, term8906.getClass(), "subTypes", null);
        setField(term8906, term8906.getClass(), "templateTypeName", null);
        setField(term8906, term8906.getClass(), "className", null);
        setField(term8906, term8906.getClass(), "properties", null);
        setBooleanField(term8906, term8906.getClass(), "nativeType", false);
        setField(term8906, term8906.getClass(), "implicitPrototypeFallback", null);
        setField(term8906, term8906.getClass(), "ownerFunction", null);
        setBooleanField(term8906, term8906.getClass(), "prettyPrint", false);
        setBooleanField(term8906, term8906.getClass(), "visited", false);
        setField(term8906, term8906.getClass(), "docInfo", null);
        setBooleanField(term8906, term8906.getClass(), "unknown", false);
        setBooleanField(term8906, term8906.getClass(), "resolved", false);
        setField(term8906, term8906.getClass(), "resolveResult", null);
        setField(term8906, term8906.getClass(), "registry", null);
        setField(term8902, term8902.getClass(), "ownerFunction", term8906);
        setBooleanField(term8902, term8902.getClass(), "prettyPrint", true);
        setBooleanField(term8902, term8902.getClass(), "visited", true);
        setField(term8907, term8907.getClass(), "info", null);
        setField(term8907, term8907.getClass(), "documentation", null);
        setField(term8907, term8907.getClass(), "associatedNode", null);
        setField(term8907, term8907.getClass(), "visibility", null);
        setIntField(term8907, term8907.getClass(), "bitset", 0);
        setField(term8907, term8907.getClass(), "type", null);
        setField(term8907, term8907.getClass(), "thisType", null);
        setBooleanField(term8907, term8907.getClass(), "includeDocumentation", false);
        setField(term8902, term8902.getClass(), "docInfo", term8907);
        setBooleanField(term8902, term8902.getClass(), "unknown", true);
        setBooleanField(term8902, term8902.getClass(), "resolved", false);
        setField(term8902, term8902.getClass(), "resolveResult", null);
        setField(term8902, term8902.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "implicitPrototypeChainIsUnknown", argTypes, term2575, args);
        assertTrue(recursiveEquals(term2575, term8902));
        assertTrue(recursiveEquals(retValue, false));
    }

};


