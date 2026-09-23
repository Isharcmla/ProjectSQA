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

public class DoubleMetaphone_handleD_139901381557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754;
     Object term768;
     Object term834;

    public DoubleMetaphone_handleD_139901381557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term754, term754.getClass(), "maxCodeLen", 4);
        term768 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term769 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term782 = (byte[]) newByteArray(16);
        Object term801 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term814 = (byte[]) newByteArray(16);
        setField(term769, term769.getClass(), "toStringCache", "hNxWaHcfhY");
        setField(term769, term769.getClass(), "value", term782);
        setByteField(term769, term769.getClass(), "coder", (byte) -10);
        setIntField(term769, term769.getClass(), "count", -1456670397);
        setField(term768, term768.getClass(), "primary", term769);
        setField(term801, term801.getClass(), "toStringCache", "RkybSrpybU");
        setField(term801, term801.getClass(), "value", term814);
        setByteField(term801, term801.getClass(), "coder", (byte) 79);
        setIntField(term801, term801.getClass(), "count", 1622346318);
        setField(term768, term768.getClass(), "alternate", term801);
        setIntField(term768, term768.getClass(), "maxLength", 1048535127);
        setField(term768, term768.getClass(), "this$0", null);
        term834 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "pCTimMblYc";
        args[1] = term768;
        args[2] = term834;
        try {
            callMethod(klass, "handleD", argTypes, term754, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


