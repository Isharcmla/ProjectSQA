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
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitWorker_1443333725243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1670;
     Object term1672;
     Object term9579;

    public StringUtils_splitWorker_1443333725243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1670 = new Integer(590364439);
        term1672 = new Boolean(false);
        term9579 = (Object[]) newArray("java.lang.String", 2);
        setElement(term9579, 0, "hBvTV");
        setElement(term9579, 1, "l");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "whBvTVIIlC";
        args[1] = "IgRJUzaCwW";
        args[2] = term1670;
        args[3] = term1672;
        Object retValue = callMethod(klass, "splitWorker", argTypes, null, args);
        assertTrue(recursiveEquals(term1670, 590364439));
        assertTrue(recursiveEquals(term1672, false));
        assertTrue(recursiveEquals(retValue, term9579));
    }

};


