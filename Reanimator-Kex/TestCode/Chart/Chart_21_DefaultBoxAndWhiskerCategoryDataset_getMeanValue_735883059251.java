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
import org.jfree.data.UnknownKeyException;
import static org.jfree.data.statistics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class DefaultBoxAndWhiskerCategoryDataset_getMeanValue_735883059251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62860;
     Object term63034;
     Object term63112;

    public DefaultBoxAndWhiskerCategoryDataset_getMeanValue_735883059251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term62976 = new ArrayList();
        term62860 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term62924 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term62924, term62924.getClass(), "rowKeys", term62976);
        setField(term62860, term62860.getClass(), "data", term62924);
        term63034 = newInstance(Class.forName("java.nio.DirectCharBufferU"));
        term63112 = newInstance(Class.forName("org.jfree.data.time.FixedMillisecond"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term63034;
        args[1] = term63112;
        try {
            callMethod(klass, "getMeanValue", argTypes, term62860, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


