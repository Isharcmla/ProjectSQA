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

public class StrBuilder_getNewLineText_1248151975113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term33509;

    public StrBuilder_getNewLineText_1248151975113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term26 = (char[]) newCharArray(32);
        setField(term25, term25.getClass(), "buffer", term26);
        setIntField(term25, term25.getClass(), "size", 1162663216);
        setField(term25, term25.getClass(), "newLine", "sjlJAEtRrb");
        setField(term25, term25.getClass(), "nullText", "MuLcgQHgqz");
        term33509 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term33510 = (char[]) newCharArray(32);
        setField(term33509, term33509.getClass(), "buffer", term33510);
        setIntField(term33509, term33509.getClass(), "size", 1162663216);
        setField(term33509, term33509.getClass(), "newLine", "sjlJAEtRrb");
        setField(term33509, term33509.getClass(), "nullText", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNewLineText", argTypes, term25, args);
        assertTrue(recursiveEquals(term25, term33509));
        assertTrue(recursiveEquals(retValue, "sjlJAEtRrb"));
    }

};


