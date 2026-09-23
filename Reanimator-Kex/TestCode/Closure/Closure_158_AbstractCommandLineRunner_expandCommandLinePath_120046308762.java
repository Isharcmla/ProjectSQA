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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashSet;

public class AbstractCommandLineRunner_expandCommandLinePath_120046308762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26788;

    public AbstractCommandLineRunner_expandCommandLinePath_120046308762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term26808 = new HashSet();
        HashSet term26809 = new HashSet();
        Object term26803 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term26804 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term26804, term26804.getClass(), "name", null);
        setField(term26804, term26804.getClass(), "inputs", null);
        setField(term26804, term26804.getClass(), "deps", null);
        setIntField(term26804, term26804.getClass(), "depth", 1107176718);
        setField(term26803, term26803.getClass(), "module", term26804);
        setBooleanField(term26803, term26803.getClass(), "isExtern", false);
        setField(term26803, term26803.getClass(), "name", "");
        setField(term26803, term26803.getClass(), "ast", null);
        setField(term26803, term26803.getClass(), "provides", term26808);
        setField(term26803, term26803.getClass(), "requires", term26809);
        setBooleanField(term26803, term26803.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term26803, term26803.getClass(), "errorManager", null);
        setField(term26803, term26803.getClass(), "compiler", null);
        Object term26811 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term26812 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term26812, term26812.getClass(), "name", null);
        setField(term26812, term26812.getClass(), "inputs", null);
        setField(term26812, term26812.getClass(), "deps", null);
        setIntField(term26812, term26812.getClass(), "depth", 0);
        setField(term26811, term26811.getClass(), "module", term26812);
        setBooleanField(term26811, term26811.getClass(), "isExtern", false);
        setField(term26811, term26811.getClass(), "name", "");
        setField(term26811, term26811.getClass(), "ast", null);
        setField(term26811, term26811.getClass(), "provides", null);
        setField(term26811, term26811.getClass(), "requires", null);
        setBooleanField(term26811, term26811.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term26811, term26811.getClass(), "errorManager", null);
        setField(term26811, term26811.getClass(), "compiler", null);
        Object term26817 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term26817, term26817.getClass(), "module", null);
        setBooleanField(term26817, term26817.getClass(), "isExtern", false);
        setField(term26817, term26817.getClass(), "name", null);
        setField(term26817, term26817.getClass(), "ast", null);
        setField(term26817, term26817.getClass(), "provides", null);
        setField(term26817, term26817.getClass(), "requires", null);
        setBooleanField(term26817, term26817.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term26817, term26817.getClass(), "errorManager", null);
        setField(term26817, term26817.getClass(), "compiler", null);
        Object term26820 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term26820, term26820.getClass(), "module", null);
        setBooleanField(term26820, term26820.getClass(), "isExtern", false);
        setField(term26820, term26820.getClass(), "name", null);
        setField(term26820, term26820.getClass(), "ast", null);
        setField(term26820, term26820.getClass(), "provides", null);
        setField(term26820, term26820.getClass(), "requires", null);
        setBooleanField(term26820, term26820.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term26820, term26820.getClass(), "errorManager", null);
        setField(term26820, term26820.getClass(), "compiler", null);
        HashSet term26828 = new HashSet();
        HashSet term26829 = new HashSet();
        Object term26823 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term26824 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term26824, term26824.getClass(), "name", null);
        setField(term26824, term26824.getClass(), "inputs", null);
        setField(term26824, term26824.getClass(), "deps", null);
        setIntField(term26824, term26824.getClass(), "depth", 568954359);
        setField(term26823, term26823.getClass(), "module", term26824);
        setBooleanField(term26823, term26823.getClass(), "isExtern", true);
        setField(term26823, term26823.getClass(), "name", "");
        setField(term26823, term26823.getClass(), "ast", null);
        setField(term26823, term26823.getClass(), "provides", term26828);
        setField(term26823, term26823.getClass(), "requires", term26829);
        setBooleanField(term26823, term26823.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term26823, term26823.getClass(), "errorManager", null);
        setField(term26823, term26823.getClass(), "compiler", null);
        HashSet term26836 = new HashSet();
        HashSet term26837 = new HashSet();
        Object term26831 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term26832 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term26832, term26832.getClass(), "name", null);
        setField(term26832, term26832.getClass(), "inputs", null);
        setField(term26832, term26832.getClass(), "deps", null);
        setIntField(term26832, term26832.getClass(), "depth", -375014958);
        setField(term26831, term26831.getClass(), "module", term26832);
        setBooleanField(term26831, term26831.getClass(), "isExtern", false);
        setField(term26831, term26831.getClass(), "name", "");
        setField(term26831, term26831.getClass(), "ast", null);
        setField(term26831, term26831.getClass(), "provides", term26836);
        setField(term26831, term26831.getClass(), "requires", term26837);
        setBooleanField(term26831, term26831.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term26831, term26831.getClass(), "errorManager", null);
        setField(term26831, term26831.getClass(), "compiler", null);
        ArrayList term26801 = new ArrayList();
        ((ArrayList) term26801).add(term26803);
        ((ArrayList) term26801).add(term26811);
        ((ArrayList) term26801).add(term26817);
        ((ArrayList) term26801).add(term26820);
        ((ArrayList) term26801).add(term26820);
        ((ArrayList) term26801).add(term26823);
        ((ArrayList) term26801).add(term26811);
        ((ArrayList) term26801).add(term26811);
        ((ArrayList) term26801).add(term26831);
        Object term26843 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term26843, term26843.getClass(), "name", null);
        setField(term26843, term26843.getClass(), "inputs", null);
        setField(term26843, term26843.getClass(), "deps", null);
        setIntField(term26843, term26843.getClass(), "depth", 0);
        Object term26845 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term26845, term26845.getClass(), "name", null);
        setField(term26845, term26845.getClass(), "inputs", null);
        setField(term26845, term26845.getClass(), "deps", null);
        setIntField(term26845, term26845.getClass(), "depth", 0);
        Object term26847 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term26847, term26847.getClass(), "name", null);
        setField(term26847, term26847.getClass(), "inputs", null);
        setField(term26847, term26847.getClass(), "deps", null);
        setIntField(term26847, term26847.getClass(), "depth", 0);
        ArrayList term26841 = new ArrayList();
        ((ArrayList) term26841).add(term26843);
        ((ArrayList) term26841).add(term26843);
        ((ArrayList) term26841).add(term26845);
        ((ArrayList) term26841).add(term26847);
        ((ArrayList) term26841).add(term26832);
        ((ArrayList) term26841).add(term26843);
        term26788 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term26788, term26788.getClass(), "name", "ITrhiKKzcb");
        setField(term26788, term26788.getClass(), "inputs", term26801);
        setField(term26788, term26788.getClass(), "deps", term26841);
        setIntField(term26788, term26788.getClass(), "depth", 480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[2];
        args[0] = "UsxeLMVkAK";
        args[1] = term26788;
        try {
            callMethod(klass, "expandCommandLinePath", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


