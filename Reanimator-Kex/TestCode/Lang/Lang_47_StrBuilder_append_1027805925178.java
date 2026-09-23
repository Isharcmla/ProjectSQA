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
import java.lang.Long;

public class StrBuilder_append_1027805925178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4195;
     Object term4254;

    public StrBuilder_append_1027805925178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4195 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4196 = (char[]) newCharArray(32);
        setField(term4195, term4195.getClass(), "buffer", term4196);
        setIntField(term4195, term4195.getClass(), "size", -184153539);
        setField(term4195, term4195.getClass(), "newLine", "vQVyKLdtaz");
        setField(term4195, term4195.getClass(), "nullText", "OWKQODBLzb");
        term4254 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4254;
        try {
            callMethod(klass, "append", argTypes, term4195, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


