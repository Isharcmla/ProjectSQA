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

public class StringUtils_splitPreserveAllTokens_1218575843524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229357;

    public StringUtils_splitPreserveAllTokens_1218575843524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229357 = (Object[]) newArray("java.lang.String", 16);
        setElement(term229357, 0, "");
        setElement(term229357, 1, "");
        setElement(term229357, 2, "");
        setElement(term229357, 3, "");
        setElement(term229357, 4, "");
        setElement(term229357, 5, "");
        setElement(term229357, 6, "");
        setElement(term229357, 7, "");
        setElement(term229357, 8, "");
        setElement(term229357, 9, "");
        setElement(term229357, 10, "");
        setElement(term229357, 11, "");
        setElement(term229357, 12, "");
        setElement(term229357, 13, "");
        setElement(term229357, 14, "");
        setElement(term229357, 15, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "      \n        ";
        Object retValue = callMethod(klass, "splitPreserveAllTokens", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term229357));
    }

};


