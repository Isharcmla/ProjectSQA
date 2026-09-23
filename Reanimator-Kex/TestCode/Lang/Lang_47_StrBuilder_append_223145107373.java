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

public class StrBuilder_append_223145107373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59163;
     Object term110688;
     Object term110689;
     Object term110679;

    public StrBuilder_append_223145107373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59163 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term110688 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110688, term110688.getClass(), "buffer", null);
        setIntField(term110688, term110688.getClass(), "size", 0);
        setField(term110688, term110688.getClass(), "newLine", null);
        setField(term110688, term110688.getClass(), "nullText", null);
        term110689 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110689, term110689.getClass(), "buffer", null);
        setIntField(term110689, term110689.getClass(), "size", 0);
        setField(term110689, term110689.getClass(), "newLine", null);
        setField(term110689, term110689.getClass(), "nullText", null);
        term110679 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110679, term110679.getClass(), "buffer", null);
        setIntField(term110679, term110679.getClass(), "size", 0);
        setField(term110679, term110679.getClass(), "newLine", null);
        setField(term110679, term110679.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term59163;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term59163, args);
        assertTrue(recursiveEquals(term59163, term110688));
        assertTrue(recursiveEquals(term59163, term110689));
        assertTrue(recursiveEquals(retValue, term110679));
    }

};


