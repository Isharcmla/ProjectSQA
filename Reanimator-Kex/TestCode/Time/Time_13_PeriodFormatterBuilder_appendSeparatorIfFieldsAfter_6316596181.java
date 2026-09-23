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
     Object term4489;
     Object term4419;

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
        Object term4492 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        Object[] term4495 = (Object[]) newArray("java.lang.String", 1);
        Object term4496 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term4492, term4492.getClass(), "iText", "");
        setField(term4492, term4492.getClass(), "iFinalText", "");
        setField(term4492, term4492.getClass(), "iParsedForms", term4495);
        setBooleanField(term4492, term4492.getClass(), "iUseBefore", false);
        setBooleanField(term4492, term4492.getClass(), "iUseAfter", true);
        setField(term4496, term4496.getClass(), "iText", null);
        setField(term4492, term4492.getClass(), "iBeforePrinter", term4496);
        setField(term4492, term4492.getClass(), "iAfterPrinter", null);
        setField(term4492, term4492.getClass(), "iBeforeParser", term4496);
        setField(term4492, term4492.getClass(), "iAfterParser", null);
        ArrayList term4490 = new ArrayList();
        ((ArrayList) term4490).add(term4492);
        ((ArrayList) term4490).add(term4492);
        term4489 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4497 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4489, term4489.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4489, term4489.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4489, term4489.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4489, term4489.getClass(), "iRejectSignedValues", true);
        setField(term4489, term4489.getClass(), "iPrefix", null);
        setField(term4489, term4489.getClass(), "iElementPairs", term4490);
        setBooleanField(term4489, term4489.getClass(), "iNotPrinter", false);
        setBooleanField(term4489, term4489.getClass(), "iNotParser", true);
        setField(term4489, term4489.getClass(), "iFieldFormatters", term4497);
        Object term4426 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        Object[] term4429 = (Object[]) newArray("java.lang.String", 1);
        Object term4432 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term4426, term4426.getClass(), "iText", "");
        setField(term4426, term4426.getClass(), "iFinalText", "");
        setField(term4426, term4426.getClass(), "iParsedForms", term4429);
        setBooleanField(term4426, term4426.getClass(), "iUseBefore", false);
        setBooleanField(term4426, term4426.getClass(), "iUseAfter", true);
        setField(term4432, term4432.getClass(), "iText", null);
        setField(term4426, term4426.getClass(), "iBeforePrinter", term4432);
        setField(term4426, term4426.getClass(), "iAfterPrinter", null);
        setField(term4426, term4426.getClass(), "iBeforeParser", term4432);
        setField(term4426, term4426.getClass(), "iAfterParser", null);
        ArrayList term4424 = new ArrayList();
        ((ArrayList) term4424).add(term4426);
        ((ArrayList) term4424).add(term4426);
        term4419 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4437 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4419, term4419.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4419, term4419.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4419, term4419.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4419, term4419.getClass(), "iRejectSignedValues", true);
        setField(term4419, term4419.getClass(), "iPrefix", null);
        setField(term4419, term4419.getClass(), "iElementPairs", term4424);
        setBooleanField(term4419, term4419.getClass(), "iNotPrinter", false);
        setBooleanField(term4419, term4419.getClass(), "iNotParser", true);
        setField(term4419, term4419.getClass(), "iFieldFormatters", term4437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        Object retValue = callMethod(klass, "appendSeparatorIfFieldsAfter", argTypes, term659, args);
        assertTrue(recursiveEquals(term659, term4489));
        assertTrue(recursiveEquals(retValue, term4419));
    }

};


