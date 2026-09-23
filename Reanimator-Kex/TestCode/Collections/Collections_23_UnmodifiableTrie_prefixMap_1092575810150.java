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

public class UnmodifiableTrie_prefixMap_1092575810150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30986;
     Object term31829;
     Object term31824;

    public UnmodifiableTrie_prefixMap_1092575810150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30986 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term31090 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term30986, term30986.getClass(), "delegate", term31090);
        term31829 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term31830 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term31830, term31830.getClass(), "root", null);
        setField(term31830, term31830.getClass(), "keySet", null);
        setField(term31830, term31830.getClass(), "values", null);
        setField(term31830, term31830.getClass(), "entrySet", null);
        setIntField(term31830, term31830.getClass(), "size", 0);
        setIntField(term31830, term31830.getClass(), "modCount", 0);
        setField(term31830, term31830.getClass(), "keyAnalyzer", null);
        setField(term31829, term31829.getClass(), "delegate", term31830);
        term31824 = newInstance(Class.forName("java.util.Collections$UnmodifiableSortedMap"));
        Object term31825 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term31825, term31825.getClass(), "root", null);
        setField(term31825, term31825.getClass(), "keySet", null);
        setField(term31825, term31825.getClass(), "values", null);
        setField(term31825, term31825.getClass(), "entrySet", null);
        setIntField(term31825, term31825.getClass(), "size", 0);
        setIntField(term31825, term31825.getClass(), "modCount", 0);
        setField(term31825, term31825.getClass(), "keyAnalyzer", null);
        setField(term31824, term31824.getClass(), "sm", term31825);
        setField(term31824, term31824.getClass(), "m", term31825);
        setField(term31824, term31824.getClass(), "keySet", null);
        setField(term31824, term31824.getClass(), "entrySet", null);
        setField(term31824, term31824.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "prefixMap", argTypes, term30986, args);
        assertTrue(recursiveEquals(term30986, term31829));
        assertTrue(recursiveEquals(retValue, term31824));
    }

};


