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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_replace_823993189305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11422;
     Object term11493;
     Object term11495;
     Object term11497;

    public StrBuilder_replace_823993189305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11422 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11423 = (char[]) newCharArray(32);
        setField(term11422, term11422.getClass(), "buffer", term11423);
        setIntField(term11422, term11422.getClass(), "size", 1398204340);
        setField(term11422, term11422.getClass(), "newLine", "CFyoseFGLF");
        setField(term11422, term11422.getClass(), "nullText", "SFqCrhEWLm");
        term11493 = new Integer(229204365);
        term11495 = new Integer(-461771056);
        term11497 = new Integer(-243422082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = "GZdcJyZntS";
        args[2] = term11493;
        args[3] = term11495;
        args[4] = term11497;
        try {
            callMethod(klass, "replace", argTypes, term11422, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


