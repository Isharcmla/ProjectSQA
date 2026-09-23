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

public class StrBuilder_append_223145107437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140788;
     Object term141169;
     Object term141165;

    public StrBuilder_append_223145107437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140788 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term141169 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term141169, term141169.getClass(), "buffer", null);
        setIntField(term141169, term141169.getClass(), "size", 0);
        setField(term141169, term141169.getClass(), "newLine", null);
        setField(term141169, term141169.getClass(), "nullText", null);
        term141165 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term141165, term141165.getClass(), "buffer", null);
        setIntField(term141165, term141165.getClass(), "size", 0);
        setField(term141165, term141165.getClass(), "newLine", null);
        setField(term141165, term141165.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term140788, args);
        assertTrue(recursiveEquals(term140788, term141169));
        assertTrue(recursiveEquals(retValue, term141165));
    }

};


