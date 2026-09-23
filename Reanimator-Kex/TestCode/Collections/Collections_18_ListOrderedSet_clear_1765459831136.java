package org.apache.commons.collections.set;

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
import java.lang.StackOverflowError;
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ListOrderedSet_clear_1765459831136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23737;

    public ListOrderedSet_clear_1765459831136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23737 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term23841 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term23945 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term23945, term23945.getClass(), "collection", term23945);
        setField(term23841, term23841.getClass(), "collection", term23945);
        setField(term23737, term23737.getClass(), "collection", term23841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term23737, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


