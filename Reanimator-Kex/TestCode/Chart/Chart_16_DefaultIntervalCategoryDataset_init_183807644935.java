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

public class DefaultIntervalCategoryDataset_init_183807644935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term139;
     Object term140;
     Object term146;

    public DefaultIntervalCategoryDataset_init_183807644935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138 = (Object[]) newArray("java.lang.Comparable", 6);
        term139 = (Object[]) newArray("java.lang.Comparable", 2);
        term140 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 5);
        Object[] term141 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term142 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term143 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term144 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term145 = (Object[]) newArray("java.lang.Number", 0);
        setElement(term140, 0, term141);
        setElement(term140, 1, term142);
        setElement(term140, 2, term143);
        setElement(term140, 3, term144);
        setElement(term140, 4, term145);
        term146 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 9);
        Object[] term147 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term148 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term149 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term150 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term151 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term152 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term153 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term154 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term155 = (Object[]) newArray("java.lang.Number", 9);
        setElement(term146, 0, term147);
        setElement(term146, 1, term148);
        setElement(term146, 2, term149);
        setElement(term146, 3, term150);
        setElement(term146, 4, term151);
        setElement(term146, 5, term152);
        setElement(term146, 6, term153);
        setElement(term146, 7, term154);
        setElement(term146, 8, term155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        argTypes[3] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term138;
        args[1] = term139;
        args[2] = term140;
        args[3] = term146;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


