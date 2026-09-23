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

public class WordUtils_wrap_93541319516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term51;

    public WordUtils_wrap_93541319516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = new Integer(1162663216);
        term51 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.WordUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "sjlJAEtRrb";
        args[1] = term37;
        args[2] = "MuLcgQHgqz";
        args[3] = term51;
        Object retValue = callMethod(klass, "wrap", argTypes, null, args);
        assertTrue(recursiveEquals(term37, 1162663216));
        assertTrue(recursiveEquals(term51, false));
        assertTrue(recursiveEquals(retValue, "sjlJAEtRrb"));
    }

};


