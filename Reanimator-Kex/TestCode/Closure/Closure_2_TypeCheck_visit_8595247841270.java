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

public class TypeCheck_visit_8595247841270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381447;
     Object term381539;
     Object term381631;
     Object term381817;
     Object term381818;
     Object term381820;

    public TypeCheck_visit_8595247841270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381447 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term381447, term381447.getClass(), "inExterns", true);
        term381539 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term381539, term381539.getClass(), "type", 64);
        setField(term381539, term381539.getClass(), "jsType", null);
        setField(term381539, term381539.getClass(), "propListHead", null);
        setField(term381539, term381539.getClass(), "first", null);
        term381631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term381723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term381631, term381631.getClass(), "jsType", term381723);
        term381817 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term381817, term381817.getClass(), "compiler", null);
        setField(term381817, term381817.getClass(), "validator", null);
        setField(term381817, term381817.getClass(), "reverseInterpreter", null);
        setField(term381817, term381817.getClass(), "typeRegistry", null);
        setField(term381817, term381817.getClass(), "topScope", null);
        setField(term381817, term381817.getClass(), "scopeCreator", null);
        setField(term381817, term381817.getClass(), "reportMissingOverride", null);
        setField(term381817, term381817.getClass(), "reportUnknownTypes", null);
        setBooleanField(term381817, term381817.getClass(), "reportMissingProperties", false);
        setField(term381817, term381817.getClass(), "inferJSDocInfo", null);
        setIntField(term381817, term381817.getClass(), "typedCount", 0);
        setIntField(term381817, term381817.getClass(), "nullCount", 0);
        setIntField(term381817, term381817.getClass(), "unknownCount", 0);
        setBooleanField(term381817, term381817.getClass(), "inExterns", true);
        setIntField(term381817, term381817.getClass(), "noTypeCheckSection", 0);
        term381818 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term381819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term381818, term381818.getClass(), "str", null);
        setIntField(term381818, term381818.getClass(), "type", 64);
        setField(term381818, term381818.getClass(), "next", null);
        setField(term381818, term381818.getClass(), "first", null);
        setField(term381818, term381818.getClass(), "last", null);
        setField(term381818, term381818.getClass(), "propListHead", null);
        setIntField(term381818, term381818.getClass(), "sourcePosition", 0);
        setField(term381819, term381819.getClass(), "source", null);
        setField(term381819, term381819.getClass(), "elementsType", null);
        setField(term381819, term381819.getClass(), "elements", null);
        setField(term381819, term381819.getClass(), "className", null);
        setField(term381819, term381819.getClass(), "properties", null);
        setBooleanField(term381819, term381819.getClass(), "nativeType", false);
        setField(term381819, term381819.getClass(), "implicitPrototypeFallback", null);
        setField(term381819, term381819.getClass(), "ownerFunction", null);
        setBooleanField(term381819, term381819.getClass(), "prettyPrint", false);
        setBooleanField(term381819, term381819.getClass(), "visited", false);
        setField(term381819, term381819.getClass(), "docInfo", null);
        setBooleanField(term381819, term381819.getClass(), "unknown", false);
        setBooleanField(term381819, term381819.getClass(), "resolved", false);
        setField(term381819, term381819.getClass(), "resolveResult", null);
        setField(term381819, term381819.getClass(), "templateKeys", null);
        setField(term381819, term381819.getClass(), "templatizedTypes", null);
        setBooleanField(term381819, term381819.getClass(), "inTemplatedCheckVisit", false);
        setField(term381819, term381819.getClass(), "registry", null);
        setField(term381818, term381818.getClass(), "jsType", term381819);
        setField(term381818, term381818.getClass(), "parent", null);
        term381820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term381821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term381820, term381820.getClass(), "str", null);
        setIntField(term381820, term381820.getClass(), "type", 0);
        setField(term381820, term381820.getClass(), "next", null);
        setField(term381820, term381820.getClass(), "first", null);
        setField(term381820, term381820.getClass(), "last", null);
        setField(term381820, term381820.getClass(), "propListHead", null);
        setIntField(term381820, term381820.getClass(), "sourcePosition", 0);
        setField(term381821, term381821.getClass(), "source", null);
        setField(term381821, term381821.getClass(), "elementsType", null);
        setField(term381821, term381821.getClass(), "elements", null);
        setField(term381821, term381821.getClass(), "className", null);
        setField(term381821, term381821.getClass(), "properties", null);
        setBooleanField(term381821, term381821.getClass(), "nativeType", false);
        setField(term381821, term381821.getClass(), "implicitPrototypeFallback", null);
        setField(term381821, term381821.getClass(), "ownerFunction", null);
        setBooleanField(term381821, term381821.getClass(), "prettyPrint", false);
        setBooleanField(term381821, term381821.getClass(), "visited", false);
        setField(term381821, term381821.getClass(), "docInfo", null);
        setBooleanField(term381821, term381821.getClass(), "unknown", false);
        setBooleanField(term381821, term381821.getClass(), "resolved", false);
        setField(term381821, term381821.getClass(), "resolveResult", null);
        setField(term381821, term381821.getClass(), "templateKeys", null);
        setField(term381821, term381821.getClass(), "templatizedTypes", null);
        setBooleanField(term381821, term381821.getClass(), "inTemplatedCheckVisit", false);
        setField(term381821, term381821.getClass(), "registry", null);
        setField(term381820, term381820.getClass(), "jsType", term381821);
        setField(term381820, term381820.getClass(), "parent", null);
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
        args[1] = term381539;
        args[2] = term381631;
        callMethod(klass, "visit", argTypes, term381447, args);
        assertTrue(recursiveEquals(term381447, term381817));
        assertTrue(recursiveEquals(term381539, term381820));
        assertTrue(recursiveEquals(term381631, null));
    }

};


