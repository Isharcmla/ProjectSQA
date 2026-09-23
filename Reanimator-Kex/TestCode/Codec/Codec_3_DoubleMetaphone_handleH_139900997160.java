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

public class DoubleMetaphone_handleH_139900997160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1188;
     Object term1202;
     Object term1268;
     Object term11675;
     Object term11678;

    public DoubleMetaphone_handleH_139900997160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1188 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1188, term1188.getClass(), "maxCodeLen", 4);
        term1202 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1203 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1216 = (byte[]) newByteArray(16);
        Object term1235 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1248 = (byte[]) newByteArray(16);
        setField(term1203, term1203.getClass(), "toStringCache", "TEParAifyi");
        setField(term1203, term1203.getClass(), "value", term1216);
        setByteField(term1203, term1203.getClass(), "coder", (byte) -71);
        setIntField(term1203, term1203.getClass(), "count", -244121226);
        setField(term1202, term1202.getClass(), "primary", term1203);
        setField(term1235, term1235.getClass(), "toStringCache", "OWDIEULEFu");
        setField(term1235, term1235.getClass(), "value", term1248);
        setByteField(term1235, term1235.getClass(), "coder", (byte) 49);
        setIntField(term1235, term1235.getClass(), "count", -203030934);
        setField(term1202, term1202.getClass(), "alternate", term1235);
        setIntField(term1202, term1202.getClass(), "maxLength", -1179120542);
        setField(term1202, term1202.getClass(), "this$0", null);
        term1268 = new Integer(-73683645);
        term11675 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term11675, term11675.getClass(), "maxCodeLen", 4);
        term11678 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term11679 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term11682 = (byte[]) newByteArray(16);
        Object term11683 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term11686 = (byte[]) newByteArray(16);
        setField(term11679, term11679.getClass(), "toStringCache", "TEParAifyi");
        setField(term11679, term11679.getClass(), "value", term11682);
        setByteField(term11679, term11679.getClass(), "coder", (byte) -71);
        setIntField(term11679, term11679.getClass(), "count", -244121226);
        setField(term11678, term11678.getClass(), "primary", term11679);
        setField(term11683, term11683.getClass(), "toStringCache", "OWDIEULEFu");
        setField(term11683, term11683.getClass(), "value", term11686);
        setByteField(term11683, term11683.getClass(), "coder", (byte) 49);
        setIntField(term11683, term11683.getClass(), "count", -203030934);
        setField(term11678, term11678.getClass(), "alternate", term11683);
        setIntField(term11678, term11678.getClass(), "maxLength", -1179120542);
        setField(term11678, term11678.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "IoAlmYsBwc";
        args[1] = term1202;
        args[2] = term1268;
        Object retValue = callMethod(klass, "handleH", argTypes, term1188, args);
        assertTrue(recursiveEquals(term1188, term11675));
        assertTrue(recursiveEquals(term1202, term11678));
        assertTrue(recursiveEquals(term1268, -73683645));
        assertTrue(recursiveEquals(retValue, -73683644));
    }

};


