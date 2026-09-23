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

public class StrBuilder_setNullText_70591154291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47935;
     Object term88294;
     Object term88292;

    public StrBuilder_setNullText_70591154291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47935 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term88294 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term88294, term88294.getClass(), "buffer", null);
        setIntField(term88294, term88294.getClass(), "size", 0);
        setField(term88294, term88294.getClass(), "newLine", null);
        setField(term88294, term88294.getClass(), "nullText", null);
        term88292 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term88292, term88292.getClass(), "buffer", null);
        setIntField(term88292, term88292.getClass(), "size", 0);
        setField(term88292, term88292.getClass(), "newLine", null);
        setField(term88292, term88292.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setNullText", argTypes, term47935, args);
        assertTrue(recursiveEquals(term47935, term88294));
        assertTrue(recursiveEquals(retValue, term88292));
    }

};


