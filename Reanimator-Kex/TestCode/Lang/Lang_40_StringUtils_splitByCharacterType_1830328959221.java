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
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitByCharacterType_1830328959221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2818;
     Object term13349;

    public StringUtils_splitByCharacterType_1830328959221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2818 = new Boolean(false);
        term13349 = (Object[]) newArray("java.lang.String", 6);
        setElement(term13349, 0, "XO");
        setElement(term13349, 1, "i");
        setElement(term13349, 2, "D");
        setElement(term13349, 3, "vl");
        setElement(term13349, 4, "D");
        setElement(term13349, 5, "hdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "XOiDvlDhdc";
        args[1] = term2818;
        Object retValue = callMethod(klass, "splitByCharacterType", argTypes, null, args);
        assertTrue(recursiveEquals(term2818, false));
        assertTrue(recursiveEquals(retValue, term13349));
    }

};


