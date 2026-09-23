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

public class StringUtils_stripAll_1400325423311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96172;

    public StringUtils_stripAll_1400325423311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96172 = (Object[]) newArray("java.lang.String", 10);
        setElement(term96172, 0, "                                                                ");
        setElement(term96172, 1, "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        setElement(term96172, 2, "                                                                ");
        setElement(term96172, 3, "                                                                ");
        setElement(term96172, 4, "                                                                ");
        setElement(term96172, 5, "                                                                ");
        setElement(term96172, 6, "                                                                ");
        setElement(term96172, 7, "                                                                ");
        setElement(term96172, 8, "                                                                ");
        setElement(term96172, 9, "                                                                ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term96172;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


