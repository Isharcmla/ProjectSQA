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

public class StrBuilder_contains_829616729254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10183;
     Object term78529;

    public StrBuilder_contains_829616729254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10183 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10184 = (char[]) newCharArray(32);
        setField(term10183, term10183.getClass(), "buffer", term10184);
        setIntField(term10183, term10183.getClass(), "size", 98922530);
        setField(term10183, term10183.getClass(), "newLine", "PgPzMSEjjX");
        setField(term10183, term10183.getClass(), "nullText", "wzsPSPcRdj");
        term78529 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term78530 = (char[]) newCharArray(32);
        setField(term78529, term78529.getClass(), "buffer", term78530);
        setIntField(term78529, term78529.getClass(), "size", 98922530);
        setField(term78529, term78529.getClass(), "newLine", "PgPzMSEjjX");
        setField(term78529, term78529.getClass(), "nullText", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "contains", argTypes, term10183, args);
        assertTrue(recursiveEquals(term10183, term78529));
        assertTrue(recursiveEquals(retValue, false));
    }

};


