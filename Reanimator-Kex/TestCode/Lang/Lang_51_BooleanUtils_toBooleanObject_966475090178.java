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
import java.lang.Integer;
import java.lang.Boolean;

public class BooleanUtils_toBooleanObject_966475090178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19498;
     Object term19530;
     Object term19531;
     Object term19524;

    public BooleanUtils_toBooleanObject_966475090178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19498 = new Integer(0);
        term19530 = new Integer(0);
        term19531 = new Integer(0);
        term19524 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = term19498;
        args[1] = term19498;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "toBooleanObject", argTypes, null, args);
        assertTrue(recursiveEquals(term19498, term19530));
        assertTrue(recursiveEquals(term19498, term19531));
        assertTrue(recursiveEquals(retValue, term19524));
    }

};


