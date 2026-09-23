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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_redeclare_54722746875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15319;

    public TypeInference_redeclare_54722746875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15322 = new HashMap();
        HashMap term15331 = new HashMap();
        Set<Object> term49106 =  ((Map) term15331).keySet();
        HashSet term15330 = new HashSet((Collection<? extends Object>) term49106);
        HashMap term15338 = new HashMap();
        Set<Object> term49107 =  ((Map) term15338).keySet();
        HashSet term15337 = new HashSet((Collection<? extends Object>) term49107);
        HashMap term15345 = new HashMap();
        Set<Object> term49108 =  ((Map) term15345).keySet();
        HashSet term15344 = new HashSet((Collection<? extends Object>) term49108);
        HashMap term15351 = new HashMap();
        HashMap term15356 = new HashMap();
        Class<? extends Object> term49130 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term49129 = ((Class) term49130).getDeclaredField((String) "PRIVATE");
        ((Field) term49129).setAccessible(true);
        Object enum113 = ((Field) term49129).get((Object) null);
        term15319 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term15320 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term15321 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term15377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term15391 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15392 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term15393 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term15398 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15399 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15403 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term15319, term15319.getClass(), "compiler", null);
        setField(term15320, term15320.getClass(), "reporter", null);
        setField(term15320, term15320.getClass(), "nativeTypes", term15321);
        setField(term15320, term15320.getClass(), "namesToTypes", term15322);
        setField(term15320, term15320.getClass(), "namespaces", term15330);
        setField(term15320, term15320.getClass(), "enumTypeNames", term15337);
        setField(term15320, term15320.getClass(), "forwardDeclaredTypes", term15344);
        setField(term15320, term15320.getClass(), "typesIndexedByProperty", term15351);
        setField(term15320, term15320.getClass(), "greatestSubtypeByProperty", term15356);
        setField(term15320, term15320.getClass(), "interfaceToImplementors", null);
        setField(term15320, term15320.getClass(), "unresolvedNamedTypes", null);
        setField(term15320, term15320.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15320, term15320.getClass(), "lastGeneration", true);
        setField(term15320, term15320.getClass(), "templateTypeName", "GSzQdbHLHw");
        setField(term15377, term15377.getClass(), "name", "IkfarsYNJO");
        setField(term15377, term15377.getClass(), "referencedType", null);
        setBooleanField(term15377, term15377.getClass(), "visited", false);
        setField(term15392, term15392.getClass(), "baseType", null);
        setField(term15392, term15392.getClass(), "implementedInterfaces", null);
        setField(term15392, term15392.getClass(), "parameters", null);
        setField(term15392, term15392.getClass(), "thrownTypes", null);
        setField(term15392, term15392.getClass(), "templateTypeName", null);
        setField(term15392, term15392.getClass(), "description", null);
        setField(term15392, term15392.getClass(), "deprecated", null);
        setField(term15392, term15392.getClass(), "license", null);
        setField(term15392, term15392.getClass(), "suppressions", null);
        setField(term15391, term15391.getClass(), "info", term15392);
        setField(term15393, term15393.getClass(), "markers", null);
        setField(term15393, term15393.getClass(), "parameters", null);
        setField(term15393, term15393.getClass(), "throwsDescriptions", null);
        setField(term15393, term15393.getClass(), "blockDescription", null);
        setField(term15393, term15393.getClass(), "fileOverview", null);
        setField(term15393, term15393.getClass(), "returnDescription", null);
        setField(term15393, term15393.getClass(), "version", null);
        setField(term15393, term15393.getClass(), "authors", null);
        setField(term15393, term15393.getClass(), "sees", null);
        setField(term15391, term15391.getClass(), "documentation", term15393);
        setField(term15391, term15391.getClass(), "sourceName", "");
        setField(term15391, term15391.getClass(), "visibility", enum113);
        setIntField(term15391, term15391.getClass(), "bitset", -688213483);
        setField(term15398, term15398.getClass(), "root", null);
        setField(term15398, term15398.getClass(), "sourceName", null);
        setField(term15398, term15398.getClass(), "registry", null);
        setField(term15391, term15391.getClass(), "type", term15398);
        setField(term15399, term15399.getClass(), "root", null);
        setField(term15399, term15399.getClass(), "sourceName", null);
        setField(term15399, term15399.getClass(), "registry", null);
        setField(term15391, term15391.getClass(), "thisType", term15399);
        setBooleanField(term15391, term15391.getClass(), "includeDocumentation", false);
        setField(term15377, term15377.getClass(), "docInfo", term15391);
        setBooleanField(term15377, term15377.getClass(), "unknown", true);
        setBooleanField(term15377, term15377.getClass(), "resolved", false);
        setField(term15377, term15377.getClass(), "resolveResult", null);
        setField(term15377, term15377.getClass(), "registry", null);
        setField(term15320, term15320.getClass(), "templateType", term15377);
        setField(term15319, term15319.getClass(), "registry", term15320);
        setField(term15319, term15319.getClass(), "reverseInterpreter", null);
        setField(term15403, term15403.getClass(), "vars", null);
        setField(term15403, term15403.getClass(), "parent", null);
        setField(term15403, term15403.getClass(), "rootNode", null);
        setField(term15403, term15403.getClass(), "thisType", null);
        setBooleanField(term15403, term15403.getClass(), "isBottom", false);
        setField(term15319, term15319.getClass(), "syntacticScope", term15403);
        setField(term15319, term15319.getClass(), "functionScope", null);
        setField(term15319, term15319.getClass(), "bottomScope", null);
        setField(term15319, term15319.getClass(), "assignedOuterLocalVars", null);
        setField(term15319, term15319.getClass(), "unflowableVarNames", null);
        setField(term15319, term15319.getClass(), "cfg", null);
        setField(term15319, term15319.getClass(), "joinOp", null);
        setField(term15319, term15319.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "YfkhviKZwl";
        args[2] = null;
        try {
            callMethod(klass, "redeclare", argTypes, term15319, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


