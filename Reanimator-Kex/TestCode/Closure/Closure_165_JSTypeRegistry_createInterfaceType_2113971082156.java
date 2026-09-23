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

public class JSTypeRegistry_createInterfaceType_2113971082156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12433;
     Object term12548;

    public JSTypeRegistry_createInterfaceType_2113971082156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12435 = new HashMap();
        HashMap term12445 = new HashMap();
        Set<Object> term507519 =  ((Map) term12445).keySet();
        HashSet term12444 = new HashSet((Collection<? extends Object>) term507519);
        HashMap term12468 = new HashMap();
        Set<Object> term507520 =  ((Map) term12468).keySet();
        HashSet term12467 = new HashSet((Collection<? extends Object>) term507520);
        HashMap term12487 = new HashMap();
        Set<Object> term507521 =  ((Map) term12487).keySet();
        HashSet term12486 = new HashSet((Collection<? extends Object>) term507521);
        HashMap term12505 = new HashMap();
        HashMap term12520 = new HashMap();
        HashMap term12525 = new HashMap();
        term12433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12434 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term12433, term12433.getClass(), "reporter", null);
        setField(term12433, term12433.getClass(), "nativeTypes", term12434);
        setField(term12433, term12433.getClass(), "namesToTypes", term12435);
        setField(term12433, term12433.getClass(), "namespaces", term12444);
        setField(term12433, term12433.getClass(), "nonNullableTypeNames", term12467);
        setField(term12433, term12433.getClass(), "forwardDeclaredTypes", term12486);
        setField(term12433, term12433.getClass(), "typesIndexedByProperty", term12505);
        setField(term12433, term12433.getClass(), "eachRefTypeIndexedByProperty", term12520);
        setField(term12433, term12433.getClass(), "greatestSubtypeByProperty", term12525);
        setField(term12433, term12433.getClass(), "interfaceToImplementors", null);
        setField(term12433, term12433.getClass(), "unresolvedNamedTypes", null);
        setField(term12433, term12433.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12433, term12433.getClass(), "lastGeneration", false);
        setField(term12433, term12433.getClass(), "templateTypeName", null);
        setField(term12433, term12433.getClass(), "templateType", null);
        setBooleanField(term12433, term12433.getClass(), "tolerateUndefinedValues", false);
        setField(term12433, term12433.getClass(), "resolveMode", null);
        term12548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12548, term12548.getClass(), "type", -1271375703);
        setIntField(term12550, term12550.getClass(), "type", 1136208236);
        setIntField(term12552, term12552.getClass(), "type", -1220630391);
        setIntField(term12554, term12554.getClass(), "type", -995822131);
        setIntField(term12556, term12556.getClass(), "type", -687282231);
        setField(term12556, term12556.getClass(), "next", null);
        setField(term12556, term12556.getClass(), "first", null);
        setField(term12556, term12556.getClass(), "last", null);
        setField(term12556, term12556.getClass(), "propListHead", null);
        setIntField(term12556, term12556.getClass(), "sourcePosition", 0);
        setField(term12556, term12556.getClass(), "jsType", null);
        setField(term12556, term12556.getClass(), "parent", null);
        setField(term12554, term12554.getClass(), "next", term12556);
        setIntField(term12559, term12559.getClass(), "type", 1200440315);
        setField(term12559, term12559.getClass(), "next", null);
        setField(term12559, term12559.getClass(), "first", null);
        setField(term12559, term12559.getClass(), "last", term12556);
        setField(term12559, term12559.getClass(), "propListHead", null);
        setIntField(term12559, term12559.getClass(), "sourcePosition", 0);
        setField(term12559, term12559.getClass(), "jsType", null);
        setField(term12559, term12559.getClass(), "parent", null);
        setField(term12554, term12554.getClass(), "first", term12559);
        setField(term12554, term12554.getClass(), "last", term12552);
        setField(term12554, term12554.getClass(), "propListHead", null);
        setIntField(term12554, term12554.getClass(), "sourcePosition", 0);
        setField(term12554, term12554.getClass(), "jsType", null);
        setField(term12554, term12554.getClass(), "parent", null);
        setField(term12552, term12552.getClass(), "next", term12554);
        setField(term12552, term12552.getClass(), "first", term12556);
        setIntField(term12563, term12563.getClass(), "type", 1863910269);
        setIntField(term12565, term12565.getClass(), "type", 864645689);
        setField(term12565, term12565.getClass(), "next", null);
        setField(term12565, term12565.getClass(), "first", term12559);
        setField(term12565, term12565.getClass(), "last", term12554);
        setField(term12565, term12565.getClass(), "propListHead", null);
        setIntField(term12565, term12565.getClass(), "sourcePosition", 0);
        setField(term12565, term12565.getClass(), "jsType", null);
        setField(term12565, term12565.getClass(), "parent", null);
        setField(term12563, term12563.getClass(), "next", term12565);
        setField(term12563, term12563.getClass(), "first", term12550);
        setField(term12563, term12563.getClass(), "last", term12550);
        setField(term12563, term12563.getClass(), "propListHead", null);
        setIntField(term12563, term12563.getClass(), "sourcePosition", 0);
        setField(term12563, term12563.getClass(), "jsType", null);
        setField(term12563, term12563.getClass(), "parent", null);
        setField(term12552, term12552.getClass(), "last", term12563);
        setField(term12552, term12552.getClass(), "propListHead", null);
        setIntField(term12552, term12552.getClass(), "sourcePosition", 0);
        setField(term12552, term12552.getClass(), "jsType", null);
        setField(term12552, term12552.getClass(), "parent", null);
        setField(term12550, term12550.getClass(), "next", term12552);
        setIntField(term12570, term12570.getClass(), "type", 279384872);
        setField(term12570, term12570.getClass(), "next", term12563);
        setField(term12570, term12570.getClass(), "first", term12565);
        setField(term12570, term12570.getClass(), "last", term12548);
        setField(term12570, term12570.getClass(), "propListHead", null);
        setIntField(term12570, term12570.getClass(), "sourcePosition", 0);
        setField(term12570, term12570.getClass(), "jsType", null);
        setField(term12570, term12570.getClass(), "parent", null);
        setField(term12550, term12550.getClass(), "first", term12570);
        setField(term12550, term12550.getClass(), "last", term12570);
        setField(term12550, term12550.getClass(), "propListHead", null);
        setIntField(term12550, term12550.getClass(), "sourcePosition", 0);
        setField(term12550, term12550.getClass(), "jsType", null);
        setField(term12550, term12550.getClass(), "parent", null);
        setField(term12548, term12548.getClass(), "next", term12550);
        setField(term12548, term12548.getClass(), "first", term12554);
        setField(term12548, term12548.getClass(), "last", term12556);
        setField(term12548, term12548.getClass(), "propListHead", null);
        setIntField(term12548, term12548.getClass(), "sourcePosition", 0);
        setField(term12548, term12548.getClass(), "jsType", null);
        setField(term12548, term12548.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "hLWnnngzRq";
        args[1] = term12548;
        try {
            callMethod(klass, "createInterfaceType", argTypes, term12433, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


