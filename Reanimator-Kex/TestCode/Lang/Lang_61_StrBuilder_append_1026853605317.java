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

public class StrBuilder_append_1026853605317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56288;
     Object term95640;
     Object term95636;

    public StrBuilder_append_1026853605317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56288 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term95640 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term95640, term95640.getClass(), "buffer", null);
        setIntField(term95640, term95640.getClass(), "size", 0);
        setField(term95640, term95640.getClass(), "newLine", null);
        setField(term95640, term95640.getClass(), "nullText", null);
        term95636 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term95636, term95636.getClass(), "buffer", null);
        setIntField(term95636, term95636.getClass(), "size", 0);
        setField(term95636, term95636.getClass(), "newLine", null);
        setField(term95636, term95636.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term56288, args);
        assertTrue(recursiveEquals(term56288, term95640));
        assertTrue(recursiveEquals(retValue, term95636));
    }

};


