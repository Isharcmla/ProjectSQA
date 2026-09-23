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

public class StrBuilder_appendPadding_798852950335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64645;
     Object term149024;

    public StrBuilder_appendPadding_798852950335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64645 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term149024 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term149024, term149024.getClass(), "buffer", null);
        setIntField(term149024, term149024.getClass(), "size", 0);
        setField(term149024, term149024.getClass(), "newLine", null);
        setField(term149024, term149024.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = -1;
        args[1] = (char) 0;
        callMethod(klass, "appendPadding", argTypes, term64645, args);
        assertTrue(recursiveEquals(term64645, term149024));
    }

};


