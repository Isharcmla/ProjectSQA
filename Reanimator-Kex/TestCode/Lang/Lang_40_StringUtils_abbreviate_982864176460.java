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

public class StringUtils_abbreviate_982864176460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137494;
     Object term137495;
     Object term137497;

    public StringUtils_abbreviate_982864176460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137494 = newInstance(Class.forName("org.apache.commons.lang.StringUtils"));
        term137495 = new Integer(0);
        term137497 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term137495;
        args[2] = term137497;
        Object retValue = callMethod(klass, "abbreviate", argTypes, term137494, args);
        assertTrue(recursiveEquals(term137495, false));
        assertTrue(recursiveEquals(term137497, false));
        assertTrue(recursiveEquals(retValue, null));
    }

};


