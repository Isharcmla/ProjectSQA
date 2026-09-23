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

public class StringUtils_ordinalIndexOf_128899776190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517;

    public StringUtils_ordinalIndexOf_128899776190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term517;
        Object retValue = callMethod(klass, "ordinalIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term517, -1922583790));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


