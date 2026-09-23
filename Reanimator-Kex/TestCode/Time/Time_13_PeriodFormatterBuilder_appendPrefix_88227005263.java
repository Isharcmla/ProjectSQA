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

public class PeriodFormatterBuilder_appendPrefix_88227005263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;

    public PeriodFormatterBuilder_appendPrefix_88227005263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term354 = new ArrayList();
        term349 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term360 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term349, term349.getClass(), "iMinPrintedDigits", 1);
        setIntField(term349, term349.getClass(), "iPrintZeroSetting", 2);
        setIntField(term349, term349.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term349, term349.getClass(), "iRejectSignedValues", true);
        setField(term349, term349.getClass(), "iPrefix", null);
        setField(term349, term349.getClass(), "iElementPairs", term354);
        setBooleanField(term349, term349.getClass(), "iNotPrinter", false);
        setBooleanField(term349, term349.getClass(), "iNotParser", true);
        setField(term349, term349.getClass(), "iFieldFormatters", term360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendPrefix", argTypes, term349, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


