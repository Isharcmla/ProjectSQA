package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_appendSeparator_1020037396414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80972;
     Object term127905;
     Object term127796;

    public StrBuilder_appendSeparator_1020037396414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80972 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term80972, term80972.getClass(), "size", 0);
        term127905 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127905, term127905.getClass(), "buffer", null);
        setIntField(term127905, term127905.getClass(), "size", 0);
        setField(term127905, term127905.getClass(), "newLine", null);
        setField(term127905, term127905.getClass(), "nullText", null);
        term127796 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127796, term127796.getClass(), "buffer", null);
        setIntField(term127796, term127796.getClass(), "size", 0);
        setField(term127796, term127796.getClass(), "newLine", null);
        setField(term127796, term127796.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "appendSeparator", argTypes, term80972, args);
        assertTrue(recursiveEquals(term80972, term127905));
        assertTrue(recursiveEquals(retValue, term127796));
    }

};


