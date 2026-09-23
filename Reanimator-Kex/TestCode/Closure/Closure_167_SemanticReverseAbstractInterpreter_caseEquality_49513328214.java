package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SemanticReverseAbstractInterpreter_caseEquality_49513328214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term228;

    public SemanticReverseAbstractInterpreter_caseEquality_49513328214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term176 = new HashMap();
        HashMap term185 = new HashMap();
        Set<Object> term2076 =  ((Map) term185).keySet();
        HashSet term184 = new HashSet((Collection<? extends Object>) term2076);
        HashMap term192 = new HashMap();
        Set<Object> term2077 =  ((Map) term192).keySet();
        HashSet term191 = new HashSet((Collection<? extends Object>) term2077);
        HashMap term199 = new HashMap();
        Set<Object> term2078 =  ((Map) term199).keySet();
        HashSet term198 = new HashSet((Collection<? extends Object>) term2078);
        HashMap term205 = new HashMap();
        HashMap term213 = new HashMap();
        HashMap term218 = new HashMap();
        term173 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term175 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term173, term173.getClass(), "INEQ", null);
        setField(term173, term173.getClass(), "convention", null);
        setField(term174, term174.getClass(), "reporter", null);
        setField(term174, term174.getClass(), "nativeTypes", term175);
        setField(term174, term174.getClass(), "namesToTypes", term176);
        setField(term174, term174.getClass(), "namespaces", term184);
        setField(term174, term174.getClass(), "nonNullableTypeNames", term191);
        setField(term174, term174.getClass(), "forwardDeclaredTypes", term198);
        setField(term174, term174.getClass(), "typesIndexedByProperty", term205);
        setField(term174, term174.getClass(), "eachRefTypeIndexedByProperty", term213);
        setField(term174, term174.getClass(), "greatestSubtypeByProperty", term218);
        setField(term174, term174.getClass(), "interfaceToImplementors", null);
        setField(term174, term174.getClass(), "unresolvedNamedTypes", null);
        setField(term174, term174.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term174, term174.getClass(), "lastGeneration", false);
        setField(term174, term174.getClass(), "templateTypes", null);
        setBooleanField(term174, term174.getClass(), "tolerateUndefinedValues", false);
        setField(term174, term174.getClass(), "resolveMode", null);
        setField(term173, term173.getClass(), "typeRegistry", term174);
        setField(term173, term173.getClass(), "firstLink", null);
        setField(term173, term173.getClass(), "nextLink", null);
        setField(term173, term173.getClass(), "restrictUndefinedVisitor", null);
        setField(term173, term173.getClass(), "restrictNullVisitor", null);
        term228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term228, term228.getClass(), "type", -1007160944);
        setIntField(term230, term230.getClass(), "type", 1135664017);
        setIntField(term232, term232.getClass(), "type", 590364439);
        setIntField(term234, term234.getClass(), "type", 865208305);
        setIntField(term236, term236.getClass(), "type", -1275173084);
        setField(term236, term236.getClass(), "next", null);
        setField(term236, term236.getClass(), "first", null);
        setField(term236, term236.getClass(), "last", null);
        setField(term236, term236.getClass(), "propListHead", null);
        setIntField(term236, term236.getClass(), "sourcePosition", 0);
        setField(term236, term236.getClass(), "jsType", null);
        setField(term236, term236.getClass(), "parent", null);
        setField(term234, term234.getClass(), "next", term236);
        setIntField(term239, term239.getClass(), "type", -244121226);
        setField(term239, term239.getClass(), "next", null);
        setField(term239, term239.getClass(), "first", null);
        setField(term239, term239.getClass(), "last", term236);
        setField(term239, term239.getClass(), "propListHead", null);
        setIntField(term239, term239.getClass(), "sourcePosition", 0);
        setField(term239, term239.getClass(), "jsType", null);
        setField(term239, term239.getClass(), "parent", null);
        setField(term234, term234.getClass(), "first", term239);
        setField(term234, term234.getClass(), "last", term232);
        setField(term234, term234.getClass(), "propListHead", null);
        setIntField(term234, term234.getClass(), "sourcePosition", 0);
        setField(term234, term234.getClass(), "jsType", null);
        setField(term234, term234.getClass(), "parent", null);
        setField(term232, term232.getClass(), "next", term234);
        setField(term232, term232.getClass(), "first", term236);
        setIntField(term243, term243.getClass(), "type", -1179120542);
        setIntField(term245, term245.getClass(), "type", -73683645);
        setField(term245, term245.getClass(), "next", null);
        setField(term245, term245.getClass(), "first", term239);
        setField(term245, term245.getClass(), "last", term234);
        setField(term245, term245.getClass(), "propListHead", null);
        setIntField(term245, term245.getClass(), "sourcePosition", 0);
        setField(term245, term245.getClass(), "jsType", null);
        setField(term245, term245.getClass(), "parent", null);
        setField(term243, term243.getClass(), "next", term245);
        setField(term243, term243.getClass(), "first", term230);
        setField(term243, term243.getClass(), "last", term230);
        setField(term243, term243.getClass(), "propListHead", null);
        setIntField(term243, term243.getClass(), "sourcePosition", 0);
        setField(term243, term243.getClass(), "jsType", null);
        setField(term243, term243.getClass(), "parent", null);
        setField(term232, term232.getClass(), "last", term243);
        setField(term232, term232.getClass(), "propListHead", null);
        setIntField(term232, term232.getClass(), "sourcePosition", 0);
        setField(term232, term232.getClass(), "jsType", null);
        setField(term232, term232.getClass(), "parent", null);
        setField(term230, term230.getClass(), "next", term232);
        setIntField(term250, term250.getClass(), "type", -226514366);
        setField(term250, term250.getClass(), "next", term243);
        setField(term250, term250.getClass(), "first", term245);
        setField(term250, term250.getClass(), "last", term228);
        setField(term250, term250.getClass(), "propListHead", null);
        setIntField(term250, term250.getClass(), "sourcePosition", 0);
        setField(term250, term250.getClass(), "jsType", null);
        setField(term250, term250.getClass(), "parent", null);
        setField(term230, term230.getClass(), "first", term250);
        setField(term230, term230.getClass(), "last", term250);
        setField(term230, term230.getClass(), "propListHead", null);
        setIntField(term230, term230.getClass(), "sourcePosition", 0);
        setField(term230, term230.getClass(), "jsType", null);
        setField(term230, term230.getClass(), "parent", null);
        setField(term228, term228.getClass(), "next", term230);
        setField(term228, term228.getClass(), "first", term234);
        setField(term228, term228.getClass(), "last", term236);
        setField(term228, term228.getClass(), "propListHead", null);
        setIntField(term228, term228.getClass(), "sourcePosition", 0);
        setField(term228, term228.getClass(), "jsType", null);
        setField(term228, term228.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = Class.forName("com.google.common.base.Function");
        Object[] args = new Object[3];
        args[0] = term228;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "caseEquality", argTypes, term173, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


