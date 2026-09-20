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

public class Partial_with_1879100418221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108095;
     Object term109295;

    public Partial_with_1879100418221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108095 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term107624 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 66);
        Object term108215 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term108335 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term108455 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term108575 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term108695 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term108815 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term108935 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term109055 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term109175 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term107624, 0, term108215);
        setElement(term107624, 1, term108335);
        setElement(term107624, 2, term108455);
        setElement(term107624, 3, term108335);
        setElement(term107624, 4, term108575);
        setElement(term107624, 5, term108695);
        setElement(term107624, 6, term108815);
        setElement(term107624, 7, term108935);
        setElement(term107624, 8, term109055);
        setElement(term107624, 9, term109055);
        setElement(term107624, 10, term109055);
        setElement(term107624, 11, term109175);
        setElement(term107624, 12, term109055);
        setElement(term107624, 13, term109055);
        setElement(term107624, 14, term109055);
        setElement(term107624, 15, term109175);
        setElement(term107624, 16, term109055);
        setElement(term107624, 17, term109055);
        setElement(term107624, 18, term109055);
        setElement(term107624, 19, term109055);
        setElement(term107624, 20, term109055);
        setElement(term107624, 21, term109055);
        setElement(term107624, 22, term109055);
        setElement(term107624, 23, term109055);
        setElement(term107624, 24, term109055);
        setElement(term107624, 25, term109055);
        setElement(term107624, 26, term109055);
        setElement(term107624, 27, term109055);
        setElement(term107624, 28, term109055);
        setElement(term107624, 29, term109055);
        setElement(term107624, 30, term109055);
        setElement(term107624, 31, term109055);
        setElement(term107624, 32, term109055);
        setElement(term107624, 33, term109055);
        setElement(term107624, 34, term109055);
        setElement(term107624, 35, term109055);
        setElement(term107624, 36, term109055);
        setElement(term107624, 37, term109055);
        setElement(term107624, 38, term109055);
        setElement(term107624, 39, term109055);
        setElement(term107624, 40, term109055);
        setElement(term107624, 41, term109055);
        setElement(term107624, 42, term109055);
        setElement(term107624, 43, term109055);
        setElement(term107624, 44, term109055);
        setElement(term107624, 45, term109055);
        setElement(term107624, 46, term109055);
        setElement(term107624, 47, term109055);
        setElement(term107624, 48, term109055);
        setElement(term107624, 49, term109055);
        setElement(term107624, 50, term109055);
        setElement(term107624, 51, term109055);
        setElement(term107624, 52, term109055);
        setElement(term107624, 53, term109055);
        setElement(term107624, 54, term109055);
        setElement(term107624, 55, term109055);
        setElement(term107624, 56, term109055);
        setElement(term107624, 57, term109055);
        setElement(term107624, 58, term109055);
        setElement(term107624, 59, term109055);
        setElement(term107624, 60, term109055);
        setElement(term107624, 61, term109055);
        setElement(term107624, 62, term109055);
        setElement(term107624, 63, term109055);
        setElement(term107624, 64, term109055);
        setElement(term107624, 65, term109055);
        setField(term108095, term108095.getClass(), "iTypes", term107624);
        term109295 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term109295;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term108095, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
