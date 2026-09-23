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
import java.lang.Object;
import java.lang.String;

public class TypeInference_traverseName_23238923364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4777;
     Object term4819;

    public TypeInference_traverseName_23238923364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32765 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term32764 = ((Class) term32765).getDeclaredField((String) "PUBLIC");
        ((Field) term32764).setAccessible(true);
        Object enum83 = ((Field) term32764).get((Object) null);
        term4777 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term4779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4793 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4794 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term4797 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term4798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4804 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4805 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term4812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term4777, term4777.getClass(), "compiler", null);
        setField(term4779, term4779.getClass(), "name", "OzXRsFGTIp");
        setField(term4779, term4779.getClass(), "referencedType", null);
        setField(term4779, term4779.getClass(), "referencedObjType", null);
        setBooleanField(term4779, term4779.getClass(), "visited", false);
        setField(term4794, term4794.getClass(), "baseType", null);
        setField(term4794, term4794.getClass(), "extendedInterfaces", null);
        setField(term4794, term4794.getClass(), "implementedInterfaces", null);
        setField(term4794, term4794.getClass(), "parameters", null);
        setField(term4794, term4794.getClass(), "thrownTypes", null);
        setField(term4794, term4794.getClass(), "templateTypeNames", null);
        setField(term4794, term4794.getClass(), "description", null);
        setField(term4794, term4794.getClass(), "meaning", null);
        setField(term4794, term4794.getClass(), "deprecated", null);
        setField(term4794, term4794.getClass(), "license", null);
        setField(term4794, term4794.getClass(), "suppressions", null);
        setField(term4794, term4794.getClass(), "modifies", null);
        setField(term4794, term4794.getClass(), "lendsName", null);
        setBooleanField(term4794, term4794.getClass(), "ngInject", true);
        setBooleanField(term4794, term4794.getClass(), "wizaction", true);
        setField(term4793, term4793.getClass(), "info", term4794);
        setField(term4797, term4797.getClass(), "sourceComment", null);
        setField(term4797, term4797.getClass(), "markers", null);
        setField(term4797, term4797.getClass(), "parameters", null);
        setField(term4797, term4797.getClass(), "throwsDescriptions", null);
        setField(term4797, term4797.getClass(), "blockDescription", null);
        setField(term4797, term4797.getClass(), "fileOverview", null);
        setField(term4797, term4797.getClass(), "returnDescription", null);
        setField(term4797, term4797.getClass(), "version", null);
        setField(term4797, term4797.getClass(), "authors", null);
        setField(term4797, term4797.getClass(), "sees", null);
        setField(term4793, term4793.getClass(), "documentation", term4797);
        setIntField(term4798, term4798.getClass(), "type", 0);
        setField(term4798, term4798.getClass(), "next", null);
        setField(term4798, term4798.getClass(), "first", null);
        setField(term4798, term4798.getClass(), "last", null);
        setField(term4798, term4798.getClass(), "propListHead", null);
        setIntField(term4798, term4798.getClass(), "sourcePosition", 0);
        setField(term4798, term4798.getClass(), "jsType", null);
        setField(term4798, term4798.getClass(), "parent", null);
        setField(term4793, term4793.getClass(), "associatedNode", term4798);
        setField(term4793, term4793.getClass(), "visibility", enum83);
        setIntField(term4793, term4793.getClass(), "bitset", -507387516);
        setField(term4804, term4804.getClass(), "root", null);
        setField(term4804, term4804.getClass(), "sourceName", null);
        setField(term4793, term4793.getClass(), "type", term4804);
        setField(term4805, term4805.getClass(), "root", null);
        setField(term4805, term4805.getClass(), "sourceName", null);
        setField(term4793, term4793.getClass(), "thisType", term4805);
        setBooleanField(term4793, term4793.getClass(), "includeDocumentation", true);
        setIntField(term4793, term4793.getClass(), "originalCommentPosition", -1970452551);
        setField(term4779, term4779.getClass(), "docInfo", term4793);
        setBooleanField(term4779, term4779.getClass(), "unknown", false);
        setBooleanField(term4779, term4779.getClass(), "resolved", true);
        setField(term4779, term4779.getClass(), "resolveResult", null);
        setField(term4810, term4810.getClass(), "templateKeys", null);
        setField(term4810, term4810.getClass(), "templateValues", null);
        setField(term4810, term4810.getClass(), "resolvedTemplateValues", null);
        setField(term4810, term4810.getClass(), "registry", null);
        setField(term4779, term4779.getClass(), "templateTypeMap", term4810);
        setBooleanField(term4779, term4779.getClass(), "inTemplatedCheckVisit", true);
        setField(term4779, term4779.getClass(), "registry", null);
        setField(term4778, term4778.getClass(), "objectIndexTemplateKey", term4779);
        setField(term4812, term4812.getClass(), "name", null);
        setField(term4812, term4812.getClass(), "referencedType", null);
        setField(term4812, term4812.getClass(), "referencedObjType", null);
        setBooleanField(term4812, term4812.getClass(), "visited", false);
        setField(term4812, term4812.getClass(), "docInfo", null);
        setBooleanField(term4812, term4812.getClass(), "unknown", false);
        setBooleanField(term4812, term4812.getClass(), "resolved", false);
        setField(term4812, term4812.getClass(), "resolveResult", null);
        setField(term4812, term4812.getClass(), "templateTypeMap", null);
        setBooleanField(term4812, term4812.getClass(), "inTemplatedCheckVisit", false);
        setField(term4812, term4812.getClass(), "registry", null);
        setField(term4778, term4778.getClass(), "objectElementTemplateKey", term4812);
        setField(term4778, term4778.getClass(), "reporter", null);
        setField(term4778, term4778.getClass(), "nativeTypes", null);
        setField(term4778, term4778.getClass(), "namesToTypes", null);
        setField(term4778, term4778.getClass(), "namespaces", null);
        setField(term4778, term4778.getClass(), "nonNullableTypeNames", null);
        setField(term4778, term4778.getClass(), "forwardDeclaredTypes", null);
        setField(term4778, term4778.getClass(), "typesIndexedByProperty", null);
        setField(term4778, term4778.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term4778, term4778.getClass(), "greatestSubtypeByProperty", null);
        setField(term4778, term4778.getClass(), "interfaceToImplementors", null);
        setField(term4778, term4778.getClass(), "unresolvedNamedTypes", null);
        setField(term4778, term4778.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4778, term4778.getClass(), "lastGeneration", false);
        setField(term4778, term4778.getClass(), "templateTypes", null);
        setField(term4778, term4778.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term4778, term4778.getClass(), "tolerateUndefinedValues", false);
        setField(term4778, term4778.getClass(), "resolveMode", null);
        setField(term4777, term4777.getClass(), "registry", term4778);
        setField(term4777, term4777.getClass(), "reverseInterpreter", null);
        setField(term4777, term4777.getClass(), "syntacticScope", null);
        setField(term4777, term4777.getClass(), "functionScope", null);
        setField(term4777, term4777.getClass(), "bottomScope", null);
        setField(term4777, term4777.getClass(), "assertionFunctionsMap", null);
        setField(term4777, term4777.getClass(), "unknownType", null);
        setField(term4777, term4777.getClass(), "cfg", null);
        setField(term4777, term4777.getClass(), "joinOp", null);
        setField(term4777, term4777.getClass(), "orderedWorkSet", null);
        term4819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4819, term4819.getClass(), "type", 729658803);
        setIntField(term4821, term4821.getClass(), "type", 114754804);
        setIntField(term4823, term4823.getClass(), "type", 1687361082);
        setIntField(term4825, term4825.getClass(), "type", 584893196);
        setIntField(term4827, term4827.getClass(), "type", 497269071);
        setField(term4827, term4827.getClass(), "next", null);
        setField(term4827, term4827.getClass(), "first", null);
        setField(term4827, term4827.getClass(), "last", null);
        setField(term4827, term4827.getClass(), "propListHead", null);
        setIntField(term4827, term4827.getClass(), "sourcePosition", 0);
        setField(term4827, term4827.getClass(), "jsType", null);
        setField(term4827, term4827.getClass(), "parent", null);
        setField(term4825, term4825.getClass(), "next", term4827);
        setIntField(term4830, term4830.getClass(), "type", -1899301124);
        setField(term4830, term4830.getClass(), "next", null);
        setField(term4830, term4830.getClass(), "first", null);
        setField(term4830, term4830.getClass(), "last", term4827);
        setField(term4830, term4830.getClass(), "propListHead", null);
        setIntField(term4830, term4830.getClass(), "sourcePosition", 0);
        setField(term4830, term4830.getClass(), "jsType", null);
        setField(term4830, term4830.getClass(), "parent", null);
        setField(term4825, term4825.getClass(), "first", term4830);
        setField(term4825, term4825.getClass(), "last", term4823);
        setField(term4825, term4825.getClass(), "propListHead", null);
        setIntField(term4825, term4825.getClass(), "sourcePosition", 0);
        setField(term4825, term4825.getClass(), "jsType", null);
        setField(term4825, term4825.getClass(), "parent", null);
        setField(term4823, term4823.getClass(), "next", term4825);
        setField(term4823, term4823.getClass(), "first", term4827);
        setIntField(term4834, term4834.getClass(), "type", -1410220680);
        setIntField(term4836, term4836.getClass(), "type", 389427431);
        setField(term4836, term4836.getClass(), "next", null);
        setField(term4836, term4836.getClass(), "first", term4830);
        setField(term4836, term4836.getClass(), "last", term4825);
        setField(term4836, term4836.getClass(), "propListHead", null);
        setIntField(term4836, term4836.getClass(), "sourcePosition", 0);
        setField(term4836, term4836.getClass(), "jsType", null);
        setField(term4836, term4836.getClass(), "parent", null);
        setField(term4834, term4834.getClass(), "next", term4836);
        setField(term4834, term4834.getClass(), "first", term4821);
        setField(term4834, term4834.getClass(), "last", term4821);
        setField(term4834, term4834.getClass(), "propListHead", null);
        setIntField(term4834, term4834.getClass(), "sourcePosition", 0);
        setField(term4834, term4834.getClass(), "jsType", null);
        setField(term4834, term4834.getClass(), "parent", null);
        setField(term4823, term4823.getClass(), "last", term4834);
        setField(term4823, term4823.getClass(), "propListHead", null);
        setIntField(term4823, term4823.getClass(), "sourcePosition", 0);
        setField(term4823, term4823.getClass(), "jsType", null);
        setField(term4823, term4823.getClass(), "parent", null);
        setField(term4821, term4821.getClass(), "next", term4823);
        setIntField(term4841, term4841.getClass(), "type", -1945706126);
        setField(term4841, term4841.getClass(), "next", term4834);
        setField(term4841, term4841.getClass(), "first", term4836);
        setField(term4841, term4841.getClass(), "last", term4819);
        setField(term4841, term4841.getClass(), "propListHead", null);
        setIntField(term4841, term4841.getClass(), "sourcePosition", 0);
        setField(term4841, term4841.getClass(), "jsType", null);
        setField(term4841, term4841.getClass(), "parent", null);
        setField(term4821, term4821.getClass(), "first", term4841);
        setField(term4821, term4821.getClass(), "last", term4841);
        setField(term4821, term4821.getClass(), "propListHead", null);
        setIntField(term4821, term4821.getClass(), "sourcePosition", 0);
        setField(term4821, term4821.getClass(), "jsType", null);
        setField(term4821, term4821.getClass(), "parent", null);
        setField(term4819, term4819.getClass(), "next", term4821);
        setField(term4819, term4819.getClass(), "first", term4825);
        setField(term4819, term4819.getClass(), "last", term4827);
        setField(term4819, term4819.getClass(), "propListHead", null);
        setIntField(term4819, term4819.getClass(), "sourcePosition", 0);
        setField(term4819, term4819.getClass(), "jsType", null);
        setField(term4819, term4819.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term4819;
        args[1] = null;
        try {
            callMethod(klass, "traverseName", argTypes, term4777, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


