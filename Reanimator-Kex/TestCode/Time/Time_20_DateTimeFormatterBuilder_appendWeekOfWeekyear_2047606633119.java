package org.joda.time.format;

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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendWeekOfWeekyear_2047606633119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;
     Object term374;

    public DateTimeFormatterBuilder_appendWeekOfWeekyear_2047606633119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term369 = new ArrayList();
        term368 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term373 = newInstance(Class.forName("java.lang.Object"));
        setField(term368, term368.getClass(), "iElementPairs", term369);
        setField(term368, term368.getClass(), "iFormatter", term373);
        term374 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term374;
        try {
            callMethod(klass, "appendWeekOfWeekyear", argTypes, term368, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


