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

public class Partial_with_1879100418237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145720;
     Object term148840;

    public Partial_with_1879100418237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145720 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term144729 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 148);
        Object term145840 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term145960 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term146080 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term146200 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term146320 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term146440 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term146560 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term146680 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term146800 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term146920 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term147040 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term147160 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term147280 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term147400 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term147520 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term147640 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term147760 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term147880 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term148000 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term148120 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term148240 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term148360 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term148480 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term148600 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term148720 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term144729, 0, term145840);
        setElement(term144729, 1, term145960);
        setElement(term144729, 2, term146080);
        setElement(term144729, 3, term145840);
        setElement(term144729, 4, term146200);
        setElement(term144729, 5, term146320);
        setElement(term144729, 6, term146440);
        setElement(term144729, 7, term146560);
        setElement(term144729, 8, term146680);
        setElement(term144729, 10, term146800);
        setElement(term144729, 11, term146920);
        setElement(term144729, 12, term145840);
        setElement(term144729, 13, term147040);
        setElement(term144729, 14, term147160);
        setElement(term144729, 15, term147280);
        setElement(term144729, 16, term147400);
        setElement(term144729, 17, term147520);
        setElement(term144729, 18, term147640);
        setElement(term144729, 19, term147760);
        setElement(term144729, 22, term145840);
        setElement(term144729, 23, term147880);
        setElement(term144729, 24, term146080);
        setElement(term144729, 25, term146680);
        setElement(term144729, 26, term148000);
        setElement(term144729, 27, term148120);
        setElement(term144729, 28, term146680);
        setElement(term144729, 29, term147880);
        setElement(term144729, 30, term146560);
        setElement(term144729, 31, term148000);
        setElement(term144729, 32, term148000);
        setElement(term144729, 33, term146920);
        setElement(term144729, 34, term148240);
        setElement(term144729, 35, term146320);
        setElement(term144729, 36, term148240);
        setElement(term144729, 37, term148360);
        setElement(term144729, 38, term148480);
        setElement(term144729, 39, term145840);
        setElement(term144729, 40, term148120);
        setElement(term144729, 41, term147280);
        setElement(term144729, 46, term146320);
        setElement(term144729, 59, term148360);
        setElement(term144729, 63, term145840);
        setElement(term144729, 65, term148360);
        setElement(term144729, 66, term148360);
        setElement(term144729, 67, term148360);
        setElement(term144729, 68, term148360);
        setElement(term144729, 69, term148360);
        setElement(term144729, 70, term148360);
        setElement(term144729, 71, term148360);
        setElement(term144729, 72, term148360);
        setElement(term144729, 73, term148360);
        setElement(term144729, 74, term148360);
        setElement(term144729, 75, term148360);
        setElement(term144729, 76, term148360);
        setElement(term144729, 77, term148360);
        setElement(term144729, 78, term148360);
        setElement(term144729, 79, term148360);
        setElement(term144729, 80, term148360);
        setElement(term144729, 81, term148360);
        setElement(term144729, 82, term148360);
        setElement(term144729, 83, term148360);
        setElement(term144729, 84, term148360);
        setElement(term144729, 85, term148360);
        setElement(term144729, 86, term148360);
        setElement(term144729, 87, term148360);
        setElement(term144729, 88, term148360);
        setElement(term144729, 89, term148360);
        setElement(term144729, 90, term148360);
        setElement(term144729, 91, term148360);
        setElement(term144729, 92, term146800);
        setElement(term144729, 111, term148360);
        setElement(term144729, 119, term148360);
        setElement(term144729, 123, term148360);
        setElement(term144729, 127, term148360);
        setElement(term144729, 128, term147040);
        setElement(term144729, 129, term146920);
        setElement(term144729, 130, term147640);
        setElement(term144729, 131, term147160);
        setElement(term144729, 132, term147520);
        setElement(term144729, 133, term148600);
        setElement(term144729, 134, term148720);
        setElement(term144729, 135, term146800);
        setElement(term144729, 136, term146920);
        setElement(term144729, 137, term146680);
        setElement(term144729, 138, term147160);
        setElement(term144729, 139, term146080);
        setElement(term144729, 140, term147520);
        setElement(term144729, 141, term147520);
        setElement(term144729, 142, term148720);
        setElement(term144729, 143, term146800);
        setElement(term144729, 144, term147880);
        setField(term145720, term145720.getClass(), "iTypes", term144729);
        term148840 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term148840;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term145720, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
