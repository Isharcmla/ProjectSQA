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
import java.lang.Object;

public class PeriodFormatterBuilder_appendPrefix_882270052120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14887;
     Object term15009;
     Object term15541;
     Object term15543;
     Object term15533;

    public PeriodFormatterBuilder_appendPrefix_882270052120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14887 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        term15009 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        term15541 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term15542 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setIntField(term15541, term15541.getClass(), "iMinPrintedDigits", 0);
        setIntField(term15541, term15541.getClass(), "iPrintZeroSetting", 0);
        setIntField(term15541, term15541.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term15541, term15541.getClass(), "iRejectSignedValues", false);
        setField(term15542, term15542.getClass(), "iLeft", null);
        setField(term15542, term15542.getClass(), "iRight", null);
        setField(term15541, term15541.getClass(), "iPrefix", term15542);
        setField(term15541, term15541.getClass(), "iElementPairs", null);
        setBooleanField(term15541, term15541.getClass(), "iNotPrinter", false);
        setBooleanField(term15541, term15541.getClass(), "iNotParser", false);
        setField(term15541, term15541.getClass(), "iFieldFormatters", null);
        term15543 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(term15543, term15543.getClass(), "iLeft", null);
        setField(term15543, term15543.getClass(), "iRight", null);
        term15533 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term15538 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setIntField(term15533, term15533.getClass(), "iMinPrintedDigits", 0);
        setIntField(term15533, term15533.getClass(), "iPrintZeroSetting", 0);
        setIntField(term15533, term15533.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term15533, term15533.getClass(), "iRejectSignedValues", false);
        setField(term15538, term15538.getClass(), "iLeft", null);
        setField(term15538, term15538.getClass(), "iRight", null);
        setField(term15533, term15533.getClass(), "iPrefix", term15538);
        setField(term15533, term15533.getClass(), "iElementPairs", null);
        setBooleanField(term15533, term15533.getClass(), "iNotPrinter", false);
        setBooleanField(term15533, term15533.getClass(), "iNotParser", false);
        setField(term15533, term15533.getClass(), "iFieldFormatters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Object[] args = new Object[1];
        args[0] = term15009;
        Object retValue = callMethod(klass, "appendPrefix", argTypes, term14887, args);
        assertTrue(recursiveEquals(term14887, term15541));
        assertTrue(recursiveEquals(term15009, term15543));
        assertTrue(recursiveEquals(retValue, term15533));
    }

};


