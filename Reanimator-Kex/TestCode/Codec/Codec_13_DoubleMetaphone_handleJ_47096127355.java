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

public class DoubleMetaphone_handleJ_47096127355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term958;
     Object term972;
     Object term1014;
     Object term1016;
     Object term8921;
     Object term8924;

    public DoubleMetaphone_handleJ_47096127355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term958 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term958, term958.getClass(), "maxCodeLen", 4);
        term972 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term973 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term974 = (byte[]) newByteArray(16);
        Object term993 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term994 = (byte[]) newByteArray(16);
        setField(term973, term973.getClass(), "value", term974);
        setByteField(term973, term973.getClass(), "coder", (byte) -54);
        setIntField(term973, term973.getClass(), "count", -226514366);
        setField(term972, term972.getClass(), "primary", term973);
        setField(term993, term993.getClass(), "value", term994);
        setByteField(term993, term993.getClass(), "coder", (byte) 67);
        setIntField(term993, term993.getClass(), "count", 1193880199);
        setField(term972, term972.getClass(), "alternate", term993);
        setIntField(term972, term972.getClass(), "maxLength", -1087774327);
        setField(term972, term972.getClass(), "this$0", null);
        term1014 = new Integer(-1530420153);
        term1016 = new Boolean(false);
        term8921 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term8921, term8921.getClass(), "maxCodeLen", 4);
        term8924 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term8925 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8926 = (byte[]) newByteArray(16);
        Object term8927 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8928 = (byte[]) newByteArray(16);
        setField(term8925, term8925.getClass(), "value", term8926);
        setByteField(term8925, term8925.getClass(), "coder", (byte) -54);
        setIntField(term8925, term8925.getClass(), "count", -226514366);
        setField(term8924, term8924.getClass(), "primary", term8925);
        setField(term8927, term8927.getClass(), "value", term8928);
        setByteField(term8927, term8927.getClass(), "coder", (byte) 67);
        setIntField(term8927, term8927.getClass(), "count", 1193880199);
        setField(term8924, term8924.getClass(), "alternate", term8927);
        setIntField(term8924, term8924.getClass(), "maxLength", -1087774327);
        setField(term8924, term8924.getClass(), "this$0", null);
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
        args[0] = "oVcInYnLWB";
        args[1] = term972;
        args[2] = term1014;
        args[3] = term1016;
        Object retValue = callMethod(klass, "handleJ", argTypes, term958, args);
        assertTrue(recursiveEquals(term958, term8921));
        assertTrue(recursiveEquals(term972, -1530420153));
        assertTrue(recursiveEquals(term1014, term8924));
        assertTrue(recursiveEquals(term1016, false));
        assertTrue(recursiveEquals(retValue, -1530420152));
    }

};


