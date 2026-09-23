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

public class UnmodifiableTrie_toString_184994185184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38242;
     Object term38791;

    public UnmodifiableTrie_toString_184994185184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38242 = newInstance(Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie"));
        Object term38346 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        setField(term38242, term38242.getClass(), "delegate", term38346);
        term38791 = newInstance(Class.forName("org.apache.commons.collections4.trie.PatriciaTrie"));
        Object term38792 = newInstance(Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet"));
        setField(term38791, term38791.getClass(), "root", null);
        setField(term38791, term38791.getClass(), "keySet", null);
        setField(term38791, term38791.getClass(), "values", null);
        setField(term38792, term38792.getClass(), "this$0", term38791);
        setField(term38791, term38791.getClass(), "entrySet", term38792);
        setIntField(term38791, term38791.getClass(), "size", 0);
        setIntField(term38791, term38791.getClass(), "modCount", 0);
        setField(term38791, term38791.getClass(), "keyAnalyzer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.UnmodifiableTrie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term38242, args);
        assertTrue(recursiveEquals(term38242, term38791));
        assertTrue(recursiveEquals(retValue, "Trie[0]={\n}\n"));
    }

};


