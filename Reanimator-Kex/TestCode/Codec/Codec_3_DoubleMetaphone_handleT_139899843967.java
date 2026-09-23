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
import java.lang.Object;
import java.lang.Integer;

public class DoubleMetaphone_handleT_139899843967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2202;
     Object term2216;
     Object term2282;

    public DoubleMetaphone_handleT_139899843967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2202 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term2202, term2202.getClass(), "maxCodeLen", 4);
        term2216 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term2217 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2230 = (byte[]) newByteArray(16);
        Object term2249 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2262 = (byte[]) newByteArray(16);
        setField(term2217, term2217.getClass(), "toStringCache", "nGKItKLYNC");
        setField(term2217, term2217.getClass(), "value", term2230);
        setByteField(term2217, term2217.getClass(), "coder", (byte) 36);
        setIntField(term2217, term2217.getClass(), "count", -184153539);
        setField(term2216, term2216.getClass(), "primary", term2217);
        setField(term2249, term2249.getClass(), "toStringCache", "UiUYnPrcCi");
        setField(term2249, term2249.getClass(), "value", term2262);
        setByteField(term2249, term2249.getClass(), "coder", (byte) 118);
        setIntField(term2249, term2249.getClass(), "count", 493620644);
        setField(term2216, term2216.getClass(), "alternate", term2249);
        setIntField(term2216, term2216.getClass(), "maxLength", 1328271830);
        setField(term2216, term2216.getClass(), "this$0", null);
        term2282 = new Integer(1596070772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "jDtqGUpnZN";
        args[1] = term2216;
        args[2] = term2282;
        try {
            callMethod(klass, "handleT", argTypes, term2202, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


