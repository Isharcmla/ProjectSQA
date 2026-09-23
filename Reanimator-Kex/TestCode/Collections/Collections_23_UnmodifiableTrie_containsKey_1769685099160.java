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

public class UnmodifiableTrie_containsKey_1769685099160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33491;
     Object term33893;

    public UnmodifiableTrie_containsKey_1769685099160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33491 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term33595 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term33491, term33491.getClass(), "delegate", term33595);
        term33893 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term33894 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term33894, term33894.getClass(), "root", null);
        setField(term33894, term33894.getClass(), "keySet", null);
        setField(term33894, term33894.getClass(), "values", null);
        setField(term33894, term33894.getClass(), "entrySet", null);
        setIntField(term33894, term33894.getClass(), "size", 0);
        setIntField(term33894, term33894.getClass(), "modCount", 0);
        setField(term33894, term33894.getClass(), "keyAnalyzer", null);
        setField(term33893, term33893.getClass(), "delegate", term33894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsKey", argTypes, term33491, args);
        assertTrue(recursiveEquals(term33491, term33893));
    }

};


