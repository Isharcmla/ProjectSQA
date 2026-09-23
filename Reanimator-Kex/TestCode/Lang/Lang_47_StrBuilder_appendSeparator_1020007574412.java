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

public class StrBuilder_appendSeparator_1020007574412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80216;
     Object term127423;

    public StrBuilder_appendSeparator_1020007574412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80216 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term127423 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127423, term127423.getClass(), "buffer", null);
        setIntField(term127423, term127423.getClass(), "size", 0);
        setField(term127423, term127423.getClass(), "newLine", null);
        setField(term127423, term127423.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = (char) 0;
        args[1] = 0;
        callMethod(klass, "appendSeparator", argTypes, term80216, args);
        assertTrue(recursiveEquals(term80216, term127423));
    }

};


