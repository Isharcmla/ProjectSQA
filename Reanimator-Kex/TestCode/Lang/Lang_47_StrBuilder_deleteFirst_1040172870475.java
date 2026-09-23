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

public class StrBuilder_deleteFirst_1040172870475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266484;
     Object term269371;
     Object term269358;

    public StrBuilder_deleteFirst_1040172870475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266484 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term266303 = (char[]) newCharArray(6);
        setIntField(term266484, term266484.getClass(), "size", 6);
        setCharElement(term266303, 0, (char) 16384);
        setCharElement(term266303, 1, (char) 16384);
        setCharElement(term266303, 2, (char) 16384);
        setCharElement(term266303, 3, (char) 16384);
        setCharElement(term266303, 4, (char) 16384);
        setCharElement(term266303, 5, (char) 49151);
        setField(term266484, term266484.getClass(), "buffer", term266303);
        term269371 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term269372 = (char[]) newCharArray(6);
        setCharElement(term269372, 0, (char) 16384);
        setCharElement(term269372, 1, (char) 16384);
        setCharElement(term269372, 2, (char) 16384);
        setCharElement(term269372, 3, (char) 16384);
        setCharElement(term269372, 4, (char) 16384);
        setCharElement(term269372, 5, (char) 49151);
        setField(term269371, term269371.getClass(), "buffer", term269372);
        setIntField(term269371, term269371.getClass(), "size", 5);
        setField(term269371, term269371.getClass(), "newLine", null);
        setField(term269371, term269371.getClass(), "nullText", null);
        term269358 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term269359 = (char[]) newCharArray(6);
        setCharElement(term269359, 0, (char) 16384);
        setCharElement(term269359, 1, (char) 16384);
        setCharElement(term269359, 2, (char) 16384);
        setCharElement(term269359, 3, (char) 16384);
        setCharElement(term269359, 4, (char) 16384);
        setCharElement(term269359, 5, (char) 49151);
        setField(term269358, term269358.getClass(), "buffer", term269359);
        setIntField(term269358, term269358.getClass(), "size", 5);
        setField(term269358, term269358.getClass(), "newLine", null);
        setField(term269358, term269358.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 49151;
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term266484, args);
        assertTrue(recursiveEquals(term266484, term269371));
        assertTrue(recursiveEquals(retValue, term269358));
    }

};


