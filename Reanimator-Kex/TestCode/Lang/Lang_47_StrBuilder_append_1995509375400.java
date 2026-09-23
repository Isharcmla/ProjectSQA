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

public class StrBuilder_append_1995509375400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72677;
     Object term118328;
     Object term118308;

    public StrBuilder_append_1995509375400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72677 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term72565 = (char[]) newCharArray(0);
        setIntField(term72677, term72677.getClass(), "size", 0);
        setField(term72677, term72677.getClass(), "buffer", term72565);
        term118328 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term118329 = (char[]) newCharArray(3);
        setCharElement(term118329, 0, (char) 48);
        setCharElement(term118329, 1, (char) 46);
        setCharElement(term118329, 2, (char) 48);
        setField(term118328, term118328.getClass(), "buffer", term118329);
        setIntField(term118328, term118328.getClass(), "size", 3);
        setField(term118328, term118328.getClass(), "newLine", null);
        setField(term118328, term118328.getClass(), "nullText", null);
        term118308 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term118309 = (char[]) newCharArray(3);
        setCharElement(term118309, 0, (char) 48);
        setCharElement(term118309, 1, (char) 46);
        setCharElement(term118309, 2, (char) 48);
        setField(term118308, term118308.getClass(), "buffer", term118309);
        setIntField(term118308, term118308.getClass(), "size", 3);
        setField(term118308, term118308.getClass(), "newLine", null);
        setField(term118308, term118308.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = 0.0F;
        Object retValue = callMethod(klass, "append", argTypes, term72677, args);
        assertTrue(recursiveEquals(term72677, term118328));
        assertTrue(recursiveEquals(retValue, term118308));
    }

};


