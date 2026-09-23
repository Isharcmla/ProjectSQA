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

public class StrBuilder_append_1549411629321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57189;
     Object term96429;
     Object term96427;

    public StrBuilder_append_1549411629321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57189 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term96429 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term96429, term96429.getClass(), "buffer", null);
        setIntField(term96429, term96429.getClass(), "size", 0);
        setField(term96429, term96429.getClass(), "newLine", null);
        setField(term96429, term96429.getClass(), "nullText", null);
        term96427 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term96427, term96427.getClass(), "buffer", null);
        setIntField(term96427, term96427.getClass(), "size", 0);
        setField(term96427, term96427.getClass(), "newLine", null);
        setField(term96427, term96427.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term57189, args);
        assertTrue(recursiveEquals(term57189, term96429));
        assertTrue(recursiveEquals(retValue, term96427));
    }

};


