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
import java.lang.NullPointerException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class PeriodFormatterBuilder_toFormatter_1780058635156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28323;

    public PeriodFormatterBuilder_toFormatter_1780058635156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28375 = new ArrayList();
        term28323 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setField(term28323, term28323.getClass(), "iElementPairs", term28375);
        setBooleanField(term28323, term28323.getClass(), "iNotPrinter", false);
        setBooleanField(term28323, term28323.getClass(), "iNotParser", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toFormatter", argTypes, term28323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


