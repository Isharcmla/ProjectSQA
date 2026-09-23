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

public class PeriodFormatterBuilder_init_18210089145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1036;

    public PeriodFormatterBuilder_init_18210089145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1037 = new ArrayList();
        term1036 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1039 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1036, term1036.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1036, term1036.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1036, term1036.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1036, term1036.getClass(), "iRejectSignedValues", false);
        setField(term1036, term1036.getClass(), "iPrefix", null);
        setField(term1036, term1036.getClass(), "iElementPairs", term1037);
        setBooleanField(term1036, term1036.getClass(), "iNotPrinter", false);
        setBooleanField(term1036, term1036.getClass(), "iNotParser", false);
        setField(term1036, term1036.getClass(), "iFieldFormatters", term1039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1036));
    }

};


