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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.util.ArrayList;

public class TypeCheck_isPropertyTest_65727588263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14127;
     Object term14208;

    public TypeCheck_isPropertyTest_65727588263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14131 = new HashMap();
        HashMap term14138 = new HashMap();
        Set<Object> term43169 =  ((Map) term14138).keySet();
        HashSet term14137 = new HashSet((Collection<? extends Object>) term43169);
        HashMap term14144 = new HashMap();
        Set<Object> term43170 =  ((Map) term14144).keySet();
        HashSet term14143 = new HashSet((Collection<? extends Object>) term43170);
        HashMap term14150 = new HashMap();
        Set<Object> term43171 =  ((Map) term14150).keySet();
        HashSet term14149 = new HashSet((Collection<? extends Object>) term43171);
        HashMap term14155 = new HashMap();
        HashMap term14160 = new HashMap();
        Class<? extends Object> term43183 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term43182 = ((Class) term43183).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term43182).setAccessible(true);
        Object enum86 = ((Field) term43182).get((Object) null);
        Object term14191 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term14191, term14191.getClass(), "typeA", null);
        setField(term14191, term14191.getClass(), "typeB", null);
        Object term14192 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term14192, term14192.getClass(), "typeA", null);
        setField(term14192, term14192.getClass(), "typeB", null);
        Object term14193 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term14193, term14193.getClass(), "typeA", null);
        setField(term14193, term14193.getClass(), "typeB", null);
        Object term14194 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term14194, term14194.getClass(), "typeA", null);
        setField(term14194, term14194.getClass(), "typeB", null);
        ArrayList term14189 = new ArrayList();
        ((ArrayList) term14189).add(term14191);
        ((ArrayList) term14189).add(term14192);
        ((ArrayList) term14189).add(term14193);
        ((ArrayList) term14189).add(term14194);
        term14127 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term14128 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term14129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term14130 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term14179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term14197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term14200 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term14127, term14127.getClass(), "compiler", null);
        setField(term14128, term14128.getClass(), "compiler", null);
        setField(term14129, term14129.getClass(), "reporter", null);
        setField(term14129, term14129.getClass(), "nativeTypes", term14130);
        setField(term14129, term14129.getClass(), "namesToTypes", term14131);
        setField(term14129, term14129.getClass(), "namespaces", term14137);
        setField(term14129, term14129.getClass(), "enumTypeNames", term14143);
        setField(term14129, term14129.getClass(), "forwardDeclaredTypes", term14149);
        setField(term14129, term14129.getClass(), "typesIndexedByProperty", term14155);
        setField(term14129, term14129.getClass(), "greatestSubtypeByProperty", term14160);
        setField(term14129, term14129.getClass(), "interfaceToImplementors", null);
        setField(term14129, term14129.getClass(), "unresolvedNamedTypes", null);
        setField(term14129, term14129.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term14129, term14129.getClass(), "lastGeneration", false);
        setField(term14129, term14129.getClass(), "templateTypeName", "ncSPTkhKjO");
        setField(term14179, term14179.getClass(), "name", "");
        setField(term14179, term14179.getClass(), "referencedType", null);
        setBooleanField(term14179, term14179.getClass(), "visited", false);
        setField(term14179, term14179.getClass(), "docInfo", null);
        setBooleanField(term14179, term14179.getClass(), "unknown", false);
        setBooleanField(term14179, term14179.getClass(), "resolved", false);
        setField(term14179, term14179.getClass(), "resolveResult", null);
        setField(term14179, term14179.getClass(), "registry", null);
        setField(term14129, term14129.getClass(), "templateType", term14179);
        setBooleanField(term14129, term14129.getClass(), "tolerateUndefinedValues", false);
        setField(term14129, term14129.getClass(), "resolveMode", enum86);
        setField(term14128, term14128.getClass(), "typeRegistry", term14129);
        setField(term14128, term14128.getClass(), "allValueTypes", null);
        setBooleanField(term14128, term14128.getClass(), "shouldReport", false);
        setField(term14128, term14128.getClass(), "mismatches", term14189);
        setField(term14127, term14127.getClass(), "validator", term14128);
        setField(term14127, term14127.getClass(), "reverseInterpreter", null);
        setField(term14197, term14197.getClass(), "reporter", null);
        setField(term14197, term14197.getClass(), "nativeTypes", null);
        setField(term14197, term14197.getClass(), "namesToTypes", null);
        setField(term14197, term14197.getClass(), "namespaces", null);
        setField(term14197, term14197.getClass(), "enumTypeNames", null);
        setField(term14197, term14197.getClass(), "forwardDeclaredTypes", null);
        setField(term14197, term14197.getClass(), "typesIndexedByProperty", null);
        setField(term14197, term14197.getClass(), "greatestSubtypeByProperty", null);
        setField(term14197, term14197.getClass(), "interfaceToImplementors", null);
        setField(term14197, term14197.getClass(), "unresolvedNamedTypes", null);
        setField(term14197, term14197.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term14197, term14197.getClass(), "lastGeneration", false);
        setField(term14197, term14197.getClass(), "templateTypeName", null);
        setField(term14197, term14197.getClass(), "templateType", null);
        setBooleanField(term14197, term14197.getClass(), "tolerateUndefinedValues", false);
        setField(term14197, term14197.getClass(), "resolveMode", null);
        setField(term14127, term14127.getClass(), "typeRegistry", term14197);
        setField(term14200, term14200.getClass(), "vars", null);
        setField(term14200, term14200.getClass(), "parent", null);
        setField(term14200, term14200.getClass(), "rootNode", null);
        setField(term14200, term14200.getClass(), "thisType", null);
        setBooleanField(term14200, term14200.getClass(), "isBottom", false);
        setField(term14127, term14127.getClass(), "topScope", term14200);
        setField(term14127, term14127.getClass(), "scopeCreator", null);
        setField(term14127, term14127.getClass(), "reportMissingOverride", null);
        setField(term14127, term14127.getClass(), "reportUnknownTypes", null);
        setBooleanField(term14127, term14127.getClass(), "reportMissingProperties", false);
        setField(term14127, term14127.getClass(), "inferJSDocInfo", null);
        setIntField(term14127, term14127.getClass(), "typedCount", 0);
        setIntField(term14127, term14127.getClass(), "nullCount", 0);
        setIntField(term14127, term14127.getClass(), "unknownCount", 0);
        setBooleanField(term14127, term14127.getClass(), "inExterns", false);
        setIntField(term14127, term14127.getClass(), "noTypeCheckSection", 0);
        term14208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14221 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14231 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14208, term14208.getClass(), "type", -370828664);
        setIntField(term14210, term14210.getClass(), "type", -1867239125);
        setIntField(term14212, term14212.getClass(), "type", 0);
        setField(term14212, term14212.getClass(), "next", null);
        setField(term14212, term14212.getClass(), "first", null);
        setField(term14212, term14212.getClass(), "last", null);
        setField(term14212, term14212.getClass(), "propListHead", null);
        setIntField(term14212, term14212.getClass(), "sourcePosition", 0);
        setField(term14212, term14212.getClass(), "jsType", null);
        setField(term14212, term14212.getClass(), "parent", null);
        setField(term14210, term14210.getClass(), "next", term14212);
        setIntField(term14215, term14215.getClass(), "type", 0);
        setField(term14215, term14215.getClass(), "next", null);
        setField(term14215, term14215.getClass(), "first", null);
        setField(term14215, term14215.getClass(), "last", null);
        setField(term14215, term14215.getClass(), "propListHead", null);
        setIntField(term14215, term14215.getClass(), "sourcePosition", 0);
        setField(term14215, term14215.getClass(), "jsType", null);
        setField(term14215, term14215.getClass(), "parent", null);
        setField(term14210, term14210.getClass(), "first", term14215);
        setIntField(term14218, term14218.getClass(), "type", 0);
        setField(term14218, term14218.getClass(), "next", null);
        setField(term14218, term14218.getClass(), "first", null);
        setField(term14218, term14218.getClass(), "last", null);
        setField(term14218, term14218.getClass(), "propListHead", null);
        setIntField(term14218, term14218.getClass(), "sourcePosition", 0);
        setField(term14218, term14218.getClass(), "jsType", null);
        setField(term14218, term14218.getClass(), "parent", null);
        setField(term14210, term14210.getClass(), "last", term14218);
        setField(term14221, term14221.getClass(), "next", null);
        setIntField(term14221, term14221.getClass(), "type", 0);
        setIntField(term14221, term14221.getClass(), "intValue", 0);
        setField(term14221, term14221.getClass(), "objectValue", null);
        setField(term14210, term14210.getClass(), "propListHead", term14221);
        setIntField(term14210, term14210.getClass(), "sourcePosition", -645429025);
        setField(term14210, term14210.getClass(), "jsType", null);
        setField(term14210, term14210.getClass(), "parent", null);
        setField(term14208, term14208.getClass(), "next", term14210);
        setIntField(term14225, term14225.getClass(), "type", 0);
        setField(term14225, term14225.getClass(), "next", null);
        setField(term14225, term14225.getClass(), "first", null);
        setField(term14225, term14225.getClass(), "last", null);
        setField(term14225, term14225.getClass(), "propListHead", null);
        setIntField(term14225, term14225.getClass(), "sourcePosition", 0);
        setField(term14225, term14225.getClass(), "jsType", null);
        setField(term14225, term14225.getClass(), "parent", null);
        setField(term14208, term14208.getClass(), "first", term14225);
        setIntField(term14228, term14228.getClass(), "type", 0);
        setField(term14228, term14228.getClass(), "next", null);
        setField(term14228, term14228.getClass(), "first", null);
        setField(term14228, term14228.getClass(), "last", null);
        setField(term14228, term14228.getClass(), "propListHead", null);
        setIntField(term14228, term14228.getClass(), "sourcePosition", 0);
        setField(term14228, term14228.getClass(), "jsType", null);
        setField(term14228, term14228.getClass(), "parent", null);
        setField(term14208, term14208.getClass(), "last", term14228);
        setField(term14231, term14231.getClass(), "next", null);
        setIntField(term14231, term14231.getClass(), "type", 0);
        setIntField(term14231, term14231.getClass(), "intValue", 0);
        setField(term14231, term14231.getClass(), "objectValue", null);
        setField(term14208, term14208.getClass(), "propListHead", term14231);
        setIntField(term14208, term14208.getClass(), "sourcePosition", -688213483);
        setField(term14208, term14208.getClass(), "jsType", null);
        setField(term14208, term14208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14208;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term14127, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


