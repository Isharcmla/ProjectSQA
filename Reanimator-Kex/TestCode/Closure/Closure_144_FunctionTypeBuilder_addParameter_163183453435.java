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

public class FunctionTypeBuilder_addParameter_163183453435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11831;
     Object term11960;
     Object term12061;
     Object term12063;
     Object term12065;

    public FunctionTypeBuilder_addParameter_163183453435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11846 = new HashMap();
        HashMap term11855 = new HashMap();
        Set<Object> term31284 =  ((Map) term11855).keySet();
        HashSet term11854 = new HashSet((Collection<? extends Object>) term31284);
        HashMap term11862 = new HashMap();
        Set<Object> term31285 =  ((Map) term11862).keySet();
        HashSet term11861 = new HashSet((Collection<? extends Object>) term31285);
        HashMap term11869 = new HashMap();
        Set<Object> term31286 =  ((Map) term11869).keySet();
        HashSet term11868 = new HashSet((Collection<? extends Object>) term31286);
        HashMap term11875 = new HashMap();
        HashMap term11880 = new HashMap();
        Class<? extends Object> term31308 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term31307 = ((Class) term31308).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term31307).setAccessible(true);
        Object enum59 = ((Field) term31307).get((Object) null);
        term11831 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term11844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11845 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term11901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term11915 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11956 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term11831, term11831.getClass(), "fnName", "PbLgCSAHce");
        setField(term11831, term11831.getClass(), "compiler", null);
        setField(term11831, term11831.getClass(), "codingConvention", null);
        setField(term11844, term11844.getClass(), "reporter", null);
        setField(term11844, term11844.getClass(), "nativeTypes", term11845);
        setField(term11844, term11844.getClass(), "namesToTypes", term11846);
        setField(term11844, term11844.getClass(), "namespaces", term11854);
        setField(term11844, term11844.getClass(), "enumTypeNames", term11861);
        setField(term11844, term11844.getClass(), "forwardDeclaredTypes", term11868);
        setField(term11844, term11844.getClass(), "typesIndexedByProperty", term11875);
        setField(term11844, term11844.getClass(), "greatestSubtypeByProperty", term11880);
        setField(term11844, term11844.getClass(), "interfaceToImplementors", null);
        setField(term11844, term11844.getClass(), "unresolvedNamedTypes", null);
        setField(term11844, term11844.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11844, term11844.getClass(), "lastGeneration", false);
        setField(term11844, term11844.getClass(), "templateTypeName", "MlzTkzKMCX");
        setField(term11901, term11901.getClass(), "name", "UqKUbMyPMJ");
        setField(term11901, term11901.getClass(), "referencedType", null);
        setBooleanField(term11901, term11901.getClass(), "visited", false);
        setField(term11915, term11915.getClass(), "info", null);
        setField(term11915, term11915.getClass(), "documentation", null);
        setField(term11915, term11915.getClass(), "sourceName", null);
        setField(term11915, term11915.getClass(), "visibility", null);
        setIntField(term11915, term11915.getClass(), "bitset", 0);
        setField(term11915, term11915.getClass(), "type", null);
        setField(term11915, term11915.getClass(), "thisType", null);
        setBooleanField(term11915, term11915.getClass(), "includeDocumentation", false);
        setField(term11901, term11901.getClass(), "docInfo", term11915);
        setBooleanField(term11901, term11901.getClass(), "unknown", true);
        setBooleanField(term11901, term11901.getClass(), "resolved", true);
        setField(term11901, term11901.getClass(), "resolveResult", null);
        setField(term11901, term11901.getClass(), "registry", null);
        setField(term11844, term11844.getClass(), "templateType", term11901);
        setBooleanField(term11844, term11844.getClass(), "tolerateUndefinedValues", true);
        setField(term11844, term11844.getClass(), "resolveMode", enum59);
        setField(term11831, term11831.getClass(), "typeRegistry", term11844);
        setIntField(term11941, term11941.getClass(), "type", 0);
        setField(term11941, term11941.getClass(), "next", null);
        setField(term11941, term11941.getClass(), "first", null);
        setField(term11941, term11941.getClass(), "last", null);
        setField(term11941, term11941.getClass(), "propListHead", null);
        setIntField(term11941, term11941.getClass(), "sourcePosition", 0);
        setField(term11941, term11941.getClass(), "jsType", null);
        setField(term11941, term11941.getClass(), "parent", null);
        setField(term11831, term11831.getClass(), "errorRoot", term11941);
        setField(term11831, term11831.getClass(), "sourceName", "QpYltHAdyY");
        setField(term11956, term11956.getClass(), "vars", null);
        setField(term11956, term11956.getClass(), "parent", null);
        setField(term11956, term11956.getClass(), "rootNode", null);
        setField(term11956, term11956.getClass(), "thisType", null);
        setBooleanField(term11956, term11956.getClass(), "isBottom", false);
        setField(term11831, term11831.getClass(), "scope", term11956);
        setField(term11831, term11831.getClass(), "returnType", null);
        setField(term11831, term11831.getClass(), "implementedInterfaces", null);
        setField(term11831, term11831.getClass(), "baseType", null);
        setField(term11831, term11831.getClass(), "thisType", null);
        setBooleanField(term11831, term11831.getClass(), "isConstructor", false);
        setBooleanField(term11831, term11831.getClass(), "isInterface", false);
        setField(term11831, term11831.getClass(), "parametersNode", null);
        setField(term11831, term11831.getClass(), "sourceNode", null);
        setField(term11831, term11831.getClass(), "templateTypeName", null);
        HashMap term11963 = new HashMap();
        HashMap term11972 = new HashMap();
        Set<Object> term31677 =  ((Map) term11972).keySet();
        HashSet term11971 = new HashSet((Collection<? extends Object>) term31677);
        HashMap term11979 = new HashMap();
        Set<Object> term31678 =  ((Map) term11979).keySet();
        HashSet term11978 = new HashSet((Collection<? extends Object>) term31678);
        HashMap term11986 = new HashMap();
        Set<Object> term31679 =  ((Map) term11986).keySet();
        HashSet term11985 = new HashSet((Collection<? extends Object>) term31679);
        HashMap term11991 = new HashMap();
        HashMap term11996 = new HashMap();
        Class<? extends Object> term31701 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term31700 = ((Class) term31701).getDeclaredField((String) "PUBLIC");
        ((Field) term31700).setAccessible(true);
        Object enum60 = ((Field) term31700).get((Object) null);
        Class<? extends Object> term31966 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term31965 = ((Class) term31966).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term31965).setAccessible(true);
        Object enum61 = ((Field) term31965).get((Object) null);
        term11960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object term11961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11962 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term12017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12031 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12032 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12033 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12038 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12039 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11961, term11961.getClass(), "reporter", null);
        setField(term11961, term11961.getClass(), "nativeTypes", term11962);
        setField(term11961, term11961.getClass(), "namesToTypes", term11963);
        setField(term11961, term11961.getClass(), "namespaces", term11971);
        setField(term11961, term11961.getClass(), "enumTypeNames", term11978);
        setField(term11961, term11961.getClass(), "forwardDeclaredTypes", term11985);
        setField(term11961, term11961.getClass(), "typesIndexedByProperty", term11991);
        setField(term11961, term11961.getClass(), "greatestSubtypeByProperty", term11996);
        setField(term11961, term11961.getClass(), "interfaceToImplementors", null);
        setField(term11961, term11961.getClass(), "unresolvedNamedTypes", null);
        setField(term11961, term11961.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11961, term11961.getClass(), "lastGeneration", false);
        setField(term11961, term11961.getClass(), "templateTypeName", "WaEcyVlcIx");
        setField(term12017, term12017.getClass(), "name", "ONcbPCQnHd");
        setField(term12017, term12017.getClass(), "referencedType", null);
        setBooleanField(term12017, term12017.getClass(), "visited", false);
        setField(term12032, term12032.getClass(), "baseType", null);
        setField(term12032, term12032.getClass(), "implementedInterfaces", null);
        setField(term12032, term12032.getClass(), "parameters", null);
        setField(term12032, term12032.getClass(), "thrownTypes", null);
        setField(term12032, term12032.getClass(), "templateTypeName", null);
        setField(term12032, term12032.getClass(), "description", null);
        setField(term12032, term12032.getClass(), "deprecated", null);
        setField(term12032, term12032.getClass(), "license", null);
        setField(term12032, term12032.getClass(), "suppressions", null);
        setField(term12031, term12031.getClass(), "info", term12032);
        setField(term12033, term12033.getClass(), "markers", null);
        setField(term12033, term12033.getClass(), "parameters", null);
        setField(term12033, term12033.getClass(), "throwsDescriptions", null);
        setField(term12033, term12033.getClass(), "blockDescription", null);
        setField(term12033, term12033.getClass(), "fileOverview", null);
        setField(term12033, term12033.getClass(), "returnDescription", null);
        setField(term12033, term12033.getClass(), "version", null);
        setField(term12033, term12033.getClass(), "authors", null);
        setField(term12033, term12033.getClass(), "sees", null);
        setField(term12031, term12031.getClass(), "documentation", term12033);
        setField(term12031, term12031.getClass(), "sourceName", "");
        setField(term12031, term12031.getClass(), "visibility", enum60);
        setIntField(term12031, term12031.getClass(), "bitset", -1945706126);
        setField(term12038, term12038.getClass(), "root", null);
        setField(term12038, term12038.getClass(), "sourceName", null);
        setField(term12031, term12031.getClass(), "type", term12038);
        setField(term12039, term12039.getClass(), "root", null);
        setField(term12039, term12039.getClass(), "sourceName", null);
        setField(term12031, term12031.getClass(), "thisType", term12039);
        setBooleanField(term12031, term12031.getClass(), "includeDocumentation", false);
        setField(term12017, term12017.getClass(), "docInfo", term12031);
        setBooleanField(term12017, term12017.getClass(), "unknown", false);
        setBooleanField(term12017, term12017.getClass(), "resolved", false);
        setField(term12017, term12017.getClass(), "resolveResult", null);
        setField(term12017, term12017.getClass(), "registry", null);
        setField(term11961, term11961.getClass(), "templateType", term12017);
        setBooleanField(term11961, term11961.getClass(), "tolerateUndefinedValues", false);
        setField(term11961, term11961.getClass(), "resolveMode", enum61);
        setField(term11960, term11960.getClass(), "registry", term11961);
        setIntField(term12058, term12058.getClass(), "type", 0);
        setField(term12058, term12058.getClass(), "next", null);
        setField(term12058, term12058.getClass(), "first", null);
        setField(term12058, term12058.getClass(), "last", null);
        setField(term12058, term12058.getClass(), "propListHead", null);
        setIntField(term12058, term12058.getClass(), "sourcePosition", 0);
        setField(term12058, term12058.getClass(), "jsType", null);
        setField(term12058, term12058.getClass(), "parent", null);
        setField(term11960, term11960.getClass(), "root", term12058);
        term12061 = new Boolean(false);
        term12063 = new Boolean(true);
        term12065 = new Boolean(false);
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
        args[0] = term11960;
        args[1] = null;
        args[2] = term12061;
        args[3] = term12063;
        args[4] = term12065;
        try {
            callMethod(klass, "addParameter", argTypes, term11831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


