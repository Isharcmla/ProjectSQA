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

public class StrBuilder_appendNull_1027837792421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85882;
     Object term128512;
     Object term128510;

    public StrBuilder_appendNull_1027837792421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85882 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term85882, term85882.getClass(), "nullText", null);
        term128512 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term128512, term128512.getClass(), "buffer", null);
        setIntField(term128512, term128512.getClass(), "size", 0);
        setField(term128512, term128512.getClass(), "newLine", null);
        setField(term128512, term128512.getClass(), "nullText", null);
        term128510 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term128510, term128510.getClass(), "buffer", null);
        setIntField(term128510, term128510.getClass(), "size", 0);
        setField(term128510, term128510.getClass(), "newLine", null);
        setField(term128510, term128510.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNull", argTypes, term85882, args);
        assertTrue(recursiveEquals(term85882, term128512));
        assertTrue(recursiveEquals(retValue, term128510));
    }

};


