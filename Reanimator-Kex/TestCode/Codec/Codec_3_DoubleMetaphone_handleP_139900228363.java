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

public class DoubleMetaphone_handleP_139900228363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1622;
     Object term1636;
     Object term1702;

    public DoubleMetaphone_handleP_139900228363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1622 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1622, term1622.getClass(), "maxCodeLen", 4);
        term1636 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1637 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1650 = (byte[]) newByteArray(16);
        Object term1669 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1682 = (byte[]) newByteArray(16);
        setField(term1637, term1637.getClass(), "toStringCache", "nyiiPDVjAc");
        setField(term1637, term1637.getClass(), "value", term1650);
        setByteField(term1637, term1637.getClass(), "coder", (byte) 121);
        setIntField(term1637, term1637.getClass(), "count", 767834723);
        setField(term1636, term1636.getClass(), "primary", term1637);
        setField(term1669, term1669.getClass(), "toStringCache", "aKnKipADSo");
        setField(term1669, term1669.getClass(), "value", term1682);
        setByteField(term1669, term1669.getClass(), "coder", (byte) -99);
        setIntField(term1669, term1669.getClass(), "count", -602026508);
        setField(term1636, term1636.getClass(), "alternate", term1669);
        setIntField(term1636, term1636.getClass(), "maxLength", -157887805);
        setField(term1636, term1636.getClass(), "this$0", null);
        term1702 = new Integer(1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "IDCWpPLRkE";
        args[1] = term1636;
        args[2] = term1702;
        try {
            callMethod(klass, "handleP", argTypes, term1622, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


