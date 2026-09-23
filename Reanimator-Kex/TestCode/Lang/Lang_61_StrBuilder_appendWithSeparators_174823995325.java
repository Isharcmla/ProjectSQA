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

public class StrBuilder_appendWithSeparators_174823995325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59858;
     Object term59763;
     Object term99717;
     Object term99718;

    public StrBuilder_appendWithSeparators_174823995325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59858 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term59763 = (Object[]) newArray("java.lang.Object", 0);
        term99717 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term99717, term99717.getClass(), "buffer", null);
        setIntField(term99717, term99717.getClass(), "size", 0);
        setField(term99717, term99717.getClass(), "newLine", null);
        setField(term99717, term99717.getClass(), "nullText", null);
        term99718 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term59763;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term59858, args);
        assertTrue(recursiveEquals(term59858, term99717));
        assertTrue(recursiveEquals(term59763, term99718));
    }

};


