package org.apache.commons.lang3.text.translate;

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
import static org.apache.commons.lang3.text.translate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.text.translate.EqualityUtils.*;

public class LookupTranslator_translate_37962905113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2149;
     Object term2197;

    public LookupTranslator_translate_37962905113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2149 = newInstance(Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setIntField(term2149, term2149.getClass(), "longest", 0);
        term2197 = newInstance(Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setField(term2197, term2197.getClass(), "lookupMap", null);
        setIntField(term2197, term2197.getClass(), "shortest", 0);
        setIntField(term2197, term2197.getClass(), "longest", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.Writer");
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = 1;
        args[2] = null;
        Object retValue = callMethod(klass, "translate", argTypes, term2149, args);
        assertTrue(recursiveEquals(term2149, term2197));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


