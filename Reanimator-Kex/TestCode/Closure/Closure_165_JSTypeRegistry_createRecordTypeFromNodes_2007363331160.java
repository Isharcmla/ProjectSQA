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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_createRecordTypeFromNodes_2007363331160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13279;
     Object term13358;

    public JSTypeRegistry_createRecordTypeFromNodes_2007363331160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13281 = new HashMap();
        HashMap term13291 = new HashMap();
        Set<Object> term508433 =  ((Map) term13291).keySet();
        HashSet term13290 = new HashSet((Collection<? extends Object>) term508433);
        HashMap term13306 = new HashMap();
        Set<Object> term508434 =  ((Map) term13306).keySet();
        HashSet term13305 = new HashSet((Collection<? extends Object>) term508434);
        HashMap term13315 = new HashMap();
        Set<Object> term508435 =  ((Map) term13315).keySet();
        HashSet term13314 = new HashSet((Collection<? extends Object>) term508435);
        HashMap term13327 = new HashMap();
        HashMap term13342 = new HashMap();
        HashMap term13347 = new HashMap();
        term13279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term13280 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term13279, term13279.getClass(), "reporter", null);
        setField(term13279, term13279.getClass(), "nativeTypes", term13280);
        setField(term13279, term13279.getClass(), "namesToTypes", term13281);
        setField(term13279, term13279.getClass(), "namespaces", term13290);
        setField(term13279, term13279.getClass(), "nonNullableTypeNames", term13305);
        setField(term13279, term13279.getClass(), "forwardDeclaredTypes", term13314);
        setField(term13279, term13279.getClass(), "typesIndexedByProperty", term13327);
        setField(term13279, term13279.getClass(), "eachRefTypeIndexedByProperty", term13342);
        setField(term13279, term13279.getClass(), "greatestSubtypeByProperty", term13347);
        setField(term13279, term13279.getClass(), "interfaceToImplementors", null);
        setField(term13279, term13279.getClass(), "unresolvedNamedTypes", null);
        setField(term13279, term13279.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term13279, term13279.getClass(), "lastGeneration", false);
        setField(term13279, term13279.getClass(), "templateTypeName", null);
        setField(term13279, term13279.getClass(), "templateType", null);
        setBooleanField(term13279, term13279.getClass(), "tolerateUndefinedValues", false);
        setField(term13279, term13279.getClass(), "resolveMode", null);
        term13358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13358, term13358.getClass(), "type", -348612876);
        setIntField(term13360, term13360.getClass(), "type", 1302807565);
        setIntField(term13362, term13362.getClass(), "type", -838848221);
        setIntField(term13364, term13364.getClass(), "type", 1163761623);
        setIntField(term13366, term13366.getClass(), "type", 718742281);
        setField(term13366, term13366.getClass(), "next", null);
        setField(term13366, term13366.getClass(), "first", null);
        setField(term13366, term13366.getClass(), "last", null);
        setField(term13366, term13366.getClass(), "propListHead", null);
        setIntField(term13366, term13366.getClass(), "sourcePosition", 0);
        setField(term13366, term13366.getClass(), "jsType", null);
        setField(term13366, term13366.getClass(), "parent", null);
        setField(term13364, term13364.getClass(), "next", term13366);
        setIntField(term13369, term13369.getClass(), "type", 1532723756);
        setField(term13369, term13369.getClass(), "next", null);
        setField(term13369, term13369.getClass(), "first", null);
        setField(term13369, term13369.getClass(), "last", term13366);
        setField(term13369, term13369.getClass(), "propListHead", null);
        setIntField(term13369, term13369.getClass(), "sourcePosition", 0);
        setField(term13369, term13369.getClass(), "jsType", null);
        setField(term13369, term13369.getClass(), "parent", null);
        setField(term13364, term13364.getClass(), "first", term13369);
        setField(term13364, term13364.getClass(), "last", term13362);
        setField(term13364, term13364.getClass(), "propListHead", null);
        setIntField(term13364, term13364.getClass(), "sourcePosition", 0);
        setField(term13364, term13364.getClass(), "jsType", null);
        setField(term13364, term13364.getClass(), "parent", null);
        setField(term13362, term13362.getClass(), "next", term13364);
        setField(term13362, term13362.getClass(), "first", term13366);
        setIntField(term13373, term13373.getClass(), "type", 777492093);
        setIntField(term13375, term13375.getClass(), "type", 1414025609);
        setField(term13375, term13375.getClass(), "next", null);
        setField(term13375, term13375.getClass(), "first", term13369);
        setField(term13375, term13375.getClass(), "last", term13364);
        setField(term13375, term13375.getClass(), "propListHead", null);
        setIntField(term13375, term13375.getClass(), "sourcePosition", 0);
        setField(term13375, term13375.getClass(), "jsType", null);
        setField(term13375, term13375.getClass(), "parent", null);
        setField(term13373, term13373.getClass(), "next", term13375);
        setField(term13373, term13373.getClass(), "first", term13360);
        setField(term13373, term13373.getClass(), "last", term13360);
        setField(term13373, term13373.getClass(), "propListHead", null);
        setIntField(term13373, term13373.getClass(), "sourcePosition", 0);
        setField(term13373, term13373.getClass(), "jsType", null);
        setField(term13373, term13373.getClass(), "parent", null);
        setField(term13362, term13362.getClass(), "last", term13373);
        setField(term13362, term13362.getClass(), "propListHead", null);
        setIntField(term13362, term13362.getClass(), "sourcePosition", 0);
        setField(term13362, term13362.getClass(), "jsType", null);
        setField(term13362, term13362.getClass(), "parent", null);
        setField(term13360, term13360.getClass(), "next", term13362);
        setIntField(term13380, term13380.getClass(), "type", 255145822);
        setField(term13380, term13380.getClass(), "next", term13373);
        setField(term13380, term13380.getClass(), "first", term13375);
        setField(term13380, term13380.getClass(), "last", term13358);
        setField(term13380, term13380.getClass(), "propListHead", null);
        setIntField(term13380, term13380.getClass(), "sourcePosition", 0);
        setField(term13380, term13380.getClass(), "jsType", null);
        setField(term13380, term13380.getClass(), "parent", null);
        setField(term13360, term13360.getClass(), "first", term13380);
        setField(term13360, term13360.getClass(), "last", term13380);
        setField(term13360, term13360.getClass(), "propListHead", null);
        setIntField(term13360, term13360.getClass(), "sourcePosition", 0);
        setField(term13360, term13360.getClass(), "jsType", null);
        setField(term13360, term13360.getClass(), "parent", null);
        setField(term13358, term13358.getClass(), "next", term13360);
        setField(term13358, term13358.getClass(), "first", term13364);
        setField(term13358, term13358.getClass(), "last", term13366);
        setField(term13358, term13358.getClass(), "propListHead", null);
        setIntField(term13358, term13358.getClass(), "sourcePosition", 0);
        setField(term13358, term13358.getClass(), "jsType", null);
        setField(term13358, term13358.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term13358;
        args[1] = "uZcUOSgoMp";
        args[2] = null;
        try {
            callMethod(klass, "createRecordTypeFromNodes", argTypes, term13279, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


