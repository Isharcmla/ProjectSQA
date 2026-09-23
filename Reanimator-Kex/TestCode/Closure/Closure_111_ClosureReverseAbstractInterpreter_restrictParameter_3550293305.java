package com.google.javascript.jscomp.type;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class ClosureReverseAbstractInterpreter_restrictParameter_3550293305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;
     Object term523;
     Object term550;

    public ClosureReverseAbstractInterpreter_restrictParameter_3550293305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term489 = new HashMap();
        term488 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term509 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term488, term488.getClass(), "restrictToArrayVisitor", null);
        setField(term488, term488.getClass(), "restrictToNotArrayVisitor", null);
        setField(term488, term488.getClass(), "restrictToObjectVisitor", null);
        setField(term488, term488.getClass(), "restrictToNotObjectVisitor", null);
        setField(term488, term488.getClass(), "restricters", term489);
        setField(term488, term488.getClass(), "convention", null);
        setField(term495, term495.getClass(), "name", "dWRymuLBtr");
        setField(term495, term495.getClass(), "referencedType", null);
        setField(term495, term495.getClass(), "referencedObjType", null);
        setBooleanField(term495, term495.getClass(), "visited", false);
        setField(term509, term509.getClass(), "info", null);
        setField(term509, term509.getClass(), "documentation", null);
        setField(term509, term509.getClass(), "associatedNode", null);
        setField(term509, term509.getClass(), "visibility", null);
        setIntField(term509, term509.getClass(), "bitset", 0);
        setField(term509, term509.getClass(), "type", null);
        setField(term509, term509.getClass(), "thisType", null);
        setBooleanField(term509, term509.getClass(), "includeDocumentation", false);
        setIntField(term509, term509.getClass(), "originalCommentPosition", 0);
        setField(term495, term495.getClass(), "docInfo", term509);
        setBooleanField(term495, term495.getClass(), "unknown", false);
        setBooleanField(term495, term495.getClass(), "resolved", true);
        setField(term495, term495.getClass(), "resolveResult", null);
        setField(term495, term495.getClass(), "templateTypeMap", null);
        setBooleanField(term495, term495.getClass(), "inTemplatedCheckVisit", false);
        setField(term495, term495.getClass(), "registry", null);
        setField(term494, term494.getClass(), "objectIndexTemplateKey", term495);
        setField(term516, term516.getClass(), "name", null);
        setField(term516, term516.getClass(), "referencedType", null);
        setField(term516, term516.getClass(), "referencedObjType", null);
        setBooleanField(term516, term516.getClass(), "visited", false);
        setField(term516, term516.getClass(), "docInfo", null);
        setBooleanField(term516, term516.getClass(), "unknown", false);
        setBooleanField(term516, term516.getClass(), "resolved", false);
        setField(term516, term516.getClass(), "resolveResult", null);
        setField(term516, term516.getClass(), "templateTypeMap", null);
        setBooleanField(term516, term516.getClass(), "inTemplatedCheckVisit", false);
        setField(term516, term516.getClass(), "registry", null);
        setField(term494, term494.getClass(), "objectElementTemplateKey", term516);
        setField(term494, term494.getClass(), "reporter", null);
        setField(term494, term494.getClass(), "nativeTypes", null);
        setField(term494, term494.getClass(), "namesToTypes", null);
        setField(term494, term494.getClass(), "namespaces", null);
        setField(term494, term494.getClass(), "nonNullableTypeNames", null);
        setField(term494, term494.getClass(), "forwardDeclaredTypes", null);
        setField(term494, term494.getClass(), "typesIndexedByProperty", null);
        setField(term494, term494.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term494, term494.getClass(), "greatestSubtypeByProperty", null);
        setField(term494, term494.getClass(), "interfaceToImplementors", null);
        setField(term494, term494.getClass(), "unresolvedNamedTypes", null);
        setField(term494, term494.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term494, term494.getClass(), "lastGeneration", false);
        setField(term494, term494.getClass(), "templateTypes", null);
        setField(term494, term494.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term494, term494.getClass(), "tolerateUndefinedValues", false);
        setField(term488, term488.getClass(), "typeRegistry", term494);
        setField(term488, term488.getClass(), "firstLink", null);
        setField(term488, term488.getClass(), "nextLink", null);
        setField(term488, term488.getClass(), "restrictUndefinedVisitor", null);
        setField(term488, term488.getClass(), "restrictNullVisitor", null);
        term523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term523, term523.getClass(), "type", -1685132342);
        setIntField(term525, term525.getClass(), "type", -1456670397);
        setIntField(term527, term527.getClass(), "type", 1622346318);
        setIntField(term529, term529.getClass(), "type", 1048535127);
        setIntField(term531, term531.getClass(), "type", -655067527);
        setField(term531, term531.getClass(), "next", null);
        setField(term531, term531.getClass(), "first", null);
        setField(term531, term531.getClass(), "last", null);
        setField(term531, term531.getClass(), "propListHead", null);
        setIntField(term531, term531.getClass(), "sourcePosition", 0);
        setField(term531, term531.getClass(), "jsType", null);
        setField(term531, term531.getClass(), "parent", null);
        setField(term529, term529.getClass(), "next", term531);
        setIntField(term534, term534.getClass(), "type", -6029667);
        setField(term534, term534.getClass(), "next", null);
        setField(term534, term534.getClass(), "first", null);
        setField(term534, term534.getClass(), "last", term531);
        setField(term534, term534.getClass(), "propListHead", null);
        setIntField(term534, term534.getClass(), "sourcePosition", 0);
        setField(term534, term534.getClass(), "jsType", null);
        setField(term534, term534.getClass(), "parent", null);
        setField(term529, term529.getClass(), "first", term534);
        setField(term529, term529.getClass(), "last", term527);
        setField(term529, term529.getClass(), "propListHead", null);
        setIntField(term529, term529.getClass(), "sourcePosition", 0);
        setField(term529, term529.getClass(), "jsType", null);
        setField(term529, term529.getClass(), "parent", null);
        setField(term527, term527.getClass(), "next", term529);
        setField(term527, term527.getClass(), "first", term531);
        setIntField(term538, term538.getClass(), "type", -117576464);
        setIntField(term540, term540.getClass(), "type", -1007160944);
        setField(term540, term540.getClass(), "next", null);
        setField(term540, term540.getClass(), "first", term534);
        setField(term540, term540.getClass(), "last", term529);
        setField(term540, term540.getClass(), "propListHead", null);
        setIntField(term540, term540.getClass(), "sourcePosition", 0);
        setField(term540, term540.getClass(), "jsType", null);
        setField(term540, term540.getClass(), "parent", null);
        setField(term538, term538.getClass(), "next", term540);
        setField(term538, term538.getClass(), "first", term525);
        setField(term538, term538.getClass(), "last", term525);
        setField(term538, term538.getClass(), "propListHead", null);
        setIntField(term538, term538.getClass(), "sourcePosition", 0);
        setField(term538, term538.getClass(), "jsType", null);
        setField(term538, term538.getClass(), "parent", null);
        setField(term527, term527.getClass(), "last", term538);
        setField(term527, term527.getClass(), "propListHead", null);
        setIntField(term527, term527.getClass(), "sourcePosition", 0);
        setField(term527, term527.getClass(), "jsType", null);
        setField(term527, term527.getClass(), "parent", null);
        setField(term525, term525.getClass(), "next", term527);
        setIntField(term545, term545.getClass(), "type", 1135664017);
        setField(term545, term545.getClass(), "next", term538);
        setField(term545, term545.getClass(), "first", term540);
        setField(term545, term545.getClass(), "last", term523);
        setField(term545, term545.getClass(), "propListHead", null);
        setIntField(term545, term545.getClass(), "sourcePosition", 0);
        setField(term545, term545.getClass(), "jsType", null);
        setField(term545, term545.getClass(), "parent", null);
        setField(term525, term525.getClass(), "first", term545);
        setField(term525, term525.getClass(), "last", term545);
        setField(term525, term525.getClass(), "propListHead", null);
        setIntField(term525, term525.getClass(), "sourcePosition", 0);
        setField(term525, term525.getClass(), "jsType", null);
        setField(term525, term525.getClass(), "parent", null);
        setField(term523, term523.getClass(), "next", term525);
        setField(term523, term523.getClass(), "first", term529);
        setField(term523, term523.getClass(), "last", term531);
        setField(term523, term523.getClass(), "propListHead", null);
        setIntField(term523, term523.getClass(), "sourcePosition", 0);
        setField(term523, term523.getClass(), "jsType", null);
        setField(term523, term523.getClass(), "parent", null);
        term550 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[3] = Class.forName("com.google.common.base.Function");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term523;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term550;
        try {
            callMethod(klass, "restrictParameter", argTypes, term488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


