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

public class UnmodifiableTrie_containsKey_1769685099237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52744;
     Object term54676;

    public UnmodifiableTrie_containsKey_1769685099237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52744 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term52856 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term52960 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term52856, term52856.getClass(), "delegate", term52960);
        setField(term52744, term52744.getClass(), "delegate", term52856);
        term54676 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term54677 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term54678 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54678, term54678.getClass(), "root", null);
        setField(term54678, term54678.getClass(), "keySet", null);
        setField(term54678, term54678.getClass(), "values", null);
        setField(term54678, term54678.getClass(), "entrySet", null);
        setIntField(term54678, term54678.getClass(), "size", 0);
        setIntField(term54678, term54678.getClass(), "modCount", 0);
        setField(term54678, term54678.getClass(), "keyAnalyzer", null);
        setField(term54677, term54677.getClass(), "delegate", term54678);
        setField(term54676, term54676.getClass(), "delegate", term54677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsKey", argTypes, term52744, args);
        assertTrue(recursiveEquals(term52744, term54676));
    }

};


