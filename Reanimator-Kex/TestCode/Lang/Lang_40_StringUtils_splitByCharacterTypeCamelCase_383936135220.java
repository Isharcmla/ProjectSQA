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

public class StringUtils_splitByCharacterTypeCamelCase_383936135220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13268;

    public StringUtils_splitByCharacterTypeCamelCase_383936135220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13268 = (Object[]) newArray("java.lang.String", 6);
        setElement(term13268, 0, "Wz");
        setElement(term13268, 1, "M");
        setElement(term13268, 2, "Eh");
        setElement(term13268, 3, "M");
        setElement(term13268, 4, "Xk");
        setElement(term13268, 5, "Kx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzMEhMXkKx";
        Object retValue = callMethod(klass, "splitByCharacterTypeCamelCase", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term13268));
    }

};


