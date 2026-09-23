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

public class DoubleMetaphone_handleCC_523847861139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151941;
     Object term152127;

    public DoubleMetaphone_handleCC_523847861139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151941 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term151791 = (char[]) newCharArray(0);
        StringBuilder term152187 = new StringBuilder();
        ((StringBuilder) term152187).append(term151791);
        term152127 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term152127, term152127.getClass(), "primary", term152187);
        setIntField(term152127, term152127.getClass(), "maxLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = term152127;
        args[2] = 2147483310;
        try {
            callMethod(klass, "handleCC", argTypes, term151941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


