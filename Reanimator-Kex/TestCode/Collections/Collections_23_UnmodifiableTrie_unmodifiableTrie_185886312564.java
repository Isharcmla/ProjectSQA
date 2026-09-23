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

public class UnmodifiableTrie_unmodifiableTrie_185886312564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8470;
     Object term8955;
     Object term8953;

    public UnmodifiableTrie_unmodifiableTrie_185886312564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8470 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        term8955 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(term8955, term8955.getClass(), "delegate", null);
        term8953 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term8954 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(term8954, term8954.getClass(), "delegate", null);
        setField(term8953, term8953.getClass(), "delegate", term8954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.collections4.Trie");
        Object[] args = new Object[1];
        args[0] = term8470;
        Object retValue = callMethod(klass, "unmodifiableTrie", argTypes, null, args);
        assertTrue(recursiveEquals(term8470, term8955));
        assertTrue(recursiveEquals(retValue, term8953));
    }

};


