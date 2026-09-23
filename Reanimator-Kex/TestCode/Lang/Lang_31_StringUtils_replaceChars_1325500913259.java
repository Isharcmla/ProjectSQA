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

public class StringUtils_replaceChars_1325500913259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4006;
     Object term4008;

    public StringUtils_replaceChars_1325500913259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4006 = new Character('z');
        term4008 = new Character('x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = "xtftXXMbem";
        args[1] = term4006;
        args[2] = term4008;
        Object retValue = callMethod(klass, "replaceChars", argTypes, null, args);
        assertTrue(recursiveEquals(term4006, 'z'));
        assertTrue(recursiveEquals(term4008, 'x'));
        assertTrue(recursiveEquals(retValue, "xtftXXMbem"));
    }

};


