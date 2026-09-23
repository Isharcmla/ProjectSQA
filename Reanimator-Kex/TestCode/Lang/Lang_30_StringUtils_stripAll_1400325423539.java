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
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_stripAll_1400325423539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219934;
     Object term526563;
     Object term526520;

    public StringUtils_stripAll_1400325423539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219934 = (Object[]) newArray("java.lang.String", 16);
        setElement(term219934, 0, "\u0004   ");
        setElement(term219934, 1, " \u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setElement(term219934, 2, "\u0004\u0004\u0004\u0004");
        setElement(term219934, 4, "");
        setElement(term219934, 5, "");
        setElement(term219934, 6, "");
        setElement(term219934, 7, "");
        setElement(term219934, 8, "");
        setElement(term219934, 9, "");
        setElement(term219934, 10, "");
        setElement(term219934, 11, "");
        setElement(term219934, 12, "");
        setElement(term219934, 13, "");
        setElement(term219934, 14, "");
        setElement(term219934, 15, "");
        term526563 = (Object[]) newArray("java.lang.String", 16);
        setElement(term526563, 0, "\u0004   ");
        setElement(term526563, 1, " \u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setElement(term526563, 2, "\u0004\u0004\u0004\u0004");
        setElement(term526563, 4, "");
        setElement(term526563, 5, "");
        setElement(term526563, 6, "");
        setElement(term526563, 7, "");
        setElement(term526563, 8, "");
        setElement(term526563, 9, "");
        setElement(term526563, 10, "");
        setElement(term526563, 11, "");
        setElement(term526563, 12, "");
        setElement(term526563, 13, "");
        setElement(term526563, 14, "");
        setElement(term526563, 15, "");
        term526520 = (Object[]) newArray("java.lang.String", 16);
        setElement(term526520, 0, "\u0004");
        setElement(term526520, 1, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setElement(term526520, 2, "\u0004\u0004\u0004\u0004");
        setElement(term526520, 4, "");
        setElement(term526520, 5, "");
        setElement(term526520, 6, "");
        setElement(term526520, 7, "");
        setElement(term526520, 8, "");
        setElement(term526520, 9, "");
        setElement(term526520, 10, "");
        setElement(term526520, 11, "");
        setElement(term526520, 12, "");
        setElement(term526520, 13, "");
        setElement(term526520, 14, "");
        setElement(term526520, 15, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term219934;
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term219934, term526563));
        assertTrue(recursiveEquals(retValue, term526520));
    }

};


