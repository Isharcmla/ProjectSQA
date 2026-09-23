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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class TypedScopeCreator_createInitialScope_7622474643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;
     Object term197;

    public TypedScopeCreator_createInitialScope_7622474643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term133 = new HashMap();
        HashMap term140 = new HashMap();
        Set<Object> term224 =  ((Map) term140).keySet();
        HashSet term139 = new HashSet((Collection<? extends Object>) term224);
        HashMap term146 = new HashMap();
        Set<Object> term225 =  ((Map) term146).keySet();
        HashSet term145 = new HashSet((Collection<? extends Object>) term225);
        HashMap term152 = new HashMap();
        Set<Object> term226 =  ((Map) term152).keySet();
        HashSet term151 = new HashSet((Collection<? extends Object>) term226);
        HashMap term157 = new HashMap();
        HashMap term162 = new HashMap();
        Object term187 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term187, term187.getClass(), "first", null);
        setField(term187, term187.getClass(), "second", null);
        ArrayList term185 = new ArrayList();
        ((ArrayList) term185).add(term187);
        HashMap term192 = new HashMap();
        term129 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term130 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term132 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term129, term129.getClass(), "compiler", null);
        setField(term130, term130.getClass(), "compiler", null);
        setField(term131, term131.getClass(), "reporter", null);
        setField(term131, term131.getClass(), "nativeTypes", term132);
        setField(term131, term131.getClass(), "namesToTypes", term133);
        setField(term131, term131.getClass(), "namespaces", term139);
        setField(term131, term131.getClass(), "enumTypeNames", term145);
        setField(term131, term131.getClass(), "forwardDeclaredTypes", term151);
        setField(term131, term131.getClass(), "typesIndexedByProperty", term157);
        setField(term131, term131.getClass(), "greatestSubtypeByProperty", term162);
        setField(term131, term131.getClass(), "interfaceToImplementors", null);
        setField(term131, term131.getClass(), "unresolvedNamedTypes", null);
        setField(term131, term131.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term131, term131.getClass(), "lastGeneration", false);
        setField(term131, term131.getClass(), "templateTypeName", "kuTXqwMtDB");
        setField(term181, term181.getClass(), "name", "");
        setField(term181, term181.getClass(), "referencedType", null);
        setBooleanField(term181, term181.getClass(), "visited", false);
        setField(term181, term181.getClass(), "docInfo", null);
        setBooleanField(term181, term181.getClass(), "unknown", false);
        setField(term181, term181.getClass(), "registry", null);
        setField(term131, term131.getClass(), "templateType", term181);
        setField(term130, term130.getClass(), "typeRegistry", term131);
        setField(term130, term130.getClass(), "allValueTypes", null);
        setField(term130, term130.getClass(), "mismatches", term185);
        setField(term129, term129.getClass(), "validator", term130);
        setField(term129, term129.getClass(), "codingConvention", null);
        setField(term190, term190.getClass(), "reporter", null);
        setField(term190, term190.getClass(), "nativeTypes", null);
        setField(term190, term190.getClass(), "namesToTypes", null);
        setField(term190, term190.getClass(), "namespaces", null);
        setField(term190, term190.getClass(), "enumTypeNames", null);
        setField(term190, term190.getClass(), "forwardDeclaredTypes", null);
        setField(term190, term190.getClass(), "typesIndexedByProperty", null);
        setField(term190, term190.getClass(), "greatestSubtypeByProperty", null);
        setField(term190, term190.getClass(), "interfaceToImplementors", null);
        setField(term190, term190.getClass(), "unresolvedNamedTypes", null);
        setField(term190, term190.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term190, term190.getClass(), "lastGeneration", false);
        setField(term190, term190.getClass(), "templateTypeName", null);
        setField(term190, term190.getClass(), "templateType", null);
        setField(term129, term129.getClass(), "typeRegistry", term190);
        setField(term129, term129.getClass(), "delegateProxyMap", term192);
        term197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term197, term197.getClass(), "type", 1135664017);
        setIntField(term199, term199.getClass(), "type", -244121226);
        setIntField(term201, term201.getClass(), "type", 0);
        setField(term201, term201.getClass(), "next", null);
        setField(term201, term201.getClass(), "first", null);
        setField(term201, term201.getClass(), "last", null);
        setField(term201, term201.getClass(), "propListHead", null);
        setIntField(term201, term201.getClass(), "sourcePosition", 0);
        setField(term201, term201.getClass(), "jsType", null);
        setField(term201, term201.getClass(), "parent", null);
        setField(term199, term199.getClass(), "next", term201);
        setIntField(term204, term204.getClass(), "type", 0);
        setField(term204, term204.getClass(), "next", null);
        setField(term204, term204.getClass(), "first", null);
        setField(term204, term204.getClass(), "last", null);
        setField(term204, term204.getClass(), "propListHead", null);
        setIntField(term204, term204.getClass(), "sourcePosition", 0);
        setField(term204, term204.getClass(), "jsType", null);
        setField(term204, term204.getClass(), "parent", null);
        setField(term199, term199.getClass(), "first", term204);
        setIntField(term207, term207.getClass(), "type", 0);
        setField(term207, term207.getClass(), "next", null);
        setField(term207, term207.getClass(), "first", null);
        setField(term207, term207.getClass(), "last", null);
        setField(term207, term207.getClass(), "propListHead", null);
        setIntField(term207, term207.getClass(), "sourcePosition", 0);
        setField(term207, term207.getClass(), "jsType", null);
        setField(term207, term207.getClass(), "parent", null);
        setField(term199, term199.getClass(), "last", term207);
        setField(term210, term210.getClass(), "next", null);
        setIntField(term210, term210.getClass(), "type", 0);
        setIntField(term210, term210.getClass(), "intValue", 0);
        setField(term210, term210.getClass(), "objectValue", null);
        setField(term199, term199.getClass(), "propListHead", term210);
        setIntField(term199, term199.getClass(), "sourcePosition", -73683645);
        setField(term199, term199.getClass(), "jsType", null);
        setField(term199, term199.getClass(), "parent", null);
        setField(term197, term197.getClass(), "next", term199);
        setIntField(term214, term214.getClass(), "type", 0);
        setField(term214, term214.getClass(), "next", null);
        setField(term214, term214.getClass(), "first", null);
        setField(term214, term214.getClass(), "last", null);
        setField(term214, term214.getClass(), "propListHead", null);
        setIntField(term214, term214.getClass(), "sourcePosition", 0);
        setField(term214, term214.getClass(), "jsType", null);
        setField(term214, term214.getClass(), "parent", null);
        setField(term197, term197.getClass(), "first", term214);
        setIntField(term217, term217.getClass(), "type", 0);
        setField(term217, term217.getClass(), "next", null);
        setField(term217, term217.getClass(), "first", null);
        setField(term217, term217.getClass(), "last", null);
        setField(term217, term217.getClass(), "propListHead", null);
        setIntField(term217, term217.getClass(), "sourcePosition", 0);
        setField(term217, term217.getClass(), "jsType", null);
        setField(term217, term217.getClass(), "parent", null);
        setField(term197, term197.getClass(), "last", term217);
        setField(term220, term220.getClass(), "next", null);
        setIntField(term220, term220.getClass(), "type", 0);
        setIntField(term220, term220.getClass(), "intValue", 0);
        setField(term220, term220.getClass(), "objectValue", null);
        setField(term197, term197.getClass(), "propListHead", term220);
        setIntField(term197, term197.getClass(), "sourcePosition", -226514366);
        setField(term197, term197.getClass(), "jsType", null);
        setField(term197, term197.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term197;
        callMethod(klass, "createInitialScope", argTypes, term129, args);
    }

};


