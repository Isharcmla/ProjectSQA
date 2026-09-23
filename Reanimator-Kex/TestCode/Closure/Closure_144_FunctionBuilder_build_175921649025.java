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
import java.lang.String;

public class FunctionBuilder_build_175921649025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10690;

    public FunctionBuilder_build_175921649025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10693 = new HashMap();
        HashMap term10702 = new HashMap();
        Set<Object> term38163 =  ((Map) term10702).keySet();
        HashSet term10701 = new HashSet((Collection<? extends Object>) term38163);
        HashMap term10709 = new HashMap();
        Set<Object> term38164 =  ((Map) term10709).keySet();
        HashSet term10708 = new HashSet((Collection<? extends Object>) term38164);
        HashMap term10716 = new HashMap();
        Set<Object> term38165 =  ((Map) term10716).keySet();
        HashSet term10715 = new HashSet((Collection<? extends Object>) term38165);
        HashMap term10722 = new HashMap();
        HashMap term10727 = new HashMap();
        Class<? extends Object> term38187 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term38186 = ((Class) term38187).getDeclaredField((String) "PUBLIC");
        ((Field) term38186).setAccessible(true);
        Object enum103 = ((Field) term38186).get((Object) null);
        Class<? extends Object> term38452 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term38451 = ((Class) term38452).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term38451).setAccessible(true);
        Object enum104 = ((Field) term38451).get((Object) null);
        term10690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term10691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10692 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term10748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term10762 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10763 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term10764 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term10769 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10770 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term10691, term10691.getClass(), "reporter", null);
        setField(term10691, term10691.getClass(), "nativeTypes", term10692);
        setField(term10691, term10691.getClass(), "namesToTypes", term10693);
        setField(term10691, term10691.getClass(), "namespaces", term10701);
        setField(term10691, term10691.getClass(), "enumTypeNames", term10708);
        setField(term10691, term10691.getClass(), "forwardDeclaredTypes", term10715);
        setField(term10691, term10691.getClass(), "typesIndexedByProperty", term10722);
        setField(term10691, term10691.getClass(), "greatestSubtypeByProperty", term10727);
        setField(term10691, term10691.getClass(), "interfaceToImplementors", null);
        setField(term10691, term10691.getClass(), "unresolvedNamedTypes", null);
        setField(term10691, term10691.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10691, term10691.getClass(), "lastGeneration", false);
        setField(term10691, term10691.getClass(), "templateTypeName", "KAORSSPSeV");
        setField(term10748, term10748.getClass(), "name", "UimMMORkzd");
        setField(term10748, term10748.getClass(), "referencedType", null);
        setBooleanField(term10748, term10748.getClass(), "visited", true);
        setField(term10763, term10763.getClass(), "baseType", null);
        setField(term10763, term10763.getClass(), "implementedInterfaces", null);
        setField(term10763, term10763.getClass(), "parameters", null);
        setField(term10763, term10763.getClass(), "thrownTypes", null);
        setField(term10763, term10763.getClass(), "templateTypeName", null);
        setField(term10763, term10763.getClass(), "description", null);
        setField(term10763, term10763.getClass(), "deprecated", null);
        setField(term10763, term10763.getClass(), "license", null);
        setField(term10763, term10763.getClass(), "suppressions", null);
        setField(term10762, term10762.getClass(), "info", term10763);
        setField(term10764, term10764.getClass(), "markers", null);
        setField(term10764, term10764.getClass(), "parameters", null);
        setField(term10764, term10764.getClass(), "throwsDescriptions", null);
        setField(term10764, term10764.getClass(), "blockDescription", null);
        setField(term10764, term10764.getClass(), "fileOverview", null);
        setField(term10764, term10764.getClass(), "returnDescription", null);
        setField(term10764, term10764.getClass(), "version", null);
        setField(term10764, term10764.getClass(), "authors", null);
        setField(term10764, term10764.getClass(), "sees", null);
        setField(term10762, term10762.getClass(), "documentation", term10764);
        setField(term10762, term10762.getClass(), "sourceName", "");
        setField(term10762, term10762.getClass(), "visibility", enum103);
        setIntField(term10762, term10762.getClass(), "bitset", 1540719661);
        setField(term10769, term10769.getClass(), "root", null);
        setField(term10769, term10769.getClass(), "sourceName", null);
        setField(term10762, term10762.getClass(), "type", term10769);
        setField(term10770, term10770.getClass(), "root", null);
        setField(term10770, term10770.getClass(), "sourceName", null);
        setField(term10762, term10762.getClass(), "thisType", term10770);
        setBooleanField(term10762, term10762.getClass(), "includeDocumentation", false);
        setField(term10748, term10748.getClass(), "docInfo", term10762);
        setBooleanField(term10748, term10748.getClass(), "unknown", false);
        setBooleanField(term10748, term10748.getClass(), "resolved", true);
        setField(term10748, term10748.getClass(), "resolveResult", null);
        setField(term10748, term10748.getClass(), "registry", null);
        setField(term10691, term10691.getClass(), "templateType", term10748);
        setBooleanField(term10691, term10691.getClass(), "tolerateUndefinedValues", false);
        setField(term10691, term10691.getClass(), "resolveMode", enum104);
        setField(term10690, term10690.getClass(), "registry", term10691);
        setField(term10690, term10690.getClass(), "name", "JisaWUxcNb");
        setIntField(term10807, term10807.getClass(), "type", 0);
        setField(term10807, term10807.getClass(), "next", null);
        setField(term10807, term10807.getClass(), "first", null);
        setField(term10807, term10807.getClass(), "last", null);
        setField(term10807, term10807.getClass(), "propListHead", null);
        setIntField(term10807, term10807.getClass(), "sourcePosition", 0);
        setField(term10807, term10807.getClass(), "jsType", null);
        setField(term10807, term10807.getClass(), "parent", null);
        setField(term10690, term10690.getClass(), "sourceNode", term10807);
        setIntField(term10810, term10810.getClass(), "type", 0);
        setField(term10810, term10810.getClass(), "next", null);
        setField(term10810, term10810.getClass(), "first", null);
        setField(term10810, term10810.getClass(), "last", null);
        setField(term10810, term10810.getClass(), "propListHead", null);
        setIntField(term10810, term10810.getClass(), "sourcePosition", 0);
        setField(term10810, term10810.getClass(), "jsType", null);
        setField(term10810, term10810.getClass(), "parent", null);
        setField(term10690, term10690.getClass(), "parametersNode", term10810);
        setField(term10690, term10690.getClass(), "returnType", null);
        setField(term10690, term10690.getClass(), "typeOfThis", null);
        setField(term10690, term10690.getClass(), "templateTypeName", null);
        setBooleanField(term10690, term10690.getClass(), "inferredReturnType", false);
        setBooleanField(term10690, term10690.getClass(), "isConstructor", false);
        setBooleanField(term10690, term10690.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term10690, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


