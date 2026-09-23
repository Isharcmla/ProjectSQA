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

public class TypeInference_ensurePropertyDefined_126006303650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3689;
     Object term3774;

    public TypeInference_ensurePropertyDefined_126006303650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3692 = new HashMap();
        HashMap term3701 = new HashMap();
        Set<Object> term25906 =  ((Map) term3701).keySet();
        HashSet term3700 = new HashSet((Collection<? extends Object>) term25906);
        HashMap term3708 = new HashMap();
        Set<Object> term25907 =  ((Map) term3708).keySet();
        HashSet term3707 = new HashSet((Collection<? extends Object>) term25907);
        HashMap term3714 = new HashMap();
        Set<Object> term25908 =  ((Map) term3714).keySet();
        HashSet term3713 = new HashSet((Collection<? extends Object>) term25908);
        HashMap term3720 = new HashMap();
        HashMap term3725 = new HashMap();
        Class<? extends Object> term25930 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term25929 = ((Class) term25930).getDeclaredField((String) "PRIVATE");
        ((Field) term25929).setAccessible(true);
        Object enum59 = ((Field) term25929).get((Object) null);
        term3689 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term3690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3691 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term3746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3760 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term3761 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term3762 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term3767 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3768 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3772 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term3689, term3689.getClass(), "compiler", null);
        setField(term3690, term3690.getClass(), "reporter", null);
        setField(term3690, term3690.getClass(), "nativeTypes", term3691);
        setField(term3690, term3690.getClass(), "namesToTypes", term3692);
        setField(term3690, term3690.getClass(), "namespaces", term3700);
        setField(term3690, term3690.getClass(), "enumTypeNames", term3707);
        setField(term3690, term3690.getClass(), "forwardDeclaredTypes", term3713);
        setField(term3690, term3690.getClass(), "typesIndexedByProperty", term3720);
        setField(term3690, term3690.getClass(), "greatestSubtypeByProperty", term3725);
        setField(term3690, term3690.getClass(), "interfaceToImplementors", null);
        setField(term3690, term3690.getClass(), "unresolvedNamedTypes", null);
        setField(term3690, term3690.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3690, term3690.getClass(), "lastGeneration", true);
        setField(term3690, term3690.getClass(), "templateTypeName", "smnHEqRFRx");
        setField(term3746, term3746.getClass(), "name", "XYtryyobou");
        setField(term3746, term3746.getClass(), "referencedType", null);
        setBooleanField(term3746, term3746.getClass(), "visited", true);
        setField(term3761, term3761.getClass(), "baseType", null);
        setField(term3761, term3761.getClass(), "implementedInterfaces", null);
        setField(term3761, term3761.getClass(), "parameters", null);
        setField(term3761, term3761.getClass(), "thrownTypes", null);
        setField(term3761, term3761.getClass(), "templateTypeName", null);
        setField(term3761, term3761.getClass(), "description", null);
        setField(term3761, term3761.getClass(), "deprecated", null);
        setField(term3761, term3761.getClass(), "license", null);
        setField(term3761, term3761.getClass(), "suppressions", null);
        setField(term3760, term3760.getClass(), "info", term3761);
        setField(term3762, term3762.getClass(), "markers", null);
        setField(term3762, term3762.getClass(), "parameters", null);
        setField(term3762, term3762.getClass(), "throwsDescriptions", null);
        setField(term3762, term3762.getClass(), "blockDescription", null);
        setField(term3762, term3762.getClass(), "fileOverview", null);
        setField(term3762, term3762.getClass(), "returnDescription", null);
        setField(term3762, term3762.getClass(), "version", null);
        setField(term3762, term3762.getClass(), "authors", null);
        setField(term3762, term3762.getClass(), "sees", null);
        setField(term3760, term3760.getClass(), "documentation", term3762);
        setField(term3760, term3760.getClass(), "sourceName", "");
        setField(term3760, term3760.getClass(), "visibility", enum59);
        setIntField(term3760, term3760.getClass(), "bitset", 71190297);
        setField(term3767, term3767.getClass(), "root", null);
        setField(term3767, term3767.getClass(), "sourceName", null);
        setField(term3767, term3767.getClass(), "registry", null);
        setField(term3760, term3760.getClass(), "type", term3767);
        setField(term3768, term3768.getClass(), "root", null);
        setField(term3768, term3768.getClass(), "sourceName", null);
        setField(term3768, term3768.getClass(), "registry", null);
        setField(term3760, term3760.getClass(), "thisType", term3768);
        setBooleanField(term3760, term3760.getClass(), "includeDocumentation", true);
        setField(term3746, term3746.getClass(), "docInfo", term3760);
        setBooleanField(term3746, term3746.getClass(), "unknown", false);
        setBooleanField(term3746, term3746.getClass(), "resolved", true);
        setField(term3746, term3746.getClass(), "resolveResult", null);
        setField(term3746, term3746.getClass(), "registry", null);
        setField(term3690, term3690.getClass(), "templateType", term3746);
        setField(term3689, term3689.getClass(), "registry", term3690);
        setField(term3689, term3689.getClass(), "reverseInterpreter", null);
        setField(term3772, term3772.getClass(), "vars", null);
        setField(term3772, term3772.getClass(), "parent", null);
        setField(term3772, term3772.getClass(), "rootNode", null);
        setField(term3772, term3772.getClass(), "thisType", null);
        setBooleanField(term3772, term3772.getClass(), "isBottom", false);
        setField(term3689, term3689.getClass(), "syntacticScope", term3772);
        setField(term3689, term3689.getClass(), "functionScope", null);
        setField(term3689, term3689.getClass(), "bottomScope", null);
        setField(term3689, term3689.getClass(), "assignedOuterLocalVars", null);
        setField(term3689, term3689.getClass(), "unflowableVarNames", null);
        setField(term3689, term3689.getClass(), "cfg", null);
        setField(term3689, term3689.getClass(), "joinOp", null);
        setField(term3689, term3689.getClass(), "orderedWorkSet", null);
        term3774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3787 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3797 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3774, term3774.getClass(), "type", 2095798786);
        setIntField(term3776, term3776.getClass(), "type", -25637976);
        setIntField(term3778, term3778.getClass(), "type", 0);
        setField(term3778, term3778.getClass(), "next", null);
        setField(term3778, term3778.getClass(), "first", null);
        setField(term3778, term3778.getClass(), "last", null);
        setField(term3778, term3778.getClass(), "propListHead", null);
        setIntField(term3778, term3778.getClass(), "sourcePosition", 0);
        setField(term3778, term3778.getClass(), "jsType", null);
        setField(term3778, term3778.getClass(), "parent", null);
        setField(term3776, term3776.getClass(), "next", term3778);
        setIntField(term3781, term3781.getClass(), "type", 0);
        setField(term3781, term3781.getClass(), "next", null);
        setField(term3781, term3781.getClass(), "first", null);
        setField(term3781, term3781.getClass(), "last", null);
        setField(term3781, term3781.getClass(), "propListHead", null);
        setIntField(term3781, term3781.getClass(), "sourcePosition", 0);
        setField(term3781, term3781.getClass(), "jsType", null);
        setField(term3781, term3781.getClass(), "parent", null);
        setField(term3776, term3776.getClass(), "first", term3781);
        setIntField(term3784, term3784.getClass(), "type", 0);
        setField(term3784, term3784.getClass(), "next", null);
        setField(term3784, term3784.getClass(), "first", null);
        setField(term3784, term3784.getClass(), "last", null);
        setField(term3784, term3784.getClass(), "propListHead", null);
        setIntField(term3784, term3784.getClass(), "sourcePosition", 0);
        setField(term3784, term3784.getClass(), "jsType", null);
        setField(term3784, term3784.getClass(), "parent", null);
        setField(term3776, term3776.getClass(), "last", term3784);
        setField(term3787, term3787.getClass(), "next", null);
        setIntField(term3787, term3787.getClass(), "type", 0);
        setIntField(term3787, term3787.getClass(), "intValue", 0);
        setField(term3787, term3787.getClass(), "objectValue", null);
        setField(term3776, term3776.getClass(), "propListHead", term3787);
        setIntField(term3776, term3776.getClass(), "sourcePosition", 158873461);
        setField(term3776, term3776.getClass(), "jsType", null);
        setField(term3776, term3776.getClass(), "parent", null);
        setField(term3774, term3774.getClass(), "next", term3776);
        setIntField(term3791, term3791.getClass(), "type", 0);
        setField(term3791, term3791.getClass(), "next", null);
        setField(term3791, term3791.getClass(), "first", null);
        setField(term3791, term3791.getClass(), "last", null);
        setField(term3791, term3791.getClass(), "propListHead", null);
        setIntField(term3791, term3791.getClass(), "sourcePosition", 0);
        setField(term3791, term3791.getClass(), "jsType", null);
        setField(term3791, term3791.getClass(), "parent", null);
        setField(term3774, term3774.getClass(), "first", term3791);
        setIntField(term3794, term3794.getClass(), "type", 0);
        setField(term3794, term3794.getClass(), "next", null);
        setField(term3794, term3794.getClass(), "first", null);
        setField(term3794, term3794.getClass(), "last", null);
        setField(term3794, term3794.getClass(), "propListHead", null);
        setIntField(term3794, term3794.getClass(), "sourcePosition", 0);
        setField(term3794, term3794.getClass(), "jsType", null);
        setField(term3794, term3794.getClass(), "parent", null);
        setField(term3774, term3774.getClass(), "last", term3794);
        setField(term3797, term3797.getClass(), "next", null);
        setIntField(term3797, term3797.getClass(), "type", 0);
        setIntField(term3797, term3797.getClass(), "intValue", 0);
        setField(term3797, term3797.getClass(), "objectValue", null);
        setField(term3774, term3774.getClass(), "propListHead", term3797);
        setIntField(term3774, term3774.getClass(), "sourcePosition", -430151637);
        setField(term3774, term3774.getClass(), "jsType", null);
        setField(term3774, term3774.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term3774;
        args[1] = null;
        try {
            callMethod(klass, "ensurePropertyDefined", argTypes, term3689, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


