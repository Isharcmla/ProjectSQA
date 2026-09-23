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

public class TypedScopeCreator_getNativeType_204163761219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4742;
     Object enum22;

    public TypedScopeCreator_getNativeType_204163761219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4746 = new HashMap();
        HashMap term4753 = new HashMap();
        Set<Object> term13179 =  ((Map) term4753).keySet();
        HashSet term4752 = new HashSet((Collection<? extends Object>) term13179);
        HashMap term4759 = new HashMap();
        Set<Object> term13180 =  ((Map) term4759).keySet();
        HashSet term4758 = new HashSet((Collection<? extends Object>) term13180);
        HashMap term4765 = new HashMap();
        Set<Object> term13181 =  ((Map) term4765).keySet();
        HashSet term4764 = new HashSet((Collection<? extends Object>) term13181);
        HashMap term4770 = new HashMap();
        HashMap term4775 = new HashMap();
        Class<? extends Object> term13193 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term13192 = ((Class) term13193).getDeclaredField((String) "IMMEDIATE");
        ((Field) term13192).setAccessible(true);
        Object enum21 = ((Field) term13192).get((Object) null);
        Object term4805 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term4805, term4805.getClass(), "typeA", null);
        setField(term4805, term4805.getClass(), "typeB", null);
        Object term4806 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term4806, term4806.getClass(), "typeA", null);
        setField(term4806, term4806.getClass(), "typeB", null);
        ArrayList term4803 = new ArrayList();
        ((ArrayList) term4803).add(term4805);
        ((ArrayList) term4803).add(term4806);
        ArrayList term4812 = new ArrayList();
        ((ArrayList) term4812).add((Object)null);
        ((ArrayList) term4812).add((Object)null);
        ((ArrayList) term4812).add((Object)null);
        ((ArrayList) term4812).add((Object)null);
        ((ArrayList) term4812).add((Object)null);
        ((ArrayList) term4812).add((Object)null);
        ((ArrayList) term4812).add((Object)null);
        ((ArrayList) term4812).add((Object)null);
        term4742 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term4743 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term4744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4745 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term4794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term4742, term4742.getClass(), "compiler", null);
        setField(term4742, term4742.getClass(), "typeParsingErrorReporter", null);
        setField(term4743, term4743.getClass(), "compiler", null);
        setField(term4744, term4744.getClass(), "reporter", null);
        setField(term4744, term4744.getClass(), "nativeTypes", term4745);
        setField(term4744, term4744.getClass(), "namesToTypes", term4746);
        setField(term4744, term4744.getClass(), "namespaces", term4752);
        setField(term4744, term4744.getClass(), "enumTypeNames", term4758);
        setField(term4744, term4744.getClass(), "forwardDeclaredTypes", term4764);
        setField(term4744, term4744.getClass(), "typesIndexedByProperty", term4770);
        setField(term4744, term4744.getClass(), "greatestSubtypeByProperty", term4775);
        setField(term4744, term4744.getClass(), "interfaceToImplementors", null);
        setField(term4744, term4744.getClass(), "unresolvedNamedTypes", null);
        setField(term4744, term4744.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4744, term4744.getClass(), "lastGeneration", false);
        setField(term4744, term4744.getClass(), "templateTypeName", "iNwOJRBEjp");
        setField(term4794, term4794.getClass(), "name", null);
        setField(term4794, term4794.getClass(), "referencedType", null);
        setBooleanField(term4794, term4794.getClass(), "visited", false);
        setField(term4794, term4794.getClass(), "docInfo", null);
        setBooleanField(term4794, term4794.getClass(), "unknown", false);
        setBooleanField(term4794, term4794.getClass(), "resolved", false);
        setField(term4794, term4794.getClass(), "resolveResult", null);
        setField(term4794, term4794.getClass(), "registry", null);
        setField(term4744, term4744.getClass(), "templateType", term4794);
        setBooleanField(term4744, term4744.getClass(), "tolerateUndefinedValues", false);
        setField(term4744, term4744.getClass(), "resolveMode", enum21);
        setField(term4743, term4743.getClass(), "typeRegistry", term4744);
        setField(term4743, term4743.getClass(), "allValueTypes", null);
        setBooleanField(term4743, term4743.getClass(), "shouldReport", true);
        setField(term4743, term4743.getClass(), "mismatches", term4803);
        setField(term4742, term4742.getClass(), "validator", term4743);
        setField(term4742, term4742.getClass(), "codingConvention", null);
        setField(term4809, term4809.getClass(), "reporter", null);
        setField(term4809, term4809.getClass(), "nativeTypes", null);
        setField(term4809, term4809.getClass(), "namesToTypes", null);
        setField(term4809, term4809.getClass(), "namespaces", null);
        setField(term4809, term4809.getClass(), "enumTypeNames", null);
        setField(term4809, term4809.getClass(), "forwardDeclaredTypes", null);
        setField(term4809, term4809.getClass(), "typesIndexedByProperty", null);
        setField(term4809, term4809.getClass(), "greatestSubtypeByProperty", null);
        setField(term4809, term4809.getClass(), "interfaceToImplementors", null);
        setField(term4809, term4809.getClass(), "unresolvedNamedTypes", null);
        setField(term4809, term4809.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4809, term4809.getClass(), "lastGeneration", false);
        setField(term4809, term4809.getClass(), "templateTypeName", null);
        setField(term4809, term4809.getClass(), "templateType", null);
        setBooleanField(term4809, term4809.getClass(), "tolerateUndefinedValues", false);
        setField(term4809, term4809.getClass(), "resolveMode", null);
        setField(term4742, term4742.getClass(), "typeRegistry", term4809);
        setField(term4742, term4742.getClass(), "delegateProxyPrototypes", term4812);
        Class<? extends Object> term13532 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term13531 = ((Class) term13532).getDeclaredField((String) "NUMBER_STRING_BOOLEAN");
        ((Field) term13531).setAccessible(true);
        enum22 = ((Field) term13531).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum22;
        try {
            callMethod(klass, "getNativeType", argTypes, term4742, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


