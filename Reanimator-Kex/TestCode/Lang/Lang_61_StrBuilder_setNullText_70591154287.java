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

public class StrBuilder_setNullText_70591154287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42590;
     Object term85539;
     Object term85535;

    public StrBuilder_setNullText_70591154287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42590 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term85539 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term85539, term85539.getClass(), "buffer", null);
        setIntField(term85539, term85539.getClass(), "size", 0);
        setField(term85539, term85539.getClass(), "newLine", null);
        setField(term85539, term85539.getClass(), "nullText", null);
        term85535 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term85535, term85535.getClass(), "buffer", null);
        setIntField(term85535, term85535.getClass(), "size", 0);
        setField(term85535, term85535.getClass(), "newLine", null);
        setField(term85535, term85535.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "setNullText", argTypes, term42590, args);
        assertTrue(recursiveEquals(term42590, term85539));
        assertTrue(recursiveEquals(retValue, term85535));
    }

};


