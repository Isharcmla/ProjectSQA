package org.apache.commons.lang3;

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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Character;

public class ArrayUtils_add_437554205321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1686;
     Object term1693;
     Object term1695;

    public ArrayUtils_add_437554205321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1686 = (char[]) newCharArray(6);
        setCharElement(term1686, 0, 'F');
        setCharElement(term1686, 1, 'I');
        setCharElement(term1686, 2, 's');
        setCharElement(term1686, 3, 'Y');
        setCharElement(term1686, 4, 'G');
        setCharElement(term1686, 5, 'g');
        term1693 = new Integer(-341962980);
        term1695 = new Character('n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term1686;
        args[1] = term1693;
        args[2] = term1695;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


