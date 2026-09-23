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

public class StrBuilder_indexOf_1329248800400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265591;
     Object term273840;

    public StrBuilder_indexOf_1329248800400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265591 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term273840 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term273840, term273840.getClass(), "buffer", null);
        setIntField(term273840, term273840.getClass(), "size", 0);
        setField(term273840, term273840.getClass(), "newLine", null);
        setField(term273840, term273840.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = (char) 0;
        args[1] = -1;
        Object retValue = callMethod(klass, "indexOf", argTypes, term265591, args);
        assertTrue(recursiveEquals(term265591, term273840));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


