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

public class StrBuilder_appendNull_1027837792304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50862;
     Object term93083;
     Object term93081;

    public StrBuilder_appendNull_1027837792304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50862 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term50862, term50862.getClass(), "nullText", null);
        term93083 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93083, term93083.getClass(), "buffer", null);
        setIntField(term93083, term93083.getClass(), "size", 0);
        setField(term93083, term93083.getClass(), "newLine", null);
        setField(term93083, term93083.getClass(), "nullText", null);
        term93081 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term93081, term93081.getClass(), "buffer", null);
        setIntField(term93081, term93081.getClass(), "size", 0);
        setField(term93081, term93081.getClass(), "newLine", null);
        setField(term93081, term93081.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNull", argTypes, term50862, args);
        assertTrue(recursiveEquals(term50862, term93083));
        assertTrue(recursiveEquals(retValue, term93081));
    }

};


