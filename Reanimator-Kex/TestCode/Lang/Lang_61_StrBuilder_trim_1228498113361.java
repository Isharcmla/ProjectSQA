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

public class StrBuilder_trim_1228498113361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156467;
     Object term159622;
     Object term159583;

    public StrBuilder_trim_1228498113361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156467 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term156124 = (char[]) newCharArray(31);
        setIntField(term156467, term156467.getClass(), "size", 31);
        setField(term156467, term156467.getClass(), "buffer", term156124);
        term159622 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term159623 = (char[]) newCharArray(31);
        setField(term159622, term159622.getClass(), "buffer", term159623);
        setIntField(term159622, term159622.getClass(), "size", 0);
        setField(term159622, term159622.getClass(), "newLine", null);
        setField(term159622, term159622.getClass(), "nullText", null);
        term159583 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term159584 = (char[]) newCharArray(31);
        setField(term159583, term159583.getClass(), "buffer", term159584);
        setIntField(term159583, term159583.getClass(), "size", 0);
        setField(term159583, term159583.getClass(), "newLine", null);
        setField(term159583, term159583.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "trim", argTypes, term156467, args);
        assertTrue(recursiveEquals(term156467, term159622));
        assertTrue(recursiveEquals(retValue, term159583));
    }

};


