package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class LightweightMessageFormatter_format_41366379947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27511;
     Object term27589;
     Object term27772;
     Object term27773;

    public LightweightMessageFormatter_format_41366379947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27511 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term27511, term27511.getClass(), "source", null);
        term27589 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term27589, term27589.getClass(), "sourceName", null);
        term27772 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term27772, term27772.getClass(), "excerpt", null);
        setField(term27772, term27772.getClass(), "source", null);
        setBooleanField(term27772, term27772.getClass(), "colorize", false);
        term27773 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term27773, term27773.getClass(), "type", null);
        setField(term27773, term27773.getClass(), "description", null);
        setField(term27773, term27773.getClass(), "sourceName", null);
        setField(term27773, term27773.getClass(), "node", null);
        setIntField(term27773, term27773.getClass(), "lineNumber", 0);
        setField(term27773, term27773.getClass(), "level", null);
        setIntField(term27773, term27773.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term27589;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term27511, args);
        assertTrue(recursiveEquals(term27511, term27772));
        assertTrue(recursiveEquals(term27589, term27773));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


