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
import java.lang.OutOfMemoryError;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class DoubleMetaphone_handleZ_47094589764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1864;
     Object term1878;
     Object term1920;
     Object term1922;

    public DoubleMetaphone_handleZ_47094589764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1864 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1864, term1864.getClass(), "maxCodeLen", 4);
        term1878 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1879 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1880 = (byte[]) newByteArray(16);
        Object term1899 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1900 = (byte[]) newByteArray(16);
        setField(term1879, term1879.getClass(), "value", term1880);
        setByteField(term1879, term1879.getClass(), "coder", (byte) -121);
        setIntField(term1879, term1879.getClass(), "count", 933028652);
        setField(term1878, term1878.getClass(), "primary", term1879);
        setField(term1899, term1899.getClass(), "value", term1900);
        setByteField(term1899, term1899.getClass(), "coder", (byte) -119);
        setIntField(term1899, term1899.getClass(), "count", 287287233);
        setField(term1878, term1878.getClass(), "alternate", term1899);
        setIntField(term1878, term1878.getClass(), "maxLength", 962840079);
        setField(term1878, term1878.getClass(), "this$0", null);
        term1920 = new Integer(1540719661);
        term1922 = new Boolean(true);
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
        args[0] = "eZFUvlxvGV";
        args[1] = term1878;
        args[2] = term1920;
        args[3] = term1922;
        try {
            callMethod(klass, "handleZ", argTypes, term1864, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


