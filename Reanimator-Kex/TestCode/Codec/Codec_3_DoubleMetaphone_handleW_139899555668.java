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
import java.lang.Object;
import java.lang.Integer;

public class DoubleMetaphone_handleW_139899555668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2346;
     Object term2360;
     Object term2426;
     Object term14816;
     Object term14819;

    public DoubleMetaphone_handleW_139899555668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2346 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term2346, term2346.getClass(), "maxCodeLen", 4);
        term2360 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term2361 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2374 = (byte[]) newByteArray(16);
        Object term2393 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2406 = (byte[]) newByteArray(16);
        setField(term2361, term2361.getClass(), "toStringCache", "JDswTTCZHV");
        setField(term2361, term2361.getClass(), "value", term2374);
        setByteField(term2361, term2361.getClass(), "coder", (byte) 106);
        setIntField(term2361, term2361.getClass(), "count", 97029295);
        setField(term2360, term2360.getClass(), "primary", term2361);
        setField(term2393, term2393.getClass(), "toStringCache", "onpbIeEKoi");
        setField(term2393, term2393.getClass(), "value", term2406);
        setByteField(term2393, term2393.getClass(), "coder", (byte) 98);
        setIntField(term2393, term2393.getClass(), "count", -1371869594);
        setField(term2360, term2360.getClass(), "alternate", term2393);
        setIntField(term2360, term2360.getClass(), "maxLength", -2095575670);
        setField(term2360, term2360.getClass(), "this$0", null);
        term2426 = new Integer(1225272962);
        term14816 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term14816, term14816.getClass(), "maxCodeLen", 4);
        term14819 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term14820 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term14823 = (byte[]) newByteArray(16);
        Object term14824 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term14827 = (byte[]) newByteArray(16);
        setField(term14820, term14820.getClass(), "toStringCache", "JDswTTCZHV");
        setField(term14820, term14820.getClass(), "value", term14823);
        setByteField(term14820, term14820.getClass(), "coder", (byte) 106);
        setIntField(term14820, term14820.getClass(), "count", 97029295);
        setField(term14819, term14819.getClass(), "primary", term14820);
        setField(term14824, term14824.getClass(), "toStringCache", "onpbIeEKoi");
        setField(term14824, term14824.getClass(), "value", term14827);
        setByteField(term14824, term14824.getClass(), "coder", (byte) 98);
        setIntField(term14824, term14824.getClass(), "count", -1371869594);
        setField(term14819, term14819.getClass(), "alternate", term14824);
        setIntField(term14819, term14819.getClass(), "maxLength", -2095575670);
        setField(term14819, term14819.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "UoYtihxVaS";
        args[1] = term2360;
        args[2] = term2426;
        Object retValue = callMethod(klass, "handleW", argTypes, term2346, args);
        assertTrue(recursiveEquals(term2346, term14816));
        assertTrue(recursiveEquals(term2360, 1225272962));
        assertTrue(recursiveEquals(term2426, term14819));
        assertTrue(recursiveEquals(retValue, 1225272963));
    }

};


