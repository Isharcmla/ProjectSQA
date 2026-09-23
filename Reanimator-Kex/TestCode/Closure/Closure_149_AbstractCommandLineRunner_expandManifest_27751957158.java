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

public class AbstractCommandLineRunner_expandManifest_27751957158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25354;

    public AbstractCommandLineRunner_expandManifest_27751957158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term25374 = new HashSet();
        HashSet term25375 = new HashSet();
        Object term25369 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term25370 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term25370, term25370.getClass(), "name", null);
        setField(term25370, term25370.getClass(), "inputs", null);
        setField(term25370, term25370.getClass(), "deps", null);
        setIntField(term25370, term25370.getClass(), "depth", -184153539);
        setField(term25369, term25369.getClass(), "module", term25370);
        setBooleanField(term25369, term25369.getClass(), "isExtern", true);
        setField(term25369, term25369.getClass(), "name", "");
        setField(term25369, term25369.getClass(), "ast", null);
        setField(term25369, term25369.getClass(), "provides", term25374);
        setField(term25369, term25369.getClass(), "requires", term25375);
        setBooleanField(term25369, term25369.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term25369, term25369.getClass(), "errorManager", null);
        setField(term25369, term25369.getClass(), "compiler", null);
        Object term25377 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term25377, term25377.getClass(), "module", null);
        setBooleanField(term25377, term25377.getClass(), "isExtern", false);
        setField(term25377, term25377.getClass(), "name", null);
        setField(term25377, term25377.getClass(), "ast", null);
        setField(term25377, term25377.getClass(), "provides", null);
        setField(term25377, term25377.getClass(), "requires", null);
        setBooleanField(term25377, term25377.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term25377, term25377.getClass(), "errorManager", null);
        setField(term25377, term25377.getClass(), "compiler", null);
        HashSet term25385 = new HashSet();
        HashSet term25386 = new HashSet();
        Object term25380 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term25381 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term25381, term25381.getClass(), "name", null);
        setField(term25381, term25381.getClass(), "inputs", null);
        setField(term25381, term25381.getClass(), "deps", null);
        setIntField(term25381, term25381.getClass(), "depth", 458147407);
        setField(term25380, term25380.getClass(), "module", term25381);
        setBooleanField(term25380, term25380.getClass(), "isExtern", false);
        setField(term25380, term25380.getClass(), "name", "");
        setField(term25380, term25380.getClass(), "ast", null);
        setField(term25380, term25380.getClass(), "provides", term25385);
        setField(term25380, term25380.getClass(), "requires", term25386);
        setBooleanField(term25380, term25380.getClass(), "generatedDependencyInfoFromSource", true);
        setField(term25380, term25380.getClass(), "errorManager", null);
        setField(term25380, term25380.getClass(), "compiler", null);
        Object term25388 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term25388, term25388.getClass(), "module", null);
        setBooleanField(term25388, term25388.getClass(), "isExtern", false);
        setField(term25388, term25388.getClass(), "name", null);
        setField(term25388, term25388.getClass(), "ast", null);
        setField(term25388, term25388.getClass(), "provides", null);
        setField(term25388, term25388.getClass(), "requires", null);
        setBooleanField(term25388, term25388.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term25388, term25388.getClass(), "errorManager", null);
        setField(term25388, term25388.getClass(), "compiler", null);
        ArrayList term25367 = new ArrayList();
        ((ArrayList) term25367).add(term25369);
        ((ArrayList) term25367).add(term25377);
        ((ArrayList) term25367).add(term25380);
        ((ArrayList) term25367).add(term25388);
        ((ArrayList) term25367).add(term25377);
        ArrayList term25397 = new ArrayList();
        ArrayList term25400 = new ArrayList();
        ((ArrayList) term25400).add((Object)null);
        ((ArrayList) term25400).add((Object)null);
        ((ArrayList) term25400).add((Object)null);
        ((ArrayList) term25400).add((Object)null);
        ((ArrayList) term25400).add((Object)null);
        Object term25395 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term25395, term25395.getClass(), "name", "");
        setField(term25395, term25395.getClass(), "inputs", term25397);
        setField(term25395, term25395.getClass(), "deps", term25400);
        setIntField(term25395, term25395.getClass(), "depth", 2055867847);
        Object term25404 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term25404, term25404.getClass(), "name", null);
        setField(term25404, term25404.getClass(), "inputs", null);
        setField(term25404, term25404.getClass(), "deps", null);
        setIntField(term25404, term25404.getClass(), "depth", 0);
        ArrayList term25408 = new ArrayList();
        ArrayList term25411 = new ArrayList();
        ((ArrayList) term25411).add((Object)null);
        ((ArrayList) term25411).add((Object)null);
        ((ArrayList) term25411).add((Object)null);
        ((ArrayList) term25411).add((Object)null);
        ((ArrayList) term25411).add((Object)null);
        ((ArrayList) term25411).add((Object)null);
        ((ArrayList) term25411).add((Object)null);
        ((ArrayList) term25411).add((Object)null);
        ((ArrayList) term25411).add((Object)null);
        Object term25406 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term25406, term25406.getClass(), "name", "");
        setField(term25406, term25406.getClass(), "inputs", term25408);
        setField(term25406, term25406.getClass(), "deps", term25411);
        setIntField(term25406, term25406.getClass(), "depth", -1048298087);
        Object term25415 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term25415, term25415.getClass(), "name", null);
        setField(term25415, term25415.getClass(), "inputs", null);
        setField(term25415, term25415.getClass(), "deps", null);
        setIntField(term25415, term25415.getClass(), "depth", 0);
        ArrayList term25393 = new ArrayList();
        ((ArrayList) term25393).add(term25395);
        ((ArrayList) term25393).add(term25404);
        ((ArrayList) term25393).add(term25406);
        ((ArrayList) term25393).add(term25370);
        ((ArrayList) term25393).add(term25415);
        term25354 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term25354, term25354.getClass(), "name", "OzXRsFGTIp");
        setField(term25354, term25354.getClass(), "inputs", term25367);
        setField(term25354, term25354.getClass(), "deps", term25393);
        setIntField(term25354, term25354.getClass(), "depth", 493620644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = term25354;
        try {
            callMethod(klass, "expandManifest", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


