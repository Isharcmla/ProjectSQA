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

public class DateTimeFormatterBuilder_getFormatter_212779326451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76713;
     Object term76795;
     Object term76787;

    public DateTimeFormatterBuilder_getFormatter_212779326451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term76765 = new ArrayList();
        term76713 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term76713, term76713.getClass(), "iFormatter", null);
        setField(term76713, term76713.getClass(), "iElementPairs", term76765);
        ArrayList term76796 = new ArrayList();
        term76795 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term76798 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term76795, term76795.getClass(), "iElementPairs", term76796);
        setField(term76798, term76798.getClass(), "iPrinters", null);
        setField(term76798, term76798.getClass(), "iParsers", null);
        setIntField(term76798, term76798.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term76798, term76798.getClass(), "iParsedLengthEstimate", 0);
        setField(term76795, term76795.getClass(), "iFormatter", term76798);
        term76787 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term76787, term76787.getClass(), "iPrinters", null);
        setField(term76787, term76787.getClass(), "iParsers", null);
        setIntField(term76787, term76787.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term76787, term76787.getClass(), "iParsedLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term76713, args);
        assertTrue(recursiveEquals(term76713, term76795));
        assertTrue(recursiveEquals(retValue, term76787));
    }

};


