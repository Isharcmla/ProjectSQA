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

public class StringUtils_replaceChars_1325500913269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2800;
     Object term2802;

    public StringUtils_replaceChars_1325500913269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2800 = new Character('g');
        term2802 = new Character('Q');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = "mXGCWJDOqA";
        args[1] = term2800;
        args[2] = term2802;
        Object retValue = callMethod(klass, "replaceChars", argTypes, null, args);
        assertTrue(recursiveEquals(term2800, 'g'));
        assertTrue(recursiveEquals(term2802, 'Q'));
        assertTrue(recursiveEquals(retValue, "mXGCWJDOqA"));
    }

};


