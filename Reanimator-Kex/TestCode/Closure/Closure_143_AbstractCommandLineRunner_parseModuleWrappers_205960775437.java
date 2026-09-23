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
import java.util.ArrayList;
import java.util.HashMap;

public class AbstractCommandLineRunner_parseModuleWrappers_205960775437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6221;
     Object term6224;
     Object term64046;
     Object term64047;
     Object term63985;

    public AbstractCommandLineRunner_parseModuleWrappers_205960775437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6221 = new LinkedList();
        Object term6240 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term6240, term6240.getClass(), "module", null);
        setBooleanField(term6240, term6240.getClass(), "isExtern", false);
        setField(term6240, term6240.getClass(), "name", null);
        setField(term6240, term6240.getClass(), "ast", null);
        setField(term6240, term6240.getClass(), "provides", null);
        setField(term6240, term6240.getClass(), "requires", null);
        setBooleanField(term6240, term6240.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term6240, term6240.getClass(), "errorManager", null);
        setField(term6240, term6240.getClass(), "compiler", null);
        Object term6243 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term6243, term6243.getClass(), "module", null);
        setBooleanField(term6243, term6243.getClass(), "isExtern", false);
        setField(term6243, term6243.getClass(), "name", null);
        setField(term6243, term6243.getClass(), "ast", null);
        setField(term6243, term6243.getClass(), "provides", null);
        setField(term6243, term6243.getClass(), "requires", null);
        setBooleanField(term6243, term6243.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term6243, term6243.getClass(), "errorManager", null);
        setField(term6243, term6243.getClass(), "compiler", null);
        Object term6246 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term6246, term6246.getClass(), "module", null);
        setBooleanField(term6246, term6246.getClass(), "isExtern", false);
        setField(term6246, term6246.getClass(), "name", null);
        setField(term6246, term6246.getClass(), "ast", null);
        setField(term6246, term6246.getClass(), "provides", null);
        setField(term6246, term6246.getClass(), "requires", null);
        setBooleanField(term6246, term6246.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term6246, term6246.getClass(), "errorManager", null);
        setField(term6246, term6246.getClass(), "compiler", null);
        Object term6249 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term6249, term6249.getClass(), "module", null);
        setBooleanField(term6249, term6249.getClass(), "isExtern", false);
        setField(term6249, term6249.getClass(), "name", null);
        setField(term6249, term6249.getClass(), "ast", null);
        setField(term6249, term6249.getClass(), "provides", null);
        setField(term6249, term6249.getClass(), "requires", null);
        setBooleanField(term6249, term6249.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term6249, term6249.getClass(), "errorManager", null);
        setField(term6249, term6249.getClass(), "compiler", null);
        ArrayList term6238 = new ArrayList();
        ((ArrayList) term6238).add(term6240);
        ((ArrayList) term6238).add(term6243);
        ((ArrayList) term6238).add(term6243);
        ((ArrayList) term6238).add(term6246);
        ((ArrayList) term6238).add(term6249);
        ((ArrayList) term6238).add(term6249);
        Object term6256 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term6256, term6256.getClass(), "name", null);
        setField(term6256, term6256.getClass(), "inputs", null);
        setField(term6256, term6256.getClass(), "deps", null);
        Object term6257 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term6257, term6257.getClass(), "name", null);
        setField(term6257, term6257.getClass(), "inputs", null);
        setField(term6257, term6257.getClass(), "deps", null);
        ArrayList term6254 = new ArrayList();
        ((ArrayList) term6254).add(term6256);
        ((ArrayList) term6254).add(term6257);
        ((ArrayList) term6254).add(term6257);
        term6224 = (Object[]) newArray("com.google.javascript.jscomp.JSModule", 1);
        Object term6225 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term6225, term6225.getClass(), "name", "jDtqGUpnZN");
        setField(term6225, term6225.getClass(), "inputs", term6238);
        setField(term6225, term6225.getClass(), "deps", term6254);
        setElement(term6224, 0, term6225);
        term64046 = new LinkedList();
        Object term64053 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term64053, term64053.getClass(), "module", null);
        setBooleanField(term64053, term64053.getClass(), "isExtern", false);
        setField(term64053, term64053.getClass(), "name", null);
        setField(term64053, term64053.getClass(), "ast", null);
        setField(term64053, term64053.getClass(), "provides", null);
        setField(term64053, term64053.getClass(), "requires", null);
        setBooleanField(term64053, term64053.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term64053, term64053.getClass(), "errorManager", null);
        setField(term64053, term64053.getClass(), "compiler", null);
        Object term64054 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term64054, term64054.getClass(), "module", null);
        setBooleanField(term64054, term64054.getClass(), "isExtern", false);
        setField(term64054, term64054.getClass(), "name", null);
        setField(term64054, term64054.getClass(), "ast", null);
        setField(term64054, term64054.getClass(), "provides", null);
        setField(term64054, term64054.getClass(), "requires", null);
        setBooleanField(term64054, term64054.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term64054, term64054.getClass(), "errorManager", null);
        setField(term64054, term64054.getClass(), "compiler", null);
        Object term64055 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term64055, term64055.getClass(), "module", null);
        setBooleanField(term64055, term64055.getClass(), "isExtern", false);
        setField(term64055, term64055.getClass(), "name", null);
        setField(term64055, term64055.getClass(), "ast", null);
        setField(term64055, term64055.getClass(), "provides", null);
        setField(term64055, term64055.getClass(), "requires", null);
        setBooleanField(term64055, term64055.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term64055, term64055.getClass(), "errorManager", null);
        setField(term64055, term64055.getClass(), "compiler", null);
        Object term64056 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term64056, term64056.getClass(), "module", null);
        setBooleanField(term64056, term64056.getClass(), "isExtern", false);
        setField(term64056, term64056.getClass(), "name", null);
        setField(term64056, term64056.getClass(), "ast", null);
        setField(term64056, term64056.getClass(), "provides", null);
        setField(term64056, term64056.getClass(), "requires", null);
        setBooleanField(term64056, term64056.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term64056, term64056.getClass(), "errorManager", null);
        setField(term64056, term64056.getClass(), "compiler", null);
        ArrayList term64051 = new ArrayList();
        ((ArrayList) term64051).add(term64053);
        ((ArrayList) term64051).add(term64054);
        ((ArrayList) term64051).add(term64054);
        ((ArrayList) term64051).add(term64055);
        ((ArrayList) term64051).add(term64056);
        ((ArrayList) term64051).add(term64056);
        Object term64059 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term64059, term64059.getClass(), "name", null);
        setField(term64059, term64059.getClass(), "inputs", null);
        setField(term64059, term64059.getClass(), "deps", null);
        Object term64060 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term64060, term64060.getClass(), "name", null);
        setField(term64060, term64060.getClass(), "inputs", null);
        setField(term64060, term64060.getClass(), "deps", null);
        ArrayList term64057 = new ArrayList();
        ((ArrayList) term64057).add(term64059);
        ((ArrayList) term64057).add(term64060);
        ((ArrayList) term64057).add(term64060);
        term64047 = (Object[]) newArray("com.google.javascript.jscomp.JSModule", 1);
        Object term64048 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term64048, term64048.getClass(), "name", "jDtqGUpnZN");
        setField(term64048, term64048.getClass(), "inputs", term64051);
        setField(term64048, term64048.getClass(), "deps", term64057);
        setElement(term64047, 0, term64048);
        term63985 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term6221;
        args[1] = term6224;
        Object retValue = callMethod(klass, "parseModuleWrappers", argTypes, null, args);
        assertTrue(recursiveEquals(term6221, term64046));
        assertTrue(recursiveEquals(term6224, term64047));
        assertTrue(recursiveEquals(retValue, term63985));
    }

};


