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

public class AbstractCommandLineRunner_expandCommandLinePath_120046308756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22289;

    public AbstractCommandLineRunner_expandCommandLinePath_120046308756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term22309 = new HashSet();
        HashSet term22310 = new HashSet();
        Object term22304 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term22305 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term22305, term22305.getClass(), "name", null);
        setField(term22305, term22305.getClass(), "inputs", null);
        setField(term22305, term22305.getClass(), "deps", null);
        setIntField(term22305, term22305.getClass(), "depth", -1016503459);
        setField(term22304, term22304.getClass(), "module", term22305);
        setBooleanField(term22304, term22304.getClass(), "isExtern", false);
        setField(term22304, term22304.getClass(), "name", "");
        setField(term22304, term22304.getClass(), "ast", null);
        setField(term22304, term22304.getClass(), "provides", term22309);
        setField(term22304, term22304.getClass(), "requires", term22310);
        setBooleanField(term22304, term22304.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term22304, term22304.getClass(), "errorManager", null);
        setField(term22304, term22304.getClass(), "compiler", null);
        Object term22312 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term22312, term22312.getClass(), "module", null);
        setBooleanField(term22312, term22312.getClass(), "isExtern", false);
        setField(term22312, term22312.getClass(), "name", null);
        setField(term22312, term22312.getClass(), "ast", null);
        setField(term22312, term22312.getClass(), "provides", null);
        setField(term22312, term22312.getClass(), "requires", null);
        setBooleanField(term22312, term22312.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term22312, term22312.getClass(), "errorManager", null);
        setField(term22312, term22312.getClass(), "compiler", null);
        Object term22315 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term22315, term22315.getClass(), "module", null);
        setBooleanField(term22315, term22315.getClass(), "isExtern", false);
        setField(term22315, term22315.getClass(), "name", null);
        setField(term22315, term22315.getClass(), "ast", null);
        setField(term22315, term22315.getClass(), "provides", null);
        setField(term22315, term22315.getClass(), "requires", null);
        setBooleanField(term22315, term22315.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term22315, term22315.getClass(), "errorManager", null);
        setField(term22315, term22315.getClass(), "compiler", null);
        HashSet term22323 = new HashSet();
        HashSet term22324 = new HashSet();
        Object term22318 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term22319 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term22319, term22319.getClass(), "name", null);
        setField(term22319, term22319.getClass(), "inputs", null);
        setField(term22319, term22319.getClass(), "deps", null);
        setIntField(term22319, term22319.getClass(), "depth", -817164822);
        setField(term22318, term22318.getClass(), "module", term22319);
        setBooleanField(term22318, term22318.getClass(), "isExtern", true);
        setField(term22318, term22318.getClass(), "name", "");
        setField(term22318, term22318.getClass(), "ast", null);
        setField(term22318, term22318.getClass(), "provides", term22323);
        setField(term22318, term22318.getClass(), "requires", term22324);
        setBooleanField(term22318, term22318.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term22318, term22318.getClass(), "errorManager", null);
        setField(term22318, term22318.getClass(), "compiler", null);
        Object term22326 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term22326, term22326.getClass(), "module", null);
        setBooleanField(term22326, term22326.getClass(), "isExtern", false);
        setField(term22326, term22326.getClass(), "name", null);
        setField(term22326, term22326.getClass(), "ast", null);
        setField(term22326, term22326.getClass(), "provides", null);
        setField(term22326, term22326.getClass(), "requires", null);
        setBooleanField(term22326, term22326.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term22326, term22326.getClass(), "errorManager", null);
        setField(term22326, term22326.getClass(), "compiler", null);
        Object term22329 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term22329, term22329.getClass(), "module", null);
        setBooleanField(term22329, term22329.getClass(), "isExtern", false);
        setField(term22329, term22329.getClass(), "name", null);
        setField(term22329, term22329.getClass(), "ast", null);
        setField(term22329, term22329.getClass(), "provides", null);
        setField(term22329, term22329.getClass(), "requires", null);
        setBooleanField(term22329, term22329.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term22329, term22329.getClass(), "errorManager", null);
        setField(term22329, term22329.getClass(), "compiler", null);
        Object term22332 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term22333 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term22333, term22333.getClass(), "name", null);
        setField(term22333, term22333.getClass(), "inputs", null);
        setField(term22333, term22333.getClass(), "deps", null);
        setIntField(term22333, term22333.getClass(), "depth", 0);
        setField(term22332, term22332.getClass(), "module", term22333);
        setBooleanField(term22332, term22332.getClass(), "isExtern", false);
        setField(term22332, term22332.getClass(), "name", "");
        setField(term22332, term22332.getClass(), "ast", null);
        setField(term22332, term22332.getClass(), "provides", null);
        setField(term22332, term22332.getClass(), "requires", null);
        setBooleanField(term22332, term22332.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term22332, term22332.getClass(), "errorManager", null);
        setField(term22332, term22332.getClass(), "compiler", null);
        ArrayList term22302 = new ArrayList();
        ((ArrayList) term22302).add(term22304);
        ((ArrayList) term22302).add(term22312);
        ((ArrayList) term22302).add(term22315);
        ((ArrayList) term22302).add(term22318);
        ((ArrayList) term22302).add(term22326);
        ((ArrayList) term22302).add(term22315);
        ((ArrayList) term22302).add(term22315);
        ((ArrayList) term22302).add(term22329);
        ((ArrayList) term22302).add(term22332);
        Object term22342 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term22342, term22342.getClass(), "name", null);
        setField(term22342, term22342.getClass(), "inputs", null);
        setField(term22342, term22342.getClass(), "deps", null);
        setIntField(term22342, term22342.getClass(), "depth", 0);
        Object term22344 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term22344, term22344.getClass(), "name", null);
        setField(term22344, term22344.getClass(), "inputs", null);
        setField(term22344, term22344.getClass(), "deps", null);
        setIntField(term22344, term22344.getClass(), "depth", 0);
        Object term22346 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term22346, term22346.getClass(), "name", null);
        setField(term22346, term22346.getClass(), "inputs", null);
        setField(term22346, term22346.getClass(), "deps", null);
        setIntField(term22346, term22346.getClass(), "depth", 0);
        ArrayList term22340 = new ArrayList();
        ((ArrayList) term22340).add(term22305);
        ((ArrayList) term22340).add(term22342);
        ((ArrayList) term22340).add(term22333);
        ((ArrayList) term22340).add(term22344);
        ((ArrayList) term22340).add(term22346);
        ((ArrayList) term22340).add(term22305);
        term22289 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term22289, term22289.getClass(), "name", "BwtdjiefJn");
        setField(term22289, term22289.getClass(), "inputs", term22302);
        setField(term22289, term22289.getClass(), "deps", term22340);
        setIntField(term22289, term22289.getClass(), "depth", -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[2];
        args[0] = "bnsyeQXFdu";
        args[1] = term22289;
        try {
            callMethod(klass, "expandCommandLinePath", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


