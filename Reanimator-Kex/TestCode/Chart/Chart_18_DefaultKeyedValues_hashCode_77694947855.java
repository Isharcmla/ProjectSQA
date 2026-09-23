package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;

public class DefaultKeyedValues_hashCode_77694947855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6347;
     Object term6602;

    public DefaultKeyedValues_hashCode_77694947855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6347 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term6347, term6347.getClass(), "keys", null);
        term6602 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term6602, term6602.getClass(), "keys", null);
        setField(term6602, term6602.getClass(), "values", null);
        setField(term6602, term6602.getClass(), "indexMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6347, args);
        assertTrue(recursiveEquals(term6347, term6602));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


