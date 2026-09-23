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
import java.lang.Boolean;

public class FunctionTypeBuilder_addParameter_163183453440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12867;
     Object term12987;
     Object term13094;
     Object term13096;
     Object term13098;

    public FunctionTypeBuilder_addParameter_163183453440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12882 = new HashMap();
        HashMap term12891 = new HashMap();
        Set<Object> term29175 =  ((Map) term12891).keySet();
        HashSet term12890 = new HashSet((Collection<? extends Object>) term29175);
        HashMap term12898 = new HashMap();
        Set<Object> term29176 =  ((Map) term12898).keySet();
        HashSet term12897 = new HashSet((Collection<? extends Object>) term29176);
        HashMap term12905 = new HashMap();
        Set<Object> term29177 =  ((Map) term12905).keySet();
        HashSet term12904 = new HashSet((Collection<? extends Object>) term29177);
        HashMap term12910 = new HashMap();
        HashMap term12915 = new HashMap();
        Class<? extends Object> term29199 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term29198 = ((Class) term29199).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term29198).setAccessible(true);
        Object enum53 = ((Field) term29198).get((Object) null);
        term12867 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term12880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12881 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term12936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12982 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term12867, term12867.getClass(), "fnName", "JdOMfNWgLP");
        setField(term12867, term12867.getClass(), "compiler", null);
        setField(term12867, term12867.getClass(), "codingConvention", null);
        setField(term12880, term12880.getClass(), "reporter", null);
        setField(term12880, term12880.getClass(), "nativeTypes", term12881);
        setField(term12880, term12880.getClass(), "namesToTypes", term12882);
        setField(term12880, term12880.getClass(), "namespaces", term12890);
        setField(term12880, term12880.getClass(), "nonNullableTypeNames", term12897);
        setField(term12880, term12880.getClass(), "forwardDeclaredTypes", term12904);
        setField(term12880, term12880.getClass(), "typesIndexedByProperty", term12910);
        setField(term12880, term12880.getClass(), "greatestSubtypeByProperty", term12915);
        setField(term12880, term12880.getClass(), "interfaceToImplementors", null);
        setField(term12880, term12880.getClass(), "unresolvedNamedTypes", null);
        setField(term12880, term12880.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12880, term12880.getClass(), "lastGeneration", true);
        setField(term12880, term12880.getClass(), "templateTypeName", "IDJUVPgUJf");
        setField(term12936, term12936.getClass(), "name", "JmnWRJUxGr");
        setField(term12936, term12936.getClass(), "referencedType", null);
        setField(term12936, term12936.getClass(), "referencedObjType", null);
        setBooleanField(term12936, term12936.getClass(), "visited", false);
        setField(term12936, term12936.getClass(), "docInfo", null);
        setBooleanField(term12936, term12936.getClass(), "unknown", false);
        setBooleanField(term12936, term12936.getClass(), "resolved", false);
        setField(term12936, term12936.getClass(), "resolveResult", null);
        setField(term12936, term12936.getClass(), "registry", null);
        setField(term12880, term12880.getClass(), "templateType", term12936);
        setBooleanField(term12880, term12880.getClass(), "tolerateUndefinedValues", false);
        setField(term12880, term12880.getClass(), "resolveMode", enum53);
        setField(term12867, term12867.getClass(), "typeRegistry", term12880);
        setIntField(term12967, term12967.getClass(), "type", 0);
        setField(term12967, term12967.getClass(), "next", null);
        setField(term12967, term12967.getClass(), "first", null);
        setField(term12967, term12967.getClass(), "last", null);
        setField(term12967, term12967.getClass(), "propListHead", null);
        setIntField(term12967, term12967.getClass(), "sourcePosition", 0);
        setField(term12967, term12967.getClass(), "jsType", null);
        setField(term12967, term12967.getClass(), "parent", null);
        setField(term12867, term12867.getClass(), "errorRoot", term12967);
        setField(term12867, term12867.getClass(), "sourceName", "wgRGBNrTGP");
        setField(term12982, term12982.getClass(), "vars", null);
        setField(term12982, term12982.getClass(), "parent", null);
        setField(term12982, term12982.getClass(), "rootNode", null);
        setField(term12982, term12982.getClass(), "thisType", null);
        setBooleanField(term12982, term12982.getClass(), "isBottom", false);
        setField(term12867, term12867.getClass(), "scope", term12982);
        setField(term12867, term12867.getClass(), "returnType", null);
        setBooleanField(term12867, term12867.getClass(), "returnTypeInferred", false);
        setField(term12867, term12867.getClass(), "implementedInterfaces", null);
        setField(term12867, term12867.getClass(), "baseType", null);
        setField(term12867, term12867.getClass(), "thisType", null);
        setBooleanField(term12867, term12867.getClass(), "isConstructor", false);
        setBooleanField(term12867, term12867.getClass(), "isInterface", false);
        setField(term12867, term12867.getClass(), "parametersNode", null);
        setField(term12867, term12867.getClass(), "sourceNode", null);
        setField(term12867, term12867.getClass(), "templateTypeName", null);
        HashMap term12990 = new HashMap();
        HashMap term12999 = new HashMap();
        Set<Object> term29550 =  ((Map) term12999).keySet();
        HashSet term12998 = new HashSet((Collection<? extends Object>) term29550);
        HashMap term13006 = new HashMap();
        Set<Object> term29551 =  ((Map) term13006).keySet();
        HashSet term13005 = new HashSet((Collection<? extends Object>) term29551);
        HashMap term13013 = new HashMap();
        Set<Object> term29552 =  ((Map) term13013).keySet();
        HashSet term13012 = new HashSet((Collection<? extends Object>) term29552);
        HashMap term13018 = new HashMap();
        HashMap term13023 = new HashMap();
        Class<? extends Object> term29574 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term29573 = ((Class) term29574).getDeclaredField((String) "PUBLIC");
        ((Field) term29573).setAccessible(true);
        Object enum54 = ((Field) term29573).get((Object) null);
        Class<? extends Object> term29839 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term29838 = ((Class) term29839).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term29838).setAccessible(true);
        Object enum55 = ((Field) term29838).get((Object) null);
        term12987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object term12988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12989 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term13044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term13058 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term13059 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term13060 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term13065 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13066 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12988, term12988.getClass(), "reporter", null);
        setField(term12988, term12988.getClass(), "nativeTypes", term12989);
        setField(term12988, term12988.getClass(), "namesToTypes", term12990);
        setField(term12988, term12988.getClass(), "namespaces", term12998);
        setField(term12988, term12988.getClass(), "nonNullableTypeNames", term13005);
        setField(term12988, term12988.getClass(), "forwardDeclaredTypes", term13012);
        setField(term12988, term12988.getClass(), "typesIndexedByProperty", term13018);
        setField(term12988, term12988.getClass(), "greatestSubtypeByProperty", term13023);
        setField(term12988, term12988.getClass(), "interfaceToImplementors", null);
        setField(term12988, term12988.getClass(), "unresolvedNamedTypes", null);
        setField(term12988, term12988.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12988, term12988.getClass(), "lastGeneration", true);
        setField(term12988, term12988.getClass(), "templateTypeName", "DPwIqlszZo");
        setField(term13044, term13044.getClass(), "name", "mNgDshwZNc");
        setField(term13044, term13044.getClass(), "referencedType", null);
        setField(term13044, term13044.getClass(), "referencedObjType", null);
        setBooleanField(term13044, term13044.getClass(), "visited", true);
        setField(term13059, term13059.getClass(), "baseType", null);
        setField(term13059, term13059.getClass(), "implementedInterfaces", null);
        setField(term13059, term13059.getClass(), "parameters", null);
        setField(term13059, term13059.getClass(), "thrownTypes", null);
        setField(term13059, term13059.getClass(), "templateTypeName", null);
        setField(term13059, term13059.getClass(), "description", null);
        setField(term13059, term13059.getClass(), "meaning", null);
        setField(term13059, term13059.getClass(), "deprecated", null);
        setField(term13059, term13059.getClass(), "license", null);
        setField(term13059, term13059.getClass(), "suppressions", null);
        setField(term13059, term13059.getClass(), "modifies", null);
        setField(term13059, term13059.getClass(), "lendsName", null);
        setField(term13058, term13058.getClass(), "info", term13059);
        setField(term13060, term13060.getClass(), "markers", null);
        setField(term13060, term13060.getClass(), "parameters", null);
        setField(term13060, term13060.getClass(), "throwsDescriptions", null);
        setField(term13060, term13060.getClass(), "blockDescription", null);
        setField(term13060, term13060.getClass(), "fileOverview", null);
        setField(term13060, term13060.getClass(), "returnDescription", null);
        setField(term13060, term13060.getClass(), "version", null);
        setField(term13060, term13060.getClass(), "authors", null);
        setField(term13060, term13060.getClass(), "sees", null);
        setField(term13058, term13058.getClass(), "documentation", term13060);
        setField(term13058, term13058.getClass(), "sourceName", "");
        setField(term13058, term13058.getClass(), "visibility", enum54);
        setIntField(term13058, term13058.getClass(), "bitset", 806595993);
        setField(term13065, term13065.getClass(), "root", null);
        setField(term13065, term13065.getClass(), "sourceName", null);
        setField(term13058, term13058.getClass(), "type", term13065);
        setField(term13066, term13066.getClass(), "root", null);
        setField(term13066, term13066.getClass(), "sourceName", null);
        setField(term13058, term13058.getClass(), "thisType", term13066);
        setBooleanField(term13058, term13058.getClass(), "includeDocumentation", true);
        setField(term13044, term13044.getClass(), "docInfo", term13058);
        setBooleanField(term13044, term13044.getClass(), "unknown", true);
        setBooleanField(term13044, term13044.getClass(), "resolved", false);
        setField(term13044, term13044.getClass(), "resolveResult", null);
        setField(term13044, term13044.getClass(), "registry", null);
        setField(term12988, term12988.getClass(), "templateType", term13044);
        setBooleanField(term12988, term12988.getClass(), "tolerateUndefinedValues", false);
        setField(term12988, term12988.getClass(), "resolveMode", enum55);
        setField(term12987, term12987.getClass(), "registry", term12988);
        setIntField(term13091, term13091.getClass(), "type", 0);
        setField(term13091, term13091.getClass(), "next", null);
        setField(term13091, term13091.getClass(), "first", null);
        setField(term13091, term13091.getClass(), "last", null);
        setField(term13091, term13091.getClass(), "propListHead", null);
        setIntField(term13091, term13091.getClass(), "sourcePosition", 0);
        setField(term13091, term13091.getClass(), "jsType", null);
        setField(term13091, term13091.getClass(), "parent", null);
        setField(term12987, term12987.getClass(), "root", term13091);
        term13094 = new Boolean(false);
        term13096 = new Boolean(true);
        term13098 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term12987;
        args[1] = null;
        args[2] = term13094;
        args[3] = term13096;
        args[4] = term13098;
        try {
            callMethod(klass, "addParameter", argTypes, term12867, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


