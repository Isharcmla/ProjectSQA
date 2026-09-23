package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class DateTimeFormatterBuilder_appendLiteral_1912131793404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63485;
     Object term64063;
     Object term64053;

    public DateTimeFormatterBuilder_appendLiteral_1912131793404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term63575 = new ArrayList();
        term63485 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term63523 = newInstance(Class.forName("java.lang.Object"));
        setField(term63485, term63485.getClass(), "iFormatter", term63523);
        setField(term63485, term63485.getClass(), "iElementPairs", term63575);
        Object term64066 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setCharField(term64066, term64066.getClass(), "iValue", (char) 32);
        ArrayList term64064 = new ArrayList();
        ((ArrayList) term64064).add(term64066);
        ((ArrayList) term64064).add(term64066);
        term64063 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term64063, term64063.getClass(), "iElementPairs", term64064);
        setField(term64063, term64063.getClass(), "iFormatter", null);
        Object term64056 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setCharField(term64056, term64056.getClass(), "iValue", (char) 32);
        ArrayList term64054 = new ArrayList();
        ((ArrayList) term64054).add(term64056);
        ((ArrayList) term64054).add(term64056);
        term64053 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term64053, term64053.getClass(), "iElementPairs", term64054);
        setField(term64053, term64053.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "appendLiteral", argTypes, term63485, args);
        assertTrue(recursiveEquals(term63485, term64063));
        assertTrue(recursiveEquals(retValue, term64053));
    }

};


