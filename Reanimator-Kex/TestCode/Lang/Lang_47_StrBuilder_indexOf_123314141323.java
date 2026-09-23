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

public class StrBuilder_indexOf_123314141323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13610;
     Object term94937;

    public StrBuilder_indexOf_123314141323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13610 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13611 = (char[]) newCharArray(32);
        setField(term13610, term13610.getClass(), "buffer", term13611);
        setIntField(term13610, term13610.getClass(), "size", -1410220680);
        setField(term13610, term13610.getClass(), "newLine", "WVbxuoDBcn");
        setField(term13610, term13610.getClass(), "nullText", "pvDEABOxLt");
        term94937 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term94938 = (char[]) newCharArray(32);
        setField(term94937, term94937.getClass(), "buffer", term94938);
        setIntField(term94937, term94937.getClass(), "size", -1410220680);
        setField(term94937, term94937.getClass(), "newLine", "WVbxuoDBcn");
        setField(term94937, term94937.getClass(), "nullText", "pvDEABOxLt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "indexOf", argTypes, term13610, args);
        assertTrue(recursiveEquals(term13610, term94937));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


