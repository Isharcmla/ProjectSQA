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

public class StrBuilder_append_223145107316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56962;
     Object term99024;
     Object term99020;

    public StrBuilder_append_223145107316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56962 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term99024 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term99024, term99024.getClass(), "buffer", null);
        setIntField(term99024, term99024.getClass(), "size", 0);
        setField(term99024, term99024.getClass(), "newLine", null);
        setField(term99024, term99024.getClass(), "nullText", null);
        term99020 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term99020, term99020.getClass(), "buffer", null);
        setIntField(term99020, term99020.getClass(), "size", 0);
        setField(term99020, term99020.getClass(), "newLine", null);
        setField(term99020, term99020.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term56962, args);
        assertTrue(recursiveEquals(term56962, term99024));
        assertTrue(recursiveEquals(retValue, term99020));
    }

};


