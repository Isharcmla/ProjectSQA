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

public class TypeValidator_getNativeType_177806635884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16792;
     Object enum72;

    public TypeValidator_getNativeType_177806635884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34171 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term34170 = ((Class) term34171).getDeclaredField((String) "PROTECTED");
        ((Field) term34170).setAccessible(true);
        Object enum71 = ((Field) term34170).get((Object) null);
        term16792 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term16793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term16794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16808 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16809 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16812 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16819 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16820 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term16827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term16792, term16792.getClass(), "compiler", null);
        setField(term16794, term16794.getClass(), "name", "cuWgFcYkPC");
        setField(term16794, term16794.getClass(), "referencedType", null);
        setField(term16794, term16794.getClass(), "referencedObjType", null);
        setBooleanField(term16794, term16794.getClass(), "visited", true);
        setField(term16809, term16809.getClass(), "baseType", null);
        setField(term16809, term16809.getClass(), "extendedInterfaces", null);
        setField(term16809, term16809.getClass(), "implementedInterfaces", null);
        setField(term16809, term16809.getClass(), "parameters", null);
        setField(term16809, term16809.getClass(), "thrownTypes", null);
        setField(term16809, term16809.getClass(), "templateTypeNames", null);
        setField(term16809, term16809.getClass(), "disposedParameters", null);
        setField(term16809, term16809.getClass(), "description", null);
        setField(term16809, term16809.getClass(), "meaning", null);
        setField(term16809, term16809.getClass(), "deprecated", null);
        setField(term16809, term16809.getClass(), "license", null);
        setField(term16809, term16809.getClass(), "suppressions", null);
        setField(term16809, term16809.getClass(), "modifies", null);
        setField(term16809, term16809.getClass(), "lendsName", null);
        setBooleanField(term16809, term16809.getClass(), "ngInject", true);
        setBooleanField(term16809, term16809.getClass(), "wizaction", false);
        setField(term16808, term16808.getClass(), "info", term16809);
        setField(term16812, term16812.getClass(), "sourceComment", null);
        setField(term16812, term16812.getClass(), "markers", null);
        setField(term16812, term16812.getClass(), "parameters", null);
        setField(term16812, term16812.getClass(), "throwsDescriptions", null);
        setField(term16812, term16812.getClass(), "blockDescription", null);
        setField(term16812, term16812.getClass(), "fileOverview", null);
        setField(term16812, term16812.getClass(), "returnDescription", null);
        setField(term16812, term16812.getClass(), "version", null);
        setField(term16812, term16812.getClass(), "authors", null);
        setField(term16812, term16812.getClass(), "sees", null);
        setField(term16808, term16808.getClass(), "documentation", term16812);
        setIntField(term16813, term16813.getClass(), "type", 0);
        setField(term16813, term16813.getClass(), "next", null);
        setField(term16813, term16813.getClass(), "first", null);
        setField(term16813, term16813.getClass(), "last", null);
        setField(term16813, term16813.getClass(), "propListHead", null);
        setIntField(term16813, term16813.getClass(), "sourcePosition", 0);
        setField(term16813, term16813.getClass(), "jsType", null);
        setField(term16813, term16813.getClass(), "parent", null);
        setField(term16808, term16808.getClass(), "associatedNode", term16813);
        setField(term16808, term16808.getClass(), "visibility", enum71);
        setIntField(term16808, term16808.getClass(), "bitset", 1213549815);
        setField(term16819, term16819.getClass(), "root", null);
        setField(term16819, term16819.getClass(), "sourceName", null);
        setField(term16808, term16808.getClass(), "type", term16819);
        setField(term16820, term16820.getClass(), "root", null);
        setField(term16820, term16820.getClass(), "sourceName", null);
        setField(term16808, term16808.getClass(), "thisType", term16820);
        setBooleanField(term16808, term16808.getClass(), "includeDocumentation", false);
        setIntField(term16808, term16808.getClass(), "originalCommentPosition", -1518419301);
        setField(term16794, term16794.getClass(), "docInfo", term16808);
        setBooleanField(term16794, term16794.getClass(), "unknown", true);
        setBooleanField(term16794, term16794.getClass(), "resolved", false);
        setField(term16794, term16794.getClass(), "resolveResult", null);
        setField(term16825, term16825.getClass(), "templateKeys", null);
        setField(term16825, term16825.getClass(), "templateValues", null);
        setField(term16825, term16825.getClass(), "resolvedTemplateValues", null);
        setField(term16825, term16825.getClass(), "registry", null);
        setField(term16794, term16794.getClass(), "templateTypeMap", term16825);
        setBooleanField(term16794, term16794.getClass(), "inTemplatedCheckVisit", true);
        setField(term16794, term16794.getClass(), "registry", null);
        setField(term16793, term16793.getClass(), "objectIndexTemplateKey", term16794);
        setField(term16827, term16827.getClass(), "name", null);
        setField(term16827, term16827.getClass(), "referencedType", null);
        setField(term16827, term16827.getClass(), "referencedObjType", null);
        setBooleanField(term16827, term16827.getClass(), "visited", false);
        setField(term16827, term16827.getClass(), "docInfo", null);
        setBooleanField(term16827, term16827.getClass(), "unknown", false);
        setBooleanField(term16827, term16827.getClass(), "resolved", false);
        setField(term16827, term16827.getClass(), "resolveResult", null);
        setField(term16827, term16827.getClass(), "templateTypeMap", null);
        setBooleanField(term16827, term16827.getClass(), "inTemplatedCheckVisit", false);
        setField(term16827, term16827.getClass(), "registry", null);
        setField(term16793, term16793.getClass(), "objectElementTemplateKey", term16827);
        setField(term16793, term16793.getClass(), "reporter", null);
        setField(term16793, term16793.getClass(), "nativeTypes", null);
        setField(term16793, term16793.getClass(), "namesToTypes", null);
        setField(term16793, term16793.getClass(), "namespaces", null);
        setField(term16793, term16793.getClass(), "nonNullableTypeNames", null);
        setField(term16793, term16793.getClass(), "forwardDeclaredTypes", null);
        setField(term16793, term16793.getClass(), "typesIndexedByProperty", null);
        setField(term16793, term16793.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term16793, term16793.getClass(), "greatestSubtypeByProperty", null);
        setField(term16793, term16793.getClass(), "interfaceToImplementors", null);
        setField(term16793, term16793.getClass(), "unresolvedNamedTypes", null);
        setField(term16793, term16793.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16793, term16793.getClass(), "lastGeneration", false);
        setField(term16793, term16793.getClass(), "templateTypes", null);
        setField(term16793, term16793.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term16793, term16793.getClass(), "tolerateUndefinedValues", false);
        setField(term16792, term16792.getClass(), "typeRegistry", term16793);
        setField(term16792, term16792.getClass(), "allValueTypes", null);
        setBooleanField(term16792, term16792.getClass(), "shouldReport", false);
        setField(term16792, term16792.getClass(), "nullOrUndefined", null);
        setField(term16792, term16792.getClass(), "mismatches", null);
        Class<? extends Object> term34445 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term34444 = ((Class) term34445).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term34444).setAccessible(true);
        enum72 = ((Field) term34444).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum72;
        try {
            callMethod(klass, "getNativeType", argTypes, term16792, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


