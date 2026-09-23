package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StringUtils_lowerCase_1056075428116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4630;

    public StringUtils_lowerCase_1056075428116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4630 = newInstance(Class.forName("java.util.Locale"));
        Object term4631 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4631, term4631.getClass(), "language", "ps");
        setField(term4631, term4631.getClass(), "script", "");
        setField(term4631, term4631.getClass(), "region", "");
        setField(term4631, term4631.getClass(), "variant", "");
        setIntField(term4631, term4631.getClass(), "hash", 106860317);
        setField(term4630, term4630.getClass(), "baseLocale", term4631);
        setField(term4630, term4630.getClass(), "localeExtensions", null);
        setIntField(term4630, term4630.getClass(), "hashCodeValue", 106860317);
        setField(term4630, term4630.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "iikZEapDlu";
        args[1] = term4630;
        callMethod(klass, "lowerCase", argTypes, null, args);
    }

};


