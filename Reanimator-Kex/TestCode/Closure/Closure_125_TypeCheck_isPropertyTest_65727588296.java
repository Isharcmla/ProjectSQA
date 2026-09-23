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

public class TypeCheck_isPropertyTest_65727588296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7706;
     Object term7735;

    public TypeCheck_isPropertyTest_65727588296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7706 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term7707 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term7708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term7709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term7712 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term7720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term7706, term7706.getClass(), "compiler", null);
        setField(term7707, term7707.getClass(), "compiler", null);
        setField(term7709, term7709.getClass(), "name", "");
        setField(term7709, term7709.getClass(), "referencedType", null);
        setField(term7709, term7709.getClass(), "referencedObjType", null);
        setBooleanField(term7709, term7709.getClass(), "visited", false);
        setField(term7712, term7712.getClass(), "info", null);
        setField(term7712, term7712.getClass(), "documentation", null);
        setField(term7712, term7712.getClass(), "associatedNode", null);
        setField(term7712, term7712.getClass(), "visibility", null);
        setIntField(term7712, term7712.getClass(), "bitset", -687282231);
        setField(term7712, term7712.getClass(), "type", null);
        setField(term7712, term7712.getClass(), "thisType", null);
        setBooleanField(term7712, term7712.getClass(), "includeDocumentation", false);
        setIntField(term7712, term7712.getClass(), "originalCommentPosition", 1200440315);
        setField(term7709, term7709.getClass(), "docInfo", term7712);
        setBooleanField(term7709, term7709.getClass(), "unknown", true);
        setBooleanField(term7709, term7709.getClass(), "resolved", true);
        setField(term7709, term7709.getClass(), "resolveResult", null);
        setField(term7718, term7718.getClass(), "templateKeys", null);
        setField(term7718, term7718.getClass(), "templateValues", null);
        setField(term7718, term7718.getClass(), "resolvedTemplateValues", null);
        setField(term7718, term7718.getClass(), "registry", null);
        setField(term7709, term7709.getClass(), "templateTypeMap", term7718);
        setBooleanField(term7709, term7709.getClass(), "inTemplatedCheckVisit", true);
        setField(term7709, term7709.getClass(), "registry", null);
        setField(term7708, term7708.getClass(), "objectIndexTemplateKey", term7709);
        setField(term7720, term7720.getClass(), "name", null);
        setField(term7720, term7720.getClass(), "referencedType", null);
        setField(term7720, term7720.getClass(), "referencedObjType", null);
        setBooleanField(term7720, term7720.getClass(), "visited", false);
        setField(term7720, term7720.getClass(), "docInfo", null);
        setBooleanField(term7720, term7720.getClass(), "unknown", false);
        setBooleanField(term7720, term7720.getClass(), "resolved", false);
        setField(term7720, term7720.getClass(), "resolveResult", null);
        setField(term7720, term7720.getClass(), "templateTypeMap", null);
        setBooleanField(term7720, term7720.getClass(), "inTemplatedCheckVisit", false);
        setField(term7720, term7720.getClass(), "registry", null);
        setField(term7708, term7708.getClass(), "objectElementTemplateKey", term7720);
        setField(term7708, term7708.getClass(), "reporter", null);
        setField(term7708, term7708.getClass(), "nativeTypes", null);
        setField(term7708, term7708.getClass(), "namesToTypes", null);
        setField(term7708, term7708.getClass(), "namespaces", null);
        setField(term7708, term7708.getClass(), "nonNullableTypeNames", null);
        setField(term7708, term7708.getClass(), "forwardDeclaredTypes", null);
        setField(term7708, term7708.getClass(), "typesIndexedByProperty", null);
        setField(term7708, term7708.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term7708, term7708.getClass(), "greatestSubtypeByProperty", null);
        setField(term7708, term7708.getClass(), "interfaceToImplementors", null);
        setField(term7708, term7708.getClass(), "unresolvedNamedTypes", null);
        setField(term7708, term7708.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7708, term7708.getClass(), "lastGeneration", false);
        setField(term7708, term7708.getClass(), "templateTypes", null);
        setField(term7708, term7708.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term7708, term7708.getClass(), "tolerateUndefinedValues", false);
        setField(term7708, term7708.getClass(), "resolveMode", null);
        setField(term7707, term7707.getClass(), "typeRegistry", term7708);
        setField(term7707, term7707.getClass(), "allValueTypes", null);
        setBooleanField(term7707, term7707.getClass(), "shouldReport", false);
        setField(term7707, term7707.getClass(), "nullOrUndefined", null);
        setField(term7707, term7707.getClass(), "mismatches", null);
        setField(term7706, term7706.getClass(), "validator", term7707);
        setField(term7706, term7706.getClass(), "reverseInterpreter", null);
        setField(term7706, term7706.getClass(), "typeRegistry", null);
        setField(term7706, term7706.getClass(), "topScope", null);
        setField(term7706, term7706.getClass(), "scopeCreator", null);
        setField(term7706, term7706.getClass(), "reportMissingOverride", null);
        setBooleanField(term7706, term7706.getClass(), "reportUnknownTypes", false);
        setBooleanField(term7706, term7706.getClass(), "reportMissingProperties", false);
        setField(term7706, term7706.getClass(), "inferJSDocInfo", null);
        setIntField(term7706, term7706.getClass(), "typedCount", 0);
        setIntField(term7706, term7706.getClass(), "nullCount", 0);
        setIntField(term7706, term7706.getClass(), "unknownCount", 0);
        setBooleanField(term7706, term7706.getClass(), "inExterns", false);
        setIntField(term7706, term7706.getClass(), "noTypeCheckSection", 0);
        setField(term7706, term7706.getClass(), "editDistance", null);
        term7735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7735, term7735.getClass(), "type", 1863910269);
        setIntField(term7737, term7737.getClass(), "type", 864645689);
        setIntField(term7739, term7739.getClass(), "type", 279384872);
        setIntField(term7741, term7741.getClass(), "type", 1427305953);
        setIntField(term7743, term7743.getClass(), "type", -781832877);
        setField(term7743, term7743.getClass(), "next", null);
        setField(term7743, term7743.getClass(), "first", null);
        setField(term7743, term7743.getClass(), "last", null);
        setField(term7743, term7743.getClass(), "propListHead", null);
        setIntField(term7743, term7743.getClass(), "sourcePosition", 0);
        setField(term7743, term7743.getClass(), "jsType", null);
        setField(term7743, term7743.getClass(), "parent", null);
        setField(term7741, term7741.getClass(), "next", term7743);
        setIntField(term7746, term7746.getClass(), "type", 797203987);
        setField(term7746, term7746.getClass(), "next", null);
        setField(term7746, term7746.getClass(), "first", null);
        setField(term7746, term7746.getClass(), "last", term7743);
        setField(term7746, term7746.getClass(), "propListHead", null);
        setIntField(term7746, term7746.getClass(), "sourcePosition", 0);
        setField(term7746, term7746.getClass(), "jsType", null);
        setField(term7746, term7746.getClass(), "parent", null);
        setField(term7741, term7741.getClass(), "first", term7746);
        setField(term7741, term7741.getClass(), "last", term7739);
        setField(term7741, term7741.getClass(), "propListHead", null);
        setIntField(term7741, term7741.getClass(), "sourcePosition", 0);
        setField(term7741, term7741.getClass(), "jsType", null);
        setField(term7741, term7741.getClass(), "parent", null);
        setField(term7739, term7739.getClass(), "next", term7741);
        setField(term7739, term7739.getClass(), "first", term7743);
        setIntField(term7750, term7750.getClass(), "type", -138239905);
        setIntField(term7752, term7752.getClass(), "type", 1709474063);
        setField(term7752, term7752.getClass(), "next", null);
        setField(term7752, term7752.getClass(), "first", term7746);
        setField(term7752, term7752.getClass(), "last", term7741);
        setField(term7752, term7752.getClass(), "propListHead", null);
        setIntField(term7752, term7752.getClass(), "sourcePosition", 0);
        setField(term7752, term7752.getClass(), "jsType", null);
        setField(term7752, term7752.getClass(), "parent", null);
        setField(term7750, term7750.getClass(), "next", term7752);
        setField(term7750, term7750.getClass(), "first", term7737);
        setField(term7750, term7750.getClass(), "last", term7737);
        setField(term7750, term7750.getClass(), "propListHead", null);
        setIntField(term7750, term7750.getClass(), "sourcePosition", 0);
        setField(term7750, term7750.getClass(), "jsType", null);
        setField(term7750, term7750.getClass(), "parent", null);
        setField(term7739, term7739.getClass(), "last", term7750);
        setField(term7739, term7739.getClass(), "propListHead", null);
        setIntField(term7739, term7739.getClass(), "sourcePosition", 0);
        setField(term7739, term7739.getClass(), "jsType", null);
        setField(term7739, term7739.getClass(), "parent", null);
        setField(term7737, term7737.getClass(), "next", term7739);
        setIntField(term7757, term7757.getClass(), "type", 1406617209);
        setField(term7757, term7757.getClass(), "next", term7750);
        setField(term7757, term7757.getClass(), "first", term7752);
        setField(term7757, term7757.getClass(), "last", term7735);
        setField(term7757, term7757.getClass(), "propListHead", null);
        setIntField(term7757, term7757.getClass(), "sourcePosition", 0);
        setField(term7757, term7757.getClass(), "jsType", null);
        setField(term7757, term7757.getClass(), "parent", null);
        setField(term7737, term7737.getClass(), "first", term7757);
        setField(term7737, term7737.getClass(), "last", term7757);
        setField(term7737, term7737.getClass(), "propListHead", null);
        setIntField(term7737, term7737.getClass(), "sourcePosition", 0);
        setField(term7737, term7737.getClass(), "jsType", null);
        setField(term7737, term7737.getClass(), "parent", null);
        setField(term7735, term7735.getClass(), "next", term7737);
        setField(term7735, term7735.getClass(), "first", term7741);
        setField(term7735, term7735.getClass(), "last", term7743);
        setField(term7735, term7735.getClass(), "propListHead", null);
        setIntField(term7735, term7735.getClass(), "sourcePosition", 0);
        setField(term7735, term7735.getClass(), "jsType", null);
        setField(term7735, term7735.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7735;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term7706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


