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

public class StrBuilder_append_358898262143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2824;
     Object term2883;
     Object term44325;
     Object term44331;
     Object term44234;

    public StrBuilder_append_358898262143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2824 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2825 = (char[]) newCharArray(32);
        setField(term2824, term2824.getClass(), "buffer", term2825);
        setIntField(term2824, term2824.getClass(), "size", -469968304);
        setField(term2824, term2824.getClass(), "newLine", "JDswTTCZHV");
        setField(term2824, term2824.getClass(), "nullText", "onpbIeEKoi");
        term2883 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2896 = (byte[]) newByteArray(16);
        setField(term2883, term2883.getClass(), "toStringCache", "YRHGsAkhxb");
        setField(term2883, term2883.getClass(), "value", term2896);
        setByteField(term2883, term2883.getClass(), "coder", (byte) 47);
        setIntField(term2883, term2883.getClass(), "count", -1145578966);
        term44325 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term44326 = (char[]) newCharArray(32);
        setField(term44325, term44325.getClass(), "buffer", term44326);
        setIntField(term44325, term44325.getClass(), "size", -469968304);
        setField(term44325, term44325.getClass(), "newLine", "JDswTTCZHV");
        setField(term44325, term44325.getClass(), "nullText", "onpbIeEKoi");
        term44331 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term44334 = (byte[]) newByteArray(16);
        setField(term44331, term44331.getClass(), "toStringCache", "YRHGsAkhxb");
        setField(term44331, term44331.getClass(), "value", term44334);
        setByteField(term44331, term44331.getClass(), "coder", (byte) 47);
        setIntField(term44331, term44331.getClass(), "count", -1145578966);
        term44234 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term44235 = (char[]) newCharArray(32);
        setField(term44234, term44234.getClass(), "buffer", term44235);
        setIntField(term44234, term44234.getClass(), "size", -469968304);
        setField(term44234, term44234.getClass(), "newLine", "JDswTTCZHV");
        setField(term44234, term44234.getClass(), "nullText", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = term2883;
        Object retValue = callMethod(klass, "append", argTypes, term2824, args);
        assertTrue(recursiveEquals(term2824, term44325));
        assertTrue(recursiveEquals(term2883, term44331));
        assertTrue(recursiveEquals(retValue, term44234));
    }

};


