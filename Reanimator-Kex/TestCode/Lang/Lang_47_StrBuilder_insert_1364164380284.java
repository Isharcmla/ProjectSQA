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
import java.lang.Float;

public class StrBuilder_insert_1364164380284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9162;
     Object term9221;
     Object term9223;

    public StrBuilder_insert_1364164380284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9162 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9163 = (char[]) newCharArray(32);
        setField(term9162, term9162.getClass(), "buffer", term9163);
        setIntField(term9162, term9162.getClass(), "size", 538259104);
        setField(term9162, term9162.getClass(), "newLine", "zUlRdimJtU");
        setField(term9162, term9162.getClass(), "nullText", "vwbEQQNQrx");
        term9221 = new Integer(96566506);
        term9223 = new Float(0.3455959F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term9221;
        args[1] = term9223;
        try {
            callMethod(klass, "insert", argTypes, term9162, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


