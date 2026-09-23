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
import java.lang.NullPointerException;
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IteratorUtils_collatedIterator_1048529137327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44974;
     Object term44870;

    public IteratorUtils_collatedIterator_1048529137327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44974 = newInstance(Class.forName("java.io.ObjectStreamClass$3"));
        term44870 = (Object[]) newArray("java.util.Iterator", 381);
        Object term45098 = newInstance(Class.forName("org.apache.commons.collections4.iterators.CollatingIterator"));
        Object term45182 = newInstance(Class.forName("java.util.Collections$EmptyListIterator"));
        setElement(term44870, 0, term45098);
        setElement(term44870, 256, term45182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Comparator");
        argTypes[1] = Array.newInstance(Class.forName("java.util.Iterator"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term44974;
        args[1] = term44870;
        try {
            callMethod(klass, "collatedIterator", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


