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

public class StrBuilder_append_957951608139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2442;
     Object term2501;

    public StrBuilder_append_957951608139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2442 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2443 = (char[]) newCharArray(32);
        setField(term2442, term2442.getClass(), "buffer", term2443);
        setIntField(term2442, term2442.getClass(), "size", -73683645);
        setField(term2442, term2442.getClass(), "newLine", "GzFkzHGYFt");
        setField(term2442, term2442.getClass(), "nullText", "tShwQLRGNe");
        term2501 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2501;
        try {
            callMethod(klass, "append", argTypes, term2442, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


