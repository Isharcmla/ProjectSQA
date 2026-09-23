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

public class Partial_toString_1440838799158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47006;

    public Partial_toString_1440838799158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47006 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term46405 = (Object[]) newArray("org.joda.time.format.DateTimeFormatter", 20);
        Object[] term46406 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        Object term47126 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term47246 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setField(term47006, term47006.getClass(), "iFormatter", term46405);
        setElement(term46406, 0, term47126);
        setElement(term46406, 1, term47246);
        setField(term47006, term47006.getClass(), "iTypes", term46406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term47006, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


