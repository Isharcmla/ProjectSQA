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

public class DoubleMetaphone_handleAEIOUY_7650695047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;
     Object term180;
     Object term222;
     Object term6384;
     Object term6385;

    public DoubleMetaphone_handleAEIOUY_7650695047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term178, term178.getClass(), "maxCodeLen", 4);
        term180 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term181 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term182 = (byte[]) newByteArray(16);
        Object term201 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term202 = (byte[]) newByteArray(16);
        setField(term181, term181.getClass(), "value", term182);
        setByteField(term181, term181.getClass(), "coder", (byte) 47);
        setIntField(term181, term181.getClass(), "count", 1162663216);
        setField(term180, term180.getClass(), "primary", term181);
        setField(term201, term201.getClass(), "value", term202);
        setByteField(term201, term201.getClass(), "coder", (byte) 48);
        setIntField(term201, term201.getClass(), "count", 1484323161);
        setField(term180, term180.getClass(), "alternate", term201);
        setIntField(term180, term180.getClass(), "maxLength", 391863371);
        setField(term180, term180.getClass(), "this$0", null);
        term222 = new Integer(-1922583790);
        term6384 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term6384, term6384.getClass(), "maxCodeLen", 4);
        term6385 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term6386 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6387 = (byte[]) newByteArray(16);
        Object term6388 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6389 = (byte[]) newByteArray(16);
        setField(term6386, term6386.getClass(), "value", term6387);
        setByteField(term6386, term6386.getClass(), "coder", (byte) 47);
        setIntField(term6386, term6386.getClass(), "count", 1162663216);
        setField(term6385, term6385.getClass(), "primary", term6386);
        setField(term6388, term6388.getClass(), "value", term6389);
        setByteField(term6388, term6388.getClass(), "coder", (byte) 48);
        setIntField(term6388, term6388.getClass(), "count", 1484323161);
        setField(term6385, term6385.getClass(), "alternate", term6388);
        setIntField(term6385, term6385.getClass(), "maxLength", 391863371);
        setField(term6385, term6385.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term180;
        args[1] = term222;
        Object retValue = callMethod(klass, "handleAEIOUY", argTypes, term178, args);
        assertTrue(recursiveEquals(term178, term6384));
        assertTrue(recursiveEquals(term180, term6385));
        assertTrue(recursiveEquals(term222, -1922583790));
        assertTrue(recursiveEquals(retValue, -1922583789));
    }

};


