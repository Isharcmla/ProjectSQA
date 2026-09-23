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

public class TypeInference_traverseOr_76247731190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16734;
     Object term16776;

    public TypeInference_traverseOr_76247731190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55851 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term55850 = ((Class) term55851).getDeclaredField((String) "PROTECTED");
        ((Field) term55850).setAccessible(true);
        Object enum136 = ((Field) term55850).get((Object) null);
        term16734 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term16735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term16736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16750 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16751 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16754 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16761 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16762 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term16769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term16734, term16734.getClass(), "compiler", null);
        setField(term16736, term16736.getClass(), "name", "rQFBspqBzf");
        setField(term16736, term16736.getClass(), "referencedType", null);
        setField(term16736, term16736.getClass(), "referencedObjType", null);
        setBooleanField(term16736, term16736.getClass(), "visited", false);
        setField(term16751, term16751.getClass(), "baseType", null);
        setField(term16751, term16751.getClass(), "extendedInterfaces", null);
        setField(term16751, term16751.getClass(), "implementedInterfaces", null);
        setField(term16751, term16751.getClass(), "parameters", null);
        setField(term16751, term16751.getClass(), "thrownTypes", null);
        setField(term16751, term16751.getClass(), "templateTypeNames", null);
        setField(term16751, term16751.getClass(), "description", null);
        setField(term16751, term16751.getClass(), "meaning", null);
        setField(term16751, term16751.getClass(), "deprecated", null);
        setField(term16751, term16751.getClass(), "license", null);
        setField(term16751, term16751.getClass(), "suppressions", null);
        setField(term16751, term16751.getClass(), "modifies", null);
        setField(term16751, term16751.getClass(), "lendsName", null);
        setBooleanField(term16751, term16751.getClass(), "ngInject", true);
        setBooleanField(term16751, term16751.getClass(), "wizaction", true);
        setField(term16750, term16750.getClass(), "info", term16751);
        setField(term16754, term16754.getClass(), "sourceComment", null);
        setField(term16754, term16754.getClass(), "markers", null);
        setField(term16754, term16754.getClass(), "parameters", null);
        setField(term16754, term16754.getClass(), "throwsDescriptions", null);
        setField(term16754, term16754.getClass(), "blockDescription", null);
        setField(term16754, term16754.getClass(), "fileOverview", null);
        setField(term16754, term16754.getClass(), "returnDescription", null);
        setField(term16754, term16754.getClass(), "version", null);
        setField(term16754, term16754.getClass(), "authors", null);
        setField(term16754, term16754.getClass(), "sees", null);
        setField(term16750, term16750.getClass(), "documentation", term16754);
        setIntField(term16755, term16755.getClass(), "type", 0);
        setField(term16755, term16755.getClass(), "next", null);
        setField(term16755, term16755.getClass(), "first", null);
        setField(term16755, term16755.getClass(), "last", null);
        setField(term16755, term16755.getClass(), "propListHead", null);
        setIntField(term16755, term16755.getClass(), "sourcePosition", 0);
        setField(term16755, term16755.getClass(), "jsType", null);
        setField(term16755, term16755.getClass(), "parent", null);
        setField(term16750, term16750.getClass(), "associatedNode", term16755);
        setField(term16750, term16750.getClass(), "visibility", enum136);
        setIntField(term16750, term16750.getClass(), "bitset", -1212399479);
        setField(term16761, term16761.getClass(), "root", null);
        setField(term16761, term16761.getClass(), "sourceName", null);
        setField(term16750, term16750.getClass(), "type", term16761);
        setField(term16762, term16762.getClass(), "root", term16755);
        setField(term16762, term16762.getClass(), "sourceName", null);
        setField(term16750, term16750.getClass(), "thisType", term16762);
        setBooleanField(term16750, term16750.getClass(), "includeDocumentation", false);
        setIntField(term16750, term16750.getClass(), "originalCommentPosition", 2107679041);
        setField(term16736, term16736.getClass(), "docInfo", term16750);
        setBooleanField(term16736, term16736.getClass(), "unknown", true);
        setBooleanField(term16736, term16736.getClass(), "resolved", false);
        setField(term16736, term16736.getClass(), "resolveResult", null);
        setField(term16767, term16767.getClass(), "templateKeys", null);
        setField(term16767, term16767.getClass(), "templateValues", null);
        setField(term16767, term16767.getClass(), "resolvedTemplateValues", null);
        setField(term16767, term16767.getClass(), "registry", null);
        setField(term16736, term16736.getClass(), "templateTypeMap", term16767);
        setBooleanField(term16736, term16736.getClass(), "inTemplatedCheckVisit", true);
        setField(term16736, term16736.getClass(), "registry", null);
        setField(term16735, term16735.getClass(), "objectIndexTemplateKey", term16736);
        setField(term16769, term16769.getClass(), "name", null);
        setField(term16769, term16769.getClass(), "referencedType", null);
        setField(term16769, term16769.getClass(), "referencedObjType", null);
        setBooleanField(term16769, term16769.getClass(), "visited", false);
        setField(term16769, term16769.getClass(), "docInfo", null);
        setBooleanField(term16769, term16769.getClass(), "unknown", false);
        setBooleanField(term16769, term16769.getClass(), "resolved", false);
        setField(term16769, term16769.getClass(), "resolveResult", null);
        setField(term16769, term16769.getClass(), "templateTypeMap", null);
        setBooleanField(term16769, term16769.getClass(), "inTemplatedCheckVisit", false);
        setField(term16769, term16769.getClass(), "registry", null);
        setField(term16735, term16735.getClass(), "objectElementTemplateKey", term16769);
        setField(term16735, term16735.getClass(), "reporter", null);
        setField(term16735, term16735.getClass(), "nativeTypes", null);
        setField(term16735, term16735.getClass(), "namesToTypes", null);
        setField(term16735, term16735.getClass(), "namespaces", null);
        setField(term16735, term16735.getClass(), "nonNullableTypeNames", null);
        setField(term16735, term16735.getClass(), "forwardDeclaredTypes", null);
        setField(term16735, term16735.getClass(), "typesIndexedByProperty", null);
        setField(term16735, term16735.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term16735, term16735.getClass(), "greatestSubtypeByProperty", null);
        setField(term16735, term16735.getClass(), "interfaceToImplementors", null);
        setField(term16735, term16735.getClass(), "unresolvedNamedTypes", null);
        setField(term16735, term16735.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16735, term16735.getClass(), "lastGeneration", false);
        setField(term16735, term16735.getClass(), "templateTypes", null);
        setField(term16735, term16735.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term16735, term16735.getClass(), "tolerateUndefinedValues", false);
        setField(term16735, term16735.getClass(), "resolveMode", null);
        setField(term16734, term16734.getClass(), "registry", term16735);
        setField(term16734, term16734.getClass(), "reverseInterpreter", null);
        setField(term16734, term16734.getClass(), "syntacticScope", null);
        setField(term16734, term16734.getClass(), "functionScope", null);
        setField(term16734, term16734.getClass(), "bottomScope", null);
        setField(term16734, term16734.getClass(), "assertionFunctionsMap", null);
        setField(term16734, term16734.getClass(), "unknownType", null);
        setField(term16734, term16734.getClass(), "cfg", null);
        setField(term16734, term16734.getClass(), "joinOp", null);
        setField(term16734, term16734.getClass(), "orderedWorkSet", null);
        term16776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16776, term16776.getClass(), "type", -1281083262);
        setIntField(term16778, term16778.getClass(), "type", 1059930704);
        setIntField(term16780, term16780.getClass(), "type", -1967153290);
        setIntField(term16782, term16782.getClass(), "type", -1397251956);
        setIntField(term16784, term16784.getClass(), "type", -796934571);
        setField(term16784, term16784.getClass(), "next", null);
        setField(term16784, term16784.getClass(), "first", null);
        setField(term16784, term16784.getClass(), "last", null);
        setField(term16784, term16784.getClass(), "propListHead", null);
        setIntField(term16784, term16784.getClass(), "sourcePosition", 0);
        setField(term16784, term16784.getClass(), "jsType", null);
        setField(term16784, term16784.getClass(), "parent", null);
        setField(term16782, term16782.getClass(), "next", term16784);
        setIntField(term16787, term16787.getClass(), "type", 405295896);
        setField(term16787, term16787.getClass(), "next", null);
        setField(term16787, term16787.getClass(), "first", null);
        setField(term16787, term16787.getClass(), "last", term16784);
        setField(term16787, term16787.getClass(), "propListHead", null);
        setIntField(term16787, term16787.getClass(), "sourcePosition", 0);
        setField(term16787, term16787.getClass(), "jsType", null);
        setField(term16787, term16787.getClass(), "parent", null);
        setField(term16782, term16782.getClass(), "first", term16787);
        setField(term16782, term16782.getClass(), "last", term16780);
        setField(term16782, term16782.getClass(), "propListHead", null);
        setIntField(term16782, term16782.getClass(), "sourcePosition", 0);
        setField(term16782, term16782.getClass(), "jsType", null);
        setField(term16782, term16782.getClass(), "parent", null);
        setField(term16780, term16780.getClass(), "next", term16782);
        setField(term16780, term16780.getClass(), "first", term16784);
        setIntField(term16791, term16791.getClass(), "type", 808614267);
        setIntField(term16793, term16793.getClass(), "type", 1611734632);
        setField(term16793, term16793.getClass(), "next", null);
        setField(term16793, term16793.getClass(), "first", term16787);
        setField(term16793, term16793.getClass(), "last", term16782);
        setField(term16793, term16793.getClass(), "propListHead", null);
        setIntField(term16793, term16793.getClass(), "sourcePosition", 0);
        setField(term16793, term16793.getClass(), "jsType", null);
        setField(term16793, term16793.getClass(), "parent", null);
        setField(term16791, term16791.getClass(), "next", term16793);
        setField(term16791, term16791.getClass(), "first", term16778);
        setField(term16791, term16791.getClass(), "last", term16778);
        setField(term16791, term16791.getClass(), "propListHead", null);
        setIntField(term16791, term16791.getClass(), "sourcePosition", 0);
        setField(term16791, term16791.getClass(), "jsType", null);
        setField(term16791, term16791.getClass(), "parent", null);
        setField(term16780, term16780.getClass(), "last", term16791);
        setField(term16780, term16780.getClass(), "propListHead", null);
        setIntField(term16780, term16780.getClass(), "sourcePosition", 0);
        setField(term16780, term16780.getClass(), "jsType", null);
        setField(term16780, term16780.getClass(), "parent", null);
        setField(term16778, term16778.getClass(), "next", term16780);
        setIntField(term16798, term16798.getClass(), "type", 868908117);
        setField(term16798, term16798.getClass(), "next", term16791);
        setField(term16798, term16798.getClass(), "first", term16793);
        setField(term16798, term16798.getClass(), "last", term16776);
        setField(term16798, term16798.getClass(), "propListHead", null);
        setIntField(term16798, term16798.getClass(), "sourcePosition", 0);
        setField(term16798, term16798.getClass(), "jsType", null);
        setField(term16798, term16798.getClass(), "parent", null);
        setField(term16778, term16778.getClass(), "first", term16798);
        setField(term16778, term16778.getClass(), "last", term16798);
        setField(term16778, term16778.getClass(), "propListHead", null);
        setIntField(term16778, term16778.getClass(), "sourcePosition", 0);
        setField(term16778, term16778.getClass(), "jsType", null);
        setField(term16778, term16778.getClass(), "parent", null);
        setField(term16776, term16776.getClass(), "next", term16778);
        setField(term16776, term16776.getClass(), "first", term16782);
        setField(term16776, term16776.getClass(), "last", term16784);
        setField(term16776, term16776.getClass(), "propListHead", null);
        setIntField(term16776, term16776.getClass(), "sourcePosition", 0);
        setField(term16776, term16776.getClass(), "jsType", null);
        setField(term16776, term16776.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term16776;
        args[1] = null;
        try {
            callMethod(klass, "traverseOr", argTypes, term16734, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


