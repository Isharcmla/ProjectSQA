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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_append_1027807909338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73343;
     Object term73246;
     Object term108993;
     Object term108994;
     Object term108990;

    public StrBuilder_append_1027807909338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73343 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term73246 = (char[]) newCharArray(0);
        term108993 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term108993, term108993.getClass(), "buffer", null);
        setIntField(term108993, term108993.getClass(), "size", 0);
        setField(term108993, term108993.getClass(), "newLine", null);
        setField(term108993, term108993.getClass(), "nullText", null);
        term108994 = (char[]) newCharArray(0);
        term108990 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term108990, term108990.getClass(), "buffer", null);
        setIntField(term108990, term108990.getClass(), "size", 0);
        setField(term108990, term108990.getClass(), "newLine", null);
        setField(term108990, term108990.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term73246;
        Object retValue = callMethod(klass, "append", argTypes, term73343, args);
        assertTrue(recursiveEquals(term73343, term108993));
        assertTrue(recursiveEquals(term73246, term108994));
        assertTrue(recursiveEquals(retValue, term108990));
    }

};


