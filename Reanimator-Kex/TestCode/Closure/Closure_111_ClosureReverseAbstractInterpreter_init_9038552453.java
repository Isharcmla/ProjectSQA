package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class ClosureReverseAbstractInterpreter_init_9038552453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ClosureReverseAbstractInterpreter_init_9038552453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19 = new ArrayList();
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ArrayList term22 = new ArrayList();
        ((ArrayList) term22).add((Object)null);
        ((ArrayList) term22).add((Object)null);
        ((ArrayList) term22).add((Object)null);
        ((ArrayList) term22).add((Object)null);
        HashMap term25 = new HashMap();
        ArrayList term30 = new ArrayList();
        ((ArrayList) term30).add((Object)null);
        ((ArrayList) term30).add((Object)null);
        ((ArrayList) term30).add((Object)null);
        HashSet term33 = new HashSet();
        HashSet term38 = new HashSet();
        HashSet term39 = new HashSet();
        ArrayList term48 = new ArrayList();
        ((ArrayList) term48).add((Object)null);
        ((ArrayList) term48).add((Object)null);
        ((ArrayList) term48).add((Object)null);
        ((ArrayList) term48).add((Object)null);
        ((ArrayList) term48).add((Object)null);
        ((ArrayList) term48).add((Object)null);
        HashMap term51 = new HashMap();
        Class<? extends Object> term937 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term936 = ((Class) term937).getDeclaredField((String) "PUBLIC");
        ((Field) term936).setAccessible(true);
        Object enum1 = ((Field) term936).get((Object) null);
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term2 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term17 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term74 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term75 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term85 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "referencedType", null);
        setField(term2, term2.getClass(), "referencedObjType", null);
        setBooleanField(term2, term2.getClass(), "visited", false);
        setField(term18, term18.getClass(), "root", null);
        setField(term18, term18.getClass(), "sourceName", null);
        setField(term17, term17.getClass(), "baseType", term18);
        setField(term17, term17.getClass(), "extendedInterfaces", term19);
        setField(term17, term17.getClass(), "implementedInterfaces", term22);
        setField(term17, term17.getClass(), "parameters", term25);
        setField(term17, term17.getClass(), "thrownTypes", term30);
        setField(term17, term17.getClass(), "templateTypeNames", null);
        setField(term17, term17.getClass(), "disposedParameters", term33);
        setField(term17, term17.getClass(), "description", "");
        setField(term17, term17.getClass(), "meaning", "");
        setField(term17, term17.getClass(), "deprecated", "");
        setField(term17, term17.getClass(), "license", "");
        setField(term17, term17.getClass(), "suppressions", term38);
        setField(term17, term17.getClass(), "modifies", term39);
        setField(term17, term17.getClass(), "lendsName", "");
        setBooleanField(term17, term17.getClass(), "ngInject", false);
        setBooleanField(term17, term17.getClass(), "wizaction", false);
        setBooleanField(term17, term17.getClass(), "jaggerInject", false);
        setBooleanField(term17, term17.getClass(), "jaggerProvide", true);
        setBooleanField(term17, term17.getClass(), "jaggerModule", true);
        setField(term16, term16.getClass(), "info", term17);
        setField(term46, term46.getClass(), "sourceComment", "");
        setField(term46, term46.getClass(), "markers", term48);
        setField(term46, term46.getClass(), "parameters", term51);
        setField(term46, term46.getClass(), "throwsDescriptions", null);
        setField(term46, term46.getClass(), "blockDescription", null);
        setField(term46, term46.getClass(), "fileOverview", null);
        setField(term46, term46.getClass(), "returnDescription", null);
        setField(term46, term46.getClass(), "version", null);
        setField(term46, term46.getClass(), "authors", null);
        setField(term46, term46.getClass(), "sees", null);
        setField(term16, term16.getClass(), "documentation", term46);
        setIntField(term56, term56.getClass(), "type", 1484323161);
        setIntField(term58, term58.getClass(), "type", 0);
        setField(term58, term58.getClass(), "next", null);
        setField(term58, term58.getClass(), "first", null);
        setField(term58, term58.getClass(), "last", null);
        setField(term58, term58.getClass(), "propListHead", null);
        setIntField(term58, term58.getClass(), "sourcePosition", 0);
        setField(term58, term58.getClass(), "jsType", null);
        setField(term58, term58.getClass(), "parent", null);
        setField(term56, term56.getClass(), "next", term58);
        setIntField(term61, term61.getClass(), "type", 0);
        setField(term61, term61.getClass(), "next", null);
        setField(term61, term61.getClass(), "first", null);
        setField(term61, term61.getClass(), "last", null);
        setField(term61, term61.getClass(), "propListHead", null);
        setIntField(term61, term61.getClass(), "sourcePosition", 0);
        setField(term61, term61.getClass(), "jsType", null);
        setField(term61, term61.getClass(), "parent", null);
        setField(term56, term56.getClass(), "first", term61);
        setIntField(term64, term64.getClass(), "type", 0);
        setField(term64, term64.getClass(), "next", null);
        setField(term64, term64.getClass(), "first", null);
        setField(term64, term64.getClass(), "last", null);
        setField(term64, term64.getClass(), "propListHead", null);
        setIntField(term64, term64.getClass(), "sourcePosition", 0);
        setField(term64, term64.getClass(), "jsType", null);
        setField(term64, term64.getClass(), "parent", null);
        setField(term56, term56.getClass(), "last", term64);
        setField(term56, term56.getClass(), "propListHead", null);
        setIntField(term56, term56.getClass(), "sourcePosition", 0);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
        setField(term16, term16.getClass(), "associatedNode", term56);
        setField(term16, term16.getClass(), "visibility", enum1);
        setIntField(term16, term16.getClass(), "bitset", 391863371);
        setField(term72, term72.getClass(), "root", term64);
        setField(term72, term72.getClass(), "sourceName", "");
        setField(term16, term16.getClass(), "type", term72);
        setIntField(term75, term75.getClass(), "type", 1162663216);
        setField(term75, term75.getClass(), "next", term56);
        setField(term75, term75.getClass(), "first", null);
        setField(term75, term75.getClass(), "last", null);
        setField(term75, term75.getClass(), "propListHead", null);
        setIntField(term75, term75.getClass(), "sourcePosition", 0);
        setField(term75, term75.getClass(), "jsType", null);
        setField(term75, term75.getClass(), "parent", null);
        setField(term74, term74.getClass(), "root", term75);
        setField(term74, term74.getClass(), "sourceName", "");
        setField(term16, term16.getClass(), "thisType", term74);
        setBooleanField(term16, term16.getClass(), "includeDocumentation", true);
        setIntField(term16, term16.getClass(), "originalCommentPosition", -1922583790);
        setField(term2, term2.getClass(), "docInfo", term16);
        setBooleanField(term2, term2.getClass(), "unknown", true);
        setBooleanField(term2, term2.getClass(), "resolved", false);
        setField(term2, term2.getClass(), "resolveResult", null);
        setField(term83, term83.getClass(), "templateKeys", null);
        setField(term83, term83.getClass(), "templateValues", null);
        setField(term83, term83.getClass(), "resolvedTemplateValues", null);
        setField(term83, term83.getClass(), "registry", null);
        setField(term2, term2.getClass(), "templateTypeMap", term83);
        setBooleanField(term2, term2.getClass(), "inTemplatedCheckVisit", true);
        setField(term2, term2.getClass(), "registry", null);
        setField(term1, term1.getClass(), "objectIndexTemplateKey", term2);
        setField(term85, term85.getClass(), "name", null);
        setField(term85, term85.getClass(), "referencedType", null);
        setField(term85, term85.getClass(), "referencedObjType", null);
        setBooleanField(term85, term85.getClass(), "visited", false);
        setField(term85, term85.getClass(), "docInfo", null);
        setBooleanField(term85, term85.getClass(), "unknown", false);
        setBooleanField(term85, term85.getClass(), "resolved", false);
        setField(term85, term85.getClass(), "resolveResult", null);
        setField(term85, term85.getClass(), "templateTypeMap", null);
        setBooleanField(term85, term85.getClass(), "inTemplatedCheckVisit", false);
        setField(term85, term85.getClass(), "registry", null);
        setField(term1, term1.getClass(), "objectElementTemplateKey", term85);
        setField(term1, term1.getClass(), "reporter", null);
        setField(term1, term1.getClass(), "nativeTypes", null);
        setField(term1, term1.getClass(), "namesToTypes", null);
        setField(term1, term1.getClass(), "namespaces", null);
        setField(term1, term1.getClass(), "nonNullableTypeNames", null);
        setField(term1, term1.getClass(), "forwardDeclaredTypes", null);
        setField(term1, term1.getClass(), "typesIndexedByProperty", null);
        setField(term1, term1.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term1, term1.getClass(), "greatestSubtypeByProperty", null);
        setField(term1, term1.getClass(), "interfaceToImplementors", null);
        setField(term1, term1.getClass(), "unresolvedNamedTypes", null);
        setField(term1, term1.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1, term1.getClass(), "lastGeneration", false);
        setField(term1, term1.getClass(), "templateTypes", null);
        setField(term1, term1.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term1, term1.getClass(), "tolerateUndefinedValues", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


