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

public class StrBuilder_appendWithSeparators_701657066245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6995;
     Object term71599;

    public StrBuilder_appendWithSeparators_701657066245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6995 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6996 = (char[]) newCharArray(32);
        setField(term6995, term6995.getClass(), "buffer", term6996);
        setIntField(term6995, term6995.getClass(), "size", -344842608);
        setField(term6995, term6995.getClass(), "newLine", "xJgPlLxpgC");
        setField(term6995, term6995.getClass(), "nullText", "EYtfuJaxiM");
        term71599 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term71600 = (char[]) newCharArray(32);
        setField(term71599, term71599.getClass(), "buffer", term71600);
        setIntField(term71599, term71599.getClass(), "size", -344842608);
        setField(term71599, term71599.getClass(), "newLine", "xJgPlLxpgC");
        setField(term71599, term71599.getClass(), "nullText", "EYtfuJaxiM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "gCWtLVKVVe";
        callMethod(klass, "appendWithSeparators", argTypes, term6995, args);
        assertTrue(recursiveEquals(term6995, term71599));
    }

};


