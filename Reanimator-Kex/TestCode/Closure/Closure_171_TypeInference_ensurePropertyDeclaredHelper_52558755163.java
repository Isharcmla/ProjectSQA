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

public class TypeInference_ensurePropertyDeclaredHelper_52558755163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4424;
     Object term4466;

    public TypeInference_ensurePropertyDeclaredHelper_52558755163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32185 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term32184 = ((Class) term32185).getDeclaredField((String) "PUBLIC");
        ((Field) term32184).setAccessible(true);
        Object enum82 = ((Field) term32184).get((Object) null);
        term4424 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term4426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4440 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4441 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term4444 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term4445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4451 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4452 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term4459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term4424, term4424.getClass(), "compiler", null);
        setField(term4426, term4426.getClass(), "name", "llRfwANcVF");
        setField(term4426, term4426.getClass(), "referencedType", null);
        setField(term4426, term4426.getClass(), "referencedObjType", null);
        setBooleanField(term4426, term4426.getClass(), "visited", false);
        setField(term4441, term4441.getClass(), "baseType", null);
        setField(term4441, term4441.getClass(), "extendedInterfaces", null);
        setField(term4441, term4441.getClass(), "implementedInterfaces", null);
        setField(term4441, term4441.getClass(), "parameters", null);
        setField(term4441, term4441.getClass(), "thrownTypes", null);
        setField(term4441, term4441.getClass(), "templateTypeNames", null);
        setField(term4441, term4441.getClass(), "description", null);
        setField(term4441, term4441.getClass(), "meaning", null);
        setField(term4441, term4441.getClass(), "deprecated", null);
        setField(term4441, term4441.getClass(), "license", null);
        setField(term4441, term4441.getClass(), "suppressions", null);
        setField(term4441, term4441.getClass(), "modifies", null);
        setField(term4441, term4441.getClass(), "lendsName", null);
        setBooleanField(term4441, term4441.getClass(), "ngInject", true);
        setBooleanField(term4441, term4441.getClass(), "wizaction", true);
        setField(term4440, term4440.getClass(), "info", term4441);
        setField(term4444, term4444.getClass(), "sourceComment", null);
        setField(term4444, term4444.getClass(), "markers", null);
        setField(term4444, term4444.getClass(), "parameters", null);
        setField(term4444, term4444.getClass(), "throwsDescriptions", null);
        setField(term4444, term4444.getClass(), "blockDescription", null);
        setField(term4444, term4444.getClass(), "fileOverview", null);
        setField(term4444, term4444.getClass(), "returnDescription", null);
        setField(term4444, term4444.getClass(), "version", null);
        setField(term4444, term4444.getClass(), "authors", null);
        setField(term4444, term4444.getClass(), "sees", null);
        setField(term4440, term4440.getClass(), "documentation", term4444);
        setIntField(term4445, term4445.getClass(), "type", 0);
        setField(term4445, term4445.getClass(), "next", null);
        setField(term4445, term4445.getClass(), "first", null);
        setField(term4445, term4445.getClass(), "last", null);
        setField(term4445, term4445.getClass(), "propListHead", null);
        setIntField(term4445, term4445.getClass(), "sourcePosition", 0);
        setField(term4445, term4445.getClass(), "jsType", null);
        setField(term4445, term4445.getClass(), "parent", null);
        setField(term4440, term4440.getClass(), "associatedNode", term4445);
        setField(term4440, term4440.getClass(), "visibility", enum82);
        setIntField(term4440, term4440.getClass(), "bitset", -1274456137);
        setField(term4451, term4451.getClass(), "root", null);
        setField(term4451, term4451.getClass(), "sourceName", null);
        setField(term4440, term4440.getClass(), "type", term4451);
        setField(term4452, term4452.getClass(), "root", null);
        setField(term4452, term4452.getClass(), "sourceName", null);
        setField(term4440, term4440.getClass(), "thisType", term4452);
        setBooleanField(term4440, term4440.getClass(), "includeDocumentation", true);
        setIntField(term4440, term4440.getClass(), "originalCommentPosition", 1041916673);
        setField(term4426, term4426.getClass(), "docInfo", term4440);
        setBooleanField(term4426, term4426.getClass(), "unknown", true);
        setBooleanField(term4426, term4426.getClass(), "resolved", true);
        setField(term4426, term4426.getClass(), "resolveResult", null);
        setField(term4457, term4457.getClass(), "templateKeys", null);
        setField(term4457, term4457.getClass(), "templateValues", null);
        setField(term4457, term4457.getClass(), "resolvedTemplateValues", null);
        setField(term4457, term4457.getClass(), "registry", null);
        setField(term4426, term4426.getClass(), "templateTypeMap", term4457);
        setBooleanField(term4426, term4426.getClass(), "inTemplatedCheckVisit", false);
        setField(term4426, term4426.getClass(), "registry", null);
        setField(term4425, term4425.getClass(), "objectIndexTemplateKey", term4426);
        setField(term4459, term4459.getClass(), "name", null);
        setField(term4459, term4459.getClass(), "referencedType", null);
        setField(term4459, term4459.getClass(), "referencedObjType", null);
        setBooleanField(term4459, term4459.getClass(), "visited", false);
        setField(term4459, term4459.getClass(), "docInfo", null);
        setBooleanField(term4459, term4459.getClass(), "unknown", false);
        setBooleanField(term4459, term4459.getClass(), "resolved", false);
        setField(term4459, term4459.getClass(), "resolveResult", null);
        setField(term4459, term4459.getClass(), "templateTypeMap", null);
        setBooleanField(term4459, term4459.getClass(), "inTemplatedCheckVisit", false);
        setField(term4459, term4459.getClass(), "registry", null);
        setField(term4425, term4425.getClass(), "objectElementTemplateKey", term4459);
        setField(term4425, term4425.getClass(), "reporter", null);
        setField(term4425, term4425.getClass(), "nativeTypes", null);
        setField(term4425, term4425.getClass(), "namesToTypes", null);
        setField(term4425, term4425.getClass(), "namespaces", null);
        setField(term4425, term4425.getClass(), "nonNullableTypeNames", null);
        setField(term4425, term4425.getClass(), "forwardDeclaredTypes", null);
        setField(term4425, term4425.getClass(), "typesIndexedByProperty", null);
        setField(term4425, term4425.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term4425, term4425.getClass(), "greatestSubtypeByProperty", null);
        setField(term4425, term4425.getClass(), "interfaceToImplementors", null);
        setField(term4425, term4425.getClass(), "unresolvedNamedTypes", null);
        setField(term4425, term4425.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4425, term4425.getClass(), "lastGeneration", false);
        setField(term4425, term4425.getClass(), "templateTypes", null);
        setField(term4425, term4425.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term4425, term4425.getClass(), "tolerateUndefinedValues", false);
        setField(term4425, term4425.getClass(), "resolveMode", null);
        setField(term4424, term4424.getClass(), "registry", term4425);
        setField(term4424, term4424.getClass(), "reverseInterpreter", null);
        setField(term4424, term4424.getClass(), "syntacticScope", null);
        setField(term4424, term4424.getClass(), "functionScope", null);
        setField(term4424, term4424.getClass(), "bottomScope", null);
        setField(term4424, term4424.getClass(), "assertionFunctionsMap", null);
        setField(term4424, term4424.getClass(), "unknownType", null);
        setField(term4424, term4424.getClass(), "cfg", null);
        setField(term4424, term4424.getClass(), "joinOp", null);
        setField(term4424, term4424.getClass(), "orderedWorkSet", null);
        term4466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4466, term4466.getClass(), "type", 663292551);
        setIntField(term4468, term4468.getClass(), "type", -1885090354);
        setIntField(term4470, term4470.getClass(), "type", -2066804303);
        setIntField(term4472, term4472.getClass(), "type", -1731761810);
        setIntField(term4474, term4474.getClass(), "type", 197109649);
        setField(term4474, term4474.getClass(), "next", null);
        setField(term4474, term4474.getClass(), "first", null);
        setField(term4474, term4474.getClass(), "last", null);
        setField(term4474, term4474.getClass(), "propListHead", null);
        setIntField(term4474, term4474.getClass(), "sourcePosition", 0);
        setField(term4474, term4474.getClass(), "jsType", null);
        setField(term4474, term4474.getClass(), "parent", null);
        setField(term4472, term4472.getClass(), "next", term4474);
        setIntField(term4477, term4477.getClass(), "type", -1239406390);
        setField(term4477, term4477.getClass(), "next", null);
        setField(term4477, term4477.getClass(), "first", null);
        setField(term4477, term4477.getClass(), "last", term4474);
        setField(term4477, term4477.getClass(), "propListHead", null);
        setIntField(term4477, term4477.getClass(), "sourcePosition", 0);
        setField(term4477, term4477.getClass(), "jsType", null);
        setField(term4477, term4477.getClass(), "parent", null);
        setField(term4472, term4472.getClass(), "first", term4477);
        setField(term4472, term4472.getClass(), "last", term4470);
        setField(term4472, term4472.getClass(), "propListHead", null);
        setIntField(term4472, term4472.getClass(), "sourcePosition", 0);
        setField(term4472, term4472.getClass(), "jsType", null);
        setField(term4472, term4472.getClass(), "parent", null);
        setField(term4470, term4470.getClass(), "next", term4472);
        setField(term4470, term4470.getClass(), "first", term4474);
        setIntField(term4481, term4481.getClass(), "type", -1504890659);
        setIntField(term4483, term4483.getClass(), "type", 1358829571);
        setField(term4483, term4483.getClass(), "next", null);
        setField(term4483, term4483.getClass(), "first", term4477);
        setField(term4483, term4483.getClass(), "last", term4472);
        setField(term4483, term4483.getClass(), "propListHead", null);
        setIntField(term4483, term4483.getClass(), "sourcePosition", 0);
        setField(term4483, term4483.getClass(), "jsType", null);
        setField(term4483, term4483.getClass(), "parent", null);
        setField(term4481, term4481.getClass(), "next", term4483);
        setField(term4481, term4481.getClass(), "first", term4468);
        setField(term4481, term4481.getClass(), "last", term4468);
        setField(term4481, term4481.getClass(), "propListHead", null);
        setIntField(term4481, term4481.getClass(), "sourcePosition", 0);
        setField(term4481, term4481.getClass(), "jsType", null);
        setField(term4481, term4481.getClass(), "parent", null);
        setField(term4470, term4470.getClass(), "last", term4481);
        setField(term4470, term4470.getClass(), "propListHead", null);
        setIntField(term4470, term4470.getClass(), "sourcePosition", 0);
        setField(term4470, term4470.getClass(), "jsType", null);
        setField(term4470, term4470.getClass(), "parent", null);
        setField(term4468, term4468.getClass(), "next", term4470);
        setIntField(term4488, term4488.getClass(), "type", 991356662);
        setField(term4488, term4488.getClass(), "next", term4481);
        setField(term4488, term4488.getClass(), "first", term4483);
        setField(term4488, term4488.getClass(), "last", term4466);
        setField(term4488, term4488.getClass(), "propListHead", null);
        setIntField(term4488, term4488.getClass(), "sourcePosition", 0);
        setField(term4488, term4488.getClass(), "jsType", null);
        setField(term4488, term4488.getClass(), "parent", null);
        setField(term4468, term4468.getClass(), "first", term4488);
        setField(term4468, term4468.getClass(), "last", term4488);
        setField(term4468, term4468.getClass(), "propListHead", null);
        setIntField(term4468, term4468.getClass(), "sourcePosition", 0);
        setField(term4468, term4468.getClass(), "jsType", null);
        setField(term4468, term4468.getClass(), "parent", null);
        setField(term4466, term4466.getClass(), "next", term4468);
        setField(term4466, term4466.getClass(), "first", term4472);
        setField(term4466, term4466.getClass(), "last", term4474);
        setField(term4466, term4466.getClass(), "propListHead", null);
        setIntField(term4466, term4466.getClass(), "sourcePosition", 0);
        setField(term4466, term4466.getClass(), "jsType", null);
        setField(term4466, term4466.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[2];
        args[0] = term4466;
        args[1] = null;
        try {
            callMethod(klass, "ensurePropertyDeclaredHelper", argTypes, term4424, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


