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

public class StrBuilder_setLength_1724723337282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38492;
     Object term87926;
     Object term87923;

    public StrBuilder_setLength_1724723337282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38492 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term87926 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term87926, term87926.getClass(), "buffer", null);
        setIntField(term87926, term87926.getClass(), "size", 0);
        setField(term87926, term87926.getClass(), "newLine", null);
        setField(term87926, term87926.getClass(), "nullText", null);
        term87923 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term87923, term87923.getClass(), "buffer", null);
        setIntField(term87923, term87923.getClass(), "size", 0);
        setField(term87923, term87923.getClass(), "newLine", null);
        setField(term87923, term87923.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "setLength", argTypes, term38492, args);
        assertTrue(recursiveEquals(term38492, term87926));
        assertTrue(recursiveEquals(retValue, term87923));
    }

};


