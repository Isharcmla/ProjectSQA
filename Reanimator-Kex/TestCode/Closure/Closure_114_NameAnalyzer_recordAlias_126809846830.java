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
     Object term124;

    public NameAnalyzer_recordAlias_126809846830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term125 = new HashMap();
        HashMap term141 = new HashMap();
        Set<Object> term4678 =  ((Map) term141).keySet();
        HashSet term140 = new HashSet((Collection<? extends Object>) term4678);
        ArrayList term150 = new ArrayList();
        HashMap term155 = new HashMap();
        Set<Object> term4679 =  ((Map) term155).keySet();
        HashSet term154 = new HashSet((Collection<? extends Object>) term4679);
        ArrayList term173 = new ArrayList();
        ((ArrayList) term173).add((Object)null);
        ((ArrayList) term173).add((Object)null);
        HashMap term177 = new HashMap();
        term124 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term149 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term124, term124.getClass(), "compiler", null);
        setField(term124, term124.getClass(), "allNames", term125);
        setField(term124, term124.getClass(), "referenceGraph", null);
        setField(term124, term124.getClass(), "scopes", null);
        setBooleanField(term124, term124.getClass(), "removeUnreferenced", false);
        setField(term124, term124.getClass(), "globalNames", term140);
        setField(term149, term149.getClass(), "listeners", term150);
        setField(term124, term124.getClass(), "changeProxy", term149);
        setField(term124, term124.getClass(), "externalNames", term154);
        setField(term124, term124.getClass(), "refNodes", term173);
        setField(term124, term124.getClass(), "aliases", term177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "AijpHYOFuy";
        args[1] = "SbAoxhfrkn";
        try {
            callMethod(klass, "recordAlias", argTypes, term124, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


