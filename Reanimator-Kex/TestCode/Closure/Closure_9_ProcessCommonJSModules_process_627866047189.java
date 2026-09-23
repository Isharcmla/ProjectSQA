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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProcessCommonJSModules_process_627866047189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93530;
     Object term93600;
     Object term97584;
     Object term97588;

    public ProcessCommonJSModules_process_627866047189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93530 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term93530, term93530.getClass(), "compiler", null);
        term93600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93600, term93600.getClass(), "type", 0);
        setField(term93600, term93600.getClass(), "parent", null);
        setField(term93740, term93740.getClass(), "next", null);
        setIntField(term93740, term93740.getClass(), "type", 37);
        setField(term93740, term93740.getClass(), "first", null);
        setField(term93670, term93670.getClass(), "next", term93740);
        setIntField(term93670, term93670.getClass(), "type", 33);
        setField(term93810, term93810.getClass(), "next", null);
        setIntField(term93810, term93810.getClass(), "type", 0);
        setField(term93810, term93810.getClass(), "first", null);
        setField(term93670, term93670.getClass(), "first", term93810);
        setField(term93600, term93600.getClass(), "first", term93670);
        HashMap term97586 = new HashMap();
        Set<Object> term97590 =  ((Map) term97586).keySet();
        HashSet term97585 = new HashSet((Collection<? extends Object>) term97590);
        term97584 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules$ProcessCommonJsModulesCallback"));
        Object term97587 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setIntField(term97584, term97584.getClass(), "scriptNodeCount", 0);
        setField(term97584, term97584.getClass(), "modulesWithExports", term97585);
        setField(term97587, term97587.getClass(), "compiler", null);
        setField(term97587, term97587.getClass(), "filenamePrefix", null);
        setBooleanField(term97587, term97587.getClass(), "reportDependencies", false);
        setField(term97587, term97587.getClass(), "module", null);
        setField(term97584, term97584.getClass(), "this$0", term97587);
        HashMap term97589 = new HashMap();
        Set<Object> term97591 =  ((Map) term97589).keySet();
        term97588 = new HashSet((Collection<? extends Object>) term97591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term93600;
        callMethod(klass, "process", argTypes, term93530, args);
        assertTrue(recursiveEquals(term93530, term97584));
        assertTrue(recursiveEquals(term93600, null));
    }

};


