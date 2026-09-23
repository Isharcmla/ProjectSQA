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

public class StrBuilder_append_358898262142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2824;
     Object term2883;
     Object term41773;
     Object term41779;
     Object term41682;

    public StrBuilder_append_358898262142() {
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
        term41773 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term41774 = (char[]) newCharArray(32);
        setField(term41773, term41773.getClass(), "buffer", term41774);
        setIntField(term41773, term41773.getClass(), "size", -469968304);
        setField(term41773, term41773.getClass(), "newLine", "JDswTTCZHV");
        setField(term41773, term41773.getClass(), "nullText", "onpbIeEKoi");
        term41779 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term41782 = (byte[]) newByteArray(16);
        setField(term41779, term41779.getClass(), "toStringCache", "YRHGsAkhxb");
        setField(term41779, term41779.getClass(), "value", term41782);
        setByteField(term41779, term41779.getClass(), "coder", (byte) 47);
        setIntField(term41779, term41779.getClass(), "count", -1145578966);
        term41682 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term41683 = (char[]) newCharArray(32);
        setField(term41682, term41682.getClass(), "buffer", term41683);
        setIntField(term41682, term41682.getClass(), "size", -469968304);
        setField(term41682, term41682.getClass(), "newLine", "JDswTTCZHV");
        setField(term41682, term41682.getClass(), "nullText", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = term2883;
        Object retValue = callMethod(klass, "append", argTypes, term2824, args);
        assertTrue(recursiveEquals(term2824, term41773));
        assertTrue(recursiveEquals(term2883, term41779));
        assertTrue(recursiveEquals(retValue, term41682));
    }

};


