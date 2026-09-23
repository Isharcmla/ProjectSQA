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

public class StrBuilder_append_358898262308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51817;
     Object term91588;
     Object term91586;

    public StrBuilder_append_358898262308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51817 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term91588 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91588, term91588.getClass(), "buffer", null);
        setIntField(term91588, term91588.getClass(), "size", 0);
        setField(term91588, term91588.getClass(), "newLine", null);
        setField(term91588, term91588.getClass(), "nullText", null);
        term91586 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91586, term91586.getClass(), "buffer", null);
        setIntField(term91586, term91586.getClass(), "size", 0);
        setField(term91586, term91586.getClass(), "newLine", null);
        setField(term91586, term91586.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term51817, args);
        assertTrue(recursiveEquals(term51817, term91588));
        assertTrue(recursiveEquals(retValue, term91586));
    }

};


