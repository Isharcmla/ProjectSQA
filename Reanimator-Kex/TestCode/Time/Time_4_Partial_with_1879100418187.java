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

public class Partial_with_1879100418187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91226;
     Object term94466;

    public Partial_with_1879100418187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91226 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term90281 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 140);
        Object term91346 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term91466 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term91586 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term91706 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term91826 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term91946 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term92066 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term92186 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term92306 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term92426 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term92546 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term92666 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term92786 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term92906 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93026 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93146 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93266 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93386 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93506 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93626 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93746 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93866 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term93986 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term94106 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term94226 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term94346 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term90281, 0, term91346);
        setElement(term90281, 1, term91466);
        setElement(term90281, 2, term91346);
        setElement(term90281, 3, term91466);
        setElement(term90281, 4, term91586);
        setElement(term90281, 5, term91706);
        setElement(term90281, 6, term91826);
        setElement(term90281, 7, term91946);
        setElement(term90281, 8, term92066);
        setElement(term90281, 9, term92186);
        setElement(term90281, 10, term92306);
        setElement(term90281, 11, term91706);
        setElement(term90281, 12, term91826);
        setElement(term90281, 13, term92066);
        setElement(term90281, 14, term91586);
        setElement(term90281, 15, term91946);
        setElement(term90281, 16, term92426);
        setElement(term90281, 17, term91346);
        setElement(term90281, 18, term91826);
        setElement(term90281, 19, term92546);
        setElement(term90281, 20, term92666);
        setElement(term90281, 21, term91466);
        setElement(term90281, 22, term92786);
        setElement(term90281, 23, term92066);
        setElement(term90281, 24, term92666);
        setElement(term90281, 25, term91586);
        setElement(term90281, 26, term92906);
        setElement(term90281, 27, term91826);
        setElement(term90281, 28, term92666);
        setElement(term90281, 29, term93026);
        setElement(term90281, 30, term92186);
        setElement(term90281, 31, term93146);
        setElement(term90281, 32, term93146);
        setElement(term90281, 33, term93266);
        setElement(term90281, 34, term91586);
        setElement(term90281, 35, term92306);
        setElement(term90281, 36, term91586);
        setElement(term90281, 37, term93386);
        setElement(term90281, 38, term93506);
        setElement(term90281, 39, term92306);
        setElement(term90281, 40, term92306);
        setElement(term90281, 41, term91946);
        setElement(term90281, 42, term93626);
        setElement(term90281, 43, term93746);
        setElement(term90281, 44, term91946);
        setElement(term90281, 45, term93866);
        setElement(term90281, 46, term93266);
        setElement(term90281, 47, term93026);
        setElement(term90281, 48, term93506);
        setElement(term90281, 62, term92306);
        setElement(term90281, 63, term92306);
        setElement(term90281, 64, term92306);
        setElement(term90281, 66, term92306);
        setElement(term90281, 67, term92306);
        setElement(term90281, 68, term92306);
        setElement(term90281, 69, term92306);
        setElement(term90281, 70, term93986);
        setElement(term90281, 71, term92306);
        setElement(term90281, 72, term92306);
        setElement(term90281, 73, term92306);
        setElement(term90281, 74, term92306);
        setElement(term90281, 75, term92306);
        setElement(term90281, 76, term92306);
        setElement(term90281, 77, term92306);
        setElement(term90281, 78, term92666);
        setElement(term90281, 79, term92306);
        setElement(term90281, 80, term92066);
        setElement(term90281, 82, term92066);
        setElement(term90281, 83, term92306);
        setElement(term90281, 84, term92306);
        setElement(term90281, 85, term92066);
        setElement(term90281, 86, term92306);
        setElement(term90281, 87, term92306);
        setElement(term90281, 88, term92306);
        setElement(term90281, 90, term92186);
        setElement(term90281, 91, term92306);
        setElement(term90281, 92, term92306);
        setElement(term90281, 94, term92306);
        setElement(term90281, 95, term92306);
        setElement(term90281, 96, term92306);
        setElement(term90281, 97, term92306);
        setElement(term90281, 98, term92306);
        setElement(term90281, 99, term91586);
        setElement(term90281, 114, term94106);
        setElement(term90281, 115, term92426);
        setElement(term90281, 117, term94226);
        setElement(term90281, 119, term94106);
        setElement(term90281, 121, term94226);
        setElement(term90281, 123, term92906);
        setElement(term90281, 127, term93026);
        setElement(term90281, 128, term94106);
        setElement(term90281, 129, term94346);
        setElement(term90281, 131, term94106);
        setElement(term90281, 135, term93386);
        setElement(term90281, 137, term92426);
        setElement(term90281, 138, term92906);
        setElement(term90281, 139, term92906);
        setField(term91226, term91226.getClass(), "iTypes", term90281);
        term94466 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term94466;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term91226, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


