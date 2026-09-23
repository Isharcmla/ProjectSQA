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

public class UnmodifiableTrie_headMap_1572299568234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51493;
     Object term51701;
     Object term54340;
     Object term54342;
     Object term54332;

    public UnmodifiableTrie_headMap_1572299568234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51493 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term51597 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term51493, term51493.getClass(), "delegate", term51597);
        term51701 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        term54340 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term54341 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54341, term54341.getClass(), "root", null);
        setField(term54341, term54341.getClass(), "keySet", null);
        setField(term54341, term54341.getClass(), "values", null);
        setField(term54341, term54341.getClass(), "entrySet", null);
        setIntField(term54341, term54341.getClass(), "size", 0);
        setIntField(term54341, term54341.getClass(), "modCount", 0);
        setField(term54341, term54341.getClass(), "keyAnalyzer", null);
        setField(term54340, term54340.getClass(), "delegate", term54341);
        term54342 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54342, term54342.getClass(), "root", null);
        setField(term54342, term54342.getClass(), "keySet", null);
        setField(term54342, term54342.getClass(), "values", null);
        setField(term54342, term54342.getClass(), "entrySet", null);
        setIntField(term54342, term54342.getClass(), "size", 0);
        setIntField(term54342, term54342.getClass(), "modCount", 0);
        setField(term54342, term54342.getClass(), "keyAnalyzer", null);
        term54332 = newInstance(Class.forName("java.util.Collections$UnmodifiableSortedMap"));
        Object term54333 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap"));
        Object term54322 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        Object term54336 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54333, term54333.getClass(), "fromKey", null);
        setField(term54322, term54322.getClass(), "root", null);
        setField(term54322, term54322.getClass(), "keySet", null);
        setField(term54322, term54322.getClass(), "values", null);
        setField(term54322, term54322.getClass(), "entrySet", null);
        setIntField(term54322, term54322.getClass(), "size", 0);
        setIntField(term54322, term54322.getClass(), "modCount", 0);
        setField(term54322, term54322.getClass(), "keyAnalyzer", null);
        setField(term54333, term54333.getClass(), "toKey", term54322);
        setBooleanField(term54333, term54333.getClass(), "fromInclusive", true);
        setBooleanField(term54333, term54333.getClass(), "toInclusive", false);
        setField(term54336, term54336.getClass(), "root", null);
        setField(term54336, term54336.getClass(), "keySet", null);
        setField(term54336, term54336.getClass(), "values", null);
        setField(term54336, term54336.getClass(), "entrySet", null);
        setIntField(term54336, term54336.getClass(), "size", 0);
        setIntField(term54336, term54336.getClass(), "modCount", 0);
        setField(term54336, term54336.getClass(), "keyAnalyzer", null);
        setField(term54333, term54333.getClass(), "this$0", term54336);
        setField(term54333, term54333.getClass(), "entrySet", null);
        setField(term54333, term54333.getClass(), "keySet", null);
        setField(term54333, term54333.getClass(), "values", null);
        setField(term54332, term54332.getClass(), "sm", term54333);
        setField(term54332, term54332.getClass(), "m", term54333);
        setField(term54332, term54332.getClass(), "keySet", null);
        setField(term54332, term54332.getClass(), "entrySet", null);
        setField(term54332, term54332.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term51701;
        Object retValue = callMethod(klass, "headMap", argTypes, term51493, args);
        assertTrue(recursiveEquals(term51493, term54340));
        assertTrue(recursiveEquals(term51701, term54342));
        assertTrue(recursiveEquals(retValue, term54332));
    }

};


