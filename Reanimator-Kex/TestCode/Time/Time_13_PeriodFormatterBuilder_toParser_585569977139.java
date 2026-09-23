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

public class PeriodFormatterBuilder_toParser_585569977139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23565;
     Object term24063;

    public PeriodFormatterBuilder_toParser_585569977139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23565 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setBooleanField(term23565, term23565.getClass(), "iNotParser", true);
        term24063 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setIntField(term24063, term24063.getClass(), "iMinPrintedDigits", 0);
        setIntField(term24063, term24063.getClass(), "iPrintZeroSetting", 0);
        setIntField(term24063, term24063.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term24063, term24063.getClass(), "iRejectSignedValues", false);
        setField(term24063, term24063.getClass(), "iPrefix", null);
        setField(term24063, term24063.getClass(), "iElementPairs", null);
        setBooleanField(term24063, term24063.getClass(), "iNotPrinter", false);
        setBooleanField(term24063, term24063.getClass(), "iNotParser", true);
        setField(term24063, term24063.getClass(), "iFieldFormatters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toParser", argTypes, term23565, args);
        assertTrue(recursiveEquals(term23565, term24063));
        assertTrue(recursiveEquals(retValue, null));
    }

};


