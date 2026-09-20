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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_with_1879100418233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138615;
     Object term138855;

    public Partial_with_1879100418233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138615 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term138424 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 22);
        Object term138735 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term138424, 0, term138735);
        setElement(term138424, 1, term138735);
        setElement(term138424, 2, term138735);
        setElement(term138424, 3, term138735);
        setElement(term138424, 4, term138735);
        setElement(term138424, 5, term138735);
        setElement(term138424, 6, term138735);
        setElement(term138424, 7, term138735);
        setElement(term138424, 8, term138735);
        setElement(term138424, 9, term138735);
        setElement(term138424, 10, term138735);
        setElement(term138424, 11, term138735);
        setElement(term138424, 12, term138735);
        setElement(term138424, 13, term138735);
        setElement(term138424, 14, term138735);
        setElement(term138424, 15, term138735);
        setElement(term138424, 16, term138735);
        setElement(term138424, 17, term138735);
        setElement(term138424, 18, term138735);
        setElement(term138424, 19, term138735);
        setElement(term138424, 20, term138735);
        setElement(term138424, 21, term138735);
        setField(term138615, term138615.getClass(), "iTypes", term138424);
        term138855 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term138855;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term138615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
