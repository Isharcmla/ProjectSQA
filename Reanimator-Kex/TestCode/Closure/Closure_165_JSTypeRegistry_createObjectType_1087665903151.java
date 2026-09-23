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

public class JSTypeRegistry_createObjectType_1087665903151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11848;
     Object term11946;

    public JSTypeRegistry_createObjectType_1087665903151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11850 = new HashMap();
        HashMap term11860 = new HashMap();
        Set<Object> term506348 =  ((Map) term11860).keySet();
        HashSet term11859 = new HashSet((Collection<? extends Object>) term506348);
        HashMap term11883 = new HashMap();
        Set<Object> term506349 =  ((Map) term11883).keySet();
        HashSet term11882 = new HashSet((Collection<? extends Object>) term506349);
        HashMap term11898 = new HashMap();
        Set<Object> term506350 =  ((Map) term11898).keySet();
        HashSet term11897 = new HashSet((Collection<? extends Object>) term506350);
        HashMap term11903 = new HashMap();
        HashMap term11918 = new HashMap();
        HashMap term11923 = new HashMap();
        term11848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11849 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term11848, term11848.getClass(), "reporter", null);
        setField(term11848, term11848.getClass(), "nativeTypes", term11849);
        setField(term11848, term11848.getClass(), "namesToTypes", term11850);
        setField(term11848, term11848.getClass(), "namespaces", term11859);
        setField(term11848, term11848.getClass(), "nonNullableTypeNames", term11882);
        setField(term11848, term11848.getClass(), "forwardDeclaredTypes", term11897);
        setField(term11848, term11848.getClass(), "typesIndexedByProperty", term11903);
        setField(term11848, term11848.getClass(), "eachRefTypeIndexedByProperty", term11918);
        setField(term11848, term11848.getClass(), "greatestSubtypeByProperty", term11923);
        setField(term11848, term11848.getClass(), "interfaceToImplementors", null);
        setField(term11848, term11848.getClass(), "unresolvedNamedTypes", null);
        setField(term11848, term11848.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11848, term11848.getClass(), "lastGeneration", false);
        setField(term11848, term11848.getClass(), "templateTypeName", null);
        setField(term11848, term11848.getClass(), "templateType", null);
        setBooleanField(term11848, term11848.getClass(), "tolerateUndefinedValues", false);
        setField(term11848, term11848.getClass(), "resolveMode", null);
        term11946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11946, term11946.getClass(), "type", 723812297);
        setIntField(term11948, term11948.getClass(), "type", 1639448749);
        setIntField(term11950, term11950.getClass(), "type", 873659088);
        setIntField(term11952, term11952.getClass(), "type", -975748721);
        setIntField(term11954, term11954.getClass(), "type", 433248783);
        setField(term11954, term11954.getClass(), "next", null);
        setField(term11954, term11954.getClass(), "first", null);
        setField(term11954, term11954.getClass(), "last", null);
        setField(term11954, term11954.getClass(), "propListHead", null);
        setIntField(term11954, term11954.getClass(), "sourcePosition", 0);
        setField(term11954, term11954.getClass(), "jsType", null);
        setField(term11954, term11954.getClass(), "parent", null);
        setField(term11952, term11952.getClass(), "next", term11954);
        setIntField(term11957, term11957.getClass(), "type", -507944154);
        setField(term11957, term11957.getClass(), "next", null);
        setField(term11957, term11957.getClass(), "first", null);
        setField(term11957, term11957.getClass(), "last", term11954);
        setField(term11957, term11957.getClass(), "propListHead", null);
        setIntField(term11957, term11957.getClass(), "sourcePosition", 0);
        setField(term11957, term11957.getClass(), "jsType", null);
        setField(term11957, term11957.getClass(), "parent", null);
        setField(term11952, term11952.getClass(), "first", term11957);
        setField(term11952, term11952.getClass(), "last", term11950);
        setField(term11952, term11952.getClass(), "propListHead", null);
        setIntField(term11952, term11952.getClass(), "sourcePosition", 0);
        setField(term11952, term11952.getClass(), "jsType", null);
        setField(term11952, term11952.getClass(), "parent", null);
        setField(term11950, term11950.getClass(), "next", term11952);
        setField(term11950, term11950.getClass(), "first", term11954);
        setIntField(term11961, term11961.getClass(), "type", 897010381);
        setIntField(term11963, term11963.getClass(), "type", -15712667);
        setField(term11963, term11963.getClass(), "next", null);
        setField(term11963, term11963.getClass(), "first", term11957);
        setField(term11963, term11963.getClass(), "last", term11952);
        setField(term11963, term11963.getClass(), "propListHead", null);
        setIntField(term11963, term11963.getClass(), "sourcePosition", 0);
        setField(term11963, term11963.getClass(), "jsType", null);
        setField(term11963, term11963.getClass(), "parent", null);
        setField(term11961, term11961.getClass(), "next", term11963);
        setField(term11961, term11961.getClass(), "first", term11948);
        setField(term11961, term11961.getClass(), "last", term11948);
        setField(term11961, term11961.getClass(), "propListHead", null);
        setIntField(term11961, term11961.getClass(), "sourcePosition", 0);
        setField(term11961, term11961.getClass(), "jsType", null);
        setField(term11961, term11961.getClass(), "parent", null);
        setField(term11950, term11950.getClass(), "last", term11961);
        setField(term11950, term11950.getClass(), "propListHead", null);
        setIntField(term11950, term11950.getClass(), "sourcePosition", 0);
        setField(term11950, term11950.getClass(), "jsType", null);
        setField(term11950, term11950.getClass(), "parent", null);
        setField(term11948, term11948.getClass(), "next", term11950);
        setIntField(term11968, term11968.getClass(), "type", 1964967720);
        setField(term11968, term11968.getClass(), "next", term11961);
        setField(term11968, term11968.getClass(), "first", term11963);
        setField(term11968, term11968.getClass(), "last", term11946);
        setField(term11968, term11968.getClass(), "propListHead", null);
        setIntField(term11968, term11968.getClass(), "sourcePosition", 0);
        setField(term11968, term11968.getClass(), "jsType", null);
        setField(term11968, term11968.getClass(), "parent", null);
        setField(term11948, term11948.getClass(), "first", term11968);
        setField(term11948, term11948.getClass(), "last", term11968);
        setField(term11948, term11948.getClass(), "propListHead", null);
        setIntField(term11948, term11948.getClass(), "sourcePosition", 0);
        setField(term11948, term11948.getClass(), "jsType", null);
        setField(term11948, term11948.getClass(), "parent", null);
        setField(term11946, term11946.getClass(), "next", term11948);
        setField(term11946, term11946.getClass(), "first", term11952);
        setField(term11946, term11946.getClass(), "last", term11954);
        setField(term11946, term11946.getClass(), "propListHead", null);
        setIntField(term11946, term11946.getClass(), "sourcePosition", 0);
        setField(term11946, term11946.getClass(), "jsType", null);
        setField(term11946, term11946.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[3];
        args[0] = "MeFZCtLbdV";
        args[1] = term11946;
        args[2] = null;
        try {
            callMethod(klass, "createObjectType", argTypes, term11848, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


