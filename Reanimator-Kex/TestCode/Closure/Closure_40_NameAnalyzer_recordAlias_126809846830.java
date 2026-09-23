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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_recordAlias_126809846830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public NameAnalyzer_recordAlias_126809846830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term140 = new HashMap();
        HashMap term154 = new HashMap();
        HashMap term171 = new HashMap();
        Set<Object> term8327 =  ((Map) term171).keySet();
        HashSet term170 = new HashSet((Collection<? extends Object>) term8327);
        ArrayList term186 = new ArrayList();
        HashMap term191 = new HashMap();
        Set<Object> term8328 =  ((Map) term191).keySet();
        HashSet term190 = new HashSet((Collection<? extends Object>) term8328);
        ArrayList term199 = new ArrayList();
        ((ArrayList) term199).add((Object)null);
        ((ArrayList) term199).add((Object)null);
        ((ArrayList) term199).add((Object)null);
        ((ArrayList) term199).add((Object)null);
        ((ArrayList) term199).add((Object)null);
        ((ArrayList) term199).add((Object)null);
        HashMap term203 = new HashMap();
        term139 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term185 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term139, term139.getClass(), "compiler", null);
        setField(term139, term139.getClass(), "allNames", term140);
        setField(term139, term139.getClass(), "referenceGraph", null);
        setField(term139, term139.getClass(), "scopes", term154);
        setBooleanField(term139, term139.getClass(), "removeUnreferenced", false);
        setField(term139, term139.getClass(), "globalNames", term170);
        setField(term185, term185.getClass(), "listeners", term186);
        setField(term139, term139.getClass(), "changeProxy", term185);
        setField(term139, term139.getClass(), "externalNames", term190);
        setField(term139, term139.getClass(), "refNodes", term199);
        setField(term139, term139.getClass(), "aliases", term203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "hNxWaHcfhY";
        args[1] = "RkybSrpybU";
        try {
            callMethod(klass, "recordAlias", argTypes, term139, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


