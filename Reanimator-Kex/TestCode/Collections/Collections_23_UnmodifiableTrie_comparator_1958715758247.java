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

public class UnmodifiableTrie_comparator_1958715758247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56696;
     Object term57193;

    public UnmodifiableTrie_comparator_1958715758247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56696 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term56808 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term56912 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term56808, term56808.getClass(), "delegate", term56912);
        setField(term56696, term56696.getClass(), "delegate", term56808);
        term57193 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term57194 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term57195 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term57195, term57195.getClass(), "root", null);
        setField(term57195, term57195.getClass(), "keySet", null);
        setField(term57195, term57195.getClass(), "values", null);
        setField(term57195, term57195.getClass(), "entrySet", null);
        setIntField(term57195, term57195.getClass(), "size", 0);
        setIntField(term57195, term57195.getClass(), "modCount", 0);
        setField(term57195, term57195.getClass(), "keyAnalyzer", null);
        setField(term57194, term57194.getClass(), "delegate", term57195);
        setField(term57193, term57193.getClass(), "delegate", term57194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "comparator", argTypes, term56696, args);
        assertTrue(recursiveEquals(term56696, term57193));
        assertTrue(recursiveEquals(retValue, null));
    }

};


