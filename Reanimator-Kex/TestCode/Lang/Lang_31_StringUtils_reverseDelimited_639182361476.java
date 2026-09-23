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

public class StringUtils_reverseDelimited_639182361476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137004;
     Object term137005;

    public StringUtils_reverseDelimited_639182361476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137004 = newInstance(Class.forName("org.apache.commons.lang3.StringUtils"));
        term137005 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term137005;
        Object retValue = callMethod(klass, "reverseDelimited", argTypes, term137004, args);
        assertTrue(recursiveEquals(term137005, (byte) 99));
        assertTrue(recursiveEquals(retValue, null));
    }

};


