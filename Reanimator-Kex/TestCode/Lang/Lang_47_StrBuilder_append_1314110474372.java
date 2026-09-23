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

public class StrBuilder_append_1314110474372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58534;
     Object term110665;
     Object term110661;

    public StrBuilder_append_1314110474372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58534 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term110665 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110665, term110665.getClass(), "buffer", null);
        setIntField(term110665, term110665.getClass(), "size", 0);
        setField(term110665, term110665.getClass(), "newLine", null);
        setField(term110665, term110665.getClass(), "nullText", null);
        term110661 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110661, term110661.getClass(), "buffer", null);
        setIntField(term110661, term110661.getClass(), "size", 0);
        setField(term110661, term110661.getClass(), "newLine", null);
        setField(term110661, term110661.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term58534, args);
        assertTrue(recursiveEquals(term58534, term110665));
        assertTrue(recursiveEquals(retValue, term110661));
    }

};


