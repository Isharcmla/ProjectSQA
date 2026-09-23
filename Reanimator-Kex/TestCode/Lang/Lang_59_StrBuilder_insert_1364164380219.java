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

public class StrBuilder_insert_1364164380219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6342;
     Object term6401;
     Object term6403;

    public StrBuilder_insert_1364164380219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6342 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6343 = (char[]) newCharArray(32);
        setField(term6342, term6342.getClass(), "buffer", term6343);
        setIntField(term6342, term6342.getClass(), "size", 941650513);
        setField(term6342, term6342.getClass(), "newLine", "pORebkoRdD");
        setField(term6342, term6342.getClass(), "nullText", "mXGCWJDOqA");
        term6401 = new Integer(444029505);
        term6403 = new Float(0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term6401;
        args[1] = term6403;
        try {
            callMethod(klass, "insert", argTypes, term6342, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


