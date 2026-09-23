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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_contains_528601805317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12870;
     Object term93151;

    public StrBuilder_contains_528601805317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12870 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12871 = (char[]) newCharArray(32);
        setField(term12870, term12870.getClass(), "buffer", term12871);
        setIntField(term12870, term12870.getClass(), "size", -1896376975);
        setField(term12870, term12870.getClass(), "newLine", "WVRMUmrljA");
        setField(term12870, term12870.getClass(), "nullText", "NTlKJDDWlk");
        term93151 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term93152 = (char[]) newCharArray(32);
        setField(term93151, term93151.getClass(), "buffer", term93152);
        setIntField(term93151, term93151.getClass(), "size", -1896376975);
        setField(term93151, term93151.getClass(), "newLine", "WVRMUmrljA");
        setField(term93151, term93151.getClass(), "nullText", "NTlKJDDWlk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOuMEpOQAg";
        Object retValue = callMethod(klass, "contains", argTypes, term12870, args);
        assertTrue(recursiveEquals(term12870, term93151));
        assertTrue(recursiveEquals(retValue, false));
    }

};


