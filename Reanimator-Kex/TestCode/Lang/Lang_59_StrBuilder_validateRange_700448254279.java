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

public class StrBuilder_validateRange_700448254279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12956;
     Object term13015;
     Object term13017;

    public StrBuilder_validateRange_700448254279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12956 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12957 = (char[]) newCharArray(32);
        setField(term12956, term12956.getClass(), "buffer", term12957);
        setIntField(term12956, term12956.getClass(), "size", -1504890659);
        setField(term12956, term12956.getClass(), "newLine", "NTlKJDDWlk");
        setField(term12956, term12956.getClass(), "nullText", "vOuMEpOQAg");
        term13015 = new Integer(1358829571);
        term13017 = new Integer(991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term13015;
        args[1] = term13017;
        try {
            callMethod(klass, "validateRange", argTypes, term12956, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


