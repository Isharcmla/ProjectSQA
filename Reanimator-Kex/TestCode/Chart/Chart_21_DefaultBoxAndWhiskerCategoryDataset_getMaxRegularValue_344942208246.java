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
import java.util.ArrayList;
import java.lang.String;

public class DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_344942208246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59984;
     Object term60174;
     Object enum24;

    public DefaultBoxAndWhiskerCategoryDataset_getMaxRegularValue_344942208246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term60100 = new ArrayList();
        term59984 = newInstance(Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset"));
        Object term60048 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term60048, term60048.getClass(), "rowKeys", term60100);
        setField(term59984, term59984.getClass(), "data", term60048);
        term60174 = newInstance(Class.forName("java.util.JapaneseImperialCalendar"));
        Class<? extends Object> term60716 = Class.forName((String) "java.util.regex.Pattern$Qtype");
        Field term60715 = ((Class) term60716).getDeclaredField((String) "GREEDY");
        ((Field) term60715).setAccessible(true);
        enum24 = ((Field) term60715).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term60174;
        args[1] = enum24;
        try {
            callMethod(klass, "getMaxRegularValue", argTypes, term59984, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


