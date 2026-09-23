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

public class StrBuilder_append_358898262340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77761;
     Object term109035;
     Object term109010;

    public StrBuilder_append_358898262340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77761 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term109035 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term109035, term109035.getClass(), "buffer", null);
        setIntField(term109035, term109035.getClass(), "size", 0);
        setField(term109035, term109035.getClass(), "newLine", null);
        setField(term109035, term109035.getClass(), "nullText", null);
        term109010 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term109010, term109010.getClass(), "buffer", null);
        setIntField(term109010, term109010.getClass(), "size", 0);
        setField(term109010, term109010.getClass(), "newLine", null);
        setField(term109010, term109010.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term77761, args);
        assertTrue(recursiveEquals(term77761, term109035));
        assertTrue(recursiveEquals(retValue, term109010));
    }

};


