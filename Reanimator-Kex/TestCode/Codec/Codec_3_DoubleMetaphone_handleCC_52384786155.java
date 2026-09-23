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

public class DoubleMetaphone_handleCC_52384786155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;
     Object term480;
     Object term546;

    public DoubleMetaphone_handleCC_52384786155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term466, term466.getClass(), "maxCodeLen", 4);
        term480 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term481 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term494 = (byte[]) newByteArray(16);
        Object term513 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term526 = (byte[]) newByteArray(16);
        setField(term481, term481.getClass(), "toStringCache", "oVcInYnLWB");
        setField(term481, term481.getClass(), "value", term494);
        setByteField(term481, term481.getClass(), "coder", (byte) 18);
        setIntField(term481, term481.getClass(), "count", -1339778481);
        setField(term480, term480.getClass(), "primary", term481);
        setField(term513, term513.getClass(), "toStringCache", "aJlieCFVtF");
        setField(term513, term513.getClass(), "value", term526);
        setByteField(term513, term513.getClass(), "coder", (byte) -58);
        setIntField(term513, term513.getClass(), "count", 1725571209);
        setField(term480, term480.getClass(), "alternate", term513);
        setIntField(term480, term480.getClass(), "maxLength", -522618178);
        setField(term480, term480.getClass(), "this$0", null);
        term546 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "LQFpaHEwXR";
        args[1] = term480;
        args[2] = term546;
        try {
            callMethod(klass, "handleCC", argTypes, term466, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


