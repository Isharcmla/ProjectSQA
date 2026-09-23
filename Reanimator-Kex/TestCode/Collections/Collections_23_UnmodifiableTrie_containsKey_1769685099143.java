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

public class UnmodifiableTrie_containsKey_1769685099143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29075;

    public UnmodifiableTrie_containsKey_1769685099143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29075 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term29187 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term29299 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(term29187, term29187.getClass(), "delegate", term29299);
        setField(term29075, term29075.getClass(), "delegate", term29187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsKey", argTypes, term29075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


