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
import java.util.ArrayList;
import java.lang.Object;

public class PeriodFormatterBuilder_appendSuffix_22114071177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523;

    public PeriodFormatterBuilder_appendSuffix_22114071177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term528 = new ArrayList();
        term523 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term534 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term523, term523.getClass(), "iMinPrintedDigits", 1);
        setIntField(term523, term523.getClass(), "iPrintZeroSetting", 2);
        setIntField(term523, term523.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term523, term523.getClass(), "iRejectSignedValues", false);
        setField(term523, term523.getClass(), "iPrefix", null);
        setField(term523, term523.getClass(), "iElementPairs", term528);
        setBooleanField(term523, term523.getClass(), "iNotPrinter", false);
        setBooleanField(term523, term523.getClass(), "iNotParser", true);
        setField(term523, term523.getClass(), "iFieldFormatters", term534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        try {
            callMethod(klass, "appendSuffix", argTypes, term523, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


