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
import java.lang.Boolean;

public class UnionType_getRestrictedTypeGivenToBooleanOutcome_192008012853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2982;
     Object term3069;

    public UnionType_getRestrictedTypeGivenToBooleanOutcome_192008012853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2984 = new HashMap();
        Set<Object> term9338 =  ((Map) term2984).keySet();
        HashSet term2983 = new HashSet((Collection<? extends Object>) term9338);
        HashMap term2995 = new HashMap();
        HashMap term3004 = new HashMap();
        Set<Object> term9339 =  ((Map) term3004).keySet();
        HashSet term3003 = new HashSet((Collection<? extends Object>) term9339);
        HashMap term3011 = new HashMap();
        Set<Object> term9340 =  ((Map) term3011).keySet();
        HashSet term3010 = new HashSet((Collection<? extends Object>) term9340);
        HashMap term3018 = new HashMap();
        Set<Object> term9341 =  ((Map) term3018).keySet();
        HashSet term3017 = new HashSet((Collection<? extends Object>) term9341);
        HashMap term3024 = new HashMap();
        HashMap term3029 = new HashMap();
        term2982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2994 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term3050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3064 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2982, term2982.getClass(), "alternates", term2983);
        setBooleanField(term2982, term2982.getClass(), "resolved", false);
        setField(term2982, term2982.getClass(), "resolveResult", null);
        setField(term2993, term2993.getClass(), "reporter", null);
        setField(term2993, term2993.getClass(), "nativeTypes", term2994);
        setField(term2993, term2993.getClass(), "namesToTypes", term2995);
        setField(term2993, term2993.getClass(), "namespaces", term3003);
        setField(term2993, term2993.getClass(), "enumTypeNames", term3010);
        setField(term2993, term2993.getClass(), "forwardDeclaredTypes", term3017);
        setField(term2993, term2993.getClass(), "typesIndexedByProperty", term3024);
        setField(term2993, term2993.getClass(), "greatestSubtypeByProperty", term3029);
        setField(term2993, term2993.getClass(), "interfaceToImplementors", null);
        setField(term2993, term2993.getClass(), "unresolvedNamedTypes", null);
        setField(term2993, term2993.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2993, term2993.getClass(), "lastGeneration", true);
        setField(term2993, term2993.getClass(), "templateTypeName", "ubodzJoMGW");
        setField(term3050, term3050.getClass(), "name", "weddIktxOA");
        setField(term3050, term3050.getClass(), "referencedType", null);
        setBooleanField(term3050, term3050.getClass(), "visited", true);
        setField(term3064, term3064.getClass(), "info", null);
        setField(term3064, term3064.getClass(), "documentation", null);
        setField(term3064, term3064.getClass(), "sourceName", null);
        setField(term3064, term3064.getClass(), "visibility", null);
        setIntField(term3064, term3064.getClass(), "bitset", 0);
        setField(term3064, term3064.getClass(), "type", null);
        setField(term3064, term3064.getClass(), "thisType", null);
        setBooleanField(term3064, term3064.getClass(), "includeDocumentation", false);
        setField(term3050, term3050.getClass(), "docInfo", term3064);
        setBooleanField(term3050, term3050.getClass(), "unknown", false);
        setBooleanField(term3050, term3050.getClass(), "resolved", false);
        setField(term3050, term3050.getClass(), "resolveResult", null);
        setField(term3050, term3050.getClass(), "registry", null);
        setField(term2993, term2993.getClass(), "templateType", term3050);
        setField(term2982, term2982.getClass(), "registry", term2993);
        term3069 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3069;
        try {
            callMethod(klass, "getRestrictedTypeGivenToBooleanOutcome", argTypes, term2982, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


