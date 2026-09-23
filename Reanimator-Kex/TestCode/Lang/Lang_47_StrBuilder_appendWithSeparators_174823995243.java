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
import java.lang.Object;

public class StrBuilder_appendWithSeparators_174823995243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6853;
     Object term6912;

    public StrBuilder_appendWithSeparators_174823995243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6853 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6854 = (char[]) newCharArray(32);
        setField(term6853, term6853.getClass(), "buffer", term6854);
        setIntField(term6853, term6853.getClass(), "size", -1845499264);
        setField(term6853, term6853.getClass(), "newLine", "mLUZFTfjle");
        setField(term6853, term6853.getClass(), "nullText", "xIeFjkHkOe");
        term6912 = (Object[]) newArray("java.lang.Object", 6);
        Object term6913 = newInstance(Class.forName("java.lang.Object"));
        Object term6914 = newInstance(Class.forName("java.lang.Object"));
        Object term6915 = newInstance(Class.forName("java.lang.Object"));
        Object term6916 = newInstance(Class.forName("java.lang.Object"));
        Object term6917 = newInstance(Class.forName("java.lang.Object"));
        Object term6918 = newInstance(Class.forName("java.lang.Object"));
        setElement(term6912, 0, term6913);
        setElement(term6912, 1, term6914);
        setElement(term6912, 2, term6915);
        setElement(term6912, 3, term6916);
        setElement(term6912, 4, term6917);
        setElement(term6912, 5, term6918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term6912;
        args[1] = "SdCKLMIYnX";
        try {
            callMethod(klass, "appendWithSeparators", argTypes, term6853, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


