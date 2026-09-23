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

public class StrBuilder_length_1414795037139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513;
     Object term37212;

    public StrBuilder_length_1414795037139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term513 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term514 = (char[]) newCharArray(32);
        setField(term513, term513.getClass(), "buffer", term514);
        setIntField(term513, term513.getClass(), "size", -616727354);
        setField(term513, term513.getClass(), "newLine", "uuaPigETmJ");
        setField(term513, term513.getClass(), "nullText", "MxlszYVzRf");
        term37212 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term37213 = (char[]) newCharArray(32);
        setField(term37212, term37212.getClass(), "buffer", term37213);
        setIntField(term37212, term37212.getClass(), "size", -616727354);
        setField(term37212, term37212.getClass(), "newLine", "uuaPigETmJ");
        setField(term37212, term37212.getClass(), "nullText", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "length", argTypes, term513, args);
        assertTrue(recursiveEquals(term513, term37212));
        assertTrue(recursiveEquals(retValue, -616727354));
    }

};


