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
import java.lang.OutOfMemoryError;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class DoubleMetaphone_handleZ_47094589770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2634;
     Object term2648;
     Object term2714;
     Object term2716;

    public DoubleMetaphone_handleZ_47094589770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2634 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term2634, term2634.getClass(), "maxCodeLen", 4);
        term2648 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term2649 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2662 = (byte[]) newByteArray(16);
        Object term2681 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2694 = (byte[]) newByteArray(16);
        setField(term2649, term2649.getClass(), "toStringCache", "nHXjMycHlU");
        setField(term2649, term2649.getClass(), "value", term2662);
        setByteField(term2649, term2649.getClass(), "coder", (byte) -121);
        setIntField(term2649, term2649.getClass(), "count", 933028652);
        setField(term2648, term2648.getClass(), "primary", term2649);
        setField(term2681, term2681.getClass(), "toStringCache", "ieCtQFdkii");
        setField(term2681, term2681.getClass(), "value", term2694);
        setByteField(term2681, term2681.getClass(), "coder", (byte) -119);
        setIntField(term2681, term2681.getClass(), "count", 287287233);
        setField(term2648, term2648.getClass(), "alternate", term2681);
        setIntField(term2648, term2648.getClass(), "maxLength", 962840079);
        setField(term2648, term2648.getClass(), "this$0", null);
        term2714 = new Integer(1540719661);
        term2716 = new Boolean(true);
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
        args[0] = "ytSBIKXogI";
        args[1] = term2648;
        args[2] = term2714;
        args[3] = term2716;
        try {
            callMethod(klass, "handleZ", argTypes, term2634, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


