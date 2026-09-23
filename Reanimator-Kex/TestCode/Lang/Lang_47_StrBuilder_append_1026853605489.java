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

public class StrBuilder_append_1026853605489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285319;
     Object term284218;
     Object term316624;
     Object term316625;
     Object term315619;

    public StrBuilder_append_1026853605489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285319 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term284218 = (char[]) newCharArray(1000);
        term316624 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term316624, term316624.getClass(), "buffer", null);
        setIntField(term316624, term316624.getClass(), "size", 0);
        setField(term316624, term316624.getClass(), "newLine", null);
        setField(term316624, term316624.getClass(), "nullText", null);
        term316625 = (char[]) newCharArray(1000);
        term315619 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term315619, term315619.getClass(), "buffer", null);
        setIntField(term315619, term315619.getClass(), "size", 0);
        setField(term315619, term315619.getClass(), "newLine", null);
        setField(term315619, term315619.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term284218;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term285319, args);
        assertTrue(recursiveEquals(term285319, term316624));
        assertTrue(recursiveEquals(term284218, term316625));
        assertTrue(recursiveEquals(retValue, term315619));
    }

};


