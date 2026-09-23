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

public class StringUtils_splitByCharacterType_1097361822246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1750;
     Object term9943;

    public StringUtils_splitByCharacterType_1097361822246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1750 = new Boolean(true);
        term9943 = (Object[]) newArray("java.lang.String", 5);
        setElement(term9943, 0, "Hq");
        setElement(term9943, 1, "B");
        setElement(term9943, 2, "Owk");
        setElement(term9943, 3, "Vqj");
        setElement(term9943, 4, "D");
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
        assertTrue(recursiveEquals(retValue, term9943));
    }

};


