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

public class UnmodifiableTrie_containsValue_548303335158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33153;
     Object term33650;
     Object term33652;
     Object term33654;

    public UnmodifiableTrie_containsValue_548303335158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33153 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term33265 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term33369 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term33265, term33265.getClass(), "delegate", term33369);
        setField(term33153, term33153.getClass(), "delegate", term33265);
        term33650 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        Object term33651 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term33651, term33651.getClass(), "root", null);
        setField(term33651, term33651.getClass(), "keySet", null);
        setField(term33651, term33651.getClass(), "values", null);
        setField(term33651, term33651.getClass(), "entrySet", term33650);
        setIntField(term33651, term33651.getClass(), "size", 0);
        setIntField(term33651, term33651.getClass(), "modCount", 0);
        setField(term33651, term33651.getClass(), "keyAnalyzer", null);
        setField(term33650, term33650.getClass(), "this$0", term33651);
        term33652 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        Object term33653 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        setField(term33652, term33652.getClass(), "root", null);
        setField(term33652, term33652.getClass(), "keySet", null);
        setField(term33652, term33652.getClass(), "values", null);
        setField(term33653, term33653.getClass(), "this$0", term33652);
        setField(term33652, term33652.getClass(), "entrySet", term33653);
        setIntField(term33652, term33652.getClass(), "size", 0);
        setIntField(term33652, term33652.getClass(), "modCount", 0);
        setField(term33652, term33652.getClass(), "keyAnalyzer", null);
        term33654 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        Object term33655 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term33655, term33655.getClass(), "root", null);
        setField(term33655, term33655.getClass(), "keySet", null);
        setField(term33655, term33655.getClass(), "values", null);
        setField(term33655, term33655.getClass(), "entrySet", term33654);
        setIntField(term33655, term33655.getClass(), "size", 0);
        setIntField(term33655, term33655.getClass(), "modCount", 0);
        setField(term33655, term33655.getClass(), "keyAnalyzer", null);
        setField(term33654, term33654.getClass(), "this$0", term33655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsValue", argTypes, term33153, args);
        assertTrue(recursiveEquals(term33153, term33650));
    }

};


