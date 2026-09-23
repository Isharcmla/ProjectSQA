package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DevirtualizePrototypeMethods_isEligibleDefinition_209337946917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;
     Object term182;
     Object term197;

    public DevirtualizePrototypeMethods_isEligibleDefinition_209337946917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term181, term181.getClass(), "compiler", null);
        HashMap term183 = new HashMap();
        term182 = newInstance(Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        setField(term182, term182.getClass(), "compiler", null);
        setField(term182, term182.getClass(), "definitionSiteMap", term183);
        setField(term182, term182.getClass(), "nameDefinitionMultimap", null);
        setField(term182, term182.getClass(), "nameUseSiteMultimap", null);
        term197 = newInstance(Class.forName("com.google.javascript.jscomp.DefinitionSite"));
        Object term198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term221 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term198, term198.getClass(), "type", 1655935355);
        setIntField(term200, term200.getClass(), "type", 1090617576);
        setIntField(term202, term202.getClass(), "type", 0);
        setField(term202, term202.getClass(), "next", null);
        setField(term202, term202.getClass(), "first", null);
        setField(term202, term202.getClass(), "last", null);
        setField(term202, term202.getClass(), "propListHead", null);
        setIntField(term202, term202.getClass(), "sourcePosition", 0);
        setField(term202, term202.getClass(), "jsType", null);
        setField(term202, term202.getClass(), "parent", null);
        setField(term200, term200.getClass(), "next", term202);
        setIntField(term205, term205.getClass(), "type", 0);
        setField(term205, term205.getClass(), "next", null);
        setField(term205, term205.getClass(), "first", null);
        setField(term205, term205.getClass(), "last", null);
        setField(term205, term205.getClass(), "propListHead", null);
        setIntField(term205, term205.getClass(), "sourcePosition", 0);
        setField(term205, term205.getClass(), "jsType", null);
        setField(term205, term205.getClass(), "parent", null);
        setField(term200, term200.getClass(), "first", term205);
        setIntField(term208, term208.getClass(), "type", 0);
        setField(term208, term208.getClass(), "next", null);
        setField(term208, term208.getClass(), "first", null);
        setField(term208, term208.getClass(), "last", null);
        setField(term208, term208.getClass(), "propListHead", null);
        setIntField(term208, term208.getClass(), "sourcePosition", 0);
        setField(term208, term208.getClass(), "jsType", null);
        setField(term208, term208.getClass(), "parent", null);
        setField(term200, term200.getClass(), "last", term208);
        setField(term211, term211.getClass(), "next", null);
        setIntField(term211, term211.getClass(), "type", 0);
        setIntField(term211, term211.getClass(), "intValue", 0);
        setField(term211, term211.getClass(), "objectValue", null);
        setField(term200, term200.getClass(), "propListHead", term211);
        setIntField(term200, term200.getClass(), "sourcePosition", 1442160736);
        setField(term200, term200.getClass(), "jsType", null);
        setField(term200, term200.getClass(), "parent", null);
        setField(term198, term198.getClass(), "next", term200);
        setIntField(term215, term215.getClass(), "type", 0);
        setField(term215, term215.getClass(), "next", null);
        setField(term215, term215.getClass(), "first", null);
        setField(term215, term215.getClass(), "last", null);
        setField(term215, term215.getClass(), "propListHead", null);
        setIntField(term215, term215.getClass(), "sourcePosition", 0);
        setField(term215, term215.getClass(), "jsType", null);
        setField(term215, term215.getClass(), "parent", null);
        setField(term198, term198.getClass(), "first", term215);
        setIntField(term218, term218.getClass(), "type", 0);
        setField(term218, term218.getClass(), "next", null);
        setField(term218, term218.getClass(), "first", null);
        setField(term218, term218.getClass(), "last", null);
        setField(term218, term218.getClass(), "propListHead", null);
        setIntField(term218, term218.getClass(), "sourcePosition", 0);
        setField(term218, term218.getClass(), "jsType", null);
        setField(term218, term218.getClass(), "parent", null);
        setField(term198, term198.getClass(), "last", term218);
        setField(term221, term221.getClass(), "next", null);
        setIntField(term221, term221.getClass(), "type", 0);
        setIntField(term221, term221.getClass(), "intValue", 0);
        setField(term221, term221.getClass(), "objectValue", null);
        setField(term198, term198.getClass(), "propListHead", term221);
        setIntField(term198, term198.getClass(), "sourcePosition", 1114000454);
        setField(term198, term198.getClass(), "jsType", null);
        setField(term198, term198.getClass(), "parent", null);
        setField(term197, term197.getClass(), "node", term198);
        setField(term197, term197.getClass(), "definition", null);
        setField(term197, term197.getClass(), "module", null);
        setBooleanField(term197, term197.getClass(), "inGlobalScope", false);
        setBooleanField(term197, term197.getClass(), "inExterns", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.DefinitionSite");
        Object[] args = new Object[2];
        args[0] = term182;
        args[1] = term197;
        try {
            callMethod(klass, "isEligibleDefinition", argTypes, term181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


