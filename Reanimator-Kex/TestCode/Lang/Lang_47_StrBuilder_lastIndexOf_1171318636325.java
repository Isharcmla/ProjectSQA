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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class StrBuilder_lastIndexOf_1171318636325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13834;
     Object term13893;

    public StrBuilder_lastIndexOf_1171318636325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13834 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13835 = (char[]) newCharArray(32);
        setField(term13834, term13834.getClass(), "buffer", term13835);
        setIntField(term13834, term13834.getClass(), "size", 1152356969);
        setField(term13834, term13834.getClass(), "newLine", "onQLVONGuf");
        setField(term13834, term13834.getClass(), "nullText", "SOrEHbcbmn");
        term13893 = new Character('G');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term13893;
        try {
            callMethod(klass, "lastIndexOf", argTypes, term13834, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


