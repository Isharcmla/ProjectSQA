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

public class DefaultIntervalCategoryDataset_init_1245507998115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22512;
     Object term22680;
     Object term22687;

    public DefaultIntervalCategoryDataset_init_1245507998115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22658 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term22658, term22658.getClass(), "group", null);
        setField(term22658, term22658.getClass(), "listenerList", null);
        setField(term22658, term22658.getClass(), "startData", null);
        setField(term22658, term22658.getClass(), "endData", null);
        term22512 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        term22680 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term22681 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
        Object term22682 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term22685 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term22686 = (Object[]) newArray("java.lang.Object", 0);
        setField(term22680, term22680.getClass(), "seriesKeys", null);
        setField(term22680, term22680.getClass(), "categoryKeys", null);
        setField(term22680, term22680.getClass(), "startData", term22681);
        setField(term22680, term22680.getClass(), "endData", null);
        setField(term22682, term22682.getClass(), "id", "NOID");
        setField(term22680, term22680.getClass(), "group", term22682);
        setField(term22685, term22685.getClass(), "listenerList", term22686);
        setField(term22680, term22680.getClass(), "listenerList", term22685);
        term22687 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term22512;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22680));
        assertTrue(recursiveEquals(term22512, term22687));
    }

};


