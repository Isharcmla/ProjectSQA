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

public class StrBuilder_append_1180061962307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51726;
     Object term91581;
     Object term91579;

    public StrBuilder_append_1180061962307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51726 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term91581 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91581, term91581.getClass(), "buffer", null);
        setIntField(term91581, term91581.getClass(), "size", 0);
        setField(term91581, term91581.getClass(), "newLine", null);
        setField(term91581, term91581.getClass(), "nullText", null);
        term91579 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91579, term91579.getClass(), "buffer", null);
        setIntField(term91579, term91579.getClass(), "size", 0);
        setField(term91579, term91579.getClass(), "newLine", null);
        setField(term91579, term91579.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term51726, args);
        assertTrue(recursiveEquals(term51726, term91581));
        assertTrue(recursiveEquals(retValue, term91579));
    }

};


