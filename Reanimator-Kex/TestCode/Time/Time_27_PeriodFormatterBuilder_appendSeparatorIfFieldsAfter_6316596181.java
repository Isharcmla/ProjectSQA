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

public class PeriodFormatterBuilder_appendSeparatorIfFieldsAfter_6316596181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659;
     Object term4488;
     Object term4418;

    public PeriodFormatterBuilder_appendSeparatorIfFieldsAfter_6316596181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term664 = new ArrayList();
        term659 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term670 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term659, term659.getClass(), "iMinPrintedDigits", 1);
        setIntField(term659, term659.getClass(), "iPrintZeroSetting", 2);
        setIntField(term659, term659.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term659, term659.getClass(), "iRejectSignedValues", true);
        setField(term659, term659.getClass(), "iPrefix", null);
        setField(term659, term659.getClass(), "iElementPairs", term664);
        setBooleanField(term659, term659.getClass(), "iNotPrinter", false);
        setBooleanField(term659, term659.getClass(), "iNotParser", true);
        setField(term659, term659.getClass(), "iFieldFormatters", term670);
        Object term4491 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        Object[] term4494 = (Object[]) newArray("java.lang.String", 1);
        Object term4495 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term4491, term4491.getClass(), "iText", "");
        setField(term4491, term4491.getClass(), "iFinalText", "");
        setField(term4491, term4491.getClass(), "iParsedForms", term4494);
        setBooleanField(term4491, term4491.getClass(), "iUseBefore", false);
        setBooleanField(term4491, term4491.getClass(), "iUseAfter", true);
        setField(term4495, term4495.getClass(), "iText", null);
        setField(term4491, term4491.getClass(), "iBeforePrinter", term4495);
        setField(term4491, term4491.getClass(), "iAfterPrinter", null);
        setField(term4491, term4491.getClass(), "iBeforeParser", term4495);
        setField(term4491, term4491.getClass(), "iAfterParser", null);
        ArrayList term4489 = new ArrayList();
        ((ArrayList) term4489).add(term4491);
        ((ArrayList) term4489).add(term4491);
        term4488 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4496 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4488, term4488.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4488, term4488.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4488, term4488.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4488, term4488.getClass(), "iRejectSignedValues", true);
        setField(term4488, term4488.getClass(), "iPrefix", null);
        setField(term4488, term4488.getClass(), "iElementPairs", term4489);
        setBooleanField(term4488, term4488.getClass(), "iNotPrinter", false);
        setBooleanField(term4488, term4488.getClass(), "iNotParser", true);
        setField(term4488, term4488.getClass(), "iFieldFormatters", term4496);
        Object term4425 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        Object[] term4428 = (Object[]) newArray("java.lang.String", 1);
        Object term4431 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term4425, term4425.getClass(), "iText", "");
        setField(term4425, term4425.getClass(), "iFinalText", "");
        setField(term4425, term4425.getClass(), "iParsedForms", term4428);
        setBooleanField(term4425, term4425.getClass(), "iUseBefore", false);
        setBooleanField(term4425, term4425.getClass(), "iUseAfter", true);
        setField(term4431, term4431.getClass(), "iText", null);
        setField(term4425, term4425.getClass(), "iBeforePrinter", term4431);
        setField(term4425, term4425.getClass(), "iAfterPrinter", null);
        setField(term4425, term4425.getClass(), "iBeforeParser", term4431);
        setField(term4425, term4425.getClass(), "iAfterParser", null);
        ArrayList term4423 = new ArrayList();
        ((ArrayList) term4423).add(term4425);
        ((ArrayList) term4423).add(term4425);
        term4418 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4436 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4418, term4418.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4418, term4418.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4418, term4418.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4418, term4418.getClass(), "iRejectSignedValues", true);
        setField(term4418, term4418.getClass(), "iPrefix", null);
        setField(term4418, term4418.getClass(), "iElementPairs", term4423);
        setBooleanField(term4418, term4418.getClass(), "iNotPrinter", false);
        setBooleanField(term4418, term4418.getClass(), "iNotParser", true);
        setField(term4418, term4418.getClass(), "iFieldFormatters", term4436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        Object retValue = callMethod(klass, "appendSeparatorIfFieldsAfter", argTypes, term659, args);
        assertTrue(recursiveEquals(term659, term4488));
        assertTrue(recursiveEquals(retValue, term4418));
    }

};


