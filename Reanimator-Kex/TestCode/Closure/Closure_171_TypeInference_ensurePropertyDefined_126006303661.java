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

public class TypeInference_ensurePropertyDefined_126006303661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3724;
     Object term3766;

    public TypeInference_ensurePropertyDefined_126006303661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30666 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term30665 = ((Class) term30666).getDeclaredField((String) "PRIVATE");
        ((Field) term30665).setAccessible(true);
        Object enum79 = ((Field) term30665).get((Object) null);
        term3724 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term3725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term3726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3740 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term3741 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term3744 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term3745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3751 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3752 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term3757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term3759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term3724, term3724.getClass(), "compiler", null);
        setField(term3726, term3726.getClass(), "name", "EKjQdtKxAM");
        setField(term3726, term3726.getClass(), "referencedType", null);
        setField(term3726, term3726.getClass(), "referencedObjType", null);
        setBooleanField(term3726, term3726.getClass(), "visited", false);
        setField(term3741, term3741.getClass(), "baseType", null);
        setField(term3741, term3741.getClass(), "extendedInterfaces", null);
        setField(term3741, term3741.getClass(), "implementedInterfaces", null);
        setField(term3741, term3741.getClass(), "parameters", null);
        setField(term3741, term3741.getClass(), "thrownTypes", null);
        setField(term3741, term3741.getClass(), "templateTypeNames", null);
        setField(term3741, term3741.getClass(), "description", null);
        setField(term3741, term3741.getClass(), "meaning", null);
        setField(term3741, term3741.getClass(), "deprecated", null);
        setField(term3741, term3741.getClass(), "license", null);
        setField(term3741, term3741.getClass(), "suppressions", null);
        setField(term3741, term3741.getClass(), "modifies", null);
        setField(term3741, term3741.getClass(), "lendsName", null);
        setBooleanField(term3741, term3741.getClass(), "ngInject", false);
        setBooleanField(term3741, term3741.getClass(), "wizaction", true);
        setField(term3740, term3740.getClass(), "info", term3741);
        setField(term3744, term3744.getClass(), "sourceComment", null);
        setField(term3744, term3744.getClass(), "markers", null);
        setField(term3744, term3744.getClass(), "parameters", null);
        setField(term3744, term3744.getClass(), "throwsDescriptions", null);
        setField(term3744, term3744.getClass(), "blockDescription", null);
        setField(term3744, term3744.getClass(), "fileOverview", null);
        setField(term3744, term3744.getClass(), "returnDescription", null);
        setField(term3744, term3744.getClass(), "version", null);
        setField(term3744, term3744.getClass(), "authors", null);
        setField(term3744, term3744.getClass(), "sees", null);
        setField(term3740, term3740.getClass(), "documentation", term3744);
        setIntField(term3745, term3745.getClass(), "type", 0);
        setField(term3745, term3745.getClass(), "next", null);
        setField(term3745, term3745.getClass(), "first", null);
        setField(term3745, term3745.getClass(), "last", null);
        setField(term3745, term3745.getClass(), "propListHead", null);
        setIntField(term3745, term3745.getClass(), "sourcePosition", 0);
        setField(term3745, term3745.getClass(), "jsType", null);
        setField(term3745, term3745.getClass(), "parent", null);
        setField(term3740, term3740.getClass(), "associatedNode", term3745);
        setField(term3740, term3740.getClass(), "visibility", enum79);
        setIntField(term3740, term3740.getClass(), "bitset", 344323424);
        setField(term3751, term3751.getClass(), "root", term3745);
        setField(term3751, term3751.getClass(), "sourceName", null);
        setField(term3740, term3740.getClass(), "type", term3751);
        setField(term3752, term3752.getClass(), "root", null);
        setField(term3752, term3752.getClass(), "sourceName", null);
        setField(term3740, term3740.getClass(), "thisType", term3752);
        setBooleanField(term3740, term3740.getClass(), "includeDocumentation", false);
        setIntField(term3740, term3740.getClass(), "originalCommentPosition", 9726679);
        setField(term3726, term3726.getClass(), "docInfo", term3740);
        setBooleanField(term3726, term3726.getClass(), "unknown", false);
        setBooleanField(term3726, term3726.getClass(), "resolved", true);
        setField(term3726, term3726.getClass(), "resolveResult", null);
        setField(term3757, term3757.getClass(), "templateKeys", null);
        setField(term3757, term3757.getClass(), "templateValues", null);
        setField(term3757, term3757.getClass(), "resolvedTemplateValues", null);
        setField(term3757, term3757.getClass(), "registry", null);
        setField(term3726, term3726.getClass(), "templateTypeMap", term3757);
        setBooleanField(term3726, term3726.getClass(), "inTemplatedCheckVisit", false);
        setField(term3726, term3726.getClass(), "registry", null);
        setField(term3725, term3725.getClass(), "objectIndexTemplateKey", term3726);
        setField(term3759, term3759.getClass(), "name", null);
        setField(term3759, term3759.getClass(), "referencedType", null);
        setField(term3759, term3759.getClass(), "referencedObjType", null);
        setBooleanField(term3759, term3759.getClass(), "visited", false);
        setField(term3759, term3759.getClass(), "docInfo", null);
        setBooleanField(term3759, term3759.getClass(), "unknown", false);
        setBooleanField(term3759, term3759.getClass(), "resolved", false);
        setField(term3759, term3759.getClass(), "resolveResult", null);
        setField(term3759, term3759.getClass(), "templateTypeMap", null);
        setBooleanField(term3759, term3759.getClass(), "inTemplatedCheckVisit", false);
        setField(term3759, term3759.getClass(), "registry", null);
        setField(term3725, term3725.getClass(), "objectElementTemplateKey", term3759);
        setField(term3725, term3725.getClass(), "reporter", null);
        setField(term3725, term3725.getClass(), "nativeTypes", null);
        setField(term3725, term3725.getClass(), "namesToTypes", null);
        setField(term3725, term3725.getClass(), "namespaces", null);
        setField(term3725, term3725.getClass(), "nonNullableTypeNames", null);
        setField(term3725, term3725.getClass(), "forwardDeclaredTypes", null);
        setField(term3725, term3725.getClass(), "typesIndexedByProperty", null);
        setField(term3725, term3725.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term3725, term3725.getClass(), "greatestSubtypeByProperty", null);
        setField(term3725, term3725.getClass(), "interfaceToImplementors", null);
        setField(term3725, term3725.getClass(), "unresolvedNamedTypes", null);
        setField(term3725, term3725.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3725, term3725.getClass(), "lastGeneration", false);
        setField(term3725, term3725.getClass(), "templateTypes", null);
        setField(term3725, term3725.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term3725, term3725.getClass(), "tolerateUndefinedValues", false);
        setField(term3725, term3725.getClass(), "resolveMode", null);
        setField(term3724, term3724.getClass(), "registry", term3725);
        setField(term3724, term3724.getClass(), "reverseInterpreter", null);
        setField(term3724, term3724.getClass(), "syntacticScope", null);
        setField(term3724, term3724.getClass(), "functionScope", null);
        setField(term3724, term3724.getClass(), "bottomScope", null);
        setField(term3724, term3724.getClass(), "assertionFunctionsMap", null);
        setField(term3724, term3724.getClass(), "unknownType", null);
        setField(term3724, term3724.getClass(), "cfg", null);
        setField(term3724, term3724.getClass(), "joinOp", null);
        setField(term3724, term3724.getClass(), "orderedWorkSet", null);
        term3766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3766, term3766.getClass(), "type", 1555897383);
        setIntField(term3768, term3768.getClass(), "type", 202001407);
        setIntField(term3770, term3770.getClass(), "type", 158873461);
        setIntField(term3772, term3772.getClass(), "type", -430151637);
        setIntField(term3774, term3774.getClass(), "type", -1697741339);
        setField(term3774, term3774.getClass(), "next", null);
        setField(term3774, term3774.getClass(), "first", null);
        setField(term3774, term3774.getClass(), "last", null);
        setField(term3774, term3774.getClass(), "propListHead", null);
        setIntField(term3774, term3774.getClass(), "sourcePosition", 0);
        setField(term3774, term3774.getClass(), "jsType", null);
        setField(term3774, term3774.getClass(), "parent", null);
        setField(term3772, term3772.getClass(), "next", term3774);
        setIntField(term3777, term3777.getClass(), "type", 98922530);
        setField(term3777, term3777.getClass(), "next", null);
        setField(term3777, term3777.getClass(), "first", null);
        setField(term3777, term3777.getClass(), "last", term3774);
        setField(term3777, term3777.getClass(), "propListHead", null);
        setIntField(term3777, term3777.getClass(), "sourcePosition", 0);
        setField(term3777, term3777.getClass(), "jsType", null);
        setField(term3777, term3777.getClass(), "parent", null);
        setField(term3772, term3772.getClass(), "first", term3777);
        setField(term3772, term3772.getClass(), "last", term3770);
        setField(term3772, term3772.getClass(), "propListHead", null);
        setIntField(term3772, term3772.getClass(), "sourcePosition", 0);
        setField(term3772, term3772.getClass(), "jsType", null);
        setField(term3772, term3772.getClass(), "parent", null);
        setField(term3770, term3770.getClass(), "next", term3772);
        setField(term3770, term3770.getClass(), "first", term3774);
        setIntField(term3781, term3781.getClass(), "type", -1498296052);
        setIntField(term3783, term3783.getClass(), "type", 2098647989);
        setField(term3783, term3783.getClass(), "next", null);
        setField(term3783, term3783.getClass(), "first", term3777);
        setField(term3783, term3783.getClass(), "last", term3772);
        setField(term3783, term3783.getClass(), "propListHead", null);
        setIntField(term3783, term3783.getClass(), "sourcePosition", 0);
        setField(term3783, term3783.getClass(), "jsType", null);
        setField(term3783, term3783.getClass(), "parent", null);
        setField(term3781, term3781.getClass(), "next", term3783);
        setField(term3781, term3781.getClass(), "first", term3768);
        setField(term3781, term3781.getClass(), "last", term3768);
        setField(term3781, term3781.getClass(), "propListHead", null);
        setIntField(term3781, term3781.getClass(), "sourcePosition", 0);
        setField(term3781, term3781.getClass(), "jsType", null);
        setField(term3781, term3781.getClass(), "parent", null);
        setField(term3770, term3770.getClass(), "last", term3781);
        setField(term3770, term3770.getClass(), "propListHead", null);
        setIntField(term3770, term3770.getClass(), "sourcePosition", 0);
        setField(term3770, term3770.getClass(), "jsType", null);
        setField(term3770, term3770.getClass(), "parent", null);
        setField(term3768, term3768.getClass(), "next", term3770);
        setIntField(term3788, term3788.getClass(), "type", 1598895173);
        setField(term3788, term3788.getClass(), "next", term3781);
        setField(term3788, term3788.getClass(), "first", term3783);
        setField(term3788, term3788.getClass(), "last", term3766);
        setField(term3788, term3788.getClass(), "propListHead", null);
        setIntField(term3788, term3788.getClass(), "sourcePosition", 0);
        setField(term3788, term3788.getClass(), "jsType", null);
        setField(term3788, term3788.getClass(), "parent", null);
        setField(term3768, term3768.getClass(), "first", term3788);
        setField(term3768, term3768.getClass(), "last", term3788);
        setField(term3768, term3768.getClass(), "propListHead", null);
        setIntField(term3768, term3768.getClass(), "sourcePosition", 0);
        setField(term3768, term3768.getClass(), "jsType", null);
        setField(term3768, term3768.getClass(), "parent", null);
        setField(term3766, term3766.getClass(), "next", term3768);
        setField(term3766, term3766.getClass(), "first", term3772);
        setField(term3766, term3766.getClass(), "last", term3774);
        setField(term3766, term3766.getClass(), "propListHead", null);
        setIntField(term3766, term3766.getClass(), "sourcePosition", 0);
        setField(term3766, term3766.getClass(), "jsType", null);
        setField(term3766, term3766.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term3766;
        args[1] = null;
        try {
            callMethod(klass, "ensurePropertyDefined", argTypes, term3724, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


