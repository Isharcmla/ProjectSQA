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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_replaceWithRhs_36025316049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3259;
     Object term3332;
     Object term3359;

    public NameAnalyzer_replaceWithRhs_36025316049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3260 = new HashMap();
        HashMap term3274 = new HashMap();
        HashMap term3291 = new HashMap();
        Set<Object> term15977 =  ((Map) term3291).keySet();
        HashSet term3290 = new HashSet((Collection<? extends Object>) term15977);
        ArrayList term3297 = new ArrayList();
        HashMap term3302 = new HashMap();
        Set<Object> term15978 =  ((Map) term3302).keySet();
        HashSet term3301 = new HashSet((Collection<? extends Object>) term15978);
        ArrayList term3318 = new ArrayList();
        ((ArrayList) term3318).add((Object)null);
        ((ArrayList) term3318).add((Object)null);
        ((ArrayList) term3318).add((Object)null);
        ((ArrayList) term3318).add((Object)null);
        ((ArrayList) term3318).add((Object)null);
        HashMap term3322 = new HashMap();
        term3259 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3296 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3259, term3259.getClass(), "compiler", null);
        setField(term3259, term3259.getClass(), "allNames", term3260);
        setField(term3259, term3259.getClass(), "referenceGraph", null);
        setField(term3259, term3259.getClass(), "scopes", term3274);
        setBooleanField(term3259, term3259.getClass(), "removeUnreferenced", true);
        setField(term3259, term3259.getClass(), "globalNames", term3290);
        setField(term3296, term3296.getClass(), "listeners", term3297);
        setField(term3259, term3259.getClass(), "changeProxy", term3296);
        setField(term3259, term3259.getClass(), "externalNames", term3301);
        setField(term3259, term3259.getClass(), "refNodes", term3318);
        setField(term3259, term3259.getClass(), "aliases", term3322);
        term3332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3332, term3332.getClass(), "type", 842904495);
        setIntField(term3334, term3334.getClass(), "type", 1008080511);
        setIntField(term3336, term3336.getClass(), "type", 1935707624);
        setIntField(term3338, term3338.getClass(), "type", 1507074215);
        setIntField(term3340, term3340.getClass(), "type", -282881827);
        setField(term3340, term3340.getClass(), "next", null);
        setField(term3340, term3340.getClass(), "first", null);
        setField(term3340, term3340.getClass(), "last", null);
        setField(term3340, term3340.getClass(), "propListHead", null);
        setIntField(term3340, term3340.getClass(), "sourcePosition", 0);
        setField(term3340, term3340.getClass(), "jsType", null);
        setField(term3340, term3340.getClass(), "parent", null);
        setField(term3338, term3338.getClass(), "next", term3340);
        setIntField(term3343, term3343.getClass(), "type", -1183353915);
        setField(term3343, term3343.getClass(), "next", null);
        setField(term3343, term3343.getClass(), "first", null);
        setField(term3343, term3343.getClass(), "last", term3340);
        setField(term3343, term3343.getClass(), "propListHead", null);
        setIntField(term3343, term3343.getClass(), "sourcePosition", 0);
        setField(term3343, term3343.getClass(), "jsType", null);
        setField(term3343, term3343.getClass(), "parent", null);
        setField(term3338, term3338.getClass(), "first", term3343);
        setField(term3338, term3338.getClass(), "last", term3336);
        setField(term3338, term3338.getClass(), "propListHead", null);
        setIntField(term3338, term3338.getClass(), "sourcePosition", 0);
        setField(term3338, term3338.getClass(), "jsType", null);
        setField(term3338, term3338.getClass(), "parent", null);
        setField(term3336, term3336.getClass(), "next", term3338);
        setField(term3336, term3336.getClass(), "first", term3340);
        setIntField(term3347, term3347.getClass(), "type", 267763294);
        setIntField(term3349, term3349.getClass(), "type", -1497710478);
        setField(term3349, term3349.getClass(), "next", null);
        setField(term3349, term3349.getClass(), "first", term3343);
        setField(term3349, term3349.getClass(), "last", term3338);
        setField(term3349, term3349.getClass(), "propListHead", null);
        setIntField(term3349, term3349.getClass(), "sourcePosition", 0);
        setField(term3349, term3349.getClass(), "jsType", null);
        setField(term3349, term3349.getClass(), "parent", null);
        setField(term3347, term3347.getClass(), "next", term3349);
        setField(term3347, term3347.getClass(), "first", term3334);
        setField(term3347, term3347.getClass(), "last", term3334);
        setField(term3347, term3347.getClass(), "propListHead", null);
        setIntField(term3347, term3347.getClass(), "sourcePosition", 0);
        setField(term3347, term3347.getClass(), "jsType", null);
        setField(term3347, term3347.getClass(), "parent", null);
        setField(term3336, term3336.getClass(), "last", term3347);
        setField(term3336, term3336.getClass(), "propListHead", null);
        setIntField(term3336, term3336.getClass(), "sourcePosition", 0);
        setField(term3336, term3336.getClass(), "jsType", null);
        setField(term3336, term3336.getClass(), "parent", null);
        setField(term3334, term3334.getClass(), "next", term3336);
        setIntField(term3354, term3354.getClass(), "type", 49950830);
        setField(term3354, term3354.getClass(), "next", term3347);
        setField(term3354, term3354.getClass(), "first", term3349);
        setField(term3354, term3354.getClass(), "last", term3332);
        setField(term3354, term3354.getClass(), "propListHead", null);
        setIntField(term3354, term3354.getClass(), "sourcePosition", 0);
        setField(term3354, term3354.getClass(), "jsType", null);
        setField(term3354, term3354.getClass(), "parent", null);
        setField(term3334, term3334.getClass(), "first", term3354);
        setField(term3334, term3334.getClass(), "last", term3354);
        setField(term3334, term3334.getClass(), "propListHead", null);
        setIntField(term3334, term3334.getClass(), "sourcePosition", 0);
        setField(term3334, term3334.getClass(), "jsType", null);
        setField(term3334, term3334.getClass(), "parent", null);
        setField(term3332, term3332.getClass(), "next", term3334);
        setField(term3332, term3332.getClass(), "first", term3338);
        setField(term3332, term3332.getClass(), "last", term3340);
        setField(term3332, term3332.getClass(), "propListHead", null);
        setIntField(term3332, term3332.getClass(), "sourcePosition", 0);
        setField(term3332, term3332.getClass(), "jsType", null);
        setField(term3332, term3332.getClass(), "parent", null);
        term3359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3359, term3359.getClass(), "type", -525257914);
        setIntField(term3361, term3361.getClass(), "type", 147209682);
        setIntField(term3363, term3363.getClass(), "type", 34470066);
        setIntField(term3365, term3365.getClass(), "type", 2058711405);
        setIntField(term3367, term3367.getClass(), "type", 1743683601);
        setField(term3367, term3367.getClass(), "next", null);
        setField(term3367, term3367.getClass(), "first", null);
        setField(term3367, term3367.getClass(), "last", null);
        setField(term3367, term3367.getClass(), "propListHead", null);
        setIntField(term3367, term3367.getClass(), "sourcePosition", 0);
        setField(term3367, term3367.getClass(), "jsType", null);
        setField(term3367, term3367.getClass(), "parent", null);
        setField(term3365, term3365.getClass(), "next", term3367);
        setIntField(term3370, term3370.getClass(), "type", -945116798);
        setField(term3370, term3370.getClass(), "next", null);
        setField(term3370, term3370.getClass(), "first", null);
        setField(term3370, term3370.getClass(), "last", term3367);
        setField(term3370, term3370.getClass(), "propListHead", null);
        setIntField(term3370, term3370.getClass(), "sourcePosition", 0);
        setField(term3370, term3370.getClass(), "jsType", null);
        setField(term3370, term3370.getClass(), "parent", null);
        setField(term3365, term3365.getClass(), "first", term3370);
        setField(term3365, term3365.getClass(), "last", term3363);
        setField(term3365, term3365.getClass(), "propListHead", null);
        setIntField(term3365, term3365.getClass(), "sourcePosition", 0);
        setField(term3365, term3365.getClass(), "jsType", null);
        setField(term3365, term3365.getClass(), "parent", null);
        setField(term3363, term3363.getClass(), "next", term3365);
        setField(term3363, term3363.getClass(), "first", term3367);
        setIntField(term3374, term3374.getClass(), "type", 515182546);
        setIntField(term3376, term3376.getClass(), "type", -936895502);
        setField(term3376, term3376.getClass(), "next", null);
        setField(term3376, term3376.getClass(), "first", term3370);
        setField(term3376, term3376.getClass(), "last", term3365);
        setField(term3376, term3376.getClass(), "propListHead", null);
        setIntField(term3376, term3376.getClass(), "sourcePosition", 0);
        setField(term3376, term3376.getClass(), "jsType", null);
        setField(term3376, term3376.getClass(), "parent", null);
        setField(term3374, term3374.getClass(), "next", term3376);
        setField(term3374, term3374.getClass(), "first", term3361);
        setField(term3374, term3374.getClass(), "last", term3361);
        setField(term3374, term3374.getClass(), "propListHead", null);
        setIntField(term3374, term3374.getClass(), "sourcePosition", 0);
        setField(term3374, term3374.getClass(), "jsType", null);
        setField(term3374, term3374.getClass(), "parent", null);
        setField(term3363, term3363.getClass(), "last", term3374);
        setField(term3363, term3363.getClass(), "propListHead", null);
        setIntField(term3363, term3363.getClass(), "sourcePosition", 0);
        setField(term3363, term3363.getClass(), "jsType", null);
        setField(term3363, term3363.getClass(), "parent", null);
        setField(term3361, term3361.getClass(), "next", term3363);
        setIntField(term3381, term3381.getClass(), "type", -129547140);
        setField(term3381, term3381.getClass(), "next", term3374);
        setField(term3381, term3381.getClass(), "first", term3376);
        setField(term3381, term3381.getClass(), "last", term3359);
        setField(term3381, term3381.getClass(), "propListHead", null);
        setIntField(term3381, term3381.getClass(), "sourcePosition", 0);
        setField(term3381, term3381.getClass(), "jsType", null);
        setField(term3381, term3381.getClass(), "parent", null);
        setField(term3361, term3361.getClass(), "first", term3381);
        setField(term3361, term3361.getClass(), "last", term3381);
        setField(term3361, term3361.getClass(), "propListHead", null);
        setIntField(term3361, term3361.getClass(), "sourcePosition", 0);
        setField(term3361, term3361.getClass(), "jsType", null);
        setField(term3361, term3361.getClass(), "parent", null);
        setField(term3359, term3359.getClass(), "next", term3361);
        setField(term3359, term3359.getClass(), "first", term3365);
        setField(term3359, term3359.getClass(), "last", term3367);
        setField(term3359, term3359.getClass(), "propListHead", null);
        setIntField(term3359, term3359.getClass(), "sourcePosition", 0);
        setField(term3359, term3359.getClass(), "jsType", null);
        setField(term3359, term3359.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3332;
        args[1] = term3359;
        try {
            callMethod(klass, "replaceWithRhs", argTypes, term3259, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


