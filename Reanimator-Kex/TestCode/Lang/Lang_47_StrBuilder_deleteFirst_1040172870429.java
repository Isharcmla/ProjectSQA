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

public class StrBuilder_deleteFirst_1040172870429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129897;
     Object term133653;
     Object term133621;

    public StrBuilder_deleteFirst_1040172870429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129897 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term129397 = (char[]) newCharArray(28);
        setIntField(term129897, term129897.getClass(), "size", 11);
        setField(term129897, term129897.getClass(), "buffer", term129397);
        term133653 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term133654 = (char[]) newCharArray(28);
        setField(term133653, term133653.getClass(), "buffer", term133654);
        setIntField(term133653, term133653.getClass(), "size", 11);
        setField(term133653, term133653.getClass(), "newLine", null);
        setField(term133653, term133653.getClass(), "nullText", null);
        term133621 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term133622 = (char[]) newCharArray(28);
        setField(term133621, term133621.getClass(), "buffer", term133622);
        setIntField(term133621, term133621.getClass(), "size", 11);
        setField(term133621, term133621.getClass(), "newLine", null);
        setField(term133621, term133621.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 65535;
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term129897, args);
        assertTrue(recursiveEquals(term129897, term133653));
        assertTrue(recursiveEquals(retValue, term133621));
    }

};


