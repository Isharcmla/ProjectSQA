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

public class StrBuilder_leftString_1426637078249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9596;
     Object term9655;

    public StrBuilder_leftString_1426637078249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9596 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9597 = (char[]) newCharArray(32);
        setField(term9596, term9596.getClass(), "buffer", term9597);
        setIntField(term9596, term9596.getClass(), "size", -1565502840);
        setField(term9596, term9596.getClass(), "newLine", "RbVQXSpxXy");
        setField(term9596, term9596.getClass(), "nullText", "YpJbIgJWWv");
        term9655 = new Integer(344323424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9655;
        try {
            callMethod(klass, "leftString", argTypes, term9596, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


