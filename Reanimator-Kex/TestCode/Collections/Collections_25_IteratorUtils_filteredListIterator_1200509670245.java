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

public class IteratorUtils_filteredListIterator_1200509670245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30335;
     Object term30447;
     Object term30711;
     Object term30712;
     Object term30705;

    public IteratorUtils_filteredListIterator_1200509670245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30335 = newInstance(Class.forName("org.apache.commons.collections4.iterators.AbstractListIteratorDecorator"));
        term30447 = newInstance(Class.forName("org.apache.commons.collections4.functors.OnePredicate"));
        term30711 = newInstance(Class.forName("org.apache.commons.collections4.iterators.AbstractListIteratorDecorator"));
        setField(term30711, term30711.getClass(), "iterator", null);
        term30712 = newInstance(Class.forName("org.apache.commons.collections4.functors.OnePredicate"));
        setField(term30712, term30712.getClass(), "iPredicates", null);
        term30705 = newInstance(Class.forName("org.apache.commons.collections4.iterators.FilterListIterator"));
        Object term30706 = newInstance(Class.forName("org.apache.commons.collections4.iterators.AbstractListIteratorDecorator"));
        Object term30707 = newInstance(Class.forName("org.apache.commons.collections4.functors.OnePredicate"));
        setField(term30706, term30706.getClass(), "iterator", null);
        setField(term30705, term30705.getClass(), "iterator", term30706);
        setField(term30707, term30707.getClass(), "iPredicates", null);
        setField(term30705, term30705.getClass(), "predicate", term30707);
        setField(term30705, term30705.getClass(), "nextObject", null);
        setBooleanField(term30705, term30705.getClass(), "nextObjectSet", false);
        setField(term30705, term30705.getClass(), "previousObject", null);
        setBooleanField(term30705, term30705.getClass(), "previousObjectSet", false);
        setIntField(term30705, term30705.getClass(), "nextIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ListIterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Predicate");
        Object[] args = new Object[2];
        args[0] = term30335;
        args[1] = term30447;
        Object retValue = callMethod(klass, "filteredListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term30335, term30711));
        assertTrue(recursiveEquals(term30447, term30712));
        assertTrue(recursiveEquals(retValue, term30705));
    }

};


