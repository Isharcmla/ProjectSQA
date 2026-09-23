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

public class StrBuilder_append_1995509375335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62811;
     Object term117771;
     Object term117751;

    public StrBuilder_append_1995509375335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62811 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term62699 = (char[]) newCharArray(0);
        setIntField(term62811, term62811.getClass(), "size", 0);
        setField(term62811, term62811.getClass(), "buffer", term62699);
        term117771 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term117772 = (char[]) newCharArray(3);
        setCharElement(term117772, 0, (char) 48);
        setCharElement(term117772, 1, (char) 46);
        setCharElement(term117772, 2, (char) 48);
        setField(term117771, term117771.getClass(), "buffer", term117772);
        setIntField(term117771, term117771.getClass(), "size", 3);
        setField(term117771, term117771.getClass(), "newLine", null);
        setField(term117771, term117771.getClass(), "nullText", null);
        term117751 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term117752 = (char[]) newCharArray(3);
        setCharElement(term117752, 0, (char) 48);
        setCharElement(term117752, 1, (char) 46);
        setCharElement(term117752, 2, (char) 48);
        setField(term117751, term117751.getClass(), "buffer", term117752);
        setIntField(term117751, term117751.getClass(), "size", 3);
        setField(term117751, term117751.getClass(), "newLine", null);
        setField(term117751, term117751.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = 0.0F;
        Object retValue = callMethod(klass, "append", argTypes, term62811, args);
        assertTrue(recursiveEquals(term62811, term117771));
        assertTrue(recursiveEquals(retValue, term117751));
    }

};


