package org.jfree.data.statistics;

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
import java.lang.NullPointerException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultBoxAndWhiskerCategoryDataset_getMinRegularValue_1634980114188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42450;
     Object term42574;
     Object term42628;

    public DefaultBoxAndWhiskerCategoryDataset_getMinRegularValue_1634980114188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42450 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term42514 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term42450, term42450.getClass(), "data", term42514);
        term42574 = newInstance(Class.forName("java.nio.DirectLongBufferRU"));
        term42628 = newInstance(Class.forName("java.nio.HeapShortBuffer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term42574;
        args[1] = term42628;
        try {
            callMethod(klass, "getMinRegularValue", argTypes, term42450, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


