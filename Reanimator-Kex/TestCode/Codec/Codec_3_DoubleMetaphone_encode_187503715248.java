package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;

public class DoubleMetaphone_encode_187503715248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54;
     Object term5798;

    public DoubleMetaphone_encode_187503715248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term54, term54.getClass(), "maxCodeLen", 4);
        term5798 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term5798, term5798.getClass(), "maxCodeLen", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        Object retValue = callMethod(klass, "encode", argTypes, term54, args);
        assertTrue(recursiveEquals(term54, term5798));
        assertTrue(recursiveEquals(retValue, "MLKK"));
    }

};


