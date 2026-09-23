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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class PeriodFormatterBuilder_appendField_10739733375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493;
     Object term505;

    public PeriodFormatterBuilder_appendField_10739733375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term498 = new ArrayList();
        term493 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term504 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term493, term493.getClass(), "iMinPrintedDigits", 1);
        setIntField(term493, term493.getClass(), "iPrintZeroSetting", 2);
        setIntField(term493, term493.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term493, term493.getClass(), "iRejectSignedValues", false);
        setField(term493, term493.getClass(), "iPrefix", null);
        setField(term493, term493.getClass(), "iElementPairs", term498);
        setBooleanField(term493, term493.getClass(), "iNotPrinter", true);
        setBooleanField(term493, term493.getClass(), "iNotParser", true);
        setField(term493, term493.getClass(), "iFieldFormatters", term504);
        term505 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term505;
        try {
            callMethod(klass, "appendField", argTypes, term493, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


