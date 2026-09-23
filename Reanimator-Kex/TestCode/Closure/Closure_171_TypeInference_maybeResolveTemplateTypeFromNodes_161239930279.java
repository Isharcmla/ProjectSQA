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

public class TypeInference_maybeResolveTemplateTypeFromNodes_161239930279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11998;
     Object term12040;

    public TypeInference_maybeResolveTemplateTypeFromNodes_161239930279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46912 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term46911 = ((Class) term46912).getDeclaredField((String) "PROTECTED");
        ((Field) term46911).setAccessible(true);
        Object enum115 = ((Field) term46911).get((Object) null);
        term11998 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term11999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term12000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12014 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12015 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12018 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12025 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12026 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term12033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term11998, term11998.getClass(), "compiler", null);
        setField(term12000, term12000.getClass(), "name", "IbUFkzIgzq");
        setField(term12000, term12000.getClass(), "referencedType", null);
        setField(term12000, term12000.getClass(), "referencedObjType", null);
        setBooleanField(term12000, term12000.getClass(), "visited", false);
        setField(term12015, term12015.getClass(), "baseType", null);
        setField(term12015, term12015.getClass(), "extendedInterfaces", null);
        setField(term12015, term12015.getClass(), "implementedInterfaces", null);
        setField(term12015, term12015.getClass(), "parameters", null);
        setField(term12015, term12015.getClass(), "thrownTypes", null);
        setField(term12015, term12015.getClass(), "templateTypeNames", null);
        setField(term12015, term12015.getClass(), "description", null);
        setField(term12015, term12015.getClass(), "meaning", null);
        setField(term12015, term12015.getClass(), "deprecated", null);
        setField(term12015, term12015.getClass(), "license", null);
        setField(term12015, term12015.getClass(), "suppressions", null);
        setField(term12015, term12015.getClass(), "modifies", null);
        setField(term12015, term12015.getClass(), "lendsName", null);
        setBooleanField(term12015, term12015.getClass(), "ngInject", true);
        setBooleanField(term12015, term12015.getClass(), "wizaction", false);
        setField(term12014, term12014.getClass(), "info", term12015);
        setField(term12018, term12018.getClass(), "sourceComment", null);
        setField(term12018, term12018.getClass(), "markers", null);
        setField(term12018, term12018.getClass(), "parameters", null);
        setField(term12018, term12018.getClass(), "throwsDescriptions", null);
        setField(term12018, term12018.getClass(), "blockDescription", null);
        setField(term12018, term12018.getClass(), "fileOverview", null);
        setField(term12018, term12018.getClass(), "returnDescription", null);
        setField(term12018, term12018.getClass(), "version", null);
        setField(term12018, term12018.getClass(), "authors", null);
        setField(term12018, term12018.getClass(), "sees", null);
        setField(term12014, term12014.getClass(), "documentation", term12018);
        setIntField(term12019, term12019.getClass(), "type", -1494356104);
        setField(term12019, term12019.getClass(), "next", null);
        setField(term12019, term12019.getClass(), "first", null);
        setField(term12019, term12019.getClass(), "last", null);
        setField(term12019, term12019.getClass(), "propListHead", null);
        setIntField(term12019, term12019.getClass(), "sourcePosition", 0);
        setField(term12019, term12019.getClass(), "jsType", null);
        setField(term12019, term12019.getClass(), "parent", null);
        setField(term12014, term12014.getClass(), "associatedNode", term12019);
        setField(term12014, term12014.getClass(), "visibility", enum115);
        setIntField(term12014, term12014.getClass(), "bitset", -695279311);
        setField(term12025, term12025.getClass(), "root", null);
        setField(term12025, term12025.getClass(), "sourceName", null);
        setField(term12014, term12014.getClass(), "type", term12025);
        setField(term12026, term12026.getClass(), "root", null);
        setField(term12026, term12026.getClass(), "sourceName", null);
        setField(term12014, term12014.getClass(), "thisType", term12026);
        setBooleanField(term12014, term12014.getClass(), "includeDocumentation", true);
        setIntField(term12014, term12014.getClass(), "originalCommentPosition", 114279242);
        setField(term12000, term12000.getClass(), "docInfo", term12014);
        setBooleanField(term12000, term12000.getClass(), "unknown", true);
        setBooleanField(term12000, term12000.getClass(), "resolved", false);
        setField(term12000, term12000.getClass(), "resolveResult", null);
        setField(term12031, term12031.getClass(), "templateKeys", null);
        setField(term12031, term12031.getClass(), "templateValues", null);
        setField(term12031, term12031.getClass(), "resolvedTemplateValues", null);
        setField(term12031, term12031.getClass(), "registry", null);
        setField(term12000, term12000.getClass(), "templateTypeMap", term12031);
        setBooleanField(term12000, term12000.getClass(), "inTemplatedCheckVisit", true);
        setField(term12000, term12000.getClass(), "registry", null);
        setField(term11999, term11999.getClass(), "objectIndexTemplateKey", term12000);
        setField(term12033, term12033.getClass(), "name", null);
        setField(term12033, term12033.getClass(), "referencedType", null);
        setField(term12033, term12033.getClass(), "referencedObjType", null);
        setBooleanField(term12033, term12033.getClass(), "visited", false);
        setField(term12033, term12033.getClass(), "docInfo", null);
        setBooleanField(term12033, term12033.getClass(), "unknown", false);
        setBooleanField(term12033, term12033.getClass(), "resolved", false);
        setField(term12033, term12033.getClass(), "resolveResult", null);
        setField(term12033, term12033.getClass(), "templateTypeMap", null);
        setBooleanField(term12033, term12033.getClass(), "inTemplatedCheckVisit", false);
        setField(term12033, term12033.getClass(), "registry", null);
        setField(term11999, term11999.getClass(), "objectElementTemplateKey", term12033);
        setField(term11999, term11999.getClass(), "reporter", null);
        setField(term11999, term11999.getClass(), "nativeTypes", null);
        setField(term11999, term11999.getClass(), "namesToTypes", null);
        setField(term11999, term11999.getClass(), "namespaces", null);
        setField(term11999, term11999.getClass(), "nonNullableTypeNames", null);
        setField(term11999, term11999.getClass(), "forwardDeclaredTypes", null);
        setField(term11999, term11999.getClass(), "typesIndexedByProperty", null);
        setField(term11999, term11999.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11999, term11999.getClass(), "greatestSubtypeByProperty", null);
        setField(term11999, term11999.getClass(), "interfaceToImplementors", null);
        setField(term11999, term11999.getClass(), "unresolvedNamedTypes", null);
        setField(term11999, term11999.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11999, term11999.getClass(), "lastGeneration", false);
        setField(term11999, term11999.getClass(), "templateTypes", null);
        setField(term11999, term11999.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term11999, term11999.getClass(), "tolerateUndefinedValues", false);
        setField(term11999, term11999.getClass(), "resolveMode", null);
        setField(term11998, term11998.getClass(), "registry", term11999);
        setField(term11998, term11998.getClass(), "reverseInterpreter", null);
        setField(term11998, term11998.getClass(), "syntacticScope", null);
        setField(term11998, term11998.getClass(), "functionScope", null);
        setField(term11998, term11998.getClass(), "bottomScope", null);
        setField(term11998, term11998.getClass(), "assertionFunctionsMap", null);
        setField(term11998, term11998.getClass(), "unknownType", null);
        setField(term11998, term11998.getClass(), "cfg", null);
        setField(term11998, term11998.getClass(), "joinOp", null);
        setField(term11998, term11998.getClass(), "orderedWorkSet", null);
        term12040 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.util.Iterator");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term12040;
        try {
            callMethod(klass, "maybeResolveTemplateTypeFromNodes", argTypes, term11998, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


