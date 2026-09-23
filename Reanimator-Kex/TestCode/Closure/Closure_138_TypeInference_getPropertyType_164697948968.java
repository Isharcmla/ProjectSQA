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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_getPropertyType_164697948968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11702;
     Object term11800;

    public TypeInference_getPropertyType_164697948968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11705 = new HashMap();
        HashMap term11714 = new HashMap();
        Set<Object> term41382 =  ((Map) term11714).keySet();
        HashSet term11713 = new HashSet((Collection<? extends Object>) term41382);
        HashMap term11721 = new HashMap();
        Set<Object> term41383 =  ((Map) term11721).keySet();
        HashSet term11720 = new HashSet((Collection<? extends Object>) term41383);
        HashMap term11728 = new HashMap();
        Set<Object> term41384 =  ((Map) term11728).keySet();
        HashSet term11727 = new HashSet((Collection<? extends Object>) term41384);
        HashMap term11734 = new HashMap();
        HashMap term11739 = new HashMap();
        Class<? extends Object> term41406 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term41405 = ((Class) term41406).getDeclaredField((String) "PUBLIC");
        ((Field) term41405).setAccessible(true);
        Object enum92 = ((Field) term41405).get((Object) null);
        term11702 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term11703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11704 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term11760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term11774 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11775 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term11776 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term11781 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11782 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11786 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term11702, term11702.getClass(), "compiler", null);
        setField(term11703, term11703.getClass(), "reporter", null);
        setField(term11703, term11703.getClass(), "nativeTypes", term11704);
        setField(term11703, term11703.getClass(), "namesToTypes", term11705);
        setField(term11703, term11703.getClass(), "namespaces", term11713);
        setField(term11703, term11703.getClass(), "enumTypeNames", term11720);
        setField(term11703, term11703.getClass(), "forwardDeclaredTypes", term11727);
        setField(term11703, term11703.getClass(), "typesIndexedByProperty", term11734);
        setField(term11703, term11703.getClass(), "greatestSubtypeByProperty", term11739);
        setField(term11703, term11703.getClass(), "interfaceToImplementors", null);
        setField(term11703, term11703.getClass(), "unresolvedNamedTypes", null);
        setField(term11703, term11703.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11703, term11703.getClass(), "lastGeneration", true);
        setField(term11703, term11703.getClass(), "templateTypeName", "qphdrqUtNx");
        setField(term11760, term11760.getClass(), "name", "bwlLFAfNWx");
        setField(term11760, term11760.getClass(), "referencedType", null);
        setBooleanField(term11760, term11760.getClass(), "visited", false);
        setField(term11775, term11775.getClass(), "baseType", null);
        setField(term11775, term11775.getClass(), "implementedInterfaces", null);
        setField(term11775, term11775.getClass(), "parameters", null);
        setField(term11775, term11775.getClass(), "thrownTypes", null);
        setField(term11775, term11775.getClass(), "templateTypeName", null);
        setField(term11775, term11775.getClass(), "description", null);
        setField(term11775, term11775.getClass(), "deprecated", null);
        setField(term11775, term11775.getClass(), "license", null);
        setField(term11775, term11775.getClass(), "suppressions", null);
        setField(term11774, term11774.getClass(), "info", term11775);
        setField(term11776, term11776.getClass(), "markers", null);
        setField(term11776, term11776.getClass(), "parameters", null);
        setField(term11776, term11776.getClass(), "throwsDescriptions", null);
        setField(term11776, term11776.getClass(), "blockDescription", null);
        setField(term11776, term11776.getClass(), "fileOverview", null);
        setField(term11776, term11776.getClass(), "returnDescription", null);
        setField(term11776, term11776.getClass(), "version", null);
        setField(term11776, term11776.getClass(), "authors", null);
        setField(term11776, term11776.getClass(), "sees", null);
        setField(term11774, term11774.getClass(), "documentation", term11776);
        setField(term11774, term11774.getClass(), "sourceName", "");
        setField(term11774, term11774.getClass(), "visibility", enum92);
        setIntField(term11774, term11774.getClass(), "bitset", 977862393);
        setField(term11781, term11781.getClass(), "root", null);
        setField(term11781, term11781.getClass(), "sourceName", null);
        setField(term11781, term11781.getClass(), "registry", null);
        setField(term11774, term11774.getClass(), "type", term11781);
        setField(term11782, term11782.getClass(), "root", null);
        setField(term11782, term11782.getClass(), "sourceName", null);
        setField(term11782, term11782.getClass(), "registry", null);
        setField(term11774, term11774.getClass(), "thisType", term11782);
        setBooleanField(term11774, term11774.getClass(), "includeDocumentation", false);
        setField(term11760, term11760.getClass(), "docInfo", term11774);
        setBooleanField(term11760, term11760.getClass(), "unknown", true);
        setBooleanField(term11760, term11760.getClass(), "resolved", true);
        setField(term11760, term11760.getClass(), "resolveResult", null);
        setField(term11760, term11760.getClass(), "registry", null);
        setField(term11703, term11703.getClass(), "templateType", term11760);
        setField(term11702, term11702.getClass(), "registry", term11703);
        setField(term11702, term11702.getClass(), "reverseInterpreter", null);
        setField(term11786, term11786.getClass(), "vars", null);
        setField(term11786, term11786.getClass(), "parent", null);
        setField(term11786, term11786.getClass(), "rootNode", null);
        setField(term11786, term11786.getClass(), "thisType", null);
        setBooleanField(term11786, term11786.getClass(), "isBottom", false);
        setField(term11702, term11702.getClass(), "syntacticScope", term11786);
        setField(term11702, term11702.getClass(), "functionScope", null);
        setField(term11702, term11702.getClass(), "bottomScope", null);
        setField(term11702, term11702.getClass(), "assignedOuterLocalVars", null);
        setField(term11702, term11702.getClass(), "unflowableVarNames", null);
        setField(term11702, term11702.getClass(), "cfg", null);
        setField(term11702, term11702.getClass(), "joinOp", null);
        setField(term11702, term11702.getClass(), "orderedWorkSet", null);
        term11800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11813 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11823 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11800, term11800.getClass(), "type", -1830198043);
        setIntField(term11802, term11802.getClass(), "type", 917513193);
        setIntField(term11804, term11804.getClass(), "type", 0);
        setField(term11804, term11804.getClass(), "next", null);
        setField(term11804, term11804.getClass(), "first", null);
        setField(term11804, term11804.getClass(), "last", null);
        setField(term11804, term11804.getClass(), "propListHead", null);
        setIntField(term11804, term11804.getClass(), "sourcePosition", 0);
        setField(term11804, term11804.getClass(), "jsType", null);
        setField(term11804, term11804.getClass(), "parent", null);
        setField(term11802, term11802.getClass(), "next", term11804);
        setIntField(term11807, term11807.getClass(), "type", 0);
        setField(term11807, term11807.getClass(), "next", null);
        setField(term11807, term11807.getClass(), "first", null);
        setField(term11807, term11807.getClass(), "last", null);
        setField(term11807, term11807.getClass(), "propListHead", null);
        setIntField(term11807, term11807.getClass(), "sourcePosition", 0);
        setField(term11807, term11807.getClass(), "jsType", null);
        setField(term11807, term11807.getClass(), "parent", null);
        setField(term11802, term11802.getClass(), "first", term11807);
        setIntField(term11810, term11810.getClass(), "type", 0);
        setField(term11810, term11810.getClass(), "next", null);
        setField(term11810, term11810.getClass(), "first", null);
        setField(term11810, term11810.getClass(), "last", null);
        setField(term11810, term11810.getClass(), "propListHead", null);
        setIntField(term11810, term11810.getClass(), "sourcePosition", 0);
        setField(term11810, term11810.getClass(), "jsType", null);
        setField(term11810, term11810.getClass(), "parent", null);
        setField(term11802, term11802.getClass(), "last", term11810);
        setField(term11813, term11813.getClass(), "next", null);
        setIntField(term11813, term11813.getClass(), "type", 0);
        setIntField(term11813, term11813.getClass(), "intValue", 0);
        setField(term11813, term11813.getClass(), "objectValue", null);
        setField(term11802, term11802.getClass(), "propListHead", term11813);
        setIntField(term11802, term11802.getClass(), "sourcePosition", 833762980);
        setField(term11802, term11802.getClass(), "jsType", null);
        setField(term11802, term11802.getClass(), "parent", null);
        setField(term11800, term11800.getClass(), "next", term11802);
        setIntField(term11817, term11817.getClass(), "type", 0);
        setField(term11817, term11817.getClass(), "next", null);
        setField(term11817, term11817.getClass(), "first", null);
        setField(term11817, term11817.getClass(), "last", null);
        setField(term11817, term11817.getClass(), "propListHead", null);
        setIntField(term11817, term11817.getClass(), "sourcePosition", 0);
        setField(term11817, term11817.getClass(), "jsType", null);
        setField(term11817, term11817.getClass(), "parent", null);
        setField(term11800, term11800.getClass(), "first", term11817);
        setIntField(term11820, term11820.getClass(), "type", 0);
        setField(term11820, term11820.getClass(), "next", null);
        setField(term11820, term11820.getClass(), "first", null);
        setField(term11820, term11820.getClass(), "last", null);
        setField(term11820, term11820.getClass(), "propListHead", null);
        setIntField(term11820, term11820.getClass(), "sourcePosition", 0);
        setField(term11820, term11820.getClass(), "jsType", null);
        setField(term11820, term11820.getClass(), "parent", null);
        setField(term11800, term11800.getClass(), "last", term11820);
        setField(term11823, term11823.getClass(), "next", null);
        setIntField(term11823, term11823.getClass(), "type", 0);
        setIntField(term11823, term11823.getClass(), "intValue", 0);
        setField(term11823, term11823.getClass(), "objectValue", null);
        setField(term11800, term11800.getClass(), "propListHead", term11823);
        setIntField(term11800, term11800.getClass(), "sourcePosition", 320711637);
        setField(term11800, term11800.getClass(), "jsType", null);
        setField(term11800, term11800.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "CAgxWjhxNf";
        args[2] = term11800;
        args[3] = null;
        try {
            callMethod(klass, "getPropertyType", argTypes, term11702, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


