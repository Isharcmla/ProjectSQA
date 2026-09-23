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

public class UnmodifiableTrie_tailMap_1715503808232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48323;
     Object term48531;
     Object term54050;
     Object term54052;
     Object term54042;

    public UnmodifiableTrie_tailMap_1715503808232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48323 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term48427 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term48323, term48323.getClass(), "delegate", term48427);
        term48531 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        term54050 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term54051 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54051, term54051.getClass(), "root", null);
        setField(term54051, term54051.getClass(), "keySet", null);
        setField(term54051, term54051.getClass(), "values", null);
        setField(term54051, term54051.getClass(), "entrySet", null);
        setIntField(term54051, term54051.getClass(), "size", 0);
        setIntField(term54051, term54051.getClass(), "modCount", 0);
        setField(term54051, term54051.getClass(), "keyAnalyzer", null);
        setField(term54050, term54050.getClass(), "delegate", term54051);
        term54052 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54052, term54052.getClass(), "root", null);
        setField(term54052, term54052.getClass(), "keySet", null);
        setField(term54052, term54052.getClass(), "values", null);
        setField(term54052, term54052.getClass(), "entrySet", null);
        setIntField(term54052, term54052.getClass(), "size", 0);
        setIntField(term54052, term54052.getClass(), "modCount", 0);
        setField(term54052, term54052.getClass(), "keyAnalyzer", null);
        term54042 = newInstance(Class.forName("java.util.Collections$UnmodifiableSortedMap"));
        Object term54043 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap"));
        Object term54031 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        Object term54046 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54031, term54031.getClass(), "root", null);
        setField(term54031, term54031.getClass(), "keySet", null);
        setField(term54031, term54031.getClass(), "values", null);
        setField(term54031, term54031.getClass(), "entrySet", null);
        setIntField(term54031, term54031.getClass(), "size", 0);
        setIntField(term54031, term54031.getClass(), "modCount", 0);
        setField(term54031, term54031.getClass(), "keyAnalyzer", null);
        setField(term54043, term54043.getClass(), "fromKey", term54031);
        setField(term54043, term54043.getClass(), "toKey", null);
        setBooleanField(term54043, term54043.getClass(), "fromInclusive", true);
        setBooleanField(term54043, term54043.getClass(), "toInclusive", false);
        setField(term54046, term54046.getClass(), "root", null);
        setField(term54046, term54046.getClass(), "keySet", null);
        setField(term54046, term54046.getClass(), "values", null);
        setField(term54046, term54046.getClass(), "entrySet", null);
        setIntField(term54046, term54046.getClass(), "size", 0);
        setIntField(term54046, term54046.getClass(), "modCount", 0);
        setField(term54046, term54046.getClass(), "keyAnalyzer", null);
        setField(term54043, term54043.getClass(), "this$0", term54046);
        setField(term54043, term54043.getClass(), "entrySet", null);
        setField(term54043, term54043.getClass(), "keySet", null);
        setField(term54043, term54043.getClass(), "values", null);
        setField(term54042, term54042.getClass(), "sm", term54043);
        setField(term54042, term54042.getClass(), "m", term54043);
        setField(term54042, term54042.getClass(), "keySet", null);
        setField(term54042, term54042.getClass(), "entrySet", null);
        setField(term54042, term54042.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term48531;
        Object retValue = callMethod(klass, "tailMap", argTypes, term48323, args);
        assertTrue(recursiveEquals(term48323, term54050));
        assertTrue(recursiveEquals(term48531, term54052));
        assertTrue(recursiveEquals(retValue, term54042));
    }

};


