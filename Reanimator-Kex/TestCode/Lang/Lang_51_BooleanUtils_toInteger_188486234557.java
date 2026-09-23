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

public class BooleanUtils_toInteger_188486234557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term67;
     Object term69;
     Object term71;
     Object term1730;

    public BooleanUtils_toInteger_188486234557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = new Boolean(false);
        term67 = new Integer(-522618178);
        term69 = new Integer(1134449235);
        term71 = new Integer(-883034806);
        term1730 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Boolean");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term65;
        args[1] = term67;
        args[2] = term69;
        args[3] = term71;
        Object retValue = callMethod(klass, "toInteger", argTypes, null, args);
        assertTrue(recursiveEquals(term65, term1730));
        assertTrue(recursiveEquals(term67, -522618178));
        assertTrue(recursiveEquals(term69, 1134449235));
        assertTrue(recursiveEquals(term71, -883034806));
        assertTrue(recursiveEquals(retValue, 1134449235));
    }

};


