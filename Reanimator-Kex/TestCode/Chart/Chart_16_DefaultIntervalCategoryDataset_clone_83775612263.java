package org.jfree.data.category;

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
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.category.EqualityUtils.*;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_clone_83775612263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929;
     Object term9445;
     Object term9439;

    public DefaultIntervalCategoryDataset_clone_83775612263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term929 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term930 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term931 = (Object[]) newArray("java.lang.Number", 3);
        setElement(term929, 0, term930);
        setElement(term929, 1, term931);
        term9445 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term9446 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term9447 = (Object[]) newArray("java.lang.Number", 3);
        setElement(term9445, 0, term9446);
        setElement(term9445, 1, term9447);
        term9439 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term9440 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term9441 = (Object[]) newArray("java.lang.Number", 3);
        setElement(term9439, 0, term9440);
        setElement(term9439, 1, term9441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term929;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term929, term9445));
        assertTrue(recursiveEquals(retValue, term9439));
    }

};


