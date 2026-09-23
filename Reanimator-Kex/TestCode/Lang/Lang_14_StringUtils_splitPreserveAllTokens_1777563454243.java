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

public class StringUtils_splitPreserveAllTokens_1777563454243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1624;
     Object term10211;

    public StringUtils_splitPreserveAllTokens_1777563454243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1624 = new Integer(1135664017);
        term10211 = (Object[]) newArray("java.lang.String", 4);
        setElement(term10211, 0, "t");
        setElement(term10211, 1, "");
        setElement(term10211, 2, "sykY");
        setElement(term10211, 3, "qO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "tPlsykYBqO";
        args[1] = "bLPjGVBhlX";
        args[2] = term1624;
        Object retValue = callMethod(klass, "splitPreserveAllTokens", argTypes, null, args);
        assertTrue(recursiveEquals(term1624, 1135664017));
        assertTrue(recursiveEquals(retValue, term10211));
    }

};


