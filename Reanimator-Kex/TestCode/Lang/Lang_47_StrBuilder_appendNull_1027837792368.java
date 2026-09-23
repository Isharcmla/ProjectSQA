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

public class StrBuilder_appendNull_1027837792368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56060;
     Object term108997;
     Object term108991;

    public StrBuilder_appendNull_1027837792368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56060 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term56060, term56060.getClass(), "nullText", "");
        term108997 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term108997, term108997.getClass(), "buffer", null);
        setIntField(term108997, term108997.getClass(), "size", 0);
        setField(term108997, term108997.getClass(), "newLine", null);
        setField(term108997, term108997.getClass(), "nullText", "");
        term108991 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term108991, term108991.getClass(), "buffer", null);
        setIntField(term108991, term108991.getClass(), "size", 0);
        setField(term108991, term108991.getClass(), "newLine", null);
        setField(term108991, term108991.getClass(), "nullText", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNull", argTypes, term56060, args);
        assertTrue(recursiveEquals(term56060, term108997));
        assertTrue(recursiveEquals(retValue, term108991));
    }

};


