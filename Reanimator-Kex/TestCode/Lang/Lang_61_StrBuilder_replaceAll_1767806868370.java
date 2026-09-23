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

public class StrBuilder_replaceAll_1767806868370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169315;
     Object term182743;
     Object term182706;

    public StrBuilder_replaceAll_1767806868370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169315 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term168852 = (char[]) newCharArray(32);
        setIntField(term169315, term169315.getClass(), "size", 9);
        setField(term169315, term169315.getClass(), "buffer", term168852);
        term182743 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term182744 = (char[]) newCharArray(32);
        setField(term182743, term182743.getClass(), "buffer", term182744);
        setIntField(term182743, term182743.getClass(), "size", 9);
        setField(term182743, term182743.getClass(), "newLine", null);
        setField(term182743, term182743.getClass(), "nullText", null);
        term182706 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term182707 = (char[]) newCharArray(32);
        setField(term182706, term182706.getClass(), "buffer", term182707);
        setIntField(term182706, term182706.getClass(), "size", 9);
        setField(term182706, term182706.getClass(), "newLine", null);
        setField(term182706, term182706.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceAll", argTypes, term169315, args);
        assertTrue(recursiveEquals(term169315, term182743));
        assertTrue(recursiveEquals(retValue, term182706));
    }

};


