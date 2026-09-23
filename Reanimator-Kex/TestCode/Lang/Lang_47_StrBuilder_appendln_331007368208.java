package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_appendln_331007368208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4779;
     Object term4850;
     Object term4852;

    public StrBuilder_appendln_331007368208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4779 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4780 = (char[]) newCharArray(32);
        setField(term4779, term4779.getClass(), "buffer", term4780);
        setIntField(term4779, term4779.getClass(), "size", -1371869594);
        setField(term4779, term4779.getClass(), "newLine", "PkWMRdJcBb");
        setField(term4779, term4779.getClass(), "nullText", "jSpAteRute");
        term4850 = new Integer(-2095575670);
        term4852 = new Integer(1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "swZVeJAxjt";
        args[1] = term4850;
        args[2] = term4852;
        try {
            callMethod(klass, "appendln", argTypes, term4779, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


