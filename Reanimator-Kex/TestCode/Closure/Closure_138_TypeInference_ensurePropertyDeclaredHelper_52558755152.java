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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_ensurePropertyDeclaredHelper_52558755152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4502;
     Object term4587;

    public TypeInference_ensurePropertyDeclaredHelper_52558755152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4505 = new HashMap();
        HashMap term4514 = new HashMap();
        Set<Object> term27187 =  ((Map) term4514).keySet();
        HashSet term4513 = new HashSet((Collection<? extends Object>) term27187);
        HashMap term4520 = new HashMap();
        Set<Object> term27188 =  ((Map) term4520).keySet();
        HashSet term4519 = new HashSet((Collection<? extends Object>) term27188);
        HashMap term4527 = new HashMap();
        Set<Object> term27189 =  ((Map) term4527).keySet();
        HashSet term4526 = new HashSet((Collection<? extends Object>) term27189);
        HashMap term4533 = new HashMap();
        HashMap term4538 = new HashMap();
        Class<? extends Object> term27211 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term27210 = ((Class) term27211).getDeclaredField((String) "PRIVATE");
        ((Field) term27210).setAccessible(true);
        Object enum61 = ((Field) term27210).get((Object) null);
        term4502 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4504 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term4559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4573 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4574 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term4575 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term4580 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4581 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4585 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4502, term4502.getClass(), "compiler", null);
        setField(term4503, term4503.getClass(), "reporter", null);
        setField(term4503, term4503.getClass(), "nativeTypes", term4504);
        setField(term4503, term4503.getClass(), "namesToTypes", term4505);
        setField(term4503, term4503.getClass(), "namespaces", term4513);
        setField(term4503, term4503.getClass(), "enumTypeNames", term4519);
        setField(term4503, term4503.getClass(), "forwardDeclaredTypes", term4526);
        setField(term4503, term4503.getClass(), "typesIndexedByProperty", term4533);
        setField(term4503, term4503.getClass(), "greatestSubtypeByProperty", term4538);
        setField(term4503, term4503.getClass(), "interfaceToImplementors", null);
        setField(term4503, term4503.getClass(), "unresolvedNamedTypes", null);
        setField(term4503, term4503.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4503, term4503.getClass(), "lastGeneration", false);
        setField(term4503, term4503.getClass(), "templateTypeName", "HDaezxQfQR");
        setField(term4559, term4559.getClass(), "name", "iikZEapDlu");
        setField(term4559, term4559.getClass(), "referencedType", null);
        setBooleanField(term4559, term4559.getClass(), "visited", false);
        setField(term4574, term4574.getClass(), "baseType", null);
        setField(term4574, term4574.getClass(), "implementedInterfaces", null);
        setField(term4574, term4574.getClass(), "parameters", null);
        setField(term4574, term4574.getClass(), "thrownTypes", null);
        setField(term4574, term4574.getClass(), "templateTypeName", null);
        setField(term4574, term4574.getClass(), "description", null);
        setField(term4574, term4574.getClass(), "deprecated", null);
        setField(term4574, term4574.getClass(), "license", null);
        setField(term4574, term4574.getClass(), "suppressions", null);
        setField(term4573, term4573.getClass(), "info", term4574);
        setField(term4575, term4575.getClass(), "markers", null);
        setField(term4575, term4575.getClass(), "parameters", null);
        setField(term4575, term4575.getClass(), "throwsDescriptions", null);
        setField(term4575, term4575.getClass(), "blockDescription", null);
        setField(term4575, term4575.getClass(), "fileOverview", null);
        setField(term4575, term4575.getClass(), "returnDescription", null);
        setField(term4575, term4575.getClass(), "version", null);
        setField(term4575, term4575.getClass(), "authors", null);
        setField(term4575, term4575.getClass(), "sees", null);
        setField(term4573, term4573.getClass(), "documentation", term4575);
        setField(term4573, term4573.getClass(), "sourceName", "");
        setField(term4573, term4573.getClass(), "visibility", enum61);
        setIntField(term4573, term4573.getClass(), "bitset", -461771056);
        setField(term4580, term4580.getClass(), "root", null);
        setField(term4580, term4580.getClass(), "sourceName", null);
        setField(term4580, term4580.getClass(), "registry", null);
        setField(term4573, term4573.getClass(), "type", term4580);
        setField(term4581, term4581.getClass(), "root", null);
        setField(term4581, term4581.getClass(), "sourceName", null);
        setField(term4581, term4581.getClass(), "registry", null);
        setField(term4573, term4573.getClass(), "thisType", term4581);
        setBooleanField(term4573, term4573.getClass(), "includeDocumentation", true);
        setField(term4559, term4559.getClass(), "docInfo", term4573);
        setBooleanField(term4559, term4559.getClass(), "unknown", false);
        setBooleanField(term4559, term4559.getClass(), "resolved", false);
        setField(term4559, term4559.getClass(), "resolveResult", null);
        setField(term4559, term4559.getClass(), "registry", null);
        setField(term4503, term4503.getClass(), "templateType", term4559);
        setField(term4502, term4502.getClass(), "registry", term4503);
        setField(term4502, term4502.getClass(), "reverseInterpreter", null);
        setField(term4585, term4585.getClass(), "vars", null);
        setField(term4585, term4585.getClass(), "parent", null);
        setField(term4585, term4585.getClass(), "rootNode", null);
        setField(term4585, term4585.getClass(), "thisType", null);
        setBooleanField(term4585, term4585.getClass(), "isBottom", false);
        setField(term4502, term4502.getClass(), "syntacticScope", term4585);
        setField(term4502, term4502.getClass(), "functionScope", null);
        setField(term4502, term4502.getClass(), "bottomScope", null);
        setField(term4502, term4502.getClass(), "assignedOuterLocalVars", null);
        setField(term4502, term4502.getClass(), "unflowableVarNames", null);
        setField(term4502, term4502.getClass(), "cfg", null);
        setField(term4502, term4502.getClass(), "joinOp", null);
        setField(term4502, term4502.getClass(), "orderedWorkSet", null);
        term4587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4600 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4610 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4587, term4587.getClass(), "type", 1296895584);
        setIntField(term4589, term4589.getClass(), "type", -601863069);
        setIntField(term4591, term4591.getClass(), "type", 0);
        setField(term4591, term4591.getClass(), "next", null);
        setField(term4591, term4591.getClass(), "first", null);
        setField(term4591, term4591.getClass(), "last", null);
        setField(term4591, term4591.getClass(), "propListHead", null);
        setIntField(term4591, term4591.getClass(), "sourcePosition", 0);
        setField(term4591, term4591.getClass(), "jsType", null);
        setField(term4591, term4591.getClass(), "parent", null);
        setField(term4589, term4589.getClass(), "next", term4591);
        setIntField(term4594, term4594.getClass(), "type", 0);
        setField(term4594, term4594.getClass(), "next", null);
        setField(term4594, term4594.getClass(), "first", null);
        setField(term4594, term4594.getClass(), "last", null);
        setField(term4594, term4594.getClass(), "propListHead", null);
        setIntField(term4594, term4594.getClass(), "sourcePosition", 0);
        setField(term4594, term4594.getClass(), "jsType", null);
        setField(term4594, term4594.getClass(), "parent", null);
        setField(term4589, term4589.getClass(), "first", term4594);
        setIntField(term4597, term4597.getClass(), "type", 0);
        setField(term4597, term4597.getClass(), "next", null);
        setField(term4597, term4597.getClass(), "first", null);
        setField(term4597, term4597.getClass(), "last", null);
        setField(term4597, term4597.getClass(), "propListHead", null);
        setIntField(term4597, term4597.getClass(), "sourcePosition", 0);
        setField(term4597, term4597.getClass(), "jsType", null);
        setField(term4597, term4597.getClass(), "parent", null);
        setField(term4589, term4589.getClass(), "last", term4597);
        setField(term4600, term4600.getClass(), "next", null);
        setIntField(term4600, term4600.getClass(), "type", 0);
        setIntField(term4600, term4600.getClass(), "intValue", 0);
        setField(term4600, term4600.getClass(), "objectValue", null);
        setField(term4589, term4589.getClass(), "propListHead", term4600);
        setIntField(term4589, term4589.getClass(), "sourcePosition", -2066804303);
        setField(term4589, term4589.getClass(), "jsType", null);
        setField(term4589, term4589.getClass(), "parent", null);
        setField(term4587, term4587.getClass(), "next", term4589);
        setIntField(term4604, term4604.getClass(), "type", 0);
        setField(term4604, term4604.getClass(), "next", null);
        setField(term4604, term4604.getClass(), "first", null);
        setField(term4604, term4604.getClass(), "last", null);
        setField(term4604, term4604.getClass(), "propListHead", null);
        setIntField(term4604, term4604.getClass(), "sourcePosition", 0);
        setField(term4604, term4604.getClass(), "jsType", null);
        setField(term4604, term4604.getClass(), "parent", null);
        setField(term4587, term4587.getClass(), "first", term4604);
        setIntField(term4607, term4607.getClass(), "type", 0);
        setField(term4607, term4607.getClass(), "next", null);
        setField(term4607, term4607.getClass(), "first", null);
        setField(term4607, term4607.getClass(), "last", null);
        setField(term4607, term4607.getClass(), "propListHead", null);
        setIntField(term4607, term4607.getClass(), "sourcePosition", 0);
        setField(term4607, term4607.getClass(), "jsType", null);
        setField(term4607, term4607.getClass(), "parent", null);
        setField(term4587, term4587.getClass(), "last", term4607);
        setField(term4610, term4610.getClass(), "next", null);
        setIntField(term4610, term4610.getClass(), "type", 0);
        setIntField(term4610, term4610.getClass(), "intValue", 0);
        setField(term4610, term4610.getClass(), "objectValue", null);
        setField(term4587, term4587.getClass(), "propListHead", term4610);
        setIntField(term4587, term4587.getClass(), "sourcePosition", -1731761810);
        setField(term4587, term4587.getClass(), "jsType", null);
        setField(term4587, term4587.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[2];
        args[0] = term4587;
        args[1] = null;
        try {
            callMethod(klass, "ensurePropertyDeclaredHelper", argTypes, term4502, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


