package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;

public class StringUtil_join_64289502119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term1625;

    public StringUtil_join_64289502119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = (Object[]) newArray("java.lang.String", 5);
        setElement(term24, 0, "sjlJAEtRrb");
        setElement(term24, 1, "MuLcgQHgqz");
        setElement(term24, 2, "xxtlPwDYFs");
        setElement(term24, 3, "jJCZpVmanW");
        setElement(term24, 4, "EGtDIRbSSb");
        term1625 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1625, 0, "sjlJAEtRrb");
        setElement(term1625, 1, "MuLcgQHgqz");
        setElement(term1625, 2, "xxtlPwDYFs");
        setElement(term1625, 3, "jJCZpVmanW");
        setElement(term1625, 4, "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.StringUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term24;
        args[1] = "SzjVpOQTyS";
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term24, "SzjVpOQTyS"));
        assertTrue(recursiveEquals(retValue, "sjlJAEtRrbSzjVpOQTySMuLcgQHgqzSzjVpOQTySxxtlPwDYFsSzjVpOQTySjJCZpVmanWSzjVpOQTySEGtDIRbSSb"));
    }

};


