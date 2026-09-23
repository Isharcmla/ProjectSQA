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

public class StrBuilder_midString_1439883029251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9822;
     Object term9881;
     Object term9883;

    public StrBuilder_midString_1439883029251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9822 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9823 = (char[]) newCharArray(32);
        setField(term9822, term9822.getClass(), "buffer", term9823);
        setIntField(term9822, term9822.getClass(), "size", 1555897383);
        setField(term9822, term9822.getClass(), "newLine", "kNqaJKIATy");
        setField(term9822, term9822.getClass(), "nullText", "vKQukfbJUd");
        term9881 = new Integer(202001407);
        term9883 = new Integer(158873461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9881;
        args[1] = term9883;
        try {
            callMethod(klass, "midString", argTypes, term9822, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


