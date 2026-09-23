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
import java.lang.NullPointerException;
import static org.apache.commons.collections4.trie.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnmodifiableTrie_hashCode_325765505218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44728;

    public UnmodifiableTrie_hashCode_325765505218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44728 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term44840 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term44952 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term45064 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(term44952, term44952.getClass(), "delegate", term45064);
        setField(term44840, term44840.getClass(), "delegate", term44952);
        setField(term44728, term44728.getClass(), "delegate", term44840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term44728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


