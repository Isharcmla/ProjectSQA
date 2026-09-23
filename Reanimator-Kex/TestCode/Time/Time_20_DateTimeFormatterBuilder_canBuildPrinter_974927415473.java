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

public class DateTimeFormatterBuilder_canBuildPrinter_974927415473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84492;
     Object term84657;

    public DateTimeFormatterBuilder_canBuildPrinter_974927415473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84640 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList term84544 = new ArrayList();
        ((ArrayList) term84544).add(term84640);
        ((ArrayList) term84544).add(term84640);
        term84492 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term84492, term84492.getClass(), "iFormatter", null);
        setField(term84492, term84492.getClass(), "iElementPairs", term84544);
        Object term84660 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term84660, term84660.getClass(), "iElementPairs", null);
        setField(term84660, term84660.getClass(), "iFormatter", null);
        ArrayList term84658 = new ArrayList();
        ((ArrayList) term84658).add(term84660);
        ((ArrayList) term84658).add(term84660);
        term84657 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term84657, term84657.getClass(), "iElementPairs", term84658);
        setField(term84657, term84657.getClass(), "iFormatter", term84660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildPrinter", argTypes, term84492, args);
        assertTrue(recursiveEquals(term84492, term84657));
    }

};


