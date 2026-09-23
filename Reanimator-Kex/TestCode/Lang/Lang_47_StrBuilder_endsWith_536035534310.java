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

public class StrBuilder_endsWith_536035534310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12055;
     Object term91222;

    public StrBuilder_endsWith_536035534310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12055 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12056 = (char[]) newCharArray(32);
        setField(term12055, term12055.getClass(), "buffer", term12056);
        setIntField(term12055, term12055.getClass(), "size", -601863069);
        setField(term12055, term12055.getClass(), "newLine", "xvkbvaEGYd");
        setField(term12055, term12055.getClass(), "nullText", "HBGNxdNURv");
        term91222 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term91223 = (char[]) newCharArray(32);
        setField(term91222, term91222.getClass(), "buffer", term91223);
        setIntField(term91222, term91222.getClass(), "size", -601863069);
        setField(term91222, term91222.getClass(), "newLine", "xvkbvaEGYd");
        setField(term91222, term91222.getClass(), "nullText", "HBGNxdNURv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mfCpTPPQQm";
        Object retValue = callMethod(klass, "endsWith", argTypes, term12055, args);
        assertTrue(recursiveEquals(term12055, term91222));
        assertTrue(recursiveEquals(retValue, false));
    }

};


