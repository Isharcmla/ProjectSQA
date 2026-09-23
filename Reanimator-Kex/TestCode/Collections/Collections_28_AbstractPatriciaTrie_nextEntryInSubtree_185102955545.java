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

public class AbstractPatriciaTrie_nextEntryInSubtree_185102955545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public AbstractPatriciaTrie_nextEntryInSubtree_185102955545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry");
        argTypes[1] = Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "nextEntryInSubtree", argTypes, null, args);
    }

};


