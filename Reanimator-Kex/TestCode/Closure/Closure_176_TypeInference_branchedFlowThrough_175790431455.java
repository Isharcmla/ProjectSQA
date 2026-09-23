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

public class TypeInference_branchedFlowThrough_175790431455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1626;
     Object term1670;

    public TypeInference_branchedFlowThrough_175790431455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25831 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term25830 = ((Class) term25831).getDeclaredField((String) "PUBLIC");
        ((Field) term25830).setAccessible(true);
        Object enum68 = ((Field) term25830).get((Object) null);
        term1626 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term1628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1642 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1643 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term1649 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term1650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term1663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term1626, term1626.getClass(), "compiler", null);
        setField(term1628, term1628.getClass(), "name", "XYtryyobou");
        setField(term1628, term1628.getClass(), "referencedType", null);
        setField(term1628, term1628.getClass(), "referencedObjType", null);
        setBooleanField(term1628, term1628.getClass(), "visited", false);
        setField(term1643, term1643.getClass(), "baseType", null);
        setField(term1643, term1643.getClass(), "extendedInterfaces", null);
        setField(term1643, term1643.getClass(), "implementedInterfaces", null);
        setField(term1643, term1643.getClass(), "parameters", null);
        setField(term1643, term1643.getClass(), "thrownTypes", null);
        setField(term1643, term1643.getClass(), "templateTypeNames", null);
        setField(term1643, term1643.getClass(), "disposedParameters", null);
        setField(term1643, term1643.getClass(), "description", null);
        setField(term1643, term1643.getClass(), "meaning", null);
        setField(term1643, term1643.getClass(), "deprecated", null);
        setField(term1643, term1643.getClass(), "license", null);
        setField(term1643, term1643.getClass(), "suppressions", null);
        setField(term1643, term1643.getClass(), "modifies", null);
        setField(term1643, term1643.getClass(), "lendsName", null);
        setBooleanField(term1643, term1643.getClass(), "ngInject", true);
        setBooleanField(term1643, term1643.getClass(), "wizaction", true);
        setBooleanField(term1643, term1643.getClass(), "jaggerInject", true);
        setBooleanField(term1643, term1643.getClass(), "jaggerProvide", false);
        setBooleanField(term1643, term1643.getClass(), "jaggerModule", true);
        setField(term1642, term1642.getClass(), "info", term1643);
        setField(term1649, term1649.getClass(), "sourceComment", null);
        setField(term1649, term1649.getClass(), "markers", null);
        setField(term1649, term1649.getClass(), "parameters", null);
        setField(term1649, term1649.getClass(), "throwsDescriptions", null);
        setField(term1649, term1649.getClass(), "blockDescription", null);
        setField(term1649, term1649.getClass(), "fileOverview", null);
        setField(term1649, term1649.getClass(), "returnDescription", null);
        setField(term1649, term1649.getClass(), "version", null);
        setField(term1649, term1649.getClass(), "authors", null);
        setField(term1649, term1649.getClass(), "sees", null);
        setField(term1642, term1642.getClass(), "documentation", term1649);
        setIntField(term1650, term1650.getClass(), "type", 0);
        setField(term1650, term1650.getClass(), "next", null);
        setField(term1650, term1650.getClass(), "first", null);
        setField(term1650, term1650.getClass(), "last", null);
        setField(term1650, term1650.getClass(), "propListHead", null);
        setIntField(term1650, term1650.getClass(), "sourcePosition", 0);
        setField(term1650, term1650.getClass(), "jsType", null);
        setField(term1650, term1650.getClass(), "parent", null);
        setField(term1642, term1642.getClass(), "associatedNode", term1650);
        setField(term1642, term1642.getClass(), "visibility", enum68);
        setIntField(term1642, term1642.getClass(), "bitset", 1328271830);
        setField(term1656, term1656.getClass(), "root", null);
        setField(term1656, term1656.getClass(), "sourceName", null);
        setField(term1642, term1642.getClass(), "type", term1656);
        setField(term1642, term1642.getClass(), "thisType", term1656);
        setBooleanField(term1642, term1642.getClass(), "includeDocumentation", false);
        setIntField(term1642, term1642.getClass(), "originalCommentPosition", 1596070772);
        setField(term1628, term1628.getClass(), "docInfo", term1642);
        setBooleanField(term1628, term1628.getClass(), "unknown", false);
        setBooleanField(term1628, term1628.getClass(), "resolved", true);
        setField(term1628, term1628.getClass(), "resolveResult", null);
        setField(term1661, term1661.getClass(), "templateKeys", null);
        setField(term1661, term1661.getClass(), "templateValues", null);
        setField(term1661, term1661.getClass(), "resolvedTemplateValues", null);
        setField(term1661, term1661.getClass(), "registry", null);
        setField(term1628, term1628.getClass(), "templateTypeMap", term1661);
        setBooleanField(term1628, term1628.getClass(), "inTemplatedCheckVisit", false);
        setField(term1628, term1628.getClass(), "registry", null);
        setField(term1627, term1627.getClass(), "objectIndexTemplateKey", term1628);
        setField(term1663, term1663.getClass(), "name", null);
        setField(term1663, term1663.getClass(), "referencedType", null);
        setField(term1663, term1663.getClass(), "referencedObjType", null);
        setBooleanField(term1663, term1663.getClass(), "visited", false);
        setField(term1663, term1663.getClass(), "docInfo", null);
        setBooleanField(term1663, term1663.getClass(), "unknown", false);
        setBooleanField(term1663, term1663.getClass(), "resolved", false);
        setField(term1663, term1663.getClass(), "resolveResult", null);
        setField(term1663, term1663.getClass(), "templateTypeMap", null);
        setBooleanField(term1663, term1663.getClass(), "inTemplatedCheckVisit", false);
        setField(term1663, term1663.getClass(), "registry", null);
        setField(term1627, term1627.getClass(), "objectElementTemplateKey", term1663);
        setField(term1627, term1627.getClass(), "reporter", null);
        setField(term1627, term1627.getClass(), "nativeTypes", null);
        setField(term1627, term1627.getClass(), "namesToTypes", null);
        setField(term1627, term1627.getClass(), "namespaces", null);
        setField(term1627, term1627.getClass(), "nonNullableTypeNames", null);
        setField(term1627, term1627.getClass(), "forwardDeclaredTypes", null);
        setField(term1627, term1627.getClass(), "typesIndexedByProperty", null);
        setField(term1627, term1627.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term1627, term1627.getClass(), "greatestSubtypeByProperty", null);
        setField(term1627, term1627.getClass(), "interfaceToImplementors", null);
        setField(term1627, term1627.getClass(), "unresolvedNamedTypes", null);
        setField(term1627, term1627.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1627, term1627.getClass(), "lastGeneration", false);
        setField(term1627, term1627.getClass(), "templateTypes", null);
        setField(term1627, term1627.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term1627, term1627.getClass(), "tolerateUndefinedValues", false);
        setField(term1626, term1626.getClass(), "registry", term1627);
        setField(term1626, term1626.getClass(), "reverseInterpreter", null);
        setField(term1626, term1626.getClass(), "syntacticScope", null);
        setField(term1626, term1626.getClass(), "functionScope", null);
        setField(term1626, term1626.getClass(), "bottomScope", null);
        setField(term1626, term1626.getClass(), "assertionFunctionsMap", null);
        setField(term1626, term1626.getClass(), "unknownType", null);
        setField(term1626, term1626.getClass(), "cfg", null);
        setField(term1626, term1626.getClass(), "joinOp", null);
        setField(term1626, term1626.getClass(), "orderedWorkSet", null);
        term1670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1670, term1670.getClass(), "type", -1371869594);
        setIntField(term1672, term1672.getClass(), "type", -2095575670);
        setIntField(term1674, term1674.getClass(), "type", 1225272962);
        setIntField(term1676, term1676.getClass(), "type", 1324040357);
        setIntField(term1678, term1678.getClass(), "type", -1588772968);
        setField(term1678, term1678.getClass(), "next", null);
        setField(term1678, term1678.getClass(), "first", null);
        setField(term1678, term1678.getClass(), "last", null);
        setField(term1678, term1678.getClass(), "propListHead", null);
        setIntField(term1678, term1678.getClass(), "sourcePosition", 0);
        setField(term1678, term1678.getClass(), "jsType", null);
        setField(term1678, term1678.getClass(), "parent", null);
        setField(term1676, term1676.getClass(), "next", term1678);
        setIntField(term1681, term1681.getClass(), "type", -93135961);
        setField(term1681, term1681.getClass(), "next", null);
        setField(term1681, term1681.getClass(), "first", null);
        setField(term1681, term1681.getClass(), "last", term1678);
        setField(term1681, term1681.getClass(), "propListHead", null);
        setIntField(term1681, term1681.getClass(), "sourcePosition", 0);
        setField(term1681, term1681.getClass(), "jsType", null);
        setField(term1681, term1681.getClass(), "parent", null);
        setField(term1676, term1676.getClass(), "first", term1681);
        setField(term1676, term1676.getClass(), "last", term1674);
        setField(term1676, term1676.getClass(), "propListHead", null);
        setIntField(term1676, term1676.getClass(), "sourcePosition", 0);
        setField(term1676, term1676.getClass(), "jsType", null);
        setField(term1676, term1676.getClass(), "parent", null);
        setField(term1674, term1674.getClass(), "next", term1676);
        setField(term1674, term1674.getClass(), "first", term1678);
        setIntField(term1685, term1685.getClass(), "type", 933028652);
        setIntField(term1687, term1687.getClass(), "type", 287287233);
        setField(term1687, term1687.getClass(), "next", null);
        setField(term1687, term1687.getClass(), "first", term1681);
        setField(term1687, term1687.getClass(), "last", term1676);
        setField(term1687, term1687.getClass(), "propListHead", null);
        setIntField(term1687, term1687.getClass(), "sourcePosition", 0);
        setField(term1687, term1687.getClass(), "jsType", null);
        setField(term1687, term1687.getClass(), "parent", null);
        setField(term1685, term1685.getClass(), "next", term1687);
        setField(term1685, term1685.getClass(), "first", term1672);
        setField(term1685, term1685.getClass(), "last", term1672);
        setField(term1685, term1685.getClass(), "propListHead", null);
        setIntField(term1685, term1685.getClass(), "sourcePosition", 0);
        setField(term1685, term1685.getClass(), "jsType", null);
        setField(term1685, term1685.getClass(), "parent", null);
        setField(term1674, term1674.getClass(), "last", term1685);
        setField(term1674, term1674.getClass(), "propListHead", null);
        setIntField(term1674, term1674.getClass(), "sourcePosition", 0);
        setField(term1674, term1674.getClass(), "jsType", null);
        setField(term1674, term1674.getClass(), "parent", null);
        setField(term1672, term1672.getClass(), "next", term1674);
        setIntField(term1692, term1692.getClass(), "type", 962840079);
        setField(term1692, term1692.getClass(), "next", term1685);
        setField(term1692, term1692.getClass(), "first", term1687);
        setField(term1692, term1692.getClass(), "last", term1670);
        setField(term1692, term1692.getClass(), "propListHead", null);
        setIntField(term1692, term1692.getClass(), "sourcePosition", 0);
        setField(term1692, term1692.getClass(), "jsType", null);
        setField(term1692, term1692.getClass(), "parent", null);
        setField(term1672, term1672.getClass(), "first", term1692);
        setField(term1672, term1672.getClass(), "last", term1692);
        setField(term1672, term1672.getClass(), "propListHead", null);
        setIntField(term1672, term1672.getClass(), "sourcePosition", 0);
        setField(term1672, term1672.getClass(), "jsType", null);
        setField(term1672, term1672.getClass(), "parent", null);
        setField(term1670, term1670.getClass(), "next", term1672);
        setField(term1670, term1670.getClass(), "first", term1676);
        setField(term1670, term1670.getClass(), "last", term1678);
        setField(term1670, term1670.getClass(), "propListHead", null);
        setIntField(term1670, term1670.getClass(), "sourcePosition", 0);
        setField(term1670, term1670.getClass(), "jsType", null);
        setField(term1670, term1670.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1670;
        args[1] = null;
        try {
            callMethod(klass, "branchedFlowThrough", argTypes, term1626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


