package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.Boolean;

public class DoubleMetaphone_isDoubleMetaphoneEqual_118117540844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;
     Object term150;
     Object term6284;

    public DoubleMetaphone_isDoubleMetaphoneEqual_118117540844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term124, term124.getClass(), "maxCodeLen", 4);
        term150 = new Boolean(false);
        term6284 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term6284, term6284.getClass(), "maxCodeLen", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "EGtDIRbSSb";
        args[1] = "SzjVpOQTyS";
        args[2] = term150;
        callMethod(klass, "isDoubleMetaphoneEqual", argTypes, term124, args);
        assertTrue(recursiveEquals(term124, term6284));
        assertTrue(recursiveEquals(term150, "SzjVpOQTyS"));
    }

};


