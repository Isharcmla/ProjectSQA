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

public class StrBuilder_append_1026853605168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3732;
     Object term3791;
     Object term3796;
     Object term3798;

    public StrBuilder_append_1026853605168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3732 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term3733 = (char[]) newCharArray(32);
        setField(term3732, term3732.getClass(), "buffer", term3733);
        setIntField(term3732, term3732.getClass(), "size", 1632125673);
        setField(term3732, term3732.getClass(), "newLine", "bLPjGVBhlX");
        setField(term3732, term3732.getClass(), "nullText", "whBvTVIIlC");
        term3791 = (char[]) newCharArray(4);
        setCharElement(term3791, 0, 'J');
        setCharElement(term3791, 1, 'A');
        setCharElement(term3791, 2, 'E');
        setCharElement(term3791, 3, 't');
        term3796 = new Integer(454281060);
        term3798 = new Integer(-1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3791;
        args[1] = term3796;
        args[2] = term3798;
        try {
            callMethod(klass, "append", argTypes, term3732, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


