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

public class StrBuilder_setLength_1724723337280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38215;
     Object term84790;
     Object term84787;

    public StrBuilder_setLength_1724723337280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38215 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term84790 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term84790, term84790.getClass(), "buffer", null);
        setIntField(term84790, term84790.getClass(), "size", 0);
        setField(term84790, term84790.getClass(), "newLine", null);
        setField(term84790, term84790.getClass(), "nullText", null);
        term84787 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term84787, term84787.getClass(), "buffer", null);
        setIntField(term84787, term84787.getClass(), "size", 0);
        setField(term84787, term84787.getClass(), "newLine", null);
        setField(term84787, term84787.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "setLength", argTypes, term38215, args);
        assertTrue(recursiveEquals(term38215, term84790));
        assertTrue(recursiveEquals(retValue, term84787));
    }

};


