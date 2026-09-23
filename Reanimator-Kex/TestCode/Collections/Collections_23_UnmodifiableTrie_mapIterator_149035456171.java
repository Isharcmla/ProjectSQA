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

public class UnmodifiableTrie_mapIterator_149035456171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35440;
     Object term36325;
     Object term36318;

    public UnmodifiableTrie_mapIterator_149035456171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35440 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term35544 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term35440, term35440.getClass(), "delegate", term35544);
        term36325 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term36325, term36325.getClass(), "root", null);
        setField(term36325, term36325.getClass(), "keySet", null);
        setField(term36325, term36325.getClass(), "values", null);
        setField(term36325, term36325.getClass(), "entrySet", null);
        setIntField(term36325, term36325.getClass(), "size", 0);
        setIntField(term36325, term36325.getClass(), "modCount", 0);
        setField(term36325, term36325.getClass(), "keyAnalyzer", null);
        term36318 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator"));
        Object term36319 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator"));
        Object term36320 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term36319, term36319.getClass(), "previous", null);
        setField(term36320, term36320.getClass(), "root", null);
        setField(term36320, term36320.getClass(), "keySet", null);
        setField(term36320, term36320.getClass(), "values", null);
        setField(term36320, term36320.getClass(), "entrySet", null);
        setIntField(term36320, term36320.getClass(), "size", 0);
        setIntField(term36320, term36320.getClass(), "modCount", 0);
        setField(term36320, term36320.getClass(), "keyAnalyzer", null);
        setField(term36319, term36319.getClass(), "this$0", term36320);
        setIntField(term36319, term36319.getClass(), "expectedModCount", 0);
        setField(term36319, term36319.getClass(), "next", null);
        setField(term36319, term36319.getClass(), "current", null);
        setField(term36318, term36318.getClass(), "iterator", term36319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapIterator", argTypes, term35440, args);
        assertTrue(recursiveEquals(term35440, term36325));
        assertTrue(recursiveEquals(retValue, term36318));
    }

};


