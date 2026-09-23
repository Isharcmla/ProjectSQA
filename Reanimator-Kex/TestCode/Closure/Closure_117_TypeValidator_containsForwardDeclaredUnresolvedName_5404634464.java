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

public class TypeValidator_containsForwardDeclaredUnresolvedName_5404634464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4746;

    public TypeValidator_containsForwardDeclaredUnresolvedName_5404634464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23034 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term23033 = ((Class) term23034).getDeclaredField((String) "PUBLIC");
        ((Field) term23033).setAccessible(true);
        Object enum50 = ((Field) term23033).get((Object) null);
        term4746 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term4747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term4748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4762 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4763 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term4766 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term4767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4773 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4774 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term4781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term4746, term4746.getClass(), "compiler", null);
        setField(term4748, term4748.getClass(), "name", "RSaoipUlsg");
        setField(term4748, term4748.getClass(), "referencedType", null);
        setField(term4748, term4748.getClass(), "referencedObjType", null);
        setBooleanField(term4748, term4748.getClass(), "visited", false);
        setField(term4763, term4763.getClass(), "baseType", null);
        setField(term4763, term4763.getClass(), "extendedInterfaces", null);
        setField(term4763, term4763.getClass(), "implementedInterfaces", null);
        setField(term4763, term4763.getClass(), "parameters", null);
        setField(term4763, term4763.getClass(), "thrownTypes", null);
        setField(term4763, term4763.getClass(), "templateTypeNames", null);
        setField(term4763, term4763.getClass(), "disposedParameters", null);
        setField(term4763, term4763.getClass(), "description", null);
        setField(term4763, term4763.getClass(), "meaning", null);
        setField(term4763, term4763.getClass(), "deprecated", null);
        setField(term4763, term4763.getClass(), "license", null);
        setField(term4763, term4763.getClass(), "suppressions", null);
        setField(term4763, term4763.getClass(), "modifies", null);
        setField(term4763, term4763.getClass(), "lendsName", null);
        setBooleanField(term4763, term4763.getClass(), "ngInject", true);
        setBooleanField(term4763, term4763.getClass(), "wizaction", false);
        setField(term4762, term4762.getClass(), "info", term4763);
        setField(term4766, term4766.getClass(), "sourceComment", null);
        setField(term4766, term4766.getClass(), "markers", null);
        setField(term4766, term4766.getClass(), "parameters", null);
        setField(term4766, term4766.getClass(), "throwsDescriptions", null);
        setField(term4766, term4766.getClass(), "blockDescription", null);
        setField(term4766, term4766.getClass(), "fileOverview", null);
        setField(term4766, term4766.getClass(), "returnDescription", null);
        setField(term4766, term4766.getClass(), "version", null);
        setField(term4766, term4766.getClass(), "authors", null);
        setField(term4766, term4766.getClass(), "sees", null);
        setField(term4762, term4762.getClass(), "documentation", term4766);
        setIntField(term4767, term4767.getClass(), "type", 0);
        setField(term4767, term4767.getClass(), "next", null);
        setField(term4767, term4767.getClass(), "first", null);
        setField(term4767, term4767.getClass(), "last", null);
        setField(term4767, term4767.getClass(), "propListHead", null);
        setIntField(term4767, term4767.getClass(), "sourcePosition", 0);
        setField(term4767, term4767.getClass(), "jsType", null);
        setField(term4767, term4767.getClass(), "parent", null);
        setField(term4762, term4762.getClass(), "associatedNode", term4767);
        setField(term4762, term4762.getClass(), "visibility", enum50);
        setIntField(term4762, term4762.getClass(), "bitset", 1152356969);
        setField(term4773, term4773.getClass(), "root", null);
        setField(term4773, term4773.getClass(), "sourceName", null);
        setField(term4762, term4762.getClass(), "type", term4773);
        setField(term4774, term4774.getClass(), "root", null);
        setField(term4774, term4774.getClass(), "sourceName", null);
        setField(term4762, term4762.getClass(), "thisType", term4774);
        setBooleanField(term4762, term4762.getClass(), "includeDocumentation", false);
        setIntField(term4762, term4762.getClass(), "originalCommentPosition", -1667990367);
        setField(term4748, term4748.getClass(), "docInfo", term4762);
        setBooleanField(term4748, term4748.getClass(), "unknown", true);
        setBooleanField(term4748, term4748.getClass(), "resolved", false);
        setField(term4748, term4748.getClass(), "resolveResult", null);
        setField(term4779, term4779.getClass(), "templateKeys", null);
        setField(term4779, term4779.getClass(), "templateValues", null);
        setField(term4779, term4779.getClass(), "resolvedTemplateValues", null);
        setField(term4779, term4779.getClass(), "registry", null);
        setField(term4748, term4748.getClass(), "templateTypeMap", term4779);
        setBooleanField(term4748, term4748.getClass(), "inTemplatedCheckVisit", true);
        setField(term4748, term4748.getClass(), "registry", null);
        setField(term4747, term4747.getClass(), "objectIndexTemplateKey", term4748);
        setField(term4781, term4781.getClass(), "name", null);
        setField(term4781, term4781.getClass(), "referencedType", null);
        setField(term4781, term4781.getClass(), "referencedObjType", null);
        setBooleanField(term4781, term4781.getClass(), "visited", false);
        setField(term4781, term4781.getClass(), "docInfo", null);
        setBooleanField(term4781, term4781.getClass(), "unknown", false);
        setBooleanField(term4781, term4781.getClass(), "resolved", false);
        setField(term4781, term4781.getClass(), "resolveResult", null);
        setField(term4781, term4781.getClass(), "templateTypeMap", null);
        setBooleanField(term4781, term4781.getClass(), "inTemplatedCheckVisit", false);
        setField(term4781, term4781.getClass(), "registry", null);
        setField(term4747, term4747.getClass(), "objectElementTemplateKey", term4781);
        setField(term4747, term4747.getClass(), "reporter", null);
        setField(term4747, term4747.getClass(), "nativeTypes", null);
        setField(term4747, term4747.getClass(), "namesToTypes", null);
        setField(term4747, term4747.getClass(), "namespaces", null);
        setField(term4747, term4747.getClass(), "nonNullableTypeNames", null);
        setField(term4747, term4747.getClass(), "forwardDeclaredTypes", null);
        setField(term4747, term4747.getClass(), "typesIndexedByProperty", null);
        setField(term4747, term4747.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term4747, term4747.getClass(), "greatestSubtypeByProperty", null);
        setField(term4747, term4747.getClass(), "interfaceToImplementors", null);
        setField(term4747, term4747.getClass(), "unresolvedNamedTypes", null);
        setField(term4747, term4747.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4747, term4747.getClass(), "lastGeneration", false);
        setField(term4747, term4747.getClass(), "templateTypes", null);
        setField(term4747, term4747.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term4747, term4747.getClass(), "tolerateUndefinedValues", false);
        setField(term4746, term4746.getClass(), "typeRegistry", term4747);
        setField(term4746, term4746.getClass(), "allValueTypes", null);
        setBooleanField(term4746, term4746.getClass(), "shouldReport", false);
        setField(term4746, term4746.getClass(), "nullOrUndefined", null);
        setField(term4746, term4746.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsForwardDeclaredUnresolvedName", argTypes, term4746, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


