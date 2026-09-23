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

public class StrBuilder_equalsIgnoreCase_1886998450272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12067;
     Object term12126;
     Object term82278;
     Object term82284;

    public StrBuilder_equalsIgnoreCase_1886998450272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12067 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12068 = (char[]) newCharArray(32);
        setField(term12067, term12067.getClass(), "buffer", term12068);
        setIntField(term12067, term12067.getClass(), "size", -601863069);
        setField(term12067, term12067.getClass(), "newLine", "xvkbvaEGYd");
        setField(term12067, term12067.getClass(), "nullText", "HBGNxdNURv");
        term12126 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12127 = (char[]) newCharArray(32);
        setField(term12126, term12126.getClass(), "buffer", term12127);
        setIntField(term12126, term12126.getClass(), "size", 663292551);
        setField(term12126, term12126.getClass(), "newLine", "mfCpTPPQQm");
        setField(term12126, term12126.getClass(), "nullText", "OcJCIDNIXA");
        term82278 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term82279 = (char[]) newCharArray(32);
        setField(term82278, term82278.getClass(), "buffer", term82279);
        setIntField(term82278, term82278.getClass(), "size", -601863069);
        setField(term82278, term82278.getClass(), "newLine", "xvkbvaEGYd");
        setField(term82278, term82278.getClass(), "nullText", "HBGNxdNURv");
        term82284 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term82285 = (char[]) newCharArray(32);
        setField(term82284, term82284.getClass(), "buffer", term82285);
        setIntField(term82284, term82284.getClass(), "size", 663292551);
        setField(term82284, term82284.getClass(), "newLine", "mfCpTPPQQm");
        setField(term82284, term82284.getClass(), "nullText", "OcJCIDNIXA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term12126;
        Object retValue = callMethod(klass, "equalsIgnoreCase", argTypes, term12067, args);
        assertTrue(recursiveEquals(term12067, term82278));
        assertTrue(recursiveEquals(term12126, term82284));
        assertTrue(recursiveEquals(retValue, false));
    }

};


