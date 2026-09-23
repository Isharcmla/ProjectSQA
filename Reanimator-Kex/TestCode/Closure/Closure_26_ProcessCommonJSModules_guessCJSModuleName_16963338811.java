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
     Object term1524;

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
        Object term1532 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term1532, term1532.getClass(), "module", null);
        setField(term1532, term1532.getClass(), "id", null);
        setField(term1532, term1532.getClass(), "ast", null);
        setField(term1532, term1532.getClass(), "provides", null);
        setField(term1532, term1532.getClass(), "requires", null);
        setBooleanField(term1532, term1532.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term1532, term1532.getClass(), "compiler", null);
        Object term1533 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term1533, term1533.getClass(), "module", null);
        setField(term1533, term1533.getClass(), "id", null);
        setField(term1533, term1533.getClass(), "ast", null);
        setField(term1533, term1533.getClass(), "provides", null);
        setField(term1533, term1533.getClass(), "requires", null);
        setBooleanField(term1533, term1533.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term1533, term1533.getClass(), "compiler", null);
        Object term1534 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term1534, term1534.getClass(), "module", null);
        setField(term1534, term1534.getClass(), "id", null);
        setField(term1534, term1534.getClass(), "ast", null);
        setField(term1534, term1534.getClass(), "provides", null);
        setField(term1534, term1534.getClass(), "requires", null);
        setBooleanField(term1534, term1534.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term1534, term1534.getClass(), "compiler", null);
        ArrayList term1530 = new ArrayList();
        ((ArrayList) term1530).add(term1532);
        ((ArrayList) term1530).add(term1533);
        ((ArrayList) term1530).add(term1534);
        Object term1537 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term1537, term1537.getClass(), "name", null);
        setField(term1537, term1537.getClass(), "inputs", null);
        setField(term1537, term1537.getClass(), "deps", null);
        setIntField(term1537, term1537.getClass(), "depth", 590364439);
        Object term1538 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term1538, term1538.getClass(), "name", null);
        setField(term1538, term1538.getClass(), "inputs", null);
        setField(term1538, term1538.getClass(), "deps", null);
        setIntField(term1538, term1538.getClass(), "depth", -1007160944);
        ArrayList term1535 = new ArrayList();
        ((ArrayList) term1535).add(term1537);
        ((ArrayList) term1535).add(term1538);
        term1524 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term1527 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term1524, term1524.getClass(), "compiler", null);
        setField(term1524, term1524.getClass(), "filenamePrefix", "xrwlQZdwCp");
        setBooleanField(term1524, term1524.getClass(), "reportDependencies", true);
        setField(term1527, term1527.getClass(), "name", "IDCWpPLRkE");
        setField(term1527, term1527.getClass(), "inputs", term1530);
        setField(term1527, term1527.getClass(), "deps", term1535);
        setIntField(term1527, term1527.getClass(), "depth", -1275173084);
        setField(term1524, term1524.getClass(), "module", term1527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        Object retValue = callMethod(klass, "guessCJSModuleName", argTypes, term171, args);
        assertTrue(recursiveEquals(term171, term1524));
        assertTrue(recursiveEquals(retValue, "module$oVgzLbrsFr"));
    }

};


