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
import java.lang.StringBuffer;

public class DoubleMetaphone_handleS_47095262497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41095;
     Object term41281;

    public DoubleMetaphone_handleS_47095262497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41095 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term40906 = (char[]) newCharArray(0);
        StringBuffer term41339 = new StringBuffer();
        ((StringBuffer) term41339).append(term40906);
        term41281 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term41281, term41281.getClass(), "primary", term41339);
        setIntField(term41281, term41281.getClass(), "maxLength", 0);
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
        args[0] = "";
        args[1] = term41281;
        args[2] = -1610612736;
        args[3] = false;
        try {
            callMethod(klass, "handleS", argTypes, term41095, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


