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
import java.util.ArrayList;

public class IteratorUtils_collatedIterator_1253146431265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33579;
     Object term34144;
     Object term34132;

    public IteratorUtils_collatedIterator_1253146431265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33579 = new ArrayList();
        term34144 = new ArrayList();
        ArrayList term34133 = new ArrayList();
        term34132 = newInstance(Class.forName("org.apache.commons.collections4.iterators.CollatingIterator"));
        setField(term34132, term34132.getClass(), "comparator", null);
        setField(term34132, term34132.getClass(), "iterators", term34133);
        setField(term34132, term34132.getClass(), "values", null);
        setField(term34132, term34132.getClass(), "valueSet", null);
        setIntField(term34132, term34132.getClass(), "lastReturned", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Comparator");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33579;
        Object retValue = callMethod(klass, "collatedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term33579, term34144));
        assertTrue(recursiveEquals(retValue, term34132));
    }

};


