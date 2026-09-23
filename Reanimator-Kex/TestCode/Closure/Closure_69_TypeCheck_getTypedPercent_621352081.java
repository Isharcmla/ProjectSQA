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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeCheck_getTypedPercent_621352081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10509;
     Object term25213;

    public TypeCheck_getTypedPercent_621352081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10513 = new HashMap();
        HashMap term10520 = new HashMap();
        Set<Object> term25227 =  ((Map) term10520).keySet();
        HashSet term10519 = new HashSet((Collection<? extends Object>) term25227);
        HashMap term10526 = new HashMap();
        Set<Object> term25228 =  ((Map) term10526).keySet();
        HashSet term10525 = new HashSet((Collection<? extends Object>) term25228);
        HashMap term10532 = new HashMap();
        Set<Object> term25229 =  ((Map) term10532).keySet();
        HashSet term10531 = new HashSet((Collection<? extends Object>) term25229);
        HashMap term10537 = new HashMap();
        HashMap term10543 = new HashMap();
        HashMap term10548 = new HashMap();
        term10509 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term10510 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term10511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10512 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term10509, term10509.getClass(), "compiler", null);
        setField(term10510, term10510.getClass(), "compiler", null);
        setField(term10511, term10511.getClass(), "reporter", null);
        setField(term10511, term10511.getClass(), "nativeTypes", term10512);
        setField(term10511, term10511.getClass(), "namesToTypes", term10513);
        setField(term10511, term10511.getClass(), "namespaces", term10519);
        setField(term10511, term10511.getClass(), "nonNullableTypeNames", term10525);
        setField(term10511, term10511.getClass(), "forwardDeclaredTypes", term10531);
        setField(term10511, term10511.getClass(), "typesIndexedByProperty", term10537);
        setField(term10511, term10511.getClass(), "eachRefTypeIndexedByProperty", term10543);
        setField(term10511, term10511.getClass(), "greatestSubtypeByProperty", term10548);
        setField(term10511, term10511.getClass(), "interfaceToImplementors", null);
        setField(term10511, term10511.getClass(), "unresolvedNamedTypes", null);
        setField(term10511, term10511.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10511, term10511.getClass(), "lastGeneration", false);
        setField(term10511, term10511.getClass(), "templateTypeName", null);
        setField(term10511, term10511.getClass(), "templateType", null);
        setBooleanField(term10511, term10511.getClass(), "tolerateUndefinedValues", false);
        setField(term10511, term10511.getClass(), "resolveMode", null);
        setField(term10510, term10510.getClass(), "typeRegistry", term10511);
        setField(term10510, term10510.getClass(), "allValueTypes", null);
        setBooleanField(term10510, term10510.getClass(), "shouldReport", false);
        setField(term10510, term10510.getClass(), "nullOrUndefined", null);
        setField(term10510, term10510.getClass(), "mismatches", null);
        setField(term10509, term10509.getClass(), "validator", term10510);
        setField(term10509, term10509.getClass(), "reverseInterpreter", null);
        setField(term10509, term10509.getClass(), "typeRegistry", null);
        setField(term10509, term10509.getClass(), "topScope", null);
        setField(term10509, term10509.getClass(), "scopeCreator", null);
        setField(term10509, term10509.getClass(), "reportMissingOverride", null);
        setField(term10509, term10509.getClass(), "reportUnknownTypes", null);
        setBooleanField(term10509, term10509.getClass(), "reportMissingProperties", false);
        setField(term10509, term10509.getClass(), "inferJSDocInfo", null);
        setIntField(term10509, term10509.getClass(), "typedCount", 0);
        setIntField(term10509, term10509.getClass(), "nullCount", 0);
        setIntField(term10509, term10509.getClass(), "unknownCount", 0);
        setBooleanField(term10509, term10509.getClass(), "inExterns", false);
        setIntField(term10509, term10509.getClass(), "noTypeCheckSection", 0);
        HashMap term25217 = new HashMap();
        HashMap term25219 = new HashMap();
        Set<Object> term25230 =  ((Map) term25219).keySet();
        HashSet term25218 = new HashSet((Collection<? extends Object>) term25230);
        HashMap term25221 = new HashMap();
        Set<Object> term25231 =  ((Map) term25221).keySet();
        HashSet term25220 = new HashSet((Collection<? extends Object>) term25231);
        HashMap term25223 = new HashMap();
        Set<Object> term25232 =  ((Map) term25223).keySet();
        HashSet term25222 = new HashSet((Collection<? extends Object>) term25232);
        HashMap term25224 = new HashMap();
        HashMap term25225 = new HashMap();
        HashMap term25226 = new HashMap();
        term25213 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term25214 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term25215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term25216 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term25213, term25213.getClass(), "compiler", null);
        setField(term25214, term25214.getClass(), "compiler", null);
        setField(term25215, term25215.getClass(), "reporter", null);
        setField(term25215, term25215.getClass(), "nativeTypes", term25216);
        setField(term25215, term25215.getClass(), "namesToTypes", term25217);
        setField(term25215, term25215.getClass(), "namespaces", term25218);
        setField(term25215, term25215.getClass(), "nonNullableTypeNames", term25220);
        setField(term25215, term25215.getClass(), "forwardDeclaredTypes", term25222);
        setField(term25215, term25215.getClass(), "typesIndexedByProperty", term25224);
        setField(term25215, term25215.getClass(), "eachRefTypeIndexedByProperty", term25225);
        setField(term25215, term25215.getClass(), "greatestSubtypeByProperty", term25226);
        setField(term25215, term25215.getClass(), "interfaceToImplementors", null);
        setField(term25215, term25215.getClass(), "unresolvedNamedTypes", null);
        setField(term25215, term25215.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25215, term25215.getClass(), "lastGeneration", false);
        setField(term25215, term25215.getClass(), "templateTypeName", null);
        setField(term25215, term25215.getClass(), "templateType", null);
        setBooleanField(term25215, term25215.getClass(), "tolerateUndefinedValues", false);
        setField(term25215, term25215.getClass(), "resolveMode", null);
        setField(term25214, term25214.getClass(), "typeRegistry", term25215);
        setField(term25214, term25214.getClass(), "allValueTypes", null);
        setBooleanField(term25214, term25214.getClass(), "shouldReport", false);
        setField(term25214, term25214.getClass(), "nullOrUndefined", null);
        setField(term25214, term25214.getClass(), "mismatches", null);
        setField(term25213, term25213.getClass(), "validator", term25214);
        setField(term25213, term25213.getClass(), "reverseInterpreter", null);
        setField(term25213, term25213.getClass(), "typeRegistry", null);
        setField(term25213, term25213.getClass(), "topScope", null);
        setField(term25213, term25213.getClass(), "scopeCreator", null);
        setField(term25213, term25213.getClass(), "reportMissingOverride", null);
        setField(term25213, term25213.getClass(), "reportUnknownTypes", null);
        setBooleanField(term25213, term25213.getClass(), "reportMissingProperties", false);
        setField(term25213, term25213.getClass(), "inferJSDocInfo", null);
        setIntField(term25213, term25213.getClass(), "typedCount", 0);
        setIntField(term25213, term25213.getClass(), "nullCount", 0);
        setIntField(term25213, term25213.getClass(), "unknownCount", 0);
        setBooleanField(term25213, term25213.getClass(), "inExterns", false);
        setIntField(term25213, term25213.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypedPercent", argTypes, term10509, args);
        assertTrue(recursiveEquals(term10509, term25213));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


