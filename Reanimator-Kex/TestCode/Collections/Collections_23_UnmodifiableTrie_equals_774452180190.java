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

public class UnmodifiableTrie_equals_774452180190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39410;
     Object term39758;

    public UnmodifiableTrie_equals_774452180190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39410 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term39514 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term39410, term39410.getClass(), "delegate", term39514);
        term39758 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term39759 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term39759, term39759.getClass(), "root", null);
        setField(term39759, term39759.getClass(), "keySet", null);
        setField(term39759, term39759.getClass(), "values", null);
        setField(term39759, term39759.getClass(), "entrySet", null);
        setIntField(term39759, term39759.getClass(), "size", 0);
        setIntField(term39759, term39759.getClass(), "modCount", 0);
        setField(term39759, term39759.getClass(), "keyAnalyzer", null);
        setField(term39758, term39758.getClass(), "delegate", term39759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term39410, args);
        assertTrue(recursiveEquals(term39410, term39758));
    }

};


