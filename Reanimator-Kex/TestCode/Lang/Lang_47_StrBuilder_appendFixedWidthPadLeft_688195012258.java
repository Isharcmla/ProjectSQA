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

public class StrBuilder_appendFixedWidthPadLeft_688195012258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7739;
     Object term7798;
     Object term7799;
     Object term7801;

    public StrBuilder_appendFixedWidthPadLeft_688195012258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7739 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7740 = (char[]) newCharArray(32);
        setField(term7739, term7739.getClass(), "buffer", term7740);
        setIntField(term7739, term7739.getClass(), "size", 683666002);
        setField(term7739, term7739.getClass(), "newLine", "FPvxVzzSvD");
        setField(term7739, term7739.getClass(), "nullText", "WHcwFgsGFC");
        term7798 = newInstance(Class.forName("java.lang.Object"));
        term7799 = new Integer(1596213415);
        term7801 = new Character('z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term7798;
        args[1] = term7799;
        args[2] = term7801;
        try {
            callMethod(klass, "appendFixedWidthPadLeft", argTypes, term7739, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


