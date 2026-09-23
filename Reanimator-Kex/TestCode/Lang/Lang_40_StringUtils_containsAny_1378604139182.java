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

public class StringUtils_containsAny_1378604139182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1098;
     Object term9275;

    public StringUtils_containsAny_1378604139182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1098 = (char[]) newCharArray(4);
        setCharElement(term1098, 0, 'T');
        setCharElement(term1098, 1, 'D');
        setCharElement(term1098, 2, 's');
        setCharElement(term1098, 3, 'j');
        term9275 = (char[]) newCharArray(4);
        setCharElement(term9275, 0, 'T');
        setCharElement(term9275, 1, 'D');
        setCharElement(term9275, 2, 's');
        setCharElement(term9275, 3, 'j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "xLbjWUgOIL";
        args[1] = term1098;
        Object retValue = callMethod(klass, "containsAny", argTypes, null, args);
        assertTrue(recursiveEquals(term1098, term9275));
        assertTrue(recursiveEquals(retValue, true));
    }

};


