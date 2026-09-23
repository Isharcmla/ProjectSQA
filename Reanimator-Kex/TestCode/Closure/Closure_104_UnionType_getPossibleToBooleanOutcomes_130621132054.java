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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class UnionType_getPossibleToBooleanOutcomes_130621132054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3095;
     Object term9448;
     Object enum4;

    public UnionType_getPossibleToBooleanOutcomes_130621132054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3097 = new HashMap();
        Set<Object> term9469 =  ((Map) term3097).keySet();
        HashSet term3096 = new HashSet((Collection<? extends Object>) term9469);
        HashMap term3108 = new HashMap();
        HashMap term3117 = new HashMap();
        Set<Object> term9470 =  ((Map) term3117).keySet();
        HashSet term3116 = new HashSet((Collection<? extends Object>) term9470);
        HashMap term3123 = new HashMap();
        Set<Object> term9471 =  ((Map) term3123).keySet();
        HashSet term3122 = new HashSet((Collection<? extends Object>) term9471);
        HashMap term3130 = new HashMap();
        Set<Object> term9472 =  ((Map) term3130).keySet();
        HashSet term3129 = new HashSet((Collection<? extends Object>) term9472);
        HashMap term3136 = new HashMap();
        HashMap term3141 = new HashMap();
        term3095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term3106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3107 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term3162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3176 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3095, term3095.getClass(), "alternates", term3096);
        setBooleanField(term3095, term3095.getClass(), "resolved", false);
        setField(term3095, term3095.getClass(), "resolveResult", null);
        setField(term3106, term3106.getClass(), "reporter", null);
        setField(term3106, term3106.getClass(), "nativeTypes", term3107);
        setField(term3106, term3106.getClass(), "namesToTypes", term3108);
        setField(term3106, term3106.getClass(), "namespaces", term3116);
        setField(term3106, term3106.getClass(), "enumTypeNames", term3122);
        setField(term3106, term3106.getClass(), "forwardDeclaredTypes", term3129);
        setField(term3106, term3106.getClass(), "typesIndexedByProperty", term3136);
        setField(term3106, term3106.getClass(), "greatestSubtypeByProperty", term3141);
        setField(term3106, term3106.getClass(), "interfaceToImplementors", null);
        setField(term3106, term3106.getClass(), "unresolvedNamedTypes", null);
        setField(term3106, term3106.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3106, term3106.getClass(), "lastGeneration", false);
        setField(term3106, term3106.getClass(), "templateTypeName", "McpzErOcYb");
        setField(term3162, term3162.getClass(), "name", "jqrVEUvYEz");
        setField(term3162, term3162.getClass(), "referencedType", null);
        setBooleanField(term3162, term3162.getClass(), "visited", false);
        setField(term3176, term3176.getClass(), "info", null);
        setField(term3176, term3176.getClass(), "documentation", null);
        setField(term3176, term3176.getClass(), "sourceName", null);
        setField(term3176, term3176.getClass(), "visibility", null);
        setIntField(term3176, term3176.getClass(), "bitset", 0);
        setField(term3176, term3176.getClass(), "type", null);
        setField(term3176, term3176.getClass(), "thisType", null);
        setBooleanField(term3176, term3176.getClass(), "includeDocumentation", false);
        setField(term3162, term3162.getClass(), "docInfo", term3176);
        setBooleanField(term3162, term3162.getClass(), "unknown", false);
        setBooleanField(term3162, term3162.getClass(), "resolved", false);
        setField(term3162, term3162.getClass(), "resolveResult", null);
        setField(term3162, term3162.getClass(), "registry", null);
        setField(term3106, term3106.getClass(), "templateType", term3162);
        setField(term3095, term3095.getClass(), "registry", term3106);
        HashMap term9450 = new HashMap();
        Set<Object> term9493 =  ((Map) term9450).keySet();
        HashSet term9449 = new HashSet((Collection<? extends Object>) term9493);
        HashMap term9454 = new HashMap();
        HashMap term9456 = new HashMap();
        Set<Object> term9494 =  ((Map) term9456).keySet();
        HashSet term9455 = new HashSet((Collection<? extends Object>) term9494);
        HashMap term9458 = new HashMap();
        Set<Object> term9495 =  ((Map) term9458).keySet();
        HashSet term9457 = new HashSet((Collection<? extends Object>) term9495);
        HashMap term9460 = new HashMap();
        Set<Object> term9496 =  ((Map) term9460).keySet();
        HashSet term9459 = new HashSet((Collection<? extends Object>) term9496);
        HashMap term9461 = new HashMap();
        HashMap term9462 = new HashMap();
        term9448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term9452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9453 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term9465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term9468 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9448, term9448.getClass(), "alternates", term9449);
        setBooleanField(term9448, term9448.getClass(), "resolved", false);
        setField(term9448, term9448.getClass(), "resolveResult", null);
        setField(term9452, term9452.getClass(), "reporter", null);
        setField(term9452, term9452.getClass(), "nativeTypes", term9453);
        setField(term9452, term9452.getClass(), "namesToTypes", term9454);
        setField(term9452, term9452.getClass(), "namespaces", term9455);
        setField(term9452, term9452.getClass(), "enumTypeNames", term9457);
        setField(term9452, term9452.getClass(), "forwardDeclaredTypes", term9459);
        setField(term9452, term9452.getClass(), "typesIndexedByProperty", term9461);
        setField(term9452, term9452.getClass(), "greatestSubtypeByProperty", term9462);
        setField(term9452, term9452.getClass(), "interfaceToImplementors", null);
        setField(term9452, term9452.getClass(), "unresolvedNamedTypes", null);
        setField(term9452, term9452.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9452, term9452.getClass(), "lastGeneration", false);
        setField(term9452, term9452.getClass(), "templateTypeName", "McpzErOcYb");
        setField(term9465, term9465.getClass(), "name", "jqrVEUvYEz");
        setField(term9465, term9465.getClass(), "referencedType", null);
        setBooleanField(term9465, term9465.getClass(), "visited", false);
        setField(term9468, term9468.getClass(), "info", null);
        setField(term9468, term9468.getClass(), "documentation", null);
        setField(term9468, term9468.getClass(), "sourceName", null);
        setField(term9468, term9468.getClass(), "visibility", null);
        setIntField(term9468, term9468.getClass(), "bitset", 0);
        setField(term9468, term9468.getClass(), "type", null);
        setField(term9468, term9468.getClass(), "thisType", null);
        setBooleanField(term9468, term9468.getClass(), "includeDocumentation", false);
        setField(term9465, term9465.getClass(), "docInfo", term9468);
        setBooleanField(term9465, term9465.getClass(), "unknown", false);
        setBooleanField(term9465, term9465.getClass(), "resolved", false);
        setField(term9465, term9465.getClass(), "resolveResult", null);
        setField(term9465, term9465.getClass(), "registry", null);
        setField(term9452, term9452.getClass(), "templateType", term9465);
        setField(term9448, term9448.getClass(), "registry", term9452);
        Class<? extends Object> term9552 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term9551 = ((Class) term9552).getDeclaredField((String) "EMPTY");
        ((Field) term9551).setAccessible(true);
        enum4 = ((Field) term9551).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPossibleToBooleanOutcomes", argTypes, term3095, args);
        assertTrue(recursiveEquals(term3095, term9448));
        assertTrue(recursiveEquals(retValue, enum4));
    }

};


