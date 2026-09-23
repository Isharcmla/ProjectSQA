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

public class StrBuilder_insert_1589296603203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5385;
     Object term5444;
     Object term5446;

    public StrBuilder_insert_1589296603203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5385 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5386 = (char[]) newCharArray(32);
        setField(term5385, term5385.getClass(), "buffer", term5386);
        setIntField(term5385, term5385.getClass(), "size", 1551099402);
        setField(term5385, term5385.getClass(), "newLine", "sEccwbJKYE");
        setField(term5385, term5385.getClass(), "nullText", "AWRooQKkdW");
        term5444 = new Integer(-2027534003);
        term5446 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term5444;
        args[1] = term5446;
        try {
            callMethod(klass, "insert", argTypes, term5385, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


