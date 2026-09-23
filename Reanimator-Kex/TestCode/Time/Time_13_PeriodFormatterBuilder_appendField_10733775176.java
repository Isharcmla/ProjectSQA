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

public class PeriodFormatterBuilder_appendField_10733775176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;
     Object term519;
     Object term521;

    public PeriodFormatterBuilder_appendField_10733775176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term512 = new ArrayList();
        term507 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term518 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term507, term507.getClass(), "iMinPrintedDigits", 1);
        setIntField(term507, term507.getClass(), "iPrintZeroSetting", 2);
        setIntField(term507, term507.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term507, term507.getClass(), "iRejectSignedValues", true);
        setField(term507, term507.getClass(), "iPrefix", null);
        setField(term507, term507.getClass(), "iElementPairs", term512);
        setBooleanField(term507, term507.getClass(), "iNotPrinter", true);
        setBooleanField(term507, term507.getClass(), "iNotParser", true);
        setField(term507, term507.getClass(), "iFieldFormatters", term518);
        term519 = new Integer(-2095575670);
        term521 = new Integer(1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term519;
        args[1] = term521;
        try {
            callMethod(klass, "appendField", argTypes, term507, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


