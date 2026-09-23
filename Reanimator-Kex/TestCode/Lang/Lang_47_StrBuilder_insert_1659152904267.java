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

public class StrBuilder_insert_1659152904267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8454;
     Object term8513;
     Object term8515;

    public StrBuilder_insert_1659152904267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8454 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8455 = (char[]) newCharArray(32);
        setField(term8454, term8454.getClass(), "buffer", term8455);
        setIntField(term8454, term8454.getClass(), "size", -893623680);
        setField(term8454, term8454.getClass(), "newLine", "VeDtgDzGAN");
        setField(term8454, term8454.getClass(), "nullText", "aWYOWZFyaX");
        term8513 = new Integer(-1963434938);
        term8515 = (char[]) newCharArray(7);
        setCharElement(term8515, 0, 'l');
        setCharElement(term8515, 1, 'P');
        setCharElement(term8515, 2, 'w');
        setCharElement(term8515, 3, 'D');
        setCharElement(term8515, 4, 'Y');
        setCharElement(term8515, 5, 'F');
        setCharElement(term8515, 6, 's');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term8513;
        args[1] = term8515;
        try {
            callMethod(klass, "insert", argTypes, term8454, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


