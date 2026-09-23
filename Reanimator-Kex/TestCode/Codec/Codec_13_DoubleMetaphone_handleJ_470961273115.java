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
import java.lang.NullPointerException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.StringBuilder;

public class DoubleMetaphone_handleJ_470961273115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104306;
     Object term104492;

    public DoubleMetaphone_handleJ_470961273115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104306 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term104102 = (char[]) newCharArray(0);
        StringBuilder term104552 = new StringBuilder();
        ((StringBuilder) term104552).append(term104102);
        term104492 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term104492, term104492.getClass(), "primary", term104552);
        setIntField(term104492, term104492.getClass(), "maxLength", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = " UUUUUUU";
        args[1] = term104492;
        args[2] = -1723858944;
        args[3] = false;
        try {
            callMethod(klass, "handleJ", argTypes, term104306, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


