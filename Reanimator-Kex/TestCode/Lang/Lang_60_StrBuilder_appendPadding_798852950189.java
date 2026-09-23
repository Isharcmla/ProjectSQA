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

public class StrBuilder_appendPadding_798852950189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4804;
     Object term4863;
     Object term4865;

    public StrBuilder_appendPadding_798852950189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4804 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4805 = (char[]) newCharArray(32);
        setField(term4804, term4804.getClass(), "buffer", term4805);
        setIntField(term4804, term4804.getClass(), "size", -2095575670);
        setField(term4804, term4804.getClass(), "newLine", "xOcJIiQQDu");
        setField(term4804, term4804.getClass(), "nullText", "GVizqqzXpy");
        term4863 = new Integer(1225272962);
        term4865 = new Character('r');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term4863;
        args[1] = term4865;
        try {
            callMethod(klass, "appendPadding", argTypes, term4804, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


