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

public class DefaultIntervalCategoryDataset_init_124550799834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term105;
     Object term114;

    public DefaultIntervalCategoryDataset_init_124550799834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = (Object[]) newArray("java.lang.String", 2);
        setElement(term80, 0, "PAEBtnZtTD");
        setElement(term80, 1, "sjlJAEtRrb");
        term105 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term106 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term107 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term108 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term109 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term110 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term111 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term112 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term113 = (Object[]) newArray("java.lang.Number", 5);
        setElement(term105, 0, term106);
        setElement(term105, 1, term107);
        setElement(term105, 2, term108);
        setElement(term105, 3, term109);
        setElement(term105, 4, term110);
        setElement(term105, 5, term111);
        setElement(term105, 6, term112);
        setElement(term105, 7, term113);
        term114 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 3);
        Object[] term115 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term116 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term117 = (Object[]) newArray("java.lang.Number", 6);
        setElement(term114, 0, term115);
        setElement(term114, 1, term116);
        setElement(term114, 2, term117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term80;
        args[1] = term105;
        args[2] = term114;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


