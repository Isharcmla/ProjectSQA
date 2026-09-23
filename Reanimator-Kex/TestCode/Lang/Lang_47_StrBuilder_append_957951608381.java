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

public class StrBuilder_append_957951608381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63135;
     Object term63019;
     Object term114821;
     Object term114823;
     Object term114777;

    public StrBuilder_append_957951608381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63135 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term63024 = (char[]) newCharArray(0);
        setIntField(term63135, term63135.getClass(), "size", 0);
        setField(term63135, term63135.getClass(), "buffer", term63024);
        term63019 = (byte[]) newByteArray(0);
        term114821 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term114822 = (char[]) newCharArray(11);
        setCharElement(term114822, 0, (char) 91);
        setCharElement(term114822, 1, 'B');
        setCharElement(term114822, 2, (char) 64);
        setCharElement(term114822, 3, (char) 51);
        setCharElement(term114822, 4, 'f');
        setCharElement(term114822, 5, 'f');
        setCharElement(term114822, 6, (char) 53);
        setCharElement(term114822, 7, (char) 52);
        setCharElement(term114822, 8, (char) 50);
        setCharElement(term114822, 9, 'a');
        setCharElement(term114822, 10, (char) 55);
        setField(term114821, term114821.getClass(), "buffer", term114822);
        setIntField(term114821, term114821.getClass(), "size", 11);
        setField(term114821, term114821.getClass(), "newLine", null);
        setField(term114821, term114821.getClass(), "nullText", null);
        term114823 = (byte[]) newByteArray(0);
        term114777 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term114778 = (char[]) newCharArray(11);
        setCharElement(term114778, 0, (char) 91);
        setCharElement(term114778, 1, 'B');
        setCharElement(term114778, 2, (char) 64);
        setCharElement(term114778, 3, (char) 51);
        setCharElement(term114778, 4, 'f');
        setCharElement(term114778, 5, 'f');
        setCharElement(term114778, 6, (char) 53);
        setCharElement(term114778, 7, (char) 52);
        setCharElement(term114778, 8, (char) 50);
        setCharElement(term114778, 9, 'a');
        setCharElement(term114778, 10, (char) 55);
        setField(term114777, term114777.getClass(), "buffer", term114778);
        setIntField(term114777, term114777.getClass(), "size", 11);
        setField(term114777, term114777.getClass(), "newLine", null);
        setField(term114777, term114777.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term63019;
        Object retValue = callMethod(klass, "append", argTypes, term63135, args);
        assertTrue(recursiveEquals(term63135, term114821));
        assertTrue(recursiveEquals(term63019, term114823));
        assertTrue(recursiveEquals(retValue, term114777));
    }

};


