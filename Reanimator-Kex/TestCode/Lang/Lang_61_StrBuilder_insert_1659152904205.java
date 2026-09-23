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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_insert_1659152904205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5634;
     Object term5693;
     Object term5695;

    public StrBuilder_insert_1659152904205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5634 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5635 = (char[]) newCharArray(32);
        setField(term5634, term5634.getClass(), "buffer", term5635);
        setIntField(term5634, term5634.getClass(), "size", -478195677);
        setField(term5634, term5634.getClass(), "newLine", "xBsXSDjXYK");
        setField(term5634, term5634.getClass(), "nullText", "sEnIVFtZuQ");
        term5693 = new Integer(972867650);
        term5695 = (char[]) newCharArray(6);
        setCharElement(term5695, 0, 'c');
        setCharElement(term5695, 1, 'g');
        setCharElement(term5695, 2, 'Q');
        setCharElement(term5695, 3, 'H');
        setCharElement(term5695, 4, 'g');
        setCharElement(term5695, 5, 'q');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term5693;
        args[1] = term5695;
        try {
            callMethod(klass, "insert", argTypes, term5634, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


