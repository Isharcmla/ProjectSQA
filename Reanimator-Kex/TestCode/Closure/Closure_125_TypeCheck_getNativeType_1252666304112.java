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

public class TypeCheck_getNativeType_1252666304112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12543;
     Object enum31;

    public TypeCheck_getNativeType_1252666304112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12543 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term12544 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term12545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term12546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12549 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term12557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term12543, term12543.getClass(), "compiler", null);
        setField(term12544, term12544.getClass(), "compiler", null);
        setField(term12546, term12546.getClass(), "name", "");
        setField(term12546, term12546.getClass(), "referencedType", null);
        setField(term12546, term12546.getClass(), "referencedObjType", null);
        setBooleanField(term12546, term12546.getClass(), "visited", false);
        setField(term12549, term12549.getClass(), "info", null);
        setField(term12549, term12549.getClass(), "documentation", null);
        setField(term12549, term12549.getClass(), "associatedNode", null);
        setField(term12549, term12549.getClass(), "visibility", null);
        setIntField(term12549, term12549.getClass(), "bitset", -1286686332);
        setField(term12549, term12549.getClass(), "type", null);
        setField(term12549, term12549.getClass(), "thisType", null);
        setBooleanField(term12549, term12549.getClass(), "includeDocumentation", false);
        setIntField(term12549, term12549.getClass(), "originalCommentPosition", -284885486);
        setField(term12546, term12546.getClass(), "docInfo", term12549);
        setBooleanField(term12546, term12546.getClass(), "unknown", false);
        setBooleanField(term12546, term12546.getClass(), "resolved", true);
        setField(term12546, term12546.getClass(), "resolveResult", null);
        setField(term12555, term12555.getClass(), "templateKeys", null);
        setField(term12555, term12555.getClass(), "templateValues", null);
        setField(term12555, term12555.getClass(), "resolvedTemplateValues", null);
        setField(term12555, term12555.getClass(), "registry", null);
        setField(term12546, term12546.getClass(), "templateTypeMap", term12555);
        setBooleanField(term12546, term12546.getClass(), "inTemplatedCheckVisit", true);
        setField(term12546, term12546.getClass(), "registry", null);
        setField(term12545, term12545.getClass(), "objectIndexTemplateKey", term12546);
        setField(term12557, term12557.getClass(), "name", null);
        setField(term12557, term12557.getClass(), "referencedType", null);
        setField(term12557, term12557.getClass(), "referencedObjType", null);
        setBooleanField(term12557, term12557.getClass(), "visited", false);
        setField(term12557, term12557.getClass(), "docInfo", null);
        setBooleanField(term12557, term12557.getClass(), "unknown", false);
        setBooleanField(term12557, term12557.getClass(), "resolved", false);
        setField(term12557, term12557.getClass(), "resolveResult", null);
        setField(term12557, term12557.getClass(), "templateTypeMap", null);
        setBooleanField(term12557, term12557.getClass(), "inTemplatedCheckVisit", false);
        setField(term12557, term12557.getClass(), "registry", null);
        setField(term12545, term12545.getClass(), "objectElementTemplateKey", term12557);
        setField(term12545, term12545.getClass(), "reporter", null);
        setField(term12545, term12545.getClass(), "nativeTypes", null);
        setField(term12545, term12545.getClass(), "namesToTypes", null);
        setField(term12545, term12545.getClass(), "namespaces", null);
        setField(term12545, term12545.getClass(), "nonNullableTypeNames", null);
        setField(term12545, term12545.getClass(), "forwardDeclaredTypes", null);
        setField(term12545, term12545.getClass(), "typesIndexedByProperty", null);
        setField(term12545, term12545.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term12545, term12545.getClass(), "greatestSubtypeByProperty", null);
        setField(term12545, term12545.getClass(), "interfaceToImplementors", null);
        setField(term12545, term12545.getClass(), "unresolvedNamedTypes", null);
        setField(term12545, term12545.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12545, term12545.getClass(), "lastGeneration", false);
        setField(term12545, term12545.getClass(), "templateTypes", null);
        setField(term12545, term12545.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term12545, term12545.getClass(), "tolerateUndefinedValues", false);
        setField(term12545, term12545.getClass(), "resolveMode", null);
        setField(term12544, term12544.getClass(), "typeRegistry", term12545);
        setField(term12544, term12544.getClass(), "allValueTypes", null);
        setBooleanField(term12544, term12544.getClass(), "shouldReport", false);
        setField(term12544, term12544.getClass(), "nullOrUndefined", null);
        setField(term12544, term12544.getClass(), "mismatches", null);
        setField(term12543, term12543.getClass(), "validator", term12544);
        setField(term12543, term12543.getClass(), "reverseInterpreter", null);
        setField(term12543, term12543.getClass(), "typeRegistry", null);
        setField(term12543, term12543.getClass(), "topScope", null);
        setField(term12543, term12543.getClass(), "scopeCreator", null);
        setField(term12543, term12543.getClass(), "reportMissingOverride", null);
        setBooleanField(term12543, term12543.getClass(), "reportUnknownTypes", false);
        setBooleanField(term12543, term12543.getClass(), "reportMissingProperties", false);
        setField(term12543, term12543.getClass(), "inferJSDocInfo", null);
        setIntField(term12543, term12543.getClass(), "typedCount", 0);
        setIntField(term12543, term12543.getClass(), "nullCount", 0);
        setIntField(term12543, term12543.getClass(), "unknownCount", 0);
        setBooleanField(term12543, term12543.getClass(), "inExterns", false);
        setIntField(term12543, term12543.getClass(), "noTypeCheckSection", 0);
        setField(term12543, term12543.getClass(), "editDistance", null);
        Class<? extends Object> term27185 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term27184 = ((Class) term27185).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term27184).setAccessible(true);
        enum31 = ((Field) term27184).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum31;
        try {
            callMethod(klass, "getNativeType", argTypes, term12543, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


