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

public class StrBuilder_append_1314110474303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50733;
     Object term93077;
     Object term93071;

    public StrBuilder_append_1314110474303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50733 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term93077 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93077, term93077.getClass(), "buffer", null);
        setIntField(term93077, term93077.getClass(), "size", 0);
        setField(term93077, term93077.getClass(), "newLine", null);
        setField(term93077, term93077.getClass(), "nullText", null);
        term93071 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93071, term93071.getClass(), "buffer", null);
        setIntField(term93071, term93071.getClass(), "size", 0);
        setField(term93071, term93071.getClass(), "newLine", null);
        setField(term93071, term93071.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term50733, args);
        assertTrue(recursiveEquals(term50733, term93077));
        assertTrue(recursiveEquals(retValue, term93071));
    }

};


