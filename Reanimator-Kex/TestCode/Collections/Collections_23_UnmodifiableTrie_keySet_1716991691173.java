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

public class UnmodifiableTrie_keySet_1716991691173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36179;
     Object term36632;
     Object term36626;

    public UnmodifiableTrie_keySet_1716991691173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36179 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term36283 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term36179, term36179.getClass(), "delegate", term36283);
        term36632 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term36633 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term36633, term36633.getClass(), "root", null);
        setField(term36633, term36633.getClass(), "keySet", null);
        setField(term36633, term36633.getClass(), "values", null);
        setField(term36633, term36633.getClass(), "entrySet", null);
        setIntField(term36633, term36633.getClass(), "size", 0);
        setIntField(term36633, term36633.getClass(), "modCount", 0);
        setField(term36633, term36633.getClass(), "keyAnalyzer", null);
        setField(term36632, term36632.getClass(), "delegate", term36633);
        term36626 = newInstance(Class.forName("java.util.Collections$UnmodifiableSet"));
        Object term36627 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$KeySet"));
        Object term36628 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term36628, term36628.getClass(), "root", null);
        setField(term36628, term36628.getClass(), "keySet", null);
        setField(term36628, term36628.getClass(), "values", null);
        setField(term36628, term36628.getClass(), "entrySet", null);
        setIntField(term36628, term36628.getClass(), "size", 0);
        setIntField(term36628, term36628.getClass(), "modCount", 0);
        setField(term36628, term36628.getClass(), "keyAnalyzer", null);
        setField(term36627, term36627.getClass(), "this$0", term36628);
        setField(term36626, term36626.getClass(), "c", term36627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "keySet", argTypes, term36179, args);
        assertTrue(recursiveEquals(term36179, term36632));
        assertTrue(recursiveEquals(retValue, term36626));
    }

};


