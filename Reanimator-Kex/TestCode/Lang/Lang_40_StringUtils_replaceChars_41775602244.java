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
import java.lang.Character;

public class StringUtils_replaceChars_41775602244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3932;
     Object term3934;

    public StringUtils_replaceChars_41775602244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3932 = new Character('q');
        term3934 = new Character('z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = "rLHAoqXgPh";
        args[1] = term3932;
        args[2] = term3934;
        Object retValue = callMethod(klass, "replaceChars", argTypes, null, args);
        assertTrue(recursiveEquals(term3932, 'q'));
        assertTrue(recursiveEquals(term3934, 'z'));
        assertTrue(recursiveEquals(retValue, "rLHAozXgPh"));
    }

};


