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

public class StrBuilder_append_1549411629309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51955;
     Object term91602;
     Object term91603;
     Object term91591;

    public StrBuilder_append_1549411629309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51955 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term51955, term51955.getClass(), "size", 0);
        term91602 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91602, term91602.getClass(), "buffer", null);
        setIntField(term91602, term91602.getClass(), "size", 0);
        setField(term91602, term91602.getClass(), "newLine", null);
        setField(term91602, term91602.getClass(), "nullText", null);
        term91603 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91603, term91603.getClass(), "buffer", null);
        setIntField(term91603, term91603.getClass(), "size", 0);
        setField(term91603, term91603.getClass(), "newLine", null);
        setField(term91603, term91603.getClass(), "nullText", null);
        term91591 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term91591, term91591.getClass(), "buffer", null);
        setIntField(term91591, term91591.getClass(), "size", 0);
        setField(term91591, term91591.getClass(), "newLine", null);
        setField(term91591, term91591.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term51955;
        Object retValue = callMethod(klass, "append", argTypes, term51955, args);
        assertTrue(recursiveEquals(term51955, term91602));
        assertTrue(recursiveEquals(term51955, term91603));
        assertTrue(recursiveEquals(retValue, term91591));
    }

};


