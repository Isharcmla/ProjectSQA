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
import java.util.ArrayList;

public class ProcessCommonJSModules_guessCJSModuleName_16963338811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;
     Object term1584;

    public ProcessCommonJSModules_guessCJSModuleName_16963338811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term200 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term200, term200.getClass(), "module", null);
        setField(term200, term200.getClass(), "id", null);
        setField(term200, term200.getClass(), "ast", null);
        setField(term200, term200.getClass(), "provides", null);
        setField(term200, term200.getClass(), "requires", null);
        setBooleanField(term200, term200.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term200, term200.getClass(), "compiler", null);
        Object term202 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term202, term202.getClass(), "module", null);
        setField(term202, term202.getClass(), "id", null);
        setField(term202, term202.getClass(), "ast", null);
        setField(term202, term202.getClass(), "provides", null);
        setField(term202, term202.getClass(), "requires", null);
        setBooleanField(term202, term202.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term202, term202.getClass(), "compiler", null);
        Object term204 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term204, term204.getClass(), "module", null);
        setField(term204, term204.getClass(), "id", null);
        setField(term204, term204.getClass(), "ast", null);
        setField(term204, term204.getClass(), "provides", null);
        setField(term204, term204.getClass(), "requires", null);
        setBooleanField(term204, term204.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term204, term204.getClass(), "compiler", null);
        ArrayList term198 = new ArrayList();
        ((ArrayList) term198).add(term200);
        ((ArrayList) term198).add(term202);
        ((ArrayList) term198).add(term204);
        Object term210 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term210, term210.getClass(), "name", null);
        setField(term210, term210.getClass(), "inputs", null);
        setField(term210, term210.getClass(), "deps", null);
        setIntField(term210, term210.getClass(), "depth", 590364439);
        Object term212 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term212, term212.getClass(), "name", null);
        setField(term212, term212.getClass(), "inputs", null);
        setField(term212, term212.getClass(), "deps", null);
        setIntField(term212, term212.getClass(), "depth", -1007160944);
        ArrayList term208 = new ArrayList();
        ((ArrayList) term208).add(term210);
        ((ArrayList) term208).add(term212);
        term171 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term185 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term171, term171.getClass(), "compiler", null);
        setField(term171, term171.getClass(), "filenamePrefix", "xrwlQZdwCp");
        setBooleanField(term171, term171.getClass(), "reportDependencies", true);
        setField(term185, term185.getClass(), "name", "IDCWpPLRkE");
        setField(term185, term185.getClass(), "inputs", term198);
        setField(term185, term185.getClass(), "deps", term208);
        setIntField(term185, term185.getClass(), "depth", -1275173084);
        setField(term171, term171.getClass(), "module", term185);
        Object term1592 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term1592, term1592.getClass(), "module", null);
        setField(term1592, term1592.getClass(), "id", null);
        setField(term1592, term1592.getClass(), "ast", null);
        setField(term1592, term1592.getClass(), "provides", null);
        setField(term1592, term1592.getClass(), "requires", null);
        setBooleanField(term1592, term1592.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term1592, term1592.getClass(), "compiler", null);
        Object term1593 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term1593, term1593.getClass(), "module", null);
        setField(term1593, term1593.getClass(), "id", null);
        setField(term1593, term1593.getClass(), "ast", null);
        setField(term1593, term1593.getClass(), "provides", null);
        setField(term1593, term1593.getClass(), "requires", null);
        setBooleanField(term1593, term1593.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term1593, term1593.getClass(), "compiler", null);
        Object term1594 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term1594, term1594.getClass(), "module", null);
        setField(term1594, term1594.getClass(), "id", null);
        setField(term1594, term1594.getClass(), "ast", null);
        setField(term1594, term1594.getClass(), "provides", null);
        setField(term1594, term1594.getClass(), "requires", null);
        setBooleanField(term1594, term1594.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term1594, term1594.getClass(), "compiler", null);
        ArrayList term1590 = new ArrayList();
        ((ArrayList) term1590).add(term1592);
        ((ArrayList) term1590).add(term1593);
        ((ArrayList) term1590).add(term1594);
        Object term1597 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term1597, term1597.getClass(), "name", null);
        setField(term1597, term1597.getClass(), "inputs", null);
        setField(term1597, term1597.getClass(), "deps", null);
        setIntField(term1597, term1597.getClass(), "depth", 590364439);
        Object term1598 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term1598, term1598.getClass(), "name", null);
        setField(term1598, term1598.getClass(), "inputs", null);
        setField(term1598, term1598.getClass(), "deps", null);
        setIntField(term1598, term1598.getClass(), "depth", -1007160944);
        ArrayList term1595 = new ArrayList();
        ((ArrayList) term1595).add(term1597);
        ((ArrayList) term1595).add(term1598);
        term1584 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term1587 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term1584, term1584.getClass(), "compiler", null);
        setField(term1584, term1584.getClass(), "filenamePrefix", "xrwlQZdwCp");
        setBooleanField(term1584, term1584.getClass(), "reportDependencies", true);
        setField(term1587, term1587.getClass(), "name", "IDCWpPLRkE");
        setField(term1587, term1587.getClass(), "inputs", term1590);
        setField(term1587, term1587.getClass(), "deps", term1595);
        setIntField(term1587, term1587.getClass(), "depth", -1275173084);
        setField(term1584, term1584.getClass(), "module", term1587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        Object retValue = callMethod(klass, "guessCJSModuleName", argTypes, term171, args);
        assertTrue(recursiveEquals(term171, term1584));
        assertTrue(recursiveEquals(retValue, "module$oVgzLbrsFr"));
    }

};


