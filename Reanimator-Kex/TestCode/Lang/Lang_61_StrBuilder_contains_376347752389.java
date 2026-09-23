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

public class StrBuilder_contains_376347752389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236574;
     Object term239860;

    public StrBuilder_contains_376347752389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236574 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term236300 = (char[]) newCharArray(31);
        setCharElement(term236300, 18, (char) 65535);
        setField(term236574, term236574.getClass(), "buffer", term236300);
        term239860 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term239861 = (char[]) newCharArray(31);
        setCharElement(term239861, 18, (char) 65535);
        setField(term239860, term239860.getClass(), "buffer", term239861);
        setIntField(term239860, term239860.getClass(), "size", 0);
        setField(term239860, term239860.getClass(), "newLine", null);
        setField(term239860, term239860.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 65535;
        Object retValue = callMethod(klass, "contains", argTypes, term236574, args);
        assertTrue(recursiveEquals(term236574, term239860));
        assertTrue(recursiveEquals(retValue, true));
    }

};


