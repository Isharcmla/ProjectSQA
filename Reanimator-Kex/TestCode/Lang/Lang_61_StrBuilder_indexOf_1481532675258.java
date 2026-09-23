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

public class StrBuilder_indexOf_1481532675258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10522;
     Object term79276;

    public StrBuilder_indexOf_1481532675258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10522 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10523 = (char[]) newCharArray(32);
        setField(term10522, term10522.getClass(), "buffer", term10523);
        setIntField(term10522, term10522.getClass(), "size", 1598895173);
        setField(term10522, term10522.getClass(), "newLine", "nhoHrZfnIN");
        setField(term10522, term10522.getClass(), "nullText", "ZkMALXpEAZ");
        term79276 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term79277 = (char[]) newCharArray(32);
        setField(term79276, term79276.getClass(), "buffer", term79277);
        setIntField(term79276, term79276.getClass(), "size", 1598895173);
        setField(term79276, term79276.getClass(), "newLine", "nhoHrZfnIN");
        setField(term79276, term79276.getClass(), "nullText", "ZkMALXpEAZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tXfQjSqDzN";
        Object retValue = callMethod(klass, "indexOf", argTypes, term10522, args);
        assertTrue(recursiveEquals(term10522, term79276));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


