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
import java.lang.Character;

public class StrBuilder_deleteAll_944203575289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9624;
     Object term9683;
     Object term84509;
     Object term84449;

    public StrBuilder_deleteAll_944203575289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9624 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9625 = (char[]) newCharArray(32);
        setField(term9624, term9624.getClass(), "buffer", term9625);
        setIntField(term9624, term9624.getClass(), "size", -1565502840);
        setField(term9624, term9624.getClass(), "newLine", "DyiXbeYIaN");
        setField(term9624, term9624.getClass(), "nullText", "VGizxZnyHX");
        term9683 = new Character('C');
        term84509 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term84510 = (char[]) newCharArray(32);
        setField(term84509, term84509.getClass(), "buffer", term84510);
        setIntField(term84509, term84509.getClass(), "size", -1565502840);
        setField(term84509, term84509.getClass(), "newLine", "DyiXbeYIaN");
        setField(term84509, term84509.getClass(), "nullText", "VGizxZnyHX");
        term84449 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term84450 = (char[]) newCharArray(32);
        setField(term84449, term84449.getClass(), "buffer", term84450);
        setIntField(term84449, term84449.getClass(), "size", -1565502840);
        setField(term84449, term84449.getClass(), "newLine", "DyiXbeYIaN");
        setField(term84449, term84449.getClass(), "nullText", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term9683;
        Object retValue = callMethod(klass, "deleteAll", argTypes, term9624, args);
        assertTrue(recursiveEquals(term9624, term84509));
        assertTrue(recursiveEquals(term9683, 'C'));
        assertTrue(recursiveEquals(retValue, term84449));
    }

};


