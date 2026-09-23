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

public class StringUtils_getCommonPrefix_1844216792141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5325;

    public StringUtils_getCommonPrefix_1844216792141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5325 = (Object[]) newArray("java.lang.String", 1);
        setElement(term5325, 0, "xvkbvaEGYd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5325;
        callMethod(klass, "getCommonPrefix", argTypes, null, args);
    }

};


