package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypeCheck_visit_859524784942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263117;
     Object term263209;
     Object term263301;
     Object term263505;
     Object term263506;
     Object term263508;

    public TypeCheck_visit_859524784942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263117 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term263209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term263209, term263209.getClass(), "type", 64);
        setField(term263209, term263209.getClass(), "jsType", null);
        term263301 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term263393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term263301, term263301.getClass(), "jsType", term263393);
        term263505 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term263505, term263505.getClass(), "compiler", null);
        setField(term263505, term263505.getClass(), "validator", null);
        setField(term263505, term263505.getClass(), "reverseInterpreter", null);
        setField(term263505, term263505.getClass(), "typeRegistry", null);
        setField(term263505, term263505.getClass(), "topScope", null);
        setField(term263505, term263505.getClass(), "scopeCreator", null);
        setField(term263505, term263505.getClass(), "reportMissingOverride", null);
        setField(term263505, term263505.getClass(), "reportUnknownTypes", null);
        setBooleanField(term263505, term263505.getClass(), "reportMissingProperties", false);
        setField(term263505, term263505.getClass(), "inferJSDocInfo", null);
        setIntField(term263505, term263505.getClass(), "typedCount", 1);
        setIntField(term263505, term263505.getClass(), "nullCount", 0);
        setIntField(term263505, term263505.getClass(), "unknownCount", 0);
        setBooleanField(term263505, term263505.getClass(), "inExterns", false);
        setIntField(term263505, term263505.getClass(), "noTypeCheckSection", 0);
        term263506 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term263507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term263506, term263506.getClass(), "str", null);
        setIntField(term263506, term263506.getClass(), "type", 64);
        setField(term263506, term263506.getClass(), "next", null);
        setField(term263506, term263506.getClass(), "first", null);
        setField(term263506, term263506.getClass(), "last", null);
        setField(term263506, term263506.getClass(), "propListHead", null);
        setIntField(term263506, term263506.getClass(), "sourcePosition", 0);
        setField(term263507, term263507.getClass(), "source", null);
        setField(term263507, term263507.getClass(), "elementsType", null);
        setField(term263507, term263507.getClass(), "elements", null);
        setField(term263507, term263507.getClass(), "className", null);
        setField(term263507, term263507.getClass(), "properties", null);
        setBooleanField(term263507, term263507.getClass(), "nativeType", false);
        setField(term263507, term263507.getClass(), "implicitPrototypeFallback", null);
        setField(term263507, term263507.getClass(), "ownerFunction", null);
        setBooleanField(term263507, term263507.getClass(), "prettyPrint", false);
        setBooleanField(term263507, term263507.getClass(), "visited", false);
        setField(term263507, term263507.getClass(), "docInfo", null);
        setBooleanField(term263507, term263507.getClass(), "unknown", false);
        setBooleanField(term263507, term263507.getClass(), "resolved", false);
        setField(term263507, term263507.getClass(), "resolveResult", null);
        setField(term263507, term263507.getClass(), "templateKeys", null);
        setField(term263507, term263507.getClass(), "templatizedTypes", null);
        setBooleanField(term263507, term263507.getClass(), "inTemplatedCheckVisit", false);
        setField(term263507, term263507.getClass(), "registry", null);
        setField(term263506, term263506.getClass(), "jsType", term263507);
        setField(term263506, term263506.getClass(), "parent", null);
        term263508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term263509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term263508, term263508.getClass(), "str", null);
        setIntField(term263508, term263508.getClass(), "type", 0);
        setField(term263508, term263508.getClass(), "next", null);
        setField(term263508, term263508.getClass(), "first", null);
        setField(term263508, term263508.getClass(), "last", null);
        setField(term263508, term263508.getClass(), "propListHead", null);
        setIntField(term263508, term263508.getClass(), "sourcePosition", 0);
        setField(term263509, term263509.getClass(), "source", null);
        setField(term263509, term263509.getClass(), "elementsType", null);
        setField(term263509, term263509.getClass(), "elements", null);
        setField(term263509, term263509.getClass(), "className", null);
        setField(term263509, term263509.getClass(), "properties", null);
        setBooleanField(term263509, term263509.getClass(), "nativeType", false);
        setField(term263509, term263509.getClass(), "implicitPrototypeFallback", null);
        setField(term263509, term263509.getClass(), "ownerFunction", null);
        setBooleanField(term263509, term263509.getClass(), "prettyPrint", false);
        setBooleanField(term263509, term263509.getClass(), "visited", false);
        setField(term263509, term263509.getClass(), "docInfo", null);
        setBooleanField(term263509, term263509.getClass(), "unknown", false);
        setBooleanField(term263509, term263509.getClass(), "resolved", false);
        setField(term263509, term263509.getClass(), "resolveResult", null);
        setField(term263509, term263509.getClass(), "templateKeys", null);
        setField(term263509, term263509.getClass(), "templatizedTypes", null);
        setBooleanField(term263509, term263509.getClass(), "inTemplatedCheckVisit", false);
        setField(term263509, term263509.getClass(), "registry", null);
        setField(term263508, term263508.getClass(), "jsType", term263509);
        setField(term263508, term263508.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term263209;
        args[2] = term263301;
        callMethod(klass, "visit", argTypes, term263117, args);
        assertTrue(recursiveEquals(term263117, term263505));
        assertTrue(recursiveEquals(term263209, term263508));
        assertTrue(recursiveEquals(term263301, null));
    }

};


