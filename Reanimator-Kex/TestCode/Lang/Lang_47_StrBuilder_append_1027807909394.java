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

public class StrBuilder_append_1027807909394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69736;
     Object term116867;
     Object term116865;

    public StrBuilder_append_1027807909394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69736 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term116867 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term116867, term116867.getClass(), "buffer", null);
        setIntField(term116867, term116867.getClass(), "size", 0);
        setField(term116867, term116867.getClass(), "newLine", null);
        setField(term116867, term116867.getClass(), "nullText", null);
        term116865 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term116865, term116865.getClass(), "buffer", null);
        setIntField(term116865, term116865.getClass(), "size", 0);
        setField(term116865, term116865.getClass(), "newLine", null);
        setField(term116865, term116865.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term69736, args);
        assertTrue(recursiveEquals(term69736, term116867));
        assertTrue(recursiveEquals(retValue, term116865));
    }

};


