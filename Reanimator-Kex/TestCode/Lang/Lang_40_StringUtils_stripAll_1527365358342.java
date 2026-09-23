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

public class StringUtils_stripAll_1527365358342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121310;

    public StringUtils_stripAll_1527365358342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121310 = (Object[]) newArray("java.lang.String", 32);
        setElement(term121310, 0, "                ");
        setElement(term121310, 1, "        ");
        setElement(term121310, 2, "                                ");
        setElement(term121310, 3, "  ");
        setElement(term121310, 4, "                ");
        setElement(term121310, 5, "                                ");
        setElement(term121310, 6, "                                ");
        setElement(term121310, 7, "                                ");
        setElement(term121310, 8, "                                ");
        setElement(term121310, 9, "                                ");
        setElement(term121310, 10, "                                ");
        setElement(term121310, 11, "                                ");
        setElement(term121310, 12, "                                ");
        setElement(term121310, 13, "                                ");
        setElement(term121310, 14, "                                ");
        setElement(term121310, 15, "                                ");
        setElement(term121310, 16, "                                ");
        setElement(term121310, 17, "                                ");
        setElement(term121310, 18, "                                ");
        setElement(term121310, 19, "                                ");
        setElement(term121310, 20, "                                ");
        setElement(term121310, 21, "                                ");
        setElement(term121310, 22, "                                ");
        setElement(term121310, 23, "                                ");
        setElement(term121310, 24, "                                ");
        setElement(term121310, 25, "                                ");
        setElement(term121310, 26, "                                ");
        setElement(term121310, 27, "                                ");
        setElement(term121310, 28, "                                ");
        setElement(term121310, 29, "                                ");
        setElement(term121310, 30, "                                ");
        setElement(term121310, 31, "                                ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term121310;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


