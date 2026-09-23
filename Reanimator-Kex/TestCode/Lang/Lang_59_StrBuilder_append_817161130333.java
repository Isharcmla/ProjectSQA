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

public class StrBuilder_append_817161130333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67521;
     Object term105369;
     Object term105349;

    public StrBuilder_append_817161130333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67521 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term67409 = (char[]) newCharArray(0);
        setIntField(term67521, term67521.getClass(), "size", 0);
        setField(term67521, term67521.getClass(), "buffer", term67409);
        term105369 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term105370 = (char[]) newCharArray(3);
        setCharElement(term105370, 0, (char) 48);
        setCharElement(term105370, 1, (char) 46);
        setCharElement(term105370, 2, (char) 48);
        setField(term105369, term105369.getClass(), "buffer", term105370);
        setIntField(term105369, term105369.getClass(), "size", 3);
        setField(term105369, term105369.getClass(), "newLine", null);
        setField(term105369, term105369.getClass(), "nullText", null);
        term105349 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term105350 = (char[]) newCharArray(3);
        setCharElement(term105350, 0, (char) 48);
        setCharElement(term105350, 1, (char) 46);
        setCharElement(term105350, 2, (char) 48);
        setField(term105349, term105349.getClass(), "buffer", term105350);
        setIntField(term105349, term105349.getClass(), "size", 3);
        setField(term105349, term105349.getClass(), "newLine", null);
        setField(term105349, term105349.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "append", argTypes, term67521, args);
        assertTrue(recursiveEquals(term67521, term105369));
        assertTrue(recursiveEquals(retValue, term105349));
    }

};


