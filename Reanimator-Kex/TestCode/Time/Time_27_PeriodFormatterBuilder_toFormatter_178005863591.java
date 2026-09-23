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

public class PeriodFormatterBuilder_toFormatter_178005863591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5516;

    public PeriodFormatterBuilder_toFormatter_178005863591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5568 = new ArrayList();
        term5516 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setField(term5516, term5516.getClass(), "iElementPairs", term5568);
        setBooleanField(term5516, term5516.getClass(), "iNotPrinter", false);
        setBooleanField(term5516, term5516.getClass(), "iNotParser", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toFormatter", argTypes, term5516, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


