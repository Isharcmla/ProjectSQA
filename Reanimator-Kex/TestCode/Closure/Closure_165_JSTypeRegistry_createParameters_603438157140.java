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

public class JSTypeRegistry_createParameters_603438157140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10092;
     Object term10189;
     Object term498964;
     Object term498976;
     Object term498939;

    public JSTypeRegistry_createParameters_603438157140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10094 = new HashMap();
        HashMap term10104 = new HashMap();
        Set<Object> term498977 =  ((Map) term10104).keySet();
        HashSet term10103 = new HashSet((Collection<? extends Object>) term498977);
        HashMap term10121 = new HashMap();
        Set<Object> term498978 =  ((Map) term10121).keySet();
        HashSet term10120 = new HashSet((Collection<? extends Object>) term498978);
        HashMap term10144 = new HashMap();
        Set<Object> term498979 =  ((Map) term10144).keySet();
        HashSet term10143 = new HashSet((Collection<? extends Object>) term498979);
        HashMap term10158 = new HashMap();
        HashMap term10173 = new HashMap();
        HashMap term10178 = new HashMap();
        term10092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10093 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term10092, term10092.getClass(), "reporter", null);
        setField(term10092, term10092.getClass(), "nativeTypes", term10093);
        setField(term10092, term10092.getClass(), "namesToTypes", term10094);
        setField(term10092, term10092.getClass(), "namespaces", term10103);
        setField(term10092, term10092.getClass(), "nonNullableTypeNames", term10120);
        setField(term10092, term10092.getClass(), "forwardDeclaredTypes", term10143);
        setField(term10092, term10092.getClass(), "typesIndexedByProperty", term10158);
        setField(term10092, term10092.getClass(), "eachRefTypeIndexedByProperty", term10173);
        setField(term10092, term10092.getClass(), "greatestSubtypeByProperty", term10178);
        setField(term10092, term10092.getClass(), "interfaceToImplementors", null);
        setField(term10092, term10092.getClass(), "unresolvedNamedTypes", null);
        setField(term10092, term10092.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10092, term10092.getClass(), "lastGeneration", false);
        setField(term10092, term10092.getClass(), "templateTypeName", null);
        setField(term10092, term10092.getClass(), "templateType", null);
        setBooleanField(term10092, term10092.getClass(), "tolerateUndefinedValues", false);
        setField(term10092, term10092.getClass(), "resolveMode", null);
        term10189 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        HashMap term498966 = new HashMap();
        HashMap term498968 = new HashMap();
        Set<Object> term498980 =  ((Map) term498968).keySet();
        HashSet term498967 = new HashSet((Collection<? extends Object>) term498980);
        HashMap term498970 = new HashMap();
        Set<Object> term498981 =  ((Map) term498970).keySet();
        HashSet term498969 = new HashSet((Collection<? extends Object>) term498981);
        HashMap term498972 = new HashMap();
        Set<Object> term498982 =  ((Map) term498972).keySet();
        HashSet term498971 = new HashSet((Collection<? extends Object>) term498982);
        HashMap term498973 = new HashMap();
        HashMap term498974 = new HashMap();
        HashMap term498975 = new HashMap();
        term498964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term498965 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term498964, term498964.getClass(), "reporter", null);
        setField(term498964, term498964.getClass(), "nativeTypes", term498965);
        setField(term498964, term498964.getClass(), "namesToTypes", term498966);
        setField(term498964, term498964.getClass(), "namespaces", term498967);
        setField(term498964, term498964.getClass(), "nonNullableTypeNames", term498969);
        setField(term498964, term498964.getClass(), "forwardDeclaredTypes", term498971);
        setField(term498964, term498964.getClass(), "typesIndexedByProperty", term498973);
        setField(term498964, term498964.getClass(), "eachRefTypeIndexedByProperty", term498974);
        setField(term498964, term498964.getClass(), "greatestSubtypeByProperty", term498975);
        setField(term498964, term498964.getClass(), "interfaceToImplementors", null);
        setField(term498964, term498964.getClass(), "unresolvedNamedTypes", null);
        setField(term498964, term498964.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term498964, term498964.getClass(), "lastGeneration", false);
        setField(term498964, term498964.getClass(), "templateTypeName", null);
        setField(term498964, term498964.getClass(), "templateType", null);
        setBooleanField(term498964, term498964.getClass(), "tolerateUndefinedValues", false);
        setField(term498964, term498964.getClass(), "resolveMode", null);
        term498976 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        term498939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term498941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term498945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term498949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term498952 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term498958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term498939, term498939.getClass(), "type", 83);
        setField(term498939, term498939.getClass(), "next", null);
        setField(term498941, term498941.getClass(), "str", "");
        setIntField(term498941, term498941.getClass(), "type", 38);
        setField(term498945, term498945.getClass(), "str", "");
        setIntField(term498945, term498945.getClass(), "type", 38);
        setField(term498949, term498949.getClass(), "str", "");
        setIntField(term498949, term498949.getClass(), "type", 38);
        setField(term498952, term498952.getClass(), "str", null);
        setIntField(term498952, term498952.getClass(), "type", 38);
        setField(term498952, term498952.getClass(), "next", null);
        setField(term498952, term498952.getClass(), "first", null);
        setField(term498952, term498952.getClass(), "last", null);
        setField(term498952, term498952.getClass(), "propListHead", null);
        setIntField(term498952, term498952.getClass(), "sourcePosition", -1);
        setField(term498952, term498952.getClass(), "jsType", null);
        setField(term498952, term498952.getClass(), "parent", term498939);
        setField(term498949, term498949.getClass(), "next", term498952);
        setField(term498949, term498949.getClass(), "first", null);
        setField(term498949, term498949.getClass(), "last", null);
        setField(term498949, term498949.getClass(), "propListHead", null);
        setIntField(term498949, term498949.getClass(), "sourcePosition", -1);
        setField(term498949, term498949.getClass(), "jsType", null);
        setField(term498949, term498949.getClass(), "parent", term498939);
        setField(term498945, term498945.getClass(), "next", term498949);
        setField(term498945, term498945.getClass(), "first", null);
        setField(term498945, term498945.getClass(), "last", null);
        setField(term498945, term498945.getClass(), "propListHead", null);
        setIntField(term498945, term498945.getClass(), "sourcePosition", -1);
        setField(term498945, term498945.getClass(), "jsType", null);
        setField(term498945, term498945.getClass(), "parent", term498939);
        setField(term498941, term498941.getClass(), "next", term498945);
        setField(term498941, term498941.getClass(), "first", null);
        setField(term498941, term498941.getClass(), "last", null);
        setField(term498941, term498941.getClass(), "propListHead", null);
        setIntField(term498941, term498941.getClass(), "sourcePosition", -1);
        setField(term498941, term498941.getClass(), "jsType", null);
        setField(term498941, term498941.getClass(), "parent", term498939);
        setField(term498939, term498939.getClass(), "first", term498941);
        setField(term498958, term498958.getClass(), "str", "");
        setIntField(term498958, term498958.getClass(), "type", 38);
        setField(term498958, term498958.getClass(), "next", null);
        setField(term498958, term498958.getClass(), "first", null);
        setField(term498958, term498958.getClass(), "last", null);
        setField(term498958, term498958.getClass(), "propListHead", null);
        setIntField(term498958, term498958.getClass(), "sourcePosition", -1);
        setField(term498958, term498958.getClass(), "jsType", null);
        setField(term498958, term498958.getClass(), "parent", term498939);
        setField(term498939, term498939.getClass(), "last", term498958);
        setField(term498939, term498939.getClass(), "propListHead", null);
        setIntField(term498939, term498939.getClass(), "sourcePosition", -1);
        setField(term498939, term498939.getClass(), "jsType", null);
        setField(term498939, term498939.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10189;
        Object retValue = callMethod(klass, "createParameters", argTypes, term10092, args);
        assertTrue(recursiveEquals(term10092, term498964));
        assertTrue(recursiveEquals(term10189, term498976));
        assertTrue(recursiveEquals(retValue, term498939));
    }

};


