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

public class UnmodifiableTrie_entrySet_749461352179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37213;
     Object term37892;
     Object term37886;

    public UnmodifiableTrie_entrySet_749461352179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37213 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term37317 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term37213, term37213.getClass(), "delegate", term37317);
        term37892 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term37893 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        Object term37894 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        setField(term37893, term37893.getClass(), "root", null);
        setField(term37893, term37893.getClass(), "keySet", null);
        setField(term37893, term37893.getClass(), "values", null);
        setField(term37894, term37894.getClass(), "this$0", term37893);
        setField(term37893, term37893.getClass(), "entrySet", term37894);
        setIntField(term37893, term37893.getClass(), "size", 0);
        setIntField(term37893, term37893.getClass(), "modCount", 0);
        setField(term37893, term37893.getClass(), "keyAnalyzer", null);
        setField(term37892, term37892.getClass(), "delegate", term37893);
        term37886 = newInstance(Class.forName("java.util.Collections$UnmodifiableSet"));
        Object term37887 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        Object term37888 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term37888, term37888.getClass(), "root", null);
        setField(term37888, term37888.getClass(), "keySet", null);
        setField(term37888, term37888.getClass(), "values", null);
        setField(term37888, term37888.getClass(), "entrySet", term37887);
        setIntField(term37888, term37888.getClass(), "size", 0);
        setIntField(term37888, term37888.getClass(), "modCount", 0);
        setField(term37888, term37888.getClass(), "keyAnalyzer", null);
        setField(term37887, term37887.getClass(), "this$0", term37888);
        setField(term37886, term37886.getClass(), "c", term37887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "entrySet", argTypes, term37213, args);
        assertTrue(recursiveEquals(term37213, term37892));
        assertTrue(recursiveEquals(retValue, term37886));
    }

};


