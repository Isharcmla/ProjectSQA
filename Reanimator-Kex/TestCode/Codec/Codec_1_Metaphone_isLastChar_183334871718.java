package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.Integer;

public class Metaphone_isLastChar_183334871718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;
     Object term301;
     Object term303;
     Object term1465;

    public Metaphone_isLastChar_183334871718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term299, term299.getClass(), "maxCodeLen", 4);
        term301 = new Integer(1227103734);
        term303 = new Integer(-1339778481);
        term1465 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term1465, term1465.getClass(), "maxCodeLen", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term301;
        args[1] = term303;
        Object retValue = callMethod(klass, "isLastChar", argTypes, term299, args);
        assertTrue(recursiveEquals(term299, term1465));
        assertTrue(recursiveEquals(term301, 1227103734));
        assertTrue(recursiveEquals(term303, -1339778481));
        assertTrue(recursiveEquals(retValue, false));
    }

};
