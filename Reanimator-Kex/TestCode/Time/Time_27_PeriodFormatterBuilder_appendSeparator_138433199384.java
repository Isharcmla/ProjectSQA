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
     Object term4783;
     Object term4791;
     Object term4694;

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
        ArrayList term4784 = new ArrayList();
        term4783 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4786 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4783, term4783.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4783, term4783.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4783, term4783.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4783, term4783.getClass(), "iRejectSignedValues", false);
        setField(term4783, term4783.getClass(), "iPrefix", null);
        setField(term4783, term4783.getClass(), "iElementPairs", term4784);
        setBooleanField(term4783, term4783.getClass(), "iNotPrinter", true);
        setBooleanField(term4783, term4783.getClass(), "iNotParser", true);
        setField(term4783, term4783.getClass(), "iFieldFormatters", term4786);
        term4791 = (Object[]) newArray("java.lang.String", 3);
        setElement(term4791, 0, "RkybSrpybU");
        setElement(term4791, 1, "xOEqzGAmDU");
        setElement(term4791, 2, "eZFUvlxvGV");
        ArrayList term4699 = new ArrayList();
        term4694 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4705 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4694, term4694.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4694, term4694.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4694, term4694.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4694, term4694.getClass(), "iRejectSignedValues", false);
        setField(term4694, term4694.getClass(), "iPrefix", null);
        setField(term4694, term4694.getClass(), "iElementPairs", term4699);
        setBooleanField(term4694, term4694.getClass(), "iNotPrinter", true);
        setBooleanField(term4694, term4694.getClass(), "iNotParser", true);
        setField(term4694, term4694.getClass(), "iFieldFormatters", term4705);
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
        assertTrue(recursiveEquals(term783, term4783));
        assertTrue(recursiveEquals(term819, term4791));
        assertTrue(recursiveEquals(retValue, term4694));
    }

};


