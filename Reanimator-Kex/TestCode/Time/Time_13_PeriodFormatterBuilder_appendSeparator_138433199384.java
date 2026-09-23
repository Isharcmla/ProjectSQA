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

public class PeriodFormatterBuilder_appendSeparator_138433199384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term783;
     Object term819;
     Object term4784;
     Object term4792;
     Object term4695;

    public PeriodFormatterBuilder_appendSeparator_138433199384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term788 = new ArrayList();
        term783 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term794 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term783, term783.getClass(), "iMinPrintedDigits", 1);
        setIntField(term783, term783.getClass(), "iPrintZeroSetting", 2);
        setIntField(term783, term783.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term783, term783.getClass(), "iRejectSignedValues", false);
        setField(term783, term783.getClass(), "iPrefix", null);
        setField(term783, term783.getClass(), "iElementPairs", term788);
        setBooleanField(term783, term783.getClass(), "iNotPrinter", true);
        setBooleanField(term783, term783.getClass(), "iNotParser", true);
        setField(term783, term783.getClass(), "iFieldFormatters", term794);
        term819 = (Object[]) newArray("java.lang.String", 3);
        setElement(term819, 0, "RkybSrpybU");
        setElement(term819, 1, "xOEqzGAmDU");
        setElement(term819, 2, "eZFUvlxvGV");
        ArrayList term4785 = new ArrayList();
        term4784 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4787 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4784, term4784.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4784, term4784.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4784, term4784.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4784, term4784.getClass(), "iRejectSignedValues", false);
        setField(term4784, term4784.getClass(), "iPrefix", null);
        setField(term4784, term4784.getClass(), "iElementPairs", term4785);
        setBooleanField(term4784, term4784.getClass(), "iNotPrinter", true);
        setBooleanField(term4784, term4784.getClass(), "iNotParser", true);
        setField(term4784, term4784.getClass(), "iFieldFormatters", term4787);
        term4792 = (Object[]) newArray("java.lang.String", 3);
        setElement(term4792, 0, "RkybSrpybU");
        setElement(term4792, 1, "xOEqzGAmDU");
        setElement(term4792, 2, "eZFUvlxvGV");
        ArrayList term4700 = new ArrayList();
        term4695 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4706 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4695, term4695.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4695, term4695.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4695, term4695.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4695, term4695.getClass(), "iRejectSignedValues", false);
        setField(term4695, term4695.getClass(), "iPrefix", null);
        setField(term4695, term4695.getClass(), "iElementPairs", term4700);
        setBooleanField(term4695, term4695.getClass(), "iNotPrinter", true);
        setBooleanField(term4695, term4695.getClass(), "iNotParser", true);
        setField(term4695, term4695.getClass(), "iFieldFormatters", term4706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "pCTimMblYc";
        args[1] = "hNxWaHcfhY";
        args[2] = term819;
        Object retValue = callMethod(klass, "appendSeparator", argTypes, term783, args);
        assertTrue(recursiveEquals(term783, term4784));
        assertTrue(recursiveEquals(term819, term4792));
        assertTrue(recursiveEquals(retValue, term4695));
    }

};


