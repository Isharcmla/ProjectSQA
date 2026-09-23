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

public class DateTimeFormatterBuilder_canBuildPrinter_97492741580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term1714;

    public DateTimeFormatterBuilder_canBuildPrinter_97492741580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26 = new ArrayList();
        term25 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term30 = newInstance(Class.forName("java.lang.Object"));
        setField(term25, term25.getClass(), "iElementPairs", term26);
        setField(term25, term25.getClass(), "iFormatter", term30);
        ArrayList term1715 = new ArrayList();
        term1714 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term1717 = newInstance(Class.forName("java.lang.Object"));
        setField(term1714, term1714.getClass(), "iElementPairs", term1715);
        setField(term1714, term1714.getClass(), "iFormatter", term1717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildPrinter", argTypes, term25, args);
        assertTrue(recursiveEquals(term25, term1714));
    }

};


