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

public class StringUtils_splitByCharacterTypeCamelCase_983340380235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12975;

    public StringUtils_splitByCharacterTypeCamelCase_983340380235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12975 = (Object[]) newArray("java.lang.String", 5);
        setElement(term12975, 0, "Adxv");
        setElement(term12975, 1, "L");
        setElement(term12975, 2, "Jh");
        setElement(term12975, 3, "N");
        setElement(term12975, 4, "Le");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        Object retValue = callMethod(klass, "splitByCharacterTypeCamelCase", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term12975));
    }

};


