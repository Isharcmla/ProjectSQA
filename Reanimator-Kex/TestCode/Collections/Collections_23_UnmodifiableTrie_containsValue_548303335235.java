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

public class UnmodifiableTrie_containsValue_548303335235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51829;
     Object term54405;
     Object term54407;
     Object term54409;

    public UnmodifiableTrie_containsValue_548303335235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51829 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term51941 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term52053 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term52157 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term52053, term52053.getClass(), "delegate", term52157);
        setField(term51941, term51941.getClass(), "delegate", term52053);
        setField(term51829, term51829.getClass(), "delegate", term51941);
        term54405 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        Object term54406 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54406, term54406.getClass(), "root", null);
        setField(term54406, term54406.getClass(), "keySet", null);
        setField(term54406, term54406.getClass(), "values", null);
        setField(term54406, term54406.getClass(), "entrySet", term54405);
        setIntField(term54406, term54406.getClass(), "size", 0);
        setIntField(term54406, term54406.getClass(), "modCount", 0);
        setField(term54406, term54406.getClass(), "keyAnalyzer", null);
        setField(term54405, term54405.getClass(), "this$0", term54406);
        term54407 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        Object term54408 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        setField(term54407, term54407.getClass(), "root", null);
        setField(term54407, term54407.getClass(), "keySet", null);
        setField(term54407, term54407.getClass(), "values", null);
        setField(term54408, term54408.getClass(), "this$0", term54407);
        setField(term54407, term54407.getClass(), "entrySet", term54408);
        setIntField(term54407, term54407.getClass(), "size", 0);
        setIntField(term54407, term54407.getClass(), "modCount", 0);
        setField(term54407, term54407.getClass(), "keyAnalyzer", null);
        term54409 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        Object term54410 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term54410, term54410.getClass(), "root", null);
        setField(term54410, term54410.getClass(), "keySet", null);
        setField(term54410, term54410.getClass(), "values", null);
        setField(term54410, term54410.getClass(), "entrySet", term54409);
        setIntField(term54410, term54410.getClass(), "size", 0);
        setIntField(term54410, term54410.getClass(), "modCount", 0);
        setField(term54410, term54410.getClass(), "keyAnalyzer", null);
        setField(term54409, term54409.getClass(), "this$0", term54410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsValue", argTypes, term51829, args);
        assertTrue(recursiveEquals(term51829, term54405));
    }

};


