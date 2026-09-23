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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.StringBuilder;

public class DoubleMetaphone_handleP_1399002283187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248725;
     Object term248911;

    public DoubleMetaphone_handleP_1399002283187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248725 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term248370 = (char[]) newCharArray(0);
        StringBuilder term248971 = new StringBuilder();
        ((StringBuilder) term248971).append(term248370);
        char[] term248373 = (char[]) newCharArray(0);
        StringBuilder term249031 = new StringBuilder();
        ((StringBuilder) term249031).append(term248373);
        term248911 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term248911, term248911.getClass(), "primary", term248971);
        setIntField(term248911, term248911.getClass(), "maxLength", -2147483647);
        setField(term248911, term248911.getClass(), "alternate", term249031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "                                                                                                                                                                                                ";
        args[1] = term248911;
        args[2] = 2147483646;
        try {
            callMethod(klass, "handleP", argTypes, term248725, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


