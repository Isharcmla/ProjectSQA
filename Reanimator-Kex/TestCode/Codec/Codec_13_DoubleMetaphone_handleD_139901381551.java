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

public class DoubleMetaphone_handleD_139901381551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556;
     Object term570;
     Object term612;

    public DoubleMetaphone_handleD_139901381551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term556, term556.getClass(), "maxCodeLen", 4);
        term570 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term571 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term572 = (byte[]) newByteArray(16);
        Object term591 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term592 = (byte[]) newByteArray(16);
        setField(term571, term571.getClass(), "value", term572);
        setByteField(term571, term571.getClass(), "coder", (byte) -10);
        setIntField(term571, term571.getClass(), "count", -1456670397);
        setField(term570, term570.getClass(), "primary", term571);
        setField(term591, term591.getClass(), "value", term592);
        setByteField(term591, term591.getClass(), "coder", (byte) 79);
        setIntField(term591, term591.getClass(), "count", 1622346318);
        setField(term570, term570.getClass(), "alternate", term591);
        setIntField(term570, term570.getClass(), "maxLength", 1048535127);
        setField(term570, term570.getClass(), "this$0", null);
        term612 = new Integer(-655067527);
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
        args[1] = term570;
        args[2] = term612;
        try {
            callMethod(klass, "handleD", argTypes, term556, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


