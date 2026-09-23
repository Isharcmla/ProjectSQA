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

public class TypeInference_maybeResolveTemplateTypeFromNodes_4227333878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11675;
     Object term11717;

    public TypeInference_maybeResolveTemplateTypeFromNodes_4227333878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46380 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term46379 = ((Class) term46380).getDeclaredField((String) "PROTECTED");
        ((Field) term46379).setAccessible(true);
        Object enum114 = ((Field) term46379).get((Object) null);
        term11675 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term11676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term11677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term11691 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11692 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term11695 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term11696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11702 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11703 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term11710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term11675, term11675.getClass(), "compiler", null);
        setField(term11677, term11677.getClass(), "name", "goqNSmXSSS");
        setField(term11677, term11677.getClass(), "referencedType", null);
        setField(term11677, term11677.getClass(), "referencedObjType", null);
        setBooleanField(term11677, term11677.getClass(), "visited", true);
        setField(term11692, term11692.getClass(), "baseType", null);
        setField(term11692, term11692.getClass(), "extendedInterfaces", null);
        setField(term11692, term11692.getClass(), "implementedInterfaces", null);
        setField(term11692, term11692.getClass(), "parameters", null);
        setField(term11692, term11692.getClass(), "thrownTypes", null);
        setField(term11692, term11692.getClass(), "templateTypeNames", null);
        setField(term11692, term11692.getClass(), "description", null);
        setField(term11692, term11692.getClass(), "meaning", null);
        setField(term11692, term11692.getClass(), "deprecated", null);
        setField(term11692, term11692.getClass(), "license", null);
        setField(term11692, term11692.getClass(), "suppressions", null);
        setField(term11692, term11692.getClass(), "modifies", null);
        setField(term11692, term11692.getClass(), "lendsName", null);
        setBooleanField(term11692, term11692.getClass(), "ngInject", false);
        setBooleanField(term11692, term11692.getClass(), "wizaction", true);
        setField(term11691, term11691.getClass(), "info", term11692);
        setField(term11695, term11695.getClass(), "sourceComment", null);
        setField(term11695, term11695.getClass(), "markers", null);
        setField(term11695, term11695.getClass(), "parameters", null);
        setField(term11695, term11695.getClass(), "throwsDescriptions", null);
        setField(term11695, term11695.getClass(), "blockDescription", null);
        setField(term11695, term11695.getClass(), "fileOverview", null);
        setField(term11695, term11695.getClass(), "returnDescription", null);
        setField(term11695, term11695.getClass(), "version", null);
        setField(term11695, term11695.getClass(), "authors", null);
        setField(term11695, term11695.getClass(), "sees", null);
        setField(term11691, term11691.getClass(), "documentation", term11695);
        setIntField(term11696, term11696.getClass(), "type", 0);
        setField(term11696, term11696.getClass(), "next", null);
        setField(term11696, term11696.getClass(), "first", null);
        setField(term11696, term11696.getClass(), "last", null);
        setField(term11696, term11696.getClass(), "propListHead", null);
        setIntField(term11696, term11696.getClass(), "sourcePosition", 0);
        setField(term11696, term11696.getClass(), "jsType", null);
        setField(term11696, term11696.getClass(), "parent", null);
        setField(term11691, term11691.getClass(), "associatedNode", term11696);
        setField(term11691, term11691.getClass(), "visibility", enum114);
        setIntField(term11691, term11691.getClass(), "bitset", -509349195);
        setField(term11702, term11702.getClass(), "root", null);
        setField(term11702, term11702.getClass(), "sourceName", null);
        setField(term11691, term11691.getClass(), "type", term11702);
        setField(term11703, term11703.getClass(), "root", null);
        setField(term11703, term11703.getClass(), "sourceName", null);
        setField(term11691, term11691.getClass(), "thisType", term11703);
        setBooleanField(term11691, term11691.getClass(), "includeDocumentation", true);
        setIntField(term11691, term11691.getClass(), "originalCommentPosition", -1639041228);
        setField(term11677, term11677.getClass(), "docInfo", term11691);
        setBooleanField(term11677, term11677.getClass(), "unknown", false);
        setBooleanField(term11677, term11677.getClass(), "resolved", true);
        setField(term11677, term11677.getClass(), "resolveResult", null);
        setField(term11708, term11708.getClass(), "templateKeys", null);
        setField(term11708, term11708.getClass(), "templateValues", null);
        setField(term11708, term11708.getClass(), "resolvedTemplateValues", null);
        setField(term11708, term11708.getClass(), "registry", null);
        setField(term11677, term11677.getClass(), "templateTypeMap", term11708);
        setBooleanField(term11677, term11677.getClass(), "inTemplatedCheckVisit", true);
        setField(term11677, term11677.getClass(), "registry", null);
        setField(term11676, term11676.getClass(), "objectIndexTemplateKey", term11677);
        setField(term11710, term11710.getClass(), "name", null);
        setField(term11710, term11710.getClass(), "referencedType", null);
        setField(term11710, term11710.getClass(), "referencedObjType", null);
        setBooleanField(term11710, term11710.getClass(), "visited", false);
        setField(term11710, term11710.getClass(), "docInfo", null);
        setBooleanField(term11710, term11710.getClass(), "unknown", false);
        setBooleanField(term11710, term11710.getClass(), "resolved", false);
        setField(term11710, term11710.getClass(), "resolveResult", null);
        setField(term11710, term11710.getClass(), "templateTypeMap", null);
        setBooleanField(term11710, term11710.getClass(), "inTemplatedCheckVisit", false);
        setField(term11710, term11710.getClass(), "registry", null);
        setField(term11676, term11676.getClass(), "objectElementTemplateKey", term11710);
        setField(term11676, term11676.getClass(), "reporter", null);
        setField(term11676, term11676.getClass(), "nativeTypes", null);
        setField(term11676, term11676.getClass(), "namesToTypes", null);
        setField(term11676, term11676.getClass(), "namespaces", null);
        setField(term11676, term11676.getClass(), "nonNullableTypeNames", null);
        setField(term11676, term11676.getClass(), "forwardDeclaredTypes", null);
        setField(term11676, term11676.getClass(), "typesIndexedByProperty", null);
        setField(term11676, term11676.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11676, term11676.getClass(), "greatestSubtypeByProperty", null);
        setField(term11676, term11676.getClass(), "interfaceToImplementors", null);
        setField(term11676, term11676.getClass(), "unresolvedNamedTypes", null);
        setField(term11676, term11676.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11676, term11676.getClass(), "lastGeneration", false);
        setField(term11676, term11676.getClass(), "templateTypes", null);
        setField(term11676, term11676.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term11676, term11676.getClass(), "tolerateUndefinedValues", false);
        setField(term11676, term11676.getClass(), "resolveMode", null);
        setField(term11675, term11675.getClass(), "registry", term11676);
        setField(term11675, term11675.getClass(), "reverseInterpreter", null);
        setField(term11675, term11675.getClass(), "syntacticScope", null);
        setField(term11675, term11675.getClass(), "functionScope", null);
        setField(term11675, term11675.getClass(), "bottomScope", null);
        setField(term11675, term11675.getClass(), "assertionFunctionsMap", null);
        setField(term11675, term11675.getClass(), "unknownType", null);
        setField(term11675, term11675.getClass(), "cfg", null);
        setField(term11675, term11675.getClass(), "joinOp", null);
        setField(term11675, term11675.getClass(), "orderedWorkSet", null);
        term11717 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Iterable");
        argTypes[1] = Class.forName("java.lang.Iterable");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term11717;
        try {
            callMethod(klass, "maybeResolveTemplateTypeFromNodes", argTypes, term11675, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


