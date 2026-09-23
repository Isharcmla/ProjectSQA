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
import java.lang.Object;

public class IteratorUtils_filteredIterator_1539772116252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31433;
     Object term31545;
     Object term32110;
     Object term32111;
     Object term32104;

    public IteratorUtils_filteredIterator_1539772116252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31433 = newInstance(Class.forName("java.util.Spliterators$4Adapter"));
        term31545 = newInstance(Class.forName("org.apache.commons.collections4.functors.AndPredicate"));
        term32110 = newInstance(Class.forName("java.util.Spliterators$4Adapter"));
        setBooleanField(term32110, term32110.getClass(), "valueReady", false);
        setDoubleField(term32110, term32110.getClass(), "nextElement", 0.0);
        setField(term32110, term32110.getClass(), "val$spliterator", null);
        term32111 = newInstance(Class.forName("org.apache.commons.collections4.functors.AndPredicate"));
        setField(term32111, term32111.getClass(), "iPredicate1", null);
        setField(term32111, term32111.getClass(), "iPredicate2", null);
        term32104 = newInstance(Class.forName("org.apache.commons.collections4.iterators.FilterIterator"));
        Object term32105 = newInstance(Class.forName("java.util.Spliterators$4Adapter"));
        Object term32108 = newInstance(Class.forName("org.apache.commons.collections4.functors.AndPredicate"));
        setBooleanField(term32105, term32105.getClass(), "valueReady", false);
        setDoubleField(term32105, term32105.getClass(), "nextElement", 0.0);
        setField(term32105, term32105.getClass(), "val$spliterator", null);
        setField(term32104, term32104.getClass(), "iterator", term32105);
        setField(term32108, term32108.getClass(), "iPredicate1", null);
        setField(term32108, term32108.getClass(), "iPredicate2", null);
        setField(term32104, term32104.getClass(), "predicate", term32108);
        setField(term32104, term32104.getClass(), "nextObject", null);
        setBooleanField(term32104, term32104.getClass(), "nextObjectSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term31433;
        args[1] = term31545;
        Object retValue = callMethod(klass, "filteredIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term31433, term32110));
        assertTrue(recursiveEquals(term31545, term32111));
        assertTrue(recursiveEquals(retValue, term32104));
    }

};


