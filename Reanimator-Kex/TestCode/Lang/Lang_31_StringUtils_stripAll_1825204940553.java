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

public class StringUtils_stripAll_1825204940553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469986;

    public StringUtils_stripAll_1825204940553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469986 = (Object[]) newArray("java.lang.String", 10);
        setElement(term469986, 0, " \uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80");
        setElement(term469986, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term469986, 2, " \uFF80\uFF80\uFF80\uFF80\uFF80\uFF80\uFF80");
        setElement(term469986, 3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term469986, 4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term469986, 5, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term469986, 6, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term469986, 7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term469986, 8, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term469986, 9, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term469986;
        args[1] = " ";
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


