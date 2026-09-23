package com.google.javascript.rhino.jstype;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;

public class FunctionType_init_183823358956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1009;
     Object term1171;

    public FunctionType_init_183823358956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1011 = new HashMap();
        HashMap term1021 = new HashMap();
        Set<Object> term23160 =  ((Map) term1021).keySet();
        HashSet term1020 = new HashSet((Collection<? extends Object>) term23160);
        HashMap term1038 = new HashMap();
        Set<Object> term23161 =  ((Map) term1038).keySet();
        HashSet term1037 = new HashSet((Collection<? extends Object>) term23161);
        HashMap term1044 = new HashMap();
        Set<Object> term23162 =  ((Map) term1044).keySet();
        HashSet term1043 = new HashSet((Collection<? extends Object>) term23162);
        HashMap term1052 = new HashMap();
        HashMap term1057 = new HashMap();
        ArrayList term1096 = new ArrayList();
        HashMap term1099 = new HashMap();
        ArrayList term1104 = new ArrayList();
        ((ArrayList) term1104).add((Object)null);
        ((ArrayList) term1104).add((Object)null);
        HashSet term1112 = new HashSet();
        HashSet term1113 = new HashSet();
        ArrayList term1116 = new ArrayList();
        ((ArrayList) term1116).add((Object)null);
        ((ArrayList) term1116).add((Object)null);
        ((ArrayList) term1116).add((Object)null);
        ((ArrayList) term1116).add((Object)null);
        ((ArrayList) term1116).add((Object)null);
        HashMap term1119 = new HashMap();
        Class<? extends Object> term23194 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term23193 = ((Class) term23194).getDeclaredField((String) "PROTECTED");
        ((Field) term23193).setAccessible(true);
        Object enum61 = ((Field) term23193).get((Object) null);
        Class<? extends Object> term23468 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term23467 = ((Class) term23468).getDeclaredField((String) "IMMEDIATE");
        ((Field) term23467).setAccessible(true);
        Object enum62 = ((Field) term23467).get((Object) null);
        term1009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1010 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term1079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1093 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1094 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term1095 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1115 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term1140 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1141 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term1009, term1009.getClass(), "reporter", null);
        setField(term1009, term1009.getClass(), "nativeTypes", term1010);
        setField(term1009, term1009.getClass(), "namesToTypes", term1011);
        setField(term1009, term1009.getClass(), "namespaces", term1020);
        setField(term1009, term1009.getClass(), "enumTypeNames", term1037);
        setField(term1009, term1009.getClass(), "forwardDeclaredTypes", term1043);
        setField(term1009, term1009.getClass(), "typesIndexedByProperty", term1052);
        setField(term1009, term1009.getClass(), "greatestSubtypeByProperty", term1057);
        setField(term1009, term1009.getClass(), "interfaceToImplementors", null);
        setField(term1009, term1009.getClass(), "unresolvedNamedTypes", null);
        setField(term1009, term1009.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1009, term1009.getClass(), "lastGeneration", false);
        setField(term1009, term1009.getClass(), "templateTypeName", "tShwQLRGNe");
        setField(term1079, term1079.getClass(), "name", "LvtrsXUliU");
        setField(term1079, term1079.getClass(), "referencedType", null);
        setField(term1079, term1079.getClass(), "referencedObjType", null);
        setBooleanField(term1079, term1079.getClass(), "visited", true);
        setField(term1095, term1095.getClass(), "root", null);
        setField(term1095, term1095.getClass(), "sourceName", null);
        setField(term1094, term1094.getClass(), "baseType", term1095);
        setField(term1094, term1094.getClass(), "implementedInterfaces", term1096);
        setField(term1094, term1094.getClass(), "parameters", term1099);
        setField(term1094, term1094.getClass(), "thrownTypes", term1104);
        setField(term1094, term1094.getClass(), "templateTypeName", "");
        setField(term1094, term1094.getClass(), "description", "");
        setField(term1094, term1094.getClass(), "meaning", "");
        setField(term1094, term1094.getClass(), "deprecated", "");
        setField(term1094, term1094.getClass(), "license", "");
        setField(term1094, term1094.getClass(), "suppressions", term1112);
        setField(term1094, term1094.getClass(), "modifies", term1113);
        setField(term1094, term1094.getClass(), "lendsName", "");
        setField(term1093, term1093.getClass(), "info", term1094);
        setField(term1115, term1115.getClass(), "markers", term1116);
        setField(term1115, term1115.getClass(), "parameters", term1119);
        setField(term1115, term1115.getClass(), "throwsDescriptions", null);
        setField(term1115, term1115.getClass(), "blockDescription", null);
        setField(term1115, term1115.getClass(), "fileOverview", null);
        setField(term1115, term1115.getClass(), "returnDescription", null);
        setField(term1115, term1115.getClass(), "version", null);
        setField(term1115, term1115.getClass(), "authors", null);
        setField(term1115, term1115.getClass(), "sees", null);
        setField(term1093, term1093.getClass(), "documentation", term1115);
        setField(term1093, term1093.getClass(), "sourceName", "kBdSllIBVz");
        setField(term1093, term1093.getClass(), "visibility", enum61);
        setIntField(term1093, term1093.getClass(), "bitset", 1135664017);
        setField(term1140, term1140.getClass(), "root", null);
        setField(term1140, term1140.getClass(), "sourceName", null);
        setField(term1093, term1093.getClass(), "type", term1140);
        setField(term1141, term1141.getClass(), "root", null);
        setField(term1141, term1141.getClass(), "sourceName", null);
        setField(term1093, term1093.getClass(), "thisType", term1141);
        setBooleanField(term1093, term1093.getClass(), "includeDocumentation", false);
        setField(term1079, term1079.getClass(), "docInfo", term1093);
        setBooleanField(term1079, term1079.getClass(), "unknown", true);
        setBooleanField(term1079, term1079.getClass(), "resolved", false);
        setField(term1079, term1079.getClass(), "resolveResult", null);
        setField(term1079, term1079.getClass(), "registry", null);
        setField(term1009, term1009.getClass(), "templateType", term1079);
        setBooleanField(term1009, term1009.getClass(), "tolerateUndefinedValues", true);
        setField(term1009, term1009.getClass(), "resolveMode", enum62);
        term1171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1184 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1194 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1171, term1171.getClass(), "type", -203030934);
        setIntField(term1173, term1173.getClass(), "type", 1193880199);
        setIntField(term1175, term1175.getClass(), "type", 0);
        setField(term1175, term1175.getClass(), "next", null);
        setField(term1175, term1175.getClass(), "first", null);
        setField(term1175, term1175.getClass(), "last", null);
        setField(term1175, term1175.getClass(), "propListHead", null);
        setIntField(term1175, term1175.getClass(), "sourcePosition", 0);
        setField(term1175, term1175.getClass(), "jsType", null);
        setField(term1175, term1175.getClass(), "parent", null);
        setField(term1173, term1173.getClass(), "next", term1175);
        setIntField(term1178, term1178.getClass(), "type", 0);
        setField(term1178, term1178.getClass(), "next", null);
        setField(term1178, term1178.getClass(), "first", null);
        setField(term1178, term1178.getClass(), "last", null);
        setField(term1178, term1178.getClass(), "propListHead", null);
        setIntField(term1178, term1178.getClass(), "sourcePosition", 0);
        setField(term1178, term1178.getClass(), "jsType", null);
        setField(term1178, term1178.getClass(), "parent", null);
        setField(term1173, term1173.getClass(), "first", term1178);
        setIntField(term1181, term1181.getClass(), "type", 0);
        setField(term1181, term1181.getClass(), "next", null);
        setField(term1181, term1181.getClass(), "first", null);
        setField(term1181, term1181.getClass(), "last", null);
        setField(term1181, term1181.getClass(), "propListHead", null);
        setIntField(term1181, term1181.getClass(), "sourcePosition", 0);
        setField(term1181, term1181.getClass(), "jsType", null);
        setField(term1181, term1181.getClass(), "parent", null);
        setField(term1173, term1173.getClass(), "last", term1181);
        setField(term1184, term1184.getClass(), "next", null);
        setIntField(term1184, term1184.getClass(), "type", 0);
        setIntField(term1184, term1184.getClass(), "intValue", 0);
        setField(term1184, term1184.getClass(), "objectValue", null);
        setField(term1173, term1173.getClass(), "propListHead", term1184);
        setIntField(term1173, term1173.getClass(), "sourcePosition", -469968304);
        setField(term1173, term1173.getClass(), "jsType", null);
        setField(term1173, term1173.getClass(), "parent", null);
        setField(term1171, term1171.getClass(), "next", term1173);
        setIntField(term1188, term1188.getClass(), "type", 0);
        setField(term1188, term1188.getClass(), "next", null);
        setField(term1188, term1188.getClass(), "first", null);
        setField(term1188, term1188.getClass(), "last", null);
        setField(term1188, term1188.getClass(), "propListHead", null);
        setIntField(term1188, term1188.getClass(), "sourcePosition", 0);
        setField(term1188, term1188.getClass(), "jsType", null);
        setField(term1188, term1188.getClass(), "parent", null);
        setField(term1171, term1171.getClass(), "first", term1188);
        setIntField(term1191, term1191.getClass(), "type", 0);
        setField(term1191, term1191.getClass(), "next", null);
        setField(term1191, term1191.getClass(), "first", null);
        setField(term1191, term1191.getClass(), "last", null);
        setField(term1191, term1191.getClass(), "propListHead", null);
        setIntField(term1191, term1191.getClass(), "sourcePosition", 0);
        setField(term1191, term1191.getClass(), "jsType", null);
        setField(term1191, term1191.getClass(), "parent", null);
        setField(term1171, term1171.getClass(), "last", term1191);
        setField(term1194, term1194.getClass(), "next", null);
        setIntField(term1194, term1194.getClass(), "type", 0);
        setIntField(term1194, term1194.getClass(), "intValue", 0);
        setField(term1194, term1194.getClass(), "objectValue", null);
        setField(term1171, term1171.getClass(), "propListHead", term1194);
        setIntField(term1171, term1171.getClass(), "sourcePosition", -1145578966);
        setField(term1171, term1171.getClass(), "jsType", null);
        setField(term1171, term1171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term1009;
        args[1] = "TJmVBGfTML";
        args[2] = term1171;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


