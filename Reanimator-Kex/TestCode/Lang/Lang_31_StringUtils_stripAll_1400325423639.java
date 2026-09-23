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

public class StringUtils_stripAll_1400325423639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553653;
     Object term635130;
     Object term635060;

    public StringUtils_stripAll_1400325423639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553653 = (Object[]) newArray("java.lang.String", 3);
        setElement(term553653, 0, "\u0001               ");
        setElement(term553653, 1, "\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80");
        term635130 = (Object[]) newArray("java.lang.String", 3);
        setElement(term635130, 0, "\u0001               ");
        setElement(term635130, 1, "\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF");
        term635060 = (Object[]) newArray("java.lang.String", 3);
        setElement(term635060, 0, "\u0001");
        setElement(term635060, 1, "\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF\uFF80\uFFFF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term553653;
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term553653, term635130));
        assertTrue(recursiveEquals(retValue, term635060));
    }

};


