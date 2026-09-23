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

public class PeriodFormatterBuilder_appendWeeks_76043158066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;
     Object term2388;
     Object term2369;

    public PeriodFormatterBuilder_appendWeeks_76043158066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term390 = new ArrayList();
        term385 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term396 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term385, term385.getClass(), "iMinPrintedDigits", 1);
        setIntField(term385, term385.getClass(), "iPrintZeroSetting", 2);
        setIntField(term385, term385.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term385, term385.getClass(), "iRejectSignedValues", false);
        setField(term385, term385.getClass(), "iPrefix", null);
        setField(term385, term385.getClass(), "iElementPairs", term390);
        setBooleanField(term385, term385.getClass(), "iNotPrinter", true);
        setBooleanField(term385, term385.getClass(), "iNotParser", true);
        setField(term385, term385.getClass(), "iFieldFormatters", term396);
        Object term2391 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2392 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2391, term2391.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2391, term2391.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2391, term2391.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2391, term2391.getClass(), "iRejectSignedValues", false);
        setIntField(term2391, term2391.getClass(), "iFieldType", 2);
        setElement(term2392, 2, term2391);
        setField(term2391, term2391.getClass(), "iFieldFormatters", term2392);
        setField(term2391, term2391.getClass(), "iPrefix", null);
        setField(term2391, term2391.getClass(), "iSuffix", null);
        ArrayList term2389 = new ArrayList();
        ((ArrayList) term2389).add(term2391);
        ((ArrayList) term2389).add(term2391);
        term2388 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2393 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2388, term2388.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2388, term2388.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2388, term2388.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2388, term2388.getClass(), "iRejectSignedValues", false);
        setField(term2388, term2388.getClass(), "iPrefix", null);
        setField(term2388, term2388.getClass(), "iElementPairs", term2389);
        setBooleanField(term2388, term2388.getClass(), "iNotPrinter", true);
        setBooleanField(term2388, term2388.getClass(), "iNotParser", true);
        setElement(term2393, 2, term2391);
        setField(term2388, term2388.getClass(), "iFieldFormatters", term2393);
        Object term2376 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2382 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2376, term2376.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2376, term2376.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2376, term2376.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2376, term2376.getClass(), "iRejectSignedValues", false);
        setIntField(term2376, term2376.getClass(), "iFieldType", 2);
        setElement(term2382, 2, term2376);
        setField(term2376, term2376.getClass(), "iFieldFormatters", term2382);
        setField(term2376, term2376.getClass(), "iPrefix", null);
        setField(term2376, term2376.getClass(), "iSuffix", null);
        ArrayList term2374 = new ArrayList();
        ((ArrayList) term2374).add(term2376);
        ((ArrayList) term2374).add(term2376);
        term2369 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2387 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2369, term2369.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2369, term2369.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2369, term2369.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2369, term2369.getClass(), "iRejectSignedValues", false);
        setField(term2369, term2369.getClass(), "iPrefix", null);
        setField(term2369, term2369.getClass(), "iElementPairs", term2374);
        setBooleanField(term2369, term2369.getClass(), "iNotPrinter", true);
        setBooleanField(term2369, term2369.getClass(), "iNotParser", true);
        setElement(term2387, 2, term2376);
        setField(term2369, term2369.getClass(), "iFieldFormatters", term2387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendWeeks", argTypes, term385, args);
        assertTrue(recursiveEquals(term385, term2388));
        assertTrue(recursiveEquals(retValue, term2369));
    }

};


