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
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitByCharacterType_1097361822247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1750;
     Object term10677;

    public StringUtils_splitByCharacterType_1097361822247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1750 = new Boolean(true);
        term10677 = (Object[]) newArray("java.lang.String", 5);
        setElement(term10677, 0, "Hq");
        setElement(term10677, 1, "B");
        setElement(term10677, 2, "Owk");
        setElement(term10677, 3, "Vqj");
        setElement(term10677, 4, "D");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "HqBOwkVqjD";
        args[1] = term1750;
        Object retValue = callMethod(klass, "splitByCharacterType", argTypes, null, args);
        assertTrue(recursiveEquals(term1750, true));
        assertTrue(recursiveEquals(retValue, term10677));
    }

};


