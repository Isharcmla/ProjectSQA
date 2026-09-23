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

public class BooleanUtils_toIntegerObject_159896970459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term81;
     Object term83;
     Object term85;
     Object term1753;
     Object term1754;
     Object term1755;
     Object term1756;
     Object term1743;

    public BooleanUtils_toIntegerObject_159896970459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = new Boolean(true);
        term81 = new Integer(1725571209);
        term83 = new Integer(-522618178);
        term85 = new Integer(1134449235);
        term1753 = new Boolean(true);
        term1754 = new Integer(1725571209);
        term1755 = new Integer(-522618178);
        term1756 = new Integer(1134449235);
        term1743 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Boolean");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = term79;
        args[1] = term81;
        args[2] = term83;
        args[3] = term85;
        Object retValue = callMethod(klass, "toIntegerObject", argTypes, null, args);
        assertTrue(recursiveEquals(term79, term1753));
        assertTrue(recursiveEquals(term81, term1754));
        assertTrue(recursiveEquals(term83, term1755));
        assertTrue(recursiveEquals(term85, term1756));
        assertTrue(recursiveEquals(retValue, term1743));
    }

};


