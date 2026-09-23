package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;

public class IteratorUtils_find_1675739557232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27297;
     Object term27409;
     Object term27564;
     Object term27565;

    public IteratorUtils_find_1675739557232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27297 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        term27409 = newInstance(Class.forName("org.apache.commons.collections4.functors.NotPredicate"));
        term27564 = newInstance(Class.forName("java.util.zip.ZipFile$ZipEntryIterator"));
        setIntField(term27564, term27564.getClass(), "i", 0);
        setIntField(term27564, term27564.getClass(), "entryCount", 0);
        setField(term27564, term27564.getClass(), "gen", null);
        setField(term27564, term27564.getClass(), "this$0", null);
        term27565 = newInstance(Class.forName("org.apache.commons.collections4.functors.NotPredicate"));
        setField(term27565, term27565.getClass(), "iPredicate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term27297;
        args[1] = term27409;
        Object retValue = callMethod(klass, "find", argTypes, null, args);
        assertTrue(recursiveEquals(term27297, term27564));
        assertTrue(recursiveEquals(term27409, term27565));
        assertTrue(recursiveEquals(retValue, null));
    }

};


