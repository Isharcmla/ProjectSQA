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

public class StrBuilder_appendAll_194184678242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6742;
     Object term70934;

    public StrBuilder_appendAll_194184678242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6742 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6743 = (char[]) newCharArray(32);
        setField(term6742, term6742.getClass(), "buffer", term6743);
        setIntField(term6742, term6742.getClass(), "size", -1772434990);
        setField(term6742, term6742.getClass(), "newLine", "lHfTrWKMPk");
        setField(term6742, term6742.getClass(), "nullText", "JDaAnsVTGV");
        term70934 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term70935 = (char[]) newCharArray(32);
        setField(term70934, term70934.getClass(), "buffer", term70935);
        setIntField(term70934, term70934.getClass(), "size", -1772434990);
        setField(term70934, term70934.getClass(), "newLine", "lHfTrWKMPk");
        setField(term70934, term70934.getClass(), "nullText", "JDaAnsVTGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "appendAll", argTypes, term6742, args);
        assertTrue(recursiveEquals(term6742, term70934));
    }

};


