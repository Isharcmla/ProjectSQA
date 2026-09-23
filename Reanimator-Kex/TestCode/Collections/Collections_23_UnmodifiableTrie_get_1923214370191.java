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

public class UnmodifiableTrie_get_1923214370191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39636;
     Object term39769;

    public UnmodifiableTrie_get_1923214370191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39636 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term39740 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term39636, term39636.getClass(), "delegate", term39740);
        term39769 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term39770 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term39770, term39770.getClass(), "root", null);
        setField(term39770, term39770.getClass(), "keySet", null);
        setField(term39770, term39770.getClass(), "values", null);
        setField(term39770, term39770.getClass(), "entrySet", null);
        setIntField(term39770, term39770.getClass(), "size", 0);
        setIntField(term39770, term39770.getClass(), "modCount", 0);
        setField(term39770, term39770.getClass(), "keyAnalyzer", null);
        setField(term39769, term39769.getClass(), "delegate", term39770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "get", argTypes, term39636, args);
        assertTrue(recursiveEquals(term39636, term39769));
        assertTrue(recursiveEquals(retValue, null));
    }

};


