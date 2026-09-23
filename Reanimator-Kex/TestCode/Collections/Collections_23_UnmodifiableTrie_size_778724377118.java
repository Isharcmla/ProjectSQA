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

public class UnmodifiableTrie_size_778724377118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20533;

    public UnmodifiableTrie_size_778724377118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20533 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term20645 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term20757 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        setField(term20645, term20645.getClass(), "delegate", term20757);
        setField(term20533, term20533.getClass(), "delegate", term20645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "size", argTypes, term20533, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


