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

public class StrBuilder_isEmpty_1569760026287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44640;
     Object term88137;

    public StrBuilder_isEmpty_1569760026287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44640 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term44640, term44640.getClass(), "size", 0);
        term88137 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term88137, term88137.getClass(), "buffer", null);
        setIntField(term88137, term88137.getClass(), "size", 0);
        setField(term88137, term88137.getClass(), "newLine", null);
        setField(term88137, term88137.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term44640, args);
        assertTrue(recursiveEquals(term44640, term88137));
        assertTrue(recursiveEquals(retValue, true));
    }

};


