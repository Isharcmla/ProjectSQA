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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_isParser_1628847859146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709;
     Object term715;
     Object term13022;
     Object term13026;

    public DateTimeFormatterBuilder_isParser_1628847859146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term710 = new ArrayList();
        term709 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term714 = newInstance(Class.forName("java.lang.Object"));
        setField(term709, term709.getClass(), "iElementPairs", term710);
        setField(term709, term709.getClass(), "iFormatter", term714);
        term715 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term13023 = new ArrayList();
        term13022 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term13025 = newInstance(Class.forName("java.lang.Object"));
        setField(term13022, term13022.getClass(), "iElementPairs", term13023);
        setField(term13022, term13022.getClass(), "iFormatter", term13025);
        term13026 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term715;
        callMethod(klass, "isParser", argTypes, term709, args);
        assertTrue(recursiveEquals(term709, term13022));
        assertTrue(recursiveEquals(term715, term13026));
    }

};


