package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;

public class FieldUtils_equals_1820364782133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13796;
     Object term13858;
     Object term14014;
     Object term14015;

    public FieldUtils_equals_1820364782133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13796 = newInstance(Class.forName("java.util.regex.Pattern$Ques"));
        term13858 = newInstance(Class.forName("java.util.regex.Pattern$Ques"));
        term14014 = newInstance(Class.forName("java.util.regex.Pattern$Ques"));
        setField(term14014, term14014.getClass(), "atom", null);
        setField(term14014, term14014.getClass(), "type", null);
        setField(term14014, term14014.getClass(), "next", null);
        term14015 = newInstance(Class.forName("java.util.regex.Pattern$Ques"));
        setField(term14015, term14015.getClass(), "atom", null);
        setField(term14015, term14015.getClass(), "type", null);
        setField(term14015, term14015.getClass(), "next", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term13796;
        args[1] = term13858;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term13796, term14014));
        assertTrue(recursiveEquals(term13858, term14015));
        assertTrue(recursiveEquals(retValue, false));
    }

};


