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

public class StrBuilder_append_1549411629311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54620;
     Object term97906;
     Object term97907;
     Object term97903;

    public StrBuilder_append_1549411629311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54620 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term54620, term54620.getClass(), "size", 0);
        term97906 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term97906, term97906.getClass(), "buffer", null);
        setIntField(term97906, term97906.getClass(), "size", 0);
        setField(term97906, term97906.getClass(), "newLine", null);
        setField(term97906, term97906.getClass(), "nullText", null);
        term97907 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term97907, term97907.getClass(), "buffer", null);
        setIntField(term97907, term97907.getClass(), "size", 0);
        setField(term97907, term97907.getClass(), "newLine", null);
        setField(term97907, term97907.getClass(), "nullText", null);
        term97903 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term97903, term97903.getClass(), "buffer", null);
        setIntField(term97903, term97903.getClass(), "size", 0);
        setField(term97903, term97903.getClass(), "newLine", null);
        setField(term97903, term97903.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term54620;
        Object retValue = callMethod(klass, "append", argTypes, term54620, args);
        assertTrue(recursiveEquals(term54620, term97906));
        assertTrue(recursiveEquals(term54620, term97907));
        assertTrue(recursiveEquals(retValue, term97903));
    }

};


