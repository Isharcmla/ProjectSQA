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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_resetImplicitPrototype_1844481216153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12082;
     Object term506766;

    public JSTypeRegistry_resetImplicitPrototype_1844481216153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12084 = new HashMap();
        HashMap term12094 = new HashMap();
        Set<Object> term506779 =  ((Map) term12094).keySet();
        HashSet term12093 = new HashSet((Collection<? extends Object>) term506779);
        HashMap term12113 = new HashMap();
        Set<Object> term506780 =  ((Map) term12113).keySet();
        HashSet term12112 = new HashSet((Collection<? extends Object>) term506780);
        HashMap term12122 = new HashMap();
        Set<Object> term506781 =  ((Map) term12122).keySet();
        HashSet term12121 = new HashSet((Collection<? extends Object>) term506781);
        HashMap term12134 = new HashMap();
        HashMap term12149 = new HashMap();
        HashMap term12154 = new HashMap();
        term12082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12083 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term12082, term12082.getClass(), "reporter", null);
        setField(term12082, term12082.getClass(), "nativeTypes", term12083);
        setField(term12082, term12082.getClass(), "namesToTypes", term12084);
        setField(term12082, term12082.getClass(), "namespaces", term12093);
        setField(term12082, term12082.getClass(), "nonNullableTypeNames", term12112);
        setField(term12082, term12082.getClass(), "forwardDeclaredTypes", term12121);
        setField(term12082, term12082.getClass(), "typesIndexedByProperty", term12134);
        setField(term12082, term12082.getClass(), "eachRefTypeIndexedByProperty", term12149);
        setField(term12082, term12082.getClass(), "greatestSubtypeByProperty", term12154);
        setField(term12082, term12082.getClass(), "interfaceToImplementors", null);
        setField(term12082, term12082.getClass(), "unresolvedNamedTypes", null);
        setField(term12082, term12082.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12082, term12082.getClass(), "lastGeneration", false);
        setField(term12082, term12082.getClass(), "templateTypeName", null);
        setField(term12082, term12082.getClass(), "templateType", null);
        setBooleanField(term12082, term12082.getClass(), "tolerateUndefinedValues", false);
        setField(term12082, term12082.getClass(), "resolveMode", null);
        HashMap term506768 = new HashMap();
        HashMap term506770 = new HashMap();
        Set<Object> term506782 =  ((Map) term506770).keySet();
        HashSet term506769 = new HashSet((Collection<? extends Object>) term506782);
        HashMap term506772 = new HashMap();
        Set<Object> term506783 =  ((Map) term506772).keySet();
        HashSet term506771 = new HashSet((Collection<? extends Object>) term506783);
        HashMap term506774 = new HashMap();
        Set<Object> term506784 =  ((Map) term506774).keySet();
        HashSet term506773 = new HashSet((Collection<? extends Object>) term506784);
        HashMap term506775 = new HashMap();
        HashMap term506776 = new HashMap();
        HashMap term506777 = new HashMap();
        term506766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term506767 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term506766, term506766.getClass(), "reporter", null);
        setField(term506766, term506766.getClass(), "nativeTypes", term506767);
        setField(term506766, term506766.getClass(), "namesToTypes", term506768);
        setField(term506766, term506766.getClass(), "namespaces", term506769);
        setField(term506766, term506766.getClass(), "nonNullableTypeNames", term506771);
        setField(term506766, term506766.getClass(), "forwardDeclaredTypes", term506773);
        setField(term506766, term506766.getClass(), "typesIndexedByProperty", term506775);
        setField(term506766, term506766.getClass(), "eachRefTypeIndexedByProperty", term506776);
        setField(term506766, term506766.getClass(), "greatestSubtypeByProperty", term506777);
        setField(term506766, term506766.getClass(), "interfaceToImplementors", null);
        setField(term506766, term506766.getClass(), "unresolvedNamedTypes", null);
        setField(term506766, term506766.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term506766, term506766.getClass(), "lastGeneration", false);
        setField(term506766, term506766.getClass(), "templateTypeName", null);
        setField(term506766, term506766.getClass(), "templateType", null);
        setBooleanField(term506766, term506766.getClass(), "tolerateUndefinedValues", false);
        setField(term506766, term506766.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "resetImplicitPrototype", argTypes, term12082, args);
        assertTrue(recursiveEquals(term12082, term506766));
        assertTrue(recursiveEquals(retValue, false));
    }

};


