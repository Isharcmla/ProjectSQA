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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;

public class GlobalNamespace_scanNewNodes_87186497053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12267;
     Object term12321;
     Object term12851;
     Object term12852;

    public GlobalNamespace_scanNewNodes_87186497053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12267 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term12487 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$AstChange"));
        Object term12557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12557, term12557.getClass(), "type", 0);
        setField(term12487, term12487.getClass(), "node", term12557);
        term12321 = new LinkedList();
        ((LinkedList) term12321).add(term12487);
        term12851 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term12851, term12851.getClass(), "compiler", null);
        setField(term12851, term12851.getClass(), "root", null);
        setField(term12851, term12851.getClass(), "externsRoot", null);
        setBooleanField(term12851, term12851.getClass(), "inExterns", false);
        setField(term12851, term12851.getClass(), "externsScope", null);
        setBooleanField(term12851, term12851.getClass(), "generated", false);
        setIntField(term12851, term12851.getClass(), "currentPreOrderIndex", 0);
        setField(term12851, term12851.getClass(), "globalNames", null);
        setField(term12851, term12851.getClass(), "nameMap", null);
        Object term12854 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$AstChange"));
        Object term12855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12854, term12854.getClass(), "module", null);
        setField(term12854, term12854.getClass(), "scope", null);
        setIntField(term12855, term12855.getClass(), "type", 0);
        setField(term12855, term12855.getClass(), "next", null);
        setField(term12855, term12855.getClass(), "first", null);
        setField(term12855, term12855.getClass(), "last", null);
        setField(term12855, term12855.getClass(), "propListHead", null);
        setIntField(term12855, term12855.getClass(), "sourcePosition", 0);
        setField(term12855, term12855.getClass(), "jsType", null);
        setField(term12855, term12855.getClass(), "parent", null);
        setField(term12854, term12854.getClass(), "node", term12855);
        term12852 = new LinkedList();
        ((LinkedList) term12852).add(term12854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term12321;
        callMethod(klass, "scanNewNodes", argTypes, term12267, args);
        assertTrue(recursiveEquals(term12267, term12851));
        assertTrue(recursiveEquals(term12321, term12852));
    }

};


