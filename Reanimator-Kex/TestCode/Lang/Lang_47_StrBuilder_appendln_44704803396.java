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

public class StrBuilder_appendln_44704803396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70374;
     Object term117266;
     Object term117239;

    public StrBuilder_appendln_44704803396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70374 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term70277 = (char[]) newCharArray(0);
        setIntField(term70374, term70374.getClass(), "size", 0);
        setField(term70374, term70374.getClass(), "buffer", term70277);
        term117266 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term117267 = (char[]) newCharArray(2);
        setCharElement(term117267, 1, (char) 10);
        setField(term117266, term117266.getClass(), "buffer", term117267);
        setIntField(term117266, term117266.getClass(), "size", 2);
        setField(term117266, term117266.getClass(), "newLine", null);
        setField(term117266, term117266.getClass(), "nullText", null);
        term117239 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term117240 = (char[]) newCharArray(2);
        setCharElement(term117240, 1, (char) 10);
        setField(term117239, term117239.getClass(), "buffer", term117240);
        setIntField(term117239, term117239.getClass(), "size", 2);
        setField(term117239, term117239.getClass(), "newLine", null);
        setField(term117239, term117239.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "appendln", argTypes, term70374, args);
        assertTrue(recursiveEquals(term70374, term117266));
        assertTrue(recursiveEquals(retValue, term117239));
    }

};


