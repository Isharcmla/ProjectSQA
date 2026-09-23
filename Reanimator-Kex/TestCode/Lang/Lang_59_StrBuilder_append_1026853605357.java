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

public class StrBuilder_append_1026853605357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155983;
     Object term196851;
     Object term196847;

    public StrBuilder_append_1026853605357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155983 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term196851 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term196851, term196851.getClass(), "buffer", null);
        setIntField(term196851, term196851.getClass(), "size", 0);
        setField(term196851, term196851.getClass(), "newLine", null);
        setField(term196851, term196851.getClass(), "nullText", null);
        term196847 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term196847, term196847.getClass(), "buffer", null);
        setIntField(term196847, term196847.getClass(), "size", 0);
        setField(term196847, term196847.getClass(), "newLine", null);
        setField(term196847, term196847.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term155983, args);
        assertTrue(recursiveEquals(term155983, term196851));
        assertTrue(recursiveEquals(retValue, term196847));
    }

};


