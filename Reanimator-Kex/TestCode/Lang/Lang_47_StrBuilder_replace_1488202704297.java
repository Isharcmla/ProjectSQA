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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_replace_1488202704297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10479;
     Object term10538;
     Object term10540;

    public StrBuilder_replace_1488202704297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10479 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10480 = (char[]) newCharArray(32);
        setField(term10479, term10479.getClass(), "buffer", term10480);
        setIntField(term10479, term10479.getClass(), "size", -1498296052);
        setField(term10479, term10479.getClass(), "newLine", "kGMQdqJYyB");
        setField(term10479, term10479.getClass(), "nullText", "XJJNClzHRf");
        term10538 = new Integer(2098647989);
        term10540 = new Integer(1598895173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term10538;
        args[1] = term10540;
        args[2] = "HDaezxQfQR";
        try {
            callMethod(klass, "replace", argTypes, term10479, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


