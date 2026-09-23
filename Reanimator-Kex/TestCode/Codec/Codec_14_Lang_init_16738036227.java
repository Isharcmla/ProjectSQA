package org.apache.commons.codec.language.bm;

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
import java.lang.NoClassDefFoundError;
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class Lang_init_16738036227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;

    public Lang_init_16738036227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term350 = new HashMap();
        Set<Object> term1824 =  ((Map) term350).keySet();
        HashSet term349 = new HashSet((Collection<? extends Object>) term1824);
        HashMap term364 = new HashMap();
        ArrayList term370 = new ArrayList();
        ((ArrayList) term370).add((Object)null);
        ((ArrayList) term370).add((Object)null);
        ((ArrayList) term370).add((Object)null);
        ((ArrayList) term370).add((Object)null);
        ((ArrayList) term370).add((Object)null);
        Object term347 = newInstance(Class.forName("org.apache.commons.codec.language.bm.Lang$LangRule"));
        Object term355 = newInstance(Class.forName("java.util.regex.Pattern"));
        Object term361 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term362 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        int[] term363 = (int[]) newIntArray(0);
        Object[] term369 = (Object[]) newArray("java.util.regex.Pattern$GroupHead", 4);
        int[] term375 = (int[]) newIntArray(0);
        setBooleanField(term347, term347.getClass(), "acceptOnMatch", false);
        setField(term347, term347.getClass(), "languages", term349);
        setField(term355, term355.getClass(), "pattern", "");
        setIntField(term355, term355.getClass(), "flags", 568599855);
        setIntField(term355, term355.getClass(), "flags0", 1162663216);
        setBooleanField(term355, term355.getClass(), "compiled", false);
        setField(term355, term355.getClass(), "normalizedPattern", "");
        setField(term361, term361.getClass(), "next", null);
        setField(term355, term355.getClass(), "root", term361);
        setField(term362, term362.getClass(), "next", null);
        setField(term355, term355.getClass(), "matchRoot", term362);
        setField(term355, term355.getClass(), "buffer", term363);
        setField(term355, term355.getClass(), "predicate", null);
        setField(term355, term355.getClass(), "namedGroups", term364);
        setField(term355, term355.getClass(), "groupNodes", term369);
        setField(term355, term355.getClass(), "topClosureNodes", term370);
        setIntField(term355, term355.getClass(), "localTCNCount", 1585847225);
        setBooleanField(term355, term355.getClass(), "hasGroupRef", false);
        setField(term355, term355.getClass(), "temp", term375);
        setIntField(term355, term355.getClass(), "capturingGroupCount", 597278769);
        setIntField(term355, term355.getClass(), "localCount", -1685132342);
        setIntField(term355, term355.getClass(), "cursor", -1456670397);
        setIntField(term355, term355.getClass(), "patternLength", 1622346318);
        setBooleanField(term355, term355.getClass(), "hasSupplementary", false);
        setField(term347, term347.getClass(), "pattern", term355);
        HashSet term384 = new HashSet();
        Object term382 = newInstance(Class.forName("org.apache.commons.codec.language.bm.Lang$LangRule"));
        Object term385 = newInstance(Class.forName("java.util.regex.Pattern"));
        setBooleanField(term382, term382.getClass(), "acceptOnMatch", true);
        setField(term382, term382.getClass(), "languages", term384);
        setField(term385, term385.getClass(), "pattern", null);
        setIntField(term385, term385.getClass(), "flags", 1048535127);
        setIntField(term385, term385.getClass(), "flags0", -655067527);
        setBooleanField(term385, term385.getClass(), "compiled", true);
        setField(term385, term385.getClass(), "normalizedPattern", null);
        setField(term385, term385.getClass(), "root", null);
        setField(term385, term385.getClass(), "matchRoot", null);
        setField(term385, term385.getClass(), "buffer", null);
        setField(term385, term385.getClass(), "predicate", null);
        setField(term385, term385.getClass(), "namedGroups", null);
        setField(term385, term385.getClass(), "groupNodes", null);
        setField(term385, term385.getClass(), "topClosureNodes", null);
        setIntField(term385, term385.getClass(), "localTCNCount", 579005622);
        setBooleanField(term385, term385.getClass(), "hasGroupRef", true);
        setField(term385, term385.getClass(), "temp", null);
        setIntField(term385, term385.getClass(), "capturingGroupCount", -1786399638);
        setIntField(term385, term385.getClass(), "localCount", 2055867847);
        setIntField(term385, term385.getClass(), "cursor", -1048298087);
        setIntField(term385, term385.getClass(), "patternLength", 292681826);
        setBooleanField(term385, term385.getClass(), "hasSupplementary", true);
        setField(term382, term382.getClass(), "pattern", term385);
        Object term397 = newInstance(Class.forName("org.apache.commons.codec.language.bm.Lang$LangRule"));
        setBooleanField(term397, term397.getClass(), "acceptOnMatch", false);
        setField(term397, term397.getClass(), "languages", null);
        setField(term397, term397.getClass(), "pattern", null);
        term344 = new LinkedList();
        ((LinkedList) term344).add(term347);
        ((LinkedList) term344).add(term382);
        ((LinkedList) term344).add(term397);
        ((LinkedList) term344).add((Object)null);
        ((LinkedList) term344).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.Lang");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.Languages");
        Object[] args = new Object[2];
        args[0] = term344;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


