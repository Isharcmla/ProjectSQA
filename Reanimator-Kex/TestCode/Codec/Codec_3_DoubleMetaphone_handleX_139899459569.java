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

public class DoubleMetaphone_handleX_139899459569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2490;
     Object term2504;
     Object term2570;

    public DoubleMetaphone_handleX_139899459569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2490 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term2490, term2490.getClass(), "maxCodeLen", 4);
        term2504 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term2505 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2518 = (byte[]) newByteArray(16);
        Object term2537 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2550 = (byte[]) newByteArray(16);
        setField(term2505, term2505.getClass(), "toStringCache", "ffYhPOzlUs");
        setField(term2505, term2505.getClass(), "value", term2518);
        setByteField(term2505, term2505.getClass(), "coder", (byte) 67);
        setIntField(term2505, term2505.getClass(), "count", 1324040357);
        setField(term2504, term2504.getClass(), "primary", term2505);
        setField(term2537, term2537.getClass(), "toStringCache", "MLqYREekMl");
        setField(term2537, term2537.getClass(), "value", term2550);
        setByteField(term2537, term2537.getClass(), "coder", (byte) 66);
        setIntField(term2537, term2537.getClass(), "count", -1588772968);
        setField(term2504, term2504.getClass(), "alternate", term2537);
        setIntField(term2504, term2504.getClass(), "maxLength", -93135961);
        setField(term2504, term2504.getClass(), "this$0", null);
        term2570 = new Integer(-112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "YRHGsAkhxb";
        args[1] = term2504;
        args[2] = term2570;
        try {
            callMethod(klass, "handleX", argTypes, term2490, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


