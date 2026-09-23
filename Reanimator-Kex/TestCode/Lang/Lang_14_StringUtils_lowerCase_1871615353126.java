package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StringUtils_lowerCase_1871615353126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3475;

    public StringUtils_lowerCase_1871615353126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3475 = newInstance(Class.forName("java.util.Locale"));
        Object term3476 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3476, term3476.getClass(), "language", "ps");
        setField(term3476, term3476.getClass(), "script", "");
        setField(term3476, term3476.getClass(), "region", "");
        setField(term3476, term3476.getClass(), "variant", "");
        setIntField(term3476, term3476.getClass(), "hash", 106860317);
        setField(term3475, term3475.getClass(), "baseLocale", term3476);
        setField(term3475, term3475.getClass(), "localeExtensions", null);
        setIntField(term3475, term3475.getClass(), "hashCodeValue", 106860317);
        setField(term3475, term3475.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "FPvxVzzSvD";
        args[1] = term3475;
        callMethod(klass, "lowerCase", argTypes, null, args);
    }

};


