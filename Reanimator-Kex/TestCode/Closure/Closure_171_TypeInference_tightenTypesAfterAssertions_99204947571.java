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

public class TypeInference_tightenTypesAfterAssertions_99204947571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7181;
     Object term7223;

    public TypeInference_tightenTypesAfterAssertions_99204947571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38166 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term38165 = ((Class) term38166).getDeclaredField((String) "PRIVATE");
        ((Field) term38165).setAccessible(true);
        Object enum94 = ((Field) term38165).get((Object) null);
        term7181 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term7182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term7183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term7197 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7198 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term7201 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term7202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7208 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7209 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term7216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term7181, term7181.getClass(), "compiler", null);
        setField(term7183, term7183.getClass(), "name", "ecHEQufXoq");
        setField(term7183, term7183.getClass(), "referencedType", null);
        setField(term7183, term7183.getClass(), "referencedObjType", null);
        setBooleanField(term7183, term7183.getClass(), "visited", false);
        setField(term7198, term7198.getClass(), "baseType", null);
        setField(term7198, term7198.getClass(), "extendedInterfaces", null);
        setField(term7198, term7198.getClass(), "implementedInterfaces", null);
        setField(term7198, term7198.getClass(), "parameters", null);
        setField(term7198, term7198.getClass(), "thrownTypes", null);
        setField(term7198, term7198.getClass(), "templateTypeNames", null);
        setField(term7198, term7198.getClass(), "description", null);
        setField(term7198, term7198.getClass(), "meaning", null);
        setField(term7198, term7198.getClass(), "deprecated", null);
        setField(term7198, term7198.getClass(), "license", null);
        setField(term7198, term7198.getClass(), "suppressions", null);
        setField(term7198, term7198.getClass(), "modifies", null);
        setField(term7198, term7198.getClass(), "lendsName", null);
        setBooleanField(term7198, term7198.getClass(), "ngInject", true);
        setBooleanField(term7198, term7198.getClass(), "wizaction", false);
        setField(term7197, term7197.getClass(), "info", term7198);
        setField(term7201, term7201.getClass(), "sourceComment", null);
        setField(term7201, term7201.getClass(), "markers", null);
        setField(term7201, term7201.getClass(), "parameters", null);
        setField(term7201, term7201.getClass(), "throwsDescriptions", null);
        setField(term7201, term7201.getClass(), "blockDescription", null);
        setField(term7201, term7201.getClass(), "fileOverview", null);
        setField(term7201, term7201.getClass(), "returnDescription", null);
        setField(term7201, term7201.getClass(), "version", null);
        setField(term7201, term7201.getClass(), "authors", null);
        setField(term7201, term7201.getClass(), "sees", null);
        setField(term7197, term7197.getClass(), "documentation", term7201);
        setIntField(term7202, term7202.getClass(), "type", 0);
        setField(term7202, term7202.getClass(), "next", null);
        setField(term7202, term7202.getClass(), "first", null);
        setField(term7202, term7202.getClass(), "last", null);
        setField(term7202, term7202.getClass(), "propListHead", null);
        setIntField(term7202, term7202.getClass(), "sourcePosition", 0);
        setField(term7202, term7202.getClass(), "jsType", null);
        setField(term7202, term7202.getClass(), "parent", null);
        setField(term7197, term7197.getClass(), "associatedNode", term7202);
        setField(term7197, term7197.getClass(), "visibility", enum94);
        setIntField(term7197, term7197.getClass(), "bitset", 306847454);
        setField(term7208, term7208.getClass(), "root", term7202);
        setField(term7208, term7208.getClass(), "sourceName", null);
        setField(term7197, term7197.getClass(), "type", term7208);
        setField(term7209, term7209.getClass(), "root", null);
        setField(term7209, term7209.getClass(), "sourceName", null);
        setField(term7197, term7197.getClass(), "thisType", term7209);
        setBooleanField(term7197, term7197.getClass(), "includeDocumentation", false);
        setIntField(term7197, term7197.getClass(), "originalCommentPosition", 1745276158);
        setField(term7183, term7183.getClass(), "docInfo", term7197);
        setBooleanField(term7183, term7183.getClass(), "unknown", false);
        setBooleanField(term7183, term7183.getClass(), "resolved", true);
        setField(term7183, term7183.getClass(), "resolveResult", null);
        setField(term7214, term7214.getClass(), "templateKeys", null);
        setField(term7214, term7214.getClass(), "templateValues", null);
        setField(term7214, term7214.getClass(), "resolvedTemplateValues", null);
        setField(term7214, term7214.getClass(), "registry", null);
        setField(term7183, term7183.getClass(), "templateTypeMap", term7214);
        setBooleanField(term7183, term7183.getClass(), "inTemplatedCheckVisit", true);
        setField(term7183, term7183.getClass(), "registry", null);
        setField(term7182, term7182.getClass(), "objectIndexTemplateKey", term7183);
        setField(term7216, term7216.getClass(), "name", null);
        setField(term7216, term7216.getClass(), "referencedType", null);
        setField(term7216, term7216.getClass(), "referencedObjType", null);
        setBooleanField(term7216, term7216.getClass(), "visited", false);
        setField(term7216, term7216.getClass(), "docInfo", null);
        setBooleanField(term7216, term7216.getClass(), "unknown", false);
        setBooleanField(term7216, term7216.getClass(), "resolved", false);
        setField(term7216, term7216.getClass(), "resolveResult", null);
        setField(term7216, term7216.getClass(), "templateTypeMap", null);
        setBooleanField(term7216, term7216.getClass(), "inTemplatedCheckVisit", false);
        setField(term7216, term7216.getClass(), "registry", null);
        setField(term7182, term7182.getClass(), "objectElementTemplateKey", term7216);
        setField(term7182, term7182.getClass(), "reporter", null);
        setField(term7182, term7182.getClass(), "nativeTypes", null);
        setField(term7182, term7182.getClass(), "namesToTypes", null);
        setField(term7182, term7182.getClass(), "namespaces", null);
        setField(term7182, term7182.getClass(), "nonNullableTypeNames", null);
        setField(term7182, term7182.getClass(), "forwardDeclaredTypes", null);
        setField(term7182, term7182.getClass(), "typesIndexedByProperty", null);
        setField(term7182, term7182.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term7182, term7182.getClass(), "greatestSubtypeByProperty", null);
        setField(term7182, term7182.getClass(), "interfaceToImplementors", null);
        setField(term7182, term7182.getClass(), "unresolvedNamedTypes", null);
        setField(term7182, term7182.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7182, term7182.getClass(), "lastGeneration", false);
        setField(term7182, term7182.getClass(), "templateTypes", null);
        setField(term7182, term7182.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term7182, term7182.getClass(), "tolerateUndefinedValues", false);
        setField(term7182, term7182.getClass(), "resolveMode", null);
        setField(term7181, term7181.getClass(), "registry", term7182);
        setField(term7181, term7181.getClass(), "reverseInterpreter", null);
        setField(term7181, term7181.getClass(), "syntacticScope", null);
        setField(term7181, term7181.getClass(), "functionScope", null);
        setField(term7181, term7181.getClass(), "bottomScope", null);
        setField(term7181, term7181.getClass(), "assertionFunctionsMap", null);
        setField(term7181, term7181.getClass(), "unknownType", null);
        setField(term7181, term7181.getClass(), "cfg", null);
        setField(term7181, term7181.getClass(), "joinOp", null);
        setField(term7181, term7181.getClass(), "orderedWorkSet", null);
        term7223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7223, term7223.getClass(), "type", 2049577015);
        setIntField(term7225, term7225.getClass(), "type", 1236004505);
        setIntField(term7227, term7227.getClass(), "type", 1050765721);
        setIntField(term7229, term7229.getClass(), "type", 474518942);
        setIntField(term7231, term7231.getClass(), "type", -1656687479);
        setField(term7231, term7231.getClass(), "next", null);
        setField(term7231, term7231.getClass(), "first", null);
        setField(term7231, term7231.getClass(), "last", null);
        setField(term7231, term7231.getClass(), "propListHead", null);
        setIntField(term7231, term7231.getClass(), "sourcePosition", 0);
        setField(term7231, term7231.getClass(), "jsType", null);
        setField(term7231, term7231.getClass(), "parent", null);
        setField(term7229, term7229.getClass(), "next", term7231);
        setIntField(term7234, term7234.getClass(), "type", -249614216);
        setField(term7234, term7234.getClass(), "next", null);
        setField(term7234, term7234.getClass(), "first", null);
        setField(term7234, term7234.getClass(), "last", term7231);
        setField(term7234, term7234.getClass(), "propListHead", null);
        setIntField(term7234, term7234.getClass(), "sourcePosition", 0);
        setField(term7234, term7234.getClass(), "jsType", null);
        setField(term7234, term7234.getClass(), "parent", null);
        setField(term7229, term7229.getClass(), "first", term7234);
        setField(term7229, term7229.getClass(), "last", term7227);
        setField(term7229, term7229.getClass(), "propListHead", null);
        setIntField(term7229, term7229.getClass(), "sourcePosition", 0);
        setField(term7229, term7229.getClass(), "jsType", null);
        setField(term7229, term7229.getClass(), "parent", null);
        setField(term7227, term7227.getClass(), "next", term7229);
        setField(term7227, term7227.getClass(), "first", term7231);
        setIntField(term7238, term7238.getClass(), "type", -519881101);
        setIntField(term7240, term7240.getClass(), "type", -680920524);
        setField(term7240, term7240.getClass(), "next", null);
        setField(term7240, term7240.getClass(), "first", term7234);
        setField(term7240, term7240.getClass(), "last", term7229);
        setField(term7240, term7240.getClass(), "propListHead", null);
        setIntField(term7240, term7240.getClass(), "sourcePosition", 0);
        setField(term7240, term7240.getClass(), "jsType", null);
        setField(term7240, term7240.getClass(), "parent", null);
        setField(term7238, term7238.getClass(), "next", term7240);
        setField(term7238, term7238.getClass(), "first", term7225);
        setField(term7238, term7238.getClass(), "last", term7225);
        setField(term7238, term7238.getClass(), "propListHead", null);
        setIntField(term7238, term7238.getClass(), "sourcePosition", 0);
        setField(term7238, term7238.getClass(), "jsType", null);
        setField(term7238, term7238.getClass(), "parent", null);
        setField(term7227, term7227.getClass(), "last", term7238);
        setField(term7227, term7227.getClass(), "propListHead", null);
        setIntField(term7227, term7227.getClass(), "sourcePosition", 0);
        setField(term7227, term7227.getClass(), "jsType", null);
        setField(term7227, term7227.getClass(), "parent", null);
        setField(term7225, term7225.getClass(), "next", term7227);
        setIntField(term7245, term7245.getClass(), "type", -916335264);
        setField(term7245, term7245.getClass(), "next", term7238);
        setField(term7245, term7245.getClass(), "first", term7240);
        setField(term7245, term7245.getClass(), "last", term7223);
        setField(term7245, term7245.getClass(), "propListHead", null);
        setIntField(term7245, term7245.getClass(), "sourcePosition", 0);
        setField(term7245, term7245.getClass(), "jsType", null);
        setField(term7245, term7245.getClass(), "parent", null);
        setField(term7225, term7225.getClass(), "first", term7245);
        setField(term7225, term7225.getClass(), "last", term7245);
        setField(term7225, term7225.getClass(), "propListHead", null);
        setIntField(term7225, term7225.getClass(), "sourcePosition", 0);
        setField(term7225, term7225.getClass(), "jsType", null);
        setField(term7225, term7225.getClass(), "parent", null);
        setField(term7223, term7223.getClass(), "next", term7225);
        setField(term7223, term7223.getClass(), "first", term7229);
        setField(term7223, term7223.getClass(), "last", term7231);
        setField(term7223, term7223.getClass(), "propListHead", null);
        setIntField(term7223, term7223.getClass(), "sourcePosition", 0);
        setField(term7223, term7223.getClass(), "jsType", null);
        setField(term7223, term7223.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7223;
        try {
            callMethod(klass, "tightenTypesAfterAssertions", argTypes, term7181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


