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

public class UnionType_getRestrictedUnion_15494430150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2651;

    public UnionType_getRestrictedUnion_15494430150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2653 = new HashMap();
        Set<Object> term8621 =  ((Map) term2653).keySet();
        HashSet term2652 = new HashSet((Collection<? extends Object>) term8621);
        HashMap term2664 = new HashMap();
        HashMap term2673 = new HashMap();
        Set<Object> term8622 =  ((Map) term2673).keySet();
        HashSet term2672 = new HashSet((Collection<? extends Object>) term8622);
        HashMap term2680 = new HashMap();
        Set<Object> term8623 =  ((Map) term2680).keySet();
        HashSet term2679 = new HashSet((Collection<? extends Object>) term8623);
        HashMap term2687 = new HashMap();
        Set<Object> term8624 =  ((Map) term2687).keySet();
        HashSet term2686 = new HashSet((Collection<? extends Object>) term8624);
        HashMap term2693 = new HashMap();
        HashMap term2698 = new HashMap();
        term2651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2663 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term2719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2733 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2651, term2651.getClass(), "alternates", term2652);
        setBooleanField(term2651, term2651.getClass(), "resolved", true);
        setField(term2651, term2651.getClass(), "resolveResult", null);
        setField(term2662, term2662.getClass(), "reporter", null);
        setField(term2662, term2662.getClass(), "nativeTypes", term2663);
        setField(term2662, term2662.getClass(), "namesToTypes", term2664);
        setField(term2662, term2662.getClass(), "namespaces", term2672);
        setField(term2662, term2662.getClass(), "enumTypeNames", term2679);
        setField(term2662, term2662.getClass(), "forwardDeclaredTypes", term2686);
        setField(term2662, term2662.getClass(), "typesIndexedByProperty", term2693);
        setField(term2662, term2662.getClass(), "greatestSubtypeByProperty", term2698);
        setField(term2662, term2662.getClass(), "interfaceToImplementors", null);
        setField(term2662, term2662.getClass(), "unresolvedNamedTypes", null);
        setField(term2662, term2662.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2662, term2662.getClass(), "lastGeneration", true);
        setField(term2662, term2662.getClass(), "templateTypeName", "PqywFWJlpE");
        setField(term2719, term2719.getClass(), "name", "OzXRsFGTIp");
        setField(term2719, term2719.getClass(), "referencedType", null);
        setBooleanField(term2719, term2719.getClass(), "visited", false);
        setField(term2733, term2733.getClass(), "info", null);
        setField(term2733, term2733.getClass(), "documentation", null);
        setField(term2733, term2733.getClass(), "sourceName", null);
        setField(term2733, term2733.getClass(), "visibility", null);
        setIntField(term2733, term2733.getClass(), "bitset", 0);
        setField(term2733, term2733.getClass(), "type", null);
        setField(term2733, term2733.getClass(), "thisType", null);
        setBooleanField(term2733, term2733.getClass(), "includeDocumentation", false);
        setField(term2719, term2719.getClass(), "docInfo", term2733);
        setBooleanField(term2719, term2719.getClass(), "unknown", false);
        setBooleanField(term2719, term2719.getClass(), "resolved", true);
        setField(term2719, term2719.getClass(), "resolveResult", null);
        setField(term2719, term2719.getClass(), "registry", null);
        setField(term2662, term2662.getClass(), "templateType", term2719);
        setField(term2651, term2651.getClass(), "registry", term2662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getRestrictedUnion", argTypes, term2651, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


