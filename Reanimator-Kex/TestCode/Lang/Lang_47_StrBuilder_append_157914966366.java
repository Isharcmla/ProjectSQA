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

public class StrBuilder_append_157914966366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55793;
     Object term108706;
     Object term108702;

    public StrBuilder_append_157914966366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55793 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term108706 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term108706, term108706.getClass(), "buffer", null);
        setIntField(term108706, term108706.getClass(), "size", 0);
        setField(term108706, term108706.getClass(), "newLine", null);
        setField(term108706, term108706.getClass(), "nullText", null);
        term108702 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term108702, term108702.getClass(), "buffer", null);
        setIntField(term108702, term108702.getClass(), "size", 0);
        setField(term108702, term108702.getClass(), "newLine", null);
        setField(term108702, term108702.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term55793, args);
        assertTrue(recursiveEquals(term55793, term108706));
        assertTrue(recursiveEquals(retValue, term108702));
    }

};


