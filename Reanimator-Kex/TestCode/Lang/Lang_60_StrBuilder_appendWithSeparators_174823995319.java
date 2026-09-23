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

public class StrBuilder_appendWithSeparators_174823995319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61009;
     Object term102941;

    public StrBuilder_appendWithSeparators_174823995319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61009 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term102941 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term102941, term102941.getClass(), "buffer", null);
        setIntField(term102941, term102941.getClass(), "size", 0);
        setField(term102941, term102941.getClass(), "newLine", null);
        setField(term102941, term102941.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term61009, args);
        assertTrue(recursiveEquals(term61009, term102941));
    }

};


