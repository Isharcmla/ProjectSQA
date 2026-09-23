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

public class TypeInference_traverseCatch_137206086158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2692;
     Object term2734;

    public TypeInference_traverseCatch_137206086158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28521 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term28520 = ((Class) term28521).getDeclaredField((String) "PROTECTED");
        ((Field) term28520).setAccessible(true);
        Object enum75 = ((Field) term28520).get((Object) null);
        term2692 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term2693 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term2694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2708 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2709 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2712 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2719 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2720 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term2727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term2692, term2692.getClass(), "compiler", null);
        setField(term2694, term2694.getClass(), "name", "AZdLeSugwv");
        setField(term2694, term2694.getClass(), "referencedType", null);
        setField(term2694, term2694.getClass(), "referencedObjType", null);
        setBooleanField(term2694, term2694.getClass(), "visited", false);
        setField(term2709, term2709.getClass(), "baseType", null);
        setField(term2709, term2709.getClass(), "extendedInterfaces", null);
        setField(term2709, term2709.getClass(), "implementedInterfaces", null);
        setField(term2709, term2709.getClass(), "parameters", null);
        setField(term2709, term2709.getClass(), "thrownTypes", null);
        setField(term2709, term2709.getClass(), "templateTypeNames", null);
        setField(term2709, term2709.getClass(), "description", null);
        setField(term2709, term2709.getClass(), "meaning", null);
        setField(term2709, term2709.getClass(), "deprecated", null);
        setField(term2709, term2709.getClass(), "license", null);
        setField(term2709, term2709.getClass(), "suppressions", null);
        setField(term2709, term2709.getClass(), "modifies", null);
        setField(term2709, term2709.getClass(), "lendsName", null);
        setBooleanField(term2709, term2709.getClass(), "ngInject", true);
        setBooleanField(term2709, term2709.getClass(), "wizaction", false);
        setField(term2708, term2708.getClass(), "info", term2709);
        setField(term2712, term2712.getClass(), "sourceComment", null);
        setField(term2712, term2712.getClass(), "markers", null);
        setField(term2712, term2712.getClass(), "parameters", null);
        setField(term2712, term2712.getClass(), "throwsDescriptions", null);
        setField(term2712, term2712.getClass(), "blockDescription", null);
        setField(term2712, term2712.getClass(), "fileOverview", null);
        setField(term2712, term2712.getClass(), "returnDescription", null);
        setField(term2712, term2712.getClass(), "version", null);
        setField(term2712, term2712.getClass(), "authors", null);
        setField(term2712, term2712.getClass(), "sees", null);
        setField(term2708, term2708.getClass(), "documentation", term2712);
        setIntField(term2713, term2713.getClass(), "type", 0);
        setField(term2713, term2713.getClass(), "next", null);
        setField(term2713, term2713.getClass(), "first", null);
        setField(term2713, term2713.getClass(), "last", null);
        setField(term2713, term2713.getClass(), "propListHead", null);
        setIntField(term2713, term2713.getClass(), "sourcePosition", 0);
        setField(term2713, term2713.getClass(), "jsType", null);
        setField(term2713, term2713.getClass(), "parent", null);
        setField(term2708, term2708.getClass(), "associatedNode", term2713);
        setField(term2708, term2708.getClass(), "visibility", enum75);
        setIntField(term2708, term2708.getClass(), "bitset", -1888585309);
        setField(term2719, term2719.getClass(), "root", null);
        setField(term2719, term2719.getClass(), "sourceName", null);
        setField(term2708, term2708.getClass(), "type", term2719);
        setField(term2720, term2720.getClass(), "root", null);
        setField(term2720, term2720.getClass(), "sourceName", null);
        setField(term2708, term2708.getClass(), "thisType", term2720);
        setBooleanField(term2708, term2708.getClass(), "includeDocumentation", false);
        setIntField(term2708, term2708.getClass(), "originalCommentPosition", 683666002);
        setField(term2694, term2694.getClass(), "docInfo", term2708);
        setBooleanField(term2694, term2694.getClass(), "unknown", true);
        setBooleanField(term2694, term2694.getClass(), "resolved", false);
        setField(term2694, term2694.getClass(), "resolveResult", null);
        setField(term2725, term2725.getClass(), "templateKeys", null);
        setField(term2725, term2725.getClass(), "templateValues", null);
        setField(term2725, term2725.getClass(), "resolvedTemplateValues", null);
        setField(term2725, term2725.getClass(), "registry", null);
        setField(term2694, term2694.getClass(), "templateTypeMap", term2725);
        setBooleanField(term2694, term2694.getClass(), "inTemplatedCheckVisit", false);
        setField(term2694, term2694.getClass(), "registry", null);
        setField(term2693, term2693.getClass(), "objectIndexTemplateKey", term2694);
        setField(term2727, term2727.getClass(), "name", null);
        setField(term2727, term2727.getClass(), "referencedType", null);
        setField(term2727, term2727.getClass(), "referencedObjType", null);
        setBooleanField(term2727, term2727.getClass(), "visited", false);
        setField(term2727, term2727.getClass(), "docInfo", null);
        setBooleanField(term2727, term2727.getClass(), "unknown", false);
        setBooleanField(term2727, term2727.getClass(), "resolved", false);
        setField(term2727, term2727.getClass(), "resolveResult", null);
        setField(term2727, term2727.getClass(), "templateTypeMap", null);
        setBooleanField(term2727, term2727.getClass(), "inTemplatedCheckVisit", false);
        setField(term2727, term2727.getClass(), "registry", null);
        setField(term2693, term2693.getClass(), "objectElementTemplateKey", term2727);
        setField(term2693, term2693.getClass(), "reporter", null);
        setField(term2693, term2693.getClass(), "nativeTypes", null);
        setField(term2693, term2693.getClass(), "namesToTypes", null);
        setField(term2693, term2693.getClass(), "namespaces", null);
        setField(term2693, term2693.getClass(), "nonNullableTypeNames", null);
        setField(term2693, term2693.getClass(), "forwardDeclaredTypes", null);
        setField(term2693, term2693.getClass(), "typesIndexedByProperty", null);
        setField(term2693, term2693.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term2693, term2693.getClass(), "greatestSubtypeByProperty", null);
        setField(term2693, term2693.getClass(), "interfaceToImplementors", null);
        setField(term2693, term2693.getClass(), "unresolvedNamedTypes", null);
        setField(term2693, term2693.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2693, term2693.getClass(), "lastGeneration", false);
        setField(term2693, term2693.getClass(), "templateTypes", null);
        setField(term2693, term2693.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term2693, term2693.getClass(), "tolerateUndefinedValues", false);
        setField(term2693, term2693.getClass(), "resolveMode", null);
        setField(term2692, term2692.getClass(), "registry", term2693);
        setField(term2692, term2692.getClass(), "reverseInterpreter", null);
        setField(term2692, term2692.getClass(), "syntacticScope", null);
        setField(term2692, term2692.getClass(), "functionScope", null);
        setField(term2692, term2692.getClass(), "bottomScope", null);
        setField(term2692, term2692.getClass(), "assertionFunctionsMap", null);
        setField(term2692, term2692.getClass(), "unknownType", null);
        setField(term2692, term2692.getClass(), "cfg", null);
        setField(term2692, term2692.getClass(), "joinOp", null);
        setField(term2692, term2692.getClass(), "orderedWorkSet", null);
        term2734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2734, term2734.getClass(), "type", -268815336);
        setIntField(term2736, term2736.getClass(), "type", -1210583429);
        setIntField(term2738, term2738.getClass(), "type", -663691365);
        setIntField(term2740, term2740.getClass(), "type", 339854490);
        setIntField(term2742, term2742.getClass(), "type", -615654495);
        setField(term2742, term2742.getClass(), "next", null);
        setField(term2742, term2742.getClass(), "first", null);
        setField(term2742, term2742.getClass(), "last", null);
        setField(term2742, term2742.getClass(), "propListHead", null);
        setIntField(term2742, term2742.getClass(), "sourcePosition", 0);
        setField(term2742, term2742.getClass(), "jsType", null);
        setField(term2742, term2742.getClass(), "parent", null);
        setField(term2740, term2740.getClass(), "next", term2742);
        setIntField(term2745, term2745.getClass(), "type", -1476117762);
        setField(term2745, term2745.getClass(), "next", null);
        setField(term2745, term2745.getClass(), "first", null);
        setField(term2745, term2745.getClass(), "last", term2742);
        setField(term2745, term2745.getClass(), "propListHead", null);
        setIntField(term2745, term2745.getClass(), "sourcePosition", 0);
        setField(term2745, term2745.getClass(), "jsType", null);
        setField(term2745, term2745.getClass(), "parent", null);
        setField(term2740, term2740.getClass(), "first", term2745);
        setField(term2740, term2740.getClass(), "last", term2738);
        setField(term2740, term2740.getClass(), "propListHead", null);
        setIntField(term2740, term2740.getClass(), "sourcePosition", 0);
        setField(term2740, term2740.getClass(), "jsType", null);
        setField(term2740, term2740.getClass(), "parent", null);
        setField(term2738, term2738.getClass(), "next", term2740);
        setField(term2738, term2738.getClass(), "first", term2742);
        setIntField(term2749, term2749.getClass(), "type", 1532716628);
        setIntField(term2751, term2751.getClass(), "type", -1801760683);
        setField(term2751, term2751.getClass(), "next", null);
        setField(term2751, term2751.getClass(), "first", term2745);
        setField(term2751, term2751.getClass(), "last", term2740);
        setField(term2751, term2751.getClass(), "propListHead", null);
        setIntField(term2751, term2751.getClass(), "sourcePosition", 0);
        setField(term2751, term2751.getClass(), "jsType", null);
        setField(term2751, term2751.getClass(), "parent", null);
        setField(term2749, term2749.getClass(), "next", term2751);
        setField(term2749, term2749.getClass(), "first", term2736);
        setField(term2749, term2749.getClass(), "last", term2736);
        setField(term2749, term2749.getClass(), "propListHead", null);
        setIntField(term2749, term2749.getClass(), "sourcePosition", 0);
        setField(term2749, term2749.getClass(), "jsType", null);
        setField(term2749, term2749.getClass(), "parent", null);
        setField(term2738, term2738.getClass(), "last", term2749);
        setField(term2738, term2738.getClass(), "propListHead", null);
        setIntField(term2738, term2738.getClass(), "sourcePosition", 0);
        setField(term2738, term2738.getClass(), "jsType", null);
        setField(term2738, term2738.getClass(), "parent", null);
        setField(term2736, term2736.getClass(), "next", term2738);
        setIntField(term2756, term2756.getClass(), "type", 1141317871);
        setField(term2756, term2756.getClass(), "next", term2749);
        setField(term2756, term2756.getClass(), "first", term2751);
        setField(term2756, term2756.getClass(), "last", term2734);
        setField(term2756, term2756.getClass(), "propListHead", null);
        setIntField(term2756, term2756.getClass(), "sourcePosition", 0);
        setField(term2756, term2756.getClass(), "jsType", null);
        setField(term2756, term2756.getClass(), "parent", null);
        setField(term2736, term2736.getClass(), "first", term2756);
        setField(term2736, term2736.getClass(), "last", term2756);
        setField(term2736, term2736.getClass(), "propListHead", null);
        setIntField(term2736, term2736.getClass(), "sourcePosition", 0);
        setField(term2736, term2736.getClass(), "jsType", null);
        setField(term2736, term2736.getClass(), "parent", null);
        setField(term2734, term2734.getClass(), "next", term2736);
        setField(term2734, term2734.getClass(), "first", term2740);
        setField(term2734, term2734.getClass(), "last", term2742);
        setField(term2734, term2734.getClass(), "propListHead", null);
        setIntField(term2734, term2734.getClass(), "sourcePosition", 0);
        setField(term2734, term2734.getClass(), "jsType", null);
        setField(term2734, term2734.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2734;
        args[1] = null;
        try {
            callMethod(klass, "traverseCatch", argTypes, term2692, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


