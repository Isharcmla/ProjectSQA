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

public class StrBuilder_replaceImpl_404695259306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11561;
     Object term11632;
     Object term11634;
     Object term11636;
     Object term90180;
     Object term90106;

    public StrBuilder_replaceImpl_404695259306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11561 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11562 = (char[]) newCharArray(32);
        setField(term11561, term11561.getClass(), "buffer", term11562);
        setIntField(term11561, term11561.getClass(), "size", 1384592638);
        setField(term11561, term11561.getClass(), "newLine", "OIHoJeysUi");
        setField(term11561, term11561.getClass(), "nullText", "WXMWFDGcLB");
        term11632 = new Integer(-1002370457);
        term11634 = new Integer(-2014576105);
        term11636 = new Integer(1296895584);
        term90180 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term90181 = (char[]) newCharArray(32);
        setField(term90180, term90180.getClass(), "buffer", term90181);
        setIntField(term90180, term90180.getClass(), "size", 1384592638);
        setField(term90180, term90180.getClass(), "newLine", "OIHoJeysUi");
        setField(term90180, term90180.getClass(), "nullText", "WXMWFDGcLB");
        term90106 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term90107 = (char[]) newCharArray(32);
        setField(term90106, term90106.getClass(), "buffer", term90107);
        setIntField(term90106, term90106.getClass(), "size", 1384592638);
        setField(term90106, term90106.getClass(), "newLine", "OIHoJeysUi");
        setField(term90106, term90106.getClass(), "nullText", "WXMWFDGcLB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = "wKWbJssZuG";
        args[2] = term11632;
        args[3] = term11634;
        args[4] = term11636;
        Object retValue = callMethod(klass, "replaceImpl", argTypes, term11561, args);
        assertTrue(recursiveEquals(term11561, term90180));
        assertTrue(recursiveEquals(term11632, -1002370457));
        assertTrue(recursiveEquals(term11634, -2014576105));
        assertTrue(recursiveEquals(term11636, 1296895584));
        assertTrue(recursiveEquals(retValue, term90106));
    }

};


