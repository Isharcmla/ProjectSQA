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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_getChars_1254328736153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1972;
     Object term2031;

    public StrBuilder_getChars_1254328736153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1972 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1973 = (char[]) newCharArray(32);
        setField(term1972, term1972.getClass(), "buffer", term1973);
        setIntField(term1972, term1972.getClass(), "size", 1135664017);
        setField(term1972, term1972.getClass(), "newLine", "IDCWpPLRkE");
        setField(term1972, term1972.getClass(), "nullText", "nyiiPDVjAc");
        term2031 = (char[]) newCharArray(5);
        setCharElement(term2031, 0, 'A');
        setCharElement(term2031, 1, 'E');
        setCharElement(term2031, 2, 'B');
        setCharElement(term2031, 3, 't');
        setCharElement(term2031, 4, 'n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2031;
        try {
            callMethod(klass, "getChars", argTypes, term1972, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


