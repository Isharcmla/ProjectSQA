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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class VarCheck_createSynthesizedExternVar_198991254911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;

    public VarCheck_createSynthesizedExternVar_198991254911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term381 = new ArrayList();
        ((ArrayList) term381).add((Object)null);
        ArrayList term385 = new ArrayList();
        ((ArrayList) term385).add((Object)null);
        ((ArrayList) term385).add((Object)null);
        HashMap term404 = new HashMap();
        Set<Object> term3379 =  ((Map) term404).keySet();
        HashSet term403 = new HashSet((Collection<? extends Object>) term3379);
        HashMap term411 = new HashMap();
        Set<Object> term3380 =  ((Map) term411).keySet();
        HashSet term410 = new HashSet((Collection<? extends Object>) term3380);
        HashMap term421 = new HashMap();
        Set<Object> term3381 =  ((Map) term421).keySet();
        HashSet term420 = new HashSet((Collection<? extends Object>) term3381);
        term366 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term367 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term368 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term368, term368.getClass(), "name", "jiKYgYHqIS");
        setField(term368, term368.getClass(), "inputs", term381);
        setField(term368, term368.getClass(), "deps", term385);
        setIntField(term368, term368.getClass(), "depth", -112921587);
        setField(term367, term367.getClass(), "module", term368);
        setBooleanField(term367, term367.getClass(), "isExtern", false);
        setField(term367, term367.getClass(), "name", "VMeAzAHwZj");
        setField(term367, term367.getClass(), "ast", null);
        setField(term367, term367.getClass(), "provides", term403);
        setField(term367, term367.getClass(), "requires", term410);
        setBooleanField(term367, term367.getClass(), "generatedDependencyInfoFromSource", false);
        setField(term367, term367.getClass(), "errorManager", null);
        setField(term367, term367.getClass(), "compiler", null);
        setField(term366, term366.getClass(), "synthesizedExternsInput", term367);
        setIntField(term417, term417.getClass(), "type", 0);
        setField(term417, term417.getClass(), "next", null);
        setField(term417, term417.getClass(), "first", null);
        setField(term417, term417.getClass(), "last", null);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term366, term366.getClass(), "synthesizedExternsRoot", term417);
        setField(term366, term366.getClass(), "varsToDeclareInExterns", term420);
        setField(term366, term366.getClass(), "compiler", null);
        setBooleanField(term366, term366.getClass(), "sanityCheck", false);
        setBooleanField(term366, term366.getClass(), "strictExternCheck", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EeBVbzjcCI";
        try {
            callMethod(klass, "createSynthesizedExternVar", argTypes, term366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


