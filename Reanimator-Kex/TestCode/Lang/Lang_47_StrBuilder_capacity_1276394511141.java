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

public class StrBuilder_capacity_1276394511141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;
     Object term37723;

    public StrBuilder_capacity_1276394511141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term737 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term738 = (char[]) newCharArray(32);
        setField(term737, term737.getClass(), "buffer", term738);
        setIntField(term737, term737.getClass(), "size", 1227103734);
        setField(term737, term737.getClass(), "newLine", "aJlieCFVtF");
        setField(term737, term737.getClass(), "nullText", "ZiaGIbnzTs");
        term37723 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term37724 = (char[]) newCharArray(32);
        setField(term37723, term37723.getClass(), "buffer", term37724);
        setIntField(term37723, term37723.getClass(), "size", 1227103734);
        setField(term37723, term37723.getClass(), "newLine", "aJlieCFVtF");
        setField(term37723, term37723.getClass(), "nullText", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "capacity", argTypes, term737, args);
        assertTrue(recursiveEquals(term737, term37723));
        assertTrue(recursiveEquals(retValue, 32));
    }

};


