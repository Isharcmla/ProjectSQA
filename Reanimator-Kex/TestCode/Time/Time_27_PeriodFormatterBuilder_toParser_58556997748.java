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

public class PeriodFormatterBuilder_toParser_58556997748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term1145;
     Object term1142;

    public PeriodFormatterBuilder_toParser_58556997748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30 = new ArrayList();
        term25 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term36 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term25, term25.getClass(), "iMinPrintedDigits", 1);
        setIntField(term25, term25.getClass(), "iPrintZeroSetting", 2);
        setIntField(term25, term25.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term25, term25.getClass(), "iRejectSignedValues", true);
        setField(term25, term25.getClass(), "iPrefix", null);
        setField(term25, term25.getClass(), "iElementPairs", term30);
        setBooleanField(term25, term25.getClass(), "iNotPrinter", true);
        setBooleanField(term25, term25.getClass(), "iNotParser", false);
        setField(term25, term25.getClass(), "iFieldFormatters", term36);
        ArrayList term1146 = new ArrayList();
        term1145 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1148 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1145, term1145.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1145, term1145.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1145, term1145.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1145, term1145.getClass(), "iRejectSignedValues", true);
        setField(term1145, term1145.getClass(), "iPrefix", null);
        setField(term1145, term1145.getClass(), "iElementPairs", term1146);
        setBooleanField(term1145, term1145.getClass(), "iNotPrinter", true);
        setBooleanField(term1145, term1145.getClass(), "iNotParser", false);
        setField(term1145, term1145.getClass(), "iFieldFormatters", term1148);
        term1142 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term1142, term1142.getClass(), "iText", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toParser", argTypes, term25, args);
        assertTrue(recursiveEquals(term25, term1145));
        assertTrue(recursiveEquals(retValue, term1142));
    }

};


