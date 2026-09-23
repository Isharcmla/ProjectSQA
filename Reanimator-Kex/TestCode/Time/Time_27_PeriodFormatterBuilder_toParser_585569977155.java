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

public class PeriodFormatterBuilder_toParser_585569977155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23668;
     Object term28633;

    public PeriodFormatterBuilder_toParser_585569977155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23668 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setBooleanField(term23668, term23668.getClass(), "iNotParser", true);
        term28633 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setIntField(term28633, term28633.getClass(), "iMinPrintedDigits", 0);
        setIntField(term28633, term28633.getClass(), "iPrintZeroSetting", 0);
        setIntField(term28633, term28633.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term28633, term28633.getClass(), "iRejectSignedValues", false);
        setField(term28633, term28633.getClass(), "iPrefix", null);
        setField(term28633, term28633.getClass(), "iElementPairs", null);
        setBooleanField(term28633, term28633.getClass(), "iNotPrinter", false);
        setBooleanField(term28633, term28633.getClass(), "iNotParser", true);
        setField(term28633, term28633.getClass(), "iFieldFormatters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toParser", argTypes, term23668, args);
        assertTrue(recursiveEquals(term23668, term28633));
        assertTrue(recursiveEquals(retValue, null));
    }

};


