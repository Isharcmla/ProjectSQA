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

public class DateTimeFormatterBuilder_isFormatter_1301817866231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29265;
     Object term29395;
     Object term29724;
     Object term29725;

    public DateTimeFormatterBuilder_isFormatter_1301817866231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29265 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term29395 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        term29724 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term29724, term29724.getClass(), "iElementPairs", null);
        setField(term29724, term29724.getClass(), "iFormatter", null);
        term29725 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setCharField(term29725, term29725.getClass(), "iValue", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29395;
        Object retValue = callMethod(klass, "isFormatter", argTypes, term29265, args);
        assertTrue(recursiveEquals(term29265, term29724));
        assertTrue(recursiveEquals(term29395, term29725));
        assertTrue(recursiveEquals(retValue, true));
    }

};


