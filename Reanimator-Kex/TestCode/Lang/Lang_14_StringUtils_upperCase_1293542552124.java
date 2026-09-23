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

public class StringUtils_upperCase_1293542552124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3411;

    public StringUtils_upperCase_1293542552124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3411 = newInstance(Class.forName("java.util.Locale"));
        Object term3412 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3412, term3412.getClass(), "language", "pt");
        setField(term3412, term3412.getClass(), "script", "");
        setField(term3412, term3412.getClass(), "region", "MO");
        setField(term3412, term3412.getClass(), "variant", "");
        setIntField(term3412, term3412.getClass(), "hash", 106966554);
        setField(term3411, term3411.getClass(), "baseLocale", term3412);
        setField(term3411, term3411.getClass(), "localeExtensions", null);
        setIntField(term3411, term3411.getClass(), "hashCodeValue", 106966554);
        setField(term3411, term3411.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "EeBVbzjcCI";
        args[1] = term3411;
        callMethod(klass, "upperCase", argTypes, null, args);
    }

};


