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

public class UnmodifiableTrie_values_12201382183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38016;
     Object term38706;
     Object term38700;

    public UnmodifiableTrie_values_12201382183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38016 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term38120 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term38016, term38016.getClass(), "delegate", term38120);
        term38706 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term38707 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term38707, term38707.getClass(), "root", null);
        setField(term38707, term38707.getClass(), "keySet", null);
        setField(term38707, term38707.getClass(), "values", null);
        setField(term38707, term38707.getClass(), "entrySet", null);
        setIntField(term38707, term38707.getClass(), "size", 0);
        setIntField(term38707, term38707.getClass(), "modCount", 0);
        setField(term38707, term38707.getClass(), "keyAnalyzer", null);
        setField(term38706, term38706.getClass(), "delegate", term38707);
        term38700 = newInstance(Class.forName("java.util.Collections$UnmodifiableCollection"));
        Object term38701 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values"));
        Object term38702 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term38702, term38702.getClass(), "root", null);
        setField(term38702, term38702.getClass(), "keySet", null);
        setField(term38702, term38702.getClass(), "values", null);
        setField(term38702, term38702.getClass(), "entrySet", null);
        setIntField(term38702, term38702.getClass(), "size", 0);
        setIntField(term38702, term38702.getClass(), "modCount", 0);
        setField(term38702, term38702.getClass(), "keyAnalyzer", null);
        setField(term38701, term38701.getClass(), "this$0", term38702);
        setField(term38700, term38700.getClass(), "c", term38701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term38016, args);
        assertTrue(recursiveEquals(term38016, term38706));
        assertTrue(recursiveEquals(retValue, term38700));
    }

};


