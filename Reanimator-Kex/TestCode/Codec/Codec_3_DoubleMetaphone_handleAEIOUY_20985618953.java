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

public class DoubleMetaphone_handleAEIOUY_20985618953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;
     Object term192;
     Object term258;
     Object term8817;
     Object term8820;

    public DoubleMetaphone_handleAEIOUY_20985618953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term178, term178.getClass(), "maxCodeLen", 4);
        term192 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term193 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term206 = (byte[]) newByteArray(16);
        Object term225 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term238 = (byte[]) newByteArray(16);
        setField(term193, term193.getClass(), "toStringCache", "hRNSzYYIrc");
        setField(term193, term193.getClass(), "value", term206);
        setByteField(term193, term193.getClass(), "coder", (byte) 47);
        setIntField(term193, term193.getClass(), "count", 1162663216);
        setField(term192, term192.getClass(), "primary", term193);
        setField(term225, term225.getClass(), "toStringCache", "RMFIsYGgne");
        setField(term225, term225.getClass(), "value", term238);
        setByteField(term225, term225.getClass(), "coder", (byte) 48);
        setIntField(term225, term225.getClass(), "count", 1484323161);
        setField(term192, term192.getClass(), "alternate", term225);
        setIntField(term192, term192.getClass(), "maxLength", 391863371);
        setField(term192, term192.getClass(), "this$0", null);
        term258 = new Integer(-1922583790);
        term8817 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term8817, term8817.getClass(), "maxCodeLen", 4);
        term8820 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term8821 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term8824 = (byte[]) newByteArray(16);
        Object term8825 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term8828 = (byte[]) newByteArray(16);
        setField(term8821, term8821.getClass(), "toStringCache", "hRNSzYYIrc");
        setField(term8821, term8821.getClass(), "value", term8824);
        setByteField(term8821, term8821.getClass(), "coder", (byte) 47);
        setIntField(term8821, term8821.getClass(), "count", 1162663216);
        setField(term8820, term8820.getClass(), "primary", term8821);
        setField(term8825, term8825.getClass(), "toStringCache", "RMFIsYGgne");
        setField(term8825, term8825.getClass(), "value", term8828);
        setByteField(term8825, term8825.getClass(), "coder", (byte) 48);
        setIntField(term8825, term8825.getClass(), "count", 1484323161);
        setField(term8820, term8820.getClass(), "alternate", term8825);
        setIntField(term8820, term8820.getClass(), "maxLength", 391863371);
        setField(term8820, term8820.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "MjGYSRKTNF";
        args[1] = term192;
        args[2] = term258;
        Object retValue = callMethod(klass, "handleAEIOUY", argTypes, term178, args);
        assertTrue(recursiveEquals(term178, term8817));
        assertTrue(recursiveEquals(term192, term8820));
        assertTrue(recursiveEquals(term258, -1922583790));
        assertTrue(recursiveEquals(retValue, -1922583789));
    }

};


