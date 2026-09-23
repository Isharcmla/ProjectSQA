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

public class DoubleMetaphone_handleGH_52397183053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758;
     Object term772;
     Object term814;
     Object term8526;
     Object term8529;

    public DoubleMetaphone_handleGH_52397183053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term758 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term758, term758.getClass(), "maxCodeLen", 4);
        term772 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term773 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term774 = (byte[]) newByteArray(16);
        Object term793 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term794 = (byte[]) newByteArray(16);
        setField(term773, term773.getClass(), "value", term774);
        setByteField(term773, term773.getClass(), "coder", (byte) 83);
        setIntField(term773, term773.getClass(), "count", 1135664017);
        setField(term772, term772.getClass(), "primary", term773);
        setField(term793, term793.getClass(), "value", term794);
        setByteField(term793, term793.getClass(), "coder", (byte) 74);
        setIntField(term793, term793.getClass(), "count", 590364439);
        setField(term772, term772.getClass(), "alternate", term793);
        setIntField(term772, term772.getClass(), "maxLength", 865208305);
        setField(term772, term772.getClass(), "this$0", null);
        term814 = new Integer(-1275173084);
        term8526 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term8526, term8526.getClass(), "maxCodeLen", 4);
        term8529 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term8530 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8531 = (byte[]) newByteArray(16);
        Object term8532 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8533 = (byte[]) newByteArray(16);
        setField(term8530, term8530.getClass(), "value", term8531);
        setByteField(term8530, term8530.getClass(), "coder", (byte) 83);
        setIntField(term8530, term8530.getClass(), "count", 1135664017);
        setField(term8529, term8529.getClass(), "primary", term8530);
        setField(term8532, term8532.getClass(), "value", term8533);
        setByteField(term8532, term8532.getClass(), "coder", (byte) 74);
        setIntField(term8532, term8532.getClass(), "count", 590364439);
        setField(term8529, term8529.getClass(), "alternate", term8532);
        setIntField(term8529, term8529.getClass(), "maxLength", 865208305);
        setField(term8529, term8529.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "MxlszYVzRf";
        args[1] = term772;
        args[2] = term814;
        Object retValue = callMethod(klass, "handleGH", argTypes, term758, args);
        assertTrue(recursiveEquals(term758, term8526));
        assertTrue(recursiveEquals(term772, term8529));
        assertTrue(recursiveEquals(term814, -1275173084));
        assertTrue(recursiveEquals(retValue, -1275173082));
    }

};


