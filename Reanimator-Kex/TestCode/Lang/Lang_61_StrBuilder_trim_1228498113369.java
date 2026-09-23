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

public class StrBuilder_trim_1228498113369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168846;
     Object term182681;
     Object term182672;

    public StrBuilder_trim_1228498113369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168846 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term168740 = (char[]) newCharArray(1);
        setIntField(term168846, term168846.getClass(), "size", 1);
        setField(term168846, term168846.getClass(), "buffer", term168740);
        term182681 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term182682 = (char[]) newCharArray(1);
        setField(term182681, term182681.getClass(), "buffer", term182682);
        setIntField(term182681, term182681.getClass(), "size", 0);
        setField(term182681, term182681.getClass(), "newLine", null);
        setField(term182681, term182681.getClass(), "nullText", null);
        term182672 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term182673 = (char[]) newCharArray(1);
        setField(term182672, term182672.getClass(), "buffer", term182673);
        setIntField(term182672, term182672.getClass(), "size", 0);
        setField(term182672, term182672.getClass(), "newLine", null);
        setField(term182672, term182672.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "trim", argTypes, term168846, args);
        assertTrue(recursiveEquals(term168846, term182681));
        assertTrue(recursiveEquals(retValue, term182672));
    }

};


