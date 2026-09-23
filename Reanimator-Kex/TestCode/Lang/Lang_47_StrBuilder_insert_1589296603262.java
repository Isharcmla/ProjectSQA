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

public class StrBuilder_insert_1589296603262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8205;
     Object term8264;
     Object term8266;

    public StrBuilder_insert_1589296603262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8205 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8206 = (char[]) newCharArray(32);
        setField(term8205, term8205.getClass(), "buffer", term8206);
        setIntField(term8205, term8205.getClass(), "size", -1801760683);
        setField(term8205, term8205.getClass(), "newLine", "aNWLJdrZMq");
        setField(term8205, term8205.getClass(), "nullText", "HHmNoYxIGj");
        term8264 = new Integer(1141317871);
        term8266 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term8264;
        args[1] = term8266;
        try {
            callMethod(klass, "insert", argTypes, term8205, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


