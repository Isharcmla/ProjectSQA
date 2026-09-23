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

public class StringUtils_containsNone_27150401188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1321;
     Object term9814;

    public StringUtils_containsNone_27150401188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1321 = (char[]) newCharArray(2);
        setCharElement(term1321, 0, 'b');
        setCharElement(term1321, 1, 'M');
        term9814 = (char[]) newCharArray(2);
        setCharElement(term9814, 0, 'b');
        setCharElement(term9814, 1, 'M');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "MLqYREekMl";
        args[1] = term1321;
        Object retValue = callMethod(klass, "containsNone", argTypes, null, args);
        assertTrue(recursiveEquals(term1321, term9814));
        assertTrue(recursiveEquals(retValue, false));
    }

};


