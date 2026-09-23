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

public class UnmodifiableTrie_size_778724377189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39184;
     Object term39751;

    public UnmodifiableTrie_size_778724377189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39184 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term39288 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term39184, term39184.getClass(), "delegate", term39288);
        term39751 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term39752 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term39752, term39752.getClass(), "root", null);
        setField(term39752, term39752.getClass(), "keySet", null);
        setField(term39752, term39752.getClass(), "values", null);
        setField(term39752, term39752.getClass(), "entrySet", null);
        setIntField(term39752, term39752.getClass(), "size", 0);
        setIntField(term39752, term39752.getClass(), "modCount", 0);
        setField(term39752, term39752.getClass(), "keyAnalyzer", null);
        setField(term39751, term39751.getClass(), "delegate", term39752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term39184, args);
        assertTrue(recursiveEquals(term39184, term39751));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


