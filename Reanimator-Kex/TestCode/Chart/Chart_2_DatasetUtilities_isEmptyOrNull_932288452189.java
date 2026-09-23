package org.jfree.data.general;

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
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.general.EqualityUtils.*;

public class DatasetUtilities_isEmptyOrNull_932288452189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28450;
     Object term47840;

    public DatasetUtilities_isEmptyOrNull_932288452189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28450 = newInstance(Class.forName("org.jfree.data.category.CategoryToPieDataset"));
        term47840 = newInstance(Class.forName("org.jfree.data.category.CategoryToPieDataset"));
        setField(term47840, term47840.getClass(), "source", null);
        setField(term47840, term47840.getClass(), "extract", null);
        setIntField(term47840, term47840.getClass(), "index", 0);
        setField(term47840, term47840.getClass(), "selectionState", null);
        setField(term47840, term47840.getClass(), "group", null);
        setField(term47840, term47840.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.pie.PieDataset");
        Object[] args = new Object[1];
        args[0] = term28450;
        Object retValue = callMethod(klass, "isEmptyOrNull", argTypes, null, args);
        assertTrue(recursiveEquals(term28450, term47840));
        assertTrue(recursiveEquals(retValue, true));
    }

};


