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

public class IteratorUtils_unmodifiableListIterator_2000508858517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96548;
     Object term96553;
     Object term96552;

    public IteratorUtils_unmodifiableListIterator_2000508858517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96548 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableListIterator"));
        term96553 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableListIterator"));
        setField(term96553, term96553.getClass(), "iterator", null);
        term96552 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableListIterator"));
        setField(term96552, term96552.getClass(), "iterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ListIterator");
        Object[] args = new Object[1];
        args[0] = term96548;
        Object retValue = callMethod(klass, "unmodifiableListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term96548, term96553));
        assertTrue(recursiveEquals(retValue, term96552));
    }

};


