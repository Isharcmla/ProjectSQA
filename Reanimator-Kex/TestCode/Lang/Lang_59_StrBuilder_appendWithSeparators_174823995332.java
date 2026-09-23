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
import java.lang.Object;

public class StrBuilder_appendWithSeparators_174823995332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66228;
     Object term66133;
     Object term105344;
     Object term105345;

    public StrBuilder_appendWithSeparators_174823995332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66228 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term66133 = (Object[]) newArray("java.lang.Object", 0);
        term105344 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term105344, term105344.getClass(), "buffer", null);
        setIntField(term105344, term105344.getClass(), "size", 0);
        setField(term105344, term105344.getClass(), "newLine", null);
        setField(term105344, term105344.getClass(), "nullText", null);
        term105345 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term66133;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term66228, args);
        assertTrue(recursiveEquals(term66228, term105344));
        assertTrue(recursiveEquals(term66133, term105345));
    }

};


