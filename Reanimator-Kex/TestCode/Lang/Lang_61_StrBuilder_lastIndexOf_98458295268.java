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

public class StrBuilder_lastIndexOf_98458295268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11621;
     Object term11680;
     Object term81353;

    public StrBuilder_lastIndexOf_98458295268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11621 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11622 = (char[]) newCharArray(32);
        setField(term11621, term11621.getClass(), "buffer", term11622);
        setIntField(term11621, term11621.getClass(), "size", -2014576105);
        setField(term11621, term11621.getClass(), "newLine", "wKWbJssZuG");
        setField(term11621, term11621.getClass(), "nullText", "NzBMMhkhpT");
        term11680 = new Integer(1296895584);
        term81353 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81354 = (char[]) newCharArray(32);
        setField(term81353, term81353.getClass(), "buffer", term81354);
        setIntField(term81353, term81353.getClass(), "size", -2014576105);
        setField(term81353, term81353.getClass(), "newLine", "wKWbJssZuG");
        setField(term81353, term81353.getClass(), "nullText", "NzBMMhkhpT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11680;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term11621, args);
        assertTrue(recursiveEquals(term11621, term81353));
        assertTrue(recursiveEquals(term11680, 1296895584));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


