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

public class StrBuilder_minimizeCapacity_1104595817285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42624;
     Object term88124;
     Object term88120;

    public StrBuilder_minimizeCapacity_1104595817285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42624 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term42526 = (char[]) newCharArray(0);
        setField(term42624, term42624.getClass(), "buffer", term42526);
        setIntField(term42624, term42624.getClass(), "size", 0);
        term88124 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88125 = (char[]) newCharArray(0);
        setField(term88124, term88124.getClass(), "buffer", term88125);
        setIntField(term88124, term88124.getClass(), "size", 0);
        setField(term88124, term88124.getClass(), "newLine", null);
        setField(term88124, term88124.getClass(), "nullText", null);
        term88120 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term88121 = (char[]) newCharArray(0);
        setField(term88120, term88120.getClass(), "buffer", term88121);
        setIntField(term88120, term88120.getClass(), "size", 0);
        setField(term88120, term88120.getClass(), "newLine", null);
        setField(term88120, term88120.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "minimizeCapacity", argTypes, term42624, args);
        assertTrue(recursiveEquals(term42624, term88124));
        assertTrue(recursiveEquals(retValue, term88120));
    }

};


