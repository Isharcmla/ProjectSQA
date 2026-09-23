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

public class ExtendedMessageFormat_containsElements_18821271837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1707;
     Object term6417;

    public ExtendedMessageFormat_containsElements_18821271837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1707 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        setField(term1707, term1707.getClass(), "toPattern", null);
        setField(term1707, term1707.getClass(), "registry", null);
        setField(term1707, term1707.getClass(), "locale", null);
        setField(term1707, term1707.getClass(), "pattern", null);
        setField(term1707, term1707.getClass(), "formats", null);
        setField(term1707, term1707.getClass(), "offsets", null);
        setField(term1707, term1707.getClass(), "argumentNumbers", null);
        setIntField(term1707, term1707.getClass(), "maxOffset", 0);
        term6417 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        setField(term6417, term6417.getClass(), "toPattern", null);
        setField(term6417, term6417.getClass(), "registry", null);
        setField(term6417, term6417.getClass(), "locale", null);
        setField(term6417, term6417.getClass(), "pattern", null);
        setField(term6417, term6417.getClass(), "formats", null);
        setField(term6417, term6417.getClass(), "offsets", null);
        setField(term6417, term6417.getClass(), "argumentNumbers", null);
        setIntField(term6417, term6417.getClass(), "maxOffset", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "containsElements", argTypes, term1707, args);
        assertTrue(recursiveEquals(term1707, term6417));
        assertTrue(recursiveEquals(retValue, false));
    }

};


