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
import java.lang.Long;

public class DefaultBoxAndWhiskerCategoryDataset_getMinRegularValue_1634980114244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59073;
     Object term59231;
     Object term59301;

    public DefaultBoxAndWhiskerCategoryDataset_getMinRegularValue_1634980114244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term59189 = new ArrayList();
        term59073 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term59137 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term59137, term59137.getClass(), "rowKeys", term59189);
        setField(term59073, term59073.getClass(), "data", term59137);
        term59231 = new Long(0L);
        term59301 = newInstance(Class.forName("java.nio.ByteBufferAsIntBufferRL"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term59231;
        args[1] = term59301;
        try {
            callMethod(klass, "getMinRegularValue", argTypes, term59073, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


