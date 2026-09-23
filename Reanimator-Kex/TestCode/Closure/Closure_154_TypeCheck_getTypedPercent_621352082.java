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

public class TypeCheck_getTypedPercent_621352082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10160;
     Object term23647;

    public TypeCheck_getTypedPercent_621352082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10164 = new HashMap();
        HashMap term10171 = new HashMap();
        Set<Object> term23661 =  ((Map) term10171).keySet();
        HashSet term10170 = new HashSet((Collection<? extends Object>) term23661);
        HashMap term10177 = new HashMap();
        Set<Object> term23662 =  ((Map) term10177).keySet();
        HashSet term10176 = new HashSet((Collection<? extends Object>) term23662);
        HashMap term10183 = new HashMap();
        Set<Object> term23663 =  ((Map) term10183).keySet();
        HashSet term10182 = new HashSet((Collection<? extends Object>) term23663);
        HashMap term10188 = new HashMap();
        HashMap term10194 = new HashMap();
        HashMap term10199 = new HashMap();
        term10160 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term10161 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term10162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10163 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term10160, term10160.getClass(), "compiler", null);
        setField(term10161, term10161.getClass(), "compiler", null);
        setField(term10162, term10162.getClass(), "reporter", null);
        setField(term10162, term10162.getClass(), "nativeTypes", term10163);
        setField(term10162, term10162.getClass(), "namesToTypes", term10164);
        setField(term10162, term10162.getClass(), "namespaces", term10170);
        setField(term10162, term10162.getClass(), "nonNullableTypeNames", term10176);
        setField(term10162, term10162.getClass(), "forwardDeclaredTypes", term10182);
        setField(term10162, term10162.getClass(), "typesIndexedByProperty", term10188);
        setField(term10162, term10162.getClass(), "eachRefTypeIndexedByProperty", term10194);
        setField(term10162, term10162.getClass(), "greatestSubtypeByProperty", term10199);
        setField(term10162, term10162.getClass(), "interfaceToImplementors", null);
        setField(term10162, term10162.getClass(), "unresolvedNamedTypes", null);
        setField(term10162, term10162.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10162, term10162.getClass(), "lastGeneration", false);
        setField(term10162, term10162.getClass(), "templateTypeName", null);
        setField(term10162, term10162.getClass(), "templateType", null);
        setBooleanField(term10162, term10162.getClass(), "tolerateUndefinedValues", false);
        setField(term10162, term10162.getClass(), "resolveMode", null);
        setField(term10161, term10161.getClass(), "typeRegistry", term10162);
        setField(term10161, term10161.getClass(), "allValueTypes", null);
        setBooleanField(term10161, term10161.getClass(), "shouldReport", false);
        setField(term10161, term10161.getClass(), "nullOrUndefined", null);
        setField(term10161, term10161.getClass(), "mismatches", null);
        setField(term10160, term10160.getClass(), "validator", term10161);
        setField(term10160, term10160.getClass(), "reverseInterpreter", null);
        setField(term10160, term10160.getClass(), "typeRegistry", null);
        setField(term10160, term10160.getClass(), "topScope", null);
        setField(term10160, term10160.getClass(), "scopeCreator", null);
        setField(term10160, term10160.getClass(), "reportMissingOverride", null);
        setField(term10160, term10160.getClass(), "reportUnknownTypes", null);
        setBooleanField(term10160, term10160.getClass(), "reportMissingProperties", false);
        setField(term10160, term10160.getClass(), "inferJSDocInfo", null);
        setIntField(term10160, term10160.getClass(), "typedCount", 0);
        setIntField(term10160, term10160.getClass(), "nullCount", 0);
        setIntField(term10160, term10160.getClass(), "unknownCount", 0);
        setBooleanField(term10160, term10160.getClass(), "inExterns", false);
        setIntField(term10160, term10160.getClass(), "noTypeCheckSection", 0);
        HashMap term23651 = new HashMap();
        HashMap term23653 = new HashMap();
        Set<Object> term23664 =  ((Map) term23653).keySet();
        HashSet term23652 = new HashSet((Collection<? extends Object>) term23664);
        HashMap term23655 = new HashMap();
        Set<Object> term23665 =  ((Map) term23655).keySet();
        HashSet term23654 = new HashSet((Collection<? extends Object>) term23665);
        HashMap term23657 = new HashMap();
        Set<Object> term23666 =  ((Map) term23657).keySet();
        HashSet term23656 = new HashSet((Collection<? extends Object>) term23666);
        HashMap term23658 = new HashMap();
        HashMap term23659 = new HashMap();
        HashMap term23660 = new HashMap();
        term23647 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term23648 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term23649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term23650 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term23647, term23647.getClass(), "compiler", null);
        setField(term23648, term23648.getClass(), "compiler", null);
        setField(term23649, term23649.getClass(), "reporter", null);
        setField(term23649, term23649.getClass(), "nativeTypes", term23650);
        setField(term23649, term23649.getClass(), "namesToTypes", term23651);
        setField(term23649, term23649.getClass(), "namespaces", term23652);
        setField(term23649, term23649.getClass(), "nonNullableTypeNames", term23654);
        setField(term23649, term23649.getClass(), "forwardDeclaredTypes", term23656);
        setField(term23649, term23649.getClass(), "typesIndexedByProperty", term23658);
        setField(term23649, term23649.getClass(), "eachRefTypeIndexedByProperty", term23659);
        setField(term23649, term23649.getClass(), "greatestSubtypeByProperty", term23660);
        setField(term23649, term23649.getClass(), "interfaceToImplementors", null);
        setField(term23649, term23649.getClass(), "unresolvedNamedTypes", null);
        setField(term23649, term23649.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term23649, term23649.getClass(), "lastGeneration", false);
        setField(term23649, term23649.getClass(), "templateTypeName", null);
        setField(term23649, term23649.getClass(), "templateType", null);
        setBooleanField(term23649, term23649.getClass(), "tolerateUndefinedValues", false);
        setField(term23649, term23649.getClass(), "resolveMode", null);
        setField(term23648, term23648.getClass(), "typeRegistry", term23649);
        setField(term23648, term23648.getClass(), "allValueTypes", null);
        setBooleanField(term23648, term23648.getClass(), "shouldReport", false);
        setField(term23648, term23648.getClass(), "nullOrUndefined", null);
        setField(term23648, term23648.getClass(), "mismatches", null);
        setField(term23647, term23647.getClass(), "validator", term23648);
        setField(term23647, term23647.getClass(), "reverseInterpreter", null);
        setField(term23647, term23647.getClass(), "typeRegistry", null);
        setField(term23647, term23647.getClass(), "topScope", null);
        setField(term23647, term23647.getClass(), "scopeCreator", null);
        setField(term23647, term23647.getClass(), "reportMissingOverride", null);
        setField(term23647, term23647.getClass(), "reportUnknownTypes", null);
        setBooleanField(term23647, term23647.getClass(), "reportMissingProperties", false);
        setField(term23647, term23647.getClass(), "inferJSDocInfo", null);
        setIntField(term23647, term23647.getClass(), "typedCount", 0);
        setIntField(term23647, term23647.getClass(), "nullCount", 0);
        setIntField(term23647, term23647.getClass(), "unknownCount", 0);
        setBooleanField(term23647, term23647.getClass(), "inExterns", false);
        setIntField(term23647, term23647.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypedPercent", argTypes, term10160, args);
        assertTrue(recursiveEquals(term10160, term23647));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


