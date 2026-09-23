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
import java.lang.Integer;
import java.lang.Character;

public class StrBuilder_appendFixedWidthPadRight_538892822261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8088;
     Object term8147;
     Object term8149;
     Object term8151;

    public StrBuilder_appendFixedWidthPadRight_538892822261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8088 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8089 = (char[]) newCharArray(32);
        setField(term8088, term8088.getClass(), "buffer", term8089);
        setIntField(term8088, term8088.getClass(), "size", -1476117762);
        setField(term8088, term8088.getClass(), "newLine", "VYkqXKVlAJ");
        setField(term8088, term8088.getClass(), "nullText", "XkIoWJRNwN");
        term8147 = new Integer(-341962980);
        term8149 = new Integer(1532716628);
        term8151 = new Character('t');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term8147;
        args[1] = term8149;
        args[2] = term8151;
        try {
            callMethod(klass, "appendFixedWidthPadRight", argTypes, term8088, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


