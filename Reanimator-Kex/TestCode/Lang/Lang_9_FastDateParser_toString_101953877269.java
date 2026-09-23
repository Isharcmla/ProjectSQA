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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDateParser_toString_101953877269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17718;

    public FastDateParser_toString_101953877269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17718 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term17756 = newInstance(Class.forName("java.util.Locale"));
        Object term17810 = newInstance(Class.forName("java.util.SimpleTimeZone"));
        setField(term17718, term17718.getClass(), "pattern", null);
        setField(term17718, term17718.getClass(), "locale", term17756);
        setField(term17718, term17718.getClass(), "timeZone", term17810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term17718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


