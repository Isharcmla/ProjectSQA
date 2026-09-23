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

public class UnmodifiableTrie_mapIterator_149035456242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55350;
     Object term56080;
     Object term56072;

    public UnmodifiableTrie_mapIterator_149035456242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55350 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term55462 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term55566 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term55462, term55462.getClass(), "delegate", term55566);
        setField(term55350, term55350.getClass(), "delegate", term55462);
        term56080 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term56080, term56080.getClass(), "root", null);
        setField(term56080, term56080.getClass(), "keySet", null);
        setField(term56080, term56080.getClass(), "values", null);
        setField(term56080, term56080.getClass(), "entrySet", null);
        setIntField(term56080, term56080.getClass(), "size", 0);
        setIntField(term56080, term56080.getClass(), "modCount", 0);
        setField(term56080, term56080.getClass(), "keyAnalyzer", null);
        term56072 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator"));
        Object term56073 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator"));
        Object term56074 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term56073, term56073.getClass(), "previous", null);
        setField(term56074, term56074.getClass(), "root", null);
        setField(term56074, term56074.getClass(), "keySet", null);
        setField(term56074, term56074.getClass(), "values", null);
        setField(term56074, term56074.getClass(), "entrySet", null);
        setIntField(term56074, term56074.getClass(), "size", 0);
        setIntField(term56074, term56074.getClass(), "modCount", 0);
        setField(term56074, term56074.getClass(), "keyAnalyzer", null);
        setField(term56073, term56073.getClass(), "this$0", term56074);
        setIntField(term56073, term56073.getClass(), "expectedModCount", 0);
        setField(term56073, term56073.getClass(), "next", null);
        setField(term56073, term56073.getClass(), "current", null);
        setField(term56072, term56072.getClass(), "iterator", term56073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapIterator", argTypes, term55350, args);
        assertTrue(recursiveEquals(term55350, term56080));
        assertTrue(recursiveEquals(retValue, term56072));
    }

};


