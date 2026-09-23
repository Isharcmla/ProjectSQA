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
import java.lang.Integer;
import java.lang.Object;

public class StringUtils_splitByWholeSeparatorPreserveAllTokens_1944679075237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1414;
     Object term9549;

    public StringUtils_splitByWholeSeparatorPreserveAllTokens_1944679075237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1414 = new Integer(-117576464);
        term9549 = (Object[]) newArray("java.lang.String", 1);
        setElement(term9549, 0, "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "nHXjMycHlU";
        args[1] = "ieCtQFdkii";
        args[2] = term1414;
        Object retValue = callMethod(klass, "splitByWholeSeparatorPreserveAllTokens", argTypes, null, args);
        assertTrue(recursiveEquals(term1414, -117576464));
        assertTrue(recursiveEquals(retValue, term9549));
    }

};


