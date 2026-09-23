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
import java.lang.Integer;
import java.lang.Object;

public class FastDateFormat_getDateInstance_1536498906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;
     Object term263;

    public FastDateFormat_getDateInstance_1536498906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = new Integer(1162663216);
        term263 = newInstance(Class.forName("java.util.Locale"));
        Object term264 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term264, term264.getClass(), "language", "kab");
        setField(term264, term264.getClass(), "script", "");
        setField(term264, term264.getClass(), "region", "");
        setField(term264, term264.getClass(), "variant", "");
        setIntField(term264, term264.getClass(), "hash", -1139147084);
        setField(term263, term263.getClass(), "baseLocale", term264);
        setField(term263, term263.getClass(), "localeExtensions", null);
        setIntField(term263, term263.getClass(), "hashCodeValue", -1139147084);
        setField(term263, term263.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term261;
        args[1] = term263;
        callMethod(klass, "getDateInstance", argTypes, null, args);
    }

};


