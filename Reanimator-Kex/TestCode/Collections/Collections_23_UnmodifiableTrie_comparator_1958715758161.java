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

public class UnmodifiableTrie_comparator_1958715758161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33777;
     Object term33902;

    public UnmodifiableTrie_comparator_1958715758161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33777 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term33881 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term33777, term33777.getClass(), "delegate", term33881);
        term33902 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term33903 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term33903, term33903.getClass(), "root", null);
        setField(term33903, term33903.getClass(), "keySet", null);
        setField(term33903, term33903.getClass(), "values", null);
        setField(term33903, term33903.getClass(), "entrySet", null);
        setIntField(term33903, term33903.getClass(), "size", 0);
        setIntField(term33903, term33903.getClass(), "modCount", 0);
        setField(term33903, term33903.getClass(), "keyAnalyzer", null);
        setField(term33902, term33902.getClass(), "delegate", term33903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "comparator", argTypes, term33777, args);
        assertTrue(recursiveEquals(term33777, term33902));
        assertTrue(recursiveEquals(retValue, null));
    }

};


