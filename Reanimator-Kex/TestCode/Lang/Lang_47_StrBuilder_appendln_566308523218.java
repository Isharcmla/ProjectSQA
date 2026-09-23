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

public class StrBuilder_appendln_566308523218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5258;
     Object term5317;

    public StrBuilder_appendln_566308523218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5258 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5259 = (char[]) newCharArray(32);
        setField(term5258, term5258.getClass(), "buffer", term5259);
        setIntField(term5258, term5258.getClass(), "size", 962840079);
        setField(term5258, term5258.getClass(), "newLine", "JiVRgTZvKc");
        setField(term5258, term5258.getClass(), "nullText", "XPKmummaqg");
        term5317 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term5318 = (char[]) newCharArray(32);
        setField(term5317, term5317.getClass(), "buffer", term5318);
        setIntField(term5317, term5317.getClass(), "size", 1540719661);
        setField(term5317, term5317.getClass(), "newLine", "BKLfkLiZTH");
        setField(term5317, term5317.getClass(), "nullText", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term5317;
        try {
            callMethod(klass, "appendln", argTypes, term5258, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


