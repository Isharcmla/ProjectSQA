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

public class DoubleMetaphone_handleT_1398998439143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111638;
     Object term111824;

    public DoubleMetaphone_handleT_1398998439143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111638 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term111460 = (char[]) newCharArray(0);
        StringBuffer term111882 = new StringBuffer();
        ((StringBuffer) term111882).append(term111460);
        term111824 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term111824, term111824.getClass(), "primary", term111882);
        setIntField(term111824, term111824.getClass(), "maxLength", 0);
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
        args[1] = term111824;
        args[2] = 1073737664;
        try {
            callMethod(klass, "handleT", argTypes, term111638, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


