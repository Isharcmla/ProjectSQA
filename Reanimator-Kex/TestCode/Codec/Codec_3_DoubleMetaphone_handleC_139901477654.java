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

public class DoubleMetaphone_handleC_139901477654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;
     Object term336;
     Object term402;
     Object term9264;
     Object term9267;

    public DoubleMetaphone_handleC_139901477654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term322, term322.getClass(), "maxCodeLen", 4);
        term336 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term337 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term350 = (byte[]) newByteArray(16);
        Object term369 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term382 = (byte[]) newByteArray(16);
        setField(term337, term337.getClass(), "toStringCache", "uuaPigETmJ");
        setField(term337, term337.getClass(), "value", term350);
        setByteField(term337, term337.getClass(), "coder", (byte) 89);
        setIntField(term337, term337.getClass(), "count", -616727354);
        setField(term336, term336.getClass(), "primary", term337);
        setField(term369, term369.getClass(), "toStringCache", "MxlszYVzRf");
        setField(term369, term369.getClass(), "value", term382);
        setByteField(term369, term369.getClass(), "coder", (byte) 75);
        setIntField(term369, term369.getClass(), "count", -1955890973);
        setField(term336, term336.getClass(), "alternate", term369);
        setIntField(term336, term336.getClass(), "maxLength", -2038273078);
        setField(term336, term336.getClass(), "this$0", null);
        term402 = new Integer(1227103734);
        term9264 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term9264, term9264.getClass(), "maxCodeLen", 4);
        term9267 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term9268 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term9271 = (byte[]) newByteArray(16);
        Object term9272 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term9275 = (byte[]) newByteArray(16);
        setField(term9268, term9268.getClass(), "toStringCache", "uuaPigETmJ");
        setField(term9268, term9268.getClass(), "value", term9271);
        setByteField(term9268, term9268.getClass(), "coder", (byte) 89);
        setIntField(term9268, term9268.getClass(), "count", -616727354);
        setField(term9267, term9267.getClass(), "primary", term9268);
        setField(term9272, term9272.getClass(), "toStringCache", "MxlszYVzRf");
        setField(term9272, term9272.getClass(), "value", term9275);
        setByteField(term9272, term9272.getClass(), "coder", (byte) 75);
        setIntField(term9272, term9272.getClass(), "count", -1955890973);
        setField(term9267, term9267.getClass(), "alternate", term9272);
        setIntField(term9267, term9267.getClass(), "maxLength", -2038273078);
        setField(term9267, term9267.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "NRdvgJlhkX";
        args[1] = term336;
        args[2] = term402;
        Object retValue = callMethod(klass, "handleC", argTypes, term322, args);
        assertTrue(recursiveEquals(term322, term9264));
        assertTrue(recursiveEquals(term336, 1227103734));
        assertTrue(recursiveEquals(term402, term9267));
        assertTrue(recursiveEquals(retValue, 1227103735));
    }

};


