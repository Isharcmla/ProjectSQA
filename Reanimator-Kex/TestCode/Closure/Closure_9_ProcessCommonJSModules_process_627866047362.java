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
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193178;
     Object term193270;
     Object term194395;
     Object term194396;

    public ProcessCommonJSModules_process_627866047362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193178 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term193178, term193178.getClass(), "compiler", null);
        term193270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term193362 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term193454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term193524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term193270, term193270.getClass(), "type", 0);
        setField(term193270, term193270.getClass(), "parent", null);
        setField(term193362, term193362.getClass(), "next", null);
        setIntField(term193362, term193362.getClass(), "type", 0);
        setField(term193524, term193524.getClass(), "next", null);
        setIntField(term193524, term193524.getClass(), "type", 0);
        setField(term193524, term193524.getClass(), "first", null);
        setField(term193454, term193454.getClass(), "next", term193524);
        setIntField(term193454, term193454.getClass(), "type", 0);
        setField(term193454, term193454.getClass(), "first", null);
        setField(term193362, term193362.getClass(), "first", term193454);
        setField(term193270, term193270.getClass(), "first", term193362);
        term194395 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term194395, term194395.getClass(), "compiler", null);
        setField(term194395, term194395.getClass(), "filenamePrefix", null);
        setBooleanField(term194395, term194395.getClass(), "reportDependencies", false);
        setField(term194395, term194395.getClass(), "module", null);
        term194396 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term194396, term194396.getClass(), "number", 0.0);
        setIntField(term194396, term194396.getClass(), "type", 0);
        setField(term194396, term194396.getClass(), "next", null);
        setDoubleField(term194397, term194397.getClass(), "number", 0.0);
        setIntField(term194397, term194397.getClass(), "type", 0);
        setField(term194397, term194397.getClass(), "next", null);
        setDoubleField(term194398, term194398.getClass(), "number", 0.0);
        setIntField(term194398, term194398.getClass(), "type", 0);
        setIntField(term194399, term194399.getClass(), "type", 0);
        setField(term194399, term194399.getClass(), "next", null);
        setField(term194399, term194399.getClass(), "first", null);
        setField(term194399, term194399.getClass(), "last", null);
        setField(term194399, term194399.getClass(), "propListHead", null);
        setIntField(term194399, term194399.getClass(), "sourcePosition", 0);
        setField(term194399, term194399.getClass(), "jsType", null);
        setField(term194399, term194399.getClass(), "parent", null);
        setField(term194398, term194398.getClass(), "next", term194399);
        setField(term194398, term194398.getClass(), "first", null);
        setField(term194398, term194398.getClass(), "last", null);
        setField(term194398, term194398.getClass(), "propListHead", null);
        setIntField(term194398, term194398.getClass(), "sourcePosition", 0);
        setField(term194398, term194398.getClass(), "jsType", null);
        setField(term194398, term194398.getClass(), "parent", null);
        setField(term194397, term194397.getClass(), "first", term194398);
        setField(term194397, term194397.getClass(), "last", null);
        setField(term194397, term194397.getClass(), "propListHead", null);
        setIntField(term194397, term194397.getClass(), "sourcePosition", 0);
        setField(term194397, term194397.getClass(), "jsType", null);
        setField(term194397, term194397.getClass(), "parent", null);
        setField(term194396, term194396.getClass(), "first", term194397);
        setField(term194396, term194396.getClass(), "last", null);
        setField(term194396, term194396.getClass(), "propListHead", null);
        setIntField(term194396, term194396.getClass(), "sourcePosition", 0);
        setField(term194396, term194396.getClass(), "jsType", null);
        setField(term194396, term194396.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term193270;
        callMethod(klass, "process", argTypes, term193178, args);
        assertTrue(recursiveEquals(term193178, term194395));
        assertTrue(recursiveEquals(term193270, null));
    }

};


