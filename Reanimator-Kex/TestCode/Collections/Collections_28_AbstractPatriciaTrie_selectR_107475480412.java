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
import java.lang.Integer;

public class AbstractPatriciaTrie_selectR_107475480412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;

    public AbstractPatriciaTrie_selectR_107475480412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(0);
        term5 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Reference");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term3;
        args[2] = null;
        args[3] = term5;
        args[4] = null;
        callMethod(klass, "selectR", argTypes, null, args);
    }

};


