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

public class DoubleMetaphone_handleGH_52397183059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1044;
     Object term1058;
     Object term1124;
     Object term11449;
     Object term11452;

    public DoubleMetaphone_handleGH_52397183059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1044 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1044, term1044.getClass(), "maxCodeLen", 4);
        term1058 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1059 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1072 = (byte[]) newByteArray(16);
        Object term1091 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1104 = (byte[]) newByteArray(16);
        setField(term1059, term1059.getClass(), "toStringCache", "flxyYxBRtu");
        setField(term1059, term1059.getClass(), "value", term1072);
        setByteField(term1059, term1059.getClass(), "coder", (byte) 83);
        setIntField(term1059, term1059.getClass(), "count", 1135664017);
        setField(term1058, term1058.getClass(), "primary", term1059);
        setField(term1091, term1091.getClass(), "toStringCache", "OclPbYPkcH");
        setField(term1091, term1091.getClass(), "value", term1104);
        setByteField(term1091, term1091.getClass(), "coder", (byte) 74);
        setIntField(term1091, term1091.getClass(), "count", 590364439);
        setField(term1058, term1058.getClass(), "alternate", term1091);
        setIntField(term1058, term1058.getClass(), "maxLength", 865208305);
        setField(term1058, term1058.getClass(), "this$0", null);
        term1124 = new Integer(-1275173084);
        term11449 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term11449, term11449.getClass(), "maxCodeLen", 4);
        term11452 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term11453 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term11456 = (byte[]) newByteArray(16);
        Object term11457 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term11460 = (byte[]) newByteArray(16);
        setField(term11453, term11453.getClass(), "toStringCache", "flxyYxBRtu");
        setField(term11453, term11453.getClass(), "value", term11456);
        setByteField(term11453, term11453.getClass(), "coder", (byte) 83);
        setIntField(term11453, term11453.getClass(), "count", 1135664017);
        setField(term11452, term11452.getClass(), "primary", term11453);
        setField(term11457, term11457.getClass(), "toStringCache", "OclPbYPkcH");
        setField(term11457, term11457.getClass(), "value", term11460);
        setByteField(term11457, term11457.getClass(), "coder", (byte) 74);
        setIntField(term11457, term11457.getClass(), "count", 590364439);
        setField(term11452, term11452.getClass(), "alternate", term11457);
        setIntField(term11452, term11452.getClass(), "maxLength", 865208305);
        setField(term11452, term11452.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "vrQLuWIDJX";
        args[1] = term1058;
        args[2] = term1124;
        Object retValue = callMethod(klass, "handleGH", argTypes, term1044, args);
        assertTrue(recursiveEquals(term1044, term11449));
        assertTrue(recursiveEquals(term1058, term11452));
        assertTrue(recursiveEquals(term1124, -1275173084));
        assertTrue(recursiveEquals(retValue, -1275173082));
    }

};


