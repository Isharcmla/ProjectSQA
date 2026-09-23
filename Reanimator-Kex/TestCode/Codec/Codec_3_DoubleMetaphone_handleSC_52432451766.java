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

public class DoubleMetaphone_handleSC_52432451766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2058;
     Object term2072;
     Object term2138;

    public DoubleMetaphone_handleSC_52432451766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2058 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term2058, term2058.getClass(), "maxCodeLen", 4);
        term2072 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term2073 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2086 = (byte[]) newByteArray(16);
        Object term2105 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2118 = (byte[]) newByteArray(16);
        setField(term2073, term2073.getClass(), "toStringCache", "LvtrsXUliU");
        setField(term2073, term2073.getClass(), "value", term2086);
        setByteField(term2073, term2073.getClass(), "coder", (byte) 23);
        setIntField(term2073, term2073.getClass(), "count", 2055867847);
        setField(term2072, term2072.getClass(), "primary", term2073);
        setField(term2105, term2105.getClass(), "toStringCache", "xLbjWUgOIL");
        setField(term2105, term2105.getClass(), "value", term2118);
        setByteField(term2105, term2105.getClass(), "coder", (byte) -15);
        setIntField(term2105, term2105.getClass(), "count", -1048298087);
        setField(term2072, term2072.getClass(), "alternate", term2105);
        setIntField(term2072, term2072.getClass(), "maxLength", 292681826);
        setField(term2072, term2072.getClass(), "this$0", null);
        term2138 = new Integer(458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "tShwQLRGNe";
        args[1] = term2072;
        args[2] = term2138;
        try {
            callMethod(klass, "handleSC", argTypes, term2058, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


