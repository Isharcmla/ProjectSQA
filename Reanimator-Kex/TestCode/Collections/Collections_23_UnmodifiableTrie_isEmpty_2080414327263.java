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

public class UnmodifiableTrie_isEmpty_2080414327263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83955;
     Object term85205;

    public UnmodifiableTrie_isEmpty_2080414327263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83955 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term84067 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term84171 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term84067, term84067.getClass(), "delegate", term84171);
        setField(term83955, term83955.getClass(), "delegate", term84067);
        term85205 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term85205, term85205.getClass(), "root", null);
        setField(term85205, term85205.getClass(), "keySet", null);
        setField(term85205, term85205.getClass(), "values", null);
        setField(term85205, term85205.getClass(), "entrySet", null);
        setIntField(term85205, term85205.getClass(), "size", 0);
        setIntField(term85205, term85205.getClass(), "modCount", 0);
        setField(term85205, term85205.getClass(), "keyAnalyzer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term83955, args);
        assertTrue(recursiveEquals(term83955, term85205));
    }

};


