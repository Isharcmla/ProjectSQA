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

public class Partial_with_1879100418165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696525;
     Object term699525;

    public Partial_with_1879100418165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term696525 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term695454 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 162);
        Object term696645 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term696765 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term696885 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697005 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697125 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697245 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697365 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697485 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697605 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697725 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697845 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term697965 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term698085 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term698205 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term698325 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term698445 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term698565 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term698685 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term698805 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term698925 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term699045 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term699165 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term699285 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term699405 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term695454, 0, term696645);
        setElement(term695454, 2, term696765);
        setElement(term695454, 3, term696885);
        setElement(term695454, 4, term697005);
        setElement(term695454, 6, term697125);
        setElement(term695454, 7, term697245);
        setElement(term695454, 8, term697365);
        setElement(term695454, 13, term697485);
        setElement(term695454, 15, term697605);
        setElement(term695454, 16, term697725);
        setElement(term695454, 17, term696645);
        setElement(term695454, 18, term697725);
        setElement(term695454, 19, term696765);
        setElement(term695454, 26, term697845);
        setElement(term695454, 27, term697965);
        setElement(term695454, 28, term698085);
        setElement(term695454, 29, term698205);
        setElement(term695454, 31, term697605);
        setElement(term695454, 32, term698325);
        setElement(term695454, 33, term697605);
        setElement(term695454, 34, term697605);
        setElement(term695454, 35, term697725);
        setElement(term695454, 36, term698445);
        setElement(term695454, 37, term698565);
        setElement(term695454, 40, term698685);
        setElement(term695454, 41, term698805);
        setElement(term695454, 47, term698925);
        setElement(term695454, 48, term697365);
        setElement(term695454, 49, term699045);
        setElement(term695454, 50, term697365);
        setElement(term695454, 51, term696645);
        setElement(term695454, 52, term696885);
        setElement(term695454, 53, term697125);
        setElement(term695454, 54, term697485);
        setElement(term695454, 55, term697605);
        setElement(term695454, 56, term697365);
        setElement(term695454, 57, term698925);
        setElement(term695454, 58, term699165);
        setElement(term695454, 59, term696645);
        setElement(term695454, 60, term697845);
        setElement(term695454, 70, term697725);
        setElement(term695454, 71, term697725);
        setElement(term695454, 72, term697725);
        setElement(term695454, 73, term697725);
        setElement(term695454, 74, term697725);
        setElement(term695454, 75, term697725);
        setElement(term695454, 76, term697725);
        setElement(term695454, 77, term696645);
        setElement(term695454, 78, term697725);
        setElement(term695454, 79, term697725);
        setElement(term695454, 80, term697725);
        setElement(term695454, 81, term697725);
        setElement(term695454, 82, term697725);
        setElement(term695454, 83, term697725);
        setElement(term695454, 84, term697725);
        setElement(term695454, 85, term697725);
        setElement(term695454, 86, term697725);
        setElement(term695454, 87, term698805);
        setElement(term695454, 145, term697725);
        setElement(term695454, 153, term698205);
        setElement(term695454, 154, term698445);
        setElement(term695454, 155, term699285);
        setElement(term695454, 156, term698445);
        setElement(term695454, 157, term698445);
        setElement(term695454, 158, term696885);
        setElement(term695454, 159, term699405);
        setElement(term695454, 160, term697965);
        setElement(term695454, 161, term698925);
        setField(term696525, term696525.getClass(), "iTypes", term695454);
        term699525 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term699525;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term696525, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


