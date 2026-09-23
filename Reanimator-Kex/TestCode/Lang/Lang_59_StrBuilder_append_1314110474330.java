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

public class StrBuilder_append_1314110474330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66023;
     Object term105042;
     Object term105038;

    public StrBuilder_append_1314110474330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66023 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term105042 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term105042, term105042.getClass(), "buffer", null);
        setIntField(term105042, term105042.getClass(), "size", 0);
        setField(term105042, term105042.getClass(), "newLine", null);
        setField(term105042, term105042.getClass(), "nullText", null);
        term105038 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term105038, term105038.getClass(), "buffer", null);
        setIntField(term105038, term105038.getClass(), "size", 0);
        setField(term105038, term105038.getClass(), "newLine", null);
        setField(term105038, term105038.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "append", argTypes, term66023, args);
        assertTrue(recursiveEquals(term66023, term105042));
        assertTrue(recursiveEquals(retValue, term105038));
    }

};


