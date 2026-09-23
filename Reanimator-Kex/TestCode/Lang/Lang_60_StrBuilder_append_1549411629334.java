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

public class StrBuilder_append_1549411629334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64551;
     Object term149018;
     Object term149016;

    public StrBuilder_append_1549411629334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64551 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term149018 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term149018, term149018.getClass(), "buffer", null);
        setIntField(term149018, term149018.getClass(), "size", 0);
        setField(term149018, term149018.getClass(), "newLine", null);
        setField(term149018, term149018.getClass(), "nullText", null);
        term149016 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term149016, term149016.getClass(), "buffer", null);
        setIntField(term149016, term149016.getClass(), "size", 0);
        setField(term149016, term149016.getClass(), "newLine", null);
        setField(term149016, term149016.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term64551, args);
        assertTrue(recursiveEquals(term64551, term149018));
        assertTrue(recursiveEquals(retValue, term149016));
    }

};


