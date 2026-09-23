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

public class TypeInference_isUnflowable_16288904097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19756;
     Object term19800;

    public TypeInference_isUnflowable_16288904097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62354 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term62353 = ((Class) term62354).getDeclaredField((String) "PROTECTED");
        ((Field) term62353).setAccessible(true);
        Object enum153 = ((Field) term62353).get((Object) null);
        term19756 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term19757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term19758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term19772 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19773 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term19779 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term19780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19786 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term19793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term19756, term19756.getClass(), "compiler", null);
        setField(term19758, term19758.getClass(), "name", "LONFjqAsUp");
        setField(term19758, term19758.getClass(), "referencedType", null);
        setField(term19758, term19758.getClass(), "referencedObjType", null);
        setBooleanField(term19758, term19758.getClass(), "visited", true);
        setField(term19773, term19773.getClass(), "baseType", null);
        setField(term19773, term19773.getClass(), "extendedInterfaces", null);
        setField(term19773, term19773.getClass(), "implementedInterfaces", null);
        setField(term19773, term19773.getClass(), "parameters", null);
        setField(term19773, term19773.getClass(), "thrownTypes", null);
        setField(term19773, term19773.getClass(), "templateTypeNames", null);
        setField(term19773, term19773.getClass(), "disposedParameters", null);
        setField(term19773, term19773.getClass(), "description", null);
        setField(term19773, term19773.getClass(), "meaning", null);
        setField(term19773, term19773.getClass(), "deprecated", null);
        setField(term19773, term19773.getClass(), "license", null);
        setField(term19773, term19773.getClass(), "suppressions", null);
        setField(term19773, term19773.getClass(), "modifies", null);
        setField(term19773, term19773.getClass(), "lendsName", null);
        setBooleanField(term19773, term19773.getClass(), "ngInject", false);
        setBooleanField(term19773, term19773.getClass(), "wizaction", false);
        setBooleanField(term19773, term19773.getClass(), "jaggerInject", true);
        setBooleanField(term19773, term19773.getClass(), "jaggerProvide", false);
        setBooleanField(term19773, term19773.getClass(), "jaggerModule", true);
        setField(term19772, term19772.getClass(), "info", term19773);
        setField(term19779, term19779.getClass(), "sourceComment", null);
        setField(term19779, term19779.getClass(), "markers", null);
        setField(term19779, term19779.getClass(), "parameters", null);
        setField(term19779, term19779.getClass(), "throwsDescriptions", null);
        setField(term19779, term19779.getClass(), "blockDescription", null);
        setField(term19779, term19779.getClass(), "fileOverview", null);
        setField(term19779, term19779.getClass(), "returnDescription", null);
        setField(term19779, term19779.getClass(), "version", null);
        setField(term19779, term19779.getClass(), "authors", null);
        setField(term19779, term19779.getClass(), "sees", null);
        setField(term19772, term19772.getClass(), "documentation", term19779);
        setIntField(term19780, term19780.getClass(), "type", 0);
        setField(term19780, term19780.getClass(), "next", null);
        setField(term19780, term19780.getClass(), "first", null);
        setField(term19780, term19780.getClass(), "last", null);
        setField(term19780, term19780.getClass(), "propListHead", null);
        setIntField(term19780, term19780.getClass(), "sourcePosition", 0);
        setField(term19780, term19780.getClass(), "jsType", null);
        setField(term19780, term19780.getClass(), "parent", null);
        setField(term19772, term19772.getClass(), "associatedNode", term19780);
        setField(term19772, term19772.getClass(), "visibility", enum153);
        setIntField(term19772, term19772.getClass(), "bitset", -1212399479);
        setField(term19786, term19786.getClass(), "root", null);
        setField(term19786, term19786.getClass(), "sourceName", null);
        setField(term19772, term19772.getClass(), "type", term19786);
        setField(term19772, term19772.getClass(), "thisType", term19786);
        setBooleanField(term19772, term19772.getClass(), "includeDocumentation", false);
        setIntField(term19772, term19772.getClass(), "originalCommentPosition", 2107679041);
        setField(term19758, term19758.getClass(), "docInfo", term19772);
        setBooleanField(term19758, term19758.getClass(), "unknown", false);
        setBooleanField(term19758, term19758.getClass(), "resolved", false);
        setField(term19758, term19758.getClass(), "resolveResult", null);
        setField(term19791, term19791.getClass(), "templateKeys", null);
        setField(term19791, term19791.getClass(), "templateValues", null);
        setField(term19791, term19791.getClass(), "resolvedTemplateValues", null);
        setField(term19791, term19791.getClass(), "registry", null);
        setField(term19758, term19758.getClass(), "templateTypeMap", term19791);
        setBooleanField(term19758, term19758.getClass(), "inTemplatedCheckVisit", true);
        setField(term19758, term19758.getClass(), "registry", null);
        setField(term19757, term19757.getClass(), "objectIndexTemplateKey", term19758);
        setField(term19793, term19793.getClass(), "name", null);
        setField(term19793, term19793.getClass(), "referencedType", null);
        setField(term19793, term19793.getClass(), "referencedObjType", null);
        setBooleanField(term19793, term19793.getClass(), "visited", false);
        setField(term19793, term19793.getClass(), "docInfo", null);
        setBooleanField(term19793, term19793.getClass(), "unknown", false);
        setBooleanField(term19793, term19793.getClass(), "resolved", false);
        setField(term19793, term19793.getClass(), "resolveResult", null);
        setField(term19793, term19793.getClass(), "templateTypeMap", null);
        setBooleanField(term19793, term19793.getClass(), "inTemplatedCheckVisit", false);
        setField(term19793, term19793.getClass(), "registry", null);
        setField(term19757, term19757.getClass(), "objectElementTemplateKey", term19793);
        setField(term19757, term19757.getClass(), "reporter", null);
        setField(term19757, term19757.getClass(), "nativeTypes", null);
        setField(term19757, term19757.getClass(), "namesToTypes", null);
        setField(term19757, term19757.getClass(), "namespaces", null);
        setField(term19757, term19757.getClass(), "nonNullableTypeNames", null);
        setField(term19757, term19757.getClass(), "forwardDeclaredTypes", null);
        setField(term19757, term19757.getClass(), "typesIndexedByProperty", null);
        setField(term19757, term19757.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term19757, term19757.getClass(), "greatestSubtypeByProperty", null);
        setField(term19757, term19757.getClass(), "interfaceToImplementors", null);
        setField(term19757, term19757.getClass(), "unresolvedNamedTypes", null);
        setField(term19757, term19757.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term19757, term19757.getClass(), "lastGeneration", false);
        setField(term19757, term19757.getClass(), "templateTypes", null);
        setField(term19757, term19757.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term19757, term19757.getClass(), "tolerateUndefinedValues", false);
        setField(term19756, term19756.getClass(), "registry", term19757);
        setField(term19756, term19756.getClass(), "reverseInterpreter", null);
        setField(term19756, term19756.getClass(), "syntacticScope", null);
        setField(term19756, term19756.getClass(), "functionScope", null);
        setField(term19756, term19756.getClass(), "bottomScope", null);
        setField(term19756, term19756.getClass(), "assertionFunctionsMap", null);
        setField(term19756, term19756.getClass(), "unknownType", null);
        setField(term19756, term19756.getClass(), "cfg", null);
        setField(term19756, term19756.getClass(), "joinOp", null);
        setField(term19756, term19756.getClass(), "orderedWorkSet", null);
        term19800 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term19813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19800, term19800.getClass(), "name", "DKWEhukBpG");
        setIntField(term19813, term19813.getClass(), "type", -1281083262);
        setIntField(term19815, term19815.getClass(), "type", 1059930704);
        setIntField(term19817, term19817.getClass(), "type", -1967153290);
        setIntField(term19819, term19819.getClass(), "type", -1397251956);
        setField(term19819, term19819.getClass(), "next", null);
        setField(term19819, term19819.getClass(), "first", null);
        setField(term19819, term19819.getClass(), "last", null);
        setField(term19819, term19819.getClass(), "propListHead", null);
        setIntField(term19819, term19819.getClass(), "sourcePosition", 0);
        setField(term19819, term19819.getClass(), "jsType", null);
        setField(term19819, term19819.getClass(), "parent", null);
        setField(term19817, term19817.getClass(), "next", term19819);
        setIntField(term19822, term19822.getClass(), "type", 808614267);
        setField(term19822, term19822.getClass(), "next", null);
        setField(term19822, term19822.getClass(), "first", term19813);
        setField(term19822, term19822.getClass(), "last", null);
        setField(term19822, term19822.getClass(), "propListHead", null);
        setIntField(term19822, term19822.getClass(), "sourcePosition", 0);
        setField(term19822, term19822.getClass(), "jsType", null);
        setField(term19822, term19822.getClass(), "parent", null);
        setField(term19817, term19817.getClass(), "first", term19822);
        setIntField(term19825, term19825.getClass(), "type", 405295896);
        setField(term19825, term19825.getClass(), "next", null);
        setField(term19825, term19825.getClass(), "first", term19815);
        setField(term19825, term19825.getClass(), "last", null);
        setField(term19825, term19825.getClass(), "propListHead", null);
        setIntField(term19825, term19825.getClass(), "sourcePosition", 0);
        setField(term19825, term19825.getClass(), "jsType", null);
        setField(term19825, term19825.getClass(), "parent", null);
        setField(term19817, term19817.getClass(), "last", term19825);
        setField(term19817, term19817.getClass(), "propListHead", null);
        setIntField(term19817, term19817.getClass(), "sourcePosition", 0);
        setField(term19817, term19817.getClass(), "jsType", null);
        setField(term19817, term19817.getClass(), "parent", null);
        setField(term19815, term19815.getClass(), "next", term19817);
        setField(term19815, term19815.getClass(), "first", term19817);
        setIntField(term19829, term19829.getClass(), "type", -796934571);
        setField(term19829, term19829.getClass(), "next", term19825);
        setField(term19829, term19829.getClass(), "first", term19822);
        setField(term19829, term19829.getClass(), "last", term19822);
        setField(term19829, term19829.getClass(), "propListHead", null);
        setIntField(term19829, term19829.getClass(), "sourcePosition", 0);
        setField(term19829, term19829.getClass(), "jsType", null);
        setField(term19829, term19829.getClass(), "parent", null);
        setField(term19815, term19815.getClass(), "last", term19829);
        setField(term19815, term19815.getClass(), "propListHead", null);
        setIntField(term19815, term19815.getClass(), "sourcePosition", 0);
        setField(term19815, term19815.getClass(), "jsType", null);
        setField(term19815, term19815.getClass(), "parent", null);
        setField(term19813, term19813.getClass(), "next", term19815);
        setField(term19813, term19813.getClass(), "first", term19822);
        setIntField(term19833, term19833.getClass(), "type", 0);
        setField(term19833, term19833.getClass(), "next", null);
        setField(term19833, term19833.getClass(), "first", null);
        setField(term19833, term19833.getClass(), "last", null);
        setField(term19833, term19833.getClass(), "propListHead", null);
        setIntField(term19833, term19833.getClass(), "sourcePosition", 0);
        setField(term19833, term19833.getClass(), "jsType", null);
        setField(term19833, term19833.getClass(), "parent", null);
        setField(term19813, term19813.getClass(), "last", term19833);
        setField(term19813, term19813.getClass(), "propListHead", null);
        setIntField(term19813, term19813.getClass(), "sourcePosition", 0);
        setField(term19813, term19813.getClass(), "jsType", null);
        setField(term19813, term19813.getClass(), "parent", null);
        setField(term19800, term19800.getClass(), "nameNode", term19813);
        setField(term19800, term19800.getClass(), "type", null);
        setBooleanField(term19800, term19800.getClass(), "typeInferred", false);
        setField(term19800, term19800.getClass(), "input", null);
        setIntField(term19800, term19800.getClass(), "index", 0);
        setField(term19800, term19800.getClass(), "scope", null);
        setBooleanField(term19800, term19800.getClass(), "markedEscaped", false);
        setBooleanField(term19800, term19800.getClass(), "markedAssignedExactlyOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term19800;
        try {
            callMethod(klass, "isUnflowable", argTypes, term19756, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


