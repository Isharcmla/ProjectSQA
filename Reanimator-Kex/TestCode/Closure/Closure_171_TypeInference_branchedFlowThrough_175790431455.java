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
     Object term1633;
     Object term1675;

    public TypeInference_branchedFlowThrough_175790431455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26034 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term26033 = ((Class) term26034).getDeclaredField((String) "PROTECTED");
        ((Field) term26033).setAccessible(true);
        Object enum69 = ((Field) term26033).get((Object) null);
        term1633 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term1635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1649 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1650 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term1653 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term1654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1660 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1661 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term1668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term1633, term1633.getClass(), "compiler", null);
        setField(term1635, term1635.getClass(), "name", "EYtfuJaxiM");
        setField(term1635, term1635.getClass(), "referencedType", null);
        setField(term1635, term1635.getClass(), "referencedObjType", null);
        setBooleanField(term1635, term1635.getClass(), "visited", true);
        setField(term1650, term1650.getClass(), "baseType", null);
        setField(term1650, term1650.getClass(), "extendedInterfaces", null);
        setField(term1650, term1650.getClass(), "implementedInterfaces", null);
        setField(term1650, term1650.getClass(), "parameters", null);
        setField(term1650, term1650.getClass(), "thrownTypes", null);
        setField(term1650, term1650.getClass(), "templateTypeNames", null);
        setField(term1650, term1650.getClass(), "description", null);
        setField(term1650, term1650.getClass(), "meaning", null);
        setField(term1650, term1650.getClass(), "deprecated", null);
        setField(term1650, term1650.getClass(), "license", null);
        setField(term1650, term1650.getClass(), "suppressions", null);
        setField(term1650, term1650.getClass(), "modifies", null);
        setField(term1650, term1650.getClass(), "lendsName", null);
        setBooleanField(term1650, term1650.getClass(), "ngInject", true);
        setBooleanField(term1650, term1650.getClass(), "wizaction", false);
        setField(term1649, term1649.getClass(), "info", term1650);
        setField(term1653, term1653.getClass(), "sourceComment", null);
        setField(term1653, term1653.getClass(), "markers", null);
        setField(term1653, term1653.getClass(), "parameters", null);
        setField(term1653, term1653.getClass(), "throwsDescriptions", null);
        setField(term1653, term1653.getClass(), "blockDescription", null);
        setField(term1653, term1653.getClass(), "fileOverview", null);
        setField(term1653, term1653.getClass(), "returnDescription", null);
        setField(term1653, term1653.getClass(), "version", null);
        setField(term1653, term1653.getClass(), "authors", null);
        setField(term1653, term1653.getClass(), "sees", null);
        setField(term1649, term1649.getClass(), "documentation", term1653);
        setIntField(term1654, term1654.getClass(), "type", 0);
        setField(term1654, term1654.getClass(), "next", null);
        setField(term1654, term1654.getClass(), "first", null);
        setField(term1654, term1654.getClass(), "last", null);
        setField(term1654, term1654.getClass(), "propListHead", null);
        setIntField(term1654, term1654.getClass(), "sourcePosition", 0);
        setField(term1654, term1654.getClass(), "jsType", null);
        setField(term1654, term1654.getClass(), "parent", null);
        setField(term1649, term1649.getClass(), "associatedNode", term1654);
        setField(term1649, term1649.getClass(), "visibility", enum69);
        setIntField(term1649, term1649.getClass(), "bitset", 1328271830);
        setField(term1660, term1660.getClass(), "root", null);
        setField(term1660, term1660.getClass(), "sourceName", null);
        setField(term1649, term1649.getClass(), "type", term1660);
        setField(term1661, term1661.getClass(), "root", null);
        setField(term1661, term1661.getClass(), "sourceName", null);
        setField(term1649, term1649.getClass(), "thisType", term1661);
        setBooleanField(term1649, term1649.getClass(), "includeDocumentation", true);
        setIntField(term1649, term1649.getClass(), "originalCommentPosition", 1596070772);
        setField(term1635, term1635.getClass(), "docInfo", term1649);
        setBooleanField(term1635, term1635.getClass(), "unknown", true);
        setBooleanField(term1635, term1635.getClass(), "resolved", true);
        setField(term1635, term1635.getClass(), "resolveResult", null);
        setField(term1666, term1666.getClass(), "templateKeys", null);
        setField(term1666, term1666.getClass(), "templateValues", null);
        setField(term1666, term1666.getClass(), "resolvedTemplateValues", null);
        setField(term1666, term1666.getClass(), "registry", null);
        setField(term1635, term1635.getClass(), "templateTypeMap", term1666);
        setBooleanField(term1635, term1635.getClass(), "inTemplatedCheckVisit", true);
        setField(term1635, term1635.getClass(), "registry", null);
        setField(term1634, term1634.getClass(), "objectIndexTemplateKey", term1635);
        setField(term1668, term1668.getClass(), "name", null);
        setField(term1668, term1668.getClass(), "referencedType", null);
        setField(term1668, term1668.getClass(), "referencedObjType", null);
        setBooleanField(term1668, term1668.getClass(), "visited", false);
        setField(term1668, term1668.getClass(), "docInfo", null);
        setBooleanField(term1668, term1668.getClass(), "unknown", false);
        setBooleanField(term1668, term1668.getClass(), "resolved", false);
        setField(term1668, term1668.getClass(), "resolveResult", null);
        setField(term1668, term1668.getClass(), "templateTypeMap", null);
        setBooleanField(term1668, term1668.getClass(), "inTemplatedCheckVisit", false);
        setField(term1668, term1668.getClass(), "registry", null);
        setField(term1634, term1634.getClass(), "objectElementTemplateKey", term1668);
        setField(term1634, term1634.getClass(), "reporter", null);
        setField(term1634, term1634.getClass(), "nativeTypes", null);
        setField(term1634, term1634.getClass(), "namesToTypes", null);
        setField(term1634, term1634.getClass(), "namespaces", null);
        setField(term1634, term1634.getClass(), "nonNullableTypeNames", null);
        setField(term1634, term1634.getClass(), "forwardDeclaredTypes", null);
        setField(term1634, term1634.getClass(), "typesIndexedByProperty", null);
        setField(term1634, term1634.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term1634, term1634.getClass(), "greatestSubtypeByProperty", null);
        setField(term1634, term1634.getClass(), "interfaceToImplementors", null);
        setField(term1634, term1634.getClass(), "unresolvedNamedTypes", null);
        setField(term1634, term1634.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1634, term1634.getClass(), "lastGeneration", false);
        setField(term1634, term1634.getClass(), "templateTypes", null);
        setField(term1634, term1634.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term1634, term1634.getClass(), "tolerateUndefinedValues", false);
        setField(term1634, term1634.getClass(), "resolveMode", null);
        setField(term1633, term1633.getClass(), "registry", term1634);
        setField(term1633, term1633.getClass(), "reverseInterpreter", null);
        setField(term1633, term1633.getClass(), "syntacticScope", null);
        setField(term1633, term1633.getClass(), "functionScope", null);
        setField(term1633, term1633.getClass(), "bottomScope", null);
        setField(term1633, term1633.getClass(), "assertionFunctionsMap", null);
        setField(term1633, term1633.getClass(), "unknownType", null);
        setField(term1633, term1633.getClass(), "cfg", null);
        setField(term1633, term1633.getClass(), "joinOp", null);
        setField(term1633, term1633.getClass(), "orderedWorkSet", null);
        term1675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1675, term1675.getClass(), "type", -1371869594);
        setIntField(term1677, term1677.getClass(), "type", -2095575670);
        setIntField(term1679, term1679.getClass(), "type", 1225272962);
        setIntField(term1681, term1681.getClass(), "type", 1324040357);
        setIntField(term1683, term1683.getClass(), "type", -1588772968);
        setField(term1683, term1683.getClass(), "next", null);
        setField(term1683, term1683.getClass(), "first", null);
        setField(term1683, term1683.getClass(), "last", null);
        setField(term1683, term1683.getClass(), "propListHead", null);
        setIntField(term1683, term1683.getClass(), "sourcePosition", 0);
        setField(term1683, term1683.getClass(), "jsType", null);
        setField(term1683, term1683.getClass(), "parent", null);
        setField(term1681, term1681.getClass(), "next", term1683);
        setIntField(term1686, term1686.getClass(), "type", -93135961);
        setField(term1686, term1686.getClass(), "next", null);
        setField(term1686, term1686.getClass(), "first", null);
        setField(term1686, term1686.getClass(), "last", term1683);
        setField(term1686, term1686.getClass(), "propListHead", null);
        setIntField(term1686, term1686.getClass(), "sourcePosition", 0);
        setField(term1686, term1686.getClass(), "jsType", null);
        setField(term1686, term1686.getClass(), "parent", null);
        setField(term1681, term1681.getClass(), "first", term1686);
        setField(term1681, term1681.getClass(), "last", term1679);
        setField(term1681, term1681.getClass(), "propListHead", null);
        setIntField(term1681, term1681.getClass(), "sourcePosition", 0);
        setField(term1681, term1681.getClass(), "jsType", null);
        setField(term1681, term1681.getClass(), "parent", null);
        setField(term1679, term1679.getClass(), "next", term1681);
        setField(term1679, term1679.getClass(), "first", term1683);
        setIntField(term1690, term1690.getClass(), "type", 933028652);
        setIntField(term1692, term1692.getClass(), "type", 287287233);
        setField(term1692, term1692.getClass(), "next", null);
        setField(term1692, term1692.getClass(), "first", term1686);
        setField(term1692, term1692.getClass(), "last", term1681);
        setField(term1692, term1692.getClass(), "propListHead", null);
        setIntField(term1692, term1692.getClass(), "sourcePosition", 0);
        setField(term1692, term1692.getClass(), "jsType", null);
        setField(term1692, term1692.getClass(), "parent", null);
        setField(term1690, term1690.getClass(), "next", term1692);
        setField(term1690, term1690.getClass(), "first", term1677);
        setField(term1690, term1690.getClass(), "last", term1677);
        setField(term1690, term1690.getClass(), "propListHead", null);
        setIntField(term1690, term1690.getClass(), "sourcePosition", 0);
        setField(term1690, term1690.getClass(), "jsType", null);
        setField(term1690, term1690.getClass(), "parent", null);
        setField(term1679, term1679.getClass(), "last", term1690);
        setField(term1679, term1679.getClass(), "propListHead", null);
        setIntField(term1679, term1679.getClass(), "sourcePosition", 0);
        setField(term1679, term1679.getClass(), "jsType", null);
        setField(term1679, term1679.getClass(), "parent", null);
        setField(term1677, term1677.getClass(), "next", term1679);
        setIntField(term1697, term1697.getClass(), "type", 962840079);
        setField(term1697, term1697.getClass(), "next", term1690);
        setField(term1697, term1697.getClass(), "first", term1692);
        setField(term1697, term1697.getClass(), "last", term1675);
        setField(term1697, term1697.getClass(), "propListHead", null);
        setIntField(term1697, term1697.getClass(), "sourcePosition", 0);
        setField(term1697, term1697.getClass(), "jsType", null);
        setField(term1697, term1697.getClass(), "parent", null);
        setField(term1677, term1677.getClass(), "first", term1697);
        setField(term1677, term1677.getClass(), "last", term1697);
        setField(term1677, term1677.getClass(), "propListHead", null);
        setIntField(term1677, term1677.getClass(), "sourcePosition", 0);
        setField(term1677, term1677.getClass(), "jsType", null);
        setField(term1677, term1677.getClass(), "parent", null);
        setField(term1675, term1675.getClass(), "next", term1677);
        setField(term1675, term1675.getClass(), "first", term1681);
        setField(term1675, term1675.getClass(), "last", term1683);
        setField(term1675, term1675.getClass(), "propListHead", null);
        setIntField(term1675, term1675.getClass(), "sourcePosition", 0);
        setField(term1675, term1675.getClass(), "jsType", null);
        setField(term1675, term1675.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1675;
        args[1] = null;
        try {
            callMethod(klass, "branchedFlowThrough", argTypes, term1633, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


