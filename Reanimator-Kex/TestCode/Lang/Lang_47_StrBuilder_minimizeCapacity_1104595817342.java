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

public class StrBuilder_minimizeCapacity_1104595817342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41042;
     Object term100148;
     Object term100144;

    public StrBuilder_minimizeCapacity_1104595817342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41042 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term40944 = (char[]) newCharArray(0);
        setField(term41042, term41042.getClass(), "buffer", term40944);
        setIntField(term41042, term41042.getClass(), "size", 0);
        term100148 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term100149 = (char[]) newCharArray(0);
        setField(term100148, term100148.getClass(), "buffer", term100149);
        setIntField(term100148, term100148.getClass(), "size", 0);
        setField(term100148, term100148.getClass(), "newLine", null);
        setField(term100148, term100148.getClass(), "nullText", null);
        term100144 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term100145 = (char[]) newCharArray(0);
        setField(term100144, term100144.getClass(), "buffer", term100145);
        setIntField(term100144, term100144.getClass(), "size", 0);
        setField(term100144, term100144.getClass(), "newLine", null);
        setField(term100144, term100144.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "minimizeCapacity", argTypes, term41042, args);
        assertTrue(recursiveEquals(term41042, term100148));
        assertTrue(recursiveEquals(retValue, term100144));
    }

};


