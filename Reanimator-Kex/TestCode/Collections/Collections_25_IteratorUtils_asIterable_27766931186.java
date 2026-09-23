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

public class IteratorUtils_asIterable_27766931186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23442;
     Object term23515;
     Object term23508;

    public IteratorUtils_asIterable_27766931186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23442 = newInstance(Class.forName("org.apache.commons.collections4.queue.CircularFifoQueue$1"));
        term23515 = newInstance(Class.forName("org.apache.commons.collections4.queue.CircularFifoQueue$1"));
        setIntField(term23515, term23515.getClass(), "index", 0);
        setIntField(term23515, term23515.getClass(), "lastReturnedIndex", 0);
        setBooleanField(term23515, term23515.getClass(), "isFirst", false);
        setField(term23515, term23515.getClass(), "this$0", null);
        term23508 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorIterable"));
        Object term23509 = newInstance(Class.forName("org.apache.commons.collections4.queue.CircularFifoQueue$1"));
        Object term23513 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorIterable$1"));
        setIntField(term23509, term23509.getClass(), "index", 0);
        setIntField(term23509, term23509.getClass(), "lastReturnedIndex", 0);
        setBooleanField(term23509, term23509.getClass(), "isFirst", false);
        setField(term23509, term23509.getClass(), "this$0", null);
        setField(term23508, term23508.getClass(), "iterator", term23509);
        setField(term23513, term23513.getClass(), "val$iterator", term23509);
        setField(term23508, term23508.getClass(), "typeSafeIterator", term23513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term23442;
        Object retValue = callMethod(klass, "asIterable", argTypes, null, args);
        assertTrue(recursiveEquals(term23442, term23515));
        assertTrue(recursiveEquals(retValue, term23508));
    }

};


