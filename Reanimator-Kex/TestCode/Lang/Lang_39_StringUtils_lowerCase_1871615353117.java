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

public class StringUtils_lowerCase_1871615353117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4672;

    public StringUtils_lowerCase_1871615353117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4672 = newInstance(Class.forName("java.util.Locale"));
        Object term4673 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4673, term4673.getClass(), "language", "ps");
        setField(term4673, term4673.getClass(), "script", "");
        setField(term4673, term4673.getClass(), "region", "");
        setField(term4673, term4673.getClass(), "variant", "");
        setIntField(term4673, term4673.getClass(), "hash", 106860317);
        setField(term4672, term4672.getClass(), "baseLocale", term4673);
        setField(term4672, term4672.getClass(), "localeExtensions", null);
        setIntField(term4672, term4672.getClass(), "hashCodeValue", 106860317);
        setField(term4672, term4672.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "ZkMALXpEAZ";
        args[1] = term4672;
        callMethod(klass, "lowerCase", argTypes, null, args);
    }

};


