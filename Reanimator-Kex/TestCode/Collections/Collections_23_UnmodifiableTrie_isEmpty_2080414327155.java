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

public class UnmodifiableTrie_isEmpty_2080414327155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32663;
     Object term33029;

    public UnmodifiableTrie_isEmpty_2080414327155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32663 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term32767 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term32663, term32663.getClass(), "delegate", term32767);
        term33029 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term33029, term33029.getClass(), "root", null);
        setField(term33029, term33029.getClass(), "keySet", null);
        setField(term33029, term33029.getClass(), "values", null);
        setField(term33029, term33029.getClass(), "entrySet", null);
        setIntField(term33029, term33029.getClass(), "size", 0);
        setIntField(term33029, term33029.getClass(), "modCount", 0);
        setField(term33029, term33029.getClass(), "keyAnalyzer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term32663, args);
        assertTrue(recursiveEquals(term32663, term33029));
    }

};


