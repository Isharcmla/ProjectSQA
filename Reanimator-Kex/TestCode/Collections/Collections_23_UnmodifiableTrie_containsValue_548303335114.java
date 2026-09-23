package org.apache.commons.collections4.trie;

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
import static org.apache.commons.collections4.trie.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.trie.EqualityUtils.*;
import java.lang.Object;

public class UnmodifiableTrie_containsValue_548303335114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19265;
     Object term21658;
     Object term21660;
     Object term21662;

    public UnmodifiableTrie_containsValue_548303335114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19265 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term19369 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term19265, term19265.getClass(), "delegate", term19369);
        term21658 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        Object term21659 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term21659, term21659.getClass(), "root", null);
        setField(term21659, term21659.getClass(), "keySet", null);
        setField(term21659, term21659.getClass(), "values", null);
        setField(term21659, term21659.getClass(), "entrySet", term21658);
        setIntField(term21659, term21659.getClass(), "size", 0);
        setIntField(term21659, term21659.getClass(), "modCount", 0);
        setField(term21659, term21659.getClass(), "keyAnalyzer", null);
        setField(term21658, term21658.getClass(), "this$0", term21659);
        term21660 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        Object term21661 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        setField(term21660, term21660.getClass(), "root", null);
        setField(term21660, term21660.getClass(), "keySet", null);
        setField(term21660, term21660.getClass(), "values", null);
        setField(term21661, term21661.getClass(), "this$0", term21660);
        setField(term21660, term21660.getClass(), "entrySet", term21661);
        setIntField(term21660, term21660.getClass(), "size", 0);
        setIntField(term21660, term21660.getClass(), "modCount", 0);
        setField(term21660, term21660.getClass(), "keyAnalyzer", null);
        term21662 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        Object term21663 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term21663, term21663.getClass(), "root", null);
        setField(term21663, term21663.getClass(), "keySet", null);
        setField(term21663, term21663.getClass(), "values", null);
        setField(term21663, term21663.getClass(), "entrySet", term21662);
        setIntField(term21663, term21663.getClass(), "size", 0);
        setIntField(term21663, term21663.getClass(), "modCount", 0);
        setField(term21663, term21663.getClass(), "keyAnalyzer", null);
        setField(term21662, term21662.getClass(), "this$0", term21663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsValue", argTypes, term19265, args);
        assertTrue(recursiveEquals(term19265, term21658));
    }

};


