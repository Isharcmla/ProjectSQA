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

public class TypeCheck_getJSType_162820871674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19797;
     Object term19877;

    public TypeCheck_getJSType_162820871674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19801 = new HashMap();
        HashMap term19808 = new HashMap();
        Set<Object> term50383 =  ((Map) term19808).keySet();
        HashSet term19807 = new HashSet((Collection<? extends Object>) term50383);
        HashMap term19814 = new HashMap();
        Set<Object> term50384 =  ((Map) term19814).keySet();
        HashSet term19813 = new HashSet((Collection<? extends Object>) term50384);
        HashMap term19820 = new HashMap();
        Set<Object> term50385 =  ((Map) term19820).keySet();
        HashSet term19819 = new HashSet((Collection<? extends Object>) term50385);
        HashMap term19825 = new HashMap();
        HashMap term19830 = new HashMap();
        Class<? extends Object> term50397 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term50396 = ((Class) term50397).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term50396).setAccessible(true);
        Object enum97 = ((Field) term50396).get((Object) null);
        Object term19861 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term19861, term19861.getClass(), "typeA", null);
        setField(term19861, term19861.getClass(), "typeB", null);
        Object term19862 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term19862, term19862.getClass(), "typeA", null);
        setField(term19862, term19862.getClass(), "typeB", null);
        Object term19863 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term19863, term19863.getClass(), "typeA", null);
        setField(term19863, term19863.getClass(), "typeB", null);
        ArrayList term19859 = new ArrayList();
        ((ArrayList) term19859).add(term19861);
        ((ArrayList) term19859).add(term19862);
        ((ArrayList) term19859).add(term19863);
        term19797 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term19798 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term19799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term19800 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term19849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term19866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term19869 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term19797, term19797.getClass(), "compiler", null);
        setField(term19798, term19798.getClass(), "compiler", null);
        setField(term19799, term19799.getClass(), "reporter", null);
        setField(term19799, term19799.getClass(), "nativeTypes", term19800);
        setField(term19799, term19799.getClass(), "namesToTypes", term19801);
        setField(term19799, term19799.getClass(), "namespaces", term19807);
        setField(term19799, term19799.getClass(), "enumTypeNames", term19813);
        setField(term19799, term19799.getClass(), "forwardDeclaredTypes", term19819);
        setField(term19799, term19799.getClass(), "typesIndexedByProperty", term19825);
        setField(term19799, term19799.getClass(), "greatestSubtypeByProperty", term19830);
        setField(term19799, term19799.getClass(), "interfaceToImplementors", null);
        setField(term19799, term19799.getClass(), "unresolvedNamedTypes", null);
        setField(term19799, term19799.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term19799, term19799.getClass(), "lastGeneration", false);
        setField(term19799, term19799.getClass(), "templateTypeName", "PNzNzzjSXM");
        setField(term19849, term19849.getClass(), "name", "");
        setField(term19849, term19849.getClass(), "referencedType", null);
        setBooleanField(term19849, term19849.getClass(), "visited", false);
        setField(term19849, term19849.getClass(), "docInfo", null);
        setBooleanField(term19849, term19849.getClass(), "unknown", false);
        setBooleanField(term19849, term19849.getClass(), "resolved", false);
        setField(term19849, term19849.getClass(), "resolveResult", null);
        setField(term19849, term19849.getClass(), "registry", null);
        setField(term19799, term19799.getClass(), "templateType", term19849);
        setBooleanField(term19799, term19799.getClass(), "tolerateUndefinedValues", true);
        setField(term19799, term19799.getClass(), "resolveMode", enum97);
        setField(term19798, term19798.getClass(), "typeRegistry", term19799);
        setField(term19798, term19798.getClass(), "allValueTypes", null);
        setBooleanField(term19798, term19798.getClass(), "shouldReport", true);
        setField(term19798, term19798.getClass(), "mismatches", term19859);
        setField(term19797, term19797.getClass(), "validator", term19798);
        setField(term19797, term19797.getClass(), "reverseInterpreter", null);
        setField(term19866, term19866.getClass(), "reporter", null);
        setField(term19866, term19866.getClass(), "nativeTypes", null);
        setField(term19866, term19866.getClass(), "namesToTypes", null);
        setField(term19866, term19866.getClass(), "namespaces", null);
        setField(term19866, term19866.getClass(), "enumTypeNames", null);
        setField(term19866, term19866.getClass(), "forwardDeclaredTypes", null);
        setField(term19866, term19866.getClass(), "typesIndexedByProperty", null);
        setField(term19866, term19866.getClass(), "greatestSubtypeByProperty", null);
        setField(term19866, term19866.getClass(), "interfaceToImplementors", null);
        setField(term19866, term19866.getClass(), "unresolvedNamedTypes", null);
        setField(term19866, term19866.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term19866, term19866.getClass(), "lastGeneration", false);
        setField(term19866, term19866.getClass(), "templateTypeName", null);
        setField(term19866, term19866.getClass(), "templateType", null);
        setBooleanField(term19866, term19866.getClass(), "tolerateUndefinedValues", false);
        setField(term19866, term19866.getClass(), "resolveMode", null);
        setField(term19797, term19797.getClass(), "typeRegistry", term19866);
        setField(term19869, term19869.getClass(), "vars", null);
        setField(term19869, term19869.getClass(), "parent", null);
        setField(term19869, term19869.getClass(), "rootNode", null);
        setField(term19869, term19869.getClass(), "thisType", null);
        setBooleanField(term19869, term19869.getClass(), "isBottom", false);
        setField(term19797, term19797.getClass(), "topScope", term19869);
        setField(term19797, term19797.getClass(), "scopeCreator", null);
        setField(term19797, term19797.getClass(), "reportMissingOverride", null);
        setField(term19797, term19797.getClass(), "reportUnknownTypes", null);
        setBooleanField(term19797, term19797.getClass(), "reportMissingProperties", false);
        setField(term19797, term19797.getClass(), "inferJSDocInfo", null);
        setIntField(term19797, term19797.getClass(), "typedCount", 0);
        setIntField(term19797, term19797.getClass(), "nullCount", 0);
        setIntField(term19797, term19797.getClass(), "unknownCount", 0);
        setBooleanField(term19797, term19797.getClass(), "inExterns", false);
        setIntField(term19797, term19797.getClass(), "noTypeCheckSection", 0);
        term19877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19890 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term19894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19900 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term19877, term19877.getClass(), "type", 27043781);
        setIntField(term19879, term19879.getClass(), "type", 1648665618);
        setIntField(term19881, term19881.getClass(), "type", 0);
        setField(term19881, term19881.getClass(), "next", null);
        setField(term19881, term19881.getClass(), "first", null);
        setField(term19881, term19881.getClass(), "last", null);
        setField(term19881, term19881.getClass(), "propListHead", null);
        setIntField(term19881, term19881.getClass(), "sourcePosition", 0);
        setField(term19881, term19881.getClass(), "jsType", null);
        setField(term19881, term19881.getClass(), "parent", null);
        setField(term19879, term19879.getClass(), "next", term19881);
        setIntField(term19884, term19884.getClass(), "type", 0);
        setField(term19884, term19884.getClass(), "next", null);
        setField(term19884, term19884.getClass(), "first", null);
        setField(term19884, term19884.getClass(), "last", null);
        setField(term19884, term19884.getClass(), "propListHead", null);
        setIntField(term19884, term19884.getClass(), "sourcePosition", 0);
        setField(term19884, term19884.getClass(), "jsType", null);
        setField(term19884, term19884.getClass(), "parent", null);
        setField(term19879, term19879.getClass(), "first", term19884);
        setIntField(term19887, term19887.getClass(), "type", 0);
        setField(term19887, term19887.getClass(), "next", null);
        setField(term19887, term19887.getClass(), "first", null);
        setField(term19887, term19887.getClass(), "last", null);
        setField(term19887, term19887.getClass(), "propListHead", null);
        setIntField(term19887, term19887.getClass(), "sourcePosition", 0);
        setField(term19887, term19887.getClass(), "jsType", null);
        setField(term19887, term19887.getClass(), "parent", null);
        setField(term19879, term19879.getClass(), "last", term19887);
        setField(term19890, term19890.getClass(), "next", null);
        setIntField(term19890, term19890.getClass(), "type", 0);
        setIntField(term19890, term19890.getClass(), "intValue", 0);
        setField(term19890, term19890.getClass(), "objectValue", null);
        setField(term19879, term19879.getClass(), "propListHead", term19890);
        setIntField(term19879, term19879.getClass(), "sourcePosition", 1545119095);
        setField(term19879, term19879.getClass(), "jsType", null);
        setField(term19879, term19879.getClass(), "parent", null);
        setField(term19877, term19877.getClass(), "next", term19879);
        setIntField(term19894, term19894.getClass(), "type", 0);
        setField(term19894, term19894.getClass(), "next", null);
        setField(term19894, term19894.getClass(), "first", null);
        setField(term19894, term19894.getClass(), "last", null);
        setField(term19894, term19894.getClass(), "propListHead", null);
        setIntField(term19894, term19894.getClass(), "sourcePosition", 0);
        setField(term19894, term19894.getClass(), "jsType", null);
        setField(term19894, term19894.getClass(), "parent", null);
        setField(term19877, term19877.getClass(), "first", term19894);
        setIntField(term19897, term19897.getClass(), "type", 0);
        setField(term19897, term19897.getClass(), "next", null);
        setField(term19897, term19897.getClass(), "first", null);
        setField(term19897, term19897.getClass(), "last", null);
        setField(term19897, term19897.getClass(), "propListHead", null);
        setIntField(term19897, term19897.getClass(), "sourcePosition", 0);
        setField(term19897, term19897.getClass(), "jsType", null);
        setField(term19897, term19897.getClass(), "parent", null);
        setField(term19877, term19877.getClass(), "last", term19897);
        setField(term19900, term19900.getClass(), "next", null);
        setIntField(term19900, term19900.getClass(), "type", 0);
        setIntField(term19900, term19900.getClass(), "intValue", 0);
        setField(term19900, term19900.getClass(), "objectValue", null);
        setField(term19877, term19877.getClass(), "propListHead", term19900);
        setIntField(term19877, term19877.getClass(), "sourcePosition", 1671229683);
        setField(term19877, term19877.getClass(), "jsType", null);
        setField(term19877, term19877.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19877;
        try {
            callMethod(klass, "getJSType", argTypes, term19797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


