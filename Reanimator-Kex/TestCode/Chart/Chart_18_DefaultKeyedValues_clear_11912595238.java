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
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultKeyedValues_clear_11912595238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term3848;

    public DefaultKeyedValues_clear_11912595238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term228 = new ArrayList();
        ArrayList term232 = new ArrayList();
        HashMap term236 = new HashMap();
        term227 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term227, term227.getClass(), "keys", term228);
        setField(term227, term227.getClass(), "values", term232);
        setField(term227, term227.getClass(), "indexMap", term236);
        ArrayList term3849 = new ArrayList();
        ArrayList term3851 = new ArrayList();
        HashMap term3853 = new HashMap();
        term3848 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term3848, term3848.getClass(), "keys", term3849);
        setField(term3848, term3848.getClass(), "values", term3851);
        setField(term3848, term3848.getClass(), "indexMap", term3853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term227, args);
        assertTrue(recursiveEquals(term227, term3848));
    }

};


