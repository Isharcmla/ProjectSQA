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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_getTypesUnderEquality_124176566655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3205;

    public UnionType_getTypesUnderEquality_124176566655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3207 = new HashMap();
        Set<Object> term10305 =  ((Map) term3207).keySet();
        HashSet term3206 = new HashSet((Collection<? extends Object>) term10305);
        HashMap term3215 = new HashMap();
        HashMap term3224 = new HashMap();
        Set<Object> term10306 =  ((Map) term3224).keySet();
        HashSet term3223 = new HashSet((Collection<? extends Object>) term10306);
        HashMap term3231 = new HashMap();
        Set<Object> term10307 =  ((Map) term3231).keySet();
        HashSet term3230 = new HashSet((Collection<? extends Object>) term10307);
        HashMap term3238 = new HashMap();
        Set<Object> term10308 =  ((Map) term3238).keySet();
        HashSet term3237 = new HashSet((Collection<? extends Object>) term10308);
        HashMap term3244 = new HashMap();
        HashMap term3249 = new HashMap();
        term3205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term3213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3214 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term3270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3284 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3205, term3205.getClass(), "alternates", term3206);
        setBooleanField(term3205, term3205.getClass(), "resolved", true);
        setField(term3205, term3205.getClass(), "resolveResult", null);
        setField(term3213, term3213.getClass(), "reporter", null);
        setField(term3213, term3213.getClass(), "nativeTypes", term3214);
        setField(term3213, term3213.getClass(), "namesToTypes", term3215);
        setField(term3213, term3213.getClass(), "namespaces", term3223);
        setField(term3213, term3213.getClass(), "enumTypeNames", term3230);
        setField(term3213, term3213.getClass(), "forwardDeclaredTypes", term3237);
        setField(term3213, term3213.getClass(), "typesIndexedByProperty", term3244);
        setField(term3213, term3213.getClass(), "greatestSubtypeByProperty", term3249);
        setField(term3213, term3213.getClass(), "interfaceToImplementors", null);
        setField(term3213, term3213.getClass(), "unresolvedNamedTypes", null);
        setField(term3213, term3213.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3213, term3213.getClass(), "lastGeneration", false);
        setField(term3213, term3213.getClass(), "templateTypeName", "fVdTcjgHdw");
        setField(term3270, term3270.getClass(), "name", "wwAwLLcLPp");
        setField(term3270, term3270.getClass(), "referencedType", null);
        setBooleanField(term3270, term3270.getClass(), "visited", false);
        setField(term3284, term3284.getClass(), "info", null);
        setField(term3284, term3284.getClass(), "documentation", null);
        setField(term3284, term3284.getClass(), "sourceName", null);
        setField(term3284, term3284.getClass(), "visibility", null);
        setIntField(term3284, term3284.getClass(), "bitset", 0);
        setField(term3284, term3284.getClass(), "type", null);
        setField(term3284, term3284.getClass(), "thisType", null);
        setBooleanField(term3284, term3284.getClass(), "includeDocumentation", false);
        setField(term3270, term3270.getClass(), "docInfo", term3284);
        setBooleanField(term3270, term3270.getClass(), "unknown", true);
        setBooleanField(term3270, term3270.getClass(), "resolved", true);
        setField(term3270, term3270.getClass(), "resolveResult", null);
        setField(term3270, term3270.getClass(), "registry", null);
        setField(term3213, term3213.getClass(), "templateType", term3270);
        setField(term3205, term3205.getClass(), "registry", term3213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTypesUnderEquality", argTypes, term3205, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


