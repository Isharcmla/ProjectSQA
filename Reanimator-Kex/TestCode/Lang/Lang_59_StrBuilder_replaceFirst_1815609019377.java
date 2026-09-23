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

public class StrBuilder_replaceFirst_1815609019377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246274;
     Object term273403;
     Object term273367;

    public StrBuilder_replaceFirst_1815609019377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246274 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term244980 = (char[]) newCharArray(31);
        setIntField(term246274, term246274.getClass(), "size", 30);
        setField(term246274, term246274.getClass(), "buffer", term244980);
        term273403 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term273404 = (char[]) newCharArray(31);
        setField(term273403, term273403.getClass(), "buffer", term273404);
        setIntField(term273403, term273403.getClass(), "size", 30);
        setField(term273403, term273403.getClass(), "newLine", null);
        setField(term273403, term273403.getClass(), "nullText", null);
        term273367 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term273368 = (char[]) newCharArray(31);
        setField(term273367, term273367.getClass(), "buffer", term273368);
        setIntField(term273367, term273367.getClass(), "size", 30);
        setField(term273367, term273367.getClass(), "newLine", null);
        setField(term273367, term273367.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term246274, args);
        assertTrue(recursiveEquals(term246274, term273403));
        assertTrue(recursiveEquals(retValue, term273367));
    }

};


