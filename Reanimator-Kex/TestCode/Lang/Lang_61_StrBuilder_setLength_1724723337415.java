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

public class StrBuilder_setLength_1724723337415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284997;
     Object term285003;
     Object term285000;

    public StrBuilder_setLength_1724723337415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284997 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term284997, term284997.getClass(), "size", 1);
        term285003 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term285003, term285003.getClass(), "buffer", null);
        setIntField(term285003, term285003.getClass(), "size", 0);
        setField(term285003, term285003.getClass(), "newLine", null);
        setField(term285003, term285003.getClass(), "nullText", null);
        term285000 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term285000, term285000.getClass(), "buffer", null);
        setIntField(term285000, term285000.getClass(), "size", 0);
        setField(term285000, term285000.getClass(), "newLine", null);
        setField(term285000, term285000.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "setLength", argTypes, term284997, args);
        assertTrue(recursiveEquals(term284997, term285003));
        assertTrue(recursiveEquals(retValue, term285000));
    }

};


