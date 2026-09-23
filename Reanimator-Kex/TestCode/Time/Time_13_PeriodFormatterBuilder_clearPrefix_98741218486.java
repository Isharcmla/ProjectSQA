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

public class PeriodFormatterBuilder_clearPrefix_98741218486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term989;
     Object term5039;

    public PeriodFormatterBuilder_clearPrefix_98741218486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term994 = new ArrayList();
        term989 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1000 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term989, term989.getClass(), "iMinPrintedDigits", 1);
        setIntField(term989, term989.getClass(), "iPrintZeroSetting", 2);
        setIntField(term989, term989.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term989, term989.getClass(), "iRejectSignedValues", false);
        setField(term989, term989.getClass(), "iPrefix", null);
        setField(term989, term989.getClass(), "iElementPairs", term994);
        setBooleanField(term989, term989.getClass(), "iNotPrinter", false);
        setBooleanField(term989, term989.getClass(), "iNotParser", false);
        setField(term989, term989.getClass(), "iFieldFormatters", term1000);
        ArrayList term5040 = new ArrayList();
        term5039 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term5042 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term5039, term5039.getClass(), "iMinPrintedDigits", 1);
        setIntField(term5039, term5039.getClass(), "iPrintZeroSetting", 2);
        setIntField(term5039, term5039.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term5039, term5039.getClass(), "iRejectSignedValues", false);
        setField(term5039, term5039.getClass(), "iPrefix", null);
        setField(term5039, term5039.getClass(), "iElementPairs", term5040);
        setBooleanField(term5039, term5039.getClass(), "iNotPrinter", false);
        setBooleanField(term5039, term5039.getClass(), "iNotParser", false);
        setField(term5039, term5039.getClass(), "iFieldFormatters", term5042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearPrefix", argTypes, term989, args);
        assertTrue(recursiveEquals(term989, term5039));
    }

};


