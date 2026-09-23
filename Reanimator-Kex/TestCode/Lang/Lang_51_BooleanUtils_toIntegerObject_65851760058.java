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
import java.lang.Integer;

public class BooleanUtils_toIntegerObject_65851760058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term75;
     Object term77;
     Object term1739;
     Object term1740;
     Object term1732;

    public BooleanUtils_toIntegerObject_65851760058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = new Boolean(true);
        term75 = new Integer(1227103734);
        term77 = new Integer(-1339778481);
        term1739 = new Integer(1227103734);
        term1740 = new Integer(-1339778481);
        term1732 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.Integer");
        Object[] args = new Object[3];
        args[0] = term73;
        args[1] = term75;
        args[2] = term77;
        Object retValue = callMethod(klass, "toIntegerObject", argTypes, null, args);
        assertTrue(recursiveEquals(term73, true));
        assertTrue(recursiveEquals(term75, term1739));
        assertTrue(recursiveEquals(term77, term1740));
        assertTrue(recursiveEquals(retValue, term1732));
    }

};


