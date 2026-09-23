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
import java.lang.Integer;

public class StrBuilder_midString_1439883029315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12642;
     Object term12701;
     Object term12703;
     Object term92790;

    public StrBuilder_midString_1439883029315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12642 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12643 = (char[]) newCharArray(32);
        setField(term12642, term12642.getClass(), "buffer", term12643);
        setIntField(term12642, term12642.getClass(), "size", 991356662);
        setField(term12642, term12642.getClass(), "newLine", "WBAOTqErtm");
        setField(term12642, term12642.getClass(), "nullText", "PqtVXXZMqK");
        term12701 = new Integer(-506958186);
        term12703 = new Integer(-507387516);
        term92790 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term92791 = (char[]) newCharArray(32);
        setField(term92790, term92790.getClass(), "buffer", term92791);
        setIntField(term92790, term92790.getClass(), "size", 991356662);
        setField(term92790, term92790.getClass(), "newLine", "WBAOTqErtm");
        setField(term92790, term92790.getClass(), "nullText", "PqtVXXZMqK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term12701;
        args[1] = term12703;
        Object retValue = callMethod(klass, "midString", argTypes, term12642, args);
        assertTrue(recursiveEquals(term12642, term92790));
        assertTrue(recursiveEquals(term12701, -506958186));
        assertTrue(recursiveEquals(term12703, -507387516));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


