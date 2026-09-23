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

public class TypeCheck_getFunctionType_86107567075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20259;
     Object term20340;

    public TypeCheck_getFunctionType_86107567075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20263 = new HashMap();
        HashMap term20270 = new HashMap();
        Set<Object> term51025 =  ((Map) term20270).keySet();
        HashSet term20269 = new HashSet((Collection<? extends Object>) term51025);
        HashMap term20276 = new HashMap();
        Set<Object> term51026 =  ((Map) term20276).keySet();
        HashSet term20275 = new HashSet((Collection<? extends Object>) term51026);
        HashMap term20282 = new HashMap();
        Set<Object> term51027 =  ((Map) term20282).keySet();
        HashSet term20281 = new HashSet((Collection<? extends Object>) term51027);
        HashMap term20287 = new HashMap();
        HashMap term20292 = new HashMap();
        Class<? extends Object> term51039 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term51038 = ((Class) term51039).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term51038).setAccessible(true);
        Object enum98 = ((Field) term51038).get((Object) null);
        Object term20323 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term20323, term20323.getClass(), "typeA", null);
        setField(term20323, term20323.getClass(), "typeB", null);
        Object term20324 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term20324, term20324.getClass(), "typeA", null);
        setField(term20324, term20324.getClass(), "typeB", null);
        Object term20325 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term20325, term20325.getClass(), "typeA", null);
        setField(term20325, term20325.getClass(), "typeB", null);
        Object term20326 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term20326, term20326.getClass(), "typeA", null);
        setField(term20326, term20326.getClass(), "typeB", null);
        ArrayList term20321 = new ArrayList();
        ((ArrayList) term20321).add(term20323);
        ((ArrayList) term20321).add(term20324);
        ((ArrayList) term20321).add(term20325);
        ((ArrayList) term20321).add(term20326);
        term20259 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term20260 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term20261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term20262 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term20311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term20329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term20332 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term20259, term20259.getClass(), "compiler", null);
        setField(term20260, term20260.getClass(), "compiler", null);
        setField(term20261, term20261.getClass(), "reporter", null);
        setField(term20261, term20261.getClass(), "nativeTypes", term20262);
        setField(term20261, term20261.getClass(), "namesToTypes", term20263);
        setField(term20261, term20261.getClass(), "namespaces", term20269);
        setField(term20261, term20261.getClass(), "enumTypeNames", term20275);
        setField(term20261, term20261.getClass(), "forwardDeclaredTypes", term20281);
        setField(term20261, term20261.getClass(), "typesIndexedByProperty", term20287);
        setField(term20261, term20261.getClass(), "greatestSubtypeByProperty", term20292);
        setField(term20261, term20261.getClass(), "interfaceToImplementors", null);
        setField(term20261, term20261.getClass(), "unresolvedNamedTypes", null);
        setField(term20261, term20261.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term20261, term20261.getClass(), "lastGeneration", true);
        setField(term20261, term20261.getClass(), "templateTypeName", "BkIxsyPkGy");
        setField(term20311, term20311.getClass(), "name", "");
        setField(term20311, term20311.getClass(), "referencedType", null);
        setBooleanField(term20311, term20311.getClass(), "visited", false);
        setField(term20311, term20311.getClass(), "docInfo", null);
        setBooleanField(term20311, term20311.getClass(), "unknown", false);
        setBooleanField(term20311, term20311.getClass(), "resolved", false);
        setField(term20311, term20311.getClass(), "resolveResult", null);
        setField(term20311, term20311.getClass(), "registry", null);
        setField(term20261, term20261.getClass(), "templateType", term20311);
        setBooleanField(term20261, term20261.getClass(), "tolerateUndefinedValues", false);
        setField(term20261, term20261.getClass(), "resolveMode", enum98);
        setField(term20260, term20260.getClass(), "typeRegistry", term20261);
        setField(term20260, term20260.getClass(), "allValueTypes", null);
        setBooleanField(term20260, term20260.getClass(), "shouldReport", true);
        setField(term20260, term20260.getClass(), "mismatches", term20321);
        setField(term20259, term20259.getClass(), "validator", term20260);
        setField(term20259, term20259.getClass(), "reverseInterpreter", null);
        setField(term20329, term20329.getClass(), "reporter", null);
        setField(term20329, term20329.getClass(), "nativeTypes", null);
        setField(term20329, term20329.getClass(), "namesToTypes", null);
        setField(term20329, term20329.getClass(), "namespaces", null);
        setField(term20329, term20329.getClass(), "enumTypeNames", null);
        setField(term20329, term20329.getClass(), "forwardDeclaredTypes", null);
        setField(term20329, term20329.getClass(), "typesIndexedByProperty", null);
        setField(term20329, term20329.getClass(), "greatestSubtypeByProperty", null);
        setField(term20329, term20329.getClass(), "interfaceToImplementors", null);
        setField(term20329, term20329.getClass(), "unresolvedNamedTypes", null);
        setField(term20329, term20329.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term20329, term20329.getClass(), "lastGeneration", false);
        setField(term20329, term20329.getClass(), "templateTypeName", null);
        setField(term20329, term20329.getClass(), "templateType", null);
        setBooleanField(term20329, term20329.getClass(), "tolerateUndefinedValues", false);
        setField(term20329, term20329.getClass(), "resolveMode", null);
        setField(term20259, term20259.getClass(), "typeRegistry", term20329);
        setField(term20332, term20332.getClass(), "vars", null);
        setField(term20332, term20332.getClass(), "parent", null);
        setField(term20332, term20332.getClass(), "rootNode", null);
        setField(term20332, term20332.getClass(), "thisType", null);
        setBooleanField(term20332, term20332.getClass(), "isBottom", false);
        setField(term20259, term20259.getClass(), "topScope", term20332);
        setField(term20259, term20259.getClass(), "scopeCreator", null);
        setField(term20259, term20259.getClass(), "reportMissingOverride", null);
        setField(term20259, term20259.getClass(), "reportUnknownTypes", null);
        setBooleanField(term20259, term20259.getClass(), "reportMissingProperties", false);
        setField(term20259, term20259.getClass(), "inferJSDocInfo", null);
        setIntField(term20259, term20259.getClass(), "typedCount", 0);
        setIntField(term20259, term20259.getClass(), "nullCount", 0);
        setIntField(term20259, term20259.getClass(), "unknownCount", 0);
        setBooleanField(term20259, term20259.getClass(), "inExterns", false);
        setIntField(term20259, term20259.getClass(), "noTypeCheckSection", 0);
        term20340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20353 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20363 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20340, term20340.getClass(), "type", 385463636);
        setIntField(term20342, term20342.getClass(), "type", 1588942911);
        setIntField(term20344, term20344.getClass(), "type", 0);
        setField(term20344, term20344.getClass(), "next", null);
        setField(term20344, term20344.getClass(), "first", null);
        setField(term20344, term20344.getClass(), "last", null);
        setField(term20344, term20344.getClass(), "propListHead", null);
        setIntField(term20344, term20344.getClass(), "sourcePosition", 0);
        setField(term20344, term20344.getClass(), "jsType", null);
        setField(term20344, term20344.getClass(), "parent", null);
        setField(term20342, term20342.getClass(), "next", term20344);
        setIntField(term20347, term20347.getClass(), "type", 0);
        setField(term20347, term20347.getClass(), "next", null);
        setField(term20347, term20347.getClass(), "first", null);
        setField(term20347, term20347.getClass(), "last", null);
        setField(term20347, term20347.getClass(), "propListHead", null);
        setIntField(term20347, term20347.getClass(), "sourcePosition", 0);
        setField(term20347, term20347.getClass(), "jsType", null);
        setField(term20347, term20347.getClass(), "parent", null);
        setField(term20342, term20342.getClass(), "first", term20347);
        setIntField(term20350, term20350.getClass(), "type", 0);
        setField(term20350, term20350.getClass(), "next", null);
        setField(term20350, term20350.getClass(), "first", null);
        setField(term20350, term20350.getClass(), "last", null);
        setField(term20350, term20350.getClass(), "propListHead", null);
        setIntField(term20350, term20350.getClass(), "sourcePosition", 0);
        setField(term20350, term20350.getClass(), "jsType", null);
        setField(term20350, term20350.getClass(), "parent", null);
        setField(term20342, term20342.getClass(), "last", term20350);
        setField(term20353, term20353.getClass(), "next", null);
        setIntField(term20353, term20353.getClass(), "type", 0);
        setIntField(term20353, term20353.getClass(), "intValue", 0);
        setField(term20353, term20353.getClass(), "objectValue", null);
        setField(term20342, term20342.getClass(), "propListHead", term20353);
        setIntField(term20342, term20342.getClass(), "sourcePosition", -1955400589);
        setField(term20342, term20342.getClass(), "jsType", null);
        setField(term20342, term20342.getClass(), "parent", null);
        setField(term20340, term20340.getClass(), "next", term20342);
        setIntField(term20357, term20357.getClass(), "type", 0);
        setField(term20357, term20357.getClass(), "next", null);
        setField(term20357, term20357.getClass(), "first", null);
        setField(term20357, term20357.getClass(), "last", null);
        setField(term20357, term20357.getClass(), "propListHead", null);
        setIntField(term20357, term20357.getClass(), "sourcePosition", 0);
        setField(term20357, term20357.getClass(), "jsType", null);
        setField(term20357, term20357.getClass(), "parent", null);
        setField(term20340, term20340.getClass(), "first", term20357);
        setIntField(term20360, term20360.getClass(), "type", 0);
        setField(term20360, term20360.getClass(), "next", null);
        setField(term20360, term20360.getClass(), "first", null);
        setField(term20360, term20360.getClass(), "last", null);
        setField(term20360, term20360.getClass(), "propListHead", null);
        setIntField(term20360, term20360.getClass(), "sourcePosition", 0);
        setField(term20360, term20360.getClass(), "jsType", null);
        setField(term20360, term20360.getClass(), "parent", null);
        setField(term20340, term20340.getClass(), "last", term20360);
        setField(term20363, term20363.getClass(), "next", null);
        setIntField(term20363, term20363.getClass(), "type", 0);
        setIntField(term20363, term20363.getClass(), "intValue", 0);
        setField(term20363, term20363.getClass(), "objectValue", null);
        setField(term20340, term20340.getClass(), "propListHead", term20363);
        setIntField(term20340, term20340.getClass(), "sourcePosition", 626179200);
        setField(term20340, term20340.getClass(), "jsType", null);
        setField(term20340, term20340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20340;
        try {
            callMethod(klass, "getFunctionType", argTypes, term20259, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


