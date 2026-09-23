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

public class DoubleMetaphone_handleL_139900612762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1478;
     Object term1492;
     Object term1558;

    public DoubleMetaphone_handleL_139900612762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1478 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1478, term1478.getClass(), "maxCodeLen", 4);
        term1492 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1493 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1506 = (byte[]) newByteArray(16);
        Object term1525 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1538 = (byte[]) newByteArray(16);
        setField(term1493, term1493.getClass(), "toStringCache", "Ghbwtircqb");
        setField(term1493, term1493.getClass(), "value", term1506);
        setByteField(term1493, term1493.getClass(), "coder", (byte) 78);
        setIntField(term1493, term1493.getClass(), "count", -469968304);
        setField(term1492, term1492.getClass(), "primary", term1493);
        setField(term1525, term1525.getClass(), "toStringCache", "xrwlQZdwCp");
        setField(term1525, term1525.getClass(), "value", term1538);
        setByteField(term1525, term1525.getClass(), "coder", (byte) 87);
        setIntField(term1525, term1525.getClass(), "count", -1145578966);
        setField(term1492, term1492.getClass(), "alternate", term1525);
        setIntField(term1492, term1492.getClass(), "maxLength", 679763016);
        setField(term1492, term1492.getClass(), "this$0", null);
        term1558 = new Integer(1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "kuTXqwMtDB";
        args[1] = term1492;
        args[2] = term1558;
        try {
            callMethod(klass, "handleL", argTypes, term1478, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


