package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;

public class Partial_toString_703545626127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67693;
     Object term74444;

    public Partial_toString_703545626127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67693 = newInstance(Class.forName("org.joda.time.Partial"));
        term74444 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term74444, term74444.getClass(), "iChronology", null);
        setField(term74444, term74444.getClass(), "iTypes", null);
        setField(term74444, term74444.getClass(), "iValues", null);
        setField(term74444, term74444.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = null;
        Object retValue = callMethod(klass, "toString", argTypes, term67693, args);
        assertTrue(recursiveEquals(term67693, term74444));
        assertTrue(recursiveEquals(retValue, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                "));
    }

};


