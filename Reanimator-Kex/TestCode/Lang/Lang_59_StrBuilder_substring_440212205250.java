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

public class StrBuilder_substring_440212205250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9481;
     Object term9540;
     Object term9542;

    public StrBuilder_substring_440212205250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9481 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9482 = (char[]) newCharArray(32);
        setField(term9481, term9481.getClass(), "buffer", term9482);
        setIntField(term9481, term9481.getClass(), "size", -2063457669);
        setField(term9481, term9481.getClass(), "newLine", "kVEZMHmRtR");
        setField(term9481, term9481.getClass(), "nullText", "ekxGuOYIwi");
        term9540 = new Integer(-1222006000);
        term9542 = new Integer(2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9540;
        args[1] = term9542;
        try {
            callMethod(klass, "substring", argTypes, term9481, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


