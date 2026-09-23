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
import java.lang.Character;

public class StrBuilder_contains_376347752254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9937;
     Object term9996;
     Object term80404;

    public StrBuilder_contains_376347752254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9937 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9938 = (char[]) newCharArray(32);
        setField(term9937, term9937.getClass(), "buffer", term9938);
        setIntField(term9937, term9937.getClass(), "size", -430151637);
        setField(term9937, term9937.getClass(), "newLine", "lFRJFUMVbx");
        setField(term9937, term9937.getClass(), "nullText", "sZdUNdggUW");
        term9996 = new Character('F');
        term80404 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term80405 = (char[]) newCharArray(32);
        setField(term80404, term80404.getClass(), "buffer", term80405);
        setIntField(term80404, term80404.getClass(), "size", -430151637);
        setField(term80404, term80404.getClass(), "newLine", "lFRJFUMVbx");
        setField(term80404, term80404.getClass(), "nullText", "sZdUNdggUW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term9996;
        Object retValue = callMethod(klass, "contains", argTypes, term9937, args);
        assertTrue(recursiveEquals(term9937, term80404));
        assertTrue(recursiveEquals(term9996, 'F'));
        assertTrue(recursiveEquals(retValue, false));
    }

};


