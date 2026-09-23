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

public class StrBuilder_setNullText_70591154283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38593;
     Object term87940;
     Object term87936;

    public StrBuilder_setNullText_70591154283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38593 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term87940 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term87940, term87940.getClass(), "buffer", null);
        setIntField(term87940, term87940.getClass(), "size", 0);
        setField(term87940, term87940.getClass(), "newLine", null);
        setField(term87940, term87940.getClass(), "nullText", null);
        term87936 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term87936, term87936.getClass(), "buffer", null);
        setIntField(term87936, term87936.getClass(), "size", 0);
        setField(term87936, term87936.getClass(), "newLine", null);
        setField(term87936, term87936.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "setNullText", argTypes, term38593, args);
        assertTrue(recursiveEquals(term38593, term87940));
        assertTrue(recursiveEquals(retValue, term87936));
    }

};


