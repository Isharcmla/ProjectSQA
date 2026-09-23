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
import java.lang.Boolean;

public class DoubleMetaphone_handleG_47096415658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term898;
     Object term912;
     Object term978;
     Object term980;

    public DoubleMetaphone_handleG_47096415658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term898 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term898, term898.getClass(), "maxCodeLen", 4);
        term912 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term913 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term926 = (byte[]) newByteArray(16);
        Object term945 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term958 = (byte[]) newByteArray(16);
        setField(term913, term913.getClass(), "toStringCache", "eZFUvlxvGV");
        setField(term913, term913.getClass(), "value", term926);
        setByteField(term913, term913.getClass(), "coder", (byte) -119);
        setIntField(term913, term913.getClass(), "count", -6029667);
        setField(term912, term912.getClass(), "primary", term913);
        setField(term945, term945.getClass(), "toStringCache", "BYqFIqCKAV");
        setField(term945, term945.getClass(), "value", term958);
        setByteField(term945, term945.getClass(), "coder", (byte) -66);
        setIntField(term945, term945.getClass(), "count", -2068769794);
        setField(term912, term912.getClass(), "alternate", term945);
        setIntField(term912, term912.getClass(), "maxLength", -117576464);
        setField(term912, term912.getClass(), "this$0", null);
        term978 = new Integer(-1007160944);
        term980 = new Boolean(false);
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
        args[0] = "xOEqzGAmDU";
        args[1] = term912;
        args[2] = term978;
        args[3] = term980;
        try {
            callMethod(klass, "handleG", argTypes, term898, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


