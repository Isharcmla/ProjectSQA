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

public class StringUtils_splitPreserveAllTokens_1218575843478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172314;

    public StringUtils_splitPreserveAllTokens_1218575843478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172314 = (Object[]) newArray("java.lang.String", 44);
        setElement(term172314, 0, "");
        setElement(term172314, 1, "");
        setElement(term172314, 2, "");
        setElement(term172314, 3, "");
        setElement(term172314, 4, "");
        setElement(term172314, 5, "");
        setElement(term172314, 6, "");
        setElement(term172314, 7, "");
        setElement(term172314, 8, "");
        setElement(term172314, 9, "");
        setElement(term172314, 10, "");
        setElement(term172314, 11, "");
        setElement(term172314, 12, "");
        setElement(term172314, 13, "");
        setElement(term172314, 14, "");
        setElement(term172314, 15, "");
        setElement(term172314, 16, "");
        setElement(term172314, 17, "");
        setElement(term172314, 18, "");
        setElement(term172314, 19, "");
        setElement(term172314, 20, "");
        setElement(term172314, 21, "");
        setElement(term172314, 22, "");
        setElement(term172314, 23, "");
        setElement(term172314, 24, "");
        setElement(term172314, 25, "");
        setElement(term172314, 26, "");
        setElement(term172314, 27, "");
        setElement(term172314, 28, "");
        setElement(term172314, 29, "");
        setElement(term172314, 30, "");
        setElement(term172314, 31, "");
        setElement(term172314, 32, "");
        setElement(term172314, 33, "");
        setElement(term172314, 34, "");
        setElement(term172314, 35, "");
        setElement(term172314, 36, "");
        setElement(term172314, 37, "");
        setElement(term172314, 38, "");
        setElement(term172314, 39, "");
        setElement(term172314, 40, "");
        setElement(term172314, 41, "");
        setElement(term172314, 42, "");
        setElement(term172314, 43, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "   \n                                       ";
        Object retValue = callMethod(klass, "splitPreserveAllTokens", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term172314));
    }

};


