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

public class StrBuilder_append_223145107310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52047;
     Object term91604;
     Object term91598;

    public StrBuilder_append_223145107310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52047 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term91604 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91604, term91604.getClass(), "buffer", null);
        setIntField(term91604, term91604.getClass(), "size", 0);
        setField(term91604, term91604.getClass(), "newLine", null);
        setField(term91604, term91604.getClass(), "nullText", null);
        term91598 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91598, term91598.getClass(), "buffer", null);
        setIntField(term91598, term91598.getClass(), "size", 0);
        setField(term91598, term91598.getClass(), "newLine", null);
        setField(term91598, term91598.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term52047, args);
        assertTrue(recursiveEquals(term52047, term91604));
        assertTrue(recursiveEquals(retValue, term91598));
    }

};


