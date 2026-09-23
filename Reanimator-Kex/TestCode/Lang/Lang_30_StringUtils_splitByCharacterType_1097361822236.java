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

public class StringUtils_splitByCharacterType_1097361822236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2872;
     Object term13067;

    public StringUtils_splitByCharacterType_1097361822236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2872 = new Boolean(true);
        term13067 = (Object[]) newArray("java.lang.String", 5);
        setElement(term13067, 0, "l");
        setElement(term13067, 1, "Hf");
        setElement(term13067, 2, "Tr");
        setElement(term13067, 3, "WKM");
        setElement(term13067, 4, "Pk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "lHfTrWKMPk";
        args[1] = term2872;
        Object retValue = callMethod(klass, "splitByCharacterType", argTypes, null, args);
        assertTrue(recursiveEquals(term2872, true));
        assertTrue(recursiveEquals(retValue, term13067));
    }

};


