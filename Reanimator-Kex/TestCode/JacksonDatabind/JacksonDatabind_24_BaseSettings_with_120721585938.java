package com.fasterxml.jackson.databind.cfg;

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
import static com.fasterxml.jackson.databind.cfg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseSettings_with_120721585938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public BaseSettings_with_120721585938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("java.util.Locale"));
        Object term49 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term49, term49.getClass(), "language", "ps");
        setField(term49, term49.getClass(), "script", "");
        setField(term49, term49.getClass(), "region", "");
        setField(term49, term49.getClass(), "variant", "");
        setIntField(term49, term49.getClass(), "hash", 106860317);
        setField(term48, term48.getClass(), "baseLocale", term49);
        setField(term48, term48.getClass(), "localeExtensions", null);
        setIntField(term48, term48.getClass(), "hashCodeValue", 106860317);
        setField(term48, term48.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term48;
        try {
            callMethod(klass, "with", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


