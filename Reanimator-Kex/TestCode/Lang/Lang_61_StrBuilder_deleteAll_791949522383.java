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

public class StrBuilder_deleteAll_791949522383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215341;
     Object term220769;
     Object term219763;

    public StrBuilder_deleteAll_791949522383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215341 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term209149 = (char[]) newCharArray(505);
        setIntField(term215341, term215341.getClass(), "size", 67108865);
        setField(term215341, term215341.getClass(), "buffer", term209149);
        term220769 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term220770 = (char[]) newCharArray(505);
        setField(term220769, term220769.getClass(), "buffer", term220770);
        setIntField(term220769, term220769.getClass(), "size", 67108865);
        setField(term220769, term220769.getClass(), "newLine", null);
        setField(term220769, term220769.getClass(), "nullText", null);
        term219763 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term219764 = (char[]) newCharArray(505);
        setField(term219763, term219763.getClass(), "buffer", term219764);
        setIntField(term219763, term219763.getClass(), "size", 67108865);
        setField(term219763, term219763.getClass(), "newLine", null);
        setField(term219763, term219763.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ";
        Object retValue = callMethod(klass, "deleteAll", argTypes, term215341, args);
        assertTrue(recursiveEquals(term215341, term220769));
        assertTrue(recursiveEquals(retValue, term219763));
    }

};


