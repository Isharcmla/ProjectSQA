package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Partial_getFormatter_343811671150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44702;
     Object term45663;

    public Partial_getFormatter_343811671150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44702 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term44640 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        setField(term44702, term44702.getClass(), "iFormatter", null);
        setField(term44702, term44702.getClass(), "iTypes", term44640);
        term45663 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term45664 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 1);
        Object[] term45665 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 2);
        setField(term45663, term45663.getClass(), "iChronology", null);
        setField(term45663, term45663.getClass(), "iTypes", term45664);
        setField(term45663, term45663.getClass(), "iValues", null);
        setField(term45663, term45663.getClass(), "iFormatter", term45665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term44702, args);
        assertTrue(recursiveEquals(term44702, term45663));
        assertTrue(recursiveEquals(retValue, null));
    }

};


