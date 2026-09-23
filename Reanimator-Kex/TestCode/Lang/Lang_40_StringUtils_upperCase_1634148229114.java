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

public class StringUtils_upperCase_1634148229114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4566;

    public StringUtils_upperCase_1634148229114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4566 = newInstance(Class.forName("java.util.Locale"));
        Object term4567 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4567, term4567.getClass(), "language", "pt");
        setField(term4567, term4567.getClass(), "script", "");
        setField(term4567, term4567.getClass(), "region", "MO");
        setField(term4567, term4567.getClass(), "variant", "");
        setIntField(term4567, term4567.getClass(), "hash", 106966554);
        setField(term4566, term4566.getClass(), "baseLocale", term4567);
        setField(term4566, term4566.getClass(), "localeExtensions", null);
        setIntField(term4566, term4566.getClass(), "hashCodeValue", 106966554);
        setField(term4566, term4566.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "XJJNClzHRf";
        args[1] = term4566;
        callMethod(klass, "upperCase", argTypes, null, args);
    }

};


