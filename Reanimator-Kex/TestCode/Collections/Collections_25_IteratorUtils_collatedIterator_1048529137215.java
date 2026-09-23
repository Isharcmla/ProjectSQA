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
import java.util.ArrayList;

public class IteratorUtils_collatedIterator_1048529137215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25570;
     Object term25473;
     Object term25595;
     Object term25596;
     Object term25585;

    public IteratorUtils_collatedIterator_1048529137215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25570 = newInstance(Class.forName("java.io.ObjectStreamClass$5"));
        term25473 = (Object[]) newArray("java.util.Iterator", 0);
        term25595 = newInstance(Class.forName("java.io.ObjectStreamClass$5"));
        term25596 = (Object[]) newArray("java.util.Iterator", 0);
        ArrayList term25587 = new ArrayList();
        term25585 = newInstance(Class.forName("org.apache.commons.collections4.iterators.CollatingIterator"));
        Object term25586 = newInstance(Class.forName("java.io.ObjectStreamClass$5"));
        setField(term25585, term25585.getClass(), "comparator", term25586);
        setField(term25585, term25585.getClass(), "iterators", term25587);
        setField(term25585, term25585.getClass(), "values", null);
        setField(term25585, term25585.getClass(), "valueSet", null);
        setIntField(term25585, term25585.getClass(), "lastReturned", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Comparator");
        argTypes[1] = Array.newInstance(Class.forName("java.util.Iterator"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term25570;
        args[1] = term25473;
        Object retValue = callMethod(klass, "collatedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term25570, term25595));
        assertTrue(recursiveEquals(term25473, term25596));
        assertTrue(recursiveEquals(retValue, term25585));
    }

};


