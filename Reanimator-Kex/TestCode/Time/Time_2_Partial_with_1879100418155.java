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

public class Partial_with_1879100418155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665748;
     Object term668628;

    public Partial_with_1879100418155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665748 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term664726 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 154);
        Object term665868 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term665988 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term666108 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term666228 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term666348 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term666468 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term666588 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term666708 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term666828 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term666948 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term667068 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term667188 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term667308 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term667428 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term667548 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term667668 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term667788 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term667908 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term668028 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term668148 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term668268 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term668388 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term668508 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term664726, 0, term665868);
        setElement(term664726, 2, term665988);
        setElement(term664726, 3, term666108);
        setElement(term664726, 5, term666228);
        setElement(term664726, 7, term666228);
        setElement(term664726, 8, term666348);
        setElement(term664726, 11, term666468);
        setElement(term664726, 12, term666468);
        setElement(term664726, 19, term666468);
        setElement(term664726, 24, term666588);
        setElement(term664726, 25, term666708);
        setElement(term664726, 27, term666468);
        setElement(term664726, 28, term666828);
        setElement(term664726, 29, term665988);
        setElement(term664726, 30, term666948);
        setElement(term664726, 31, term667068);
        setElement(term664726, 32, term665868);
        setElement(term664726, 37, term667188);
        setElement(term664726, 39, term667308);
        setElement(term664726, 40, term667428);
        setElement(term664726, 42, term667548);
        setElement(term664726, 50, term667668);
        setElement(term664726, 51, term667788);
        setElement(term664726, 66, term667908);
        setElement(term664726, 67, term667908);
        setElement(term664726, 68, term667908);
        setElement(term664726, 69, term667908);
        setElement(term664726, 70, term667908);
        setElement(term664726, 71, term667908);
        setElement(term664726, 73, term667908);
        setElement(term664726, 74, term667908);
        setElement(term664726, 75, term667908);
        setElement(term664726, 76, term667908);
        setElement(term664726, 77, term667908);
        setElement(term664726, 78, term667908);
        setElement(term664726, 79, term667908);
        setElement(term664726, 80, term668028);
        setElement(term664726, 81, term667908);
        setElement(term664726, 82, term667908);
        setElement(term664726, 83, term667908);
        setElement(term664726, 84, term666708);
        setElement(term664726, 85, term667908);
        setElement(term664726, 86, term667788);
        setElement(term664726, 87, term667908);
        setElement(term664726, 88, term667428);
        setElement(term664726, 122, term667908);
        setElement(term664726, 126, term667908);
        setElement(term664726, 128, term667548);
        setElement(term664726, 130, term667908);
        setElement(term664726, 138, term667908);
        setElement(term664726, 140, term668148);
        setElement(term664726, 141, term665868);
        setElement(term664726, 142, term666588);
        setElement(term664726, 143, term665988);
        setElement(term664726, 144, term667788);
        setElement(term664726, 145, term666708);
        setElement(term664726, 146, term668268);
        setElement(term664726, 147, term668268);
        setElement(term664726, 148, term667068);
        setElement(term664726, 149, term668388);
        setElement(term664726, 152, term668268);
        setElement(term664726, 153, term668508);
        setField(term665748, term665748.getClass(), "iTypes", term664726);
        term668628 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term668628;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term665748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


