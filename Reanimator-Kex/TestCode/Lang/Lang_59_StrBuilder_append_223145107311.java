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

public class StrBuilder_append_223145107311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55796;
     Object term98047;
     Object term98048;
     Object term98031;

    public StrBuilder_append_223145107311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55796 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term98047 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term98047, term98047.getClass(), "buffer", null);
        setIntField(term98047, term98047.getClass(), "size", 0);
        setField(term98047, term98047.getClass(), "newLine", null);
        setField(term98047, term98047.getClass(), "nullText", null);
        term98048 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term98048, term98048.getClass(), "buffer", null);
        setIntField(term98048, term98048.getClass(), "size", 0);
        setField(term98048, term98048.getClass(), "newLine", null);
        setField(term98048, term98048.getClass(), "nullText", null);
        term98031 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term98031, term98031.getClass(), "buffer", null);
        setIntField(term98031, term98031.getClass(), "size", 0);
        setField(term98031, term98031.getClass(), "newLine", null);
        setField(term98031, term98031.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term55796;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term55796, args);
        assertTrue(recursiveEquals(term55796, term98047));
        assertTrue(recursiveEquals(term55796, term98048));
        assertTrue(recursiveEquals(retValue, term98031));
    }

};


