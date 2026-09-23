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
import java.util.ArrayList;

public class DefaultIntervalCategoryDataset_getRowKeys_119648686371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10714;
     Object term10721;
     Object term10716;

    public DefaultIntervalCategoryDataset_getRowKeys_119648686371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10714 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term10714, term10714.getClass(), "seriesKeys", null);
        term10721 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        setField(term10721, term10721.getClass(), "seriesKeys", null);
        setField(term10721, term10721.getClass(), "categoryKeys", null);
        setField(term10721, term10721.getClass(), "startData", null);
        setField(term10721, term10721.getClass(), "endData", null);
        setField(term10721, term10721.getClass(), "group", null);
        setField(term10721, term10721.getClass(), "listenerList", null);
        term10716 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowKeys", argTypes, term10714, args);
        assertTrue(recursiveEquals(term10714, term10721));
        assertTrue(recursiveEquals(retValue, term10716));
    }

};


