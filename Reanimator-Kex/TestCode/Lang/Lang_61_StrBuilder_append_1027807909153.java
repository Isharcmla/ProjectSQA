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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class StrBuilder_append_1027807909153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3856;
     Object term3915;

    public StrBuilder_append_1027807909153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3856 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term3857 = (char[]) newCharArray(32);
        setField(term3856, term3856.getClass(), "buffer", term3857);
        setIntField(term3856, term3856.getClass(), "size", 2055867847);
        setField(term3856, term3856.getClass(), "newLine", "IgRJUzaCwW");
        setField(term3856, term3856.getClass(), "nullText", "JUmudUmaaV");
        term3915 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3915;
        try {
            callMethod(klass, "append", argTypes, term3856, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


