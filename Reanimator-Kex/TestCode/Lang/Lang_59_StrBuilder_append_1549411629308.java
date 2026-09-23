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

public class StrBuilder_append_1549411629308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55472;
     Object term97765;
     Object term97766;
     Object term97762;

    public StrBuilder_append_1549411629308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55472 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term55472, term55472.getClass(), "size", 0);
        term97765 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term97765, term97765.getClass(), "buffer", null);
        setIntField(term97765, term97765.getClass(), "size", 0);
        setField(term97765, term97765.getClass(), "newLine", null);
        setField(term97765, term97765.getClass(), "nullText", null);
        term97766 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term97766, term97766.getClass(), "buffer", null);
        setIntField(term97766, term97766.getClass(), "size", 0);
        setField(term97766, term97766.getClass(), "newLine", null);
        setField(term97766, term97766.getClass(), "nullText", null);
        term97762 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term97762, term97762.getClass(), "buffer", null);
        setIntField(term97762, term97762.getClass(), "size", 0);
        setField(term97762, term97762.getClass(), "newLine", null);
        setField(term97762, term97762.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term55472;
        Object retValue = callMethod(klass, "append", argTypes, term55472, args);
        assertTrue(recursiveEquals(term55472, term97765));
        assertTrue(recursiveEquals(term55472, term97766));
        assertTrue(recursiveEquals(retValue, term97762));
    }

};


