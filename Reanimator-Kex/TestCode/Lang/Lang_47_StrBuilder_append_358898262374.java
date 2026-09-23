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

public class StrBuilder_append_358898262374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59254;
     Object term110696;
     Object term110694;

    public StrBuilder_append_358898262374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59254 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term110696 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110696, term110696.getClass(), "buffer", null);
        setIntField(term110696, term110696.getClass(), "size", 0);
        setField(term110696, term110696.getClass(), "newLine", null);
        setField(term110696, term110696.getClass(), "nullText", null);
        term110694 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110694, term110694.getClass(), "buffer", null);
        setIntField(term110694, term110694.getClass(), "size", 0);
        setField(term110694, term110694.getClass(), "newLine", null);
        setField(term110694, term110694.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term59254, args);
        assertTrue(recursiveEquals(term59254, term110696));
        assertTrue(recursiveEquals(retValue, term110694));
    }

};


