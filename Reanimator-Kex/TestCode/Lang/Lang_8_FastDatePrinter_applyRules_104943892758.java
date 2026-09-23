package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDatePrinter_applyRules_104943892758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28305;

    public FastDatePrinter_applyRules_104943892758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28305 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object[] term28198 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 0);
        setField(term28305, term28305.getClass(), "mRules", term28198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Calendar");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "applyRules", argTypes, term28305, args);
    }

};


