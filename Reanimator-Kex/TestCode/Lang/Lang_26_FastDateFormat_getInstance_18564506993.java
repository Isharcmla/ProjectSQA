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

public class FastDateFormat_getInstance_18564506993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;

    public FastDateFormat_getInstance_18564506993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("java.util.Locale"));
        Object term85 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term85, term85.getClass(), "language", "pt");
        setField(term85, term85.getClass(), "script", "");
        setField(term85, term85.getClass(), "region", "MO");
        setField(term85, term85.getClass(), "variant", "");
        setIntField(term85, term85.getClass(), "hash", 106966554);
        setField(term84, term84.getClass(), "baseLocale", term85);
        setField(term84, term84.getClass(), "localeExtensions", null);
        setIntField(term84, term84.getClass(), "hashCodeValue", 106966554);
        setField(term84, term84.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term84;
        callMethod(klass, "getInstance", argTypes, null, args);
    }

};


