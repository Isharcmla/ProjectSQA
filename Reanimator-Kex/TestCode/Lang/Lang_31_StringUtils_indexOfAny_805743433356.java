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

public class StringUtils_indexOfAny_805743433356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104377;

    public StringUtils_indexOfAny_805743433356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104377 = (Object[]) newArray("java.lang.String", 4);
        setElement(term104377, 0, "");
        setElement(term104377, 1, "");
        setElement(term104377, 2, "");
        setElement(term104377, 3, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term104377;
        callMethod(klass, "indexOfAny", argTypes, null, args);
    }

};


