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

public class StrBuilder_replaceFirst_1815609019391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240288;
     Object term240439;
     Object term240433;

    public StrBuilder_replaceFirst_1815609019391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240288 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term240181 = (char[]) newCharArray(1);
        setIntField(term240288, term240288.getClass(), "size", 1);
        setField(term240288, term240288.getClass(), "buffer", term240181);
        term240439 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term240440 = (char[]) newCharArray(1);
        setField(term240439, term240439.getClass(), "buffer", term240440);
        setIntField(term240439, term240439.getClass(), "size", 1);
        setField(term240439, term240439.getClass(), "newLine", null);
        setField(term240439, term240439.getClass(), "nullText", null);
        term240433 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term240434 = (char[]) newCharArray(1);
        setField(term240433, term240433.getClass(), "buffer", term240434);
        setIntField(term240433, term240433.getClass(), "size", 1);
        setField(term240433, term240433.getClass(), "newLine", null);
        setField(term240433, term240433.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term240288, args);
        assertTrue(recursiveEquals(term240288, term240439));
        assertTrue(recursiveEquals(retValue, term240433));
    }

};


