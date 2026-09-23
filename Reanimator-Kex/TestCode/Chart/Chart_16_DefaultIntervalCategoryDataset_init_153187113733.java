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
import java.lang.IllegalArgumentException;
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_init_153187113733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term74;

    public DefaultIntervalCategoryDataset_init_153187113733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 1);
        Object[] term73 = (Object[]) newArray("java.lang.Number", 6);
        setElement(term72, 0, term73);
        term74 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 5);
        Object[] term75 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term76 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term77 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term78 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term79 = (Object[]) newArray("java.lang.Number", 0);
        setElement(term74, 0, term75);
        setElement(term74, 1, term76);
        setElement(term74, 2, term77);
        setElement(term74, 3, term78);
        setElement(term74, 4, term79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term72;
        args[1] = term74;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


