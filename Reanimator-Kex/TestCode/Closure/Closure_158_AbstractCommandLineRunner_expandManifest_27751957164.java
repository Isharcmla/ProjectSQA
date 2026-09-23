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

public class AbstractCommandLineRunner_expandManifest_27751957164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31186;

    public AbstractCommandLineRunner_expandManifest_27751957164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term31206 = new HashSet();
        HashSet term31207 = new HashSet();
        Object term31201 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term31202 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term31202, term31202.getClass(), "name", null);
        setField(term31202, term31202.getClass(), "inputs", null);
        setField(term31202, term31202.getClass(), "deps", null);
        setIntField(term31202, term31202.getClass(), "depth", -2063457669);
        setField(term31201, term31201.getClass(), "module", term31202);
        setBooleanField(term31201, term31201.getClass(), "isExtern", false);
        setField(term31201, term31201.getClass(), "name", "");
        setField(term31201, term31201.getClass(), "ast", null);
        setField(term31201, term31201.getClass(), "provides", term31206);
        setField(term31201, term31201.getClass(), "requires", term31207);
        setBooleanField(term31201, term31201.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term31201, term31201.getClass(), "errorManager", null);
        setField(term31201, term31201.getClass(), "compiler", null);
        Object term31209 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term31209, term31209.getClass(), "module", null);
        setBooleanField(term31209, term31209.getClass(), "isExtern", false);
        setField(term31209, term31209.getClass(), "name", null);
        setField(term31209, term31209.getClass(), "ast", null);
        setField(term31209, term31209.getClass(), "provides", null);
        setField(term31209, term31209.getClass(), "requires", null);
        setBooleanField(term31209, term31209.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term31209, term31209.getClass(), "errorManager", null);
        setField(term31209, term31209.getClass(), "compiler", null);
        Object term31212 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term31212, term31212.getClass(), "module", null);
        setBooleanField(term31212, term31212.getClass(), "isExtern", false);
        setField(term31212, term31212.getClass(), "name", null);
        setField(term31212, term31212.getClass(), "ast", null);
        setField(term31212, term31212.getClass(), "provides", null);
        setField(term31212, term31212.getClass(), "requires", null);
        setBooleanField(term31212, term31212.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term31212, term31212.getClass(), "errorManager", null);
        setField(term31212, term31212.getClass(), "compiler", null);
        ArrayList term31199 = new ArrayList();
        ((ArrayList) term31199).add(term31201);
        ((ArrayList) term31199).add(term31209);
        ((ArrayList) term31199).add(term31209);
        ((ArrayList) term31199).add(term31212);
        Object term31219 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term31219, term31219.getClass(), "name", null);
        setField(term31219, term31219.getClass(), "inputs", null);
        setField(term31219, term31219.getClass(), "deps", null);
        setIntField(term31219, term31219.getClass(), "depth", 0);
        Object term31221 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term31221, term31221.getClass(), "name", null);
        setField(term31221, term31221.getClass(), "inputs", null);
        setField(term31221, term31221.getClass(), "deps", null);
        setIntField(term31221, term31221.getClass(), "depth", 0);
        ArrayList term31225 = new ArrayList();
        ((ArrayList) term31225).add((Object)null);
        ArrayList term31228 = new ArrayList();
        Object term31223 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term31223, term31223.getClass(), "name", "");
        setField(term31223, term31223.getClass(), "inputs", term31225);
        setField(term31223, term31223.getClass(), "deps", term31228);
        setIntField(term31223, term31223.getClass(), "depth", -1963464809);
        ArrayList term31234 = new ArrayList();
        ArrayList term31237 = new ArrayList();
        ((ArrayList) term31237).add((Object)null);
        ((ArrayList) term31237).add((Object)null);
        ((ArrayList) term31237).add((Object)null);
        ((ArrayList) term31237).add((Object)null);
        ((ArrayList) term31237).add((Object)null);
        Object term31232 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term31232, term31232.getClass(), "name", "");
        setField(term31232, term31232.getClass(), "inputs", term31234);
        setField(term31232, term31232.getClass(), "deps", term31237);
        setIntField(term31232, term31232.getClass(), "depth", -2015048153);
        ArrayList term31243 = new ArrayList();
        ((ArrayList) term31243).add((Object)null);
        ((ArrayList) term31243).add((Object)null);
        ArrayList term31246 = new ArrayList();
        ((ArrayList) term31246).add((Object)null);
        ((ArrayList) term31246).add((Object)null);
        ((ArrayList) term31246).add((Object)null);
        Object term31241 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term31241, term31241.getClass(), "name", "");
        setField(term31241, term31241.getClass(), "inputs", term31243);
        setField(term31241, term31241.getClass(), "deps", term31246);
        setIntField(term31241, term31241.getClass(), "depth", 71190297);
        ArrayList term31217 = new ArrayList();
        ((ArrayList) term31217).add(term31219);
        ((ArrayList) term31217).add(term31221);
        ((ArrayList) term31217).add(term31223);
        ((ArrayList) term31217).add(term31232);
        ((ArrayList) term31217).add(term31241);
        ((ArrayList) term31217).add(term31221);
        ((ArrayList) term31217).add(term31219);
        ((ArrayList) term31217).add(term31219);
        term31186 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term31186, term31186.getClass(), "name", "vjNPcTSqmS");
        setField(term31186, term31186.getClass(), "inputs", term31199);
        setField(term31186, term31186.getClass(), "deps", term31217);
        setIntField(term31186, term31186.getClass(), "depth", -1222006000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = term31186;
        try {
            callMethod(klass, "expandManifest", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


