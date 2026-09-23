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

public class StrBuilder_contains_376347752373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318413;
     Object term340174;

    public StrBuilder_contains_376347752373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318413 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term318258 = (char[]) newCharArray(7);
        setCharElement(term318258, 0, (char) 8192);
        setCharElement(term318258, 1, (char) 8192);
        setCharElement(term318258, 2, (char) 8192);
        setCharElement(term318258, 3, (char) 8192);
        setCharElement(term318258, 4, (char) 8192);
        setCharElement(term318258, 5, (char) 8192);
        setCharElement(term318258, 6, (char) 57343);
        setField(term318413, term318413.getClass(), "buffer", term318258);
        term340174 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term340175 = (char[]) newCharArray(7);
        setCharElement(term340175, 0, (char) 8192);
        setCharElement(term340175, 1, (char) 8192);
        setCharElement(term340175, 2, (char) 8192);
        setCharElement(term340175, 3, (char) 8192);
        setCharElement(term340175, 4, (char) 8192);
        setCharElement(term340175, 5, (char) 8192);
        setCharElement(term340175, 6, (char) 57343);
        setField(term340174, term340174.getClass(), "buffer", term340175);
        setIntField(term340174, term340174.getClass(), "size", 0);
        setField(term340174, term340174.getClass(), "newLine", null);
        setField(term340174, term340174.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 57343;
        Object retValue = callMethod(klass, "contains", argTypes, term318413, args);
        assertTrue(recursiveEquals(term318413, term340174));
        assertTrue(recursiveEquals(retValue, true));
    }

};


