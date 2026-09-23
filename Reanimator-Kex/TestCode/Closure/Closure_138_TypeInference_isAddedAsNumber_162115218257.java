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

public class TypeInference_isAddedAsNumber_162115218257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6524;

    public TypeInference_isAddedAsNumber_162115218257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6527 = new HashMap();
        HashMap term6536 = new HashMap();
        Set<Object> term30999 =  ((Map) term6536).keySet();
        HashSet term6535 = new HashSet((Collection<? extends Object>) term30999);
        HashMap term6543 = new HashMap();
        Set<Object> term31000 =  ((Map) term6543).keySet();
        HashSet term6542 = new HashSet((Collection<? extends Object>) term31000);
        HashMap term6550 = new HashMap();
        Set<Object> term31001 =  ((Map) term6550).keySet();
        HashSet term6549 = new HashSet((Collection<? extends Object>) term31001);
        HashMap term6556 = new HashMap();
        HashMap term6561 = new HashMap();
        Class<? extends Object> term31023 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term31022 = ((Class) term31023).getDeclaredField((String) "PROTECTED");
        ((Field) term31022).setAccessible(true);
        Object enum68 = ((Field) term31022).get((Object) null);
        term6524 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6526 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term6582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6596 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6597 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6598 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6603 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6604 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6608 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term6524, term6524.getClass(), "compiler", null);
        setField(term6525, term6525.getClass(), "reporter", null);
        setField(term6525, term6525.getClass(), "nativeTypes", term6526);
        setField(term6525, term6525.getClass(), "namesToTypes", term6527);
        setField(term6525, term6525.getClass(), "namespaces", term6535);
        setField(term6525, term6525.getClass(), "enumTypeNames", term6542);
        setField(term6525, term6525.getClass(), "forwardDeclaredTypes", term6549);
        setField(term6525, term6525.getClass(), "typesIndexedByProperty", term6556);
        setField(term6525, term6525.getClass(), "greatestSubtypeByProperty", term6561);
        setField(term6525, term6525.getClass(), "interfaceToImplementors", null);
        setField(term6525, term6525.getClass(), "unresolvedNamedTypes", null);
        setField(term6525, term6525.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6525, term6525.getClass(), "lastGeneration", false);
        setField(term6525, term6525.getClass(), "templateTypeName", "dJGPlmSRnz");
        setField(term6582, term6582.getClass(), "name", "DPskuFUobI");
        setField(term6582, term6582.getClass(), "referencedType", null);
        setBooleanField(term6582, term6582.getClass(), "visited", false);
        setField(term6597, term6597.getClass(), "baseType", null);
        setField(term6597, term6597.getClass(), "implementedInterfaces", null);
        setField(term6597, term6597.getClass(), "parameters", null);
        setField(term6597, term6597.getClass(), "thrownTypes", null);
        setField(term6597, term6597.getClass(), "templateTypeName", null);
        setField(term6597, term6597.getClass(), "description", null);
        setField(term6597, term6597.getClass(), "deprecated", null);
        setField(term6597, term6597.getClass(), "license", null);
        setField(term6597, term6597.getClass(), "suppressions", null);
        setField(term6596, term6596.getClass(), "info", term6597);
        setField(term6598, term6598.getClass(), "markers", null);
        setField(term6598, term6598.getClass(), "parameters", null);
        setField(term6598, term6598.getClass(), "throwsDescriptions", null);
        setField(term6598, term6598.getClass(), "blockDescription", null);
        setField(term6598, term6598.getClass(), "fileOverview", null);
        setField(term6598, term6598.getClass(), "returnDescription", null);
        setField(term6598, term6598.getClass(), "version", null);
        setField(term6598, term6598.getClass(), "authors", null);
        setField(term6598, term6598.getClass(), "sees", null);
        setField(term6596, term6596.getClass(), "documentation", term6598);
        setField(term6596, term6596.getClass(), "sourceName", "");
        setField(term6596, term6596.getClass(), "visibility", enum68);
        setIntField(term6596, term6596.getClass(), "bitset", -1122880881);
        setField(term6603, term6603.getClass(), "root", null);
        setField(term6603, term6603.getClass(), "sourceName", null);
        setField(term6603, term6603.getClass(), "registry", null);
        setField(term6596, term6596.getClass(), "type", term6603);
        setField(term6604, term6604.getClass(), "root", null);
        setField(term6604, term6604.getClass(), "sourceName", null);
        setField(term6604, term6604.getClass(), "registry", null);
        setField(term6596, term6596.getClass(), "thisType", term6604);
        setBooleanField(term6596, term6596.getClass(), "includeDocumentation", true);
        setField(term6582, term6582.getClass(), "docInfo", term6596);
        setBooleanField(term6582, term6582.getClass(), "unknown", false);
        setBooleanField(term6582, term6582.getClass(), "resolved", true);
        setField(term6582, term6582.getClass(), "resolveResult", null);
        setField(term6582, term6582.getClass(), "registry", null);
        setField(term6525, term6525.getClass(), "templateType", term6582);
        setField(term6524, term6524.getClass(), "registry", term6525);
        setField(term6524, term6524.getClass(), "reverseInterpreter", null);
        setField(term6608, term6608.getClass(), "vars", null);
        setField(term6608, term6608.getClass(), "parent", null);
        setField(term6608, term6608.getClass(), "rootNode", null);
        setField(term6608, term6608.getClass(), "thisType", null);
        setBooleanField(term6608, term6608.getClass(), "isBottom", false);
        setField(term6524, term6524.getClass(), "syntacticScope", term6608);
        setField(term6524, term6524.getClass(), "functionScope", null);
        setField(term6524, term6524.getClass(), "bottomScope", null);
        setField(term6524, term6524.getClass(), "assignedOuterLocalVars", null);
        setField(term6524, term6524.getClass(), "unflowableVarNames", null);
        setField(term6524, term6524.getClass(), "cfg", null);
        setField(term6524, term6524.getClass(), "joinOp", null);
        setField(term6524, term6524.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isAddedAsNumber", argTypes, term6524, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


