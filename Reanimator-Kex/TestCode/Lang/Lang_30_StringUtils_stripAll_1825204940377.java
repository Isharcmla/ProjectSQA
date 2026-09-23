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

public class StringUtils_stripAll_1825204940377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192842;

    public StringUtils_stripAll_1825204940377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192842 = (Object[]) newArray("java.lang.String", 8);
        setElement(term192842, 0, " \u000B");
        setElement(term192842, 1, "  ");
        setElement(term192842, 2, "  ");
        setElement(term192842, 3, " \u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B");
        setElement(term192842, 4, "  ");
        setElement(term192842, 5, "  ");
        setElement(term192842, 6, "  ");
        setElement(term192842, 7, "  ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term192842;
        args[1] = " \u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B\u000B";
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


