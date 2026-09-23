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

public class DoubleMetaphone_handleH_139900997154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term858;
     Object term872;
     Object term914;
     Object term8684;
     Object term8687;

    public DoubleMetaphone_handleH_139900997154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term858 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term858, term858.getClass(), "maxCodeLen", 4);
        term872 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term873 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term874 = (byte[]) newByteArray(16);
        Object term893 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term894 = (byte[]) newByteArray(16);
        setField(term873, term873.getClass(), "value", term874);
        setByteField(term873, term873.getClass(), "coder", (byte) -71);
        setIntField(term873, term873.getClass(), "count", -244121226);
        setField(term872, term872.getClass(), "primary", term873);
        setField(term893, term893.getClass(), "value", term894);
        setByteField(term893, term893.getClass(), "coder", (byte) 49);
        setIntField(term893, term893.getClass(), "count", -203030934);
        setField(term872, term872.getClass(), "alternate", term893);
        setIntField(term872, term872.getClass(), "maxLength", -1179120542);
        setField(term872, term872.getClass(), "this$0", null);
        term914 = new Integer(-73683645);
        term8684 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term8684, term8684.getClass(), "maxCodeLen", 4);
        term8687 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term8688 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8689 = (byte[]) newByteArray(16);
        Object term8690 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8691 = (byte[]) newByteArray(16);
        setField(term8688, term8688.getClass(), "value", term8689);
        setByteField(term8688, term8688.getClass(), "coder", (byte) -71);
        setIntField(term8688, term8688.getClass(), "count", -244121226);
        setField(term8687, term8687.getClass(), "primary", term8688);
        setField(term8690, term8690.getClass(), "value", term8691);
        setByteField(term8690, term8690.getClass(), "coder", (byte) 49);
        setIntField(term8690, term8690.getClass(), "count", -203030934);
        setField(term8687, term8687.getClass(), "alternate", term8690);
        setIntField(term8687, term8687.getClass(), "maxLength", -1179120542);
        setField(term8687, term8687.getClass(), "this$0", null);
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
        args[1] = term872;
        args[2] = term914;
        Object retValue = callMethod(klass, "handleH", argTypes, term858, args);
        assertTrue(recursiveEquals(term858, term8684));
        assertTrue(recursiveEquals(term872, term8687));
        assertTrue(recursiveEquals(term914, -73683645));
        assertTrue(recursiveEquals(retValue, -73683644));
    }

};


