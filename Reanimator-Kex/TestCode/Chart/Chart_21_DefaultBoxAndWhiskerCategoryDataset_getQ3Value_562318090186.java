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

public class DefaultBoxAndWhiskerCategoryDataset_getQ3Value_562318090186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41857;
     Object term41991;
     Object term42053;

    public DefaultBoxAndWhiskerCategoryDataset_getQ3Value_562318090186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41857 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term41921 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term41857, term41857.getClass(), "data", term41921);
        term41991 = newInstance(Class.forName("java.nio.ByteBufferAsLongBufferL"));
        term42053 = newInstance(Class.forName("java.nio.DirectFloatBufferRS"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term41991;
        args[1] = term42053;
        try {
            callMethod(klass, "getQ3Value", argTypes, term41857, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


