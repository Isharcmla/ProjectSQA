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
import java.lang.Character;
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitWorker_1156041760241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542;
     Object term1544;
     Object term9935;

    public StringUtils_splitWorker_1156041760241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1542 = new Character('r');
        term1544 = new Boolean(false);
        term9935 = (Object[]) newArray("java.lang.String", 1);
        setElement(term9935, 0, "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "uWHnvSvaPl";
        args[1] = term1542;
        args[2] = term1544;
        Object retValue = callMethod(klass, "splitWorker", argTypes, null, args);
        assertTrue(recursiveEquals(term1542, 'r'));
        assertTrue(recursiveEquals(term1544, false));
        assertTrue(recursiveEquals(retValue, term9935));
    }

};


