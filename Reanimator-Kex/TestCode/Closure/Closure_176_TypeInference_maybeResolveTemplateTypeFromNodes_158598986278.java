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
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_maybeResolveTemplateTypeFromNodes_158598986278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11777;
     Object term11822;
     Object term11828;

    public TypeInference_maybeResolveTemplateTypeFromNodes_158598986278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46222 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term46221 = ((Class) term46222).getDeclaredField((String) "PUBLIC");
        ((Field) term46221).setAccessible(true);
        Object enum113 = ((Field) term46221).get((Object) null);
        term11777 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term11778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term11779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term11793 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11794 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term11800 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term11801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11807 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11808 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term11815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term11777, term11777.getClass(), "compiler", null);
        setField(term11779, term11779.getClass(), "name", "YfgYGgzYER");
        setField(term11779, term11779.getClass(), "referencedType", null);
        setField(term11779, term11779.getClass(), "referencedObjType", null);
        setBooleanField(term11779, term11779.getClass(), "visited", true);
        setField(term11794, term11794.getClass(), "baseType", null);
        setField(term11794, term11794.getClass(), "extendedInterfaces", null);
        setField(term11794, term11794.getClass(), "implementedInterfaces", null);
        setField(term11794, term11794.getClass(), "parameters", null);
        setField(term11794, term11794.getClass(), "thrownTypes", null);
        setField(term11794, term11794.getClass(), "templateTypeNames", null);
        setField(term11794, term11794.getClass(), "disposedParameters", null);
        setField(term11794, term11794.getClass(), "description", null);
        setField(term11794, term11794.getClass(), "meaning", null);
        setField(term11794, term11794.getClass(), "deprecated", null);
        setField(term11794, term11794.getClass(), "license", null);
        setField(term11794, term11794.getClass(), "suppressions", null);
        setField(term11794, term11794.getClass(), "modifies", null);
        setField(term11794, term11794.getClass(), "lendsName", null);
        setBooleanField(term11794, term11794.getClass(), "ngInject", true);
        setBooleanField(term11794, term11794.getClass(), "wizaction", true);
        setBooleanField(term11794, term11794.getClass(), "jaggerInject", true);
        setBooleanField(term11794, term11794.getClass(), "jaggerProvide", true);
        setBooleanField(term11794, term11794.getClass(), "jaggerModule", true);
        setField(term11793, term11793.getClass(), "info", term11794);
        setField(term11800, term11800.getClass(), "sourceComment", null);
        setField(term11800, term11800.getClass(), "markers", null);
        setField(term11800, term11800.getClass(), "parameters", null);
        setField(term11800, term11800.getClass(), "throwsDescriptions", null);
        setField(term11800, term11800.getClass(), "blockDescription", null);
        setField(term11800, term11800.getClass(), "fileOverview", null);
        setField(term11800, term11800.getClass(), "returnDescription", null);
        setField(term11800, term11800.getClass(), "version", null);
        setField(term11800, term11800.getClass(), "authors", null);
        setField(term11800, term11800.getClass(), "sees", null);
        setField(term11793, term11793.getClass(), "documentation", term11800);
        setIntField(term11801, term11801.getClass(), "type", 0);
        setField(term11801, term11801.getClass(), "next", null);
        setField(term11801, term11801.getClass(), "first", null);
        setField(term11801, term11801.getClass(), "last", null);
        setField(term11801, term11801.getClass(), "propListHead", null);
        setIntField(term11801, term11801.getClass(), "sourcePosition", 0);
        setField(term11801, term11801.getClass(), "jsType", null);
        setField(term11801, term11801.getClass(), "parent", null);
        setField(term11793, term11793.getClass(), "associatedNode", term11801);
        setField(term11793, term11793.getClass(), "visibility", enum113);
        setIntField(term11793, term11793.getClass(), "bitset", 2063762142);
        setField(term11807, term11807.getClass(), "root", null);
        setField(term11807, term11807.getClass(), "sourceName", null);
        setField(term11793, term11793.getClass(), "type", term11807);
        setField(term11808, term11808.getClass(), "root", null);
        setField(term11808, term11808.getClass(), "sourceName", null);
        setField(term11793, term11793.getClass(), "thisType", term11808);
        setBooleanField(term11793, term11793.getClass(), "includeDocumentation", true);
        setIntField(term11793, term11793.getClass(), "originalCommentPosition", 1658391716);
        setField(term11779, term11779.getClass(), "docInfo", term11793);
        setBooleanField(term11779, term11779.getClass(), "unknown", false);
        setBooleanField(term11779, term11779.getClass(), "resolved", false);
        setField(term11779, term11779.getClass(), "resolveResult", null);
        setField(term11813, term11813.getClass(), "templateKeys", null);
        setField(term11813, term11813.getClass(), "templateValues", null);
        setField(term11813, term11813.getClass(), "resolvedTemplateValues", null);
        setField(term11813, term11813.getClass(), "registry", null);
        setField(term11779, term11779.getClass(), "templateTypeMap", term11813);
        setBooleanField(term11779, term11779.getClass(), "inTemplatedCheckVisit", false);
        setField(term11779, term11779.getClass(), "registry", null);
        setField(term11778, term11778.getClass(), "objectIndexTemplateKey", term11779);
        setField(term11815, term11815.getClass(), "name", null);
        setField(term11815, term11815.getClass(), "referencedType", null);
        setField(term11815, term11815.getClass(), "referencedObjType", null);
        setBooleanField(term11815, term11815.getClass(), "visited", false);
        setField(term11815, term11815.getClass(), "docInfo", null);
        setBooleanField(term11815, term11815.getClass(), "unknown", false);
        setBooleanField(term11815, term11815.getClass(), "resolved", false);
        setField(term11815, term11815.getClass(), "resolveResult", null);
        setField(term11815, term11815.getClass(), "templateTypeMap", null);
        setBooleanField(term11815, term11815.getClass(), "inTemplatedCheckVisit", false);
        setField(term11815, term11815.getClass(), "registry", null);
        setField(term11778, term11778.getClass(), "objectElementTemplateKey", term11815);
        setField(term11778, term11778.getClass(), "reporter", null);
        setField(term11778, term11778.getClass(), "nativeTypes", null);
        setField(term11778, term11778.getClass(), "namesToTypes", null);
        setField(term11778, term11778.getClass(), "namespaces", null);
        setField(term11778, term11778.getClass(), "nonNullableTypeNames", null);
        setField(term11778, term11778.getClass(), "forwardDeclaredTypes", null);
        setField(term11778, term11778.getClass(), "typesIndexedByProperty", null);
        setField(term11778, term11778.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11778, term11778.getClass(), "greatestSubtypeByProperty", null);
        setField(term11778, term11778.getClass(), "interfaceToImplementors", null);
        setField(term11778, term11778.getClass(), "unresolvedNamedTypes", null);
        setField(term11778, term11778.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11778, term11778.getClass(), "lastGeneration", false);
        setField(term11778, term11778.getClass(), "templateTypes", null);
        setField(term11778, term11778.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term11778, term11778.getClass(), "tolerateUndefinedValues", false);
        setField(term11777, term11777.getClass(), "registry", term11778);
        setField(term11777, term11777.getClass(), "reverseInterpreter", null);
        setField(term11777, term11777.getClass(), "syntacticScope", null);
        setField(term11777, term11777.getClass(), "functionScope", null);
        setField(term11777, term11777.getClass(), "bottomScope", null);
        setField(term11777, term11777.getClass(), "assertionFunctionsMap", null);
        setField(term11777, term11777.getClass(), "unknownType", null);
        setField(term11777, term11777.getClass(), "cfg", null);
        setField(term11777, term11777.getClass(), "joinOp", null);
        setField(term11777, term11777.getClass(), "orderedWorkSet", null);
        term11822 = new LinkedHashMap();
        HashMap term11829 = new HashMap();
        Set<Object> term46486 =  ((Map) term11829).keySet();
        term11828 = new HashSet((Collection<? extends Object>) term46486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Iterable");
        argTypes[1] = Class.forName("java.lang.Iterable");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term11822;
        args[3] = term11828;
        try {
            callMethod(klass, "maybeResolveTemplateTypeFromNodes", argTypes, term11777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


