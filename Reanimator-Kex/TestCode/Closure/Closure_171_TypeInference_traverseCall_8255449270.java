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
import java.lang.String;

public class TypeInference_traverseCall_8255449270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6834;
     Object term6876;

    public TypeInference_traverseCall_8255449270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37299 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term37298 = ((Class) term37299).getDeclaredField((String) "PUBLIC");
        ((Field) term37298).setAccessible(true);
        Object enum92 = ((Field) term37298).get((Object) null);
        term6834 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term6836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6850 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6851 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6854 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6861 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6862 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term6869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term6834, term6834.getClass(), "compiler", null);
        setField(term6836, term6836.getClass(), "name", "bucTnYicnp");
        setField(term6836, term6836.getClass(), "referencedType", null);
        setField(term6836, term6836.getClass(), "referencedObjType", null);
        setBooleanField(term6836, term6836.getClass(), "visited", false);
        setField(term6851, term6851.getClass(), "baseType", null);
        setField(term6851, term6851.getClass(), "extendedInterfaces", null);
        setField(term6851, term6851.getClass(), "implementedInterfaces", null);
        setField(term6851, term6851.getClass(), "parameters", null);
        setField(term6851, term6851.getClass(), "thrownTypes", null);
        setField(term6851, term6851.getClass(), "templateTypeNames", null);
        setField(term6851, term6851.getClass(), "description", null);
        setField(term6851, term6851.getClass(), "meaning", null);
        setField(term6851, term6851.getClass(), "deprecated", null);
        setField(term6851, term6851.getClass(), "license", null);
        setField(term6851, term6851.getClass(), "suppressions", null);
        setField(term6851, term6851.getClass(), "modifies", null);
        setField(term6851, term6851.getClass(), "lendsName", null);
        setBooleanField(term6851, term6851.getClass(), "ngInject", true);
        setBooleanField(term6851, term6851.getClass(), "wizaction", true);
        setField(term6850, term6850.getClass(), "info", term6851);
        setField(term6854, term6854.getClass(), "sourceComment", null);
        setField(term6854, term6854.getClass(), "markers", null);
        setField(term6854, term6854.getClass(), "parameters", null);
        setField(term6854, term6854.getClass(), "throwsDescriptions", null);
        setField(term6854, term6854.getClass(), "blockDescription", null);
        setField(term6854, term6854.getClass(), "fileOverview", null);
        setField(term6854, term6854.getClass(), "returnDescription", null);
        setField(term6854, term6854.getClass(), "version", null);
        setField(term6854, term6854.getClass(), "authors", null);
        setField(term6854, term6854.getClass(), "sees", null);
        setField(term6850, term6850.getClass(), "documentation", term6854);
        setIntField(term6855, term6855.getClass(), "type", 0);
        setField(term6855, term6855.getClass(), "next", null);
        setField(term6855, term6855.getClass(), "first", null);
        setField(term6855, term6855.getClass(), "last", null);
        setField(term6855, term6855.getClass(), "propListHead", null);
        setIntField(term6855, term6855.getClass(), "sourcePosition", 0);
        setField(term6855, term6855.getClass(), "jsType", null);
        setField(term6855, term6855.getClass(), "parent", null);
        setField(term6850, term6850.getClass(), "associatedNode", term6855);
        setField(term6850, term6850.getClass(), "visibility", enum92);
        setIntField(term6850, term6850.getClass(), "bitset", 49950830);
        setField(term6861, term6861.getClass(), "root", null);
        setField(term6861, term6861.getClass(), "sourceName", null);
        setField(term6850, term6850.getClass(), "type", term6861);
        setField(term6862, term6862.getClass(), "root", null);
        setField(term6862, term6862.getClass(), "sourceName", null);
        setField(term6850, term6850.getClass(), "thisType", term6862);
        setBooleanField(term6850, term6850.getClass(), "includeDocumentation", true);
        setIntField(term6850, term6850.getClass(), "originalCommentPosition", -525257914);
        setField(term6836, term6836.getClass(), "docInfo", term6850);
        setBooleanField(term6836, term6836.getClass(), "unknown", false);
        setBooleanField(term6836, term6836.getClass(), "resolved", true);
        setField(term6836, term6836.getClass(), "resolveResult", null);
        setField(term6867, term6867.getClass(), "templateKeys", null);
        setField(term6867, term6867.getClass(), "templateValues", null);
        setField(term6867, term6867.getClass(), "resolvedTemplateValues", null);
        setField(term6867, term6867.getClass(), "registry", null);
        setField(term6836, term6836.getClass(), "templateTypeMap", term6867);
        setBooleanField(term6836, term6836.getClass(), "inTemplatedCheckVisit", false);
        setField(term6836, term6836.getClass(), "registry", null);
        setField(term6835, term6835.getClass(), "objectIndexTemplateKey", term6836);
        setField(term6869, term6869.getClass(), "name", null);
        setField(term6869, term6869.getClass(), "referencedType", null);
        setField(term6869, term6869.getClass(), "referencedObjType", null);
        setBooleanField(term6869, term6869.getClass(), "visited", false);
        setField(term6869, term6869.getClass(), "docInfo", null);
        setBooleanField(term6869, term6869.getClass(), "unknown", false);
        setBooleanField(term6869, term6869.getClass(), "resolved", false);
        setField(term6869, term6869.getClass(), "resolveResult", null);
        setField(term6869, term6869.getClass(), "templateTypeMap", null);
        setBooleanField(term6869, term6869.getClass(), "inTemplatedCheckVisit", false);
        setField(term6869, term6869.getClass(), "registry", null);
        setField(term6835, term6835.getClass(), "objectElementTemplateKey", term6869);
        setField(term6835, term6835.getClass(), "reporter", null);
        setField(term6835, term6835.getClass(), "nativeTypes", null);
        setField(term6835, term6835.getClass(), "namesToTypes", null);
        setField(term6835, term6835.getClass(), "namespaces", null);
        setField(term6835, term6835.getClass(), "nonNullableTypeNames", null);
        setField(term6835, term6835.getClass(), "forwardDeclaredTypes", null);
        setField(term6835, term6835.getClass(), "typesIndexedByProperty", null);
        setField(term6835, term6835.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term6835, term6835.getClass(), "greatestSubtypeByProperty", null);
        setField(term6835, term6835.getClass(), "interfaceToImplementors", null);
        setField(term6835, term6835.getClass(), "unresolvedNamedTypes", null);
        setField(term6835, term6835.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6835, term6835.getClass(), "lastGeneration", false);
        setField(term6835, term6835.getClass(), "templateTypes", null);
        setField(term6835, term6835.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term6835, term6835.getClass(), "tolerateUndefinedValues", false);
        setField(term6835, term6835.getClass(), "resolveMode", null);
        setField(term6834, term6834.getClass(), "registry", term6835);
        setField(term6834, term6834.getClass(), "reverseInterpreter", null);
        setField(term6834, term6834.getClass(), "syntacticScope", null);
        setField(term6834, term6834.getClass(), "functionScope", null);
        setField(term6834, term6834.getClass(), "bottomScope", null);
        setField(term6834, term6834.getClass(), "assertionFunctionsMap", null);
        setField(term6834, term6834.getClass(), "unknownType", null);
        setField(term6834, term6834.getClass(), "cfg", null);
        setField(term6834, term6834.getClass(), "joinOp", null);
        setField(term6834, term6834.getClass(), "orderedWorkSet", null);
        term6876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6876, term6876.getClass(), "type", 34470066);
        setIntField(term6878, term6878.getClass(), "type", 2058711405);
        setIntField(term6880, term6880.getClass(), "type", 1743683601);
        setIntField(term6882, term6882.getClass(), "type", -945116798);
        setIntField(term6884, term6884.getClass(), "type", 1593461795);
        setField(term6884, term6884.getClass(), "next", null);
        setField(term6884, term6884.getClass(), "first", null);
        setField(term6884, term6884.getClass(), "last", null);
        setField(term6884, term6884.getClass(), "propListHead", null);
        setIntField(term6884, term6884.getClass(), "sourcePosition", 0);
        setField(term6884, term6884.getClass(), "jsType", null);
        setField(term6884, term6884.getClass(), "parent", null);
        setField(term6882, term6882.getClass(), "next", term6884);
        setIntField(term6887, term6887.getClass(), "type", 515182546);
        setField(term6887, term6887.getClass(), "next", null);
        setField(term6887, term6887.getClass(), "first", null);
        setField(term6887, term6887.getClass(), "last", term6884);
        setField(term6887, term6887.getClass(), "propListHead", null);
        setIntField(term6887, term6887.getClass(), "sourcePosition", 0);
        setField(term6887, term6887.getClass(), "jsType", null);
        setField(term6887, term6887.getClass(), "parent", null);
        setField(term6882, term6882.getClass(), "first", term6887);
        setField(term6882, term6882.getClass(), "last", term6880);
        setField(term6882, term6882.getClass(), "propListHead", null);
        setIntField(term6882, term6882.getClass(), "sourcePosition", 0);
        setField(term6882, term6882.getClass(), "jsType", null);
        setField(term6882, term6882.getClass(), "parent", null);
        setField(term6880, term6880.getClass(), "next", term6882);
        setField(term6880, term6880.getClass(), "first", term6884);
        setIntField(term6891, term6891.getClass(), "type", -129547140);
        setIntField(term6893, term6893.getClass(), "type", 199287428);
        setField(term6893, term6893.getClass(), "next", null);
        setField(term6893, term6893.getClass(), "first", term6887);
        setField(term6893, term6893.getClass(), "last", term6882);
        setField(term6893, term6893.getClass(), "propListHead", null);
        setIntField(term6893, term6893.getClass(), "sourcePosition", 0);
        setField(term6893, term6893.getClass(), "jsType", null);
        setField(term6893, term6893.getClass(), "parent", null);
        setField(term6891, term6891.getClass(), "next", term6893);
        setField(term6891, term6891.getClass(), "first", term6878);
        setField(term6891, term6891.getClass(), "last", term6878);
        setField(term6891, term6891.getClass(), "propListHead", null);
        setIntField(term6891, term6891.getClass(), "sourcePosition", 0);
        setField(term6891, term6891.getClass(), "jsType", null);
        setField(term6891, term6891.getClass(), "parent", null);
        setField(term6880, term6880.getClass(), "last", term6891);
        setField(term6880, term6880.getClass(), "propListHead", null);
        setIntField(term6880, term6880.getClass(), "sourcePosition", 0);
        setField(term6880, term6880.getClass(), "jsType", null);
        setField(term6880, term6880.getClass(), "parent", null);
        setField(term6878, term6878.getClass(), "next", term6880);
        setIntField(term6898, term6898.getClass(), "type", -1195339592);
        setField(term6898, term6898.getClass(), "next", term6891);
        setField(term6898, term6898.getClass(), "first", term6893);
        setField(term6898, term6898.getClass(), "last", term6876);
        setField(term6898, term6898.getClass(), "propListHead", null);
        setIntField(term6898, term6898.getClass(), "sourcePosition", 0);
        setField(term6898, term6898.getClass(), "jsType", null);
        setField(term6898, term6898.getClass(), "parent", null);
        setField(term6878, term6878.getClass(), "first", term6898);
        setField(term6878, term6878.getClass(), "last", term6898);
        setField(term6878, term6878.getClass(), "propListHead", null);
        setIntField(term6878, term6878.getClass(), "sourcePosition", 0);
        setField(term6878, term6878.getClass(), "jsType", null);
        setField(term6878, term6878.getClass(), "parent", null);
        setField(term6876, term6876.getClass(), "next", term6878);
        setField(term6876, term6876.getClass(), "first", term6882);
        setField(term6876, term6876.getClass(), "last", term6884);
        setField(term6876, term6876.getClass(), "propListHead", null);
        setIntField(term6876, term6876.getClass(), "sourcePosition", 0);
        setField(term6876, term6876.getClass(), "jsType", null);
        setField(term6876, term6876.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term6876;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term6834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


