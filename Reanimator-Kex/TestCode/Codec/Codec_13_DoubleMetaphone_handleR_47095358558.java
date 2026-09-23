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
import java.lang.Boolean;

public class DoubleMetaphone_handleR_47095358558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1260;
     Object term1274;
     Object term1316;
     Object term1318;
     Object term9882;
     Object term9883;

    public DoubleMetaphone_handleR_47095358558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1260 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1260, term1260.getClass(), "maxCodeLen", 4);
        term1274 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1275 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1276 = (byte[]) newByteArray(16);
        Object term1295 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1296 = (byte[]) newByteArray(16);
        setField(term1275, term1275.getClass(), "value", term1276);
        setByteField(term1275, term1275.getClass(), "coder", (byte) -2);
        setIntField(term1275, term1275.getClass(), "count", -817164822);
        setField(term1274, term1274.getClass(), "primary", term1275);
        setField(term1295, term1295.getClass(), "value", term1296);
        setByteField(term1295, term1295.getClass(), "coder", (byte) -16);
        setIntField(term1295, term1295.getClass(), "count", -1016503459);
        setField(term1274, term1274.getClass(), "alternate", term1295);
        setIntField(term1274, term1274.getClass(), "maxLength", -1968847291);
        setField(term1274, term1274.getClass(), "this$0", null);
        term1316 = new Integer(579005622);
        term1318 = new Boolean(true);
        term9882 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term9882, term9882.getClass(), "maxCodeLen", 4);
        term9883 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term9884 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9885 = (byte[]) newByteArray(16);
        Object term9886 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9887 = (byte[]) newByteArray(16);
        setField(term9884, term9884.getClass(), "value", term9885);
        setByteField(term9884, term9884.getClass(), "coder", (byte) -2);
        setIntField(term9884, term9884.getClass(), "count", -817164822);
        setField(term9883, term9883.getClass(), "primary", term9884);
        setField(term9886, term9886.getClass(), "value", term9887);
        setByteField(term9886, term9886.getClass(), "coder", (byte) -16);
        setIntField(term9886, term9886.getClass(), "count", -1016503459);
        setField(term9883, term9883.getClass(), "alternate", term9886);
        setIntField(term9883, term9883.getClass(), "maxLength", -1968847291);
        setField(term9883, term9883.getClass(), "this$0", null);
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
        args[0] = "tbcdzjIfER";
        args[1] = term1274;
        args[2] = term1316;
        args[3] = term1318;
        Object retValue = callMethod(klass, "handleR", argTypes, term1260, args);
        assertTrue(recursiveEquals(term1260, term9882));
        assertTrue(recursiveEquals(term1274, "tbcdzjIfER"));
        assertTrue(recursiveEquals(term1316, 579005622));
        assertTrue(recursiveEquals(term1318, true));
        assertTrue(recursiveEquals(retValue, 579005623));
    }

};


