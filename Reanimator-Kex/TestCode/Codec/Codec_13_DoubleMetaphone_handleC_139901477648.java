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

public class DoubleMetaphone_handleC_139901477648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;
     Object term270;
     Object term312;
     Object term6658;
     Object term6661;

    public DoubleMetaphone_handleC_139901477648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term256, term256.getClass(), "maxCodeLen", 4);
        term270 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term271 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term272 = (byte[]) newByteArray(16);
        Object term291 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term292 = (byte[]) newByteArray(16);
        setField(term271, term271.getClass(), "value", term272);
        setByteField(term271, term271.getClass(), "coder", (byte) 89);
        setIntField(term271, term271.getClass(), "count", -616727354);
        setField(term270, term270.getClass(), "primary", term271);
        setField(term291, term291.getClass(), "value", term292);
        setByteField(term291, term291.getClass(), "coder", (byte) 75);
        setIntField(term291, term291.getClass(), "count", -1955890973);
        setField(term270, term270.getClass(), "alternate", term291);
        setIntField(term270, term270.getClass(), "maxLength", -2038273078);
        setField(term270, term270.getClass(), "this$0", null);
        term312 = new Integer(1227103734);
        term6658 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term6658, term6658.getClass(), "maxCodeLen", 4);
        term6661 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term6662 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6663 = (byte[]) newByteArray(16);
        Object term6664 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6665 = (byte[]) newByteArray(16);
        setField(term6662, term6662.getClass(), "value", term6663);
        setByteField(term6662, term6662.getClass(), "coder", (byte) 89);
        setIntField(term6662, term6662.getClass(), "count", -616727354);
        setField(term6661, term6661.getClass(), "primary", term6662);
        setField(term6664, term6664.getClass(), "value", term6665);
        setByteField(term6664, term6664.getClass(), "coder", (byte) 75);
        setIntField(term6664, term6664.getClass(), "count", -1955890973);
        setField(term6661, term6661.getClass(), "alternate", term6664);
        setIntField(term6661, term6661.getClass(), "maxLength", -2038273078);
        setField(term6661, term6661.getClass(), "this$0", null);
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
        args[1] = term270;
        args[2] = term312;
        Object retValue = callMethod(klass, "handleC", argTypes, term256, args);
        assertTrue(recursiveEquals(term256, term6658));
        assertTrue(recursiveEquals(term270, 1227103734));
        assertTrue(recursiveEquals(term312, term6661));
        assertTrue(recursiveEquals(retValue, 1227103735));
    }

};


