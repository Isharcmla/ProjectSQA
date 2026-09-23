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

public class StrBuilder_deleteFirst_1040172870444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142889;
     Object term159672;
     Object term159661;

    public StrBuilder_deleteFirst_1040172870444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142889 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term142684 = (char[]) newCharArray(7);
        setIntField(term142889, term142889.getClass(), "size", 7);
        setField(term142889, term142889.getClass(), "buffer", term142684);
        term159672 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term159673 = (char[]) newCharArray(7);
        setField(term159672, term159672.getClass(), "buffer", term159673);
        setIntField(term159672, term159672.getClass(), "size", 7);
        setField(term159672, term159672.getClass(), "newLine", null);
        setField(term159672, term159672.getClass(), "nullText", null);
        term159661 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term159662 = (char[]) newCharArray(7);
        setField(term159661, term159661.getClass(), "buffer", term159662);
        setIntField(term159661, term159661.getClass(), "size", 7);
        setField(term159661, term159661.getClass(), "newLine", null);
        setField(term159661, term159661.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 65535;
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term142889, args);
        assertTrue(recursiveEquals(term142889, term159672));
        assertTrue(recursiveEquals(retValue, term159661));
    }

};


