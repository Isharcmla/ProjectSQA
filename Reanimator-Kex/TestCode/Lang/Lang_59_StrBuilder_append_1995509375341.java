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

public class StrBuilder_append_1995509375341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80900;
     Object term109036;
     Object term109015;

    public StrBuilder_append_1995509375341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80900 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term80788 = (char[]) newCharArray(0);
        setIntField(term80900, term80900.getClass(), "size", 0);
        setField(term80900, term80900.getClass(), "buffer", term80788);
        term109036 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term109037 = (char[]) newCharArray(3);
        setCharElement(term109037, 0, (char) 48);
        setCharElement(term109037, 1, (char) 46);
        setCharElement(term109037, 2, (char) 48);
        setField(term109036, term109036.getClass(), "buffer", term109037);
        setIntField(term109036, term109036.getClass(), "size", 3);
        setField(term109036, term109036.getClass(), "newLine", null);
        setField(term109036, term109036.getClass(), "nullText", null);
        term109015 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term109016 = (char[]) newCharArray(3);
        setCharElement(term109016, 0, (char) 48);
        setCharElement(term109016, 1, (char) 46);
        setCharElement(term109016, 2, (char) 48);
        setField(term109015, term109015.getClass(), "buffer", term109016);
        setIntField(term109015, term109015.getClass(), "size", 3);
        setField(term109015, term109015.getClass(), "newLine", null);
        setField(term109015, term109015.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = 0.0F;
        Object retValue = callMethod(klass, "append", argTypes, term80900, args);
        assertTrue(recursiveEquals(term80900, term109036));
        assertTrue(recursiveEquals(retValue, term109015));
    }

};


