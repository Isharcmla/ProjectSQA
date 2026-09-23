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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class PeriodFormatterBuilder_append_45722774651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;

    public PeriodFormatterBuilder_append_45722774651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term116 = new ArrayList();
        term111 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term122 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term111, term111.getClass(), "iMinPrintedDigits", 1);
        setIntField(term111, term111.getClass(), "iPrintZeroSetting", 2);
        setIntField(term111, term111.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term111, term111.getClass(), "iRejectSignedValues", false);
        setField(term111, term111.getClass(), "iPrefix", null);
        setField(term111, term111.getClass(), "iElementPairs", term116);
        setBooleanField(term111, term111.getClass(), "iNotPrinter", true);
        setBooleanField(term111, term111.getClass(), "iNotParser", true);
        setField(term111, term111.getClass(), "iFieldFormatters", term122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodPrinter");
        argTypes[1] = Class.forName("org.joda.time.format.PeriodParser");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "append", argTypes, term111, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


