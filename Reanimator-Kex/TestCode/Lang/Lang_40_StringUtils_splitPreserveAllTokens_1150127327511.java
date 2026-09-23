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
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_splitPreserveAllTokens_1150127327511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251003;

    public StringUtils_splitPreserveAllTokens_1150127327511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251003 = (Object[]) newArray("java.lang.String", 42);
        setElement(term251003, 0, "");
        setElement(term251003, 1, "");
        setElement(term251003, 2, "");
        setElement(term251003, 3, "");
        setElement(term251003, 4, "");
        setElement(term251003, 5, "");
        setElement(term251003, 6, "");
        setElement(term251003, 7, "");
        setElement(term251003, 8, "");
        setElement(term251003, 9, "");
        setElement(term251003, 10, "");
        setElement(term251003, 11, "");
        setElement(term251003, 12, "");
        setElement(term251003, 13, "");
        setElement(term251003, 14, "");
        setElement(term251003, 15, "");
        setElement(term251003, 16, "");
        setElement(term251003, 17, "");
        setElement(term251003, 18, "");
        setElement(term251003, 19, "");
        setElement(term251003, 20, "");
        setElement(term251003, 21, "");
        setElement(term251003, 22, "");
        setElement(term251003, 23, "");
        setElement(term251003, 24, "");
        setElement(term251003, 25, "");
        setElement(term251003, 26, "");
        setElement(term251003, 27, "");
        setElement(term251003, 28, "");
        setElement(term251003, 29, "");
        setElement(term251003, 30, "");
        setElement(term251003, 31, "");
        setElement(term251003, 32, "");
        setElement(term251003, 33, "");
        setElement(term251003, 34, "");
        setElement(term251003, 35, "");
        setElement(term251003, 36, "");
        setElement(term251003, 37, "");
        setElement(term251003, 38, "");
        setElement(term251003, 39, "");
        setElement(term251003, 40, "");
        setElement(term251003, 41, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "                                         ";
        args[1] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[2] = 0;
        Object retValue = callMethod(klass, "splitPreserveAllTokens", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term251003));
    }

};


