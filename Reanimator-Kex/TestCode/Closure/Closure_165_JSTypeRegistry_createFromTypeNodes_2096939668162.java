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

public class JSTypeRegistry_createFromTypeNodes_2096939668162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12911;
     Object term12985;

    public JSTypeRegistry_createFromTypeNodes_2096939668162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12913 = new HashMap();
        HashMap term12923 = new HashMap();
        Set<Object> term509062 =  ((Map) term12923).keySet();
        HashSet term12922 = new HashSet((Collection<? extends Object>) term509062);
        HashMap term12929 = new HashMap();
        Set<Object> term509063 =  ((Map) term12929).keySet();
        HashSet term12928 = new HashSet((Collection<? extends Object>) term509063);
        HashMap term12944 = new HashMap();
        Set<Object> term509064 =  ((Map) term12944).keySet();
        HashSet term12943 = new HashSet((Collection<? extends Object>) term509064);
        HashMap term12954 = new HashMap();
        HashMap term12969 = new HashMap();
        HashMap term12974 = new HashMap();
        term12911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12912 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term12911, term12911.getClass(), "reporter", null);
        setField(term12911, term12911.getClass(), "nativeTypes", term12912);
        setField(term12911, term12911.getClass(), "namesToTypes", term12913);
        setField(term12911, term12911.getClass(), "namespaces", term12922);
        setField(term12911, term12911.getClass(), "nonNullableTypeNames", term12928);
        setField(term12911, term12911.getClass(), "forwardDeclaredTypes", term12943);
        setField(term12911, term12911.getClass(), "typesIndexedByProperty", term12954);
        setField(term12911, term12911.getClass(), "eachRefTypeIndexedByProperty", term12969);
        setField(term12911, term12911.getClass(), "greatestSubtypeByProperty", term12974);
        setField(term12911, term12911.getClass(), "interfaceToImplementors", null);
        setField(term12911, term12911.getClass(), "unresolvedNamedTypes", null);
        setField(term12911, term12911.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12911, term12911.getClass(), "lastGeneration", false);
        setField(term12911, term12911.getClass(), "templateTypeName", null);
        setField(term12911, term12911.getClass(), "templateType", null);
        setBooleanField(term12911, term12911.getClass(), "tolerateUndefinedValues", false);
        setField(term12911, term12911.getClass(), "resolveMode", null);
        term12985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12985, term12985.getClass(), "type", 2634669);
        setIntField(term12987, term12987.getClass(), "type", -1912429941);
        setIntField(term12989, term12989.getClass(), "type", 1801052257);
        setIntField(term12991, term12991.getClass(), "type", -2110556060);
        setIntField(term12993, term12993.getClass(), "type", 313459791);
        setField(term12993, term12993.getClass(), "next", null);
        setField(term12993, term12993.getClass(), "first", null);
        setField(term12993, term12993.getClass(), "last", null);
        setField(term12993, term12993.getClass(), "propListHead", null);
        setIntField(term12993, term12993.getClass(), "sourcePosition", 0);
        setField(term12993, term12993.getClass(), "jsType", null);
        setField(term12993, term12993.getClass(), "parent", null);
        setField(term12991, term12991.getClass(), "next", term12993);
        setIntField(term12996, term12996.getClass(), "type", 752615112);
        setField(term12996, term12996.getClass(), "next", null);
        setField(term12996, term12996.getClass(), "first", null);
        setField(term12996, term12996.getClass(), "last", term12993);
        setField(term12996, term12996.getClass(), "propListHead", null);
        setIntField(term12996, term12996.getClass(), "sourcePosition", 0);
        setField(term12996, term12996.getClass(), "jsType", null);
        setField(term12996, term12996.getClass(), "parent", null);
        setField(term12991, term12991.getClass(), "first", term12996);
        setField(term12991, term12991.getClass(), "last", term12989);
        setField(term12991, term12991.getClass(), "propListHead", null);
        setIntField(term12991, term12991.getClass(), "sourcePosition", 0);
        setField(term12991, term12991.getClass(), "jsType", null);
        setField(term12991, term12991.getClass(), "parent", null);
        setField(term12989, term12989.getClass(), "next", term12991);
        setField(term12989, term12989.getClass(), "first", term12993);
        setIntField(term13000, term13000.getClass(), "type", 794352120);
        setIntField(term13002, term13002.getClass(), "type", 340719678);
        setField(term13002, term13002.getClass(), "next", null);
        setField(term13002, term13002.getClass(), "first", term12996);
        setField(term13002, term13002.getClass(), "last", term12991);
        setField(term13002, term13002.getClass(), "propListHead", null);
        setIntField(term13002, term13002.getClass(), "sourcePosition", 0);
        setField(term13002, term13002.getClass(), "jsType", null);
        setField(term13002, term13002.getClass(), "parent", null);
        setField(term13000, term13000.getClass(), "next", term13002);
        setField(term13000, term13000.getClass(), "first", term12987);
        setField(term13000, term13000.getClass(), "last", term12987);
        setField(term13000, term13000.getClass(), "propListHead", null);
        setIntField(term13000, term13000.getClass(), "sourcePosition", 0);
        setField(term13000, term13000.getClass(), "jsType", null);
        setField(term13000, term13000.getClass(), "parent", null);
        setField(term12989, term12989.getClass(), "last", term13000);
        setField(term12989, term12989.getClass(), "propListHead", null);
        setIntField(term12989, term12989.getClass(), "sourcePosition", 0);
        setField(term12989, term12989.getClass(), "jsType", null);
        setField(term12989, term12989.getClass(), "parent", null);
        setField(term12987, term12987.getClass(), "next", term12989);
        setIntField(term13007, term13007.getClass(), "type", 299791142);
        setField(term13007, term13007.getClass(), "next", term13000);
        setField(term13007, term13007.getClass(), "first", term13002);
        setField(term13007, term13007.getClass(), "last", term12985);
        setField(term13007, term13007.getClass(), "propListHead", null);
        setIntField(term13007, term13007.getClass(), "sourcePosition", 0);
        setField(term13007, term13007.getClass(), "jsType", null);
        setField(term13007, term13007.getClass(), "parent", null);
        setField(term12987, term12987.getClass(), "first", term13007);
        setField(term12987, term12987.getClass(), "last", term13007);
        setField(term12987, term12987.getClass(), "propListHead", null);
        setIntField(term12987, term12987.getClass(), "sourcePosition", 0);
        setField(term12987, term12987.getClass(), "jsType", null);
        setField(term12987, term12987.getClass(), "parent", null);
        setField(term12985, term12985.getClass(), "next", term12987);
        setField(term12985, term12985.getClass(), "first", term12991);
        setField(term12985, term12985.getClass(), "last", term12993);
        setField(term12985, term12985.getClass(), "propListHead", null);
        setIntField(term12985, term12985.getClass(), "sourcePosition", 0);
        setField(term12985, term12985.getClass(), "jsType", null);
        setField(term12985, term12985.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term12985;
        args[1] = "MetUQYZAvL";
        args[2] = null;
        try {
            callMethod(klass, "createFromTypeNodes", argTypes, term12911, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


