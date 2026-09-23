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

public class StrBuilder_replaceFirst_393548213363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209984;
     Object term210096;
     Object term212716;
     Object term212717;
     Object term212703;

    public StrBuilder_replaceFirst_393548213363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209984 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term209984, term209984.getClass(), "size", 0);
        term210096 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$StringMatcher"));
        term212716 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term212716, term212716.getClass(), "buffer", null);
        setIntField(term212716, term212716.getClass(), "size", 0);
        setField(term212716, term212716.getClass(), "newLine", null);
        setField(term212716, term212716.getClass(), "nullText", null);
        term212717 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$StringMatcher"));
        setField(term212717, term212717.getClass(), "chars", null);
        term212703 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term212703, term212703.getClass(), "buffer", null);
        setIntField(term212703, term212703.getClass(), "size", 0);
        setField(term212703, term212703.getClass(), "newLine", null);
        setField(term212703, term212703.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term210096;
        args[1] = null;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term209984, args);
        assertTrue(recursiveEquals(term209984, term212716));
        assertTrue(recursiveEquals(term210096, term212717));
        assertTrue(recursiveEquals(retValue, term212703));
    }

};


