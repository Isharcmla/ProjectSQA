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

public class StrBuilder_append_157914966340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66332;
     Object term149378;
     Object term149374;

    public StrBuilder_append_157914966340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66332 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term149378 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term149378, term149378.getClass(), "buffer", null);
        setIntField(term149378, term149378.getClass(), "size", 0);
        setField(term149378, term149378.getClass(), "newLine", null);
        setField(term149378, term149378.getClass(), "nullText", null);
        term149374 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term149374, term149374.getClass(), "buffer", null);
        setIntField(term149374, term149374.getClass(), "size", 0);
        setField(term149374, term149374.getClass(), "newLine", null);
        setField(term149374, term149374.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "append", argTypes, term66332, args);
        assertTrue(recursiveEquals(term66332, term149378));
        assertTrue(recursiveEquals(retValue, term149374));
    }

};


