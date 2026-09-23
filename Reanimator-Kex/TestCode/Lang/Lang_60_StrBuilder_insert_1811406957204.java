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

public class StrBuilder_insert_1811406957204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5499;
     Object term5558;

    public StrBuilder_insert_1811406957204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5499 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5500 = (char[]) newCharArray(32);
        setField(term5499, term5499.getClass(), "buffer", term5500);
        setIntField(term5499, term5499.getClass(), "size", 1063420942);
        setField(term5499, term5499.getClass(), "newLine", "vjxIhXHxGR");
        setField(term5499, term5499.getClass(), "nullText", "QXzGXbEXMu");
        term5558 = new Integer(1375330971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term5558;
        args[1] = "qxSDVejjiY";
        try {
            callMethod(klass, "insert", argTypes, term5499, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


