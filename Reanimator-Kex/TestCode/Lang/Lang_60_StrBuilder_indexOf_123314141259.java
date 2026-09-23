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

public class StrBuilder_indexOf_123314141259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10790;
     Object term80731;

    public StrBuilder_indexOf_123314141259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10790 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10791 = (char[]) newCharArray(32);
        setField(term10790, term10790.getClass(), "buffer", term10791);
        setIntField(term10790, term10790.getClass(), "size", 11724947);
        setField(term10790, term10790.getClass(), "newLine", "AZdLeSugwv");
        setField(term10790, term10790.getClass(), "nullText", "RMsXuyzKJV");
        term80731 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term80732 = (char[]) newCharArray(32);
        setField(term80731, term80731.getClass(), "buffer", term80732);
        setIntField(term80731, term80731.getClass(), "size", 11724947);
        setField(term80731, term80731.getClass(), "newLine", "AZdLeSugwv");
        setField(term80731, term80731.getClass(), "nullText", "RMsXuyzKJV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "indexOf", argTypes, term10790, args);
        assertTrue(recursiveEquals(term10790, term80731));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


